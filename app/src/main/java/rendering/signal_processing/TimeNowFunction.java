package L;

import ax.AbstractInAxPackage;
import ax.CloneableImplInAxPackage;

public class TimeNowFunction extends AbstractInAxPackage {
  private static long a = System.currentTimeMillis();

  private static boolean b = false;

  private static long c = 0L;

  public static long a() {
    return c;
  }

  public static void a(long paramLong) {
    c = paramLong;
  }

  public static boolean b() {
    return b;
  }

  public static void a(boolean paramBoolean) {
    b = paramBoolean;
  }

  public static long c() {
    return a;
  }

  public static void b(long paramLong) {
    a = paramLong;
  }

  public double a(CloneableImplInAxPackage paramS) {
    return b() ? ((a() - a) / 1000.0D) : ((System.currentTimeMillis() - a) / 1000.0D);
  }

  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }

  public String toString() {
    return "timeNow()";
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/X.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
