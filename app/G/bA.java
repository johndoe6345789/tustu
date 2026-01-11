package G;

import V.g;
import java.io.Serializable;

public abstract class bA extends Q implements Serializable {
  private db a = null;
  
  private String b = null;
  
  public String l() {
    try {
      return (this.a == null) ? null : this.a.a();
    } catch (g g) {
      return "error";
    } 
  }
  
  public void b(db paramdb) {
    this.a = paramdb;
  }
  
  public void e(String paramString) {
    this.a = new c(paramString);
  }
  
  public String m() {
    return this.b;
  }
  
  public void f(String paramString) {
    this.b = paramString;
  }
  
  public abstract String b();
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */