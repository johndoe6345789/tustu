package W;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class DataLogReader {
  Map c = new HashMap<>();

  public static boolean d = true;

  public abstract String i();

  public abstract boolean a(String paramString);

  public abstract void a();

  public abstract Iterator b();

  public abstract float[] c();

  public abstract long d();

  public abstract boolean e();

  public abstract boolean f();

  public abstract HashMap g();

  public abstract String h();

  public boolean j() {
    return false;
  }

  public Z a(int paramInt) {
    return (Z) this.c.get(Integer.valueOf(paramInt));
  }

  protected Z b(int paramInt) {
    Z z = a(paramInt);
    if (z == null) {
      z = new Z();
      this.c.put(Integer.valueOf(paramInt), z);
    }
    return z;
  }

  public boolean k() {
    return d;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/V.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
