package t;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;
import s.g;

class ComponentXKeyListener extends KeyAdapter {
  ComponentXKeyListener(r paramr) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    if (this.a.a((Component)this.a.b, g.b("Component X"))) {
      this.a.c().h((int)this.a.b.e());
      this.a.b.setForeground(UIManager.getColor("Label.foreground"));
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */