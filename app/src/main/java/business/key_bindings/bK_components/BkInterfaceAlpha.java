package business.key_bindings.bK_components;

class BkInterfaceAlpha {
  private byte[] a;

  private int b;

  public BkInterfaceAlpha(int paramInt) {
    this.a = new byte[paramInt];
  }

  public void a() {
    this.b = 0;
  }

  public int b() {
    return this.b;
  }

  public byte[] c() {
    return this.a;
  }

  public void a(byte paramByte) {
    if (this.b >= this.a.length) {
      byte[] arrayOfByte = this.a;
      this.a = new byte[arrayOfByte.length + 16];
      System.arraycopy(arrayOfByte, 0, this.a, 0, this.b);
    }
    this.a[this.b++] = paramByte;
  }

  public void d() {
    for (byte b = 0; b < this.b / 2; b++) {
      byte b1 = this.a[b];
      this.a[b] = this.a[this.b - 1 - b];
      this.a[this.b - 1 - b] = b1;
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bK/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
