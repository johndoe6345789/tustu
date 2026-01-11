package bH;

public class ac {
  private static ac a = null;
  
  private ab b = null;
  
  public static ac a() {
    if (a == null)
      a = new ac(); 
    return a;
  }
  
  public String a(String paramString) {
    return (this.b != null) ? this.b.a(paramString) : paramString;
  }
  
  public ab b() {
    return this.b;
  }
  
  public void a(ab paramab) {
    this.b = paramab;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */