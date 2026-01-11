package com.efiAnalytics.ui;

class BinTablePaintThrottle extends Thread {
  long a = 0L;
  
  long b = Math.round(1000.0D / BinTableView.c(this.d));
  
  boolean c = false;
  
  public BinTablePaintThrottle(BinTableView paramBinTableView) {
    super("BinTablePaintThrottle");
    setDaemon(true);
    start();
  }
  
  public void a() {
    if (System.currentTimeMillis() - this.a > this.b) {
      b();
    } else {
      this.c = true;
    } 
  }
  
  private void b() {
    this.a = System.currentTimeMillis();
    this.d.repaint();
    this.c = false;
  }
  
  public void run() {
    try {
      Thread.sleep(this.b);
      if (this.c)
        b(); 
    } catch (Exception exception) {
      System.out.println("PaintThrottle Thread died");
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */