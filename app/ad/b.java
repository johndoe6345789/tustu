package ad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class b {
  public a a(File paramFile) {
    FileInputStream fileInputStream = null;
    try {
      fileInputStream = new FileInputStream(paramFile);
      return a(fileInputStream);
    } catch (FileNotFoundException fileNotFoundException) {
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, fileNotFoundException);
      throw new c("File not found.\n" + paramFile.getAbsolutePath());
    } finally {
      try {
        if (fileInputStream != null)
          fileInputStream.close(); 
      } catch (Exception exception) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, exception);
      } 
    } 
  }
  
  public a a(InputStream paramInputStream) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(paramInputStream));
    a a = new a();
    d d = null;
    boolean bool = false;
    byte b1 = 0;
    try {
      int i = Integer.MAX_VALUE;
      String str;
      while ((str = bufferedReader.readLine()) != null) {
        b1++;
        if ((str == null || str.isEmpty()) && d.a() != 9 && d.a() != 8 && d.a() != 7)
          throw new c("Truncated s19 File, line: " + b1); 
        if (d != null && str != null && (d.a() == 9 || d.a() == 8 || d.a() == 7)) {
          a.a(str);
          continue;
        } 
        try {
          d = a(str, b1);
        } catch (c c) {
          throw c;
        } catch (Exception exception) {
          exception.printStackTrace();
          throw new c("Unhandled exception, line: " + b1);
        } 
        if (d.a() == 1 || d.a() == 2 || d.a() == 3) {
          if (d.d() < i)
            i = d.d(); 
          bool = a(str, d);
          if (bool) {
            a.b(d);
            continue;
          } 
          throw new c("Failed Checksum, line: " + b1);
        } 
        if (d.a() == 0)
          a.a(d); 
      } 
      a.a(i);
    } catch (IOException iOException) {
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
    return a;
  }
  
  private boolean a(String paramString, d paramd) {
    boolean bool = false;
    byte b1 = paramd.b();
    int i = paramString.substring(4).length() / 2;
    if (b1 == i) {
      int j = b1;
      int m = (paramd.c()).length;
      byte b2;
      for (b2 = 0; b2 < m; b2++)
        j += paramd.c()[b2]; 
      for (b2 = 0; b2 < b1 - 1 - m; b2++)
        j += paramd.e()[b2]; 
      int k = paramd.f();
      j = (j ^ 0xFFFFFFFF) & 0xFF;
      if (k == j)
        bool = true; 
    } 
    return bool;
  }
  
  public d a(String paramString, int paramInt) {
    int i = 0;
    if (paramString == null)
      throw new c("Invalid Record, line: " + paramInt); 
    if (paramString.length() < 2)
      throw new c("Record Type Not Defined , line: " + paramInt); 
    d d = new d();
    d.b(paramInt);
    d.a(Byte.parseByte(paramString.substring(1, 2), 16));
    i = a(d.a());
    d.b(Byte.parseByte(paramString.substring(2, 4), 16));
    String str1 = paramString.substring(4, 4 + i);
    if (str1.length() < i)
      throw new c("Address out of range. To Short, line: " + paramInt); 
    if (str1.length() > i)
      throw new c("Address out of range. To Long, line: " + paramInt); 
    d.a(a(str1));
    String str2 = paramString.substring(4 + i, paramString.length() - 2);
    d.b(a(str2));
    d.a(Integer.parseInt(paramString.substring(paramString.length() - 2, paramString.length()), 16));
    return d;
  }
  
  private int[] a(String paramString) {
    boolean bool = false;
    byte b1 = 2;
    int[] arrayOfInt = new int[paramString.length() / 2];
    for (byte b2 = 0; b2 < paramString.length() / 2; b2++) {
      arrayOfInt[b2] = Integer.parseInt(paramString.substring(bool, b1), 16);
      bool += true;
      b1 += 2;
    } 
    return arrayOfInt;
  }
  
  private int a(byte paramByte) {
    byte b1 = -1;
    if (paramByte == 0 || paramByte == 1 || paramByte == 9)
      b1 = 4; 
    if (paramByte == 2 || paramByte == 8)
      b1 = 6; 
    if (paramByte == 3 || paramByte == 7)
      b1 = 8; 
    return b1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ad/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */