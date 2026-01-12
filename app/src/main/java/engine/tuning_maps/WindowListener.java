package aP;

import java.awt.KeyboardFocusManager;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class WindowListener implements WindowListener {
  JFrame a;

  Window b;

  public void windowOpened(WindowEvent paramWindowEvent) {}

  public void windowClosing(WindowEvent paramWindowEvent) {}

  public void windowClosed(WindowEvent paramWindowEvent) {}

  public void windowIconified(WindowEvent paramWindowEvent) {}

  public void windowDeiconified(WindowEvent paramWindowEvent) {}

  public void windowActivated(WindowEvent paramWindowEvent) {
    if (paramWindowEvent.getSource().equals(this.a) && this.b != null && !this.b.equals(this.a))
      this.b.requestFocusInWindow();
  }

  public void windowDeactivated(WindowEvent paramWindowEvent) {
    Window window = KeyboardFocusManager.getCurrentKeyboardFocusManager().getActiveWindow();
    this.b = window;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
