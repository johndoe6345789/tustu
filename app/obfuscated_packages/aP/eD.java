package aP;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;
import r.IOPropertiesUsingFile;

class eD implements ItemListener {
  eD(dB paramdB) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramItemEvent.getSource();
    IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.aQ, "" + jCheckBoxMenuItem.getState());
    if (jCheckBoxMenuItem.getState())
      ((dl)dd.IOPropertiesUsingFile().c()).e(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/eD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */