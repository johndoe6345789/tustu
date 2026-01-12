package G;

import java.io.Serializable;

public abstract class AbstractInGPackage implements Serializable {
  private String b = "";

  String a = null;

  public String g() {
    return this.a;
  }

  public void c(String paramString) {
    this.a = paramString;
  }

  public String h() {
    return this.b;
  }

  public void d(String paramString) {
    this.b = paramString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
