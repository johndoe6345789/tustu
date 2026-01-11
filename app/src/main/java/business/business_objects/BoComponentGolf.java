package business.business_objects;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BoComponentGolf implements ActionListener {
  BoComponentGolf(b paramb) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (this.a.m.getSelectedItem().equals(b.b())) {
      if (this.a.g.e() > 100.0D)
        this.a.g.setText("100"); 
      if (this.a.j.e() > 100.0D)
        this.a.j.setText("100"); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bo/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */