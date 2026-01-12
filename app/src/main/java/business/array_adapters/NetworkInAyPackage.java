package business.array_adapters;

import bH.D;
import bH.X;
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

public class NetworkInAyPackage {
  private int e = 21852;

  public static String a = "Service:";

  public static String b = "DISCOVER_HTTP_SERVICES";

  private g f = null;

  List c = new ArrayList();

  private boolean g = false;

  private static final Map h = new HashMap<>();

  static boolean d = true;

  private NetworkInAyPackage() {}

  private NetworkInAyPackage(int paramInt) {
    this.e = paramInt;
  }

  public static f a(int paramInt) {
    f f1 = (f) h.get(Integer.valueOf(paramInt));
    if (f1 == null) {
      f1 = new f(paramInt);
      h.put(Integer.valueOf(paramInt), f1);
    }
    return f1;
  }

  public static f a() {
    return a(21852);
  }

  public void a(e parame) {
    this.c.add(parame);
  }

  public void b() {
    if (this.f == null || !this.f.isAlive()) {
      this.f = new g(this);
      this.f.start();
    } else {
      this.f.a();
    }
  }

  private void a(c paramc) {
    for (e e : this.c) e.a(paramc);
  }

  private void c() {
    for (e e : this.c) e.a();
  }

  private void d() {
    for (e e : this.c) e.b();
  }

  private void a(String paramString1, String paramString2) {
    ArrayList<c> arrayList = new ArrayList();
    c c = null;
    StringTokenizer stringTokenizer = new StringTokenizer(paramString2, "\n");
    while (stringTokenizer.hasMoreTokens()) {
      try {
        String str = stringTokenizer.nextToken();
        if (str.startsWith(a)) {
          String str1 = str.substring(a.length());
          c = new c(str1, paramString1);
          arrayList.add(c);
          continue;
        }
        if (c != null) {
          String str1 = str.substring(0, str.indexOf("="));
          String str2 = str.substring(str.indexOf("=") + 1, str.length());
          str2 = a(c, str2);
          c.a(str1, str2);
          continue;
        }
        D.c("Service Attribute given, but no service defined? " + str);
      } catch (Exception exception) {
      }
    }
    for (c c1 : arrayList) a(c1);
  }

  private String a(c paramc, String paramString) {
    if (paramString.contains("$ipAddress"))
      paramString = X.b(paramString, "$ipAddress", paramc.c());
    return paramString;
  }

  private void e() {
    c();
    DatagramSocket datagramSocket = new DatagramSocket();
    datagramSocket.setBroadcast(true);
    this.g = true;
    byte[] arrayOfByte = b.getBytes();
    DatagramPacket datagramPacket =
        new DatagramPacket(
            arrayOfByte, arrayOfByte.length, InetAddress.getByName("255.255.255.255"), this.e);
    datagramSocket.send(datagramPacket);
    Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
    while (enumeration.hasMoreElements()) {
      NetworkInterface networkInterface = enumeration.nextElement();
      if (networkInterface.isLoopback() || !networkInterface.isUp()) continue;
      for (InterfaceAddress interfaceAddress : networkInterface.getInterfaceAddresses()) {
        InetAddress inetAddress = interfaceAddress.getBroadcast();
        if (inetAddress == null) continue;
        try {
          datagramPacket = new DatagramPacket(arrayOfByte, arrayOfByte.length, inetAddress, this.e);
          datagramSocket.send(datagramPacket);
        } catch (Exception exception) {
        }
      }
    }
    ArrayList<String> arrayList = new ArrayList();
    long l = System.currentTimeMillis() + 1500L;
    datagramSocket.setSoTimeout(2500);
    while (true) {
      byte[] arrayOfByte1 = new byte[15000];
      DatagramPacket datagramPacket1 = new DatagramPacket(arrayOfByte1, arrayOfByte1.length);
      try {
        datagramSocket.receive(datagramPacket1);
        String str1 = (new String(datagramPacket1.getData())).trim();
        String str2 = "" + datagramPacket1.getAddress().getHostAddress();
        String str3 = str2 + str1;
        if (!arrayList.contains(str3) && str1.startsWith(a)) {
          a(str2, str1);
          arrayList.add(str3);
          boolean bool = false;
          if (bool)
            a(
                "192.168.0.122",
                a
                    + "LogFileServer\n"
                    + "Link=http://192.168.4.77:16680/LogFileActions\n"
                    + "supportsList=true\n"
                    + "supportsDownload=true\n"
                    + "supportsDelete=true\n");
        }
      } catch (SocketTimeoutException socketTimeoutException) {
      }
      if (l - System.currentTimeMillis() <= 0L) {
        datagramSocket.close();
        this.g = false;
        return;
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ay/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
