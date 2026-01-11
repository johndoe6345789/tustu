package bI;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class c extends FilterOutputStream {
  private boolean a;
  
  private int b;
  
  private byte[] c;
  
  private int d;
  
  private int e;
  
  private boolean f;
  
  private byte[] g;
  
  private boolean h;
  
  private int i;
  
  private byte[] j;
  
  public c(OutputStream paramOutputStream, int paramInt) {
    super(paramOutputStream);
    this.f = ((paramInt & 0x8) != 0);
    this.a = ((paramInt & 0x1) != 0);
    this.d = this.a ? 3 : 4;
    this.c = new byte[this.d];
    this.b = 0;
    this.e = 0;
    this.h = false;
    this.g = new byte[4];
    this.i = paramInt;
    this.j = a.a(paramInt);
  }
  
  public void write(int paramInt) {
    if (this.h) {
      this.out.write(paramInt);
      return;
    } 
    if (this.a) {
      this.c[this.b++] = (byte)paramInt;
      if (this.b >= this.d) {
        this.out.write(a.a(this.g, this.c, this.d, this.i));
        this.e += 4;
        if (this.f && this.e >= 76) {
          this.out.write(10);
          this.e = 0;
        } 
        this.b = 0;
      } 
    } else if (this.j[paramInt & 0x7F] > -5) {
      this.c[this.b++] = (byte)paramInt;
      if (this.b >= this.d) {
        int i = a.a(this.c, 0, this.g, 0, this.i);
        this.out.write(this.g, 0, i);
        this.b = 0;
      } 
    } else if (this.j[paramInt & 0x7F] != -5) {
      throw new IOException("Invalid character in Base64 data.");
    } 
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.h) {
      this.out.write(paramArrayOfbyte, paramInt1, paramInt2);
      return;
    } 
    for (byte b = 0; b < paramInt2; b++)
      write(paramArrayOfbyte[paramInt1 + b]); 
  }
  
  public void a() {
    if (this.b > 0)
      if (this.a) {
        this.out.write(a.a(this.g, this.c, this.b, this.i));
        this.b = 0;
      } else {
        throw new IOException("Base64 input not properly padded.");
      }  
  }
  
  public void close() {
    a();
    super.close();
    this.c = null;
    this.out = null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bI/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */