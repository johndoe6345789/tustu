package business.button_builders.bB_components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ActionListenerInBbPackage implements ActionListener {
  ActionListenerInBbPackage(d paramd) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.a.g.setEditable(!this.a.d.isSelected());
    if (this.a.d.isSelected()) {
      this.a.g.setText("Auto");
    } else {
      this.a.g.a(0.0D);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bB/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */