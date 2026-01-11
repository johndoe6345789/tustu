package L;

import ax.S;
import ax.ac;
import bH.D;

public class UnsupportedFeatureFunction extends ac {
  String a = "";
  
  boolean b = false;
  
  g(String paramString) {
    this.a = paramString;
  }
  
  public double a(S paramS) {
    if (!this.b) {
      D.d(this.a + " not supported in this edition.");
      this.b = true;
    } 
    return Double.NaN;
  }
  
  public double b(S paramS) {
    return a(paramS);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */