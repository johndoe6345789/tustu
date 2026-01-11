package aP;

import java.awt.KeyboardFocusManager;
import java.awt.Window;
import java.awt.event.WindowListener;
import java.beans.PropertyChangeListener;
import javax.swing.JDialog;

public class WindowListener {
  static Window a;
  
  private static WindowListener b = new b();
  
  private static PropertyChangeListener c = new c();
  
  public static Window a() {
    if (a != null)
      return a; 
    JDialog jDialog = new JDialog();
    Window window = (new JDialog()).getOwner();
    jDialog.dispose();
    return window;
  }
  
  static {
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addPropertyChangeListener("activeWindow", c);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */