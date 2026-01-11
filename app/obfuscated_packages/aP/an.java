package aP;

import z.ZComponentDelta;

class an {
  private ZComponentDelta b = null;
  
  private String c = null;
  
  an(ad paramad, ZComponentDelta paramd) {
    this.b = paramd;
  }
  
  public String toString() {
    return (b() != null) ? b() : ((a() == null) ? "INVALID" : a().b());
  }
  
  public ZComponentDelta a() {
    return this.b;
  }
  
  public String b() {
    return this.c;
  }
  
  public void a(String paramString) {
    this.c = paramString;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof an) {
      an an1 = (an)paramObject;
      return this.b.equals(an1.a());
    } 
    return (paramObject instanceof String) ? this.b.a().equals(paramObject) : super.equals(paramObject);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */