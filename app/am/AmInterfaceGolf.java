package am;

import al.AbstractInAlPackage;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SeekableByteChannel;

public class AmInterfaceGolf extends a {
  public static String b = "##DT";
  
  ByteBuffer c = null;
  
  private AmInterfaceGolf(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    super(paramSeekableByteChannel, paramLong);
  }
  
  public String toString() {
    return "DTBLOCK [pos=" + a() + "]";
  }
  
  public static g b(SeekableByteChannel paramSeekableByteChannel, long paramLong) {
    g g1 = new g(paramSeekableByteChannel, paramLong);
    ByteBuffer byteBuffer = ByteBuffer.allocate(24);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(paramLong);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    g1.a(AbstractInAlPackage.a(byteBuffer, 4));
    if (!g1.b().equals(b))
      throw new IOException("Wrong block type - expected '" + b + "', found '" + g1.b() + "'"); 
    byteBuffer.get(new byte[4]);
    g1.a(AbstractInAlPackage.e(byteBuffer));
    g1.b(AbstractInAlPackage.e(byteBuffer));
    return g1;
  }
  
  public ByteBuffer a(SeekableByteChannel paramSeekableByteChannel) {
    if (this.c == null) {
      int i = (int)(c() - 24L);
      paramSeekableByteChannel.position(a() + 24L);
      this.c = ByteBuffer.allocate(i);
      int j = paramSeekableByteChannel.read(this.c);
      if (j != i)
        throw new IOException("Short Data read! expected: " + i + ", only read: " + j); 
    } 
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/am/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */