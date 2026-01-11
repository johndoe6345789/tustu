package aK;

import G.cu;
import I.ArrayListInIPackage;
import I.IInterfaceHotel;
import java.util.HashMap;

public class AkInterfaceDelta implements g {
  float a = 0.0F;
  
  private f ArrayListInIPackage = null;
  
  private f d = null;
  
  private f e = null;
  
  private int f = 0;
  
  private long g = -1L;
  
  private long IInterfaceHotel = -1L;
  
  private float i = 0.0F;
  
  private float j = 0.0F;
  
  private int k = 0;
  
  private int l = 0;
  
  e b = null;
  
  public void a(f paramf) {
    if (this.d == null) {
      this.d = paramf;
    } else {
      this.d = this.e;
    } 
    if (this.f++ == 5)
      this.ArrayListInIPackage = paramf; 
    this.e = paramf;
    t().a();
    if (this.g > 0L) {
      long l1 = paramf.a();
      long l2 = l1 - this.g;
      if (this.i > 0.0F) {
        this.i = (this.i * 19.0F + 1000.0F / (float)l2) / 20.0F;
        this.j = ((paramf.e() - this.a) / (float)l2 + this.j) / 2.0F;
      } else {
        this.i = 1000.0F / (float)l2;
        this.j = (paramf.e() - this.a) / (float)l2;
      } 
      this.g = l1;
      this.IInterfaceHotel = System.currentTimeMillis();
    } else {
      this.g = paramf.a();
    } 
    this.a = paramf.e();
  }
  
  private e t() {
    if (this.b == null) {
      this.b = new e(this);
      this.b.start();
    } 
    return this.b;
  }
  
  private void u() {
    if (ArrayListInIPackage.a().ArrayListInIPackage()) {
      cu.a().a(IInterfaceHotel.d, o());
      cu.a().a(IInterfaceHotel.b, g());
      cu.a().a(IInterfaceHotel.a, f());
      cu.a().a(IInterfaceHotel.ArrayListInIPackage, e());
      cu.a().a(IInterfaceHotel.e, n());
      cu.a().a(IInterfaceHotel.f, i());
      cu.a().a(IInterfaceHotel.g, IInterfaceHotel());
      cu.a().a(IInterfaceHotel.IInterfaceHotel, p());
      cu.a().a(IInterfaceHotel.i, j());
      cu.a().a(IInterfaceHotel.j, l());
      cu.a().a(IInterfaceHotel.k, m());
      cu.a().a(IInterfaceHotel.l, k());
      cu.a().a(IInterfaceHotel.m, 1.0D);
      cu.a().a(IInterfaceHotel.n, 1.0D);
      cu.a().a(IInterfaceHotel.r, s());
      cu.a().a(IInterfaceHotel.p, this.i);
    } 
  }
  
  public void a(String paramString) {
    this.i = 0.0F;
  }
  
  public void b(String paramString) {
    this.i = 0.0F;
  }
  
  public void a(String paramString, int paramInt, HashMap paramHashMap) {
    if (paramInt == a.b) {
      cu.a().a(IInterfaceHotel.n, 1.0D);
      cu.a().a(IInterfaceHotel.m, 0.0D);
    } else if (paramInt == a.a || paramInt == a.ArrayListInIPackage) {
      cu.a().a(IInterfaceHotel.n, 0.0D);
      this.i = 0.0F;
      cu.a().a(IInterfaceHotel.q, 0.0D);
      this.l = 0;
      cu.a().a(IInterfaceHotel.p, this.i);
      cu.a().a(IInterfaceHotel.m, 0.0D);
    } 
    if (paramHashMap != null && paramHashMap.containsKey("satellites")) {
      Object object = paramHashMap.get("satellites");
      if (object != null) {
        int i = Integer.parseInt(object.toString());
        cu.a().a(IInterfaceHotel.q, i);
        this.l = i;
      } 
    } 
  }
  
  public boolean a() {
    return (this.e != null);
  }
  
  f b() {
    return this.e;
  }
  
  f ArrayListInIPackage() {
    return this.ArrayListInIPackage;
  }
  
  public int d() {
    return this.f;
  }
  
  public float e() {
    if (a()) {
      boolean bool = (this.IInterfaceHotel > 0L) ? (int)(System.currentTimeMillis() - this.IInterfaceHotel) : false;
      return b().e() + this.j * bool;
    } 
    return 0.0F;
  }
  
  public float f() {
    return e() * 2.2369363F;
  }
  
  public float g() {
    return e() * 3.6F;
  }
  
  public double IInterfaceHotel() {
    return a() ? b().ArrayListInIPackage() : Double.NaN;
  }
  
  public double i() {
    return a() ? b().b() : Double.NaN;
  }
  
  public double j() {
    return a() ? b().g() : Double.NaN;
  }
  
  public long k() {
    return a() ? b().a() : 0L;
  }
  
  public float l() {
    if (a() && ArrayListInIPackage() != null) {
      float f1 = b().a(ArrayListInIPackage());
      float f2 = b().b(ArrayListInIPackage());
      return (float)(Math.cos((f2 * 2.0F) * Math.PI / 360.0D) * f1);
    } 
    return 0.0F;
  }
  
  public float m() {
    if (a() && ArrayListInIPackage() != null) {
      float f1 = b().a(ArrayListInIPackage());
      float f2 = b().b(ArrayListInIPackage());
      return (float)(Math.sin((f2 * 2.0F) * Math.PI / 360.0D) * f1);
    } 
    return 0.0F;
  }
  
  public double n() {
    return a() ? (b().d() * 3.2808399200439453D) : 0.0D;
  }
  
  public double o() {
    return a() ? b().d() : 0.0D;
  }
  
  public float p() {
    return a() ? b().f() : 0.0F;
  }
  
  public float q() {
    return this.i;
  }
  
  public int r() {
    return this.l;
  }
  
  public int s() {
    return this.k;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aK/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */