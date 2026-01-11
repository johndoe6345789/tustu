package ao;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

final class hT extends AbstractAction {
  public void actionPerformed(ActionEvent paramActionEvent) {
    JOptionPane.showMessageDialog((JTextComponent)paramActionEvent.getSource(), "Please open log file in order to insert field names");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */