package L;

import G.R;
import G.T;
import G.aH;
import G.aI;
import ax.S;
import ax.U;
import ax.ab;
import ax.ac;
import java.util.Iterator;

public class w extends ac {
  aI a;
  
  ab b;
  
  int c = -1;
  
  ab d = null;
  
  int e = -1;
  
  aH f = null;
  
  double g = Double.NaN;
  
  public w(ab paramab1, ab paramab2) {
    this.d = paramab1;
    this.b = paramab2;
  }
  
  public w(aI paramaI, ab paramab) {
    this.a = paramaI;
    this.b = paramab;
  }
  
  public double a(S paramS) {
    double d = (this.d != null) ? this.d.b(paramS) : -1.0D;
    if (this.d != null && this.e != d) {
      String[] arrayOfString = T.a().d();
      for (String str : arrayOfString) {
        R r = T.a().c(str);
        if (r.O().x() == d) {
          this.a = (aI)r;
          this.e = (int)d;
          break;
        } 
      } 
      this.c = -1;
    } 
    if (this.a == null)
      return Double.NaN; 
    int i = (int)this.b.b(paramS);
    if (this.c == -1 || i != this.c || this.f == null) {
      Iterator<aH> iterator = this.a.K().q();
      while (iterator.hasNext()) {
        aH aH1 = iterator.next();
        if (aH1.b().equals("scalar") && aH1.a() == i) {
          this.f = aH1;
          this.c = i;
          break;
        } 
      } 
      if (this.f == null && i >= 0)
        throw new U("No OutputChannel found for offset: " + i); 
    } 
    return (this.f != null) ? this.f.h() : 1.0D;
  }
  
  public double b(S paramS) {
    return a(paramS);
  }
  
  public String toString() {
    return "getChannelScaleByOffset( " + this.b.toString() + " )";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */