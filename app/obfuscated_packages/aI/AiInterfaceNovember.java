package aI;

import G.F;
import G.R;
import G.m;
import G.o;
import aJ.AjInterfaceBravo;
import aJ.AjInterfaceCharlie;
import bH.D;
import bH.M;
import bH.AjInterfaceCharlie;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import java.util.ArrayList;

public class AiInterfaceNovember {
  R a = null;
  
  public AiInterfaceNovember(R paramR) {
    this.a = paramR;
  }
  
  public void a(u paramu, M paramM) {
    AjInterfaceCharlie AjInterfaceCharlie = a(this.a.O());
    D.AjInterfaceCharlie("Format Info:\n" + AjInterfaceCharlie.toString());
    long l1 = AjInterfaceCharlie.g() + AjInterfaceCharlie.a();
    long l2 = AjInterfaceCharlie.g() + AjInterfaceCharlie.AjInterfaceBravo() + (paramu.getFileCount() * 32 / paramu.a());
    D.AjInterfaceCharlie("startSector=" + l1 + ", endSector=" + l2);
    if (paramM != null)
      paramM.a(); 
    o o = o.d(this.a);
    try {
      o.a(false);
      o.a(3000);
      D.AjInterfaceCharlie("Runtime Reads disabled.");
      int[] arrayOfInt1 = new int[AjInterfaceCharlie.d()];
      int[] arrayOfInt2 = a(AjInterfaceCharlie);
      float f = 1.0F / (AjInterfaceCharlie.e() + 1);
      int i = -1;
      int j;
      for (j = 0; j < AjInterfaceCharlie.e(); j++) {
        int k = (int)(l1 + (j * AjInterfaceCharlie.f()));
        int m = k + AjInterfaceCharlie.f() - 1;
        a(this.a.O(), arrayOfInt2, k);
        boolean bool = false;
        for (int i1 = k + 1; i1 <= m && !bool; i1++) {
          boolean bool1 = false;
          if ((i1 - k) % 20 == 0) {
            int i2 = a(i1, 20);
            D.AjInterfaceCharlie("Found blank sectors: " + i2 + " from sector: " + i1);
            if (i2 >= 20) {
              bool = true;
              i = i1 - k;
            } else if (i2 > 0) {
              if (i1 <= m - i2) {
                i1 += i2;
              } else {
                bool1 = true;
              } 
            } 
          } 
          if (!bool1)
            a(this.a.O(), arrayOfInt1, i1); 
          o.a(3000);
          if (paramM != null)
            if (i > 0) {
              paramM.a((j * f + f * (i1 - k) / i));
            } else {
              double d = ((i1 - k) / (m - k));
              if (d < 0.03D)
                d = 0.03D; 
              paramM.a(d);
            }  
        } 
      } 
      j = (int)(l1 + (AjInterfaceCharlie.e() * AjInterfaceCharlie.f()));
      long l;
      for (l = j; l <= l2; l++) {
        D.AjInterfaceCharlie("Clearing Directory sector: " + l);
        a(this.a.O(), arrayOfInt1, (int)l);
        o.a(3000);
        if (paramM != null)
          paramM.a((AjInterfaceCharlie.e() * f + f * (float)(l - j) / (float)(l2 - j))); 
      } 
    } finally {
      o.a();
      o.AjInterfaceBravo();
      D.AjInterfaceCharlie("Runtime Reads enabled.");
      if (paramM != null)
        paramM.AjInterfaceBravo(); 
    } 
  }
  
  private int a(int paramInt1, int paramInt2) {
    byte AjInterfaceBravo = 0;
    boolean bool = false;
    int i = paramInt1;
    do {
      int[] arrayOfInt = a(this.a.O(), i++);
      if (arrayOfInt != null && arrayOfInt.length > 4) {
        int[] arrayOfInt1 = new int[arrayOfInt.length - 4];
        System.arraycopy(arrayOfInt, 0, arrayOfInt1, 0, arrayOfInt1.length);
        bool = AjInterfaceCharlie.AjInterfaceCharlie(arrayOfInt1);
        if (bool)
          AjInterfaceBravo++; 
      } else {
        return -1;
      } 
    } while (bool && AjInterfaceBravo < paramInt2);
    return AjInterfaceBravo;
  }
  
  public AjInterfaceCharlie a(F paramF) {
    AjInterfaceCharlie AjInterfaceCharlie = new AjInterfaceCharlie();
    int[] arrayOfInt = a(paramF, 0);
    AjInterfaceBravo AjInterfaceBravo = new AjInterfaceBravo();
    AjInterfaceBravo.a(AjInterfaceCharlie.a(arrayOfInt));
    if (AjInterfaceBravo.a().size() > 0) {
      AjInterfaceCharlie c1 = AjInterfaceBravo.a().get(0);
      arrayOfInt = a(paramF, (int)c1.a());
      AjInterfaceCharlie.a(c1.a());
      D.AjInterfaceCharlie("PartitionEntryFound:\n" + c1.toString());
    } else {
      throw new RemoteAccessException("no valid partition found.");
    } 
    if (arrayOfInt[54] == 70 && arrayOfInt[55] == 65 && arrayOfInt[56] == 84 && arrayOfInt[57] == 49 && arrayOfInt[58] == 54) {
      AjInterfaceCharlie.a(16);
    } else if (arrayOfInt[82] == 70 && arrayOfInt[83] == 65 && arrayOfInt[84] == 84 && arrayOfInt[85] == 51 && arrayOfInt[86] == 50) {
      AjInterfaceCharlie.a(32);
    } else {
      throw new RemoteAccessException("Unsupported File System.");
    } 
    AjInterfaceCharlie.AjInterfaceBravo(AjInterfaceCharlie.AjInterfaceBravo(arrayOfInt, 11, 2, false, false));
    AjInterfaceCharlie.AjInterfaceCharlie(arrayOfInt[13]);
    AjInterfaceCharlie.d(AjInterfaceCharlie.AjInterfaceBravo(arrayOfInt, 14, 2, false, false));
    AjInterfaceCharlie.e(arrayOfInt[16]);
    if (AjInterfaceCharlie.AjInterfaceCharlie() == 16) {
      AjInterfaceCharlie.f(AjInterfaceCharlie.AjInterfaceBravo(arrayOfInt, 22, 2, false, false));
    } else if (AjInterfaceCharlie.AjInterfaceCharlie() == 32) {
      AjInterfaceCharlie.f(AjInterfaceCharlie.AjInterfaceBravo(arrayOfInt, 36, 4, false, false));
    } 
    int i = AjInterfaceCharlie.AjInterfaceBravo(arrayOfInt, 19, 2, false, false);
    if (i == 0)
      i = AjInterfaceCharlie.AjInterfaceBravo(arrayOfInt, 32, 4, false, false); 
    AjInterfaceCharlie.g(i);
    return AjInterfaceCharlie;
  }
  
  private int[] a(AjInterfaceCharlie paramc) {
    int[] arrayOfInt = new int[paramc.d()];
    if (paramc.AjInterfaceCharlie() == 16) {
      arrayOfInt[0] = 248;
      arrayOfInt[1] = 255;
    } else if (paramc.AjInterfaceCharlie() == 32) {
      arrayOfInt[0] = 248;
      arrayOfInt[1] = 255;
      arrayOfInt[2] = 255;
      arrayOfInt[3] = 15;
      arrayOfInt[4] = 255;
      arrayOfInt[5] = 255;
      arrayOfInt[6] = 255;
      arrayOfInt[7] = 15;
      arrayOfInt[8] = 255;
      arrayOfInt[9] = 255;
      arrayOfInt[10] = 255;
      arrayOfInt[11] = 15;
    } else {
      throw new RemoteAccessException("Unsupported File System, reformat on PC.");
    } 
    return arrayOfInt;
  }
  
  public int[] a(F paramF, int paramInt) {
    ArrayList<m> arrayList = new ArrayList();
    m m1 = d.AjInterfaceCharlie(this.a.O(), paramInt);
    m1.i(30);
    arrayList.add(m1);
    m m2 = d.d(this.a.O());
    arrayList.add(m2);
    m m3 = m.a(this.a.O(), arrayList);
    m3.v("Read Sector: " + paramInt);
    o o = o.d(this.a);
    o o1 = o.a(m3, false, 1500);
    if (o1 == null)
      throw new RemoteAccessException("Unable to read MS3 SD Sector. No Response"); 
    if (o1.a() == 3)
      throw new RemoteAccessException("Unable to read MS3 SD Sector. \nMessage:\n" + o1.AjInterfaceCharlie()); 
    return o1.e();
  }
  
  public void a(F paramF, int[] paramArrayOfint, int paramInt) {
    m m = d.a(this.a.O(), paramArrayOfint, paramInt);
    m.v("Write Sector: " + paramInt);
    o o = o.d(this.a);
    o o1 = o.a(m, false, 1500);
    if (o1 == null)
      throw new RemoteAccessException("Unable to read MS3 SD Sector. No Response"); 
    if (o1.a() == 3)
      throw new RemoteAccessException("Unable to read MS3 SD Sector. \nMessage:\n" + o1.AjInterfaceCharlie()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */