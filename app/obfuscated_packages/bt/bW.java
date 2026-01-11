package bt;

import G.R;
import G.aJ;
import G.aL;
import G.aM;
import G.aN;
import G.aR;
import G.be;
import G.i;
import V.a;
import V.g;
import bH.D;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.s;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

class bW implements aN {
  int a = bQ.i;
  
  s b;
  
  aM c;
  
  aM d;
  
  aM e;
  
  R f;
  
  int g;
  
  int h;
  
  int i;
  
  int j;
  
  public bW(bQ parambQ, R paramR, String paramString, s params) {
    this.b = params;
    this.f = paramR;
    be be = (be)paramR.e().c(paramString);
    if (be == null)
      throw new g(paramString + " not found in current Configuration, can not create Model."); 
    this.e = paramR.c(be.c());
    this.d = paramR.c(be.b());
    this.c = paramR.c(be.a());
    a();
  }
  
  private void a() {
    this.g = this.c.a();
    this.h = this.d.a();
    this.i = this.e.m();
    this.j = this.e.a();
  }
  
  public void a(String paramString1, String paramString2) {
    if (bQ.a(this.k) && (this.g != this.c.a() || this.h != this.d.a() || this.i != this.e.m() || this.j != this.e.a()))
      b(); 
  }
  
  private void b() {
    try {
      int i;
      s s1 = fh.b(this.b);
      aL.b(this.f, this.e.d());
      if (e()) {
        i = this.e.g() + this.e.e() * this.j * this.i + this.c.e() * this.i + this.d.e() * this.j;
      } else {
        i = this.e.g() + this.e.e() * this.j * this.i;
      } 
      int j = aJ.a(this.f, this.e.d(), i);
      int[] arrayOfInt = this.f.h().a(this.e.d(), i, j);
      a();
      this.b.a(this.h, this.g);
      double[][] arrayOfDouble = this.e.i(this.f.p());
      boolean bool = true;
      if (bool) {
        fh.a(s1, this.b);
      } else {
        this.b.a(arrayOfDouble);
        this.b.d(bQ.a(this.k, this.d.i(this.f.p()), this.d.v()));
        this.b.c(bQ.a(this.k, this.c.i(this.f.p()), this.c.v()));
      } 
      this.b.f(this.h, this.g);
      D.c("TableModelManager Resize table. Rows: " + this.h + ", Cols: " + this.g);
    } catch (g g) {
      D.a("Error resizing table model:");
      Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
    } 
  }
  
  private void c() {
    aR.a().a(this);
  }
  
  private void d() {
    try {
      i.a(this.f.c(), this.c.c().d(), this);
      i.a(this.f.c(), this.d.c().d(), this);
    } catch (a a) {
      Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
  }
  
  private boolean e() {
    if (this.a == bQ.i) {
      ArrayList<aM> arrayList = new ArrayList();
      arrayList.add(this.c);
      arrayList.add(this.d);
      arrayList.add(this.e);
      if (this.c.n() && this.d.n() && this.c.d() == this.e.d() && this.d.d() == this.e.d() && aJ.a(this.f, arrayList)) {
        this.a = bQ.g + bQ.h;
      } else {
        this.a = 0;
      } 
    } 
    return (this.a == bQ.g + bQ.h);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */