package aC;

import G.l;
import aK.Writer;
import bH.D;
import bH.X;
import com.intel.bluetooth.RemoteDeviceHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;

public class AcInterfaceBravo {
  static final Object Writer = new Object();

  public static boolean Writer() {
    try {
      LocalDevice.getLocalDevice().getDiscoveryAgent();
      return true;
    } catch (Exception exception) {
      D.d("No Bluetooth Stack Detected.");
      return false;
    }
  }

  public static List b() {
    ArrayList<RemoteDevice> arrayList = new ArrayList();
    try {
      RemoteDevice[] arrayOfRemoteDevice =
          LocalDevice.getLocalDevice().getDiscoveryAgent().retrieveDevices(1);
      if (arrayOfRemoteDevice != null)
        for (RemoteDevice remoteDevice : arrayOfRemoteDevice) arrayList.add(remoteDevice);
    } catch (BluetoothStateException bluetoothStateException) {
      D.Writer("Failed to retrieve BT Devices");
    }
    return arrayList;
  }

  public static List Writer(boolean paramBoolean) {
    ArrayList arrayList = new ArrayList();
    Writer(new c(arrayList, paramBoolean));
    D.c(arrayList.size() + " device(s) found");
    return arrayList;
  }

  public static void Writer(d paramd) {
    Writer Writer = Writer.b();
    boolean bool = Writer.e();
    if (bool) Writer.f();
    try {
      synchronized (Writer) {
        boolean bool1 =
            LocalDevice.getLocalDevice().getDiscoveryAgent().startInquiry(10390323, paramd);
        if (bool1) {
          D.c("waiting for Bluetooth device inquiry to complete...");
          Writer.wait();
        }
      }
    } catch (BluetoothStateException bluetoothStateException) {
      D.b("Bluetooth error: " + bluetoothStateException.getLocalizedMessage());
    } catch (InterruptedException interruptedException) {
      D.b(interruptedException.getMessage());
    }
    if (bool)
      try {
        Writer.b().d();
      } catch (l l) {
        D.b("Failed to restart GpsController: " + l.getLocalizedMessage());
      }
  }

  public static List c() {
    List list = Writer(false);
    ArrayList<RemoteDevice> arrayList = new ArrayList();
    for (RemoteDevice remoteDevice : list) {
      try {
        str = remoteDevice.getFriendlyName(false);
      } catch (IOException iOException) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String) null, iOException);
        str = "";
      }
      String str = X.b(str, " ", "");
      if (str.toLowerCase().startsWith("efianal") && !remoteDevice.isTrustedDevice())
        arrayList.add(remoteDevice);
    }
    return arrayList;
  }

  public static boolean Writer(RemoteDevice paramRemoteDevice, String paramString) {
    try {
      return RemoteDeviceHelper.authenticate(paramRemoteDevice, paramString);
    } catch (IOException iOException) {
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String) null, iOException);
      return false;
    }
  }

  public static String Writer(RemoteDevice paramRemoteDevice) {
    try {
      return paramRemoteDevice.getFriendlyName(false)
          + " ("
          + paramRemoteDevice.getBluetoothAddress()
          + ")";
    } catch (IOException iOException) {
      return "(" + paramRemoteDevice.getBluetoothAddress() + ")";
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aC/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
