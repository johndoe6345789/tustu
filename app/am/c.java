package am;

import al.d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SeekableByteChannel;

public class c extends a {
  public static String b = "##CG";
  
  private long c;
  
  private long d;
  
  private long e;
  
  private long f;
  
  private long g;
  
  private long h;
  
  private long i;
  
  private long j;
  
  private int k;
  
  private int l;
  
  private long m;
  
  private long n;
  
  private c(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    super(paramSeekableByteChannel, paramLong);
  }
  
  public long e() {
    return this.j;
  }
  
  public long f() {
    return this.m;
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
  
  private void a(int paramInt) {
    this.k = paramInt;
  }
  
  private void b(int paramInt) {
    this.l = paramInt;
  }
  
  private void k(long paramLong) {
    this.m = paramLong;
  }
  
  private void l(long paramLong) {
    this.n = paramLong;
  }
  
  public d g() {
    return (this.d > 0L) ? d.b(this.a, this.d) : null;
  }
  
  public String toString() {
    return "CGBLOCK [lnkCgNext=" + this.c + ", lnkCnFirst=" + this.d + ", lnkTxAcqName=" + this.e + ", lnkSiAcqSource=" + this.f + ", lnkSrFirst=" + this.g + ", lnkMdComment=" + this.h + ", recordId=" + this.i + ", cycleCount=" + this.j + ", flags=" + this.k + ", pathSeparator=" + this.l + ", dataBytes=" + this.m + ", invalBytes=" + this.n + "]";
  }
  
  public static c b(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    c c1 = new c(paramSeekableByteChannel, paramLong);
    ByteBuffer byteBuffer = ByteBuffer.allocate(104);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(paramLong);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    c1.a(d.a(byteBuffer, 4));
    if (!c1.b().equals(b))
      throw new IOException("Wrong block type - expected '" + b + "', found '" + c1.b() + "'"); 
    byteBuffer.get(new byte[4]);
    c1.a(d.e(byteBuffer));
    c1.b(d.e(byteBuffer));
    c1.c(d.g(byteBuffer));
    c1.d(d.g(byteBuffer));
    c1.e(d.g(byteBuffer));
    c1.f(d.g(byteBuffer));
    c1.g(d.g(byteBuffer));
    c1.h(d.g(byteBuffer));
    c1.i(d.e(byteBuffer));
    c1.j(d.e(byteBuffer));
    c1.a(d.b(byteBuffer));
    c1.b(d.b(byteBuffer));
    byteBuffer.get(new byte[4]);
    c1.k(d.d(byteBuffer));
    c1.l(d.d(byteBuffer));
    return c1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/am/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */