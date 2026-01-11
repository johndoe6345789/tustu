package am;

import al.d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SeekableByteChannel;

public class j extends a {
  public static String b = "##MD";
  
  private String c;
  
  private j(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    super(paramSeekableByteChannel, paramLong);
  }
  
  private void b(String paramString) {
    this.c = paramString;
  }
  
  public String toString() {
    return "MDBLOCK [mdData=" + this.c + "]";
  }
  
  public static j b(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    j j1 = new j(paramSeekableByteChannel, paramLong);
    ByteBuffer byteBuffer = ByteBuffer.allocate(24);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(paramLong);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    j1.a(d.a(byteBuffer, 4));
    if (!j1.b().equals(b))
      throw new IOException("Wrong block type - expected '" + b + "', found '" + j1.b() + "'"); 
    byteBuffer.get(new byte[4]);
    j1.a(d.e(byteBuffer));
    j1.b(d.e(byteBuffer));
    byteBuffer = ByteBuffer.allocate((int)j1.c() + 24);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(paramLong + 24L);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    j1.b(d.b(byteBuffer, (int)(j1.c() - 24L)));
    return j1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/am/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */