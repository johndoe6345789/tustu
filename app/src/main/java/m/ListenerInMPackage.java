package m;

import am.AmInterfaceEcho;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class ListenerInMPackage implements ActionListener {
  f(d paramd) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    for (JCheckBox jCheckBox : this.a.a)
      jCheckBox.setSelected(true); 
    this.a.a().clear();
    for (AmInterfaceEcho AmInterfaceEcho : this.a.b)
      d.a(this.a).add(Integer.valueOf(AmInterfaceEcho.h())); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/m/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */