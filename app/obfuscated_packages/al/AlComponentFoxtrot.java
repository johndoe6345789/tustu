package al;

import am.AbstractUsingSeekableByteChannel;
import am.AmInterfaceCharlie;
import am.AmInterfaceEcho;
import am.AmInterfaceGolf;
import bH.D;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

public class AlComponentFoxtrot {
  AmInterfaceEcho AbstractUsingSeekableByteChannel;
  
  AmInterfaceCharlie b;
  
  AmInterfaceGolf AmInterfaceCharlie = null;
  
  am.f d = null;
  
  private long[] k = null;
  
  int AmInterfaceEcho = 0;
  
  ByteBuffer f = null;
  
  SeekableByteChannel AmInterfaceGolf;
  
  long h = -1L;
  
  int i;
  
  byte[] j;
  
  public AlComponentFoxtrot(SeekableByteChannel paramSeekableByteChannel, AmInterfaceEcho parame, AmInterfaceCharlie paramc) {
    this.AmInterfaceGolf = paramSeekableByteChannel;
    this.AbstractUsingSeekableByteChannel = parame;
    this.b = paramc;
    this.i = (int)paramc.f();
    this.j = new byte[this.i];
  }
  
  public byte[] AbstractUsingSeekableByteChannel() {
    if (this.f == null)
      this.f = b(); 
    if (this.f.remaining() < this.i) {
      int i = this.f.remaining();
      this.f.get(this.j, 0, i);
      this.f = b();
      if (this.f != null) {
        this.f.get(this.j, i, this.i - i);
      } else {
        D.b("Partial Data Block with no next block?");
      } 
    } 
    if (this.f != null && this.f.remaining() >= this.j.length) {
      this.f.get(this.j);
      return this.j;
    } 
    return null;
  }
  
  private ByteBuffer b() {
    if (this.d == null) {
      AbstractUsingSeekableByteChannel AbstractUsingSeekableByteChannel = this.AbstractUsingSeekableByteChannel.AmInterfaceGolf();
      if (AbstractUsingSeekableByteChannel instanceof am.f) {
        this.d = (am.f)AbstractUsingSeekableByteChannel;
        this.k = this.d.AmInterfaceEcho();
        this.AmInterfaceCharlie = AmInterfaceGolf.b(this.AmInterfaceGolf, this.k[this.AmInterfaceEcho++]);
      } else if (AbstractUsingSeekableByteChannel instanceof AmInterfaceGolf) {
        this.AmInterfaceCharlie = (AmInterfaceGolf)AbstractUsingSeekableByteChannel;
      } 
    } else if (this.d != null && this.AmInterfaceEcho < this.k.length) {
      this.AmInterfaceCharlie = AmInterfaceGolf.b(this.AmInterfaceGolf, this.k[this.AmInterfaceEcho++]);
    } else {
      return null;
    } 
    if (this.AmInterfaceCharlie != null) {
      this.f = this.AmInterfaceCharlie.AbstractUsingSeekableByteChannel(this.AmInterfaceGolf);
      this.f.position(0);
    } 
    return this.f;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/al/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */