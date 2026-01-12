package ae;

import java.util.ArrayList;
import java.util.List;

public class AeInterfaceDelta {
  public static int a = 0;

  public static int b = 1;

  public static int c = 2;

  private int d = a;

  private List e = new ArrayList();

  private String f = null;

  private boolean g = false;

  public int a() {
    return this.d;
  }

  public void a(int paramInt) {
    this.d = paramInt;
  }

  public String b() {
    return this.f;
  }

  public void a(String paramString) {
    this.f = paramString;
  }

  public boolean c() {
    return this.g;
  }

  public void a(boolean paramBoolean) {
    this.g = paramBoolean;
  }

  public int d() {
    return this.e.size();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ae/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
