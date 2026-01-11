package aP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ax implements ActionListener {
  ax(au paramau) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    boolean bool = this.a.f.isSelected();
    this.a.i.setEnabled(bool);
    this.a.c.setEnabled(bool);
    this.a.d.setEnabled(!bool);
    if (bool)
      au.a(this.a); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */