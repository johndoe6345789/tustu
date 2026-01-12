package E;

import bH.D;
import bH.c;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NetworkInEPackage {
  public static InetAddress a(String paramString) {
    InetAddress inetAddress;
    byte[] arrayOfByte = b(paramString);
    try {
      inetAddress = InetAddress.getByAddress(arrayOfByte);
    } catch (UnknownHostException unknownHostException) {
      throw new InvalidParameterException("Unknown host!");
    }
    return inetAddress;
  }

  public static byte[] b(String paramString) {
    String[] arrayOfString = paramString.split("\\.");
    if (arrayOfString.length != 4) throw new InvalidParameterException("Not a IP address!");
    int[] arrayOfInt = new int[4];
    for (byte b = 0; b < 4; b++) {
      arrayOfInt[b] = Integer.parseInt(arrayOfString[b]);
      if (arrayOfInt[b] < 0 || arrayOfInt[b] > 255)
        throw new InvalidParameterException("Invalid IP address!");
    }
    return new byte[] {
      (byte) arrayOfInt[0], (byte) arrayOfInt[1], (byte) arrayOfInt[2], (byte) arrayOfInt[3]
    };
  }

  public static int a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != 4)
      throw new InvalidParameterException("Byte array must have 4 elements.");
    return (paramArrayOfbyte[0] & 0xFF) << 24
        | (paramArrayOfbyte[1] & 0xFF) << 16
        | (paramArrayOfbyte[2] & 0xFF) << 8
        | paramArrayOfbyte[3] & 0xFF;
  }

  public static String a(int paramInt) {
    int[] arrayOfInt = {
      (paramInt & 0xFF000000) >>> 24,
      (paramInt & 0xFF0000) >>> 16,
      (paramInt & 0xFF00) >>> 8,
      paramInt & 0xFF
    };
    return String.format(
        "%d.%d.%d.%d",
        new Object[] {
          Integer.valueOf(arrayOfInt[0]),
          Integer.valueOf(arrayOfInt[1]),
          Integer.valueOf(arrayOfInt[2]),
          Integer.valueOf(arrayOfInt[3])
        });
  }

  public static String[] a(String paramString1, String paramString2) {
    int i = a(b(paramString1));
    int k = a(b(paramString2));
    ArrayList<String> arrayList = new ArrayList();
    for (int m = i; m <= k; m++) arrayList.add(a(m));
    String[] arrayOfString = new String[0];
    return arrayList.<String>toArray(arrayOfString);
  }

  public static String a() {
    String str = System.getenv("COMPUTERNAME");
    if (str == null || str.isEmpty()) str = System.getenv("USERDOMAIN_ROAMINGPROFILE");
    if (str == null || str.isEmpty()) str = System.getenv("USERDOMAIN");
    if (str == null || str.isEmpty())
      try {
        str = InetAddress.getLocalHost().getHostName();
      } catch (UnknownHostException unknownHostException) {
        Logger.getLogger(j.class.getName())
            .log(Level.WARNING, "Failed to get host name", unknownHostException);
      }
    return str;
  }

  public static InetAddress a(NetworkInterface paramNetworkInterface) {
    InetAddress inetAddress = null;
    Enumeration<InetAddress> enumeration = paramNetworkInterface.getInetAddresses();
    while (enumeration.hasMoreElements()) {
      InetAddress inetAddress1 = enumeration.nextElement();
      if ((inetAddress1.getAddress()).length == 4) inetAddress = inetAddress1;
    }
    return inetAddress;
  }

  public static String a(InetAddress paramInetAddress) {
    String str;
    if (paramInetAddress.getHostAddress().contains("/")) {
      str =
          paramInetAddress
              .getHostAddress()
              .substring(paramInetAddress.getHostAddress().lastIndexOf("/") + 1);
    } else {
      str = paramInetAddress.getHostAddress();
    }
    return str;
  }

  public static long b(NetworkInterface paramNetworkInterface) {
    try {
      byte[] arrayOfByte = paramNetworkInterface.getHardwareAddress();
      return c.b(arrayOfByte, 0, arrayOfByte.length, true, false);
    } catch (SocketException socketException) {
      D.a("unable to get MAC for: " + paramNetworkInterface);
      return -1L;
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/E/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
