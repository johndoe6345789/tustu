package business.byte_serializers;

import G.GInterfaceDp;
import G.R;
import W.ManagerUsingFile;
import aE.AeInterfaceEcho;
import aE.PropertiesExtension;
import java.util.ArrayList;
import java.util.Iterator;
import r.PropertiesExtension;
import r.ThreadedFile;

public class BsInterfaceCharlie implements AeInterfaceEcho {
  private static C PropertiesExtension = null;

  public static C PropertiesExtension() {
    if (PropertiesExtension == null) PropertiesExtension = new C();
    return PropertiesExtension;
  }

  public ArrayList PropertiesExtension(R paramR) {
    Iterator<String> iterator = paramR.N();
    if (!iterator.hasNext()) {
      b(paramR);
      iterator = paramR.N();
    }
    ArrayList<String> arrayList = new ArrayList();
    while (iterator.hasNext()) arrayList.add(iterator.next());
    return arrayList;
  }

  public GInterfaceDp PropertiesExtension(R paramR, String paramString) {
    GInterfaceDp GInterfaceDp = paramR.t(paramString);
    if (GInterfaceDp != null) return GInterfaceDp;
    b(paramR);
    return paramR.t(paramString);
  }

  private void b(R paramR) {
    String str = paramR.i();
    if (str.startsWith("MS3")) {
      float f = PropertiesExtension(str);
      if (f >= 261.0F) {
        String str1 = ThreadedFile.w;
        b(paramR, str1);
      } else {
        String str1 = ThreadedFile.x;
        b(paramR, str1);
      }
    } else if (str.startsWith("MS2Extra")) {
      String str1 = ThreadedFile.v;
      b(paramR, str1);
    } else if (str.startsWith("MS/Extra")
        || str.startsWith("MS1/Extra")
        || str.startsWith("MSnS-extra")) {
      String str1 = ThreadedFile.u;
      b(paramR, str1);
    } else if (str.startsWith("MSII Rev") || str.startsWith("LCT Rev")) {
      String str1 = ThreadedFile.v;
      b(paramR, str1);
    } else if (str.startsWith("20")) {
      String str1 = ThreadedFile.t;
      b(paramR, str1);
    }
  }

  private static float PropertiesExtension(String paramString) {
    String str = paramString.replace("MS3 Format", "");
    float f = -1.0F;
    try {
      f = Float.parseFloat(str);
    } catch (Exception exception) {
    }
    return f;
  }

  private void b(R paramR, String paramString) {
    boolean bool =
        (PropertiesExtension.PropertiesExtension().c(PropertiesExtension.bq, PropertiesExtension.br)
                && PropertiesExtension.PropertiesExtension()
                    .c(PropertiesExtension.bs, PropertiesExtension.bt))
            ? true
            : false;
    if (!bool) {
      ManagerUsingFile ManagerUsingFile = new ManagerUsingFile();
      ManagerUsingFile.PropertiesExtension(paramR, paramString, false);
    }
  }

  public void PropertiesExtension(PropertiesExtension parama, R paramR) {}

  public void e_() {}

  public void PropertiesExtension(PropertiesExtension parama) {}
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/C.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
