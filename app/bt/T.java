package bt;

import G.R;
import G.aN;
import G.aR;
import G.bh;
import G.bm;
import G.bv;
import G.cq;
import G.cu;
import G.db;
import G.i;
import V.a;
import V.g;
import bF.d;
import bF.y;
import bH.D;
import c.d;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.ef;
import com.efiAnalytics.ui.eo;
import com.efiAnalytics.ui.et;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import r.i;

public class T extends JPanel implements aN, cq, L, bP, d, bc {
  bh a;
  
  d b;
  
  y c;
  
  R d;
  
  V e = new V(this);
  
  String f = null;
  
  bP g = null;
  
  List h = new ArrayList();
  
  public T(R paramR, bm parambm, boolean paramBoolean1, boolean paramBoolean2) {
    String str = parambm.aL() + "_accessoryTable";
    if (paramBoolean1)
      str = str + "_vertical"; 
    bv bv = paramR.e().c(str);
    if (bv != null && !(bv instanceof bh))
      throw new g(str + ", name already used but not defined as a 1DTable"); 
    this.a = (bh)bv;
    if (this.a == null) {
      this.a = new bh();
      this.a.b(parambm.l());
      byte b;
      for (b = 0; b < parambm.d(); b++)
        this.a.a(parambm.b(b), parambm.a(b)); 
      if (parambm.k() > 0) {
        for (b = 0; b < parambm.k(); b++) {
          db db = parambm.e(b);
          this.a.a(db);
        } 
      } else {
        for (b = 0; b < parambm.g(); b++) {
          db db = parambm.c(b);
          this.a.a(db);
        } 
      } 
      for (b = 0; b < parambm.k(); b++)
        this.a.b(parambm.e(b)); 
      for (b = 0; b < parambm.m(); b++)
        this.a.c(parambm.f(b)); 
      for (b = 0; b < parambm.j(); b++)
        this.a.a(parambm.d(b)); 
      this.a.b(paramBoolean1);
      this.a.u(parambm.aJ());
      this.a.g(parambm.n());
      this.a.a(parambm.z());
      this.a.v(str);
      paramR.e().a((bv)this.a);
    } else if (!paramBoolean2) {
      this.a.b(paramBoolean1);
      this.a.u(parambm.aJ());
      this.a.g(parambm.n());
      this.a.a(parambm.z());
      this.a.v(str);
    } 
    a(paramR, this.a, paramBoolean2);
  }
  
  private void a(R paramR, bh parambh, boolean paramBoolean) {
    this.d = paramR;
    this.a = parambh;
    this.f = parambh.aJ();
    if (paramBoolean) {
      this.c = bQ.a().c(paramR, parambh.aL(), parambh.aM());
    } else {
      this.c = bQ.a().c(paramR, parambh.aL());
    } 
    this.b = new d(this.c);
    this.b.b(i.a().a("joijt;i609tr0932"));
    this.b.e().addFocusListener(new U(this));
    setLayout(new BorderLayout());
    add("Center", (Component)this.b);
    try {
      aR.a().a(paramR.c(), parambh.d(0), this);
    } catch (Exception exception) {
      D.d("No Column Parameter");
    } 
    byte b;
    for (b = 0; b < this.a.f(); b++) {
      try {
        i.a(paramR.c(), this.a.f(b), this);
      } catch (a a) {
        Logger.getLogger(T.class.getName()).log(Level.WARNING, "Failed to setup listener for label changes.", (Throwable)a);
      } 
    } 
    for (b = 0; b < this.a.c(); b++) {
      try {
        i.a(paramR.c(), this.a.e(b), this);
      } catch (a a) {
        Logger.getLogger(T.class.getName()).log(Level.WARNING, "Failed to setup listener for label changes.", (Throwable)a);
      } 
    } 
  }
  
  public void a(et paramet) {
    this.b.a(paramet);
  }
  
  public void a(eo parameo) {
    this.b.a(parameo);
  }
  
  public void a(ef[] paramArrayOfef) {
    this.b.a(paramArrayOfef);
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.b.setEnabled(paramBoolean);
  }
  
  public void a(String paramString1, String paramString2) {
    this.b.b();
  }
  
  public void close() {
    aR.a().a(this);
    cu.a().a(this);
    b();
  }
  
  public void c() {
    if (this.e == null)
      this.e = new V(this); 
    this.e.a();
  }
  
  public void a(Color paramColor) {
    this.b.a(paramColor);
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {}
  
  public y e() {
    return this.b.a();
  }
  
  public void a(int paramInt) {
    this.b.b(paramInt);
  }
  
  public Dimension b(int paramInt) {
    return this.b.c(paramInt);
  }
  
  public R b_() {
    return this.d;
  }
  
  public String a_() {
    return this.f;
  }
  
  public void c_(String paramString) {
    this.f = paramString;
  }
  
  public d f() {
    return this.b;
  }
  
  public void a() {
    if (this.g == null) {
      this.g = new F(this.d, this.a, this);
    } else {
      this.g.b();
    } 
    this.g.a();
  }
  
  public void b() {
    if (this.g != null)
      this.g.b(); 
  }
  
  public void a(bP parambP) {
    b();
    this.g = parambP;
    if (parambP != null)
      parambP.a(); 
  }
  
  public bh g() {
    return this.a;
  }
  
  protected void c(int paramInt) {
    this.b.a(paramInt);
  }
  
  public void a(K paramK) {
    this.h.add(paramK);
  }
  
  public void b(K paramK) {
    this.h.remove(paramK);
  }
  
  public String d() {
    return this.a.b(0);
  }
  
  private void b(String paramString) {
    for (K k : this.h)
      k.b(paramString); 
  }
  
  private void c(String paramString) {
    for (K k : this.h)
      k.a(paramString); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/T.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */