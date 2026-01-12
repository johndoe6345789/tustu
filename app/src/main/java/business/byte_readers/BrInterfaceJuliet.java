package business.byte_readers;

import G.GInterfaceDe;
import G.GInterfaceDm;
import G.R;
import W.ManagerUsingFile;
import aE.AeInterfaceEcho;
import aE.PropertiesExtension;
import com.efiAnalytics.ui.c;
import com.efiAnalytics.ui.dQ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import r.PropertiesExtension;
import r.ThreadedFile;

public class BrInterfaceJuliet implements AeInterfaceEcho {
  private static J b = null;

  HashMap PropertiesExtension = new HashMap<>();

  public static J PropertiesExtension() {
    if (b == null) b = new J();
    return b;
  }

  public ArrayList PropertiesExtension(R paramR) {
    Iterator<String> iterator = paramR.L();
    if (!iterator.hasNext()) {
      c(paramR);
      iterator = paramR.L();
    }
    ArrayList<String> arrayList = new ArrayList();
    while (iterator.hasNext()) arrayList.add(iterator.next());
    return arrayList;
  }

  public ArrayList b(R paramR) {
    Iterator<String> iterator = paramR.M();
    ArrayList<String> arrayList = new ArrayList();
    while (iterator.hasNext()) arrayList.add(iterator.next());
    return arrayList;
  }

  public GInterfaceDm PropertiesExtension(R paramR, String paramString) {
    GInterfaceDm GInterfaceDm = paramR.r(paramString);
    if (GInterfaceDm != null) return GInterfaceDm;
    c(paramR);
    return paramR.r(paramString);
  }

  public GInterfaceDe b(R paramR, String paramString) {
    GInterfaceDe GInterfaceDe = paramR.s(paramString);
    return (GInterfaceDe != null) ? GInterfaceDe : paramR.s(paramString);
  }

  private void c(R paramR) {
    String str = paramR.i();
    if (str.startsWith("MS3")) {
      String str1 = ThreadedFile.o;
      d(paramR, str1);
    } else if (str.startsWith("MS2Extra")) {
      String str1 = ThreadedFile.p;
      d(paramR, str1);
    } else if (str.startsWith("MS/Extra")
        || str.startsWith("MS1/Extra")
        || str.startsWith("MSnS-extra")) {
      String str1 = ThreadedFile.n;
      d(paramR, str1);
    } else if (str.startsWith("MSII Rev")) {
      String str1 = ThreadedFile.q;
      d(paramR, str1);
    } else if (str.startsWith("20")) {
      String str1 = ThreadedFile.m;
      d(paramR, str1);
    } else if (str.startsWith("Monsterfirmware")) {
      String str1 = ThreadedFile.r;
      d(paramR, str1);
    } else if (str.startsWith("BigStuff Gen4")) {
      String str1 = ThreadedFile.s;
      d(paramR, str1);
    }
  }

  private void d(R paramR, String paramString) {
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

  public c c(R paramR, String paramString) {
    String str = paramR.c() + "." + paramString;
    if (!this.PropertiesExtension.containsKey(str)) {
      dQ dQ = new dQ((Properties) PropertiesExtension.A(), str);
      c c = new c();
      c.AeInterfaceEcho(PropertiesExtension(dQ, "maxPercentChange", c.AeInterfaceEcho()));
      c.f(PropertiesExtension(dQ, "baseWeight", c.h()));
      c.d(PropertiesExtension(dQ, "maxValueChange", c.d()));
      c.c(PropertiesExtension(dQ, "minChangeThreshold", c.c()));
      c.PropertiesExtension(PropertiesExtension(dQ, "weightThreshold", c.PropertiesExtension()));
      this.PropertiesExtension.put(str, c);
    }
    return (c) this.PropertiesExtension.get(str);
  }

  private double PropertiesExtension(dQ paramdQ, String paramString, double paramDouble) {
    String str = paramdQ.PropertiesExtension(paramString);
    return (str == null || str.trim().equals("")) ? paramDouble : Double.parseDouble(str);
  }

  public void PropertiesExtension(PropertiesExtension parama, R paramR) {}

  public void e_() {
    this.PropertiesExtension.clear();
  }

  public void PropertiesExtension(PropertiesExtension parama) {}
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
