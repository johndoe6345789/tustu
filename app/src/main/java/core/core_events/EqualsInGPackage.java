package G;

import java.io.Serializable;

public class EqualsInGPackage extends Q implements Serializable {
  private String a = null;

  private String b = "";

  public String a() {
    return this.a;
  }

  public void a(String paramString) {
    this.a = paramString;
  }

  public boolean equals(Object paramObject) {
    if (paramObject instanceof bI) {
      bI bI1 = (bI) paramObject;
      return (bI1.aL().equals(aL()) && bI1.a().equals(a()));
    }
    return super.equals(paramObject);
  }

  public String b() {
    return this.b;
  }

  public void b(String paramString) {
    this.b = paramString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
