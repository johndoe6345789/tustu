package L;

import ax.CloneableImplInAxPackage;
import ax.ac;

public class SystemTimeFunction extends ac {
  public double a(CloneableImplInAxPackage paramS) {
    return System.currentTimeMillis() / 1000.0D;
  }
  
  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }
  
  public String toString() {
    return "systemTime()";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/R.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */