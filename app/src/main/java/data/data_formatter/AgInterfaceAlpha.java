package aG;

import G.F;
import G.m;
import bH.c;

public class AgInterfaceAlpha {
  public static m a(F paramF, int paramInt) {
    int[] arrayOfInt1 = new int[2];
    int i = paramInt * 52;
    arrayOfInt1 = c.a(i, arrayOfInt1, false);
    int[] arrayOfInt2 = {251, arrayOfInt1[0], arrayOfInt1[1]};
    m m = m.a(paramF, arrayOfInt2);
    m.b(i + 1);
    m.v("Read Original Replay");
    m.i(250);
    m.a(3000);
    return m;
  }

  public static m a(F paramF, int paramInt1, int paramInt2, int paramInt3) {
    int[] arrayOfInt1 = new int[2];
    arrayOfInt1 = c.a(paramInt2, arrayOfInt1, false);
    int[] arrayOfInt2 = {paramInt1, arrayOfInt1[0], arrayOfInt1[1]};
    m m = m.a(paramF, arrayOfInt2);
    m.b(paramInt3 + 1);
    m.v("Read Extended Replay");
    m.i(50);
    m.a(2000);
    return m;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aG/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
