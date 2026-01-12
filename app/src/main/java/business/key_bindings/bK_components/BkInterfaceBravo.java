package business.key_bindings.bK_components;

class BkInterfaceBravo {
  byte[] a;

  private char[] b;

  private int c;

  private int d;

  public BkInterfaceBravo(int paramInt) {
    this.a = new byte[paramInt];
    this.b = new char[paramInt];
    this.d = 0;
    for (byte b1 = 0; b1 < 'Ā'; b1++) this.a[b1] = (byte) b1;
    this.d = 257;
    this.c = this.d;
  }

  public void a() {
    this.d = this.c;
  }

  public int b() {
    return this.d;
  }

  public char a(char paramChar, byte paramByte) {
    if (paramChar >= this.d) throw new ArrayIndexOutOfBoundsException(Integer.toString(paramChar));
    this.a[this.d] = paramByte;
    this.b[this.d] = paramChar;
    this.d++;
    return (char) (this.d - 1);
  }

  public void a(char paramChar, a parama) {
    if (paramChar >= this.d) throw new ArrayIndexOutOfBoundsException(Integer.toString(paramChar));
    parama.a();
    while (paramChar > 'Ā') {
      parama.a(this.a[paramChar]);
      paramChar = this.b[paramChar];
    }
    parama.a(this.a[paramChar]);
    parama.d();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bK/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
