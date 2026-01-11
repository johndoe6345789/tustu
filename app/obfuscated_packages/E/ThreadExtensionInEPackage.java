package E;

import bH.D;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadExtensionInEPackage extends Thread {
  d(String paramString) {
    super(paramString);
  }
  
  public void run() {
    byte b = 0;
    while (true) {
      try {
        Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
        while (enumeration.hasMoreElements()) {
          NetworkInterface networkInterface = enumeration.nextElement();
          StringBuilder stringBuilder = new StringBuilder(networkInterface.getName());
          stringBuilder.append(" - ").append(networkInterface.getDisplayName()).append(": ");
          Enumeration<InetAddress> enumeration1 = networkInterface.getInetAddresses();
          while (enumeration1.hasMoreElements()) {
            InetAddress inetAddress = enumeration1.nextElement();
            stringBuilder.append(inetAddress.getHostAddress()).append(", ");
          } 
          c c = (c)c.f.get(networkInterface.getName());
          if (networkInterface.isUp() && !networkInterface.isVirtual() && !networkInterface.getDisplayName().toLowerCase().contains("virtual") && !networkInterface.isLoopback() && c == null && !c.g.contains(networkInterface.getName())) {
            D.c("DHCP: Found NIC, Starting DHCP Server for: " + stringBuilder.toString());
            c = new c(networkInterface, true);
            c.start();
            c.f.put(networkInterface.getName(), c);
            continue;
          } 
          if (!networkInterface.isUp() && c != null) {
            c.b();
            D.c("DHCP: NIC went down, stopping DHCP for: " + networkInterface.getDisplayName());
            continue;
          } 
          if (c != null) {
            InetAddress inetAddress = j.a(networkInterface);
            if (!inetAddress.getHostAddress().equals(c.d.getHostAddress())) {
              D.c("DHCP: IP changed, resetting server socket. Expected: " + c.d.getHostAddress() + ", found" + inetAddress.getHostAddress());
              c.b();
            } 
          } 
        } 
      } catch (Exception exception) {}
      if (c.f.isEmpty() && b++ == 0)
        D.c("DHCP: No unserviced NIC's found, will continue to monitor."); 
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/E/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */