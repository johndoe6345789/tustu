package I;

import G.GInterfaceDj;

class Equals {
  private String b;
  
  private String c;
  
  private GInterfaceDj d;
  
  private double e = Double.NaN;
  
  l(k paramk, String paramString1, String paramString2, GInterfaceDj paramdj) {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramdj;
  }
  
  public String a() {
    return this.b;
  }
  
  public String b() {
    return this.c;
  }
  
  public GInterfaceDj c() {
    return this.d;
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof String) ? paramObject.equals(this.c) : super.equals(paramObject);
  }
  
  public double d() {
    return this.e;
  }
  
  public void a(double paramDouble) {
    this.e = paramDouble;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/I/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */