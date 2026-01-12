package aJ;

import bH.c;
import java.util.ArrayList;
import java.util.List;

public class AjInterfaceBravo {
  List a = new ArrayList();

  public void a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length < 512)
      throw new IndexOutOfBoundsException("Boot Sector should be at least 512 bytes.");
    this.a.clear();
    byte[] arrayOfByte = new byte[16];
    char c = 'ƾ';
    do {
      System.arraycopy(paramArrayOfbyte, c, arrayOfByte, 0, arrayOfByte.length);
      if (c.e(arrayOfByte)) continue;
      c c1 = new c();
      c1.a(arrayOfByte);
      this.a.add(c1);
      c += '\020';
    } while (c < 'Ǿ');
  }

  public List a() {
    return this.a;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aJ/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
