package G;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationRegistry {
  private static h b = null;
  
  Map a = new HashMap<>();
  
  public static h a() {
    if (b == null)
      b = new h(); 
    return b;
  }
  
  public void a(aI paramaI) {
    this.a.put(paramaI.ac(), paramaI);
  }
  
  public aI a(String paramString) {
    return (aI)this.a.get(paramString);
  }
  
  public void b(String paramString) {
    this.a.remove(paramString);
  }
  
  public void b() {
    this.a.clear();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */