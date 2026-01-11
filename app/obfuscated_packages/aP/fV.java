package aP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.IOPropertiesUsingFile;

class fV implements ActionListener {
  fV(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.F, Boolean.toString(false));
    IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.H, Boolean.toString(false));
    dB.b(this.IOPropertiesUsingFile);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/fV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */