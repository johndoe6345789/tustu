package aI;

import G.R;
import G.S;
import G.T;
import G.cq;
import G.cu;
import V.a;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class b implements S, cq {
  private static HashMap c = new HashMap<>();
  
  private R d = null;
  
  int a = 1;
  
  int b = 0;
  
  private b(R paramR) {
    this.d = paramR;
    b();
  }
  
  private void b() {
    try {
      if (this.d.g("rpm") != null)
        cu.a().a(this.d.c(), "rpm", this); 
      if (this.d.g("engine") != null)
        cu.a().a(this.d.c(), "engine", this); 
      T.a().a(this);
    } catch (a a) {
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
  }
  
  public static b d(R paramR) {
    b b1 = (b)c.get(paramR.c());
    if (b1 == null) {
      b1 = new b(paramR);
      c.put(paramR.c(), b1);
    } 
    return b1;
  }
  
  private void c() {
    cu.a().a(this);
    c.remove(this.d.c());
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (paramString.equals("rpm"))
      this.b = (int)paramDouble; 
    if (paramString.equals("engine"))
      this.a = (int)paramDouble; 
  }
  
  public void a(R paramR) {}
  
  public void b(R paramR) {
    if (paramR.equals(this.d))
      c(); 
  }
  
  public void c(R paramR) {}
  
  public boolean a() {
    return (this.b > 0);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */