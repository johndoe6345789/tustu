package t;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;
import s.SComponentGolf;

class ComponentHeightKeyListener extends KeyAdapter {
  ComponentHeightKeyListener(r paramr) {}

  public void keyReleased(KeyEvent paramKeyEvent) {
    if (this.a.a((Component) this.a.e, SComponentGolf.b("Component Height"))) {
      this.a.c().k((int) this.a.e.e());
      this.a.e.setForeground(UIManager.getColor("Label.foreground"));
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
