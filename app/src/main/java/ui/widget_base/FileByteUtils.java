package W;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteUtils {
  public static byte[] a(File paramFile) {
    byte[] arrayOfByte = new byte[(int) paramFile.length()];
    BufferedInputStream bufferedInputStream =
        new BufferedInputStream(new FileInputStream(paramFile));
    int i = 0;
    try {
      int j;
      long l = System.currentTimeMillis();
      do {
        j = bufferedInputStream.read(arrayOfByte, i, arrayOfByte.length - i);
        if (j > 0) {
          i += j;
          l = System.currentTimeMillis();
        } else if (System.currentTimeMillis() - l > 5000L) {
          throw new IOException("Timeout reading file.");
        }
      } while (j >= 0 && i < arrayOfByte.length);
    } finally {
      try {
        bufferedInputStream.close();
      } catch (IOException iOException) {
      }
    }
    if (i == arrayOfByte.length) return arrayOfByte;
    throw new IOException("Only read " + i + " bytes of file that is " + arrayOfByte.length);
  }

  public static void a(File paramFile, byte[] paramArrayOfbyte) {
    paramFile.createNewFile();
    BufferedOutputStream bufferedOutputStream = null;
    try {
      bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(paramFile));
      bufferedOutputStream.write(paramArrayOfbyte);
    } finally {
      try {
        if (bufferedOutputStream != null) bufferedOutputStream.close();
      } catch (Exception exception) {
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
