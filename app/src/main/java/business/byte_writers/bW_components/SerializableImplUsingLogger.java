package business.byte_writers.bW_components;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SerializableImplUsingLogger implements Serializable {
  private static final Logger c;
  
  private final byte d;
  
  private final byte[] e;
  
  private final boolean f;
  
  private static final Object[] g;
  
  static final Map a;
  
  public SerializableImplUsingLogger(byte paramByte, byte[] paramArrayOfbyte, boolean paramBoolean) {
    if (paramByte == 0)
      throw new IllegalArgumentException("code=0 is not allowed (reserved for padding"); 
    if (paramByte == -1)
      throw new IllegalArgumentException("code=-1 is not allowed (reserved for End Of Options)"); 
    this.d = paramByte;
    this.e = (paramArrayOfbyte != null) ? (byte[])paramArrayOfbyte.clone() : null;
    this.f = paramBoolean;
  }
  
  public SerializableImplUsingLogger(byte paramByte, byte[] paramArrayOfbyte) {
    this(paramByte, paramArrayOfbyte, false);
  }
  
  public byte a() {
    return this.d;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof c))
      return false; 
    c c1 = (c)paramObject;
    return (c1.d == this.d && c1.f == this.f && Arrays.equals(c1.e, this.e));
  }
  
  public int hashCode() {
    return this.d ^ Arrays.hashCode(this.e) ^ (this.f ? Integer.MIN_VALUE : 0);
  }
  
  public byte[] b() {
    return this.e;
  }
  
  public static final boolean a(byte paramByte) {
    return d.f.equals(a.get(Byte.valueOf(paramByte)));
  }
  
  public static c a(byte paramByte1, byte paramByte2) {
    if (!a(paramByte1))
      throw new IllegalArgumentException("DHCP option type (" + paramByte1 + ") is not byte"); 
    return new c(paramByte1, h(paramByte2));
  }
  
  public byte c() {
    if (!a(this.d))
      throw new IllegalArgumentException("DHCP option type (" + this.d + ") is not byte"); 
    if (this.e == null)
      throw new IllegalStateException("value is null"); 
    if (this.e.length != 1)
      throw new a("option " + this.d + " is wrong size:" + this.e.length + " should be 1"); 
    return this.e[0];
  }
  
  public static final boolean b(byte paramByte) {
    return d.d.equals(a.get(Byte.valueOf(paramByte)));
  }
  
  public short d() {
    if (!b(this.d))
      throw new IllegalArgumentException("DHCP option type (" + this.d + ") is not short"); 
    if (this.e == null)
      throw new IllegalStateException("value is null"); 
    if (this.e.length != 2)
      throw new a("option " + this.d + " is wrong size:" + this.e.length + " should be 2"); 
    return (short)((this.e[0] & 0xFF) << 8 | this.e[1] & 0xFF);
  }
  
  public static final boolean c(byte paramByte) {
    return d.c.equals(a.get(Byte.valueOf(paramByte)));
  }
  
  public int e() {
    if (!c(this.d))
      throw new IllegalArgumentException("DHCP option type (" + this.d + ") is not int"); 
    if (this.e == null)
      throw new IllegalStateException("value is null"); 
    if (this.e.length != 4)
      throw new a("option " + this.d + " is wrong size:" + this.e.length + " should be 4"); 
    return (this.e[0] & 0xFF) << 24 | (this.e[1] & 0xFF) << 16 | (this.e[2] & 0xFF) << 8 | this.e[3] & 0xFF;
  }
  
  public static final boolean d(byte paramByte) {
    return d.a.equals(a.get(Byte.valueOf(paramByte)));
  }
  
  public InetAddress f() {
    if (!d(this.d))
      throw new IllegalArgumentException("DHCP option type (" + this.d + ") is not InetAddr"); 
    if (this.e == null)
      throw new IllegalStateException("value is null"); 
    if (this.e.length != 4)
      throw new a("option " + this.d + " is wrong size:" + this.e.length + " should be 4"); 
    try {
      return InetAddress.getByAddress(this.e);
    } catch (UnknownHostException unknownHostException) {
      c.log(Level.SEVERE, "Unexpected UnknownHostException", unknownHostException);
      return null;
    } 
  }
  
  public static final boolean e(byte paramByte) {
    return d.h.equals(a.get(Byte.valueOf(paramByte)));
  }
  
  public String g() {
    if (!e(this.d))
      throw new IllegalArgumentException("DHCP option type (" + this.d + ") is not String"); 
    if (this.e == null)
      throw new IllegalStateException("value is null"); 
    return e.f(this.e);
  }
  
  public static final boolean f(byte paramByte) {
    return d.e.equals(a.get(Byte.valueOf(paramByte)));
  }
  
  public short[] h() {
    if (!f(this.d))
      throw new IllegalArgumentException("DHCP option type (" + this.d + ") is not short[]"); 
    if (this.e == null)
      throw new IllegalStateException("value is null"); 
    if (this.e.length % 2 != 0)
      throw new a("option " + this.d + " is wrong size:" + this.e.length + " should be 2*X"); 
    short[] arrayOfShort = new short[this.e.length / 2];
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.e.length; b2 += 2) {
      arrayOfShort[b1] = (short)((this.e[b2] & 0xFF) << 8 | this.e[b2 + 1] & 0xFF);
      b1++;
    } 
    return arrayOfShort;
  }
  
  public static final boolean g(byte paramByte) {
    return d.b.equals(a.get(Byte.valueOf(paramByte)));
  }
  
  public InetAddress[] i() {
    if (!g(this.d))
      throw new IllegalArgumentException("DHCP option type (" + this.d + ") is not InetAddr[]"); 
    if (this.e == null)
      throw new IllegalStateException("value is null"); 
    if (this.e.length % 4 != 0)
      throw new a("option " + this.d + " is wrong size:" + this.e.length + " should be 4*X"); 
    try {
      byte[] arrayOfByte = new byte[4];
      InetAddress[] arrayOfInetAddress = new InetAddress[this.e.length / 4];
      byte b1 = 0;
      for (byte b2 = 0; b2 < this.e.length; b2 += 4) {
        arrayOfByte[0] = this.e[b2];
        arrayOfByte[1] = this.e[b2 + 1];
        arrayOfByte[2] = this.e[b2 + 2];
        arrayOfByte[3] = this.e[b2 + 3];
        arrayOfInetAddress[b1] = InetAddress.getByAddress(arrayOfByte);
        b1++;
      } 
      return arrayOfInetAddress;
    } catch (UnknownHostException unknownHostException) {
      c.log(Level.SEVERE, "Unexpected UnknownHostException", unknownHostException);
      return null;
    } 
  }
  
  public static c a(byte paramByte, int paramInt) {
    if (!c(paramByte))
      throw new IllegalArgumentException("DHCP option type (" + paramByte + ") is not int"); 
    return new c(paramByte, a(paramInt));
  }
  
  public static c a(byte paramByte, InetAddress paramInetAddress) {
    if (!d(paramByte) && !g(paramByte))
      throw new IllegalArgumentException("DHCP option type (" + paramByte + ") is not InetAddress"); 
    return new c(paramByte, a(paramInetAddress));
  }
  
  public static c a(byte paramByte, String paramString) {
    if (!e(paramByte))
      throw new IllegalArgumentException("DHCP option type (" + paramByte + ") is not string"); 
    return new c(paramByte, e.a(paramString));
  }
  
  public c a(e parame) {
    if (parame == null)
      throw new NullPointerException("request is null"); 
    if (this.f) {
      c c1 = parame.h(a());
      return (c1 != null) ? c1 : this;
    } 
    return this;
  }
  
  public void a(StringBuilder paramStringBuilder) {
    if (b.f.containsKey(Byte.valueOf(this.d)))
      paramStringBuilder.append((String)b.f.get(Byte.valueOf(this.d))); 
    paramStringBuilder.append('(').append(i(this.d)).append(")=");
    if (this.f)
      paramStringBuilder.append("<mirror>"); 
    if (this.e == null) {
      paramStringBuilder.append("<null>");
    } else if (this.d == 53) {
      Byte byte_ = Byte.valueOf(c());
      if (b.e.containsKey(byte_)) {
        paramStringBuilder.append((String)b.e.get(byte_));
      } else {
        paramStringBuilder.append(byte_);
      } 
    } else if (this.d == 77) {
      paramStringBuilder.append(b(this.e));
    } else if (this.d == 82) {
      paramStringBuilder.append(c(this.e));
    } else if (a.containsKey(Byte.valueOf(this.d))) {
      try {
        switch (((d)a.get(Byte.valueOf(this.d))).ordinal()) {
          case 0:
            e.a(paramStringBuilder, f());
            return;
          case 1:
            for (InetAddress inetAddress : i()) {
              e.a(paramStringBuilder, inetAddress);
              paramStringBuilder.append(' ');
            } 
            return;
          case 2:
            paramStringBuilder.append(e());
            return;
          case 3:
            paramStringBuilder.append(d());
            return;
          case 4:
            for (short s : h())
              paramStringBuilder.append(s).append(' '); 
            return;
          case 5:
            paramStringBuilder.append(c());
            return;
          case 7:
            paramStringBuilder.append('"').append(g()).append('"');
            return;
          case 6:
            if (this.e != null)
              for (byte b : this.e)
                paramStringBuilder.append(i(b)).append(' ');  
            return;
        } 
        paramStringBuilder.append("0x");
        e.a(paramStringBuilder, this.e);
      } catch (IllegalArgumentException illegalArgumentException) {
        paramStringBuilder.append("0x");
        e.a(paramStringBuilder, this.e);
      } 
    } else {
      paramStringBuilder.append("0x");
      e.a(paramStringBuilder, this.e);
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    a(stringBuilder);
    return stringBuilder.toString();
  }
  
  private static int i(byte paramByte) {
    return paramByte & 0xFF;
  }
  
  public static byte[] h(byte paramByte) {
    return new byte[] { paramByte };
  }
  
  public static byte[] a(int paramInt) {
    return new byte[] { (byte)((paramInt & 0xFF000000) >>> 24), (byte)((paramInt & 0xFF0000) >>> 16), (byte)((paramInt & 0xFF00) >>> 8), (byte)(paramInt & 0xFF) };
  }
  
  public static byte[] a(InetAddress paramInetAddress) {
    if (paramInetAddress == null)
      return null; 
    if (!(paramInetAddress instanceof java.net.Inet4Address))
      throw new IllegalArgumentException("Adress must be of subclass Inet4Address"); 
    return paramInetAddress.getAddress();
  }
  
  public static List a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      return null; 
    LinkedList<String> linkedList = new LinkedList();
    for (int i = 0; i < paramArrayOfbyte.length; i += j) {
      int j = i(paramArrayOfbyte[i++]);
      int k = paramArrayOfbyte.length - i;
      if (j > k)
        j = k; 
      linkedList.add(e.a(paramArrayOfbyte, i, j));
    } 
    return linkedList;
  }
  
  public static String b(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      return null; 
    List list = a(paramArrayOfbyte);
    Iterator<String> iterator = list.iterator();
    StringBuffer stringBuffer = new StringBuffer();
    while (iterator.hasNext()) {
      stringBuffer.append('"').append(iterator.next()).append('"');
      if (iterator.hasNext())
        stringBuffer.append(','); 
    } 
    return stringBuffer.toString();
  }
  
  public static String c(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      return null; 
    Map map = d(paramArrayOfbyte);
    StringBuffer stringBuffer = new StringBuffer();
    for (Map.Entry entry : map.entrySet()) {
      stringBuffer.append('{').append(i(((Byte)entry.getKey()).byteValue())).append("}\"");
      stringBuffer.append((String)entry.getValue()).append('"');
      stringBuffer.append(',');
    } 
    if (stringBuffer.length() > 0)
      stringBuffer.setLength(stringBuffer.length() - 1); 
    return stringBuffer.toString();
  }
  
  public static final Map d(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      return null; 
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    for (int i = 0; i < paramArrayOfbyte.length && paramArrayOfbyte.length - i >= 2; i += j) {
      Byte byte_ = Byte.valueOf(paramArrayOfbyte[i++]);
      int j = i(paramArrayOfbyte[i++]);
      int k = paramArrayOfbyte.length - i;
      if (j > k)
        j = k; 
      linkedHashMap.put(byte_, e.a(paramArrayOfbyte, i, j));
    } 
    return linkedHashMap;
  }
  
  static {
    c = Logger.getLogger(c.class.getName().toLowerCase());
    g = new Object[] { 
        Byte.valueOf((byte)1), d.a, Byte.valueOf((byte)2), d.c, Byte.valueOf((byte)3), d.b, Byte.valueOf((byte)4), d.b, Byte.valueOf((byte)5), d.b, 
        Byte.valueOf((byte)6), d.b, Byte.valueOf((byte)7), d.b, Byte.valueOf((byte)8), d.b, Byte.valueOf((byte)9), d.b, Byte.valueOf((byte)10), d.b, 
        Byte.valueOf((byte)11), d.b, Byte.valueOf((byte)12), d.h, Byte.valueOf((byte)13), d.d, Byte.valueOf((byte)14), d.h, Byte.valueOf((byte)15), d.h, 
        Byte.valueOf((byte)16), d.a, Byte.valueOf((byte)17), d.h, Byte.valueOf((byte)18), d.h, Byte.valueOf((byte)19), d.f, Byte.valueOf((byte)20), d.f, 
        Byte.valueOf((byte)21), d.b, Byte.valueOf((byte)22), d.d, Byte.valueOf((byte)23), d.f, Byte.valueOf((byte)24), d.c, Byte.valueOf((byte)25), d.e, 
        Byte.valueOf((byte)26), d.d, Byte.valueOf((byte)27), d.f, Byte.valueOf((byte)28), d.a, Byte.valueOf((byte)29), d.f, Byte.valueOf((byte)30), d.f, 
        Byte.valueOf((byte)31), d.f, Byte.valueOf((byte)32), d.a, Byte.valueOf((byte)33), d.b, Byte.valueOf((byte)34), d.f, Byte.valueOf((byte)35), d.c, 
        Byte.valueOf((byte)36), d.f, Byte.valueOf((byte)37), d.f, Byte.valueOf((byte)38), d.c, Byte.valueOf((byte)39), d.f, Byte.valueOf((byte)41), d.b, 
        Byte.valueOf((byte)42), d.b, Byte.valueOf((byte)44), d.b, Byte.valueOf((byte)45), d.b, Byte.valueOf((byte)46), d.f, Byte.valueOf((byte)47), d.h, 
        Byte.valueOf((byte)48), d.b, Byte.valueOf((byte)49), d.b, Byte.valueOf((byte)50), d.a, Byte.valueOf((byte)51), d.c, Byte.valueOf((byte)52), d.f, 
        Byte.valueOf((byte)53), d.f, Byte.valueOf((byte)54), d.a, Byte.valueOf((byte)55), d.g, Byte.valueOf((byte)56), d.h, Byte.valueOf((byte)57), d.d, 
        Byte.valueOf((byte)58), d.c, Byte.valueOf((byte)59), d.c, Byte.valueOf((byte)60), d.h, Byte.valueOf((byte)62), d.h, Byte.valueOf((byte)64), d.h, 
        Byte.valueOf((byte)65), d.h, Byte.valueOf((byte)66), d.h, Byte.valueOf((byte)67), d.h, Byte.valueOf((byte)68), d.b, Byte.valueOf((byte)69), d.b, 
        Byte.valueOf((byte)70), d.b, Byte.valueOf((byte)71), d.b, Byte.valueOf((byte)72), d.b, Byte.valueOf((byte)73), d.b, Byte.valueOf((byte)74), d.b, 
        Byte.valueOf((byte)75), d.b, Byte.valueOf((byte)76), d.b, Byte.valueOf((byte)85), d.b, Byte.valueOf((byte)86), d.h, Byte.valueOf((byte)87), d.h, 
        Byte.valueOf((byte)91), d.c, Byte.valueOf((byte)92), d.b, Byte.valueOf((byte)98), d.h, Byte.valueOf((byte)116), d.f, Byte.valueOf((byte)117), d.e, 
        Byte.valueOf((byte)118), d.a, Byte.valueOf((byte)119), d.h };
    a = new LinkedHashMap<>();
    for (byte b = 0; b < g.length / 2; b++)
      a.put((Byte)g[b * 2], (d)g[b * 2 + 1]); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bW/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */