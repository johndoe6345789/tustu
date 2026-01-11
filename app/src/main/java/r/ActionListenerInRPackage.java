package r;

import aE.PropertiesExtension;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import s.SComponentGolf;

class ActionListenerInRPackage implements ActionListener {
  h(b paramb) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String[] arrayOfString = { "dash" };
    String str = bV.b((Component)paramActionEvent.getSource(), SComponentGolf.b("Select Other Dashboard Layout"), arrayOfString, "", "./" + PropertiesExtension.l);
    if (str != null) {
      this.PropertiesExtension.d.setText(str);
      this.PropertiesExtension.PropertiesExtension = new File(str);
      this.PropertiesExtension.b(this.PropertiesExtension.PropertiesExtension);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/r/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */