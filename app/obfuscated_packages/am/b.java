package am;

import al.d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SeekableByteChannel;
import java.util.Arrays;

public class b extends a {
  public static String b = "##CC";
  
  private long c;
  
  private long d;
  
  private long e;
  
  private long f;
  
  private long[] g;
  
  private byte h;
  
  private byte i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private double m;
  
  private double n;
  
  private double[] o;
  
  private b(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    super(paramSeekableByteChannel, paramLong);
  }
  
  public byte e() {
    return this.h;
  }
  
  public int f() {
    return this.k;
  }
  
  public int g() {
    return this.l;
  }
  
  public double[] h() {
    return this.o;
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
  
  private void a(long[] paramArrayOflong) {
    this.g = paramArrayOflong;
  }
  
  private void a(byte paramByte) {
    this.h = paramByte;
  }
  
  private void b(byte paramByte) {
    this.i = paramByte;
  }
  
  private void a(int paramInt) {
    this.j = paramInt;
  }
  
  private void b(int paramInt) {
    this.k = paramInt;
  }
  
  private void c(int paramInt) {
    this.l = paramInt;
  }
  
  private void a(double paramDouble) {
    this.m = paramDouble;
  }
  
  private void b(double paramDouble) {
    this.n = paramDouble;
  }
  
  private void a(double[] paramArrayOfdouble) {
    this.o = paramArrayOfdouble;
  }
  
  public k[] i() {
    if (this.g.length > 0) {
      k[] arrayOfK = new k[this.g.length];
      for (byte b1 = 0; b1 < arrayOfK.length; b1++) {
        if (this.g[b1] > 0L)
          arrayOfK[b1] = k.b(this.a, this.g[b1]); 
      } 
      return arrayOfK;
    } 
    return null;
  }
  
  public String toString() {
    return "CCBLOCK [lnkTxName=" + this.c + ", lnkMdUnit=" + this.d + ", lnkMdComment=" + this.e + ", lnkCcInverse=" + this.f + ", lnkCcRef=" + Arrays.toString(this.g) + ", type=" + this.h + ", precision=" + this.i + ", flags=" + this.j + ", refCount=" + this.k + ", valCount=" + this.l + ", phyRangeMin=" + this.m + ", phyRangeMax=" + this.n + ", val=" + Arrays.toString(this.o) + "]";
  }
  
  public static b b(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    b b1 = new b(paramSeekableByteChannel, paramLong);
    ByteBuffer byteBuffer = ByteBuffer.allocate(24);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(paramLong);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    b1.a(d.a(byteBuffer, 4));
    if (!b1.b().equals(b))
      throw new IOException("Wrong block type - expected '" + b + "', found '" + b1.b() + "'"); 
    byteBuffer.get(new byte[4]);
    b1.a(d.e(byteBuffer));
    b1.b(d.e(byteBuffer));
    byteBuffer = ByteBuffer.allocate((int)b1.c() + 24);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(paramLong + 24L);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    long[] arrayOfLong1 = new long[(int)b1.d()];
    for (byte b2 = 0; b2 < arrayOfLong1.length; b2++)
      arrayOfLong1[b2] = d.g(byteBuffer); 
    b1.a(d.a(byteBuffer));
    b1.b(d.a(byteBuffer));
    b1.a(d.b(byteBuffer));
    b1.b(d.b(byteBuffer));
    b1.c(d.b(byteBuffer));
    b1.a(d.f(byteBuffer));
    b1.b(d.f(byteBuffer));
    double[] arrayOfDouble = new double[b1.g()];
    for (byte b3 = 0; b3 < arrayOfDouble.length; b3++)
      arrayOfDouble[b3] = d.f(byteBuffer); 
    b1.a(arrayOfDouble);
    b1.c(arrayOfLong1[0]);
    b1.d(arrayOfLong1[1]);
    b1.e(arrayOfLong1[2]);
    b1.f(arrayOfLong1[3]);
    long[] arrayOfLong2 = new long[b1.f()];
    for (byte b4 = 0; b4 < arrayOfLong2.length; b4++)
      arrayOfLong2[b4] = arrayOfLong1[b4 + 4]; 
    b1.a(arrayOfLong2);
    return b1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/am/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */