package ay;

import bH.D;
import java.util.ArrayList;
import java.util.List;

public class AyComponentIndia {
  private static i c = null;
  
  List a = new ArrayList();
  
  private boolean d = false;
  
  private boolean e = false;
  
  j b = null;
  
  public static i a() {
    if (c == null)
      c = new i(); 
    return c;
  }
  
  public boolean a(h paramh) {
    this.a.add(paramh);
    return this.d;
  }
  
  private void b(boolean paramBoolean) {
    for (h h : this.a)
      h.a(paramBoolean); 
  }
  
  public boolean b() {
    return (this.b != null && this.b.isAlive() && this.b.a);
  }
  
  public void c() {
    if (this.b == null || !this.b.isAlive()) {
      this.b = new j(this);
      this.b.start();
      D.d("Starting Internet Monitor");
    } 
  }
  
  public void d() {
    if (this.b != null) {
      this.b.a();
      this.b = null;
      D.d("Stopping Internet Monitor");
    } 
  }
  
  public void a(boolean paramBoolean) {
    this.e = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ay/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */