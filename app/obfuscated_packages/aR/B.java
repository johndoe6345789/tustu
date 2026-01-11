package aR;

import d.i;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class B implements ActionListener {
  ActionListener a;
  
  public B(A paramA, ActionListener paramActionListener) {
    this.a = paramActionListener;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = paramActionEvent.getActionCommand();
    this.b.c.clear();
    if (str != null && !str.isEmpty()) {
      i i = new i(A.b, str);
      this.b.c.a(i);
      this.a.actionPerformed(paramActionEvent);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/B.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */