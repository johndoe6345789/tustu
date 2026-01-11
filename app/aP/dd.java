package aP;

import br.K;
import com.efiAnalytics.apps.ts.dashboard.x;
import com.efiAnalytics.apps.ts.tuningViews.J;
import com.efiAnalytics.apps.ts.tuningViews.n;
import com.efiAnalytics.tunerStudio.search.m;
import com.efiAnalytics.ui.dM;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import n.n;

public class dd {
  private static dd b = null;
  
  private x c = null;
  
  private JFrame d = null;
  
  private hb e = null;
  
  private dM f = null;
  
  private iJ g = null;
  
  private iW h = null;
  
  private JPanel i = null;
  
  private dB j = null;
  
  private bW k = null;
  
  private bk l = null;
  
  private m m = null;
  
  private cc n = null;
  
  private n o = null;
  
  private n p = null;
  
  private K q = null;
  
  List a = new ArrayList();
  
  public static dd a() {
    if (b == null)
      b = new dd(); 
    return b;
  }
  
  public x b() {
    return this.c;
  }
  
  public void a(x paramx) {
    this.c = paramx;
  }
  
  public JFrame c() {
    return this.d;
  }
  
  public void a(JFrame paramJFrame) {
    a(paramJFrame);
    this.d = paramJFrame;
  }
  
  public dM d() {
    return this.f;
  }
  
  public void a(dM paramdM) {
    this.f = paramdM;
  }
  
  public iJ e() {
    return this.g;
  }
  
  public void a(iJ paramiJ) {
    this.g = paramiJ;
  }
  
  public iW f() {
    return this.h;
  }
  
  public void a(iW paramiW) {
    this.h = paramiW;
  }
  
  public dB g() {
    return this.j;
  }
  
  public void a(dB paramdB) {
    this.j = paramdB;
  }
  
  public bW h() {
    return this.k;
  }
  
  public void a(bW parambW) {
    this.k = parambW;
  }
  
  public void a(m paramm) {
    this.m = paramm;
  }
  
  public hb i() {
    return this.e;
  }
  
  public void a(hb paramhb) {
    this.e = paramhb;
  }
  
  public cc j() {
    return this.n;
  }
  
  public void a(cc paramcc) {
    this.n = paramcc;
  }
  
  public n k() {
    return this.o;
  }
  
  public void a(n paramn) {
    this.o = paramn;
  }
  
  public J l() {
    return k().c_();
  }
  
  public void a(n paramn) {
    this.p = paramn;
  }
  
  public n m() {
    return this.p;
  }
  
  public void a(Window paramWindow) {
    this.a.add(paramWindow);
  }
  
  public void b(Window paramWindow) {
    this.a.remove(paramWindow);
  }
  
  public boolean c(Window paramWindow) {
    return !this.a.contains(paramWindow);
  }
  
  public JPanel n() {
    return this.i;
  }
  
  public void a(JPanel paramJPanel) {
    this.i = paramJPanel;
  }
  
  public K o() {
    return this.q;
  }
  
  public void a(K paramK) {
    this.q = paramK;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */