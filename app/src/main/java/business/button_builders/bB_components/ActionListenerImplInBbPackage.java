package business.button_builders.bB_components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ActionListenerImplInBbPackage implements ActionListener {
  ActionListenerImplInBbPackage(d paramd) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.a.i.setEditable(!this.a.f.isSelected());
    if (this.a.f.isSelected()) {
      this.a.i.setText("Auto");
    } else {
      this.a.i.a(0.0D);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bB/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */