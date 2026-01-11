package m;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class h implements ActionListener {
  h(d paramd) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBox jCheckBox = (JCheckBox)paramActionEvent.getSource();
    int i = Integer.parseInt(paramActionEvent.getActionCommand());
    if (jCheckBox.isSelected()) {
      this.a.a().add(Integer.valueOf(i));
    } else {
      this.a.a().remove(new Integer(i));
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/m/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */