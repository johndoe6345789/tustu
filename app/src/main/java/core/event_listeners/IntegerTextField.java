package ao;

import java.awt.Container;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class fs extends JTextField {
  public fs() {
    this("");
    setBorder(BorderFactory.createLoweredBevelBorder());
  }

  public fs(String paramString) {
    this(paramString, 0);
  }

  public fs(String paramString, int paramInt) {
    super(paramString, paramInt);
    enableEvents(8L);
  }

  protected void processKeyEvent(KeyEvent paramKeyEvent) {
    if ((paramKeyEvent.getID() == 401
            && (paramKeyEvent.getKeyChar() == '\n' || paramKeyEvent.getKeyChar() == ''))
        || paramKeyEvent.getKeyChar() == '\b') {
      super.processKeyEvent(paramKeyEvent);
    } else if ("0987654321-".indexOf(paramKeyEvent.getKeyChar()) == -1
        || paramKeyEvent.getKeyChar() == '\n') {
      Container container = getParent();
      if (container != null) container.dispatchEvent(paramKeyEvent);
      paramKeyEvent.consume();
      return;
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
