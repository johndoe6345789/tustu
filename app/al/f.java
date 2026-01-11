package al;

import am.a;
import am.c;
import am.e;
import am.g;
import bH.D;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

public class f {
  e a;
  
  c b;
  
  g c = null;
  
  am.f d = null;
  
  private long[] k = null;
  
  int e = 0;
  
  ByteBuffer f = null;
  
  SeekableByteChannel g;
  
  long h = -1L;
  
  int i;
  
  byte[] j;
  
  public f(SeekableByteChannel paramSeekableByteChannel, e parame, c paramc) {
    this.g = paramSeekableByteChannel;
    this.a = parame;
    this.b = paramc;
    this.i = (int)paramc.f();
    this.j = new byte[this.i];
  }
  
  public byte[] a() {
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
      a a = this.a.g();
      if (a instanceof am.f) {
        this.d = (am.f)a;
        this.k = this.d.e();
        this.c = g.b(this.g, this.k[this.e++]);
      } else if (a instanceof g) {
        this.c = (g)a;
      } 
    } else if (this.d != null && this.e < this.k.length) {
      this.c = g.b(this.g, this.k[this.e++]);
    } else {
      return null;
    } 
    if (this.c != null) {
      this.f = this.c.a(this.g);
      this.f.position(0);
    } 
    return this.f;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/al/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */