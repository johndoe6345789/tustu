package az;

import bH.D;
import bH.aa;
import f.b;
import f.f;

class r extends Thread {
  private String c = null;
  
  private boolean d = false;
  
  b a;
  
  r(o paramo, b paramb) {
    this.a = paramb;
  }
  
  public void run() {
    aa aa = null;
    if (o.a(this.b)) {
      aa = new aa();
      aa.a();
    } 
    try {
      this.c = f.k();
      if (this.c != null)
        this.a.a(this.c); 
    } catch (Exception exception) {}
    if (o.a(this.b))
      D.c("MAC Time: " + aa.d()); 
    this.d = true;
  }
  
  public boolean a() {
    return this.d;
  }
  
  public String b() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/az/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */