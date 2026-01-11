package aC;

import A.b;
import A.f;
import G.l;
import aB.a;
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

public class a extends a implements f {
  private String j = "1234";
  
  RemoteDevice c = null;
  
  private static List k = new ArrayList();
  
  String d = "";
  
  public static String e = "Bluetooth Direct";
  
  int f = 0;
  
  InputStream g = null;
  
  OutputStream h = null;
  
  StreamConnection i = null;
  
  public void f() {
    if (this.d == null || this.d.isEmpty())
      throw new l("No Bluetooth device set!"); 
    this.f = 2;
    if (this.c == null)
      b(this.d); 
    if (this.c == null) {
      D.b("Unable to find to " + this.d);
      this.f = 0;
      throw new l("Unable to find to " + this.d);
    } 
    if (!this.c.isTrustedDevice()) {
      boolean bool = false;
      try {
        bool = RemoteDeviceHelper.authenticate(this.c, this.j);
        D.c("Pairing results: " + bool);
      } catch (IOException iOException) {
        D.a("pairing failed: " + a(this.c));
      } 
      if (!bool) {
        this.f = 0;
        throw new l("Failed to pair with " + this.d);
      } 
    } 
    try {
      D.d("Opening Bluetooth Connection to: " + this.c.getBluetoothAddress());
      this.i = (StreamConnection)Connector.open("btspp://" + this.c.getBluetoothAddress() + ":1", 3);
      this.g = this.i.openInputStream();
      this.h = this.i.openOutputStream();
      D.d("Bluetooth Connection opened: " + this.c.getBluetoothAddress());
      try {
        Thread.sleep(250L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } catch (IOException iOException) {
      g();
      throw new l("Unable to connect to " + this.d);
    } 
    this.f = 3;
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
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
    try {
      if (this.g != null) {
        this.g.close();
        D.c("BC input closed");
      } 
    } catch (IOException iOException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
    try {
      if (this.i != null) {
        this.i.close();
        D.c("BC connection closed");
      } 
    } catch (IOException iOException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
    this.g = null;
    this.h = null;
    this.i = null;
    this.f = 0;
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
    return this.f;
  }
  
  public List l() {
    k.clear();
    if (b.a()) {
      List list = b.b();
      k.addAll(list);
    } 
    ArrayList<b> arrayList = new ArrayList();
    b b1 = new b();
    b1.a("Bluetooth Device");
    b1.b("The Bluetooth Adapter to use for communication.");
    b1.a(4);
    for (byte b = 0; b < k.size(); b++)
      b1.a(a(k.get(b))); 
    arrayList.add(b1);
    b b2 = new b();
    b2.a("Not Listed Bluetooth");
    b2.b("Pair New Adapter");
    b2.a(5);
    arrayList.add(b2);
    return arrayList;
  }
  
  public void a(String paramString, Object paramObject) {
    if (paramString.equals("Bluetooth Device")) {
      this.d = (String)paramObject;
      b(this.d);
    } else if (paramString.equals("Pairing PIN")) {
      this.j = paramObject.toString();
    } 
  }
  
  private void b(String paramString) {
    RemoteDevice remoteDevice = null;
    String str = c(paramString);
    if (k == null || k.isEmpty()) {
      List list = b.b();
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
      List list = b.a(false);
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
        D.b("Bluetooth Device is not paired and does not appear to be discoverable. Is it on?");
      } finally {
        if (connection != null)
          try {
            connection.close();
          } catch (IOException iOException) {
            Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, iOException);
          }  
      } 
    } 
    this.c = remoteDevice;
    if (this.c != null && !this.c.isTrustedDevice())
      try {
        boolean bool = RemoteDeviceHelper.authenticate(remoteDevice, this.j);
        D.c("Pairing results: " + bool);
      } catch (IOException iOException) {
        D.a("pairing failed: " + str);
      }  
  }
  
  private String a(RemoteDevice paramRemoteDevice) {
    try {
      return paramRemoteDevice.getFriendlyName(false) + " (" + paramRemoteDevice.getBluetoothAddress() + ")";
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
  
  public Object a(String paramString) {
    if (paramString.equals("Bluetooth Device"))
      return (this.c != null) ? a(this.c) : this.d; 
    if (paramString.equals("Pairing PIN"))
      return this.j; 
    D.c("Unknown Setting Name: " + paramString);
    return null;
  }
  
  public boolean m() {
    return false;
  }
  
  public boolean a(int paramInt) {
    return false;
  }
  
  public String n() {
    return (this.c == null) ? "Bluetooth - Remote Device Not Set" : ((this.f == 0) ? ("Bluetooth - " + a(this.c)) : ((this.f == 2) ? ("Bluetooth - " + a(this.c) + " - Connecting") : ((this.f == 4) ? ("Bluetooth - " + a(this.c) + " - Disconnecting") : ((this.f == 3) ? ("Bluetooth - " + a(this.c) + " - Connected") : ("Bluetooth - " + a(this.c))))));
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aC/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */