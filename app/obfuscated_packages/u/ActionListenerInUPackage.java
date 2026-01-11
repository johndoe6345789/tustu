package u;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ActionListenerInUPackage implements ActionListener {
  g a = null;
  
  c b = null;
  
  b(a parama, g paramg, c paramc) {
    this.a = paramg;
    this.b = paramc;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    boolean bool = this.a.d();
    if (bool)
      this.b.a(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/u/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */