package aX;

import aW.JPanelExtensionInAwPackage;
import aW.AwInterfaceQuebec;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.Window;
import s.SComponentGolf;

public class AxInterfaceBravo implements AwInterfaceQuebec {
  JPanelExtensionInAwPackage JPanelExtensionInAwPackage = null;
  
  public void JPanelExtensionInAwPackage(JPanelExtensionInAwPackage parama, String paramString) {
    if (aC.b.JPanelExtensionInAwPackage()) {
      this.JPanelExtensionInAwPackage = new JPanelExtensionInAwPackage();
      this.JPanelExtensionInAwPackage.JPanelExtensionInAwPackage(parama);
      Window window = bV.b((Component)parama);
      this.JPanelExtensionInAwPackage.JPanelExtensionInAwPackage(window);
    } else {
      String str = SComponentGolf.b("Bluetooth is not enabled on this computer.");
      bV.d(str, (Component)parama);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aX/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */