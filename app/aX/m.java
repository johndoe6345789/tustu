package aX;

import java.io.IOException;
import javax.bluetooth.RemoteDevice;

class m {
  private RemoteDevice b;
  
  public m(h paramh, RemoteDevice paramRemoteDevice) {
    this.b = paramRemoteDevice;
  }
  
  public String toString() {
    try {
      return this.b.getFriendlyName(false) + " (" + this.b.getBluetoothAddress() + ")";
    } catch (IOException iOException) {
      return "(" + this.b.getBluetoothAddress() + ")";
    } 
  }
  
  public RemoteDevice a() {
    return this.b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aX/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */