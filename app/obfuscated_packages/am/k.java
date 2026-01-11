package am;

import al.d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SeekableByteChannel;

public class k extends a {
  public static String b = "##TX";
  
  private String c;
  
  private k(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    super(paramSeekableByteChannel, paramLong);
  }
  
  public String e() {
    return this.c;
  }
  
  private void b(String paramString) {
    this.c = paramString;
  }
  
  public String toString() {
    return "TXBLOCK [txData=" + this.c + "]";
  }
  
  public static k b(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    k k1 = new k(paramSeekableByteChannel, paramLong);
    ByteBuffer byteBuffer = ByteBuffer.allocate(24);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(paramLong);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    k1.a(d.a(byteBuffer, 4));
    if (!k1.b().equals(b))
      throw new IOException("Wrong block type - expected '" + b + "', found '" + k1.b() + "'"); 
    byteBuffer.get(new byte[4]);
    k1.a(d.e(byteBuffer));
    k1.b(d.e(byteBuffer));
    byteBuffer = ByteBuffer.allocate((int)k1.c() + 24);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(paramLong + 24L);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    k1.b(d.b(byteBuffer, (int)(k1.c() - 24L)));
    return k1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/am/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */