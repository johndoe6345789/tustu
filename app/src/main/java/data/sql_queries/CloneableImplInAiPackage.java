package aI;

import G.F;
import G.G;
import G.H;
import G.Q;
import G.m;
import bH.c;
import java.util.Calendar;
import java.util.Date;

public class CloneableImplInAiPackage extends Q implements Cloneable {
  public static String a = "sd_status";

  public static byte b = 1;

  public static byte c = 4;

  public static byte d = 8;

  public static byte e = 16;

  public static m a(F paramF, int paramInt) {
    if (paramInt < 0 || paramInt > 5) throw new x("Unknown Command:" + paramInt);
    int[] arrayOfInt = {119, paramF.x(), 17, 0, 0, 0, 1, paramInt};
    return m.a(paramF, arrayOfInt);
  }

  public static m a(F paramF) {
    int[] arrayOfInt = {119, paramF.x(), 17, 0, 0, 0, 1, 4};
    m m = m.a(paramF, arrayOfInt);
    m.v("SD Status Init");
    return m;
  }

  public static m b(F paramF) {
    int[] arrayOfInt = {114, paramF.x(), 17, 0, 0, 0, 16};
    m m = m.a(paramF, arrayOfInt);
    m.v("SD Status Read");
    return m;
  }

  public static m b(F paramF, int paramInt) {
    int[] arrayOfInt1 = new int[2];
    arrayOfInt1 = c.a(paramInt, arrayOfInt1, true);
    int[] arrayOfInt2 = {119, paramF.x(), 17, 0, 1, 0, 2, arrayOfInt1[0], arrayOfInt1[1]};
    m m = m.a(paramF, arrayOfInt2);
    m.v("SD Read Dir Init, dirChunk=" + paramInt);
    return m;
  }

  public static m c(F paramF) {
    int[] arrayOfInt = {114, paramF.x(), 17, 0, 0, 2, 2};
    m m = m.a(paramF, arrayOfInt);
    m.v("SD Read Dir");
    return m;
  }

  public static m c(F paramF, int paramInt) {
    int[] arrayOfInt1 = new int[4];
    arrayOfInt1 = c.a(paramInt, arrayOfInt1, true);
    int[] arrayOfInt2 = {
      119,
      paramF.x(),
      17,
      0,
      2,
      0,
      4,
      arrayOfInt1[0],
      arrayOfInt1[1],
      arrayOfInt1[2],
      arrayOfInt1[3]
    };
    m m = m.a(paramF, arrayOfInt2);
    m.v("SD Read Sector Init");
    return m;
  }

  public static m d(F paramF) {
    int[] arrayOfInt = {114, paramF.x(), 17, 0, 0, 2, 4};
    m m = m.a(paramF, arrayOfInt);
    m.v("SD Read Sector");
    return m;
  }

  public static m a(F paramF, int[] paramArrayOfint, int paramInt) {
    int[] arrayOfInt1 = {119, paramF.x(), 17, 0, 3, 2, 4};
    int[] arrayOfInt2 = new int[4];
    arrayOfInt2 = c.a(paramInt, arrayOfInt2, true);
    int[] arrayOfInt3 = new int[arrayOfInt1.length + paramArrayOfint.length + arrayOfInt2.length];
    System.arraycopy(arrayOfInt1, 0, arrayOfInt3, 0, arrayOfInt1.length);
    System.arraycopy(paramArrayOfint, 0, arrayOfInt3, arrayOfInt1.length, paramArrayOfint.length);
    System.arraycopy(
        arrayOfInt2,
        0,
        arrayOfInt3,
        arrayOfInt1.length + paramArrayOfint.length,
        arrayOfInt2.length);
    m m = m.a(paramF, arrayOfInt3);
    m.v("SD Write Sector");
    return m;
  }

  public static m a(F paramF, int paramInt1, int paramInt2) {
    int[] arrayOfInt1 = new int[4];
    arrayOfInt1 = c.a(paramInt1, arrayOfInt1, true);
    int[] arrayOfInt2 = new int[4];
    arrayOfInt2 = c.a(paramInt2, arrayOfInt2, true);
    int[] arrayOfInt3 = {
      119,
      paramF.x(),
      17,
      0,
      5,
      0,
      8,
      arrayOfInt1[0],
      arrayOfInt1[1],
      arrayOfInt1[2],
      arrayOfInt1[3],
      arrayOfInt2[0],
      arrayOfInt2[1],
      arrayOfInt2[2],
      arrayOfInt2[3]
    };
    m m = m.a(paramF, arrayOfInt3);
    m.a(800);
    m.v("SD Read Compressed File Init");
    return m;
  }

  public static m d(F paramF, int paramInt) {
    int[] arrayOfInt1 = new int[4];
    arrayOfInt1 = c.a(paramInt, arrayOfInt1, true);
    int[] arrayOfInt2 = {114, paramF.x(), 20, arrayOfInt1[2], arrayOfInt1[3], 8, 0};
    m m = m.a(paramF, arrayOfInt2);
    m.i(10);
    m.a(2000);
    m.b(true);
    m.v("SD Read Compressed File");
    return m;
  }

  public static m a(F paramF, char[] paramArrayOfchar, int paramInt) {
    int[] arrayOfInt1 = new int[4];
    arrayOfInt1 = c.a(paramInt, arrayOfInt1, true);
    int[] arrayOfInt2 = {
      119,
      paramF.x(),
      17,
      0,
      6,
      0,
      6,
      paramArrayOfchar[0],
      paramArrayOfchar[1],
      paramArrayOfchar[2],
      paramArrayOfchar[3],
      arrayOfInt1[2],
      arrayOfInt1[3],
      8,
      0
    };
    m m = m.a(paramF, arrayOfInt2);
    m.v("SD Delete File");
    return m;
  }

  public static m e(F paramF) {
    int[] arrayOfInt = {114, paramF.x(), 7, 2, 77, 0, 8};
    G g = paramF.b("cmdReadMs3Rtc");
    if (g != null && g.size() > 0) arrayOfInt = c.b(((H) g.get(0)).d());
    m m = m.a(paramF, arrayOfInt);
    m.a(600);
    m.v("SD RTC Read");
    return m;
  }

  public static m f(F paramF) {
    int[] arrayOfInt = {114, paramF.x(), 7, 2, 126, 0, 8};
    m m = m.a(paramF, arrayOfInt);
    m.v("SD RTC Set Init");
    return m;
  }

  public static m a(F paramF, Date paramDate) {
    int[] arrayOfInt1 = new int[9];
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(paramDate);
    arrayOfInt1[0] = calendar.get(13);
    arrayOfInt1[1] = calendar.get(12);
    arrayOfInt1[2] = calendar.get(11);
    arrayOfInt1[3] = calendar.get(7);
    arrayOfInt1[4] = calendar.get(5);
    arrayOfInt1[5] = calendar.get(2) + 1;
    int i = calendar.get(1);
    byte[] arrayOfByte = new byte[2];
    c.a(i, arrayOfByte, true);
    arrayOfInt1[6] = arrayOfByte[0];
    arrayOfInt1[7] = arrayOfByte[1];
    arrayOfInt1[8] = 90;
    int[] arrayOfInt2 = {
      119,
      paramF.x(),
      7,
      2,
      126,
      0,
      9,
      arrayOfInt1[0],
      arrayOfInt1[1],
      arrayOfInt1[2],
      arrayOfInt1[3],
      arrayOfInt1[4],
      arrayOfInt1[5],
      arrayOfInt1[6],
      arrayOfInt1[7],
      arrayOfInt1[8]
    };
    m m = m.a(paramF, arrayOfInt2);
    m.v("SD RTC Set ");
    return m;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
