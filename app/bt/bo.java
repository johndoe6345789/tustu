package bt;

import java.awt.Color;
import java.awt.Component;
import javax.swing.UIManager;

class bo extends Thread {
  Color a = null;
  
  public bo(bl parambl) {
    super("WarningBlink");
    setDaemon(true);
  }
  
  public void run() {
    this.a = UIManager.getColor("Label.background");
    Color color = UIManager.getColor("Label.foreground");
    boolean bool = (color.getRed() + color.getGreen() + color.getBlue() > 400) ? true : false;
    while (this.b.g) {
      a(Color.yellow);
      bl.a(this.b).setBackground(Color.YELLOW);
      if (bool)
        b(Color.BLACK); 
      try {
        Thread.sleep(500L);
        a(this.a);
        if (bool)
          b(color); 
      } catch (Exception exception) {}
      try {
        Thread.sleep(500L);
      } catch (Exception exception) {}
    } 
    try {
      a(this.a);
      b(color);
    } catch (NullPointerException nullPointerException) {}
  }
  
  private void a(Color paramColor) {
    bl.a(this.b).setBackground(paramColor);
  }
  
  protected void a() {
    a(this.a);
  }
  
  private void b(Color paramColor) {
    for (Component component : bl.a(this.b).getComponents())
      component.setForeground(paramColor); 
  }
  
  public void start() {
    super.start();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */