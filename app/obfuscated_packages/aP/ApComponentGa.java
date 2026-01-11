package aP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.IOPropertiesUsingFile;

class ApComponentGa implements ActionListener {
  ga(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.bf, jCheckBoxMenuItem.getState() + "");
    if (!jCheckBoxMenuItem.getState())
      IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.bg, jCheckBoxMenuItem.getState() + ""); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ga.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */