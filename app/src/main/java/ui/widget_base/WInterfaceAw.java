package W;

import G.R;
import G.Y;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class WInterfaceAw {
  protected int[] a(String paramString) {
    File file = new File(paramString);
    FileInputStream fileInputStream = new FileInputStream(file);
    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
    ArrayList<Integer> arrayList = new ArrayList();
    int i;
    for (i = bufferedInputStream.read(); i != -1; i = bufferedInputStream.read())
      arrayList.add(Integer.valueOf(i));
    int[] arrayOfInt = new int[arrayList.size()];
    for (byte b = 0; b < arrayOfInt.length; b++)
      arrayOfInt[b] = ((Integer) arrayList.get(b)).intValue();
    return arrayOfInt;
  }

  public void a(String paramString, R paramR) {
    File file = new File(paramString);
    if (file.exists()) file.delete();
    file.createNewFile();
    byte[] arrayOfByte = b(paramR);
    FileOutputStream fileOutputStream = new FileOutputStream(file);
    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
    bufferedOutputStream.write(arrayOfByte);
    bufferedOutputStream.flush();
    bufferedOutputStream.close();
  }

  protected byte[] b(R paramR) {
    Y y = paramR.h();
    byte[] arrayOfByte = new byte[y.k()];
    byte b1 = 0;
    for (byte b2 = 0; b2 < y.e(); b2++) {
      int[] arrayOfInt = y.b(b2);
      for (byte b = 0; b < arrayOfInt.length; b++) arrayOfByte[b1++] = (byte) arrayOfInt[b];
    }
    return arrayOfByte;
  }

  protected int[][] a(R paramR, int[] paramArrayOfint) {
    int[][] arrayOfInt = new int[paramR.h().e()][0];
    for (byte b = 0; b < arrayOfInt.length; b++) {
      arrayOfInt[b] = new int[paramR.h().c(b)];
      int i = paramR.O().y(b) - 30720;
      if (i + (arrayOfInt[b]).length < paramArrayOfint.length)
        System.arraycopy(paramArrayOfint, i, arrayOfInt[b], 0, (arrayOfInt[b]).length);
    }
    return arrayOfInt;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/aw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
