package bK;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class c extends InputStream {
  private InputStream a;
  
  private int b;
  
  private int c;
  
  private int d = -1;
  
  private b e;
  
  private boolean f;
  
  private a g = new a(128);
  
  private int h = 9;
  
  private int i = -1;
  
  private int j;
  
  private int k;
  
  private int l = 0;
  
  public c(InputStream paramInputStream) {
    this();
    this.a = paramInputStream;
  }
  
  public c() {}
  
  private int a(int paramInt) {
    while (this.c < paramInt) {
      int k = this.a.read();
      if (k < 0)
        return -1; 
      this.b |= k << this.c;
      this.c += 8;
    } 
    int i = (1 << paramInt) - 1;
    int j = this.b & i;
    this.b >>>= paramInt;
    this.c -= paramInt;
    return j;
  }
  
  private void b() {
    int i = this.a.read() << 8 | this.a.read();
    if (i != 8093)
      throw new RuntimeException("Bad magic number " + i); 
    int j = this.a.read();
    this.f = ((j & 0x80) != 0);
    this.d = j & 0x1F;
    if (this.d > 16)
      throw new RuntimeException("Cannot handle " + this.d + " bits"); 
    this.e = new b(1 << this.d);
  }
  
  private int c() {
    int i = a(this.h);
    this.k++;
    if (i < 0)
      return -1; 
    if (i == 256) {
      while (this.f && this.k % 8 != 0) {
        a(this.h);
        this.k++;
      } 
      this.e.a();
      this.g.a();
      this.i = -1;
      this.h = 9;
      return 0;
    } 
    int j = this.e.b();
    if (i < j) {
      this.e.a((char)i, this.g);
    } else if (i == j) {
      this.g.a(this.g.c()[0]);
    } else {
      throw new IOException("Invalid code " + i);
    } 
    this.j = 0;
    if (this.i >= 0 && j < 1 << this.d) {
      this.e.a((char)this.i, this.g.c()[0]);
      if (j + 1 >= 1 << this.h && this.h < this.d) {
        this.h++;
        this.k = 0;
      } 
    } 
    this.i = (char)i;
    return this.g.b();
  }
  
  public int read() {
    if (this.d < 0)
      b(); 
    while (this.j >= this.g.b()) {
      if (c() < 0)
        return -1; 
    } 
    return 0xFF & this.g.c()[this.j++];
  }
  
  public static int a(c paramc, OutputStream paramOutputStream) {
    byte[] arrayOfByte = new byte[128];
    int i;
    while ((i = paramc.read(arrayOfByte)) >= 0) {
      paramOutputStream.write(arrayOfByte, 0, i);
      paramc.l += i;
    } 
    paramOutputStream.flush();
    return paramc.a();
  }
  
  public int a() {
    return this.l;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bK/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */