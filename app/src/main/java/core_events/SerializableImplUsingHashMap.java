package G;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SerializableImplUsingHashMap implements Serializable {
  private List a = new ArrayList();
  
  private HashMap b = new LinkedHashMap<>();
  
  private HashMap c = new HashMap<>();
  
  private HashMap d = new HashMap<>();
  
  private HashMap e = new HashMap<>();
  
  private List f = new ArrayList();
  
  private HashMap g = new HashMap<>();
  
  private HashMap h = new HashMap<>();
  
  private List i = new ArrayList();
  
  private HashMap j = new HashMap<>();
  
  private HashMap k = new HashMap<>();
  
  private List l = new ArrayList();
  
  private HashMap m = new HashMap<>();
  
  private HashMap n = new HashMap<>();
  
  private ArrayList o = new ArrayList();
  
  private ArrayList p = new ArrayList();
  
  private ArrayList q = new ArrayList();
  
  private ArrayList r = new ArrayList();
  
  private ArrayList s = new ArrayList();
  
  private HashMap t = new HashMap<>();
  
  private ArrayList u = new ArrayList();
  
  private ArrayList v = new ArrayList();
  
  private ArrayList w = new ArrayList();
  
  private HashMap x = new HashMap<>();
  
  private bE y = null;
  
  private Map z = new HashMap<>();
  
  private F A = null;
  
  private String B = "";
  
  private String C = null;
  
  private String D = "";
  
  private String E = null;
  
  private boolean F = false;
  
  private String G = null;
  
  public ae a(ae paramae) {
    paramae.b = new HashMap<>();
    paramae.a = new ArrayList();
    for (aM aM : this.b.values()) {
      if (aM instanceof ca) {
        ca ca1 = (ca)aM;
        ca ca2 = ca1.R();
        paramae.b.put(aM.aL(), ca2);
        paramae.a.add(ca2);
        continue;
      } 
      paramae.b.put(aM.aL(), aM);
      paramae.a.add(aM);
    } 
    paramae.c = this.c;
    paramae.d = this.d;
    paramae.e = this.e;
    paramae.g = this.g;
    paramae.h = this.h;
    paramae.i = this.i;
    paramae.j = this.j;
    paramae.p = this.p;
    paramae.q = this.q;
    paramae.r = this.r;
    paramae.A = this.A;
    paramae.C = this.C;
    paramae.B = this.B;
    paramae.y = this.y;
    return paramae;
  }
  
  public HashMap a() {
    return this.b;
  }
  
  public HashMap b() {
    return this.c;
  }
  
  public HashMap c() {
    return this.d;
  }
  
  public HashMap d() {
    return this.e;
  }
  
  public List e() {
    return this.f;
  }
  
  public HashMap f() {
    return this.g;
  }
  
  public HashMap g() {
    return this.h;
  }
  
  public List h() {
    return this.i;
  }
  
  public HashMap i() {
    return this.j;
  }
  
  public HashMap j() {
    return this.k;
  }
  
  public HashMap k() {
    return this.m;
  }
  
  public HashMap l() {
    return this.n;
  }
  
  public ArrayList m() {
    return this.o;
  }
  
  public ArrayList n() {
    return this.p;
  }
  
  public ArrayList o() {
    return this.q;
  }
  
  public ArrayList p() {
    return this.r;
  }
  
  public ArrayList q() {
    return this.s;
  }
  
  public HashMap r() {
    return this.t;
  }
  
  public ArrayList s() {
    return this.u;
  }
  
  public bE t() {
    return this.y;
  }
  
  public void a(bE parambE) {
    this.y = parambE;
  }
  
  public Map u() {
    return this.z;
  }
  
  public F v() {
    return this.A;
  }
  
  public void a(F paramF) {
    this.A = paramF;
  }
  
  public String w() {
    return this.B;
  }
  
  public void a(String paramString) {
    this.B = paramString;
  }
  
  public String x() {
    return this.C;
  }
  
  public void b(String paramString) {
    this.C = paramString;
  }
  
  public String y() {
    return this.D;
  }
  
  public void c(String paramString) {
    this.D = paramString;
  }
  
  public String z() {
    return this.E;
  }
  
  public void d(String paramString) {
    this.E = paramString;
  }
  
  public boolean A() {
    return this.F;
  }
  
  public void a(boolean paramBoolean) {
    this.F = paramBoolean;
  }
  
  public String B() {
    return this.G;
  }
  
  public void e(String paramString) {
    this.G = paramString;
  }
  
  public boolean a(ac paramac) {
    boolean bool = false;
    for (byte b = 0; b < this.p.size(); b++) {
      ac ac1 = this.p.get(b);
      if (ac1.aL().equals(paramac.aL())) {
        this.p.set(b, paramac);
        bool = true;
      } 
    } 
    if (!bool)
      this.p.add(paramac); 
    return bool;
  }
  
  public void a(x paramx) {
    this.v.add(paramx);
  }
  
  public List C() {
    return this.v;
  }
  
  public List D() {
    return this.w;
  }
  
  public void a(bf parambf) {
    this.w.add(parambf);
  }
  
  public void a(bP parambP) {
    this.x.put(parambP.aL(), parambP);
  }
  
  public bP f(String paramString) {
    return (bP)this.x.get(paramString);
  }
  
  public Collection E() {
    return this.x.values();
  }
  
  public List F() {
    return this.l;
  }
  
  public List G() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */