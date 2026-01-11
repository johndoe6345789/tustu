package G;

import V.ExceptionPrintstacktrace;
import bH.D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TuneConfiguration implements aI, cr {
  private ae b = new ae();
  
  private String c = "";
  
  private Map d = new HashMap<>();
  
  private an e = null;
  
  private J f = null;
  
  private String ExceptionPrintstacktrace = "";
  
  private boolean h = false;
  
  private HashMap i = null;
  
  private Map j = null;
  
  private Y k = null;
  
  private final Map l = new HashMap<>();
  
  private cs m = null;
  
  private HashMap n = new HashMap<>();
  
  private boolean o = false;
  
  public static int a = -1;
  
  private String p = null;
  
  private boolean q = false;
  
  public R() {
    this.e = new an(this);
  }
  
  private R(Y paramY) {
    this.k = paramY;
    this.l.clear();
    this.l.put("Primary", paramY);
  }
  
  public R a(Y paramY) {
    R r = new R(paramY);
    r.a(this.b.a(r.ab()));
    r.n = new HashMap<>();
    r.m = this.m;
    r.f = this.f;
    r.e = null;
    r.c = this.c;
    r.ExceptionPrintstacktrace = this.ExceptionPrintstacktrace;
    r.d = this.d;
    return r;
  }
  
  public R a() {
    Y y = new Y(this);
    R r = new R(y);
    r.a(this.b.a(r.ab()));
    r.n = new HashMap<>();
    r.m = this.m;
    r.f = this.f;
    r.e = null;
    r.c = this.c;
    r.ExceptionPrintstacktrace = this.ExceptionPrintstacktrace;
    r.d = this.d;
    return r;
  }
  
  public boolean b() {
    String str = i();
    return (str != null && (str.startsWith("MSII Rev 2.8") || str.startsWith("MSII Rev 2.9") || str.startsWith("MSII Rev 3") || str.startsWith("MS3 Format") || str.startsWith("MegaShift") || str.startsWith("MShift") || str.startsWith("Trans") || d("CAN_COMMANDS") != null || d("CAN_COMMANDS_OFF") != null || d("SERIAL") != null || d("SERIAL_OFF") != null));
  }
  
  public void a(String paramString) {
    if (this.c != null && !this.c.isEmpty())
      h.a().b(this.c); 
    this.c = paramString;
    if (this.c != null && !this.c.isEmpty())
      h.a().a(this); 
  }
  
  public String c() {
    return this.c;
  }
  
  public void a(bE parambE) {
    this.b.a(parambE);
  }
  
  public void a(n paramn) {
    this.e.a(paramn);
  }
  
  public void b(n paramn) {
    this.e.b(paramn);
  }
  
  public void d() {
    if (this.e != null)
      this.e.b(); 
  }
  
  public void a(bU parambU) {
    this.e.a(parambU);
  }
  
  public void b(bU parambU) {
    this.e.b(parambU);
  }
  
  public void c(n paramn) {}
  
  public void d(n paramn) {}
  
  public bE e() {
    return this.b.t();
  }
  
  public void a(al paramal) {
    this.b.m().add(paramal);
  }
  
  public boolean a(ac paramac) {
    return this.b.a(paramac);
  }
  
  public boolean b(ac paramac) {
    return this.b.n().remove(paramac);
  }
  
  public ArrayList f() {
    return this.b.m();
  }
  
  public ArrayList ExceptionPrintstacktrace() {
    return this.b.n();
  }
  
  public void a(aM paramaM) {
    aM aM1 = ak().put(paramaM.aL(), paramaM);
    if (aM1 != null)
      this.b.G().remove(aM1); 
    this.b.G().add(paramaM);
  }
  
  public void b(String paramString) {
    aM aM = (aM)ak().remove(paramString);
    if (aM != null) {
      this.b.G().remove(aM);
      List list = (List)this.d.get(Integer.valueOf(aM.d()));
      list.remove(aM);
    } 
  }
  
  public aM c(String paramString) {
    return (aM)ak().get(paramString);
  }
  
  public void a(r paramr) {
    m().put(paramr.aL(), paramr);
  }
  
  public r d(String paramString) {
    return (r)m().get(paramString);
  }
  
  public Y h() {
    return p();
  }
  
  public void a(F paramF) {
    paramF.l(c());
    this.b.a(paramF);
  }
  
  public void e(String paramString) {
    this.b.b(paramString);
  }
  
  public String i() {
    String str1 = this.b.x();
    String str2 = this.b.w();
    return (str1 != null && str2 != null && !str2.isEmpty()) ? (str2 + str1) : str1;
  }
  
  public void j() {
    b(new Y(this));
  }
  
  private HashMap ak() {
    return this.b.a();
  }
  
  public String[] k() {
    Set set = ak().keySet();
    return (String[])set.toArray((Object[])new String[set.size()]);
  }
  
  public Iterator a(int paramInt) {
    if (this.d.isEmpty()) {
      for (byte b = -1; b < O().ExceptionPrintstacktrace(); b++) {
        ArrayList arrayList = new ArrayList();
        this.d.put(Integer.valueOf(b), arrayList);
      } 
      for (aM aM : this.b.G())
        ((ArrayList<aM>)this.d.get(Integer.valueOf(aM.d()))).add(aM); 
    } 
    return ((ArrayList)this.d.get(Integer.valueOf(paramInt))).iterator();
  }
  
  public Collection l() {
    return this.b.G();
  }
  
  public HashMap m() {
    return this.b.b();
  }
  
  public Iterator n() {
    return this.b.c().values().iterator();
  }
  
  public void a(be parambe) {
    this.b.c().put(parambe.aL(), parambe);
  }
  
  public be f(String paramString) {
    return (be)this.b.c().get(paramString);
  }
  
  public Iterator o() {
    return this.b.d().values().iterator();
  }
  
  public void a(bi parambi) {
    this.b.d().put(parambi.aL(), parambi);
  }
  
  public Y p() {
    return this.k;
  }
  
  public void b(Y paramY) {
    this.k = paramY;
    this.l.clear();
    this.l.put("Primary", paramY);
    paramY.a(this.e);
    paramY.a(this.e);
  }
  
  public void a(aH paramaH) {
    this.b.f().put(paramaH.aL(), paramaH);
    this.b.e().add(paramaH);
  }
  
  public Iterator q() {
    return this.b.f().values().iterator();
  }
  
  public int r() {
    return this.b.f().size();
  }
  
  public String[] s() {
    ArrayList<String> arrayList = new ArrayList();
    for (aH aH : this.b.f().values()) {
      if (aH.s())
        arrayList.add(aH.aL()); 
    } 
    return arrayList.<String>toArray(new String[arrayList.size()]);
  }
  
  public aH ExceptionPrintstacktrace(String paramString) {
    return (aH)this.b.f().get(paramString);
  }
  
  public aH b(int paramInt) {
    try {
      return this.b.e().get(paramInt);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      return null;
    } 
  }
  
  public void a(bb parambb) {
    this.b.o().add(parambb);
  }
  
  public void b(bb parambb) {
    this.b.p().add(parambb);
  }
  
  public ArrayList t() {
    return this.b.o();
  }
  
  public ArrayList u() {
    return this.b.p();
  }
  
  public String[] v() {
    ArrayList<String> arrayList = new ArrayList();
    for (bb bb : this.b.o()) {
      if (bb.s())
        arrayList.add(bb.aL()); 
    } 
    return arrayList.<String>toArray(new String[arrayList.size()]);
  }
  
  public bb h(String paramString) {
    for (bb bb : this.b.o()) {
      if (bb.aL().equals(paramString))
        return bb; 
    } 
    return null;
  }
  
  public bb i(String paramString) {
    for (bb bb : this.b.p()) {
      if (bb.aL().equals(paramString))
        return bb; 
    } 
    return null;
  }
  
  public void a(cB paramcB) {
    this.e.a(paramcB);
  }
  
  public void b(cB paramcB) {
    this.e.b(paramcB);
  }
  
  public void a(String paramString, String[] paramArrayOfString) {
    this.b.i().put(paramString, paramArrayOfString);
  }
  
  public String[] j(String paramString) {
    return (String[])this.b.i().get(paramString);
  }
  
  public void a(String[] paramArrayOfString) {
    a("FrontPage", paramArrayOfString);
  }
  
  public void a(ah paramah) {
    this.b.ExceptionPrintstacktrace().put(paramah.aL(), paramah);
  }
  
  public ah k(String paramString) {
    return (ah)this.b.ExceptionPrintstacktrace().get(paramString);
  }
  
  public void a(ak paramak) {
    this.b.h().add(paramak);
  }
  
  public int w() {
    byte b = 0;
    for (ak ak : this.b.h()) {
      if (ak.k())
        b++; 
    } 
    return b;
  }
  
  public void a(cd paramcd) {
    this.b.s().add(paramcd);
  }
  
  public List x() {
    return this.b.s();
  }
  
  public boolean y() {
    return !this.b.s().isEmpty();
  }
  
  public void l(String paramString) {
    if (paramString.equals(cd.e) || paramString.equals(cd.f) || paramString.equals(cd.ExceptionPrintstacktrace) || paramString.equals(cd.h) || paramString.equals(cd.i) || paramString.equals(cd.j) || paramString.equals(cd.k) || paramString.equals(cd.l)) {
      this.b.q().add(paramString);
    } else {
      throw new ExceptionPrintstacktrace("Unsupported Standard Logger '" + paramString + "'. Supported types: " + cd.e + ", " + cd.f + ", " + cd.ExceptionPrintstacktrace + ", " + cd.h + ", " + cd.i + ", " + cd.j + ", " + cd.k + ", " + cd.l + " ");
    } 
  }
  
  public boolean z() {
    return !this.b.q().isEmpty();
  }
  
  public boolean m(String paramString) {
    return this.b.q().contains(paramString);
  }
  
  public ak n(String paramString) {
    ak ak = null;
    for (ak ak1 : this.b.h()) {
      if (ak1.aL().equals(paramString)) {
        ak = ak1;
        break;
      } 
    } 
    return ak;
  }
  
  public Iterator A() {
    return (this.b.h() != null) ? this.b.h().iterator() : null;
  }
  
  public Iterator B() {
    return (this.b.ExceptionPrintstacktrace() != null && this.b.ExceptionPrintstacktrace().values() != null) ? this.b.ExceptionPrintstacktrace().values().iterator() : null;
  }
  
  public void a(String paramString1, String paramString2) {
    aM aM = c(paramString1);
    if (aM == null) {
      D.b(paramString1 + " not in current configuration. Value ignored.");
      return;
    } 
    aM.a(this.k, paramString2);
  }
  
  public void a(String paramString, double[][] paramArrayOfdouble) {
    aM aM = c(paramString);
    if (aM == null) {
      D.b(paramString + " not in current configuration. Value ignored.");
      return;
    } 
    aM.a(this.k, paramArrayOfdouble);
  }
  
  public J C() {
    return this.f;
  }
  
  public void b(String paramString1, String paramString2) {
    this.n.put(paramString1, paramString2);
  }
  
  public String o(String paramString) {
    return (String)this.n.get(paramString);
  }
  
  public void D() {
    this.n.clear();
  }
  
  public void p(String paramString) {
    this.n.put(paramString, "");
  }
  
  public Iterator E() {
    return this.n.keySet().iterator();
  }
  
  public void a(J paramJ) {
    this.f = paramJ;
    paramJ.b(O());
    this.f.a(this.e);
    this.f.a(this.e);
    this.f.a(this.e);
    d(this.f);
  }
  
  public void b(J paramJ) {
    this.f.a(paramJ);
    this.f = paramJ;
  }
  
  public J c(J paramJ) {
    this.f = paramJ;
    paramJ.a(this.e);
    paramJ.a(this.e);
    paramJ.a(this.e);
    d(paramJ);
    return paramJ;
  }
  
  private void d(J paramJ) {
    for (aM aM : ak().values()) {
      if (!aM.C())
        for (byte b = 0; b < aM.z(); b++) {
          if (aM.d() >= 0)
            paramJ.a(this.c, aM.d(), aM.ExceptionPrintstacktrace() + b, false); 
        }  
    } 
  }
  
  public String F() {
    return this.ExceptionPrintstacktrace;
  }
  
  public void q(String paramString) {
    this.ExceptionPrintstacktrace = paramString;
  }
  
  public cs G() {
    if (this.m == null)
      this.m = new cs(); 
    return this.m;
  }
  
  public void H() {
    this.e.d();
  }
  
  public void I() {
    this.e.e();
    C().a(this.b.v());
  }
  
  public void c(int paramInt) {
    this.b.v().E(paramInt);
  }
  
  public String J() {
    return this.b.v().aw() + "";
  }
  
  public R K() {
    return this;
  }
  
  public void a(cW paramcW) {
    this.e.a(paramcW);
  }
  
  public void b(cW paramcW) {
    this.e.b(paramcW);
  }
  
  public void a(dm paramdm) {
    this.b.j().put(paramdm.b(), paramdm);
    this.b.F().add(paramdm.b());
  }
  
  public void a(de paramde) {
    this.b.k().put(paramde.b(), paramde);
  }
  
  public dm r(String paramString) {
    return (dm)this.b.j().get(paramString);
  }
  
  public de s(String paramString) {
    return (de)this.b.k().get(paramString);
  }
  
  public Iterator L() {
    return this.b.F().iterator();
  }
  
  public Iterator M() {
    return this.b.k().keySet().iterator();
  }
  
  public void a(dp paramdp) {
    this.b.l().put(paramdp.c(), paramdp);
  }
  
  public dp t(String paramString) {
    return (dp)this.b.l().get(paramString);
  }
  
  public Iterator N() {
    return this.b.l().keySet().iterator();
  }
  
  public String u(String paramString) {
    String str = (String)this.b.u().get(paramString);
    return (str != null) ? str : paramString;
  }
  
  public void c(String paramString1, String paramString2) {
    this.b.u().put(paramString1, paramString2);
  }
  
  public F O() {
    return this.b.v();
  }
  
  public String P() {
    return this.b.v().y();
  }
  
  public String Q() {
    return this.b.y();
  }
  
  public void v(String paramString) {
    this.b.c(paramString);
  }
  
  public void a(Thread paramThread) {
    this.e.a(paramThread);
  }
  
  public void b(Thread paramThread) {
    this.e.b(paramThread);
  }
  
  public boolean R() {
    return (C() != null && C().q());
  }
  
  public boolean S() {
    return (O() == null || (O().F() && !O().ap()));
  }
  
  void T() {
    this.e.f();
    this.h = true;
  }
  
  public boolean U() {
    return this.b.A();
  }
  
  public void a(boolean paramBoolean) {
    this.b.a(paramBoolean);
  }
  
  public void d(String paramString1, String paramString2) {
    if (paramString2.length() > 1500)
      throw new ExceptionPrintstacktrace("Context Help length is " + paramString2.length() + ", this should be 1500 or less characters in length."); 
    this.b.r().put(paramString1, paramString2);
  }
  
  public String w(String paramString) {
    String str = (String)this.b.r().get(paramString);
    if (str == null && this.j != null)
      str = (String)this.j.get(paramString); 
    return str;
  }
  
  public void a(Map paramMap) {
    this.j = paramMap;
  }
  
  public String V() {
    return this.b.z();
  }
  
  public void x(String paramString) {
    this.b.d(paramString);
  }
  
  public void y(String paramString) {
    this.b.a(paramString);
  }
  
  public boolean W() {
    return this.h;
  }
  
  public void X() {
    for (aH aH : this.b.e()) {
      if (aH.u())
        aH.c(true); 
    } 
  }
  
  public void Y() {
    for (aH aH : this.b.e()) {
      if (aH.u())
        aH.c(false); 
    } 
  }
  
  protected ck a(int paramInt1, int paramInt2) {
    al();
    List list = (List)this.i.get(Integer.valueOf(paramInt1));
    for (ck ck : list) {
      if (ck.a() > paramInt2)
        return ck; 
    } 
    return null;
  }
  
  private void al() {
    if (this.i == null) {
      this.i = new HashMap<>();
      for (byte b = 0; b < this.b.v().ExceptionPrintstacktrace(); b++) {
        ArrayList<ck> arrayList = new ArrayList();
        this.i.put(Integer.valueOf(b), arrayList);
        ck ck = null;
        Iterator<aM> iterator = a(b);
        while (iterator.hasNext()) {
          aM aM = iterator.next();
          if (aM.N()) {
            if (ck == null || ck.a() + ck.b() < aM.ExceptionPrintstacktrace()) {
              ck = new ck(aM.ExceptionPrintstacktrace(), aM.z());
              arrayList.add(ck);
              continue;
            } 
            int i = aM.ExceptionPrintstacktrace() - ck.a();
            ck.b(Math.max(ck.b(), i + aM.z()));
            ck.a(Math.min(ck.a(), aM.ExceptionPrintstacktrace()));
          } 
        } 
      } 
    } 
  }
  
  protected ck b(int paramInt1, int paramInt2) {
    al();
    List list = (List)this.i.get(Integer.valueOf(paramInt1));
    ck ck = null;
    for (ck ck1 : list) {
      if (ck1.a() <= paramInt2)
        ck = ck1; 
    } 
    return ck;
  }
  
  public void z(String paramString) {
    this.b.f().remove(paramString);
    for (byte b = 0; b < this.b.e().size(); b++) {
      aH aH = this.b.e().get(b);
      if (aH.aL().equals(paramString)) {
        this.b.e().remove(b);
        break;
      } 
    } 
  }
  
  public void b(ah paramah) {
    this.b.ExceptionPrintstacktrace().remove(paramah.aL());
  }
  
  public void A(String paramString) {
    this.b.e(paramString);
  }
  
  public String Z() {
    String str = this.b.B();
    return (str != null && !str.isEmpty()) ? str : P();
  }
  
  public void aa() {
    this.d.clear();
  }
  
  public ae ab() {
    return this.b;
  }
  
  public void a(ae paramae) {
    this.b = paramae;
  }
  
  public String ac() {
    return c();
  }
  
  public void a(x paramx) {
    this.b.a(paramx);
  }
  
  public List ad() {
    return this.b.C();
  }
  
  public x B(String paramString) {
    for (x x : this.b.C()) {
      if (x.a().equals(paramString))
        return x; 
    } 
    return null;
  }
  
  public boolean ae() {
    return this.o;
  }
  
  public void b(boolean paramBoolean) {
    this.o = paramBoolean;
  }
  
  public void a(bf parambf) {
    this.b.a(parambf);
  }
  
  public List af() {
    return this.b.D();
  }
  
  public void a(bP parambP) {
    this.b.a(parambP);
  }
  
  public bP C(String paramString) {
    return this.b.f(paramString);
  }
  
  public Collection ag() {
    return this.b.E();
  }
  
  public void ah() {
    this.e.e();
  }
  
  public boolean ai() {
    return (O().al().equals("basicRequestReply") && C() instanceof bQ.l);
  }
  
  public void D(String paramString) {
    this.p = paramString;
  }
  
  public boolean aj() {
    return this.q;
  }
  
  public void c(boolean paramBoolean) {
    this.q = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/R.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */