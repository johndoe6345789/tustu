package aS;

import G.R;
import G.S;
import G.Manager;
import G.GInterfaceAn;
import G.ManagerUsingConcurrentHashMap;
import G.ManagerUsingArrayList;
import V.ExceptionInVPackage;
import bH.D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AsInterfaceGolf implements S, GInterfaceAn {
  String ExceptionInVPackage = "seconds";
  
  HashMap b = new HashMap<>();
  
  double c = 1.0D;
  
  Map d = new HashMap<>();
  
  Map e = new HashMap<>();
  
  protected void d(R paramR) {
    String[] arrayOfString = paramR.k();
    ArrayList<String> arrayList = b(paramR.c());
    Map<String, String> map = ExceptionInVPackage(paramR.c());
    for (byte b = 0; b < arrayOfString.length; b++) {
      Manager Manager = paramR.c(arrayOfString[b]);
      if (Manager.E()) {
        arrayList.add(arrayOfString[b]);
        ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(paramR.c(), arrayOfString[b], this);
        if (Manager.i().equals("bits"))
          try {
            map.put(Manager.aL(), Manager.f(paramR.h()));
          } catch (V.g g1) {
            Logger.getLogger(g.class.getName()).log(Level.WARNING, "PowerCycleMonitor unable to store bit param value", (Throwable)g1);
          }  
      } 
    } 
    if (!arrayList.isEmpty()) {
      ManagerUsingArrayList.ExceptionInVPackage().d("powerCycleRequired");
      j j = new j(this);
      paramR.ExceptionInVPackage(j);
      if (paramR.g(this.ExceptionInVPackage) != null) {
        ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(paramR.c(), this.ExceptionInVPackage, j);
      } else {
        D.ExceptionInVPackage("Failed to subscribe PowerCycle Monitor to outputchannel: " + this.ExceptionInVPackage);
      } 
      ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage("controllerSettingsLoaded", j);
      ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage("powerCycleRequired", new i(this, paramR));
      this.d.put(paramR.c(), paramR);
    } 
  }
  
  private Map ExceptionInVPackage(String paramString) {
    Map<Object, Object> map = (Map)this.e.get(paramString);
    if (map == null) {
      map = new HashMap<>();
      this.e.put(paramString, map);
    } 
    return map;
  }
  
  private ArrayList b(String paramString) {
    ArrayList arrayList = (ArrayList)this.b.get(paramString);
    if (arrayList == null) {
      arrayList = new ArrayList();
      this.b.put(paramString, arrayList);
    } 
    return arrayList;
  }
  
  public void ExceptionInVPackage(R paramR) {}
  
  public void b(R paramR) {
    ManagerUsingArrayList.ExceptionInVPackage().i(paramR.c());
    this.b.remove(paramR.c());
    if (this.b.isEmpty())
      ManagerUsingArrayList.ExceptionInVPackage().f("powerCycleRequired"); 
    this.e.remove(paramR.c());
    this.d.remove(paramR.c());
    ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(this);
  }
  
  public void c(R paramR) {
    try {
      d(paramR);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage(ExceptionInVPackage.getMessage(), (Exception)ExceptionInVPackage, null);
    } 
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
    R r = (R)this.d.get(paramString1);
    Manager Manager = r.c(paramString2);
    if (Manager.i().equals("bits"))
      try {
        Map<String, String> map = ExceptionInVPackage(r.c());
        String str1 = (String)map.get(paramString2);
        String str2 = Manager.f(r.h());
        map.put(paramString2, str2);
        if (str1 != null && str2 != null && str1.equals(str2))
          return; 
      } catch (V.g g1) {
        Logger.getLogger(g.class.getName()).log(Level.INFO, "Strange, PowerCycleMonitor can't get last bit value.", (Throwable)g1);
      }  
    if (r != null && r.R()) {
      ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage("powerCycleRequired", 1.0D);
      D.d(paramString2 + " changed and requires ExceptionInVPackage PowerCycle");
      if (this.c == 0.0D)
        ExceptionInVPackage(); 
      this.c = 1.0D;
    } 
  }
  
  private void ExceptionInVPackage() {
    h h = new h(this);
    h.start();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aS/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */