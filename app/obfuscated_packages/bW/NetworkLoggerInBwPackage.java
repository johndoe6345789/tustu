package bW;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.logging.Logger;

public final class NetworkLoggerInBwPackage {
  private static final Logger a = Logger.getLogger(f.class.getName().toLowerCase());
  
  private NetworkLoggerInBwPackage() {
    throw new UnsupportedOperationException();
  }
  
  public static final e a(e parame, InetAddress paramInetAddress1, int paramInt, InetAddress paramInetAddress2, String paramString, c[] paramArrayOfc) {
    if (parame == null)
      throw new NullPointerException("request is null"); 
    if (!parame.n())
      throw new a("request is BOOTP"); 
    Byte byte_ = parame.w();
    if (byte_ == null)
      throw new a("request has no message type"); 
    if (byte_.byteValue() != 1)
      throw new a("request is not DHCPDISCOVER"); 
    if (paramInetAddress1 == null)
      throw new IllegalArgumentException("offeredAddress must not be null"); 
    if (!(paramInetAddress1 instanceof java.net.Inet4Address))
      throw new IllegalArgumentException("offeredAddress must be IPv4"); 
    e e1 = new e();
    e1.c((byte)2);
    e1.b(parame.m());
    e1.a(parame.l());
    e1.a(parame.t());
    e1.a(parame.i());
    e1.b(paramInetAddress1);
    e1.c(parame.k());
    e1.a(parame.c());
    e1.d((byte)2);
    e1.a((byte)51, paramInt);
    e1.a((byte)54, paramInetAddress2);
    e1.a((byte)56, paramString);
    if (paramArrayOfc != null)
      for (c c1 : paramArrayOfc)
        e1.a(c1.a(parame));  
    e1.a(a(parame, (byte)2));
    return e1;
  }
  
  public static final e b(e parame, InetAddress paramInetAddress1, int paramInt, InetAddress paramInetAddress2, String paramString, c[] paramArrayOfc) {
    if (parame == null)
      throw new NullPointerException("request is null"); 
    if (!parame.n())
      throw new a("request is BOOTP"); 
    Byte byte_ = parame.w();
    if (byte_ == null)
      throw new a("request has no message type"); 
    if (byte_.byteValue() != 3 && byte_.byteValue() != 8)
      throw new a("request is not DHCPREQUEST/DHCPINFORM"); 
    if (paramInetAddress1 == null)
      throw new IllegalArgumentException("offeredAddress must not be null"); 
    if (!(paramInetAddress1 instanceof java.net.Inet4Address))
      throw new IllegalArgumentException("offeredAddress must be IPv4"); 
    e e1 = new e();
    e1.c((byte)2);
    e1.b(parame.m());
    e1.a(parame.l());
    e1.a(parame.t());
    e1.a(parame.i());
    e1.b(parame.f());
    if (byte_.byteValue() != 8)
      e1.b(paramInetAddress1); 
    e1.c(parame.k());
    e1.a(parame.c());
    e1.d((byte)5);
    if (byte_.byteValue() == 3)
      e1.a((byte)51, paramInt); 
    e1.a((byte)54, paramInetAddress2);
    e1.a((byte)56, paramString);
    if (paramArrayOfc != null)
      for (c c1 : paramArrayOfc)
        e1.a(c1.a(parame));  
    e1.a(a(parame, (byte)5));
    return e1;
  }
  
  public static final e a(e parame, InetAddress paramInetAddress, String paramString) {
    if (parame == null)
      throw new NullPointerException("request is null"); 
    if (!parame.n())
      throw new a("request is BOOTP"); 
    Byte byte_ = parame.w();
    if (byte_ == null)
      throw new a("request has no message type"); 
    if (byte_.byteValue() != 3)
      throw new a("request is not DHCPREQUEST"); 
    e e1 = new e();
    e1.c((byte)2);
    e1.b(parame.m());
    e1.a(parame.l());
    e1.a(parame.t());
    e1.a(parame.i());
    e1.c(parame.k());
    e1.a(parame.c());
    e1.d((byte)6);
    e1.a((byte)54, paramInetAddress);
    e1.a((byte)56, paramString);
    e1.a(a(parame, (byte)6));
    return e1;
  }
  
  public static InetSocketAddress a(e parame, byte paramByte) {
    InetSocketAddress inetSocketAddress;
    if (parame == null)
      throw new IllegalArgumentException("request is null"); 
    InetAddress inetAddress1 = parame.j();
    InetAddress inetAddress2 = parame.e();
    switch (paramByte) {
      case 2:
      case 5:
        if (b.a.equals(inetAddress1)) {
          if (b.a.equals(inetAddress2)) {
            inetSocketAddress = new InetSocketAddress(b.b, 68);
          } else {
            inetSocketAddress = new InetSocketAddress(inetAddress2, 68);
          } 
        } else {
          inetSocketAddress = new InetSocketAddress(inetAddress1, 67);
        } 
        return inetSocketAddress;
      case 6:
        if (b.a.equals(inetAddress1)) {
          inetSocketAddress = new InetSocketAddress(b.b, 68);
        } else {
          inetSocketAddress = new InetSocketAddress(inetAddress1, 67);
        } 
        return inetSocketAddress;
    } 
    throw new IllegalArgumentException("responseType not valid");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bW/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */