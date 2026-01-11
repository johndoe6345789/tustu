package ao;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

final class Z implements ActionListener {
  public void actionPerformed(ActionEvent paramActionEvent) {
    JMenuItem jMenuItem = (JMenuItem)paramActionEvent.getSource();
    String str = jMenuItem.getActionCommand();
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    StringSelection stringSelection = new StringSelection(str);
    clipboard.setContents(stringSelection, new aa(this));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/Z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */