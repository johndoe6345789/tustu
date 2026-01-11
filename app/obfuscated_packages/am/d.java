package am;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SeekableByteChannel;
import java.util.Arrays;

public class d extends a {
  public static String b = "##CN";
  
  private long c;
  
  private long d;
  
  private long e;
  
  private long f;
  
  private long g;
  
  private long h;
  
  private long i;
  
  private long j;
  
  private long[] k;
  
  private long[] l;
  
  private byte m;
  
  private byte n;
  
  private byte o;
  
  private byte p;
  
  private long q;
  
  private long r;
  
  private long s;
  
  private long t;
  
  private byte u;
  
  private int v;
  
  private double w;
  
  private double x;
  
  private double y;
  
  private double z;
  
  private double A;
  
  private double B;
  
  private d(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    super(paramSeekableByteChannel, paramLong);
  }
  
  public byte e() {
    return this.o;
  }
  
  public byte f() {
    return this.p;
  }
  
  public long g() {
    return this.q;
  }
  
  public long h() {
    return this.r;
  }
  
  public long i() {
    return this.s;
  }
  
  public byte j() {
    return this.u;
  }
  
  public int k() {
    return this.v;
  }
  
  public double l() {
    return this.w;
  }
  
  public double m() {
    return this.x;
  }
  
  private void c(long paramLong) {
    this.c = paramLong;
  }
  
  private void d(long paramLong) {
    this.d = paramLong;
  }
  
  private void e(long paramLong) {
    this.e = paramLong;
  }
  
  private void f(long paramLong) {
    this.f = paramLong;
  }
  
  private void g(long paramLong) {
    this.g = paramLong;
  }
  
  private void h(long paramLong) {
    this.h = paramLong;
  }
  
  private void i(long paramLong) {
    this.i = paramLong;
  }
  
  private void j(long paramLong) {
    this.j = paramLong;
  }
  
  private void a(long[] paramArrayOflong) {
    this.k = paramArrayOflong;
  }
  
  private void b(long[] paramArrayOflong) {
    this.l = paramArrayOflong;
  }
  
  private void a(byte paramByte) {
    this.m = paramByte;
  }
  
  private void b(byte paramByte) {
    this.n = paramByte;
  }
  
  private void c(byte paramByte) {
    this.o = paramByte;
  }
  
  private void d(byte paramByte) {
    this.p = paramByte;
  }
  
  private void k(long paramLong) {
    this.q = paramLong;
  }
  
  private void l(long paramLong) {
    this.r = paramLong;
  }
  
  private void m(long paramLong) {
    this.s = paramLong;
  }
  
  private void n(long paramLong) {
    this.t = paramLong;
  }
  
  private void e(byte paramByte) {
    this.u = paramByte;
  }
  
  private void a(int paramInt) {
    this.v = paramInt;
  }
  
  private void a(double paramDouble) {
    this.w = paramDouble;
  }
  
  private void b(double paramDouble) {
    this.x = paramDouble;
  }
  
  private void c(double paramDouble) {
    this.y = paramDouble;
  }
  
  private void d(double paramDouble) {
    this.z = paramDouble;
  }
  
  private void e(double paramDouble) {
    this.A = paramDouble;
  }
  
  private void f(double paramDouble) {
    this.B = paramDouble;
  }
  
  public d n() {
    return (this.c > 0L) ? b(this.a, this.c) : null;
  }
  
  public k o() {
    return (this.e > 0L) ? k.b(this.a, this.e) : null;
  }
  
  public b p() {
    return (this.g > 0L) ? b.b(this.a, this.g) : null;
  }
  
  public a q() {
    if (this.i > 0L) {
      String str = a(this.a, this.i);
      if (str.equals(j.b))
        return j.b(this.a, this.i); 
      if (str.equals(k.b))
        return k.b(this.a, this.i); 
      throw new IOException("Unsupported block type for MdUnit: " + str);
    } 
    return null;
  }
  
  public String toString() {
    return "CNBLOCK [lnkCnNext=" + this.c + ", lnkComposition=" + this.d + ", lnkTxName=" + this.e + ", lnkSiSource=" + this.f + ", lnkCcConversion=" + this.g + ", lnkData=" + this.h + ", lnkMdUnit=" + this.i + ", lnkMdComment=" + this.j + ", lnkAtReference=" + Arrays.toString(this.k) + ", lnkDefaultX=" + Arrays.toString(this.l) + ", channelType=" + this.m + ", syncType=" + this.n + ", dataType=" + this.o + ", bitOffset=" + this.p + ", byteOffset=" + this.q + ", bitCount=" + this.r + ", flags=" + this.s + ", invalBitPos=" + this.t + ", precision=" + this.u + ", attachmentCount=" + this.v + ", valRangeMin=" + this.w + ", valRangeMax=" + this.x + ", limitMin=" + this.y + ", limitMax=" + this.z + ", limitExtMin=" + this.A + ", limitExtMax=" + this.B + "]";
  }
  
  public static d b(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    d d1 = new d(paramSeekableByteChannel, paramLong);
    ByteBuffer byteBuffer = ByteBuffer.allocate(24);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(paramLong);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    d1.a(al.d.a(byteBuffer, 4));
    if (!d1.b().equals(b))
      throw new IOException("Wrong block type - expected '" + b + "', found '" + d1.b() + "'"); 
    byteBuffer.get(new byte[4]);
    d1.a(al.d.e(byteBuffer));
    d1.b(al.d.e(byteBuffer));
    byteBuffer = ByteBuffer.allocate((int)d1.c() - 24);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(paramLong + 24L);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    long[] arrayOfLong1 = new long[(int)d1.d()];
    for (byte b1 = 0; b1 < arrayOfLong1.length; b1++)
      arrayOfLong1[b1] = al.d.g(byteBuffer); 
    d1.a(al.d.a(byteBuffer));
    d1.b(al.d.a(byteBuffer));
    d1.c(al.d.a(byteBuffer));
    d1.d(al.d.a(byteBuffer));
    d1.k(al.d.d(byteBuffer));
    d1.l(al.d.d(byteBuffer));
    d1.m(al.d.d(byteBuffer));
    d1.n(al.d.d(byteBuffer));
    d1.e(al.d.a(byteBuffer));
    byteBuffer.get();
    d1.a(al.d.b(byteBuffer));
    d1.a(al.d.f(byteBuffer));
    d1.b(al.d.f(byteBuffer));
    d1.c(al.d.f(byteBuffer));
    d1.d(al.d.f(byteBuffer));
    d1.e(al.d.f(byteBuffer));
    d1.f(al.d.f(byteBuffer));
    d1.c(arrayOfLong1[0]);
    d1.d(arrayOfLong1[1]);
    d1.e(arrayOfLong1[2]);
    d1.f(arrayOfLong1[3]);
    d1.g(arrayOfLong1[4]);
    d1.h(arrayOfLong1[5]);
    d1.i(arrayOfLong1[6]);
    d1.j(arrayOfLong1[7]);
    long[] arrayOfLong2 = new long[d1.k()];
    for (byte b2 = 0; b2 < d1.k(); b2++)
      arrayOfLong2[b2] = arrayOfLong1[b2 + 8]; 
    d1.a(arrayOfLong2);
    long[] arrayOfLong3 = new long[3];
    if (arrayOfLong1.length > d1.k() + 8) {
      arrayOfLong3[0] = arrayOfLong1[d1.k() + 8];
      arrayOfLong3[1] = arrayOfLong1[d1.k() + 9];
      arrayOfLong3[2] = arrayOfLong1[d1.k() + 10];
    } 
    d1.b(arrayOfLong3);
    return d1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/am/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */