package aP;

import aC.AcInterfaceBravo;
import aX.JPanelExtensionUsingRemoteDevice;
import bH.D;
import com.efiAnalytics.ui.bV;
import java.util.List;
import javax.bluetooth.RemoteDevice;
import javax.swing.JOptionPane;
import r.IOPropertiesUsingFile;
import s.SComponentGolf;

public class ApInterfaceMike {
  public void IOPropertiesUsingFile() {
    List list = AcInterfaceBravo.JPanelExtensionUsingRemoteDevice();
    for (RemoteDevice remoteDevice : list) {
      if (d(remoteDevice)) {
        D.JPanelExtensionUsingRemoteDevice("Found BT Adapter, prompting user: " + AcInterfaceBravo.IOPropertiesUsingFile(remoteDevice));
        IOPropertiesUsingFile(remoteDevice);
        continue;
      } 
      D.JPanelExtensionUsingRemoteDevice("Found BT Adapter, but marked for no prompt: " + AcInterfaceBravo.IOPropertiesUsingFile(remoteDevice));
    } 
  }
  
  private void IOPropertiesUsingFile(RemoteDevice paramRemoteDevice) {
    String[] arrayOfString = { SComponentGolf.AcInterfaceBravo("Yes"), SComponentGolf.AcInterfaceBravo("Ask Later"), SComponentGolf.AcInterfaceBravo("Do Not Ask Again") };
    String str = SComponentGolf.AcInterfaceBravo(IOPropertiesUsingFile.AcInterfaceBravo + " has found an up paired EFI Analytics Bluetooth adapter.") + "\n" + SComponentGolf.AcInterfaceBravo("Would you like " + IOPropertiesUsingFile.AcInterfaceBravo + " to pair with it now?") + "\n" + SComponentGolf.AcInterfaceBravo("Found") + ": " + AcInterfaceBravo.IOPropertiesUsingFile(paramRemoteDevice);
    int i = JOptionPane.showOptionDialog(dd.IOPropertiesUsingFile().JPanelExtensionUsingRemoteDevice(), str, SComponentGolf.AcInterfaceBravo("Pair EFIA Bluetooth"), -1, 3, null, (Object[])arrayOfString, arrayOfString[0]);
    if (i == 0) {
      boolean bool = AcInterfaceBravo.IOPropertiesUsingFile(paramRemoteDevice, "1234");
      if (bool) {
        bV.d(SComponentGolf.AcInterfaceBravo("successfully Paired with " + AcInterfaceBravo.IOPropertiesUsingFile(paramRemoteDevice)), dd.IOPropertiesUsingFile().JPanelExtensionUsingRemoteDevice());
        return;
      } 
      AcInterfaceBravo(paramRemoteDevice);
    } else if (i == 2) {
      e(paramRemoteDevice);
    } 
  }
  
  private void AcInterfaceBravo(RemoteDevice paramRemoteDevice) {
    JPanelExtensionUsingRemoteDevice JPanelExtensionUsingRemoteDevice = new JPanelExtensionUsingRemoteDevice();
    JPanelExtensionUsingRemoteDevice.IOPropertiesUsingFile(paramRemoteDevice);
    JPanelExtensionUsingRemoteDevice.IOPropertiesUsingFile(dd.IOPropertiesUsingFile().JPanelExtensionUsingRemoteDevice());
  }
  
  private String JPanelExtensionUsingRemoteDevice(RemoteDevice paramRemoteDevice) {
    return "autoPairWith" + paramRemoteDevice.getBluetoothAddress();
  }
  
  private boolean d(RemoteDevice paramRemoteDevice) {
    String str = JPanelExtensionUsingRemoteDevice(paramRemoteDevice);
    return IOPropertiesUsingFile.IOPropertiesUsingFile().JPanelExtensionUsingRemoteDevice(str, true);
  }
  
  private void e(RemoteDevice paramRemoteDevice) {
    String str = JPanelExtensionUsingRemoteDevice(paramRemoteDevice);
    IOPropertiesUsingFile.IOPropertiesUsingFile().AcInterfaceBravo(str, Boolean.toString(false));
  }
  
  public void IOPropertiesUsingFile(int paramInt) {
    N n = new N(this, paramInt);
    n.start();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */