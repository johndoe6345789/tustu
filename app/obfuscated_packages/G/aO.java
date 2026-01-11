package G;

import V.g;
import V.j;
import ax.U;
import bH.D;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class aO implements aN, cq {
  private aM b;
  
  private R c;
  
  private String d;
  
  private aP e = null;
  
  HashMap a = new HashMap<>();
  
  public aO(aM paramaM, R paramR, String paramString) {
    this.c = paramR;
    this.b = paramaM;
    this.d = paramString;
  }
  
  public void a(String paramString1, String paramString2) {
    if (this.e == null) {
      this.e = new aP(this);
      this.e.start();
    } 
  }
  
  public String a() {
    return this.d;
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    Double double_ = (Double)this.a.get(paramString);
    if (double_ == null || double_.doubleValue() != paramDouble)
      try {
        double d = i.a(this.d, this.c);
        this.b.a(this.c.h(), d);
        this.a.put(paramString, Double.valueOf(paramDouble));
      } catch (U u) {
        D.c("unable to evaluate expression: " + this.d + ", Error: " + u.getLocalizedMessage());
      } catch (g g) {
        Logger.getLogger(aO.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      } catch (j j) {
        D.c("unable to evaluate expression: " + this.d + ", Error: " + j.getLocalizedMessage());
      }  
  }
  
  private void b() {
    try {
      double d = i.a(this.d, this.c);
      this.b.a(this.c.h(), d);
    } catch (U u) {
      D.c("unable to evaluate expression: " + this.d + ", Error: " + u.getLocalizedMessage());
    } catch (g g) {
      Logger.getLogger(aO.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
    } catch (j j) {
      D.c("unable to evaluate expression: " + this.d + ", Error: " + j.getLocalizedMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */