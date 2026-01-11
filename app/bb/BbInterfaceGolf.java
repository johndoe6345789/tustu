package bb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BbInterfaceGolf implements ActionListener {
  BbInterfaceGolf(E paramE) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    boolean bool = this.a.f.isSelected();
    if (bool) {
      E.a(this.a);
    } else {
      this.a.e.setText("");
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/G.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */