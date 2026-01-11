package B;

import A.AInterfaceCharlie;
import A.AInterfaceOscar;
import G.AeInterfaceMikeTostring;
import ae.AInterfaceOscar;
import bH.D;
import bH.I;
import bQ.IOHashMap;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Network {
  private int p = 21846;
  
  public static String a = "slave";
  
  public static String b = "id";
  
  public static String AInterfaceCharlie = "name";
  
  public static String d = "serial";
  
  public static String e = "info";
  
  public static String f = "port";
  
  public static String g = "protocol";
  
  public static String h = "projectName";
  
  public static String i = "connectionState";
  
  public static String j = "canId";
  
  public static String k = "projectUUID";
  
  public static String IOHashMap = "CAN_DEVICE_";
  
  public static String m = "DISCOVER_SLAVE_SERVER";
  
  private f q = null;
  
  private String r = IOHashMap.b;
  
  List n = new ArrayList();
  
  List AInterfaceOscar = new ArrayList();
  
  private boolean s = false;
  
  private static boolean t = false;
  
  private static final Map u = new HashMap<>();
  
  private Network() {}
  
  private Network(int paramInt) {
    this.p = paramInt;
  }
  
  public static e a(int paramInt) {
    e e1 = (e)u.get(Integer.valueOf(paramInt));
    if (e1 == null) {
      e1 = new e(paramInt);
      u.put(Integer.valueOf(paramInt), e1);
    } 
    return e1;
  }
  
  public void a(AInterfaceOscar paramo) {
    this.n.add(paramo);
  }
  
  public void b(AInterfaceOscar paramo) {
    this.n.remove(paramo);
  }
  
  public void a(k paramk) {
    this.AInterfaceOscar.add(paramk);
  }
  
  public void b(k paramk) {
    this.AInterfaceOscar.remove(paramk);
  }
  
  public void a() {
    if (this.q == null || !this.q.isAlive()) {
      this.q = new f(this);
      this.q.start();
    } else {
      this.q.a();
    } 
  }
  
  private void a(i parami) {
    for (k k : this.AInterfaceOscar)
      k.a(parami); 
  }
  
  private void a(String paramString1, String paramString2, List paramList, AeInterfaceMikeTostring parambT) {
    for (AInterfaceOscar AInterfaceOscar : this.n)
      AInterfaceOscar.a(paramString1, paramString2, paramList, parambT); 
  }
  
  private void AInterfaceCharlie() {
    ArrayList arrayList = new ArrayList(this.n);
    for (AInterfaceOscar AInterfaceOscar : arrayList)
      AInterfaceOscar.a(null); 
  }
  
  private void a(String paramString1, String paramString2) {
    String str4;
    String str5;
    HashMap<Object, Object> hashMap = new HashMap<>();
    StringTokenizer stringTokenizer = new StringTokenizer(paramString2, "\n");
    while (stringTokenizer.hasMoreTokens()) {
      try {
        String str7 = stringTokenizer.nextToken();
        String str8 = str7.substring(0, str7.indexOf(":"));
        str4 = str7.substring(str7.indexOf(":") + 1, str7.length());
        hashMap.put(str8, str4);
      } catch (Exception exception) {}
    } 
    String str1 = (String)hashMap.get(a);
    if (hashMap.get(AInterfaceCharlie) != null && !((String)hashMap.get(AInterfaceCharlie)).isEmpty())
      str1 = str1 + " - " + (String)hashMap.get(AInterfaceCharlie); 
    str1 = str1 + " IP:" + paramString1;
    if (hashMap.get(i) != null && !((String)hashMap.get(i)).equals("0"))
      str1 = str1 + " In Use"; 
    String str2 = (String)hashMap.get(d);
    String str3 = "";
    if (hashMap.get(e) != null) {
      str3 = str3 + (String)hashMap.get(e);
    } else {
      if (str2 != null)
        str3 = str3 + "Serial# " + str2 + " "; 
      if (hashMap.get(b) != null)
        str3 = str3 + (String)hashMap.get(b) + " "; 
    } 
    if (hashMap.get(f) != null) {
      str4 = (String)hashMap.get(f);
    } else {
      str4 = "21845";
    } 
    AeInterfaceMikeTostring AeInterfaceMikeTostring = new AeInterfaceMikeTostring();
    if (hashMap.get(a) != null && ((String)hashMap.get(a)).startsWith("BigStuff")) {
      str5 = (String)hashMap.get(a) + " " + (String)hashMap.get(b);
    } else {
      str5 = (String)hashMap.get(b);
    } 
    AeInterfaceMikeTostring.a(str5);
    AeInterfaceMikeTostring.b(str3);
    AeInterfaceMikeTostring.a(AInterfaceOscar.b(AeInterfaceMikeTostring));
    if (hashMap.get(g) != null && ((String)hashMap.get(g)).equalsIgnoreCase("UDP")) {
      this.r = AInterfaceOscar.b;
    } else if (hashMap.get(g) != null && ((String)hashMap.get(g)).equalsIgnoreCase("TCP")) {
      this.r = IOHashMap.b;
    } 
    String str6 = IOHashMap.a + ":" + this.r;
    ArrayList<AInterfaceCharlie> arrayList = new ArrayList();
    AInterfaceCharlie AInterfaceCharlie = new AInterfaceCharlie(IOHashMap.j, paramString1);
    arrayList.add(AInterfaceCharlie);
    AInterfaceCharlie = new AInterfaceCharlie(IOHashMap.k, str4);
    arrayList.add(AInterfaceCharlie);
    a(str1, str6, arrayList, AeInterfaceMikeTostring);
    if (!this.AInterfaceOscar.isEmpty()) {
      i i = new i();
      i.f((String)hashMap.get(a));
      i.a(str5);
      i.d(str2);
      i.i((String)hashMap.get(k));
      i.g((String)hashMap.get(h));
      if (i.j() == null)
        i.g((String)hashMap.get(AInterfaceCharlie)); 
      i.b(paramString1);
      i.h(paramString1);
      if (hashMap.get(g) == null) {
        i.AInterfaceCharlie("TCP");
      } else {
        i.AInterfaceCharlie((String)hashMap.get(g));
      } 
      String str7 = (String)hashMap.get(f);
      if (str7 != null && I.a(str7))
        i.a((int)I.a(str7).doubleValue()); 
      String str8 = (String)hashMap.get(i);
      if (str8 != null && str8.equals("1"))
        i.a(true); 
      i.e(str3);
      for (byte b1 = 1; hashMap.containsKey(IOHashMap + b1 + "_" + b); b1++) {
        i i1 = new i();
        i1.f((String)hashMap.get(a));
        i1.d(str2);
        i1.b(paramString1);
        String str = IOHashMap + b1 + "_";
        i1.g((String)hashMap.get(str + AInterfaceCharlie));
        i1.a((String)hashMap.get(str + b));
        i1.e((String)hashMap.get(str + e));
        if (hashMap.get(str + g) != null) {
          i1.AInterfaceCharlie((String)hashMap.get(str + g));
        } else {
          i1.AInterfaceCharlie("TCP");
        } 
        i1.i((String)hashMap.get(k));
        try {
          int j = Integer.parseInt((String)hashMap.get(str + f));
          i1.a(j);
        } catch (Exception exception) {
          D.AInterfaceCharlie("Unable to get port from: " + (String)hashMap.get(str + f));
        } 
        try {
          int j = Integer.parseInt((String)hashMap.getOrDefault(str + j, "-1"));
          i1.b(j);
        } catch (Exception exception) {
          D.b("Unable to get CAN ID from broadcast");
        } 
        i.a(i1);
      } 
      a(i);
    } 
    for (byte b = 1; hashMap.containsKey(IOHashMap + b + "_" + b); b++) {
      String str = IOHashMap + b + "_";
      str1 = (String)hashMap.get(a);
      if (hashMap.get(str + AInterfaceCharlie) != null && !((String)hashMap.get(str + AInterfaceCharlie)).isEmpty())
        str1 = str1 + " - " + (String)hashMap.get(str + AInterfaceCharlie); 
      str1 = str1 + " IP:" + paramString1;
      if (hashMap.get(str + i) != null && !((String)hashMap.get(str + i)).equals("0"))
        str1 = str1 + " In Use"; 
      AeInterfaceMikeTostring = new AeInterfaceMikeTostring();
      str5 = (String)hashMap.get(str + b);
      AeInterfaceMikeTostring.a(str5);
      AeInterfaceMikeTostring.b(str3);
      AeInterfaceMikeTostring.a(AInterfaceOscar.b(AeInterfaceMikeTostring));
      if (hashMap.get(str + g) != null && ((String)hashMap.get(str + g)).equalsIgnoreCase("UDP")) {
        this.r = AInterfaceOscar.b;
      } else if (hashMap.get(str + g) != null && ((String)hashMap.get(str + g)).equalsIgnoreCase("TCP")) {
        this.r = IOHashMap.b;
      } 
      str6 = IOHashMap.a + ":" + this.r;
      arrayList = new ArrayList<>();
      AInterfaceCharlie = new AInterfaceCharlie(IOHashMap.j, paramString1);
      arrayList.add(AInterfaceCharlie);
      AInterfaceCharlie = new AInterfaceCharlie(IOHashMap.k, hashMap.getOrDefault(str + f, "-1"));
      arrayList.add(AInterfaceCharlie);
      try {
        int i = Integer.parseInt((String)hashMap.getOrDefault(str + j, "-1"));
        AeInterfaceMikeTostring.a(i);
      } catch (Exception exception) {
        D.b("Unable to get CAN ID from broadcast");
      } 
      a(str1, str6, arrayList, AeInterfaceMikeTostring);
    } 
  }
  
  private void d() {
    DatagramSocket datagramSocket = new DatagramSocket();
    datagramSocket.setBroadcast(true);
    this.s = true;
    byte[] arrayOfByte = m.getBytes();
    DatagramPacket datagramPacket = new DatagramPacket(arrayOfByte, arrayOfByte.length, InetAddress.getByName("255.255.255.255"), this.p);
    datagramSocket.send(datagramPacket);
    if (t)
      System.out.println(">>> Request packet sent to: 255.255.255.255 (DEFAULT)"); 
    Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
    while (enumeration.hasMoreElements()) {
      NetworkInterface networkInterface = enumeration.nextElement();
      if (networkInterface.isLoopback() || !networkInterface.isUp())
        continue; 
      for (InterfaceAddress interfaceAddress : networkInterface.getInterfaceAddresses()) {
        InetAddress inetAddress = interfaceAddress.getBroadcast();
        if (inetAddress == null)
          continue; 
        try {
          datagramPacket = new DatagramPacket(arrayOfByte, arrayOfByte.length, inetAddress, this.p);
          datagramSocket.send(datagramPacket);
        } catch (Exception exception) {}
        if (t)
          System.out.println("Request packet sent to: " + inetAddress.getHostAddress() + "; Interface: " + networkInterface.getDisplayName()); 
      } 
    } 
    ArrayList<String> arrayList = new ArrayList();
    long IOHashMap = System.currentTimeMillis() + 1500L;
    datagramSocket.setSoTimeout(2500);
    while (true) {
      byte[] arrayOfByte1 = new byte[15000];
      DatagramPacket datagramPacket1 = new DatagramPacket(arrayOfByte1, arrayOfByte1.length);
      try {
        datagramSocket.receive(datagramPacket1);
        String str1 = (new String(datagramPacket1.getData())).trim();
        String str2 = "" + datagramPacket1.getAddress().getHostAddress();
        String str3 = str2 + str1;
        if (!arrayList.contains(str3) && str1.startsWith("slave:")) {
          a(str2, str1);
          arrayList.add(str3);
          boolean bool = false;
          if (bool) {
            a("192.168.0.122", "slave:BigStuff Gen4\nid:00.0.2\nserial:70-B3-D5-64-E0-0A\nport:21845\nprotocol:UDP\nconnectionState:0");
            a("192.168.0.123", "slave:RIM\nid:00.0.5\nserial:70-B3-D5-64-E0-B1\nport:21845\nprotocol:UDP\nconnectionState:0");
            a("192.168.0.124", "slave:RIM\nid:00.0.6\nserial:E0-B3-D5-64-E0-B2\nport:21845\nprotocol:UDP\nconnectionState:0");
          } 
        } 
      } catch (SocketTimeoutException socketTimeoutException) {}
      if (IOHashMap - System.currentTimeMillis() <= 0L) {
        datagramSocket.close();
        this.s = false;
        return;
      } 
    } 
  }
  
  public boolean b() {
    return this.s;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/B/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */