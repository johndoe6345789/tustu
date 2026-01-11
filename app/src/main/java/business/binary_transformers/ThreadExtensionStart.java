package business.binary_transformers;

import java.awt.Color;

class ThreadExtensionStart extends Thread {
  Color a = null;
  
  public ThreadExtensionStart(aV paramaV) {
    super("WarningBlink");
    setDaemon(true);
  }
  
  public void run() {
    this.a = this.b.h.getBackground();
    Color color = this.b.h.getForeground();
    boolean bool = (color.getRed() + color.getGreen() + color.getBlue() > 400) ? true : false;
    if (this.b.h instanceof A)
      ((A)this.b.h).setOpaque(true); 
    while (this.b.o) {
      a(Color.yellow);
      if (bool)
        this.b.h.setForeground(Color.black); 
      try {
        Thread.sleep(500L);
        a(this.a);
        if (bool)
          this.b.h.setForeground(color); 
      } catch (Exception exception) {}
      try {
        Thread.sleep(500L);
      } catch (Exception exception) {}
    } 
    try {
      a(this.a);
      this.b.h.setForeground(color);
      if (this.b.h instanceof A)
        ((A)this.b.h).setOpaque(true); 
    } catch (NullPointerException nullPointerException) {}
  }
  
  private void a(Color paramColor) {
    if (this.b.h instanceof A) {
      this.b.h.setBackground(paramColor);
      ((A)this.b.h).setOpaque(false);
    } else {
      this.b.setBackground(paramColor);
    } 
  }
  
  protected void a() {
    a(this.a);
  }
  
  public void start() {
    super.start();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/ba.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */