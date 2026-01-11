package am;

import al.d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SeekableByteChannel;

public class h extends a {
  public static String b = "##HD";
  
  private long c;
  
  private long d;
  
  private long e;
  
  private long f;
  
  private long g;
  
  private long h;
  
  private long i;
  
  private short j;
  
  private short k;
  
  private byte l;
  
  private byte m;
  
  private byte n;
  
  private double o;
  
  private double p;
  
  public h(SeekableByteChannel paramSeekableByteChannel) {
    super(paramSeekableByteChannel, 64L);
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
  
  private void a(short paramShort) {
    this.j = paramShort;
  }
  
  private void b(short paramShort) {
    this.k = paramShort;
  }
  
  private void a(byte paramByte) {
    this.l = paramByte;
  }
  
  private void b(byte paramByte) {
    this.m = paramByte;
  }
  
  public byte e() {
    return this.n;
  }
  
  private void c(byte paramByte) {
    this.n = paramByte;
  }
  
  private void a(double paramDouble) {
    this.o = paramDouble;
  }
  
  private void b(double paramDouble) {
    this.p = paramDouble;
  }
  
  public a f() {
    if (this.h > 0L) {
      String str = a(this.a, this.h);
      if (str.equals(j.b))
        return j.b(this.a, this.h); 
      if (str.equals(k.b))
        return k.b(this.a, this.h); 
      throw new IOException("Unsupported block type for MdComment: " + str);
    } 
    return null;
  }
  
  public e g() {
    return (this.c > 0L) ? e.b(this.a, this.c) : null;
  }
  
  public String toString() {
    return "HDBLOCK [lnkDgFirst=" + this.c + ", lnkFhFirst=" + this.d + ", lnkChFirst=" + this.e + ", lnkAtFirst=" + this.f + ", lnkEvFirst=" + this.g + ", lnkMdComment=" + this.h + ", startTimeNs=" + this.i + ", tzOffsetMin=" + this.j + ", dstOffsetMin=" + this.k + ", timeFlags=" + this.l + ", timeClass=" + this.m + ", flags=" + this.n + ", startAngleRad=" + this.o + ", startDistanceM=" + this.p + "]";
  }
  
  public static h a(SeekableByteChannel paramSeekableByteChannel) {
    h h1 = new h(paramSeekableByteChannel);
    ByteBuffer byteBuffer = ByteBuffer.allocate(112);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(64L);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    h1.a(d.a(byteBuffer, 4));
    if (!h1.b().equals(b))
      throw new IOException("Wrong block type - expected '" + b + "', found '" + h1.b() + "'"); 
    byteBuffer.get(new byte[4]);
    h1.a(d.e(byteBuffer));
    h1.b(d.e(byteBuffer));
    h1.c(d.g(byteBuffer));
    h1.d(d.g(byteBuffer));
    h1.e(d.g(byteBuffer));
    h1.f(d.g(byteBuffer));
    h1.g(d.g(byteBuffer));
    h1.h(d.g(byteBuffer));
    h1.i(d.e(byteBuffer));
    h1.a(d.c(byteBuffer));
    h1.b(d.c(byteBuffer));
    h1.a(d.a(byteBuffer));
    h1.b(d.a(byteBuffer));
    h1.c(d.a(byteBuffer));
    if (h1.e() != 0)
      throw new IOException("HDBLOCK hd_flags!=0 not yet supported"); 
    byteBuffer.get();
    h1.a(d.f(byteBuffer));
    h1.b(d.f(byteBuffer));
    return h1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/am/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */