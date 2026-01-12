package ao;

class bj extends Thread {
  bj(aX paramaX) {}

  public void run() {
    while (aX.a(this.a).r() == null) {
      try {
        Thread.currentThread();
        Thread.sleep(5000L);
      } catch (InterruptedException interruptedException) {
      }
      this.a.o();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
