package t;

import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import s.g;

class bk implements ActionListener {
  bk(bi parambi) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JComboBox jComboBox = (JComboBox)paramActionEvent.getSource();
    if (!this.a.c && (this.a.c().a().size() == 1 || bV.a(g.b("There is more than 1 gauge selected.") + "\n" + g.b("Are you sure you want to set them all to Output Channel") + ": " + jComboBox.getSelectedItem() + "?", jComboBox, true)))
      this.a.c().b((String)jComboBox.getSelectedItem()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/bk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */