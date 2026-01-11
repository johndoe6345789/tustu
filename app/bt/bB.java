package bt;

import G.R;
import G.aM;
import G.aN;
import G.aR;
import G.bJ;
import G.bK;
import G.bL;
import G.i;
import P.a;
import P.b;
import V.a;
import V.g;
import V.j;
import bG.F;
import bG.G;
import bG.a;
import bG.c;
import bG.i;
import bG.l;
import bG.m;
import bG.q;
import bH.D;
import bH.p;
import c.d;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import r.i;
import r.j;
import s.g;

public class bB extends g implements aN, h, d, bc {
  R a = null;
  
  m b = null;
  
  bL c = null;
  
  aM d = null;
  
  aM e = null;
  
  aM f = null;
  
  aM g = null;
  
  G h = null;
  
  l i = (l)new a(60, 2);
  
  bJ j;
  
  aN k;
  
  JLabel l = new JLabel("-------");
  
  q m = null;
  
  public bB(R paramR, bJ parambJ) {
    this.a = paramR;
    this.j = parambJ;
    setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), parambJ.M()));
    this.b = new m();
    this.b.setName(parambJ.aL());
    this.b.a(new bC(this));
    setLayout(new BorderLayout());
    if (parambJ.b() != null)
      setPreferredSize(new Dimension(parambJ.b().a(), parambJ.b().b())); 
    add("Center", (Component)this.b);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    add("North", jPanel1);
    if (parambJ.c() && i.a().a("09PO;L'RE4")) {
      this.m = new q(this.b);
      add("East", (Component)this.m);
      this.b.a(true);
      JMenuBar jMenuBar = new JMenuBar();
      jPanel1.add("North", jMenuBar);
      jMenuBar.add(c());
      jMenuBar.add(this.m.a());
    } else if (parambJ.c()) {
      JMenuBar jMenuBar = new JMenuBar();
      jMenuBar.add(c());
      jPanel1.add("North", jMenuBar);
    } 
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(0, 1));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    jPanel3.add("West", new JLabel(g.b("Teeth: sensor to missing tooth @ TDC") + ": ", 4));
    jPanel3.add("Center", this.l);
    jPanel2.add(jPanel3);
    jPanel1.add("South", jPanel2);
    f();
    this.k = new bD(this);
    for (bK bK : parambJ.a()) {
      try {
        i.a(this.a, bK.a(), this.k);
      } catch (a a) {
        bV.d(a.getLocalizedMessage(), this);
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
      } 
    } 
  }
  
  private JMenu c() {
    JMenu jMenu = new JMenu(g.b("File"));
    JMenuItem jMenuItem1 = new JMenuItem(g.b("Load Wheel Pattern"));
    jMenuItem1.addActionListener(new bE(this));
    jMenu.add(jMenuItem1);
    JMenuItem jMenuItem2 = new JMenuItem(g.b("Save Wheel Pattern"));
    jMenuItem2.addActionListener(new bF(this));
    jMenu.add(jMenuItem2);
    return jMenu;
  }
  
  private void d() {
    String[] arrayOfString = { "wheel" };
    String str = bV.a(this, "Save Wheel Pattern", arrayOfString, "", j.e().getAbsolutePath());
    if (str != null && !str.isEmpty()) {
      if (!str.toLowerCase().endsWith(".wheel"))
        str = str + ".wheel"; 
      try {
        F f = new F();
        File file = new File(str);
        j.b(file);
        f.a(file, this.b.e().a());
      } catch (IOException iOException) {
        bV.d(g.b("Unable to save wheel pattern.") + "\n" + iOException.getLocalizedMessage(), this);
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, iOException);
      } 
    } 
  }
  
  private void e() {
    String[] arrayOfString = { "wheel" };
    String str = bV.b(this, "Load Wheel Pattern", arrayOfString, "", j.e().getAbsolutePath());
    if (str != null && !str.isEmpty() && str.toLowerCase().endsWith(".wheel"))
      try {
        F f = new F();
        File file = new File(str);
        j.b(file);
        List list = f.a(file);
        if (this.b.e() instanceof i) {
          i i = (i)this.b.e();
          i.a(list);
        } 
      } catch (IOException iOException) {
        bV.d(g.b("Unable to load wheel pattern.") + "\n" + iOException.getLocalizedMessage(), this);
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, iOException);
      }  
  }
  
  private void f() {
    for (bK bK : this.j.a()) {
      boolean bool = false;
      try {
        bool = (bK.a() == null || bK.a().isEmpty() || p.a(bK.a(), this.a)) ? true : false;
      } catch (g g1) {
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
      } 
      if (bool) {
        bL bL1 = bK.b();
        a(bL1);
        break;
      } 
    } 
    g();
  }
  
  public void a(bL parambL) {
    this.c = parambL;
    aR.a().a(this);
    if (parambL instanceof b) {
      a((b)parambL);
    } else if (parambL instanceof a) {
      a((a)parambL);
    } else if (parambL instanceof P.c) {
    
    } 
  }
  
  public void a(a parama) {
    if (this.h != null)
      this.h.c(); 
    try {
      this.h = (G)new c(this.a, parama, this.b);
    } catch (g g1) {
      bV.d(g.b("Failed to set Wheel pattern") + "\n" + g1.getMessage(), this);
      Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
    } 
    if (parama.d() != null) {
      this.d = this.a.c(parama.d());
      try {
        aR.a().a(this.a.c(), this.d.aL(), this);
      } catch (Exception exception) {
        D.a("Failed to subscribe to parameter: " + parama.d());
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, exception);
      } 
    } 
    if (parama.c() != null) {
      this.g = this.a.c(parama.c());
      try {
        aR.a().a(this.a.c(), this.g.aL(), this);
      } catch (Exception exception) {
        D.a("Failed to subscribe to parameter: " + parama.c());
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, exception);
      } 
    } 
  }
  
  public void a(b paramb) {
    this.d = this.a.c(paramb.b());
    this.e = this.a.c(paramb.c());
    this.f = this.a.c(paramb.d());
    this.g = this.a.c(paramb.e());
    try {
      aR.a().a(this.a.c(), this.d.aL(), this);
    } catch (Exception exception) {
      D.a("Failed to subscribe to parameter: " + paramb.b());
      Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
    try {
      aR.a().a(this.a.c(), this.e.aL(), this);
    } catch (Exception exception) {
      D.a("Failed to subscribe to parameter: " + paramb.c());
      Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
    try {
      aR.a().a(this.a.c(), this.f.aL(), this);
    } catch (Exception exception) {
      D.a("Failed to subscribe to parameter: " + paramb.d());
      Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
    try {
      aR.a().a(this.a.c(), this.g.aL(), this);
    } catch (Exception exception) {
      D.a("Failed to subscribe to parameter: " + paramb.e());
      Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
  }
  
  public void close() {
    aR.a().a(this);
    aR.a().a(this.k);
  }
  
  public void a(String paramString1, String paramString2) {
    if (this.d != null && paramString2.equals(this.d.aL()))
      h(); 
    if (this.e != null && paramString2.equals(this.e.aL()))
      i(); 
    if (this.f != null && paramString2.equals(this.f.aL()))
      i(); 
    if (this.g != null && paramString2.equals(this.g.aL()))
      j(); 
  }
  
  private void g() {
    h();
    i();
    j();
  }
  
  private void h() {
    if (this.d != null)
      try {
        double d1 = this.d.j(this.a.h());
        this.b.a(d1);
        this.b.repaint();
        this.l.setText(this.b.b() + "");
      } catch (g g1) {
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
        D.a("Failed to get Offset Angle", (Exception)g1, this);
      }  
  }
  
  private void i() {
    if (this.e != null && this.f != null)
      try {
        int i = (int)Math.round(this.e.j(this.a.h()));
        int j = (int)Math.round(this.f.j(this.a.h()));
        if (this.i instanceof a) {
          ((a)this.i).a(i, j);
          this.b.a(this.i);
          this.l.setText(this.b.b() + "");
          this.b.repaint();
        } 
      } catch (g g1) {
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
        D.a("Failed to set Tooth Pattern", (Exception)g1, this);
      }  
  }
  
  private void j() {
    if (this.g != null)
      try {
        if (this.g != null) {
          int i = (int)Math.round(this.g.j(this.a.h()));
          this.b.a(i);
          this.l.setText(this.b.b() + "");
        } 
        this.b.repaint();
      } catch (g g1) {
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
        D.a("Failed to set Input Capture Point on Trigger Wheel image", (Exception)g1, this);
      }  
  }
  
  public void a(double paramDouble) {
    if (this.d != null) {
      if (paramDouble > this.d.s())
        paramDouble = this.d.s(); 
      if (paramDouble < this.d.r())
        paramDouble = this.d.r(); 
      try {
        this.d.a(this.a.p(), paramDouble);
      } catch (g g1) {
        D.a("Unable to set Offset Angle.", (Exception)g1, this);
      } catch (j j) {
        D.a("Trigger Wheel Value out of bounds.", (Exception)j, this);
      } 
    } 
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.b.setEnabled(paramBoolean);
    super.setEnabled(paramBoolean);
  }
  
  public void a() {
    try {
      if (a_() != null) {
        boolean bool = p.a(a_(), this.a);
        setEnabled(bool);
      } 
    } catch (g g1) {
      Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
    } 
  }
  
  public R b_() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */