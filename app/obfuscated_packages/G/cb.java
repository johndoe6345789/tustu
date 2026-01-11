package G;

import java.util.HashMap;

public class cb {
  private static cb b = null;
  
  HashMap a = new HashMap<>();
  
  public static cb a() {
    if (b == null)
      b = new cb(); 
    return b;
  }
  
  public void a(String paramString, int paramInt) {
    this.a.put(paramString, Integer.valueOf(paramInt));
  }
  
  public Integer a(String paramString) {
    return (Integer)this.a.get(paramString);
  }
  
  public boolean b(String paramString) {
    return this.a.containsKey(paramString);
  }
  
  public void b() {
    this.a.clear();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */