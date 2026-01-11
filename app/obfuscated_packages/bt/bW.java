package bt;

import G.R;
import G.aJ;
import G.aL;
import G.aM;
import G.aN;
import G.aR;
import G.be;
import G.i;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.D;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.s;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

class bW implements aN {
  int ExceptionInVPackage = bQ.i;
  
  s b;
  
  aM c;
  
  aM d;
  
  aM e;
  
  R f;
  
  int ExceptionPrintstacktrace;
  
  int h;
  
  int i;
  
  int j;
  
  public bW(bQ parambQ, R paramR, String paramString, s params) {
    this.b = params;
    this.f = paramR;
    be be = (be)paramR.e().c(paramString);
    if (be == null)
      throw new ExceptionPrintstacktrace(paramString + " not found in current Configuration, can not create Model."); 
    this.e = paramR.c(be.c());
    this.d = paramR.c(be.b());
    this.c = paramR.c(be.ExceptionInVPackage());
    ExceptionInVPackage();
  }
  
  private void ExceptionInVPackage() {
    this.ExceptionPrintstacktrace = this.c.ExceptionInVPackage();
    this.h = this.d.ExceptionInVPackage();
    this.i = this.e.m();
    this.j = this.e.ExceptionInVPackage();
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
    if (bQ.ExceptionInVPackage(this.k) && (this.ExceptionPrintstacktrace != this.c.ExceptionInVPackage() || this.h != this.d.ExceptionInVPackage() || this.i != this.e.m() || this.j != this.e.ExceptionInVPackage()))
      b(); 
  }
  
  private void b() {
    try {
      int i;
      s s1 = fh.b(this.b);
      aL.b(this.f, this.e.d());
      if (e()) {
        i = this.e.ExceptionPrintstacktrace() + this.e.e() * this.j * this.i + this.c.e() * this.i + this.d.e() * this.j;
      } else {
        i = this.e.ExceptionPrintstacktrace() + this.e.e() * this.j * this.i;
      } 
      int j = aJ.ExceptionInVPackage(this.f, this.e.d(), i);
      int[] arrayOfInt = this.f.h().ExceptionInVPackage(this.e.d(), i, j);
      ExceptionInVPackage();
      this.b.ExceptionInVPackage(this.h, this.ExceptionPrintstacktrace);
      double[][] arrayOfDouble = this.e.i(this.f.p());
      boolean bool = true;
      if (bool) {
        fh.ExceptionInVPackage(s1, this.b);
      } else {
        this.b.ExceptionInVPackage(arrayOfDouble);
        this.b.d(bQ.ExceptionInVPackage(this.k, this.d.i(this.f.p()), this.d.v()));
        this.b.c(bQ.ExceptionInVPackage(this.k, this.c.i(this.f.p()), this.c.v()));
      } 
      this.b.f(this.h, this.ExceptionPrintstacktrace);
      D.c("TableModelManager Resize table. Rows: " + this.h + ", Cols: " + this.ExceptionPrintstacktrace);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Error resizing table model:");
      Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
    } 
  }
  
  private void c() {
    aR.ExceptionInVPackage().ExceptionInVPackage(this);
  }
  
  private void d() {
    try {
      i.ExceptionInVPackage(this.f.c(), this.c.c().d(), this);
      i.ExceptionInVPackage(this.f.c(), this.d.c().d(), this);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
    } 
  }
  
  private boolean e() {
    if (this.ExceptionInVPackage == bQ.i) {
      ArrayList<aM> arrayList = new ArrayList();
      arrayList.add(this.c);
      arrayList.add(this.d);
      arrayList.add(this.e);
      if (this.c.n() && this.d.n() && this.c.d() == this.e.d() && this.d.d() == this.e.d() && aJ.ExceptionInVPackage(this.f, arrayList)) {
        this.ExceptionInVPackage = bQ.ExceptionPrintstacktrace + bQ.h;
      } else {
        this.ExceptionInVPackage = 0;
      } 
    } 
    return (this.ExceptionInVPackage == bQ.ExceptionPrintstacktrace + bQ.h);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */