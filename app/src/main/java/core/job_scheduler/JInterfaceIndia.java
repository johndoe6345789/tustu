package J;

import G.Exceptionprintstacktrace;
import G.GComponentCr;
import G.GInterfaceDb;
import G.ManagerUsingArrayList;
import G.c;
import G.k;
import I.IInterfaceDelta;
import java.io.Serializable;

public class JInterfaceIndia extends h implements GComponentCr, Serializable {
  public static String b = "protocolError";

  protected String[] c =
      new String[] {
        "okCount", "runtimeDataCount", "pageReadCount", "configErrorCount", "burnOk", "pageTenOk",
            "underrunCount", "overrunCount", "unrecognizedCommand", "remoteCrcFailureCount",
        "busyCount", "outOfRangeCount", "flashLockedCount", "pcCrcFailureCount",
            "undefinedErrorCount", "parityErrorCount", "framingErrorCount", "serialNoiseErrorCount",
            "txmodeErrorCount", "unknownErrorCount",
        "sequenceFailure1", "sequenceFailure2", "canQueueFull", "canTimeout", "canFailure",
            "canData", "protocolError", "canDeviceUnavailable", "genericError", "criticalError"
      };

  protected int IInterfaceDelta = 0;

  protected int e = 0;

  protected int f = 0;

  protected int g = 0;

  protected int h = 0;

  protected int i = 0;

  protected int j = 0;

  protected int k = 0;

  protected int l = 0;

  protected int m = 0;

  protected int n = 0;

  protected int o = 0;

  protected int p = 0;

  protected int q = 0;

  protected int r = 0;

  protected int s = 0;

  protected int t = 0;

  protected int u = 0;

  protected int v = 0;

  private int x = 0;

  private int y = 0;

  private int z = 0;

  private int A = 0;

  private int B = 0;

  private int C = 0;

  private int D = 0;

  private int E = 0;

  private int F = 0;

  protected int w = 0;

  public int e() {
    return g() + h() + i() + j() + k() + l() + ah();
  }

  public int f() {
    return m()
        + n()
        + o()
        + p()
        + q()
        + r()
        + v()
        + V()
        + u()
        + W()
        + X()
        + Y()
        + Z()
        + aa()
        + ab()
        + ac()
        + af()
        + ad()
        + ae()
        + ai()
        + aj()
        + Exceptionprintstacktrace();
  }

  public void a() {
    a(0);
    b(0);
    c(0);
    IInterfaceDelta(0);
    e(0);
    f(0);
    g(0);
    h(0);
    i(0);
    j(0);
    k(0);
    l(0);
    m(0);
    n(0);
    o(0);
    p(0);
    q(0);
    r(0);
    s(0);
    t(0);
    u(0);
    v(0);
    w(0);
    x(0);
    y(0);
    z(0);
    A(0);
    B(0);
  }

  public int g() {
    return this.IInterfaceDelta;
  }

  public void a(int paramInt) {
    this.IInterfaceDelta = paramInt;
  }

  public int h() {
    return this.e;
  }

  public void b(int paramInt) {
    this.e = paramInt;
  }

  public int i() {
    return this.f;
  }

  public void c(int paramInt) {
    this.f = paramInt;
  }

  public int j() {
    return this.g;
  }

  public void IInterfaceDelta(int paramInt) {
    this.g = paramInt;
  }

  public int k() {
    return this.h;
  }

  public void e(int paramInt) {
    this.h = paramInt;
  }

  public int l() {
    return this.i;
  }

  public void f(int paramInt) {
    this.i = paramInt;
  }

  public int m() {
    return this.j;
  }

  public void g(int paramInt) {
    this.j = paramInt;
  }

  public int n() {
    return this.k;
  }

  public void h(int paramInt) {
    this.k = paramInt;
  }

  public int o() {
    return this.l;
  }

  public void i(int paramInt) {
    this.l = paramInt;
  }

  public int p() {
    return this.m;
  }

  public void j(int paramInt) {
    this.m = paramInt;
  }

  public int q() {
    return this.o;
  }

  public void k(int paramInt) {
    this.o = paramInt;
  }

  public int r() {
    return this.p;
  }

  public void l(int paramInt) {
    this.p = paramInt;
  }

  public void t() {
    this.k++;
  }

  public int u() {
    return this.n;
  }

  public int v() {
    return this.w;
  }

  public void m(int paramInt) {
    this.w = paramInt;
  }

  public void w() {
    this.j++;
  }

  public void x() {
    this.m++;
  }

  public void y() {
    this.l++;
  }

  public void z() {
    this.o++;
  }

  public void A() {
    this.n++;
  }

  public void B() {
    this.p++;
  }

  public void C() {
    this.w++;
  }

  public void D() {
    this.IInterfaceDelta++;
  }

  public void E() {
    this.h++;
  }

  public void F() {
    this.e++;
  }

  public void G() {
    this.f++;
  }

  public void H() {
    this.g++;
  }

  public void I() {
    this.i++;
  }

  public void J() {
    this.q++;
  }

  public void K() {
    this.r++;
  }

  public void L() {
    this.s++;
  }

  public void M() {
    this.t++;
  }

  public void N() {
    this.u++;
  }

  public void O() {
    this.v++;
  }

  public void P() {
    this.x++;
  }

  public void Q() {
    this.y++;
  }

  public void R() {
    this.z++;
  }

  public void S() {
    this.A++;
  }

  public void T() {
    this.A++;
  }

  public void U() {
    this.D++;
  }

  public String[] s() {
    return this.c;
  }

  public String c() {
    return ManagerUsingArrayList.a;
  }

  public int V() {
    return this.q;
  }

  public void n(int paramInt) {
    this.q = paramInt;
  }

  public int W() {
    return this.r;
  }

  public void o(int paramInt) {
    this.r = paramInt;
  }

  public int X() {
    return this.s;
  }

  public void p(int paramInt) {
    this.s = paramInt;
  }

  public int Y() {
    return this.t;
  }

  public void q(int paramInt) {
    this.t = paramInt;
  }

  public int Z() {
    return this.u;
  }

  public void r(int paramInt) {
    this.u = paramInt;
  }

  public int aa() {
    return this.v;
  }

  public void s(int paramInt) {
    this.v = paramInt;
  }

  public int ab() {
    return this.x;
  }

  public void t(int paramInt) {
    this.x = paramInt;
  }

  public int ac() {
    return this.y;
  }

  public void u(int paramInt) {
    this.y = paramInt;
  }

  public int ad() {
    return this.z;
  }

  public void v(int paramInt) {
    this.z = paramInt;
  }

  public int ae() {
    return this.A;
  }

  public void w(int paramInt) {
    this.A = paramInt;
  }

  public int af() {
    return this.B;
  }

  public void x(int paramInt) {
    this.B = paramInt;
  }

  public void ag() {
    this.C++;
  }

  public int ah() {
    return this.C;
  }

  public void y(int paramInt) {
    this.C = paramInt;
  }

  public void b() {
    Exceptionprintstacktrace Exceptionprintstacktrace = new Exceptionprintstacktrace();
    Exceptionprintstacktrace.v("protocolError");
    Exceptionprintstacktrace.a((GInterfaceDb) new c("Protocol Error"));
    Exceptionprintstacktrace.b((GInterfaceDb) new c("Protocol Error"));
    Exceptionprintstacktrace.a(k.q);
    Exceptionprintstacktrace.b(k.a);
    Exceptionprintstacktrace.c(k.i);
    Exceptionprintstacktrace.IInterfaceDelta(k.c);
    Exceptionprintstacktrace.a(h.a);
    IInterfaceDelta.a().a(Exceptionprintstacktrace);
  }

  public void IInterfaceDelta() {
    IInterfaceDelta.a().b("protocoloError");
  }

  public int ai() {
    return this.D;
  }

  public void z(int paramInt) {
    this.D = paramInt;
  }

  public int aj() {
    return this.E;
  }

  public void A(int paramInt) {
    this.E = paramInt;
  }

  public int Exceptionprintstacktrace() {
    return this.F;
  }

  public void B(int paramInt) {
    this.F = paramInt;
  }

  public void al() {
    this.E++;
  }

  public void am() {
    this.F++;
  }

  public void an() {
    ManagerUsingArrayList.a().a("okCount", g());
    ManagerUsingArrayList.a().a("runtimeDataCount", h());
    ManagerUsingArrayList.a().a("pageReadCount", i());
    ManagerUsingArrayList.a().a("configErrorCount", j());
    ManagerUsingArrayList.a().a("burnOk", k());
    ManagerUsingArrayList.a().a("pageTenOk", l());
    ManagerUsingArrayList.a().a("underrunCount", m());
    ManagerUsingArrayList.a().a("overrunCount", n());
    ManagerUsingArrayList.a().a("unrecognizedCommand", o());
    ManagerUsingArrayList.a().a("remoteCrcFailureCount", p());
    ManagerUsingArrayList.a().a("busyCount", u());
    ManagerUsingArrayList.a().a("outOfRangeCount", q());
    ManagerUsingArrayList.a().a("flashLockedCount", r());
    ManagerUsingArrayList.a().a("pcCrcFailureCount", v());
    ManagerUsingArrayList.a().a("undefinedErrorCount", V());
    ManagerUsingArrayList.a().a("parityErrorCount", W());
    ManagerUsingArrayList.a().a("framingErrorCount", X());
    ManagerUsingArrayList.a().a("serialNoiseErrorCount", Y());
    ManagerUsingArrayList.a().a("txmodeErrorCount", Z());
    ManagerUsingArrayList.a().a("unknownErrorCount", aa());
    ManagerUsingArrayList.a().a("sequenceFailure1", ab());
    ManagerUsingArrayList.a().a("sequenceFailure2", ac());
    ManagerUsingArrayList.a().a("canQueueFull", ad());
    ManagerUsingArrayList.a().a("canTimeout", ae());
    ManagerUsingArrayList.a().a("canFailure", af());
    ManagerUsingArrayList.a().a("canData", ah());
    ManagerUsingArrayList.a().a("canDeviceUnavailable", ai());
    ManagerUsingArrayList.a().a("genericError", aj());
    ManagerUsingArrayList.a().a("criticalError", Exceptionprintstacktrace());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/J/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
