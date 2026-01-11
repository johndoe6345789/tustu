package ao;

public class fn {
  private String b = null;
  
  private String c = null;
  
  public fn(eK parameK, String paramString1, String paramString2) {
    a(paramString1);
    b(paramString2);
  }
  
  public String toString() {
    return (this.b != null) ? this.b : this.c;
  }
  
  public void a(String paramString) {
    this.b = paramString;
  }
  
  public String a() {
    return this.c;
  }
  
  public void b(String paramString) {
    this.c = paramString;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof fn) {
      fn fn1 = (fn)paramObject;
      return fn1.a().equals(this.c);
    } 
    return (paramObject instanceof String) ? paramObject.equals(this.c) : super.equals(paramObject);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */