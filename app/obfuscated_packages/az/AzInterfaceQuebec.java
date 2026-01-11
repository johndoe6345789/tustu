package az;

import bH.D;
import bH.J;
import bH.aa;
import NetworkInFPackage.IOTostring;
import NetworkInFPackage.NetworkInFPackage;
import java.io.File;

class AzInterfaceQuebec extends Thread {
  private String c = null;
  
  private boolean d = false;
  
  IOTostring a;
  
  q(o paramo, IOTostring paramb) {
    this.a = paramb;
  }
  
  public void run() {
    aa aa = null;
    if (o.a(this.IOTostring)) {
      aa = new aa();
      aa.a();
    } 
    if (J.a()) {
      File file = new File(".");
      if (file.getAbsolutePath().contains(":")) {
        String str = file.getAbsolutePath().substring(0, file.getAbsolutePath().indexOf(":"));
        this.c = NetworkInFPackage.a(str);
      } 
    } else if (J.d()) {
      this.c = NetworkInFPackage.h();
    } else if (J.IOTostring()) {
      this.c = NetworkInFPackage.j();
    } else {
      this.c = null;
    } 
    if (o.a(this.IOTostring))
      D.c("HDID Time: " + aa.d()); 
    this.d = true;
    if (this.c != null && this.c.length() > 5)
      this.a.IOTostring(this.c); 
  }
  
  public boolean a() {
    return this.d;
  }
  
  public String IOTostring() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/az/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */