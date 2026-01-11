package com.efiAnalytics.tuningwidgets.panels;

import G.q;
import S.a;
import S.e;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class h implements ActionListener {
  h(g paramg) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (this.a.j.isSelected()) {
      try {
        e.a().a(this.a.a.c(), (a)this.a.b);
        e.a().a(this.a.a.c(), (a)this.a.c);
      } catch (q q) {
        bV.d("No Configuration Found: " + this.a.a.c(), this.a.j);
      } 
    } else {
      e.a().a(this.a.a.c(), this.a.b.a());
      e.a().a(this.a.a.c(), this.a.c.a());
    } 
    g.a(this.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */