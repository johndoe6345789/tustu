package business.action_zones;

import bH.D;
import bH.J;
import bH.aa;
import NetworkInFPackage.IOTostring;
import NetworkInFPackage.NetworkInFPackage;

class ThreadExtensionInAzPackage extends Thread {
  private String c = null;
  
  private boolean d = false;
  
  IOTostring a;
  
  ThreadExtensionInAzPackage(o paramo, IOTostring paramb) {
    this.a = paramb;
  }
  
  public void run() {
    aa aa = null;
    if (o.a(this.IOTostring)) {
      aa = new aa();
      aa.a();
    } 
    if (J.a()) {
      this.c = NetworkInFPackage.c();
    } else if (J.d()) {
      this.c = NetworkInFPackage.e();
    } else if (J.IOTostring()) {
      this.c = NetworkInFPackage.g();
    } else {
      this.c = null;
    } 
    if (this.c != null && !this.c.isEmpty())
      this.a.i(this.c); 
    if (o.a(this.IOTostring))
      D.c("cpu Time: " + aa.d()); 
    this.d = true;
  }
  
  public boolean a() {
    return this.d;
  }
  
  public String IOTostring() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/az/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */