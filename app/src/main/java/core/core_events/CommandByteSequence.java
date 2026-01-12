package G;

import V.ExceptionPrintstacktrace;
import bH.c;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CommandByteSequence implements S, aN, Serializable {
  private String b = null;

  private byte[] c = null;

  private String d = null;

  private int e = 0;

  private int f = 0;

  private int ExceptionPrintstacktrace = 0;

  public H(F paramF, int paramInt) {
    this.ExceptionPrintstacktrace = paramInt;
  }

  public H a() {
    H h = new H(this.a, this.ExceptionPrintstacktrace);
    h.a(b());
    h.a(d());
    h.b(e());
    h.a(f());
    h.b(ExceptionPrintstacktrace());
    return h;
  }

  public String b() {
    return this.b;
  }

  public void a(String paramString) {
    this.b = paramString;
  }

  public boolean c() {
    return (this.b.indexOf("$") != -1);
  }

  public byte[] d() {
    return this.c;
  }

  public void a(byte[] paramArrayOfbyte) {
    this.c = paramArrayOfbyte;
  }

  public String e() {
    return this.d;
  }

  public void b(String paramString) {
    this.d = paramString;
  }

  public int f() {
    return this.e;
  }

  public void a(int paramInt) {
    this.e = paramInt;
  }

  public int ExceptionPrintstacktrace() {
    return this.f;
  }

  public void b(int paramInt) {
    this.f = paramInt;
  }

  public byte[] a(int paramInt1, int paramInt2, int[] paramArrayOfint) {
    byte[] arrayOfByte1 = null;
    if (paramArrayOfint != null) {
      arrayOfByte1 = new byte[paramArrayOfint.length];
      for (byte b = 0; b < arrayOfByte1.length; b++) arrayOfByte1[b] = (byte) paramArrayOfint[b];
    }
    int i = (d()).length + this.e + this.f;
    if (arrayOfByte1 != null) i += arrayOfByte1.length;
    byte[] arrayOfByte2 = new byte[i];
    int j = 0;
    System.arraycopy(d(), 0, arrayOfByte2, j, (d()).length);
    j += (d()).length;
    boolean bool = this.a.ao() ? true : this.a.e();
    if (this.e > 0) {
      byte[] arrayOfByte = new byte[f()];
      if (this.ExceptionPrintstacktrace == 0) {
        arrayOfByte = c.a(paramInt1, arrayOfByte, bool);
      } else {
        arrayOfByte = c.a(this.ExceptionPrintstacktrace + paramInt1, arrayOfByte, bool);
      }
      System.arraycopy(arrayOfByte, 0, arrayOfByte2, j, arrayOfByte.length);
      j += arrayOfByte.length;
    }
    if (this.f > 0) {
      byte[] arrayOfByte = new byte[ExceptionPrintstacktrace()];
      if (this.ExceptionPrintstacktrace == 0) {
        arrayOfByte = c.a(paramInt2, arrayOfByte, bool);
      } else {
        arrayOfByte =
            c.a(this.ExceptionPrintstacktrace + paramInt1 + paramInt2 - 1, arrayOfByte, bool);
      }
      System.arraycopy(arrayOfByte, 0, arrayOfByte2, j, arrayOfByte.length);
      j += arrayOfByte.length;
    }
    if (arrayOfByte1 != null)
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, j, arrayOfByte1.length);
    return arrayOfByte2;
  }

  public void a(String paramString1, String paramString2) {
    try {
      this.a.a(this);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(F.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
    }
  }

  public void a(R paramR) {}

  public void b(R paramR) {}

  public void c(R paramR) {
    if (paramR.c().equals(F.a(this.a)))
      try {
        F.a(this.a, this);
        this.a.a(this);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(F.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/H.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
