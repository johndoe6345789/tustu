package com.efiAnalytics.apps.ts.dashboard;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class J implements ActionListener {
  J(x paramx, Component paramComponent) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    x.c(this.b, ((JCheckBoxMenuItem)paramActionEvent.getSource()).getState());
    if (x.b(this.b)) {
      b b = new b();
      b.a((int)this.b.H(), (int)this.b.I());
      e e = b.a(this.a);
      if (e != null) {
        this.b.b(e.b());
        this.b.a(e.a());
      } 
    } 
    if (this.b.getParent() != null)
      this.b.getParent().doLayout(); 
    this.b.i(this.b.J());
    this.b.doLayout();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */