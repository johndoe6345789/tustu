package bt;

class bT extends Thread {
  boolean a = true;
  
  boolean b = false;
  
  boolean c = false;
  
  boolean d = false;
  
  long e = 150L;
  
  bT(bS parambS) {
    super("zValThrottle");
    setDaemon(true);
  }
  
  public void run() {
    try {
      while (this.a) {
        this.a = false;
        Thread.sleep(this.e);
      } 
      this.f.f = null;
      if (this.b) {
        this.b = false;
        bS.a(this.f);
      } 
      if (this.c) {
        this.c = false;
        bS.b(this.f);
      } 
      if (this.d) {
        this.d = false;
        bS.c(this.f);
      } 
    } catch (InterruptedException interruptedException) {
      interruptedException.printStackTrace();
    } 
  }
  
  public void a() {
    this.b = true;
    d();
  }
  
  public void b() {
    this.c = true;
    d();
  }
  
  public void c() {
    this.d = true;
    d();
  }
  
  private void d() {
    this.a = true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */