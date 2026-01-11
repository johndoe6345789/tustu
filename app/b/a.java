package b;

public class a {
  public static double a(double paramDouble1, double paramDouble2) {
    double d;
    if (Math.abs(paramDouble1) > Math.abs(paramDouble2)) {
      d = paramDouble2 / paramDouble1;
      d = Math.abs(paramDouble1) * Math.sqrt(1.0D + d * d);
    } else if (paramDouble2 != 0.0D) {
      d = paramDouble1 / paramDouble2;
      d = Math.abs(paramDouble2) * Math.sqrt(1.0D + d * d);
    } else {
      d = 0.0D;
    } 
    return d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/b/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */