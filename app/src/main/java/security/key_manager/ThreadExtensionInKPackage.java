package K;

import bH.D;

class ThreadExtensionInKPackage extends Thread {
  boolean a = true;
  
  int b = 0;
  
  public void g(f paramf) {
    super("Timed Page read: " + f.a(paramf));
  }
  
  public synchronized void run() {
    while (this.a) {
      try {
        int i = (int)f.b(this.c).a();
        if (i > 0)
          wait(i); 
      } catch (Exception exception) {
        try {
          sleep(1000L);
        } catch (InterruptedException interruptedException) {}
        if (this.b >= 3) {
          D.b("TimedRefresh: Too many errors, quitting.");
          this.a = false;
        } 
        this.b++;
      } 
      f.c(this.c);
    } 
  }
  
  public void a() {
    this.a = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/K/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */