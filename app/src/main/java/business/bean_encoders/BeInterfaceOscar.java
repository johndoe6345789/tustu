package business.bean_encoders;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import s.SComponentGolf;

class BeInterfaceOscar implements ActionListener {
  BeInterfaceOscar(M paramM) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = this.a.d();
    P p = null;
    if (this.a.c.isSelected() && !str.isEmpty())
      p = this.a.c(str); 
    switch (this.a.b.getSelectedIndex()) {
      case 0:
        M.a(this.a, 5);
        this.a.o.setText(SComponentGolf.b("Input Value"));
        break;
      case 1:
        M.a(this.a, 255);
        this.a.o.setText(SComponentGolf.b("Input Voltage"));
        break;
      case 2:
        M.a(this.a, 1023);
        this.a.o.setText(SComponentGolf.b("Input Voltage"));
        break;
      case 3:
        M.a(this.a, 4095);
        this.a.o.setText(SComponentGolf.b("Input Voltage"));
        break;
    } 
    if (this.a.c.isSelected() && !str.isEmpty() && p != null)
      M.a(this.a, p); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/O.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */