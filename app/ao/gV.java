package ao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class gV implements ActionListener {
  gV(go paramgo) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    Integer integer = (Integer)this.a.f.getSelectedItem();
    this.a.l.h().b(integer.intValue());
    this.a.l.k();
    go.g(this.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */