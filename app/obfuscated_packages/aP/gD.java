package aP;

import bA.c;
import bt.bu;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.fq;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import r.a;

class gD implements ActionListener {
  gD(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    c c = (c)paramActionEvent.getSource();
    a.a().b(a.cc, Boolean.toString(c.getState()));
    if (c.isSelected()) {
      fq fq = new fq(dd.a().c(), true, "Base atmospheric barometric pressure in KPa", a.a().c(a.ai, "100"), bV.a());
      fq.setVisible(true);
      String str = fq.a();
      if (str != null && !str.isEmpty()) {
        try {
          double d = Double.parseDouble(str);
          bu.a(d);
          a.a().b(a.ai, str);
        } catch (NumberFormatException numberFormatException) {
          a.a().b(a.ai, "100");
          bu.a(100.0D);
        } 
      } else {
        a.a().b(a.ai, "100");
        bu.a(100.0D);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */