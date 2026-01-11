package az;

import bH.D;
import bH.J;
import bH.aa;
import f.b;
import f.f;
import java.io.File;

class q extends Thread {
  private String c = null;
  
  private boolean d = false;
  
  b a;
  
  q(o paramo, b paramb) {
    this.a = paramb;
  }
  
  public void run() {
    aa aa = null;
    if (o.a(this.b)) {
      aa = new aa();
      aa.a();
    } 
    if (J.a()) {
      File file = new File(".");
      if (file.getAbsolutePath().contains(":")) {
        String str = file.getAbsolutePath().substring(0, file.getAbsolutePath().indexOf(":"));
        this.c = f.a(str);
      } 
    } else if (J.d()) {
      this.c = f.h();
    } else if (J.b()) {
      this.c = f.j();
    } else {
      this.c = null;
    } 
    if (o.a(this.b))
      D.c("HDID Time: " + aa.d()); 
    this.d = true;
    if (this.c != null && this.c.length() > 5)
      this.a.b(this.c); 
  }
  
  public boolean a() {
    return this.d;
  }
  
  public String b() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/az/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */