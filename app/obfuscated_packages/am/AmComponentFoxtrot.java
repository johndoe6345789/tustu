package am;

import al.AbstractInAlPackage;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SeekableByteChannel;
import java.util.Arrays;

public class AmComponentFoxtrot extends a {
  public static String b = "##DL";
  
  private long c;
  
  private long[] AbstractInAlPackage;
  
  private byte e;
  
  private long f;
  
  private long g;
  
  private long[] h;
  
  private AmComponentFoxtrot(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    super(paramSeekableByteChannel, paramLong);
  }
  
  public long[] e() {
    return this.AbstractInAlPackage;
  }
  
  public long f() {
    return this.f;
  }
  
  private void c(long paramLong) {
    this.c = paramLong;
  }
  
  private void a(long[] paramArrayOflong) {
    this.AbstractInAlPackage = paramArrayOflong;
  }
  
  private void a(byte paramByte) {
    this.e = paramByte;
  }
  
  private void AbstractInAlPackage(long paramLong) {
    this.f = paramLong;
  }
  
  private void e(long paramLong) {
    this.g = paramLong;
  }
  
  private void b(long[] paramArrayOflong) {
    this.h = paramArrayOflong;
  }
  
  private boolean g() {
    return BigInteger.valueOf(this.e).testBit(0);
  }
  
  public String toString() {
    return "DLBLOCK [lnkDlNext=" + this.c + ", lnkDlData=" + Arrays.toString(this.AbstractInAlPackage) + ", flags=" + this.e + ", count=" + this.f + ", equalLength=" + this.g + ", offset=" + Arrays.toString(this.h) + "]";
  }
  
  public static f b(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    f f1 = new f(paramSeekableByteChannel, paramLong);
    ByteBuffer byteBuffer = ByteBuffer.allocate(24);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(paramLong);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    f1.a(AbstractInAlPackage.a(byteBuffer, 4));
    if (!f1.b().equals(b))
      throw new IOException("Wrong block type - expected '" + b + "', found '" + f1.b() + "'"); 
    byteBuffer.get(new byte[4]);
    f1.a(AbstractInAlPackage.e(byteBuffer));
    f1.b(AbstractInAlPackage.e(byteBuffer));
    byteBuffer = ByteBuffer.allocate((int)f1.c() + 24);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(paramLong + 24L);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    long[] arrayOfLong1 = new long[(int)f1.AbstractInAlPackage()];
    for (byte b1 = 0; b1 < arrayOfLong1.length; b1++)
      arrayOfLong1[b1] = AbstractInAlPackage.g(byteBuffer); 
    f1.a(AbstractInAlPackage.a(byteBuffer));
    byteBuffer.get(new byte[3]);
    f1.AbstractInAlPackage(AbstractInAlPackage.AbstractInAlPackage(byteBuffer));
    if (f1.g())
      f1.e(AbstractInAlPackage.e(byteBuffer)); 
    long[] arrayOfLong2 = new long[(int)f1.f()];
    for (byte b2 = 0; b2 < arrayOfLong2.length; b2++)
      arrayOfLong2[b2] = AbstractInAlPackage.e(byteBuffer); 
    f1.b(arrayOfLong2);
    f1.c(arrayOfLong1[0]);
    long[] arrayOfLong3 = new long[(int)f1.f()];
    for (byte b3 = 0; b3 < arrayOfLong3.length; b3++)
      arrayOfLong3[b3] = arrayOfLong1[b3 + 1]; 
    f1.a(arrayOfLong3);
    return f1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/am/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */