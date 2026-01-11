package bR;

import G.f;
import bH.D;
import bN.BnInterfaceKilo;
import bN.TostringInBnPackage;
import bN.BnInterfaceMike;
import bN.BnInterfaceTango;
import java.util.zip.CRC32;

public BrInterfaceCharlielass BrInterfaceCharlie {
  private b d = null;
  
  private BnInterfaceTango e = null;
  
  private e f = null;
  
  private TostringInBnPackage g;
  
  private BnInterfaceMike h;
  
  BnInterfaceKilo a;
  
  f b = new f();
  
  CRC32 c = new CRC32();
  
  private boolean i = true;
  
  protected BrInterfaceCharlie(BnInterfaceKilo paramk) {
    this.d = new b(paramk);
    this.f = new e(paramk);
    this.a = paramk;
    this.h = new BnInterfaceMike(paramk);
    this.g = new TostringInBnPackage();
  }
  
  public b a() {
    return this.d;
  }
  
  public BnInterfaceTango b() {
    return this.e;
  }
  
  public e c() {
    return this.f;
  }
  
  public void a(byte[] paramArrayOfbyte) {
    if (b(paramArrayOfbyte)) {
      this.e = (BnInterfaceTango)this.g;
    } else {
      this.e = (BnInterfaceTango)this.h;
    } 
    this.e.c(paramArrayOfbyte);
  }
  
  private boolean b(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte.length > 0 && bH.c.a(paramArrayOfbyte[0]) > 192);
  }
  
  public boolean d() {
    if (this.f.c() == -1)
      return true; 
    int i = g();
    if (i != this.f.c())
      D.b("Checksum Error: Expected: 0x" + Integer.toHexString(i).toUpperCase() + ", found: 0x" + Integer.toHexString(this.f.c()).toUpperCase()); 
    return (i == this.f.c());
  }
  
  public void e() {
    int i = this.e.b() + this.f.b();
    this.d.a(i);
  }
  
  public void f() {
    if (this.f.c() != -1) {
      int i = g();
      this.f.a(i);
    } 
  }
  
  public int g() {
    if (this.f.c() == -1)
      return -1; 
    if (this.a.f() == 1)
      try {
        byte[] arrayOfByte1 = this.d.b(this.b.b(this.d.a()));
        byte[] arrayOfByte2 = this.e.a(this.b.b(this.e.b()));
        byte[] arrayOfByte3 = this.f.b(this.b.b(this.f.a() - this.f.d()));
        int i = 0;
        byte b1;
        for (b1 = 0; b1 < arrayOfByte1.length; b1++)
          i += bH.c.a(arrayOfByte1[b1]); 
        for (b1 = 0; b1 < arrayOfByte2.length; b1++)
          i += bH.c.a(arrayOfByte2[b1]); 
        for (b1 = 0; b1 < arrayOfByte3.length; b1++)
          i += bH.c.a(arrayOfByte3[b1]); 
        i %= 256;
        this.b.a(arrayOfByte1);
        this.b.a(arrayOfByte2);
        this.b.a(arrayOfByte3);
        return i;
      } catch (a a) {
        D.b("CRC Validation failed with unexpected buffer size: " + a.getLocalizedMessage());
        return -1;
      }  
    if (this.a.f() == 4)
      try {
        byte[] arrayOfByte1 = this.d.b(this.b.b(this.d.a()));
        byte[] arrayOfByte2 = this.e.a(this.b.b(this.e.b()));
        byte[] arrayOfByte3 = this.f.b(this.b.b(this.f.a() - this.f.d()));
        this.c.reset();
        this.c.update(arrayOfByte1);
        this.c.update(arrayOfByte2);
        this.c.update(arrayOfByte3);
        this.b.a(arrayOfByte1);
        this.b.a(arrayOfByte2);
        this.b.a(arrayOfByte3);
        return (int)this.c.getValue();
      } catch (a a) {
        D.b("CRC Validation failed with unexpected buffer size: " + a.getLocalizedMessage());
        return -1;
      }  
    D.b("Unsupported CRC Size: " + this.a.f() + " skipping check, currently only 1 and 4 are supported.");
    return -1;
  }
  
  public byte[] h() {
    byte[] arrayOfByte1 = this.d.b(this.b.b(this.d.a()));
    byte[] arrayOfByte2 = this.e.a(this.b.b(this.e.b()));
    byte[] arrayOfByte3 = this.f.a(this.b.b(this.f.a()));
    byte[] arrayOfByte4 = new byte[arrayOfByte1.length + arrayOfByte2.length + arrayOfByte3.length];
    int i = 0;
    System.arraycopy(arrayOfByte1, 0, arrayOfByte4, i, arrayOfByte1.length);
    i += arrayOfByte1.length;
    System.arraycopy(arrayOfByte2, 0, arrayOfByte4, i, arrayOfByte2.length);
    i += arrayOfByte2.length;
    System.arraycopy(arrayOfByte3, 0, arrayOfByte4, i, arrayOfByte3.length);
    this.b.a(arrayOfByte1);
    this.b.a(arrayOfByte2);
    this.b.a(arrayOfByte3);
    return arrayOfByte4;
  }
  
  public void i() {
    if (this.a.BnInterfaceMike()) {
      int i;
      if (this.e instanceof TostringInBnPackage) {
        i = this.a.i() - this.e.b();
      } else {
        i = this.a.j() - this.e.b();
      } 
      if (i != this.f.b()) {
        this.b.a(this.f.e());
        this.f.c(this.b.b(i));
      } 
    } 
  }
  
  public boolean j() {
    return this.i;
  }
  
  public void a(boolean paramBoolean) {
    this.i = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bR/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */