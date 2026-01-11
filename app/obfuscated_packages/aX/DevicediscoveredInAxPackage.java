package aX;

import aC.DiscoveryListener;
import bH.D;
import java.io.IOException;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.RemoteDevice;

class DevicediscoveredInAxPackage extends DiscoveryListener {
  l(h paramh) {}
  
  public void deviceDiscovered(RemoteDevice paramRemoteDevice, DeviceClass paramDeviceClass) {
    D.c("Device " + paramRemoteDevice.getBluetoothAddress() + " found. Authenticated: " + paramRemoteDevice.isAuthenticated() + ". Trusted: " + paramRemoteDevice.isTrustedDevice());
    try {
      String str = paramRemoteDevice.getFriendlyName(false);
      if (str == null || str.isEmpty())
        D.c("Friendly Name: " + paramRemoteDevice.getFriendlyName(true)); 
    } catch (IOException iOException) {}
    m m = new m(this.a, paramRemoteDevice);
    if (paramRemoteDevice.isTrustedDevice()) {
      this.a.b.addElement(m);
      this.a.a.repaint();
    } else {
      this.a.DiscoveryListener.addElement(m);
      this.a.c.repaint();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aX/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */