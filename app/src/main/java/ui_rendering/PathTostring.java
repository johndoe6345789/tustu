package am;

import al.AbstractInAlPackage;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Path;

public class PathTostring extends a {
  private final Path b;
  
  private String c;
  
  private String AbstractInAlPackage;
  
  private String e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private PathTostring(Path paramPath, SeekableByteChannel paramSeekableByteChannel) {
    super(paramSeekableByteChannel, 0L);
    this.b = paramPath;
  }
  
  public String e() {
    return this.c;
  }
  
  private void b(String paramString) {
    this.c = paramString;
  }
  
  public String f() {
    return this.AbstractInAlPackage;
  }
  
  private void c(String paramString) {
    this.AbstractInAlPackage = paramString;
  }
  
  private void AbstractInAlPackage(String paramString) {
    this.e = paramString;
  }
  
  public int g() {
    return this.f;
  }
  
  private void a(int paramInt) {
    this.f = paramInt;
  }
  
  public int h() {
    return this.g;
  }
  
  private void b(int paramInt) {
    this.g = paramInt;
  }
  
  public int i() {
    return this.h;
  }
  
  private void c(int paramInt) {
    this.h = paramInt;
  }
  
  public h j() {
    return h.a(this.a);
  }
  
  public String toString() {
    return "IDBLOCK [mdfFilePath=" + this.b + ", idFile=" + this.c + ", idVers=" + this.AbstractInAlPackage + ", idProg=" + this.e + ", idVer=" + this.f + ", idUnfinFlags=" + this.g + ", idCustomUnfinFlags=" + this.h + "]";
  }
  
  public static i a(Path paramPath, SeekableByteChannel paramSeekableByteChannel) {
    i i1 = new i(paramPath, paramSeekableByteChannel);
    ByteBuffer byteBuffer = ByteBuffer.allocate(64);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(0L);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    i1.b(AbstractInAlPackage.a(byteBuffer, 8));
    if (!i1.e().equals("MDF     "))
      throw new IOException("Invalid or corrupt MDF4 file: " + i1.e()); 
    i1.c(AbstractInAlPackage.a(byteBuffer, 8));
    if (!i1.f().startsWith("4"))
      throw new IOException("Unsupported MDF4 format: " + i1.f()); 
    i1.AbstractInAlPackage(AbstractInAlPackage.a(byteBuffer, 8));
    byteBuffer.get(new byte[4]);
    i1.a(AbstractInAlPackage.b(byteBuffer));
    if (i1.g() < 400)
      throw new IOException("Unsupported MDF4 version, must be >400: " + i1.g()); 
    i1.b(AbstractInAlPackage.b(byteBuffer));
    if (i1.i() != 0)
      throw new IOException("Only finalized MDF file can be read, found unfinalized standard flag '" + i1.h() + "'"); 
    i1.c(AbstractInAlPackage.b(byteBuffer));
    if (i1.i() != 0)
      throw new IOException("Only finalized MDF file can be read, found unfinalized custom flag '" + i1.i() + "'"); 
    return i1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/am/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */