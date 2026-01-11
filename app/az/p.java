package az;

import bH.D;
import bH.J;
import bH.aa;
import f.b;
import f.f;

class p extends Thread {
  private String c = null;
  
  private boolean d = false;
  
  b a;
  
  p(o paramo, b paramb) {
    this.a = paramb;
  }
  
  public void run() {
    aa aa = null;
    if (o.a(this.b)) {
      aa = new aa();
      aa.a();
    } 
    if (J.a()) {
      this.c = f.c();
    } else if (J.d()) {
      this.c = f.e();
    } else if (J.b()) {
      this.c = f.g();
    } else {
      this.c = null;
    } 
    if (this.c != null && !this.c.isEmpty())
      this.a.i(this.c); 
    if (o.a(this.b))
      D.c("cpu Time: " + aa.d()); 
    this.d = true;
  }
  
  public boolean a() {
    return this.d;
  }
  
  public String b() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/az/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */