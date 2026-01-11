package aC;

import java.io.IOException;
import java.util.List;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.RemoteDevice;

final class Devicediscovered extends d {
  Devicediscovered(List paramList, boolean paramBoolean) {}
  
  public void deviceDiscovered(RemoteDevice paramRemoteDevice, DeviceClass paramDeviceClass) {
    System.out.println("Device " + paramRemoteDevice.getBluetoothAddress() + " found. Authenticated: " + paramRemoteDevice.isAuthenticated() + ". Trusted: " + paramRemoteDevice.isTrustedDevice());
    this.a.add(paramRemoteDevice);
    try {
      String str = paramRemoteDevice.getFriendlyName(false);
      if (str == null || str.isEmpty() || this.b)
        str = paramRemoteDevice.getFriendlyName(true); 
      System.out.println("     name " + str);
    } catch (IOException iOException) {
      System.out.println("Failed to get friendly name");
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aC/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */