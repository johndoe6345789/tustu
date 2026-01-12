package business.byte_serializers;

class BsInterfaceXray extends Thread {
  boolean a = true;

  public BsInterfaceXray(w paramw) {
    super("WueFlasher");
    setDaemon(true);
  }

  public void run() {
    while (this.a) {
      this.b.a = !this.b.a;
      this.b.setText(this.b.a());
      this.b.repaint();
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {
      }
    }
    this.b.a = false;
    this.b.repaint();
  }

  public void a() {
    this.a = false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
