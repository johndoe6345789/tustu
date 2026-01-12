package business.byte_serializers;

import G.CloneableImplInGPackage;
import G.GInterfaceDp;
import G.R;
import G.SerializableImplInGPackage;
import V.ExceptionInVPackage;
import aE.ExceptionInVPackage;
import bH.D;
import bL.BlInterfaceFoxtrot;
import bL.TostringInBlPackage;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.et;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import s.SComponentGolf;

public class HashMapInBsPackage {
  private static e ExceptionInVPackage = null;

  private HashMap b = new HashMap<>();

  public static e ExceptionInVPackage() {
    if (ExceptionInVPackage == null) ExceptionInVPackage = new e();
    return ExceptionInVPackage;
  }

  public ArrayList ExceptionInVPackage(R paramR, GInterfaceDp paramdp) {
    String str = paramR.c() + "." + paramdp.c();
    if (!this.b.containsKey(str)) {
      String str1 = paramR.c() + "." + paramdp.c();
      dQ dQ = new dQ((Properties) ExceptionInVPackage.A(), str1);
      ArrayList<TostringInBlPackage> arrayList = new ArrayList();
      Iterator<SerializableImplInGPackage> iterator = paramdp.i();
      while (iterator.hasNext()) {
        SerializableImplInGPackage SerializableImplInGPackage = iterator.next();
        TostringInBlPackage TostringInBlPackage = null;
        if (SerializableImplInGPackage.aL().startsWith("std_"))
          try {
            TostringInBlPackage =
                ExceptionInVPackage(paramR, paramdp, SerializableImplInGPackage, (et) dQ);
          } catch (ExceptionInVPackage ExceptionInVPackage) {
            D.b(
                "Unable to create Standard VE Analyze Filter: "
                    + SerializableImplInGPackage.aL()
                    + ", will try as ExceptionInVPackage normal filter.");
            ExceptionInVPackage.printStackTrace();
          }
        if (TostringInBlPackage == null) {
          TostringInBlPackage = new TostringInBlPackage();
          TostringInBlPackage.ExceptionInVPackage(SerializableImplInGPackage.ExceptionInVPackage());
          TostringInBlPackage.c(SerializableImplInGPackage.b());
          TostringInBlPackage.ExceptionInVPackage(SerializableImplInGPackage.c());
          if (SerializableImplInGPackage.SComponentGolf()) {
            double d =
                Double.parseDouble(
                    ExceptionInVPackage(
                        (et) dQ,
                        TostringInBlPackage.SComponentGolf(),
                        SerializableImplInGPackage.c() + ""));
            TostringInBlPackage.ExceptionInVPackage(d);
            TostringInBlPackage.ExceptionInVPackage((et) dQ);
          }
          TostringInBlPackage.ExceptionInVPackage(SerializableImplInGPackage.d());
          TostringInBlPackage.d(SerializableImplInGPackage.e());
          TostringInBlPackage.e(SerializableImplInGPackage.aL());
          TostringInBlPackage.ExceptionInVPackage(SerializableImplInGPackage.SComponentGolf());
        }
        TostringInBlPackage.d();
        arrayList.add(TostringInBlPackage);
      }
      this.b.put(str, arrayList);
    }
    return (ArrayList) this.b.get(str);
  }

  private TostringInBlPackage ExceptionInVPackage(
      R paramR, GInterfaceDp paramdp, SerializableImplInGPackage paramaW, et paramet) {
    CloneableImplInGPackage CloneableImplInGPackage =
        (CloneableImplInGPackage) paramR.e().c(paramdp.c());
    if (CloneableImplInGPackage == null)
      throw new ExceptionInVPackage(
          "Can not find WUE Curve: " + paramdp.c() + " in current configuration.");
    TostringInBlPackage TostringInBlPackage = new TostringInBlPackage();
    if (paramaW.aL().equals("std_Custom")) {
      TostringInBlPackage.e(paramaW.aL());
      TostringInBlPackage.ExceptionInVPackage(128);
      String str = ExceptionInVPackage(paramet, TostringInBlPackage.SComponentGolf(), "");
      TostringInBlPackage.c(str);
      TostringInBlPackage.ExceptionInVPackage(paramet);
      TostringInBlPackage.d(SComponentGolf.b("Custom Filter") + ": ");
      return TostringInBlPackage;
    }
    if (paramaW.aL().equals("std_Expression")) {
      TostringInBlPackage.e(paramaW.aL());
      TostringInBlPackage.ExceptionInVPackage(128);
      String str = paramaW.BlInterfaceFoxtrot();
      TostringInBlPackage.c(str);
      TostringInBlPackage.d(paramaW.e());
      TostringInBlPackage.ExceptionInVPackage(false);
      return TostringInBlPackage;
    }
    if (paramaW.aL().equals("std_DeadLambda")) {
      BlInterfaceFoxtrot BlInterfaceFoxtrot = new BlInterfaceFoxtrot();
      BlInterfaceFoxtrot.e(paramaW.aL());
      BlInterfaceFoxtrot.ExceptionInVPackage(paramdp.d());
      return (TostringInBlPackage) BlInterfaceFoxtrot;
    }
    throw new ExceptionInVPackage("Unknown Standard Record Filter type for WUE: " + paramaW.aL());
  }

  private String ExceptionInVPackage(et paramet, String paramString1, String paramString2) {
    if (paramet == null) return paramString2;
    String str = paramet.ExceptionInVPackage(paramString1);
    return (str != null && !str.equals("")) ? str : paramString2;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
