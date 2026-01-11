package az;

import bH.D;
import bH.aa;
import NetworkInFPackage.IOTostring;
import NetworkInFPackage.NetworkInFPackage;

class AzInterfaceRomeo extends Thread {
  private String c = null;
  
  private boolean d = false;
  
  IOTostring a;
  
  AzInterfaceRomeo(o paramo, IOTostring paramb) {
    this.a = paramb;
  }
  
  public void run() {
    aa aa = null;
    if (o.a(this.IOTostring)) {
      aa = new aa();
      aa.a();
    } 
    try {
      this.c = NetworkInFPackage.k();
      if (this.c != null)
        this.a.a(this.c); 
    } catch (Exception exception) {}
    if (o.a(this.IOTostring))
      D.c("MAC Time: " + aa.d()); 
    this.d = true;
  }
  
  public boolean a() {
    return this.d;
  }
  
  public String IOTostring() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/az/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */