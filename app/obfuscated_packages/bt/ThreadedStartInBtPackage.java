package bt;

import java.awt.Color;

class ThreadedStartInBtPackage extends Thread {
  bt(bq parambq) {
    super("SliderWarnBlink");
  }
  
  public void run() {
    Color color = this.a.c.getBackground();
    while (this.a.f && this.a.isVisible()) {
      this.a.c.setBackground(Color.yellow);
      try {
        Thread.sleep(500L);
      } catch (Exception exception) {}
      this.a.c.setBackground(color);
      try {
        Thread.sleep(500L);
      } catch (Exception exception) {}
    } 
    this.a.c.setBackground(color);
  }
  
  public void start() {
    super.start();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */