package aR;

import d.DInterfaceIndia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ActionListenerImplInArPackage implements ActionListener {
  String a;
  
  ActionListener b;
  
  public ActionListenerImplInArPackage(s params, String paramString, ActionListener paramActionListener) {
    this.a = paramString;
    this.b = paramActionListener;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = paramActionEvent.getActionCommand();
    this.c.a.clear();
    if (str != null && !str.isEmpty()) {
      DInterfaceIndia i1 = new DInterfaceIndia("ecuConfig", this.a);
      this.c.a.a(i1);
      DInterfaceIndia i2 = new DInterfaceIndia("settingsPanelName", str);
      this.c.a.a(i2);
      this.b.actionPerformed(paramActionEvent);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */