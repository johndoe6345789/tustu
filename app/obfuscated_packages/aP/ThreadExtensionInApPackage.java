package aP;

class ThreadExtensionInApPackage extends Thread {
  ac(ab paramab) {
    super("PortScan");
    setDaemon(true);
  }
  
  public void run() {
    this.a.a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */