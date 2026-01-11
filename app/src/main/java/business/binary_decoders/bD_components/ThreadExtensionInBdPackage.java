package business.binary_decoders.bD_components;

import java.util.List;

class ThreadExtensionInBdPackage extends Thread {
  List a = null;
  
  ThreadExtensionInBdPackage(r paramr, List paramList) {
    super("Download");
    setDaemon(true);
    this.a = paramList;
  }
  
  public void run() {
    try {
      this.b.a.c();
      r.b(this.b, this.a);
    } finally {
      this.b.a.d();
      this.b.setEnabled(true);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */