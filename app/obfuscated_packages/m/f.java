package m;

import am.e;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class f implements ActionListener {
  f(d paramd) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    for (JCheckBox jCheckBox : this.a.a)
      jCheckBox.setSelected(true); 
    this.a.a().clear();
    for (e e : this.a.b)
      d.a(this.a).add(Integer.valueOf(e.h())); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/m/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */