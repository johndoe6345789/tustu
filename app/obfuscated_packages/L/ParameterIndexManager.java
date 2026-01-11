package L;

import G.aM;
import java.util.HashMap;

public class ParameterIndexManager {
  private static l c = null;
  
  HashMap a = new HashMap<>();
  
  int b = 0;
  
  public static l a() {
    if (c == null)
      c = new l(); 
    return c;
  }
  
  public void b() {
    this.a.clear();
    this.b = 0;
  }
  
  public int a(aM paramaM) {
    this.a.put(Integer.valueOf(this.b), paramaM);
    return this.b++;
  }
  
  public aM a(int paramInt) {
    return (aM)this.a.get(Integer.valueOf(paramInt));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */