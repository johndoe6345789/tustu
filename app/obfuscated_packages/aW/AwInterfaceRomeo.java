package aW;

import java.util.HashMap;

public class AwInterfaceRomeo {
  private static r b = null;
  
  HashMap a = new HashMap<>();
  
  public static r a() {
    if (b == null)
      b = new r(); 
    return b;
  }
  
  public boolean a(String paramString) {
    return this.a.containsKey(paramString);
  }
  
  public void a(a parama, String paramString) {
    q q = (q)this.a.get(paramString);
    if (q != null)
      q.a(parama, paramString); 
  }
  
  public void a(String paramString, q paramq) {
    this.a.put(paramString, paramq);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aW/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */