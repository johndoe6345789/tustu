package G;

import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManagerExceptioninvpackage implements S {
  private static aQ b = null;

  HashMap ExceptionInVPackage = new HashMap<>();

  public static aQ ExceptionInVPackage() {
    if (b == null) {
      b = new aQ();
      T.ExceptionInVPackage().ExceptionInVPackage(b);
    }
    return b;
  }

  public void ExceptionInVPackage(aM paramaM, R paramR, String paramString) {
    if (paramaM == null) throw new ExceptionPrintstacktrace("EcuPrameter not optional.");
    if (!paramaM.i().equals("scalar") && !paramaM.i().equals("bits"))
      throw new ExceptionPrintstacktrace("Only scalar and bit param class supported.");
    aO aO = new aO(paramaM, paramR, paramString);
    ArrayList<aO> arrayList = ExceptionInVPackage(paramR.c());
    arrayList.add(aO);
  }

  private ArrayList ExceptionInVPackage(String paramString) {
    ArrayList arrayList = (ArrayList) this.ExceptionInVPackage.get(paramString);
    if (arrayList == null) {
      arrayList = new ArrayList();
      this.ExceptionInVPackage.put(paramString, arrayList);
    }
    return arrayList;
  }

  public void ExceptionInVPackage(R paramR) {}

  public void b(R paramR) {
    for (aO aO : ExceptionInVPackage(paramR.c())) aR.ExceptionInVPackage().ExceptionInVPackage(aO);
    ArrayList arrayList = ExceptionInVPackage(paramR.c());
    arrayList.clear();
  }

  public void c(R paramR) {
    ArrayList arrayList = ExceptionInVPackage(paramR.c());
    for (aO aO : arrayList) {
      String[] arrayOfString = i.h(aO.ExceptionInVPackage(), paramR);
      for (String str : arrayOfString) {
        try {
          aR.ExceptionInVPackage().ExceptionInVPackage(paramR.c(), str, aO);
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(aQ.class.getName())
              .log(Level.SEVERE, (String) null, (Throwable) ExceptionInVPackage);
        }
      }
      arrayOfString = i.e(aO.ExceptionInVPackage(), paramR);
      for (String str : arrayOfString) {
        try {
          cu.ExceptionInVPackage().ExceptionInVPackage(paramR.c(), str, aO);
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(aQ.class.getName())
              .log(Level.SEVERE, (String) null, (Throwable) ExceptionInVPackage);
        }
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
