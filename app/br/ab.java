package br;

class ab extends Thread {
  boolean a = true;
  
  public ab(aa paramaa) {
    super("Flasher");
    setDaemon(true);
  }
  
  public void run() {
    while (this.a) {
      this.b.a = !this.b.a;
      this.b.setText(this.b.a());
      this.b.repaint();
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {}
    } 
    this.b.a = false;
    this.b.repaint();
  }
  
  public void a() {
    this.a = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */