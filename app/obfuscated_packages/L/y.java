package L;

import ax.S;
import ax.ac;

public class y extends ac {
  public static long a = -1L;
  
  public double a(S paramS) {
    return (a >= 0L) ? ((System.currentTimeMillis() - a) / 1000.0D) : -1.0D;
  }
  
  public double b(S paramS) {
    return a(paramS);
  }
  
  public static void a() {
    a = System.currentTimeMillis();
  }
  
  public static void b() {
    a = -1L;
  }
  
  public static double c() {
    return (System.currentTimeMillis() - a) / 1000.0D;
  }
  
  public String toString() {
    return "getLogTime()";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */