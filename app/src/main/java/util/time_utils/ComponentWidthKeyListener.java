package t;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;
import s.SComponentGolf;

class ComponentWidthKeyListener extends KeyAdapter {
  ComponentWidthKeyListener(r paramr) {}

  public void keyReleased(KeyEvent paramKeyEvent) {
    if (this.a.a((Component) this.a.d, SComponentGolf.b("Component Width"))) {
      this.a.c().j((int) this.a.d.e());
      this.a.d.setForeground(UIManager.getColor("Label.foreground"));
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
