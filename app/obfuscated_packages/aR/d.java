package aR;

import d.i;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class d implements ActionListener {
  String a;
  
  ActionListener b;
  
  public d(b paramb, String paramString, ActionListener paramActionListener) {
    this.a = paramString;
    this.b = paramActionListener;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = paramActionEvent.getActionCommand();
    this.c.a.clear();
    if (str != null && !str.isEmpty()) {
      i i1 = new i("ecuConfig", this.a);
      this.c.a.a(i1);
      i i2 = new i("commandName", str);
      this.c.a.a(i2);
      this.b.actionPerformed(paramActionEvent);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */