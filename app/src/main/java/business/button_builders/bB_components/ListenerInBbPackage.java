package business.button_builders.bB_components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerInBbPackage implements ActionListener {
  ListenerInBbPackage(d paramd) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.a.h.setEditable(!this.a.e.isSelected());
    if (this.a.e.isSelected()) {
      this.a.h.setText("Auto");
    } else {
      this.a.h.a(0.0D);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bB/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */