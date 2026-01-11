package S;

import G.aF;
import G.cq;
import G.q;
import bH.D;
import java.util.Collection;
import java.util.HashMap;

public class e implements aF, cq {
  HashMap a = new HashMap<>();
  
  private static e c = null;
  
  f b = null;
  
  private e() {
    this.b = new f(this);
    this.b.start();
  }
  
  public static e a() {
    if (c == null)
      c = new e(); 
    return c;
  }
  
  public Collection a(String paramString) {
    return c(paramString).values();
  }
  
  public void a(String paramString1, String paramString2) {
    HashMap hashMap = c(paramString1);
    a a = (a)hashMap.get(paramString2);
    if (a != null) {
      a.a(false);
      try {
        a.d(paramString1);
      } catch (q q) {
        D.a("ECU Config not loaded?? " + paramString1);
      } 
      hashMap.remove(paramString2);
      D.c("Deactivating Event Trigger: " + a.a());
    } 
  }
  
  public void a(String paramString, a parama) {
    a(paramString, parama.a());
    HashMap<String, a> hashMap = c(paramString);
    parama.c(paramString);
    hashMap.put(parama.a(), parama);
    parama.a(true);
    D.c("Activating Event Trigger: " + parama.a());
  }
  
  public void b(String paramString) {
    HashMap hashMap = c(paramString);
    for (a a : hashMap.values()) {
      try {
        a.d(paramString);
      } catch (q q) {
        D.b("Unsubscribe EventTrigger failed, could not find config: " + paramString);
      } 
    } 
    this.a.remove(paramString);
  }
  
  private HashMap c(String paramString) {
    HashMap<Object, Object> hashMap = (HashMap)this.a.get(paramString);
    if (hashMap == null) {
      hashMap = new HashMap<>();
      this.a.put(paramString, hashMap);
    } 
    return hashMap;
  }
  
  public void a(String paramString, byte[] paramArrayOfbyte) {
    HashMap hashMap = c(paramString);
    for (a a : hashMap.values()) {
      if (a.b()) {
        a.b(paramString, paramArrayOfbyte);
        continue;
      } 
      a.a(paramString, paramArrayOfbyte);
    } 
    this.b.a();
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    b();
  }
  
  public void b() {
    for (String str : this.a.keySet()) {
      HashMap hashMap = c(str);
      for (a a : hashMap.values()) {
        if (a.b()) {
          a.b(str);
          continue;
        } 
        a.a(str);
      } 
    } 
    this.b.a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/S/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */