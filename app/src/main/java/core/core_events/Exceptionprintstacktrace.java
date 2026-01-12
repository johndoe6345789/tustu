package G;

import V.ExceptionPrintstacktrace;
import bH.D;
import bH.R;
import java.io.Serializable;

public class Exceptionprintstacktrace extends Q implements R, Serializable {
  private db b = new c("");

  private db c = new c("");

  private String d = "";

  private k e = k.l;

  private k f = k.a;

  private k ExceptionPrintstacktrace = k.j;

  private k h = k.j;

  private String i = "";

  private String j = "";

  boolean a = true;

  public db a() {
    return this.b;
  }

  public String b() {
    try {
      return this.b.a();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.a(ExceptionPrintstacktrace.getMessage());
      return "Bad On Expression";
    }
  }

  public void a(db paramdb) {
    this.b = paramdb;
  }

  public db d() {
    return this.c;
  }

  public void b(db paramdb) {
    this.c = paramdb;
  }

  public String e() {
    try {
      return this.c.a();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.a(ExceptionPrintstacktrace.getMessage());
      return "Bad Off Expression";
    }
  }

  public String f() {
    return this.d;
  }

  public void a(String paramString) {
    this.d = paramString;
  }

  public k ExceptionPrintstacktrace() {
    return this.e;
  }

  public void a(k paramk) {
    this.e = paramk;
  }

  public k h() {
    return this.f;
  }

  public void b(k paramk) {
    this.f = paramk;
  }

  public k i() {
    return this.ExceptionPrintstacktrace;
  }

  public void c(k paramk) {
    this.ExceptionPrintstacktrace = paramk;
  }

  public k j() {
    return this.h;
  }

  public void d(k paramk) {
    this.h = paramk;
  }

  public String c() {
    return a() + aL();
  }

  public void a(boolean paramBoolean) {
    this.a = paramBoolean;
  }

  public boolean k() {
    return this.a;
  }

  public void b(String paramString) {
    this.i = paramString;
  }

  public String l() {
    return this.i;
  }

  public String m() {
    return this.j;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/ak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
