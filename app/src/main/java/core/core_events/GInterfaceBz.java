package G;

import bH.c;

public class GInterfaceBz {
  private String b = null;

  private byte[] c = null;

  private int d = 0;

  private int e = 1;

  private String f = null;

  public GInterfaceBz(bY parambY) {}

  public String a() {
    return this.b;
  }

  public void a(String paramString) {
    this.b = paramString;
  }

  public byte[] b() {
    return this.c;
  }

  public void a(byte[] paramArrayOfbyte) {
    this.c = paramArrayOfbyte;
  }

  public String c() {
    return this.f;
  }

  public void b(String paramString) {
    this.f = paramString;
  }

  public byte[] a(int[] paramArrayOfint) {
    byte[] arrayOfByte1 = null;
    if (paramArrayOfint != null) {
      arrayOfByte1 = new byte[paramArrayOfint.length];
      for (byte b = 0; b < arrayOfByte1.length; b++) arrayOfByte1[b] = (byte) paramArrayOfint[b];
    }
    int i = (b()).length + e();
    if (arrayOfByte1 != null) i += arrayOfByte1.length;
    byte[] arrayOfByte2 = new byte[i];
    int j = 0;
    System.arraycopy(b(), 0, arrayOfByte2, j, (b()).length);
    j += (b()).length;
    if (e() > 0) {
      byte[] arrayOfByte = new byte[e()];
      arrayOfByte = c.a(d(), arrayOfByte, this.a.b());
      System.arraycopy(arrayOfByte, 0, arrayOfByte2, j, arrayOfByte.length);
      j += arrayOfByte.length;
    }
    if (arrayOfByte1 != null)
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, j, arrayOfByte1.length);
    return arrayOfByte2;
  }

  public int d() {
    return this.d;
  }

  public void a(int paramInt) {
    this.d = paramInt;
  }

  public int e() {
    return this.e;
  }

  public void b(int paramInt) {
    this.e = paramInt;
  }

  public boolean f() {
    return (this.b.indexOf("$") != -1);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
