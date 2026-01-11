package be;

import G.Q;
import G.R;
import G.aH;
import G.ac;
import G.ah;
import V.a;
import V.g;
import bH.J;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import r.i;
import s.g;

public class s extends JPanel {
  c a = null;
  
  j b = null;
  
  y c = null;
  
  R d = null;
  
  v e = new v(this);
  
  private B h = null;
  
  JPanel f = new JPanel();
  
  JPanel g;
  
  public s() {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    this.f.setLayout(new GridLayout(1, 1));
    jPanel.add(this.f, "Center");
    this.g = new JPanel();
    this.g.setLayout(new FlowLayout(1));
    JButton jButton1 = new JButton(g.b("Ok"));
    jButton1.addActionListener(new t(this));
    JButton jButton2 = new JButton(g.b("Cancel"));
    jButton2.addActionListener(new u(this));
    if (J.a()) {
      this.g.add(jButton1);
      this.g.add(jButton2);
    } else {
      this.g.add(jButton1);
      this.g.add(jButton2);
    } 
    jPanel.add(this.g, "South");
    setLayout(new FlowLayout(1));
    add(jPanel);
  }
  
  private void a() {
    if (d() instanceof c) {
      c c1 = (c)d();
      if (c1.a()) {
        try {
          aH aH = this.d.g(c1.b().aL());
          if (aH != null && !aH.aN() && !bV.a(g.b("There is an existing OuputChannel in the main config by that name.") + "\n" + g.b("Are you sure you want to over-ride that channel?"), this, true))
            return; 
          this.h.a(c1.b());
        } catch (g g) {
          bV.d(g.getMessage(), this);
          Logger.getLogger(s.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
          return;
        } 
      } else {
        return;
      } 
    } else if (d() instanceof j) {
      j j1 = (j)d();
      g g = j1.d;
      R r = g.b();
      if (r.a()) {
        try {
          this.h.a((Q)g.a());
        } catch (a a) {
          Logger.getLogger(s.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
          bV.d(g.b(a.getLocalizedMessage()), this);
          return;
        } 
      } else {
        bV.d(g.b(r.d()), this);
        return;
      } 
    } else if (d() instanceof y) {
      y y1 = (y)d();
      R r = y1.b();
      if (r.a()) {
        try {
          this.h.a((Q)y1.a());
        } catch (a a) {
          Logger.getLogger(s.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
          bV.d(g.b(a.getLocalizedMessage()), this);
          return;
        } 
      } else {
        bV.d(g.b(r.d()), this);
        return;
      } 
    } 
    this.f.removeAll();
    fp.a(this.g, false);
    validate();
  }
  
  private void b() {
    this.f.removeAll();
    fp.a(this.g, false);
    validate();
  }
  
  public void a(Q paramQ) {
    if (c()) {
      Component component = d();
      if ((!(component instanceof o) || ((o)component).c()) && bV.a(g.b("Would you like to save the current settings?"), this, true)) {
        a();
      } else {
        b();
      } 
    } 
    if (paramQ instanceof aH) {
      this.f.add(f());
      f().a((aH)paramQ);
    } else if (paramQ instanceof ah) {
      this.f.add(g());
      g().a((ah)paramQ);
    } else if (paramQ instanceof ac) {
      this.f.add(e());
      e().a((ac)paramQ);
      e().a((((ac)paramQ).a() == null));
    } 
    fp.a(this.g, (this.f.getComponentCount() > 0));
    this.f.doLayout();
    doLayout();
    validate();
  }
  
  private boolean c() {
    return (this.f.getComponentCount() > 0);
  }
  
  private Component d() {
    return (this.f.getComponentCount() > 0) ? this.f.getComponent(0) : null;
  }
  
  private j e() {
    if (this.b == null)
      this.b = new j(this.d); 
    return this.b;
  }
  
  private c f() {
    if (this.a == null)
      this.a = new c(this.d); 
    return this.a;
  }
  
  private y g() {
    if (this.c == null) {
      this.c = new y(this.d);
      if (!i.a().a("09ggdslkmkgoiu"))
        fp.a(this.c, false); 
    } 
    return this.c;
  }
  
  public void a(R paramR) {
    this.d = paramR;
    if (this.a != null)
      this.a.a(paramR); 
    if (this.b != null)
      this.b.a(paramR); 
    if (this.c != null)
      this.c.a(paramR); 
  }
  
  public void a(B paramB) {
    if (paramB != null)
      paramB.b(this.e); 
    this.h = paramB;
    paramB.a(this.e);
  }
  
  private void h() {
    a(this.d);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */