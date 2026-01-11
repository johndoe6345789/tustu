package G;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;

public class bw extends Q implements Serializable {
  private String b = "";
  
  HashMap a = new HashMap<>();
  
  public String a() {
    return this.b;
  }
  
  public void a(String paramString, double paramDouble) {
    this.a.put(paramString, Double.valueOf(paramDouble));
  }
  
  public Iterator b() {
    return this.a.keySet().iterator();
  }
  
  public double a(String paramString) {
    return ((Double)this.a.get(paramString)).doubleValue();
  }
  
  public void b(String paramString) {
    this.b = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */