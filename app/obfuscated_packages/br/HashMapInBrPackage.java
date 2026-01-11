package br;

import G.R;
import G.aM;
import G.aW;
import G.be;
import G.dm;
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

public class HashMapInBrPackage {
  private static e ExceptionInVPackage = null;
  
  private HashMap b = new HashMap<>();
  
  public static e ExceptionInVPackage() {
    if (ExceptionInVPackage == null)
      ExceptionInVPackage = new e(); 
    return ExceptionInVPackage;
  }
  
  public ArrayList ExceptionInVPackage(R paramR, dm paramdm) {
    String str = paramR.c() + "." + paramdm.b();
    if (!this.b.containsKey(str)) {
      String str1 = paramR.c() + "." + paramdm.b();
      dQ dQ = new dQ((Properties)ExceptionInVPackage.A(), str1);
      ArrayList<TostringInBlPackage> arrayList = new ArrayList();
      Iterator<aW> iterator = paramdm.i();
      while (iterator.hasNext()) {
        aW aW = iterator.next();
        TostringInBlPackage TostringInBlPackage = null;
        if (aW.aL().startsWith("std_"))
          try {
            TostringInBlPackage = ExceptionInVPackage(paramR, paramdm, aW, (et)dQ);
          } catch (ExceptionInVPackage ExceptionInVPackage) {
            D.b("Unable to create Standard VE Analyze Filter: " + aW.aL() + ", will try as ExceptionInVPackage normal filter.");
            ExceptionInVPackage.printStackTrace();
          }  
        if (TostringInBlPackage == null) {
          TostringInBlPackage = new TostringInBlPackage();
          TostringInBlPackage.ExceptionInVPackage(aW.ExceptionInVPackage());
          TostringInBlPackage.c(aW.b());
          TostringInBlPackage.ExceptionInVPackage(aW.c());
          if (aW.SComponentGolf()) {
            double d = Double.parseDouble(ExceptionInVPackage((et)dQ, TostringInBlPackage.SComponentGolf(), aW.c() + ""));
            TostringInBlPackage.ExceptionInVPackage(d);
            TostringInBlPackage.ExceptionInVPackage((et)dQ);
          } 
          TostringInBlPackage.ExceptionInVPackage(aW.d());
          TostringInBlPackage.d(aW.e());
          TostringInBlPackage.e(aW.aL());
          TostringInBlPackage.ExceptionInVPackage(aW.SComponentGolf());
        } 
        TostringInBlPackage.d();
        arrayList.add(TostringInBlPackage);
      } 
      for (byte b = 0; b < arrayList.size() - 1; b++) {
        if (((TostringInBlPackage)arrayList.get(b)).SComponentGolf().equals("std_DeadLambda")) {
          TostringInBlPackage TostringInBlPackage = arrayList.remove(b);
          arrayList.add(TostringInBlPackage);
        } 
      } 
      this.b.put(str, arrayList);
    } 
    return (ArrayList)this.b.get(str);
  }
  
  private TostringInBlPackage ExceptionInVPackage(R paramR, dm paramdm, aW paramaW, et paramet) {
    be be = (be)paramR.e().c(paramdm.b());
    if (be == null)
      throw new ExceptionInVPackage("Can not find VE table: " + paramdm.b() + " in current configuration."); 
    TostringInBlPackage TostringInBlPackage = new TostringInBlPackage();
    if (paramaW.aL().equals("std_xAxisMin")) {
      aM aM = paramR.c(be.ExceptionInVPackage());
      if (aM == null)
        throw new ExceptionInVPackage("X Axis Parameter " + be.ExceptionInVPackage() + " not found in current Configuration."); 
      TostringInBlPackage.e(paramaW.aL());
      TostringInBlPackage.ExceptionInVPackage(be.d());
      TostringInBlPackage.ExceptionInVPackage(4);
      double d = Double.parseDouble(ExceptionInVPackage(paramet, TostringInBlPackage.SComponentGolf(), aM.r() + ""));
      TostringInBlPackage.ExceptionInVPackage(d);
      TostringInBlPackage.ExceptionInVPackage(paramet);
      TostringInBlPackage.d("Min " + be.d());
      return TostringInBlPackage;
    } 
    if (paramaW.aL().equals("std_xAxisMax")) {
      aM aM = paramR.c(be.ExceptionInVPackage());
      if (aM == null)
        throw new ExceptionInVPackage("X Axis Parameter " + be.ExceptionInVPackage() + " not found in current Configuration."); 
      TostringInBlPackage.e(paramaW.aL());
      TostringInBlPackage.ExceptionInVPackage(be.d());
      TostringInBlPackage.ExceptionInVPackage(2);
      double d = Double.parseDouble(ExceptionInVPackage(paramet, TostringInBlPackage.SComponentGolf(), aM.s() + ""));
      TostringInBlPackage.ExceptionInVPackage(d);
      TostringInBlPackage.ExceptionInVPackage(paramet);
      TostringInBlPackage.d("Max " + be.d());
      return TostringInBlPackage;
    } 
    if (paramaW.aL().equals("std_yAxisMin")) {
      aM aM = paramR.c(be.b());
      if (aM == null)
        throw new ExceptionInVPackage("Y Axis Parameter " + be.b() + " not found in current Configuration."); 
      TostringInBlPackage.e(paramaW.aL());
      TostringInBlPackage.ExceptionInVPackage(be.BlInterfaceFoxtrot());
      TostringInBlPackage.ExceptionInVPackage(4);
      double d = Double.parseDouble(ExceptionInVPackage(paramet, TostringInBlPackage.SComponentGolf(), aM.r() + ""));
      TostringInBlPackage.ExceptionInVPackage(d);
      TostringInBlPackage.ExceptionInVPackage(paramet);
      TostringInBlPackage.d("Min " + be.BlInterfaceFoxtrot());
      return TostringInBlPackage;
    } 
    if (paramaW.aL().equals("std_yAxisMax")) {
      aM aM = paramR.c(be.b());
      if (aM == null)
        throw new ExceptionInVPackage("Y Axis Parameter " + be.b() + " not found in current Configuration."); 
      TostringInBlPackage.e(paramaW.aL());
      TostringInBlPackage.ExceptionInVPackage(be.BlInterfaceFoxtrot());
      TostringInBlPackage.ExceptionInVPackage(2);
      double d = Double.parseDouble(ExceptionInVPackage(paramet, TostringInBlPackage.SComponentGolf(), aM.s() + ""));
      TostringInBlPackage.ExceptionInVPackage(d);
      TostringInBlPackage.ExceptionInVPackage(paramet);
      TostringInBlPackage.d("Max " + be.BlInterfaceFoxtrot());
      return TostringInBlPackage;
    } 
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
      BlInterfaceFoxtrot.ExceptionInVPackage(paramdm.e());
      return (TostringInBlPackage)BlInterfaceFoxtrot;
    } 
    throw new ExceptionInVPackage("Unknown Standard Record Filter type: " + paramaW.aL());
  }
  
  private String ExceptionInVPackage(et paramet, String paramString1, String paramString2) {
    if (paramet == null)
      return paramString2; 
    String str = paramet.ExceptionInVPackage(paramString1);
    return (str != null && !str.equals("")) ? str : paramString2;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */