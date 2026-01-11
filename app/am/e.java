package am;

import al.d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SeekableByteChannel;

public class e extends a {
  public static String b = "##DG";
  
  private int c = 0;
  
  private long d;
  
  private long e;
  
  private long f;
  
  private long g;
  
  private byte h;
  
  private e(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    super(paramSeekableByteChannel, paramLong);
  }
  
  private void c(long paramLong) {
    this.d = paramLong;
  }
  
  private void d(long paramLong) {
    this.e = paramLong;
  }
  
  private void e(long paramLong) {
    this.f = paramLong;
  }
  
  private void f(long paramLong) {
    this.g = paramLong;
  }
  
  private void a(byte paramByte) {
    this.h = paramByte;
  }
  
  public e e() {
    return (this.d > 0L) ? b(this.a, this.d) : null;
  }
  
  public c f() {
    return (this.e > 0L) ? c.b(this.a, this.e) : null;
  }
  
  public a g() {
    if (this.f > 0L) {
      String str = a(this.a, this.f);
      if (str.equals("##DT"))
        return g.b(this.a, this.f); 
      if (str.equals("##DZ"))
        return null; 
      if (str.equals(f.b))
        return f.b(this.a, this.f); 
      if (str.equals("##HL"))
        return null; 
      throw new IOException("Unsupported block type for data: " + str);
    } 
    return null;
  }
  
  public String toString() {
    return "DGBLOCK [lnkDgNext=" + this.d + ", lnkCgFirst=" + this.e + ", lnkData=" + this.f + ", lnkMdComment=" + this.g + ", recIdSize=" + this.h + "]";
  }
  
  public static e b(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    e e1 = new e(paramSeekableByteChannel, paramLong);
    ByteBuffer byteBuffer = ByteBuffer.allocate(64);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(paramLong);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    e1.a(d.a(byteBuffer, 4));
    if (!e1.b().equals(b))
      throw new IOException("Wrong block type - expected '" + b + "', found '" + e1.b() + "'"); 
    byteBuffer.get(new byte[4]);
    e1.a(d.e(byteBuffer));
    e1.b(d.e(byteBuffer));
    e1.c(d.g(byteBuffer));
    e1.d(d.g(byteBuffer));
    e1.e(d.g(byteBuffer));
    e1.f(d.g(byteBuffer));
    e1.a(d.a(byteBuffer));
    return e1;
  }
  
  public int h() {
    return this.c;
  }
  
  public void a(int paramInt) {
    this.c = paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/am/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */