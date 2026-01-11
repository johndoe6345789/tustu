package aP;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ApInterfaceIc implements ActionListener {
  ApInterfaceIc(iA paramiA) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.a.setCursor(Cursor.getPredefinedCursor(3));
    iD iD = new iD(this);
    iD.start();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */