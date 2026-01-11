package aj;

class ThreadExtensionInAjPackage extends Thread {
  boolean a = true;
  
  i(d paramd) {
    super("ReadTimer");
    setDaemon(true);
  }
  
  public void run() {
    while (this.a) {
      long l = System.currentTimeMillis();
      this.b.e();
      try {
        long l1 = d.a(this.b) - System.currentTimeMillis() - l;
        if (l1 > 0L)
          Thread.sleep(l1); 
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      } 
    } 
    d.b(this.b);
  }
  
  public void a() {
    this.a = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aj/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */