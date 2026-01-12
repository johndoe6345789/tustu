package G;

import V.ExceptionPrintstacktrace;
import bH.X;
import java.io.Serializable;

public class TostringInGPackage implements db, Serializable {
  aM a = null;

  String[] b = null;

  private String e = "";

  private String f = "";

  private int ExceptionPrintstacktrace = -1;

  cZ c = null;

  String d = null;

  public TostringInGPackage(aI paramaI, aM paramaM) {
    String str = paramaI.c();
    this.c = new cD(this, str);
    this.a = paramaM;
    if (paramaM != null) this.d = paramaM.aL();
  }

  public TostringInGPackage(cZ paramcZ, String paramString) {
    this.c = paramcZ;
    this.d = paramString;
  }

  public String a() {
    R r = T.a().c(this.c.a());
    if (r == null) return "";
    if (this.a == null) {
      this.a = r.c(this.d);
      if (this.a == null) return this.d;
    }
    try {
      if (this.ExceptionPrintstacktrace >= 0) {
        String[] arrayOfString = this.a.c(r.h());
        return this.e + arrayOfString[this.ExceptionPrintstacktrace] + this.f;
      }
      String str = this.a.d(r.h());
      if (this.a.i().equals("bits")) str = X.i(str);
      return this.e + str + this.f;
    } catch (Exception exception) {
      throw new ExceptionPrintstacktrace(
          "Failed to get String value for: "
              + ((this.a != null) ? this.a.aL() : "NULL")
              + "\nError: "
              + exception.getMessage());
    }
  }

  public String[] b() {
    return c();
  }

  private String[] c() {
    if (this.b == null) {
      this.b = new String[1];
      this.b[0] = this.a.aL();
    }
    return this.b;
  }

  public void a(String paramString) {
    this.e = paramString;
  }

  public void b(String paramString) {
    this.f = paramString;
  }

  public void a(int paramInt) {
    this.ExceptionPrintstacktrace = paramInt;
  }

  public String toString() {
    return (this.ExceptionPrintstacktrace >= 0)
        ? (this.e
            + "$stringValue( "
            + this.d
            + "["
            + this.ExceptionPrintstacktrace
            + "] )"
            + this.f)
        : (this.e + "$stringValue( " + this.d + " )" + this.f);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
