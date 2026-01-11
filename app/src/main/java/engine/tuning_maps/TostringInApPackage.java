package aP;

class TostringInApPackage {
  private String b = null;
  
  private String c = null;
  
  at(aq paramaq) {}
  
  public String toString() {
    return a();
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof String)
      return paramObject.equals(this.b); 
    if (paramObject instanceof at) {
      at at1 = (at)paramObject;
      return at1.b.equals(this.b);
    } 
    return super.equals(paramObject);
  }
  
  public String a() {
    return this.c;
  }
  
  public void a(String paramString) {
    this.c = paramString;
  }
  
  public String b() {
    return this.b;
  }
  
  public void b(String paramString) {
    this.b = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/at.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */