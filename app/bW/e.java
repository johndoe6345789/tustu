package bW;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class e implements Cloneable {
  private static final Logger b;
  
  private String c = "";
  
  private byte d = 2;
  
  private byte e = 1;
  
  private byte f = 6;
  
  private byte g;
  
  private int h;
  
  private short i;
  
  private short j;
  
  private byte[] k = new byte[4];
  
  private byte[] l = new byte[4];
  
  private byte[] m = new byte[4];
  
  private byte[] n = new byte[4];
  
  private byte[] o = new byte[16];
  
  private byte[] p = new byte[64];
  
  private byte[] q = new byte[128];
  
  private Map r = new LinkedHashMap<>();
  
  private boolean s = true;
  
  private boolean t;
  
  private byte[] u = new byte[0];
  
  private InetAddress v;
  
  private int w;
  
  private static final char[] x;
  
  public static e a(DatagramPacket paramDatagramPacket) {
    if (paramDatagramPacket == null)
      throw new IllegalArgumentException("datagram is null"); 
    e e1 = new e();
    e1.a(paramDatagramPacket.getData(), paramDatagramPacket.getOffset(), paramDatagramPacket.getLength(), paramDatagramPacket.getAddress(), paramDatagramPacket.getPort(), true);
    return e1;
  }
  
  public e a() {
    try {
      e e1 = (e)super.clone();
      e1.k = (byte[])this.k.clone();
      e1.l = (byte[])this.l.clone();
      e1.m = (byte[])this.m.clone();
      e1.n = (byte[])this.n.clone();
      e1.o = (byte[])this.o.clone();
      e1.p = (byte[])this.p.clone();
      e1.q = (byte[])this.q.clone();
      e1.r = new LinkedHashMap<>(this.r);
      e1.u = (byte[])this.u.clone();
      e1.t = false;
      return e1;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new InternalError();
    } 
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof e))
      return false; 
    e e1 = (e)paramObject;
    boolean bool3 = this.c.equals(e1.c);
    int j = bool3 & ((this.d == e1.d) ? 1 : 0);
    j &= (this.e == e1.e) ? 1 : 0;
    j &= (this.f == e1.f) ? 1 : 0;
    j &= (this.g == e1.g) ? 1 : 0;
    j &= (this.h == e1.h) ? 1 : 0;
    j &= (this.i == e1.i) ? 1 : 0;
    j &= (this.j == e1.j) ? 1 : 0;
    boolean bool2 = j & Arrays.equals(this.k, e1.k);
    bool2 &= Arrays.equals(this.l, e1.l);
    bool2 &= Arrays.equals(this.m, e1.m);
    bool2 &= Arrays.equals(this.n, e1.n);
    bool2 &= Arrays.equals(this.o, e1.o);
    bool2 &= Arrays.equals(this.p, e1.p);
    bool2 &= Arrays.equals(this.q, e1.q);
    bool2 &= this.r.equals(e1.r);
    int i = bool2 & ((this.s == e1.s) ? 1 : 0);
    boolean bool1 = i & Arrays.equals(this.u, e1.u);
    bool1 &= a(this.v, e1.v);
    return bool1 & ((this.w == e1.w) ? 1 : 0);
  }
  
  public int hashCode() {
    int i = -1;
    i ^= this.c.hashCode();
    i += this.d;
    i += this.e;
    i += this.f;
    i += this.g;
    i += this.h;
    i += this.i;
    i ^= this.j;
    i ^= Arrays.hashCode(this.k);
    i ^= Arrays.hashCode(this.l);
    i ^= Arrays.hashCode(this.m);
    i ^= Arrays.hashCode(this.n);
    i ^= Arrays.hashCode(this.o);
    i ^= Arrays.hashCode(this.p);
    i ^= Arrays.hashCode(this.q);
    i ^= this.r.hashCode();
    i += this.s ? 1 : 0;
    i ^= Arrays.hashCode(this.u);
    i ^= (this.v != null) ? this.v.hashCode() : 0;
    i += this.w;
    return i;
  }
  
  private static boolean a(Object paramObject1, Object paramObject2) {
    return (paramObject1 == null) ? ((paramObject2 == null)) : paramObject1.equals(paramObject2);
  }
  
  private void A() {
    if (!a && this.c == null)
      throw new AssertionError(); 
    if (!a && this.k == null)
      throw new AssertionError(); 
    if (!a && this.k.length != 4)
      throw new AssertionError(); 
    if (!a && this.l == null)
      throw new AssertionError(); 
    if (!a && this.l.length != 4)
      throw new AssertionError(); 
    if (!a && this.m == null)
      throw new AssertionError(); 
    if (!a && this.m.length != 4)
      throw new AssertionError(); 
    if (!a && this.n == null)
      throw new AssertionError(); 
    if (!a && this.n.length != 4)
      throw new AssertionError(); 
    if (!a && this.o == null)
      throw new AssertionError(); 
    if (!a && this.o.length != 16)
      throw new AssertionError(); 
    if (!a && this.p == null)
      throw new AssertionError(); 
    if (!a && this.p.length != 64)
      throw new AssertionError(); 
    if (!a && this.q == null)
      throw new AssertionError(); 
    if (!a && this.q.length != 128)
      throw new AssertionError(); 
    if (!a && this.u == null)
      throw new AssertionError(); 
    if (!a && this.r == null)
      throw new AssertionError(); 
    for (Map.Entry entry : this.r.entrySet()) {
      Byte byte_ = (Byte)entry.getKey();
      c c = (c)entry.getValue();
      if (!a && byte_ == null)
        throw new AssertionError(); 
      if (!a && byte_.byteValue() == 0)
        throw new AssertionError(); 
      if (!a && byte_.byteValue() == -1)
        throw new AssertionError(); 
      if (!a && c == null)
        throw new AssertionError(); 
      if (!a && c.a() != byte_.byteValue())
        throw new AssertionError(); 
      if (!a && c.b() == null)
        throw new AssertionError(); 
    } 
  }
  
  protected e a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, InetAddress paramInetAddress, int paramInt3, boolean paramBoolean) {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("null buffer not allowed"); 
    if (paramInt1 < 0)
      throw new IndexOutOfBoundsException("negative offset not allowed"); 
    if (paramInt2 < 0)
      throw new IllegalArgumentException("negative length not allowed"); 
    if (paramArrayOfbyte.length < paramInt1 + paramInt2)
      throw new IndexOutOfBoundsException("offset+length exceeds buffer length"); 
    if (paramInt2 < 236)
      throw new a("DHCP Packet too small (" + paramInt2 + ") absolute minimum is " + 'ì'); 
    if (paramInt2 > 1500)
      throw new a("DHCP Packet too big (" + paramInt2 + ") max MTU is " + 'ל'); 
    this.v = paramInetAddress;
    this.w = paramInt3;
    try {
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte, paramInt1, paramInt2);
      DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
      this.d = dataInputStream.readByte();
      this.e = dataInputStream.readByte();
      this.f = dataInputStream.readByte();
      this.g = dataInputStream.readByte();
      this.h = dataInputStream.readInt();
      this.i = dataInputStream.readShort();
      this.j = dataInputStream.readShort();
      dataInputStream.readFully(this.k, 0, 4);
      dataInputStream.readFully(this.l, 0, 4);
      dataInputStream.readFully(this.m, 0, 4);
      dataInputStream.readFully(this.n, 0, 4);
      dataInputStream.readFully(this.o, 0, 16);
      dataInputStream.readFully(this.p, 0, 64);
      dataInputStream.readFully(this.q, 0, 128);
      this.s = true;
      byteArrayInputStream.mark(4);
      if (dataInputStream.readInt() != 1669485411) {
        this.s = false;
        byteArrayInputStream.reset();
      } 
      if (this.s) {
        byte b = 0;
        while (true) {
          int i = byteArrayInputStream.read();
          if (i < 0)
            break; 
          b = (byte)i;
          if (b == 0)
            continue; 
          if (b == -1)
            break; 
          i = byteArrayInputStream.read();
          if (i < 0)
            break; 
          int j = Math.min(i, byteArrayInputStream.available());
          byte[] arrayOfByte = new byte[j];
          byteArrayInputStream.read(arrayOfByte);
          a(new c((byte)b, arrayOfByte));
        } 
        this.t = (b != -1);
        if (paramBoolean && this.t)
          throw new a("Packet seams to be truncated"); 
      } 
      this.u = new byte[byteArrayInputStream.available()];
      byteArrayInputStream.read(this.u);
      A();
      return this;
    } catch (IOException iOException) {
      throw new a("IOException: " + iOException.toString(), iOException);
    } 
  }
  
  public byte[] b() {
    char c = 'ì';
    if (this.s)
      c += '@'; 
    return a(c, 576);
  }
  
  public byte[] a(int paramInt1, int paramInt2) {
    A();
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(750);
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeByte(this.d);
      dataOutputStream.writeByte(this.e);
      dataOutputStream.writeByte(this.f);
      dataOutputStream.writeByte(this.g);
      dataOutputStream.writeInt(this.h);
      dataOutputStream.writeShort(this.i);
      dataOutputStream.writeShort(this.j);
      dataOutputStream.write(this.k, 0, 4);
      dataOutputStream.write(this.l, 0, 4);
      dataOutputStream.write(this.m, 0, 4);
      dataOutputStream.write(this.n, 0, 4);
      dataOutputStream.write(this.o, 0, 16);
      dataOutputStream.write(this.p, 0, 64);
      dataOutputStream.write(this.q, 0, 128);
      if (this.s) {
        dataOutputStream.writeInt(1669485411);
        for (c c : x()) {
          if (!a && c == null)
            throw new AssertionError(); 
          if (!a && c.a() == 0)
            throw new AssertionError(); 
          if (!a && c.a() == -1)
            throw new AssertionError(); 
          if (!a && c.b() == null)
            throw new AssertionError(); 
          int j = (c.b()).length;
          if (!a && j < 0)
            throw new AssertionError(); 
          if (j > 255)
            throw new a("Options larger than 255 bytes are not yet supported"); 
          dataOutputStream.writeByte(c.a());
          dataOutputStream.writeByte(j);
          dataOutputStream.write(c.b());
        } 
        dataOutputStream.writeByte(-1);
      } 
      dataOutputStream.write(this.u);
      int i = paramInt1 - byteArrayOutputStream.size();
      if (i > 0) {
        byte[] arrayOfByte1 = new byte[i];
        dataOutputStream.write(arrayOfByte1);
      } 
      byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
      if (arrayOfByte.length > 1500)
        throw new a("serialize: packet too big (" + arrayOfByte.length + " greater than max MAX_MTU (" + 'ל' + ')'); 
      return arrayOfByte;
    } catch (IOException iOException) {
      b.log(Level.SEVERE, "Unexpected Exception", iOException);
      throw new a("IOException raised: " + iOException.toString());
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    try {
      stringBuilder.append(this.s ? "DHCP Packet" : "BOOTP Packet").append("\ncomment=").append(this.c).append("\naddress=").append((this.v != null) ? this.v.getHostAddress() : "").append('(').append(this.w).append(')').append("\nop=");
      Object object1 = b.c.get(Byte.valueOf(this.d));
      if (object1 != null) {
        stringBuilder.append(object1).append('(').append(this.d).append(')');
      } else {
        stringBuilder.append(this.d);
      } 
      stringBuilder.append("\nhtype=");
      Object object2 = b.d.get(Byte.valueOf(this.e));
      if (object2 != null) {
        stringBuilder.append(object2).append('(').append(this.e).append(')');
      } else {
        stringBuilder.append(this.e);
      } 
      stringBuilder.append("\nhlen=").append(this.f).append("\nhops=").append(this.g).append("\nxid=0x");
      a(stringBuilder, this.h);
      stringBuilder.append("\nsecs=").append(this.i).append("\nflags=0x").append(Integer.toHexString(this.j)).append("\nciaddr=");
      a(stringBuilder, InetAddress.getByAddress(this.k));
      stringBuilder.append("\nyiaddr=");
      a(stringBuilder, InetAddress.getByAddress(this.l));
      stringBuilder.append("\nsiaddr=");
      a(stringBuilder, InetAddress.getByAddress(this.m));
      stringBuilder.append("\ngiaddr=");
      a(stringBuilder, InetAddress.getByAddress(this.n));
      stringBuilder.append("\nchaddr=0x");
      a(stringBuilder);
      stringBuilder.append("\nsname=").append(s()).append("\nfile=").append(h());
      if (this.s) {
        stringBuilder.append("\nOptions follows:");
        for (c c : x()) {
          stringBuilder.append('\n');
          c.a(stringBuilder);
        } 
      } 
      stringBuilder.append("\npadding[").append(this.u.length).append("]=");
      a(stringBuilder, this.u);
    } catch (Exception exception) {}
    return stringBuilder.toString();
  }
  
  public byte[] c() {
    return (byte[])this.o.clone();
  }
  
  private StringBuilder a(StringBuilder paramStringBuilder) {
    a(paramStringBuilder, this.o, 0, this.f & 0xFF);
    return paramStringBuilder;
  }
  
  public String d() {
    return a(new StringBuilder(this.f & 0xFF)).toString();
  }
  
  public void a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null) {
      if (paramArrayOfbyte.length > this.o.length)
        throw new IllegalArgumentException("chaddr is too long: " + paramArrayOfbyte.length + ", max is: " + this.o.length); 
      Arrays.fill(this.o, (byte)0);
      System.arraycopy(paramArrayOfbyte, 0, this.o, 0, paramArrayOfbyte.length);
    } else {
      Arrays.fill(this.o, (byte)0);
    } 
  }
  
  public InetAddress e() {
    try {
      return InetAddress.getByAddress(f());
    } catch (UnknownHostException unknownHostException) {
      b.log(Level.SEVERE, "Unexpected UnknownHostException", unknownHostException);
      return null;
    } 
  }
  
  public byte[] f() {
    return (byte[])this.k.clone();
  }
  
  public void b(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != 4)
      throw new IllegalArgumentException("4-byte array required"); 
    System.arraycopy(paramArrayOfbyte, 0, this.k, 0, 4);
  }
  
  public byte[] g() {
    return (byte[])this.q.clone();
  }
  
  public String h() {
    return f(g());
  }
  
  public short i() {
    return this.j;
  }
  
  public void a(short paramShort) {
    this.j = paramShort;
  }
  
  public InetAddress j() {
    try {
      return InetAddress.getByAddress(k());
    } catch (UnknownHostException unknownHostException) {
      b.log(Level.SEVERE, "Unexpected UnknownHostException", unknownHostException);
      return null;
    } 
  }
  
  public byte[] k() {
    return (byte[])this.n.clone();
  }
  
  public void c(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != 4)
      throw new IllegalArgumentException("4-byte array required"); 
    System.arraycopy(paramArrayOfbyte, 0, this.n, 0, 4);
  }
  
  public byte l() {
    return this.f;
  }
  
  public void a(byte paramByte) {
    this.f = paramByte;
  }
  
  public byte m() {
    return this.e;
  }
  
  public void b(byte paramByte) {
    this.e = paramByte;
  }
  
  public boolean n() {
    return this.s;
  }
  
  public byte o() {
    return this.d;
  }
  
  public void c(byte paramByte) {
    this.d = paramByte;
  }
  
  public InetAddress p() {
    try {
      return InetAddress.getByAddress(q());
    } catch (UnknownHostException unknownHostException) {
      b.log(Level.SEVERE, "Unexpected UnknownHostException", unknownHostException);
      return null;
    } 
  }
  
  public byte[] q() {
    return (byte[])this.m.clone();
  }
  
  public void a(InetAddress paramInetAddress) {
    if (!(paramInetAddress instanceof java.net.Inet4Address))
      throw new IllegalArgumentException("Inet4Address required"); 
    d(paramInetAddress.getAddress());
  }
  
  public void d(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != 4)
      throw new IllegalArgumentException("4-byte array required"); 
    System.arraycopy(paramArrayOfbyte, 0, this.m, 0, 4);
  }
  
  public byte[] r() {
    return (byte[])this.p.clone();
  }
  
  public String s() {
    return f(r());
  }
  
  public int t() {
    return this.h;
  }
  
  public void a(int paramInt) {
    this.h = paramInt;
  }
  
  public InetAddress u() {
    try {
      return InetAddress.getByAddress(v());
    } catch (UnknownHostException unknownHostException) {
      b.log(Level.SEVERE, "Unexpected UnknownHostException", unknownHostException);
      return null;
    } 
  }
  
  public byte[] v() {
    return (byte[])this.l.clone();
  }
  
  public void b(InetAddress paramInetAddress) {
    if (!(paramInetAddress instanceof java.net.Inet4Address))
      throw new IllegalArgumentException("Inet4Address required"); 
    e(paramInetAddress.getAddress());
  }
  
  public void e(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != 4)
      throw new IllegalArgumentException("4-byte array required"); 
    System.arraycopy(paramArrayOfbyte, 0, this.l, 0, 4);
  }
  
  public Byte w() {
    return e((byte)53);
  }
  
  public void d(byte paramByte) {
    a((byte)53, paramByte);
  }
  
  public Byte e(byte paramByte) {
    c c = h(paramByte);
    return (c == null) ? null : Byte.valueOf(c.c());
  }
  
  public Integer f(byte paramByte) {
    c c = h(paramByte);
    return (c == null) ? null : Integer.valueOf(c.e());
  }
  
  public String g(byte paramByte) {
    c c = h(paramByte);
    return (c == null) ? null : c.g();
  }
  
  public void a(byte paramByte1, byte paramByte2) {
    a(c.a(paramByte1, paramByte2));
  }
  
  public void a(byte paramByte, int paramInt) {
    a(c.a(paramByte, paramInt));
  }
  
  public void a(byte paramByte, InetAddress paramInetAddress) {
    a(c.a(paramByte, paramInetAddress));
  }
  
  public void a(byte paramByte, String paramString) {
    a(c.a(paramByte, paramString));
  }
  
  public c h(byte paramByte) {
    c c = (c)this.r.get(Byte.valueOf(paramByte));
    if (c == null)
      return null; 
    if (!a && c.a() != paramByte)
      throw new AssertionError(); 
    if (!a && c.b() == null)
      throw new AssertionError(); 
    return c;
  }
  
  public boolean i(byte paramByte) {
    return this.r.containsKey(Byte.valueOf(paramByte));
  }
  
  public Collection x() {
    return Collections.unmodifiableCollection(this.r.values());
  }
  
  public void a(c paramc) {
    if (paramc != null)
      if (paramc.b() == null) {
        j(paramc.a());
      } else {
        this.r.put(Byte.valueOf(paramc.a()), paramc);
      }  
  }
  
  public void j(byte paramByte) {
    this.r.remove(Byte.valueOf(paramByte));
  }
  
  public InetAddress y() {
    return this.v;
  }
  
  public void c(InetAddress paramInetAddress) {
    if (paramInetAddress == null) {
      this.v = null;
    } else {
      if (!(paramInetAddress instanceof java.net.Inet4Address))
        throw new IllegalArgumentException("only IPv4 addresses accepted"); 
      this.v = paramInetAddress;
    } 
  }
  
  public int z() {
    return this.w;
  }
  
  public void b(int paramInt) {
    this.w = paramInt;
  }
  
  public void a(InetSocketAddress paramInetSocketAddress) {
    if (paramInetSocketAddress == null) {
      c((InetAddress)null);
      b(0);
    } else {
      c(paramInetSocketAddress.getAddress());
      b(paramInetSocketAddress.getPort());
    } 
  }
  
  static String f(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null) ? "" : a(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  static String a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramArrayOfbyte == null)
      return ""; 
    if (paramInt1 < 0) {
      paramInt2 += paramInt1;
      paramInt1 = 0;
    } 
    if (paramInt2 <= 0)
      return ""; 
    if (paramInt1 >= paramArrayOfbyte.length)
      return ""; 
    if (paramInt1 + paramInt2 > paramArrayOfbyte.length)
      paramInt2 = paramArrayOfbyte.length - paramInt1; 
    for (int i = paramInt1; i < paramInt1 + paramInt2; i++) {
      if (paramArrayOfbyte[i] == 0) {
        paramInt2 = i - paramInt1;
        break;
      } 
    } 
    char[] arrayOfChar = new char[paramInt2];
    for (int j = paramInt1; j < paramInt1 + paramInt2; j++)
      arrayOfChar[j - paramInt1] = (char)paramArrayOfbyte[j]; 
    return new String(arrayOfChar);
  }
  
  static void a(StringBuilder paramStringBuilder, byte paramByte) {
    int i = paramByte & 0xFF;
    paramStringBuilder.append(x[(i & 0xF0) >> 4]).append(x[i & 0xF]);
  }
  
  static void a(StringBuilder paramStringBuilder, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramArrayOfbyte == null)
      return; 
    if (paramInt1 < 0) {
      paramInt2 += paramInt1;
      paramInt1 = 0;
    } 
    if (paramInt2 <= 0 || paramInt1 >= paramArrayOfbyte.length)
      return; 
    if (paramInt1 + paramInt2 > paramArrayOfbyte.length)
      paramInt2 = paramArrayOfbyte.length - paramInt1; 
    for (int i = paramInt1; i < paramInt1 + paramInt2; i++)
      a(paramStringBuilder, paramArrayOfbyte[i]); 
  }
  
  static void a(StringBuilder paramStringBuilder, byte[] paramArrayOfbyte) {
    a(paramStringBuilder, paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  private static void a(StringBuilder paramStringBuilder, int paramInt) {
    a(paramStringBuilder, (byte)((paramInt & 0xFF000000) >>> 24));
    a(paramStringBuilder, (byte)((paramInt & 0xFF0000) >>> 16));
    a(paramStringBuilder, (byte)((paramInt & 0xFF00) >>> 8));
    a(paramStringBuilder, (byte)(paramInt & 0xFF));
  }
  
  public static byte[] a(String paramString) {
    if (paramString == null)
      return null; 
    char[] arrayOfChar = paramString.toCharArray();
    int i = arrayOfChar.length;
    byte[] arrayOfByte = new byte[i];
    for (byte b = 0; b < i; b++)
      arrayOfByte[b] = (byte)arrayOfChar[b]; 
    return arrayOfByte;
  }
  
  public static void a(StringBuilder paramStringBuilder, InetAddress paramInetAddress) {
    if (paramInetAddress == null)
      throw new IllegalArgumentException("addr must not be null"); 
    if (!(paramInetAddress instanceof java.net.Inet4Address))
      throw new IllegalArgumentException("addr must be an instance of Inet4Address"); 
    byte[] arrayOfByte = paramInetAddress.getAddress();
    paramStringBuilder.append(arrayOfByte[0] & 0xFF).append('.').append(arrayOfByte[1] & 0xFF).append('.').append(arrayOfByte[2] & 0xFF).append('.').append(arrayOfByte[3] & 0xFF);
  }
  
  static {
    b = Logger.getLogger(e.class.getName().toLowerCase());
    x = new char[] { 
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F' };
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bW/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */