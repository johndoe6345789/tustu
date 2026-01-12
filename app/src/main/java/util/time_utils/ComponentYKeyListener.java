package t;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;
import s.SComponentGolf;

class ComponentYKeyListener extends KeyAdapter {
  ComponentYKeyListener(r paramr) {}

  public void keyReleased(KeyEvent paramKeyEvent) {
    if (this.a.a((Component) this.a.c, SComponentGolf.b("Component Y"))) {
      this.a.c().i((int) this.a.c.e());
      this.a.c.setForeground(UIManager.getColor("Label.foreground"));
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
