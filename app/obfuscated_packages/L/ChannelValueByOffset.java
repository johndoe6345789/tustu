package L;

import G.R;
import G.T;
import G.aH;
import G.aI;
import G.cq;
import G.cu;
import V.ExceptionInVPackage;
import ax.CloneableImplInAxPackage;
import ax.ab;
import ax.ac;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChannelValueByOffset extends ac implements cq {
  aI ExceptionInVPackage;
  
  ab b;
  
  int c = -1;
  
  ab d = null;
  
  int e = -1;
  
  aH f = null;
  
  double g = Double.NaN;
  
  public s(ab paramab1, ab paramab2) {
    this.d = paramab1;
    this.b = paramab2;
  }
  
  public s(aI paramaI, ab paramab) {
    this.ExceptionInVPackage = paramaI;
    this.b = paramab;
  }
  
  public double ExceptionInVPackage(CloneableImplInAxPackage paramS) {
    double d = (this.d != null) ? this.d.b(paramS) : -1.0D;
    if (this.d != null && this.e != d) {
      String[] arrayOfString = T.ExceptionInVPackage().d();
      for (String str : arrayOfString) {
        R r = T.ExceptionInVPackage().c(str);
        if (r.O().x() == d) {
          this.ExceptionInVPackage = (aI)r;
          this.e = (int)d;
          break;
        } 
      } 
      this.c = -1;
    } 
    if (this.ExceptionInVPackage == null)
      return Double.NaN; 
    int i = (int)this.b.b(paramS);
    if (this.c == -1 || i != this.c || this.f == null) {
      cu.ExceptionInVPackage().ExceptionInVPackage(this);
      Iterator<aH> iterator = this.ExceptionInVPackage.K().q();
      while (iterator.hasNext()) {
        aH aH1 = iterator.next();
        if (aH1.b().equals("scalar") && aH1.ExceptionInVPackage() == i) {
          this.f = aH1;
          this.c = i;
          this.g = this.f.o();
          try {
            cu.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionInVPackage.c(), this.f.aL(), this);
            return aH1.o();
          } catch (ExceptionInVPackage ExceptionInVPackage) {
            Logger.getLogger(s.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
          } 
          return this.g;
        } 
      } 
    } 
    return this.g;
  }
  
  public double b(CloneableImplInAxPackage paramS) {
    return ExceptionInVPackage(paramS);
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    this.g = paramDouble;
  }
  
  public String toString() {
    return "getChannelByOffset( " + this.b.toString() + " )";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */