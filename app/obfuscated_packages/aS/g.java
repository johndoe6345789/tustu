package aS;

import G.R;
import G.S;
import G.aM;
import G.aN;
import G.aR;
import G.cu;
import V.a;
import bH.D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class g implements S, aN {
  String a = "seconds";
  
  HashMap b = new HashMap<>();
  
  double c = 1.0D;
  
  Map d = new HashMap<>();
  
  Map e = new HashMap<>();
  
  protected void d(R paramR) {
    String[] arrayOfString = paramR.k();
    ArrayList<String> arrayList = b(paramR.c());
    Map<String, String> map = a(paramR.c());
    for (byte b = 0; b < arrayOfString.length; b++) {
      aM aM = paramR.c(arrayOfString[b]);
      if (aM.E()) {
        arrayList.add(arrayOfString[b]);
        aR.a().a(paramR.c(), arrayOfString[b], this);
        if (aM.i().equals("bits"))
          try {
            map.put(aM.aL(), aM.f(paramR.h()));
          } catch (V.g g1) {
            Logger.getLogger(g.class.getName()).log(Level.WARNING, "PowerCycleMonitor unable to store bit param value", (Throwable)g1);
          }  
      } 
    } 
    if (!arrayList.isEmpty()) {
      cu.a().d("powerCycleRequired");
      j j = new j(this);
      paramR.a(j);
      if (paramR.g(this.a) != null) {
        cu.a().a(paramR.c(), this.a, j);
      } else {
        D.a("Failed to subscribe PowerCycle Monitor to outputchannel: " + this.a);
      } 
      cu.a().a("controllerSettingsLoaded", j);
      cu.a().a("powerCycleRequired", new i(this, paramR));
      this.d.put(paramR.c(), paramR);
    } 
  }
  
  private Map a(String paramString) {
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
  
  public void a(R paramR) {}
  
  public void b(R paramR) {
    cu.a().i(paramR.c());
    this.b.remove(paramR.c());
    if (this.b.isEmpty())
      cu.a().f("powerCycleRequired"); 
    this.e.remove(paramR.c());
    this.d.remove(paramR.c());
    aR.a().a(this);
  }
  
  public void c(R paramR) {
    try {
      d(paramR);
    } catch (a a) {
      D.a(a.getMessage(), (Exception)a, null);
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    R r = (R)this.d.get(paramString1);
    aM aM = r.c(paramString2);
    if (aM.i().equals("bits"))
      try {
        Map<String, String> map = a(r.c());
        String str1 = (String)map.get(paramString2);
        String str2 = aM.f(r.h());
        map.put(paramString2, str2);
        if (str1 != null && str2 != null && str1.equals(str2))
          return; 
      } catch (V.g g1) {
        Logger.getLogger(g.class.getName()).log(Level.INFO, "Strange, PowerCycleMonitor can't get last bit value.", (Throwable)g1);
      }  
    if (r != null && r.R()) {
      cu.a().a("powerCycleRequired", 1.0D);
      D.d(paramString2 + " changed and requires a PowerCycle");
      if (this.c == 0.0D)
        a(); 
      this.c = 1.0D;
    } 
  }
  
  private void a() {
    h h = new h(this);
    h.start();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aS/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */