package L;

import ax.CloneableImplInAxPackage;
import ax.AbstractInAxPackage;
import bH.D;

public class UnsupportedFeatureFunction extends AbstractInAxPackage {
  String a = "";
  
  boolean b = false;
  
  g(String paramString) {
    this.a = paramString;
  }
  
  public double a(CloneableImplInAxPackage paramS) {
    if (!this.b) {
      D.d(this.a + " not supported in this edition.");
      this.b = true;
    } 
    return Double.NaN;
  }
  
  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */