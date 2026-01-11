package G;

import java.util.HashMap;
import java.util.Iterator;

public class CommsProfileGroup extends Q {
  private HashMap a = new HashMap<>();
  
  private String b = "";
  
  private String c = "";
  
  public r a(String paramString) {
    return (r)this.a.get(paramString);
  }
  
  public void a(r paramr) {
    this.a.put(paramr.aL(), paramr);
  }
  
  public Iterator a() {
    return this.a.values().iterator();
  }
  
  public r b() {
    r r = null;
    Iterator<r> iterator = a();
    while (iterator.hasNext()) {
      r r1 = iterator.next();
      if (r1.b())
        return r1; 
      if (r == null)
        r = r1; 
    } 
    return r;
  }
  
  public String c() {
    return this.b;
  }
  
  public void b(String paramString) {
    this.b = paramString;
  }
  
  public String d() {
    return this.c;
  }
  
  public void c(String paramString) {
    this.c = paramString;
  }
  
  public boolean d(String paramString) {
    return this.a.containsKey(paramString);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof s) {
      s s1 = (s)paramObject;
      return s1.c().equals(c());
    } 
    return super.equals(paramObject);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */