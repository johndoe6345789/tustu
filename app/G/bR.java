package G;

import V.g;
import ax.U;
import bH.D;
import bH.X;
import java.io.Serializable;
import java.util.HashMap;

public class bR implements dj, Serializable {
  private String b = null;
  
  cZ a = null;
  
  private HashMap c = null;
  
  public bR(aI paramaI, String paramString) {
    String str = paramaI.c();
    this.a = new bS(this, str);
    this.b = paramString;
  }
  
  public bR(cZ paramcZ, String paramString) {
    this.a = paramcZ;
    this.b = paramString;
    if (paramString.equals("fuelLoadRes"))
      D.c("break 1209873"); 
  }
  
  public double a() {
    R r = T.a().c(this.a.a());
    if (r == null || this.b == null)
      return Double.NaN; 
    try {
      return i.a(r, this.b);
    } catch (g g) {
      e();
      return Double.NaN;
    } 
  }
  
  private void e() {
    R r = T.a().c(this.a.a());
    if (r != null) {
      String[] arrayOfString;
      try {
        arrayOfString = i.f(this.b, r);
      } catch (U u) {
        D.b("Invalid expression: " + this.b);
        this.b = null;
        return;
      } 
      for (String str : arrayOfString) {
        try {
          double d = i.a(r, str);
        } catch (g g) {
          D.b("Disabling expression evaluation, Variable not found '" + str + "' in expression: " + this.b);
          this.b = null;
        } 
      } 
    } 
  }
  
  public String[] b() {
    R r = T.a().c(this.a.a());
    return (r == null) ? new String[0] : i.h(this.b, r);
  }
  
  public String c() {
    return this.b;
  }
  
  public String toString() {
    return this.b;
  }
  
  public double a(int paramInt) {
    R r = T.a().c(this.a.a());
    if (r == null)
      return Double.NaN; 
    String str = this.b;
    if (this.c != null || str.contains("%INDEX%")) {
      str = (String)d().get(Integer.valueOf(paramInt));
      if (str == null) {
        str = X.b(this.b, "%INDEX%", Integer.toString(paramInt));
        d().put(Integer.valueOf(paramInt), str);
      } 
    } 
    try {
      return i.a(r, str);
    } catch (g g) {
      D.a("Unable to resolve Expression:" + str + "\n" + g.getMessage());
      return Double.NaN;
    } 
  }
  
  public HashMap d() {
    if (this.c == null)
      this.c = new HashMap<>(); 
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */