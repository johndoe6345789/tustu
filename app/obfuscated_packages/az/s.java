package az;

import bH.D;
import bH.J;
import bH.aa;
import f.b;
import f.f;

class s extends Thread {
  private String c = null;
  
  private boolean d = false;
  
  b a;
  
  s(o paramo, b paramb) {
    this.a = paramb;
  }
  
  public void run() {
    aa aa = null;
    if (o.a(this.b)) {
      aa = new aa();
      aa.a();
    } 
    if (J.a())
      this.c = f.b(); 
    if (o.a(this.b))
      D.c("MBID Time: " + aa.d()); 
    this.d = true;
    if (this.c != null && this.c.length() > 5)
      this.a.c(this.c); 
  }
  
  public boolean a() {
    return this.d;
  }
  
  public String b() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/az/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */