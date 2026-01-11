package W;

import V.ExceptionInVPackage;
import bH.D;
import bH.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class af {
  public static Date ExceptionInVPackage(File paramFile) {
    byte b = 26;
    FileInputStream fileInputStream = null;
    try {
      fileInputStream = new FileInputStream(paramFile);
      int[] arrayOfInt = new int[b + 4];
      int i;
      for (i = 0; i < arrayOfInt.length; i++)
        arrayOfInt[i] = fileInputStream.read(); 
      i = c.b(arrayOfInt, b, 4, true, true);
      return ExceptionInVPackage(i);
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("File not found:\n" + paramFile.getAbsolutePath());
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new ExceptionInVPackage("Failed to read header from file:\n" + paramFile.getAbsolutePath());
    } finally {
      try {
        fileInputStream.close();
      } catch (IOException iOException) {
        D.b("MS3 SD Log Transformer: Failed to close file???");
      } 
    } 
  }
  
  public static Date ExceptionInVPackage(int paramInt) {
    int i = c.ExceptionInVPackage(paramInt, 25, 31) + 1980;
    int j = c.ExceptionInVPackage(paramInt, 21, 24) - 1;
    int k = c.ExceptionInVPackage(paramInt, 16, 20);
    int m = c.ExceptionInVPackage(paramInt, 11, 15);
    int n = c.ExceptionInVPackage(paramInt, 5, 10);
    int i1 = c.ExceptionInVPackage(paramInt, 0, 4) * 2;
    Calendar calendar = Calendar.getInstance();
    calendar.set(i, j, k, m, n, i1);
    return calendar.getTime();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/af.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */