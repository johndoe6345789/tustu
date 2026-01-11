package aP;

import G.R;
import G.ab;
import G.bM;
import G.bv;
import G.cj;
import G.di;
import V.g;
import bH.D;
import bt.L;
import bt.aV;
import bt.bG;
import bt.bH;
import bt.bh;
import bt.d;
import com.efiAnalytics.ui.aO;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import n.b;
import r.a;
import r.i;

public class hg extends d implements ab, di, bG, aO {
  R a = null;
  
  bv b = null;
  
  b c = new b();
  
  bh d = null;
  
  hm e = null;
  
  ArrayList f = null;
  
  hk g = null;
  
  ho h = new ho(this);
  
  hn i = new hn(this);
  
  hl j = new hl(this);
  
  JScrollPane k = null;
  
  JPanel l = new JPanel();
  
  Runnable m = new hj(this);
  
  public hg(R paramR, bv parambv) {
    this(paramR, parambv, true);
  }
  
  public hg(R paramR, bv parambv, boolean paramBoolean) {
    this.a = paramR;
    this.b = parambv;
    setLayout(new BorderLayout());
    this.d = new bh(paramR, parambv);
    this.f = this.d.k();
    List list1 = parambv.e();
    List list2 = parambv.U();
    ArrayList arrayList = parambv.O();
    if (parambv.J() > 0 || arrayList.size() > 0 || this.f.size() > 0 || (!list1.isEmpty() && i.a().a("hlk;rd;tporg;'gd")) || !list2.isEmpty()) {
      bl bl = new bl(paramR, parambv, this.f);
      add("North", bl);
    } 
    a((bc)this.d);
    if (this.d.l())
      paramR.C().f(false); 
    this.l.setLayout(new BorderLayout());
    add("Center", this.l);
    boolean bool = a.a().c(a.ci, a.cj);
    if (bool && !(parambv instanceof G.be))
      a(); 
    if (a(parambv) || parambv.R() == 4) {
      this.l.add("Center", (Component)this.d);
    } else {
      JScrollPane jScrollPane = new JScrollPane((Component)this.d);
      this.l.add("Center", jScrollPane);
    } 
    this.c.a(this);
    JPanel jPanel = new JPanel();
    FlowLayout flowLayout = new FlowLayout();
    flowLayout.setAlignment(2);
    jPanel.setLayout(flowLayout);
    jPanel.add((Component)this.c);
    this.c.d(paramBoolean);
    if (list1.isEmpty() && !bM.b(parambv))
      this.c.e(false); 
    add("South", jPanel);
    paramR.p().a(this);
    j();
    paramR.p().a(this);
    this.e = new hm(this, (Component)this);
    cb.a().a(this.e);
    paramR.C().a(this.h);
    paramR.C().a(this.i);
    this.c.c(paramR.C().C());
    bH.a().a(this);
  }
  
  public void a() {
    List list = this.d.p();
    if (a(list) && this.k == null) {
      int i = a.a().o();
      int j = a.a().a(a.aH, i);
      this.k = new JScrollPane(this.j);
      this.k.setPreferredSize(new Dimension(150, (int)(j * 4.5D)));
      for (L l : list)
        l.a(this.j); 
      this.l.add("South", this.k);
      Window window = bV.b((Component)this);
      if (window != null) {
        window.setSize(window.getWidth(), window.getHeight() + (this.k.getPreferredSize()).height);
      } else {
        this.l.validate();
      } 
    } 
  }
  
  private boolean a(List paramList) {
    for (L l : paramList) {
      String str = this.a.w(l.d());
      if (str != null && !str.isEmpty())
        return true; 
    } 
    return false;
  }
  
  public void b() {
    if (this.k != null) {
      List list = this.d.p();
      if (list.size() > 0)
        for (L l : list)
          l.b(this.j);  
      this.l.remove(this.k);
      Window window = bV.b((Component)this);
      if (window != null) {
        window.setSize(window.getWidth(), window.getHeight() - (this.k.getPreferredSize()).height);
      } else {
        this.l.validate();
      } 
      this.k = null;
    } 
  }
  
  private boolean a(bv parambv) {
    if (parambv instanceof G.be || parambv instanceof G.bi || parambv instanceof G.bm)
      return true; 
    if (parambv.H() > 0 || (parambv.Z() > 1 && parambv.R() != 3))
      return false; 
    Iterator<bv> iterator = parambv.K();
    while (iterator.hasNext()) {
      bv bv1 = iterator.next();
      if (!a(bv1))
        return false; 
    } 
    return true;
  }
  
  public boolean c() {
    if (this.b.O().size() > 0) {
      f.a().a(this.a, this.b.O().get(0), bV.a((Component)this));
      return true;
    } 
    if (this.f.size() > 0) {
      f.a().a(this.f.get(0), bV.a((Component)this));
      return true;
    } 
    return false;
  }
  
  public void d() {
    try {
      this.a.p().d();
    } catch (g g) {
      D.a("Error performing redo:", (Exception)g, this);
    } 
    this.d.requestFocus();
    m();
  }
  
  public void e() {
    try {
      this.a.p().c();
    } catch (g g) {
      D.a("Error performing undo:", (Exception)g, this);
    } 
    m();
  }
  
  private void m() {
    for (byte b1 = 0; b1 < this.d.getComponentCount(); b1++) {
      if (this.d.getComponent(b1).isFocusable()) {
        this.d.getComponent(b1).requestFocus();
        return;
      } 
    } 
  }
  
  public void f() {
    g();
    hh hh = new hh(this);
    hh.start();
    m();
  }
  
  private void n() {
    hi hi = new hi(this);
    hi.start();
  }
  
  protected void g() {
    Component[] arrayOfComponent = getComponents();
    for (byte b1 = 0; b1 < arrayOfComponent.length; b1++) {
      if (arrayOfComponent[b1] instanceof bh)
        a((bh)arrayOfComponent[b1]); 
    } 
  }
  
  private void a(bh parambh) {
    Component[] arrayOfComponent = parambh.getComponents();
    for (byte b1 = 0; b1 < arrayOfComponent.length; b1++) {
      if (arrayOfComponent[b1] instanceof aV) {
        ((aV)arrayOfComponent[b1]).h();
      } else if (arrayOfComponent[b1] instanceof bh) {
        a((bh)arrayOfComponent[b1]);
      } 
    } 
  }
  
  public boolean h() {
    return (this.d != null && this.d.n());
  }
  
  public void i() {
    this.h.a = true;
    List list = this.d.p();
    if (list.size() > 0)
      for (L l : list)
        l.b(this.j);  
    bH.a().b(this);
    if (this.d.l()) {
      f();
      cj[] arrayOfCj = bM.b(this.a, this.b);
      f.a().a(this.a, arrayOfCj);
      n();
      f();
    } else if (!a.a().a(a.cl, "true").equals("false")) {
      f();
    } 
    this.a.p().b(this);
    this.a.C().c(this.h);
    this.a.C().b(this.i);
    l();
    cb.a().b(this.e);
    a((Component)this);
  }
  
  private void a(Component paramComponent) {
    if (paramComponent instanceof bc)
      ((bc)paramComponent).close(); 
    if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      for (byte b1 = 0; b1 < container.getComponentCount(); b1++)
        a(container.getComponent(b1)); 
    } 
  }
  
  public void j() {
    if (this.g != null) {
      this.g.a();
    } else {
      this.g = new hk(this);
      this.g.a();
      this.g.start();
    } 
  }
  
  public void k() {
    if (this.d != null)
      this.d.a(); 
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    if (paramString.equals(this.a.c()))
      j(); 
  }
  
  public void a(boolean paramBoolean) {
    this.c.a(paramBoolean);
  }
  
  public void b(boolean paramBoolean) {
    this.c.b(paramBoolean);
  }
  
  public void c(boolean paramBoolean) {
    if (paramBoolean) {
      a();
    } else {
      b();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */