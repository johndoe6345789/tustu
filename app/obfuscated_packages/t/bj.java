package t;

import G.R;
import G.cu;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import s.g;

class bj implements ActionListener {
  bj(bi parambi) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JComboBox jComboBox = (JComboBox)paramActionEvent.getSource();
    if (!this.a.c && (this.a.c().a().size() == 1 || bV.a(g.b("There is more than 1 gauge selected.") + "\n" + g.b("Are you sure you want to set them all to Controller") + ": " + jComboBox.getSelectedItem() + "?", jComboBox, true))) {
      String str = jComboBox.getSelectedItem().toString();
      if (jComboBox.getSelectedItem() instanceof bm) {
        bm bm = (bm)jComboBox.getSelectedItem();
        str = bm.a();
      } 
      if (str.equals(cu.a)) {
        bi.a(this.a);
      } else {
        R r = bi.a(this.a, str);
        bi.a(this.a, r);
      } 
      this.a.c().c(str);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/bj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */