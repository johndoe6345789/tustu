package business.object_factory;

import d.DComponentCharlie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ActionListenerInOPackage implements ActionListener {
  DComponentCharlie a;
  
  public ActionListenerInOPackage(a parama, DComponentCharlie paramc) {
    this.a = paramc;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    a.a(this.b, this.b.a(this.a));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/o/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */