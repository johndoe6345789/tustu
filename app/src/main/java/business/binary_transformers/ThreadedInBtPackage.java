package business.binary_transformers;

class ThreadedInBtPackage extends Thread {
  boolean a;

  boolean b;

  boolean c;

  long d;

  public void run() {
    try {
      while (this.a) {
        this.a = false;
        Thread.sleep(this.d);
      }
      this.e.D = null;
      if (this.b) {
        this.b = false;
        this.e.h();
      }
      if (this.c) {
        this.c = false;
        this.e.h();
      }
    } catch (InterruptedException interruptedException) {
      interruptedException.printStackTrace();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
