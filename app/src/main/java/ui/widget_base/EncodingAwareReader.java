package W;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EncodingAwareReader {
  public static BufferedReader a(File paramFile) {
    BufferedReader bufferedReader;
    try {
      if (ak.b(paramFile)) {
        String str1;
        ak ak = new ak();
        byte[] arrayOfByte = ak.a(paramFile);
        if (a(arrayOfByte)) {
          str1 = "UTF-8";
        } else {
          str1 = "ISO-8859-1";
        }
        String str2 = new String(arrayOfByte, str1);
        StringReader stringReader = new StringReader(str2);
        bufferedReader = new BufferedReader(stringReader);
      } else if (paramFile.getName().toLowerCase().endsWith(".ecu")) {
        ax ax = new ax(paramFile);
        bufferedReader = new BufferedReader(new InputStreamReader(ax, "ISO-8859-1"));
      } else {
        String str;
        if (c(paramFile)) {
          str = "UTF-8";
        } else {
          str = "ISO-8859-1";
        }
        FileInputStream fileInputStream = new FileInputStream(paramFile);
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, str));
      }
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new IOException("Unsupported Encoding");
    }
    return bufferedReader;
  }

  public static BufferedReader a(File paramFile, String paramString) {
    BufferedReader bufferedReader;
    try {
      if (ak.b(paramFile)) {
        String str1;
        ak ak = new ak();
        byte[] arrayOfByte = ak.a(paramFile, paramString);
        if (a(arrayOfByte)) {
          str1 = "UTF-8";
        } else {
          str1 = "ISO-8859-1";
        }
        String str2 = new String(arrayOfByte, str1);
        StringReader stringReader = new StringReader(str2);
        bufferedReader = new BufferedReader(stringReader);
      } else if (paramFile.getName().toLowerCase().endsWith(".ecu")) {
        ax ax = new ax(paramFile);
        bufferedReader = new BufferedReader(new InputStreamReader(ax, "ISO-8859-1"));
      } else {
        String str;
        if (c(paramFile)) {
          str = "UTF-8";
        } else {
          str = "ISO-8859-1";
        }
        FileInputStream fileInputStream = new FileInputStream(paramFile);
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, str));
      }
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new IOException("Unsupported Encoding");
    }
    return bufferedReader;
  }

  public static BufferedReader b(File paramFile) {
    BufferedReader bufferedReader;
    try {
      if (ak.b(paramFile)) {
        FileInputStream fileInputStream = new FileInputStream(paramFile);
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
      } else if (paramFile.getName().toLowerCase().endsWith(".ecu")) {
        ax ax = new ax(paramFile);
        bufferedReader = new BufferedReader(new InputStreamReader(ax, "ISO-8859-1"));
      } else {
        String str;
        if (c(paramFile)) {
          str = "UTF-8";
        } else {
          str = "ISO-8859-1";
        }
        FileInputStream fileInputStream = new FileInputStream(paramFile);
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, str));
      }
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new IOException("Unsupported Encoding");
    }
    return bufferedReader;
  }

  private static boolean c(File paramFile) {
    byte[] arrayOfByte = new byte[3];
    FileInputStream fileInputStream = null;
    try {
      fileInputStream = new FileInputStream(paramFile);
      fileInputStream.read(arrayOfByte);
      if (arrayOfByte[0] == -17 && arrayOfByte[1] == -69 && arrayOfByte[2] == -65) return true;
    } catch (FileNotFoundException fileNotFoundException) {
      return false;
    } catch (IOException iOException) {
      Logger.getLogger(s.class.getName())
          .log(Level.WARNING, "Failed to read file in BOM check", iOException);
      return false;
    } finally {
      try {
        fileInputStream.close();
      } catch (Exception exception) {
      }
    }
    BufferedReader bufferedReader = null;
    try {
      bufferedReader = new BufferedReader(new FileReader(paramFile));
      String str = bufferedReader.readLine();
      return a(str);
    } catch (FileNotFoundException fileNotFoundException) {
      return false;
    } catch (IOException iOException) {
      Logger.getLogger(s.class.getName()).log(Level.WARNING, "Failed to read file", iOException);
      return false;
    } finally {
      try {
        bufferedReader.close();
      } catch (Exception exception) {
      }
    }
  }

  private static boolean a(byte[] paramArrayOfbyte) {
    try {
      byte b;
      for (b = 0; b < 'Ǵ' && paramArrayOfbyte[b] != 10; b++)
        ;
      byte[] arrayOfByte = new byte[b];
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, arrayOfByte.length);
      String str = new String(arrayOfByte, "UTF-8");
      return a(str);
    } catch (Exception exception) {
      return false;
    }
  }

  private static boolean a(String paramString) {
    if (paramString != null && paramString.contains("=")) {
      String str = paramString.substring(paramString.indexOf("=") + 1);
      return (str.contains("UTF-8")
          || str.contains("UTF8")
          || str.contains("utf-8")
          || str.contains("utf8"));
    }
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
