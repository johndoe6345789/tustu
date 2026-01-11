package be;

public class BeInterfaceRomeo {
  public static int a = 0;
  
  public static int b = 1;
  
  public static int c = 2;
  
  private int d = a;
  
  private String e = null;
  
  public boolean a() {
    return ((this.d & b) != 0);
  }
  
  public void b() {
    this.d = b;
  }
  
  public void c() {
    this.d = c;
  }
  
  public String d() {
    return this.e;
  }
  
  public void a(String paramString) {
    this.e = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/R.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */