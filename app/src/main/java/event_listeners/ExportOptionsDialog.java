package ao;

import W.j;
import java.awt.Rectangle;

class aW {
  private Rectangle c = null;
  
  private j d = null;
  
  public static String a = "showColumnMenu";
  
  public static String b = "showXAxisMenu";
  
  private String e = a;
  
  public boolean a(int paramInt1, int paramInt2) {
    return (this.c != null && this.d != null) ? this.c.contains(paramInt1, paramInt2) : false;
  }
  
  Rectangle a() {
    return this.c;
  }
  
  void a(Rectangle paramRectangle) {
    this.c = paramRectangle;
  }
  
  j b() {
    return this.d;
  }
  
  void a(j paramj) {
    this.d = paramj;
  }
  
  public String c() {
    return this.e;
  }
  
  public void a(String paramString) {
    this.e = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/aW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */