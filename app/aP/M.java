package aP;

import aC.b;
import aX.c;
import bH.D;
import com.efiAnalytics.ui.bV;
import java.util.List;
import javax.bluetooth.RemoteDevice;
import javax.swing.JOptionPane;
import r.a;
import s.g;

public class M {
  public void a() {
    List list = b.c();
    for (RemoteDevice remoteDevice : list) {
      if (d(remoteDevice)) {
        D.c("Found BT Adapter, prompting user: " + b.a(remoteDevice));
        a(remoteDevice);
        continue;
      } 
      D.c("Found BT Adapter, but marked for no prompt: " + b.a(remoteDevice));
    } 
  }
  
  private void a(RemoteDevice paramRemoteDevice) {
    String[] arrayOfString = { g.b("Yes"), g.b("Ask Later"), g.b("Do Not Ask Again") };
    String str = g.b(a.b + " has found an up paired EFI Analytics Bluetooth adapter.") + "\n" + g.b("Would you like " + a.b + " to pair with it now?") + "\n" + g.b("Found") + ": " + b.a(paramRemoteDevice);
    int i = JOptionPane.showOptionDialog(dd.a().c(), str, g.b("Pair EFIA Bluetooth"), -1, 3, null, (Object[])arrayOfString, arrayOfString[0]);
    if (i == 0) {
      boolean bool = b.a(paramRemoteDevice, "1234");
      if (bool) {
        bV.d(g.b("successfully Paired with " + b.a(paramRemoteDevice)), dd.a().c());
        return;
      } 
      b(paramRemoteDevice);
    } else if (i == 2) {
      e(paramRemoteDevice);
    } 
  }
  
  private void b(RemoteDevice paramRemoteDevice) {
    c c = new c();
    c.a(paramRemoteDevice);
    c.a(dd.a().c());
  }
  
  private String c(RemoteDevice paramRemoteDevice) {
    return "autoPairWith" + paramRemoteDevice.getBluetoothAddress();
  }
  
  private boolean d(RemoteDevice paramRemoteDevice) {
    String str = c(paramRemoteDevice);
    return a.a().c(str, true);
  }
  
  private void e(RemoteDevice paramRemoteDevice) {
    String str = c(paramRemoteDevice);
    a.a().b(str, Boolean.toString(false));
  }
  
  public void a(int paramInt) {
    N n = new N(this, paramInt);
    n.start();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */