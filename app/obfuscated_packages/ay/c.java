package ay;

import G.cZ;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class c {
  private String b;
  
  private String c;
  
  Map a = new HashMap<>();
  
  public c(String paramString1, String paramString2) {
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public String a() {
    return this.b;
  }
  
  public void a(String paramString1, String paramString2) {
    this.a.put(paramString1, new d(this, paramString2));
  }
  
  public String a(String paramString) {
    cZ cZ = (cZ)this.a.get(paramString);
    return (cZ == null) ? null : cZ.a();
  }
  
  public Set b() {
    return this.a.keySet();
  }
  
  public String c() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ay/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */