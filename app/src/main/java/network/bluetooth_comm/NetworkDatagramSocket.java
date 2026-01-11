package B;

import G.R;
import bH.D;
import bS.BsInterfaceOscar;
import NetworkInFPackage.NetworkInFPackage;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class NetworkDatagramSocket {
  private int n = 21846;
  
  public static String a = "slave";
  
  public static String b = "id";
  
  public static String c = "serial";
  
  public static String d = "info";
  
  public static String e = "port";
  
  public static String NetworkInFPackage = "name";
  
  public static String g = "protocol";
  
  public static String h = "connectionState";
  
  public static String i = "canId";
  
  public static String j = "projectUUID";
  
  public static String k = "CAN_DEVICE_";
  
  public static String l = "DISCOVER_SLAVE_SERVER";
  
  private int BsInterfaceOscar = 2001;
  
  private String p = BsInterfaceOscar.a;
  
  R m;
  
  private String q = "TCP";
  
  private d r = null;
  
  private DatagramSocket s = null;
  
  public NetworkDatagramSocket(R paramR) {
    this.m = paramR;
  }
  
  public void a() {
    if (this.r != null)
      this.r.a(); 
  }
  
  public void b() {
    a();
    this.r = new d(this);
    this.r.start();
  }
  
  public int c() {
    return this.n;
  }
  
  public void a(int paramInt) {
    this.n = paramInt;
  }
  
  public void b(int paramInt) {
    this.BsInterfaceOscar = paramInt;
  }
  
  private DatagramSocket d() {
    if (this.s == null || this.s.isClosed()) {
      this.s = new DatagramSocket(c(), InetAddress.getByName("0.0.0.0"));
      this.s.setBroadcast(true);
      System.out.println("Listen on " + this.s.getLocalAddress() + " from " + this.s.getInetAddress() + " port " + this.s.getPort());
    } 
    return this.s;
  }
  
  public void a(String paramString) {
    this.q = paramString;
  }
  
  private String e() {
    try {
      return NetworkInFPackage.k();
    } catch (Exception exception) {
      D.c("Failed to get MAC for serial#, msg: " + exception.getMessage());
      return null;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/B/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */