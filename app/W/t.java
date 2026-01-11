package W;

import java.io.File;
import java.io.IOException;

public class t {
  public static String a = null;
  
  public static File a(File[] paramArrayOfFile, String paramString) {
    if (paramString == null && a != null)
      return new File(a); 
    File[] arrayOfFile = a(paramArrayOfFile);
    File file = null;
    double d = -2.0D;
    for (byte b = 0; b < arrayOfFile.length; b++) {
      if (arrayOfFile[b].isFile()) {
        String[] arrayOfString = z.b(arrayOfFile[b]);
        if (arrayOfString != null)
          for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
            if (arrayOfString[b1] != null && arrayOfString[b1].equals(paramString)) {
              double d1 = z.c(arrayOfFile[b]);
              if (d1 > d) {
                d = d1;
                file = arrayOfFile[b];
              } 
            } 
          }  
      } 
    } 
    return file;
  }
  
  public static File[] a(File[] paramArrayOfFile) {
    if (paramArrayOfFile.length <= 0)
      throw new IOException("Ecu Definition directory not found, expected at:\n" + paramArrayOfFile[0].getAbsolutePath() + "\nYour installation appears corrupt."); 
    u u = new u();
    File[] arrayOfFile = null;
    for (byte b = 0; b < paramArrayOfFile.length; b++) {
      File file = paramArrayOfFile[b];
      File[] arrayOfFile1 = file.listFiles(u);
      if (b == 0 || arrayOfFile == null) {
        arrayOfFile = arrayOfFile1;
      } else {
        File[] arrayOfFile2 = new File[arrayOfFile.length + arrayOfFile1.length];
        System.arraycopy(arrayOfFile, 0, arrayOfFile2, 0, arrayOfFile.length);
        System.arraycopy(arrayOfFile1, 0, arrayOfFile2, arrayOfFile.length, arrayOfFile1.length);
        arrayOfFile = arrayOfFile2;
      } 
    } 
    return arrayOfFile;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */