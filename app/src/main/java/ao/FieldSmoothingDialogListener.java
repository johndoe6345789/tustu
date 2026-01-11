package ao;

import W.j;
import g.IOJFileChooser;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

final class X implements ActionListener {
  X(j paramj, Component paramComponent) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = IOJFileChooser.a("{Set " + this.a.a() + " Smoothing Factor}", true, "Smoothing Factor: Larger Number for more Smoothing", true, this.b);
    if (str != null && !str.isEmpty()) {
      int i = Integer.parseInt(str);
      if (i < 1) {
        hx.a().a(this.a);
      } else {
        hx.a().a(this.a, i);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/X.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */