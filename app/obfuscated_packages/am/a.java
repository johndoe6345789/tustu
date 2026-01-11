package am;

import al.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SeekableByteChannel;

public abstract class a {
  private final long b;
  
  private String c;
  
  private long d;
  
  private long e;
  
  protected final SeekableByteChannel a;
  
  protected a(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    this.a = paramSeekableByteChannel;
    this.b = paramLong;
  }
  
  public long a() {
    return this.b;
  }
  
  public String b() {
    return this.c;
  }
  
  protected void a(String paramString) {
    this.c = paramString;
  }
  
  public long c() {
    return this.d;
  }
  
  protected void a(long paramLong) {
    this.d = paramLong;
  }
  
  public long d() {
    return this.e;
  }
  
  protected void b(long paramLong) {
    this.e = paramLong;
  }
  
  public String toString() {
    return "BLOCK [pos=" + this.b + ", id=" + this.c + ", length=" + this.d + ", linkCount=" + this.e + "]";
  }
  
  public int hashCode() {
    byte b = 31;
    null = 1;
    return 31 * null + (int)(this.b ^ this.b >>> 32L);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    a a1 = (a)paramObject;
    return !(this.b != a1.b);
  }
  
  protected static String a(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    ByteBuffer byteBuffer = ByteBuffer.allocate(4);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(paramLong);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    return d.a(byteBuffer, 4);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/am/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */