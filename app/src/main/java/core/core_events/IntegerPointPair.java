package G;

import java.io.Serializable;

public class IntegerPointPair implements Serializable {
  public dj a;

  public dj b;

  public A(dj paramdj1, dj paramdj2) {
    this.a = paramdj1;
    this.b = paramdj2;
  }

  public A(int paramInt1, int paramInt2) {
    this.a = new B(paramInt1);
    this.b = new B(paramInt2);
  }

  public int a() {
    return (int) Math.round(this.a.a());
  }

  public int b() {
    return (int) Math.round(this.b.a());
  }

  public dj c() {
    return this.a;
  }

  public dj d() {
    return this.b;
  }

  public boolean equals(Object paramObject) {
    if (paramObject instanceof A) {
      A a = (A) paramObject;
      return (a.b() == b() && a.a() == a.a());
    }
    return super.equals(paramObject);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
