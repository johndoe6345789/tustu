package aP;

import bA.JCheckBoxMenuItemExtension;
import bt.bu;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.fq;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import r.IOPropertiesUsingFile;

class gD implements ActionListener {
  gD(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItemExtension JCheckBoxMenuItemExtension = (JCheckBoxMenuItemExtension)paramActionEvent.getSource();
    IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.cc, Boolean.toString(JCheckBoxMenuItemExtension.getState()));
    if (JCheckBoxMenuItemExtension.isSelected()) {
      fq fq = new fq(dd.IOPropertiesUsingFile().JCheckBoxMenuItemExtension(), true, "Base atmospheric barometric pressure in KPa", IOPropertiesUsingFile.IOPropertiesUsingFile().JCheckBoxMenuItemExtension(IOPropertiesUsingFile.ai, "100"), bV.IOPropertiesUsingFile());
      fq.setVisible(true);
      String str = fq.IOPropertiesUsingFile();
      if (str != null && !str.isEmpty()) {
        try {
          double d = Double.parseDouble(str);
          bu.IOPropertiesUsingFile(d);
          IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.ai, str);
        } catch (NumberFormatException numberFormatException) {
          IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.ai, "100");
          bu.IOPropertiesUsingFile(100.0D);
        } 
      } else {
        IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.ai, "100");
        bu.IOPropertiesUsingFile(100.0D);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */