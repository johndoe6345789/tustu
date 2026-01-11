package business.key_bindings;

class ThreadExtensionInBkPackage extends Thread {
  boolean a = true;
  
  c(a parama) {
    super("RTC Refresh");
    setDaemon(true);
  }
  
  public void run() {
    while (this.a)
      a.b(this.b); 
  }
  
  public void a() {
    this.a = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bk/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */