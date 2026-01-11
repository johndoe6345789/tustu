package K;

import G.R;
import G.aH;
import G.aM;
import G.aS;
import G.bU;
import G.bv;
import V.g;
import V.j;
import bH.D;
import bH.g;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class e implements bU {
  g a = new g();
  
  R b;
  
  public e(R paramR) {
    this.b = paramR;
  }
  
  public void a() {}
  
  public void a(boolean paramBoolean) {
    if (paramBoolean)
      a(this.b); 
  }
  
  public void a(R paramR) {
    Iterator<bv> iterator = paramR.e().d();
    while (iterator.hasNext()) {
      bv bv = iterator.next();
      if (bv instanceof aS) {
        aS aS = (aS)bv;
        try {
          a(paramR, aS);
        } catch (g g1) {
          Logger.getLogger(e.class.getName()).log(Level.WARNING, "Error trying to validate PortEditor addressing.", (Throwable)g1);
        } 
      } 
    } 
  }
  
  private void a(R paramR, aS paramaS) {
    String str = paramaS.r();
    if (str == null || str.isEmpty())
      return; 
    boolean bool1 = false;
    boolean bool2 = false;
    if (a(paramR, paramaS.m()))
      bool1 = true; 
    if (a(paramR, paramaS.h()))
      bool1 = true; 
    aM aM1 = paramR.c(str);
    if (aM1 == null) {
      D.b("PortEditor: outputName parameter not found in configuration. " + str);
      return;
    } 
    aM aM2 = paramR.c(paramaS.g());
    if (!aM2.c().equals(aM1.c())) {
      D.b("PortEditor outputOffset and outputName should be the same size! Cannot validate offsets.");
      return;
    } 
    aM aM3 = paramR.c(paramaS.t());
    aM aM4 = paramR.c(paramaS.u());
    aM aM5 = paramR.c(paramaS.d());
    double[][] arrayOfDouble1 = aM5.i(paramR.h());
    boolean bool = paramR.O().al().equals("XCP");
    double[][] arrayOfDouble2 = aM2.i(paramR.h());
    double[][] arrayOfDouble3 = aM1.i(paramR.h());
    double[][] arrayOfDouble4 = (aM3 != null) ? aM3.i(paramR.h()) : null;
    double[][] arrayOfDouble5 = (aM3 != null) ? aM4.i(paramR.h()) : null;
    for (byte b = 0; b < (arrayOfDouble2[0]).length; b++) {
      if (arrayOfDouble1[b][0] != 0.0D) {
        for (byte b1 = 0; b1 < arrayOfDouble2.length; b1++) {
          double d1 = arrayOfDouble2[b1][b];
          double d2 = arrayOfDouble3[b1][b];
          aH aH = a(paramR, (int)d1, aM2, bool);
          if (d2 > 0.0D) {
            boolean bool3 = false;
            if (aH == null) {
              D.d("PortEditor: No channel at offset/address, updating.");
              bool3 = true;
            } else {
              this.a.a();
              this.a.a(aH.aL().getBytes());
              if (this.a.b() != d2) {
                D.d("PortEditor offset/address does not match name crc, updating.");
                bool3 = true;
              } 
            } 
            if (bool3) {
              aH = a(paramR, d2);
              if (aH == null) {
                D.b("No Channel found in configuration for crc: " + d2 + ", no way to know this port is using valid conditions!");
                arrayOfDouble3[b1][b] = 0.0D;
                try {
                  aM1.a(paramR.h(), arrayOfDouble3);
                  paramR.I();
                } catch (j j) {
                  D.b("Attempted to set invalid offset values in PortEditor! Message: " + j.getLocalizedMessage());
                } 
              } else {
                if (bool) {
                  if (aM2.e() >= 4) {
                    arrayOfDouble2[b1][b] = aH.x();
                  } else {
                    arrayOfDouble2[b1][b] = (aH.x() - paramR.O().af());
                  } 
                } else {
                  arrayOfDouble2[b1][b] = aH.a();
                } 
                D.d("Updated PortEditor channel based on crc. condition:" + b1 + ", offsetIndex:" + b + " Channel assigned: " + aH.aL());
                bool1 = true;
              } 
            } 
          } 
        } 
      } else {
        if (arrayOfDouble4 != null && arrayOfDouble4[b][0] != 0.0D) {
          arrayOfDouble4[b][0] = 0.0D;
          bool2 = true;
        } 
        if (arrayOfDouble5 != null && arrayOfDouble5[b][0] != 0.0D) {
          arrayOfDouble5[b][0] = 0.0D;
          bool2 = true;
        } 
      } 
    } 
    if (bool2) {
      if (aM3 != null)
        try {
          aM3.a(paramR.h(), arrayOfDouble4);
        } catch (j j) {
          D.b("Attempted to set 0.0 on delay, this should be allowed. Message: " + j.getLocalizedMessage());
        }  
      if (aM4 != null)
        try {
          aM4.a(paramR.h(), arrayOfDouble5);
        } catch (j j) {
          D.b("Attempted to set 0.0 on delay, this should be allowed. Message: " + j.getLocalizedMessage());
        }  
    } 
    if (bool1)
      try {
        aM2.a(paramR.h(), arrayOfDouble2);
        paramR.I();
        D.d("Updated PortEditor");
      } catch (j j) {
        D.b("Attempted to set invalid offset values in PortEditor! Message: " + j.getLocalizedMessage());
      }  
  }
  
  private boolean a(R paramR, String paramString) {
    aM aM = paramR.c(paramString);
    if (aM == null) {
      D.b("Parameter not found, cannot perform specific check: " + paramString);
      return false;
    } 
    boolean bool = false;
    List list = aM.j();
    if (list != null && !list.isEmpty()) {
      double[][] arrayOfDouble = aM.i(paramR.p());
      for (byte b = 0; b < arrayOfDouble.length; b++) {
        for (byte b1 = 0; b1 < (arrayOfDouble[0]).length; b1++) {
          if (!list.contains(Double.valueOf(arrayOfDouble[b][b1]))) {
            arrayOfDouble[b][b1] = ((Double)list.get(0)).doubleValue();
            bool = true;
          } 
        } 
      } 
      if (bool)
        try {
          aM.a(paramR.h(), arrayOfDouble);
        } catch (j j) {
          D.b(j.getMessage());
        }  
    } 
    return bool;
  }
  
  private aH a(R paramR, int paramInt, aM paramaM, boolean paramBoolean) {
    Iterator<aH> iterator = paramR.K().q();
    while (iterator.hasNext()) {
      aH aH = iterator.next();
      if (paramBoolean) {
        long l;
        if (paramaM == null || paramaM.e() < 4) {
          l = aH.x() - paramR.O().af();
        } else {
          l = aH.x();
        } 
        if (aH.b().equals("scalar") && l == paramInt)
          return aH; 
        continue;
      } 
      if (aH.b().equals("scalar") && aH.a() == paramInt)
        return aH; 
    } 
    return null;
  }
  
  private aH a(R paramR, double paramDouble) {
    Iterator<aH> iterator = paramR.K().q();
    while (iterator.hasNext()) {
      aH aH = iterator.next();
      if (aH.b().equals("scalar")) {
        this.a.a();
        this.a.a(aH.aL().getBytes());
        if (this.a.b() == paramDouble)
          return aH; 
      } 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/K/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */