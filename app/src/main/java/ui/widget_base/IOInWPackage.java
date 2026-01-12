package W;

import bH.X;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class IOInWPackage {
  private String d = "F8EK54DI5JFU2JF,HG3BF9GBDF84BASXS";

  static String a = "Some text, try this out for size";

  private static String e = null;

  private static char[] f =
      new char[] {'E', 'F', 'I', 'A', 'K', 'e', 'y', '!', '2', '9', '8', '4', '5', '3', '4', '6'};

  static int b = 300;

  static int c = 1;

  public void a(File paramFile1, File paramFile2, String paramString) {
    String str2;
    if (!paramFile1.exists())
      throw new FileNotFoundException("Can not find input file: " + paramFile1.getAbsolutePath());
    byte[] arrayOfByte1 = d.a(paramFile1);
    try {
      arrayOfByte2 = c(arrayOfByte1, paramString);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new IOException("Failed to decrypt file; " + exception.getMessage());
    }
    if (paramString == null) paramString = "";
    byte[] arrayOfByte2 = a(paramString, arrayOfByte2);
    try {
      arrayOfByte3 = c(arrayOfByte2, null);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new IOException("Failed to decrypt file; " + exception.getMessage());
    }
    String str1 = z.a(paramFile1);
    double d = z.c(paramFile1);
    if (d > 0.0D) {
      str2 = "EFIAPP\nversion:" + c + "\nsignature = " + str1 + "\niniVersion=" + d + "\n";
    } else {
      str2 = "EFIAPP\nversion:" + c + "\nsignature = " + str1 + "\n";
    }
    byte[] arrayOfByte3 = a(str2, arrayOfByte3);
    d.a(paramFile2, arrayOfByte3);
  }

  public byte[] a(byte[] paramArrayOfbyte, String paramString) {
    String str = b(paramArrayOfbyte);
    double d = a(paramArrayOfbyte);
    return a(paramArrayOfbyte, paramString, str, d);
  }

  public byte[] a(
      byte[] paramArrayOfbyte, String paramString1, String paramString2, double paramDouble) {
    byte[] arrayOfByte2;
    String str;
    try {
      arrayOfByte1 = c(paramArrayOfbyte, paramString1);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new IOException("Failed to decrypt file; " + exception.getMessage());
    }
    if (paramString1 == null) paramString1 = "";
    byte[] arrayOfByte1 = a(paramString1, arrayOfByte1);
    try {
      arrayOfByte2 = c(arrayOfByte1, null);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new IOException("Failed to decrypt file; " + exception.getMessage());
    }
    if (paramDouble > 0.0D) {
      str =
          "EFIAPP\nversion:"
              + c
              + "\nsignature = \""
              + paramString2
              + "\"\niniVersion="
              + paramDouble
              + "\n";
    } else {
      str = "EFIAPP\nversion:" + c + "\nsignature = \"" + paramString2 + "\"\n";
    }
    return a(str, arrayOfByte2);
  }

  public void a(
      byte[] paramArrayOfbyte,
      File paramFile,
      String paramString1,
      String paramString2,
      double paramDouble) {
    byte[] arrayOfByte = a(paramArrayOfbyte, paramString1, paramString2, paramDouble);
    d.a(paramFile, arrayOfByte);
  }

  private String b(byte[] paramArrayOfbyte) {
    BufferedReader bufferedReader = null;
    try {
      String str1 = null;
      bufferedReader = c(paramArrayOfbyte);
      String str2 = "";
      while ((str2 = bufferedReader.readLine()) != null) {
        if (!str2.startsWith("<versionInfo") && str2.indexOf(";") != -1)
          str2 = str2.substring(0, str2.indexOf(";"));
        if (str2.indexOf("signature") != -1 || str2.indexOf("firmwareSignature") != -1) {
          int i = str2.indexOf("\"", str2.indexOf("ignature")) + 1;
          int j = str2.indexOf("\"", i + 1);
          if (i == 0) {
            str1 = str2.substring(str2.indexOf("=") + 1, str2.length()).trim();
            if (str1.indexOf(";") != -1) str1 = str1.substring(0, str1.indexOf(";"));
          } else {
            try {
              str1 = str2.substring(i, j);
            } catch (Exception exception) {
            }
          }
          if (str1 != null) {
            if (str1.length() == 1 && str1.getBytes()[0] == 20) str1 = "20";
            return str1;
          }
        }
      }
      return str1;
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } finally {
      if (bufferedReader != null)
        try {
          bufferedReader.close();
        } catch (Exception exception) {
          Logger.getLogger(ak.class.getName()).log(Level.SEVERE, (String) null, exception);
        }
    }
  }

  public double a(byte[] paramArrayOfbyte) {
    BufferedReader bufferedReader = null;
    try {
      bufferedReader = c(paramArrayOfbyte);
      String str1 = null;
      String str2 = "";
      byte b = -1;
      while ((str2 = bufferedReader.readLine()) != null && b++ < 100) {
        if (str2.indexOf(";") != -1) str2 = str2.substring(0, str2.indexOf(";"));
        if (str2.indexOf("iniVersion") != -1) {
          str1 = str2.substring(str2.indexOf("=") + 1, str2.length()).trim();
          break;
        }
      }
      return (str1 == null) ? 0.0D : Double.parseDouble(str1);
    } catch (Exception exception) {
      exception.printStackTrace();
      return -1.0D;
    } finally {
      if (bufferedReader != null)
        try {
          bufferedReader.close();
        } catch (Exception exception) {
          Logger.getLogger(z.class.getName()).log(Level.SEVERE, (String) null, exception);
        }
    }
  }

  private BufferedReader c(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte;
    if (paramArrayOfbyte.length > 2000) {
      arrayOfByte = new byte[2000];
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, arrayOfByte.length);
    } else {
      arrayOfByte = paramArrayOfbyte;
    }
    return new BufferedReader(new StringReader(new String(arrayOfByte)));
  }

  public byte[] a(File paramFile) {
    try {
      return a(paramFile, true, (String) null);
    } catch (aj aj) {
      Logger.getLogger(ak.class.getName()).log(Level.SEVERE, (String) null, aj);
      throw new IOException("Error Decrypting File");
    }
  }

  public byte[] a(File paramFile, String paramString) {
    return a(paramFile, false, paramString);
  }

  private byte[] a(File paramFile, boolean paramBoolean, String paramString) {
    if (!paramFile.exists())
      throw new FileNotFoundException("Can not find input file: " + paramFile.getAbsolutePath());
    try {
      byte[] arrayOfByte = d.a(paramFile);
      return a(arrayOfByte, paramBoolean, paramString);
    } catch (FileNotFoundException fileNotFoundException) {
      throw fileNotFoundException;
    } catch (IOException iOException) {
      throw iOException;
    }
  }

  public byte[] b(byte[] paramArrayOfbyte, String paramString) {
    return a(paramArrayOfbyte, false, paramString);
  }

  private byte[] a(byte[] paramArrayOfbyte, boolean paramBoolean, String paramString) {
    try {
      byte[] arrayOfByte1;
      byte[] arrayOfByte2;
      al al1 = d(paramArrayOfbyte);
      try {
        arrayOfByte1 = d(al1.b(), null);
      } catch (Exception exception) {
        throw new IOException("Failed to decrypt file; " + exception.getMessage());
      }
      al al2 = d(arrayOfByte1);
      if (paramBoolean && paramString == null) paramString = al2.a();
      try {
        arrayOfByte2 = d(al2.b(), paramString);
      } catch (aj aj) {
        throw aj;
      } catch (Exception exception) {
        exception.printStackTrace();
        throw new IOException("Failed to decrypt file; " + exception.getMessage());
      }
      return arrayOfByte2;
    } catch (FileNotFoundException fileNotFoundException) {
      throw fileNotFoundException;
    } catch (IOException iOException) {
      throw iOException;
    } catch (aj aj) {
      throw aj;
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new IOException("Failed to parse data properly. " + exception.getMessage());
    }
  }

  private byte[] a(String paramString, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = new byte[paramArrayOfbyte.length + b];
    byte[] arrayOfByte2 = paramString.getBytes("UTF-8");
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte1, b, paramArrayOfbyte.length);
    return arrayOfByte1;
  }

  private al d(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = new byte[b];
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte1, 0, arrayOfByte1.length);
    byte[] arrayOfByte2 = new byte[paramArrayOfbyte.length - b];
    System.arraycopy(paramArrayOfbyte, b, arrayOfByte2, 0, arrayOfByte2.length);
    al al = new al(this);
    String str = X.a(arrayOfByte1);
    al.a(str);
    al.a(arrayOfByte2);
    return al;
  }

  private byte[] c(byte[] paramArrayOfbyte, String paramString) {
    String str = a(paramString);
    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("UTF-8"), "AES");
    cipher.init(1, secretKeySpec, new IvParameterSpec("WWWWWWWWWXXXXXXX".getBytes("UTF-8")));
    return cipher.doFinal(paramArrayOfbyte);
  }

  private byte[] d(byte[] paramArrayOfbyte, String paramString) {
    String str = a(paramString);
    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("UTF-8"), "AES");
    cipher.init(2, secretKeySpec, new IvParameterSpec("WWWWWWWWWXXXXXXX".getBytes("UTF-8")));
    try {
      return cipher.doFinal(paramArrayOfbyte);
    } catch (IllegalBlockSizeException illegalBlockSizeException) {
      throw new aj("Invalid Password");
    } catch (BadPaddingException badPaddingException) {
      throw new aj("Invalid Password");
    }
  }

  private String a(String paramString) {
    String str = a();
    if (paramString != null) {
      CRC32 cRC32 = new CRC32();
      cRC32.update(paramString.getBytes("UTF-8"));
      paramString = Long.toHexString(cRC32.getValue()) + paramString;
      if (paramString.length() > 16) {
        paramString = paramString.substring(0, 16);
      } else {
        paramString = paramString + a().substring(paramString.length());
      }
      str = paramString;
    }
    return str;
  }

  public static boolean b(File paramFile) {
    BufferedReader bufferedReader = null;
    try {
      FileInputStream fileInputStream = new FileInputStream(paramFile);
      bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
      String str = bufferedReader.readLine();
      return str.equals("EFIAPP");
    } catch (Exception exception) {
      return false;
    } finally {
      if (bufferedReader != null)
        try {
          bufferedReader.close();
        } catch (IOException iOException) {
          Logger.getLogger(ak.class.getName()).log(Level.SEVERE, (String) null, iOException);
        }
    }
  }

  private String a() {
    if (e == null) e = new String(f);
    return e;
  }

  public static void a(char[] paramArrayOfchar) {
    f = paramArrayOfchar;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/ak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
