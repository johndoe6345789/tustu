package G;

import bH.D;
import bH.t;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GInterfaceBf extends Q implements Serializable {
  private String b = null;

  private int c = -1;

  String a = null;

  private bQ d = null;

  private String e = null;

  public GInterfaceBf() {
    this.d = new bg(this);
  }

  public GInterfaceBf(bQ parambQ) {
    this.d = parambQ;
  }

  public void a(String paramString) {
    try {
      bP bP = d();
      bP.a(paramString.getBytes("UTF-8"));
      this.a = paramString;
      b();
    } catch (IOException iOException) {
      Logger.getLogger(bf.class.getName())
          .log(Level.SEVERE, "Unable to set TuningView", iOException);
    }
  }

  public String a() {
    return this.e;
  }

  public String b() {
    bP bP = d();
    String str = t.a(bP.a());
    if (this.e == null) {
      D.d("Setting checksum for TuningView: " + aL());
    } else if (!this.e.equals(str)) {
      D.d("updating checksum for TuningView: " + aL());
    }
    this.e = str;
    return this.e;
  }

  public void b(String paramString) {
    this.e = paramString;
  }

  public String c() {
    return this.b;
  }

  public void c(String paramString) {
    this.b = paramString;
  }

  public bP d() {
    return e().a(aL(), this.e);
  }

  public bQ e() {
    if (this.d == null) this.d = new bg(this);
    return this.d;
  }

  public void a(int paramInt) {
    this.c = paramInt;
  }

  public int f() {
    return this.c;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
