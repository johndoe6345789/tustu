package ao;

import g.k;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class df implements ItemListener {
  df(cd paramcd) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1) {
      String str1 = ((JCheckBoxMenuItem)paramItemEvent.getSource()).getActionCommand();
      String str2 = ((JCheckBoxMenuItem)paramItemEvent.getSource()).getName();
      String str3 = ((JCheckBoxMenuItem)paramItemEvent.getSource()).getText();
      if (str2.equals("Other")) {
        String str = k.a("{Enter '" + str3 + "' value }", false, bq.a().b());
        if (str != null && !str.equals(""))
          cd.a(this.a, str1, str, true); 
      } else {
        cd.a(this.a, str1, str2, true);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/df.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */