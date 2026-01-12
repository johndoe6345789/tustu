package aC;

import A.AInterfaceBravo;
import A.IO;
import G.l;
import aB.AbstractInAbPackage;
import bH.D;
import com.intel.bluetooth.RemoteDeviceHelper;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.bluetooth.RemoteDevice;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;

public class IOInAcPackage extends AbstractInAbPackage implements IO {
  private String j = "1234";

  RemoteDevice c = null;

  private static List k = new ArrayList();

  String d = "";

  public static String e = "Bluetooth Direct";

  int IO = 0;

  InputStream g = null;

  OutputStream h = null;

  StreamConnection i = null;

  public void IO() {
    if (this.d == null || this.d.isEmpty()) throw new l("No Bluetooth device set!");
    this.IO = 2;
    if (this.c == null) AInterfaceBravo(this.d);
    if (this.c == null) {
      D.AInterfaceBravo("Unable to find to " + this.d);
      this.IO = 0;
      throw new l("Unable to find to " + this.d);
    }
    if (!this.c.isTrustedDevice()) {
      boolean bool = false;
      try {
        bool = RemoteDeviceHelper.authenticate(this.c, this.j);
        D.c("Pairing results: " + bool);
      } catch (IOException iOException) {
        D.AbstractInAbPackage("pairing failed: " + AbstractInAbPackage(this.c));
      }
      if (!bool) {
        this.IO = 0;
        throw new l("Failed to pair with " + this.d);
      }
    }
    try {
      D.d("Opening Bluetooth Connection to: " + this.c.getBluetoothAddress());
      this.i =
          (StreamConnection) Connector.open("btspp://" + this.c.getBluetoothAddress() + ":1", 3);
      this.g = this.i.openInputStream();
      this.h = this.i.openOutputStream();
      D.d("Bluetooth Connection opened: " + this.c.getBluetoothAddress());
      try {
        Thread.sleep(250L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(AbstractInAbPackage.class.getName())
            .log(Level.SEVERE, (String) null, interruptedException);
      }
    } catch (IOException iOException) {
      g();
      throw new l("Unable to connect to " + this.d);
    }
    this.IO = 3;
  }

  public boolean r() {
    return (k() == 3);
  }

  public void g() {
    try {
      if (this.h != null) {
        this.h.close();
        D.c("BC output closed");
      }
    } catch (IOException iOException) {
      Logger.getLogger(AbstractInAbPackage.class.getName())
          .log(Level.SEVERE, (String) null, iOException);
    }
    try {
      if (this.g != null) {
        this.g.close();
        D.c("BC input closed");
      }
    } catch (IOException iOException) {
      Logger.getLogger(AbstractInAbPackage.class.getName())
          .log(Level.SEVERE, (String) null, iOException);
    }
    try {
      if (this.i != null) {
        this.i.close();
        D.c("BC connection closed");
      }
    } catch (IOException iOException) {
      Logger.getLogger(AbstractInAbPackage.class.getName())
          .log(Level.SEVERE, (String) null, iOException);
    }
    this.g = null;
    this.h = null;
    this.i = null;
    this.IO = 0;
  }

  public String h() {
    return e;
  }

  public InputStream i() {
    return this.g;
  }

  public OutputStream j() {
    return this.h;
  }

  public int k() {
    return this.IO;
  }

  public List l() {
    k.clear();
    if (AInterfaceBravo.AbstractInAbPackage()) {
      List list = AInterfaceBravo.AInterfaceBravo();
      k.addAll(list);
    }
    ArrayList<AInterfaceBravo> arrayList = new ArrayList();
    AInterfaceBravo b1 = new AInterfaceBravo();
    b1.AbstractInAbPackage("Bluetooth Device");
    b1.AInterfaceBravo("The Bluetooth Adapter to use for communication.");
    b1.AbstractInAbPackage(4);
    for (byte AInterfaceBravo = 0; AInterfaceBravo < k.size(); AInterfaceBravo++)
      b1.AbstractInAbPackage(AbstractInAbPackage(k.get(AInterfaceBravo)));
    arrayList.add(b1);
    AInterfaceBravo b2 = new AInterfaceBravo();
    b2.AbstractInAbPackage("Not Listed Bluetooth");
    b2.AInterfaceBravo("Pair New Adapter");
    b2.AbstractInAbPackage(5);
    arrayList.add(b2);
    return arrayList;
  }

  public void AbstractInAbPackage(String paramString, Object paramObject) {
    if (paramString.equals("Bluetooth Device")) {
      this.d = (String) paramObject;
      AInterfaceBravo(this.d);
    } else if (paramString.equals("Pairing PIN")) {
      this.j = paramObject.toString();
    }
  }

  private void AInterfaceBravo(String paramString) {
    RemoteDevice remoteDevice = null;
    String str = c(paramString);
    if (k == null || k.isEmpty()) {
      List list = AInterfaceBravo.AInterfaceBravo();
      k.addAll(list);
    }
    for (RemoteDevice remoteDevice1 : k) {
      if (remoteDevice1.getBluetoothAddress().equals(str)) {
        remoteDevice = remoteDevice1;
        D.d("Found Paired BT Device " + paramString);
        break;
      }
    }
    if (remoteDevice == null) {
      D.d("BT Device " + paramString + " not found in paired device list, Doing full discovery.");
      List list = AInterfaceBravo.AbstractInAbPackage(false);
      for (RemoteDevice remoteDevice1 : list) {
        if (remoteDevice1.getBluetoothAddress().equals(str)) {
          remoteDevice = remoteDevice1;
          D.d("Found BT Device " + paramString + " with full discovery!");
          break;
        }
      }
    }
    if (remoteDevice == null) {
      Connection connection = null;
      try {
        D.d("Trying direct connect to BT Device " + paramString);
        connection = Connector.open("btspp://" + str + ":1");
        remoteDevice = RemoteDevice.getRemoteDevice(connection);
        connection.close();
      } catch (IOException iOException) {
        D.AInterfaceBravo(
            "Bluetooth Device is not paired and does not appear to be discoverable. Is it on?");
      } finally {
        if (connection != null)
          try {
            connection.close();
          } catch (IOException iOException) {
            Logger.getLogger(AbstractInAbPackage.class.getName())
                .log(Level.SEVERE, (String) null, iOException);
          }
      }
    }
    this.c = remoteDevice;
    if (this.c != null && !this.c.isTrustedDevice())
      try {
        boolean bool = RemoteDeviceHelper.authenticate(remoteDevice, this.j);
        D.c("Pairing results: " + bool);
      } catch (IOException iOException) {
        D.AbstractInAbPackage("pairing failed: " + str);
      }
  }

  private String AbstractInAbPackage(RemoteDevice paramRemoteDevice) {
    try {
      return paramRemoteDevice.getFriendlyName(false)
          + " ("
          + paramRemoteDevice.getBluetoothAddress()
          + ")";
    } catch (IOException iOException) {
      return "(" + paramRemoteDevice.getBluetoothAddress() + ")";
    }
  }

  private String c(String paramString) {
    if (paramString.contains("(")) {
      int i = paramString.indexOf("(") + 1;
      int j = paramString.indexOf(")");
      return paramString.substring(i, j);
    }
    return paramString;
  }

  public static void t() {
    k.clear();
  }

  public Object AbstractInAbPackage(String paramString) {
    if (paramString.equals("Bluetooth Device"))
      return (this.c != null) ? AbstractInAbPackage(this.c) : this.d;
    if (paramString.equals("Pairing PIN")) return this.j;
    D.c("Unknown Setting Name: " + paramString);
    return null;
  }

  public boolean m() {
    return false;
  }

  public boolean AbstractInAbPackage(int paramInt) {
    return false;
  }

  public String n() {
    return (this.c == null)
        ? "Bluetooth - Remote Device Not Set"
        : ((this.IO == 0)
            ? ("Bluetooth - " + AbstractInAbPackage(this.c))
            : ((this.IO == 2)
                ? ("Bluetooth - " + AbstractInAbPackage(this.c) + " - Connecting")
                : ((this.IO == 4)
                    ? ("Bluetooth - " + AbstractInAbPackage(this.c) + " - Disconnecting")
                    : ((this.IO == 3)
                        ? ("Bluetooth - " + AbstractInAbPackage(this.c) + " - Connected")
                        : ("Bluetooth - " + AbstractInAbPackage(this.c))))));
  }

  public int o() {
    return 350;
  }

  public int p() {
    return 1000;
  }

  public boolean q() {
    return true;
  }

  public int s() {
    return 1;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aC/AbstractInAbPackage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
