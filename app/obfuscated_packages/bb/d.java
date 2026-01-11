package bb;

import A.c;
import A.f;
import A.g;
import A.j;
import A.o;
import A.r;
import A.s;
import A.t;
import A.v;
import A.x;
import G.R;
import G.T;
import G.bT;
import W.ap;
import W.ar;
import aP.aY;
import aP.ad;
import aV.w;
import aW.a;
import aW.p;
import ae.p;
import bQ.l;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fT;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import r.a;
import r.i;
import s.g;

public class d extends JPanel implements o, p, bc, fT {
  private p m;
  
  a a;
  
  aY b = null;
  
  private bT n = null;
  
  JLabel c = new JLabel();
  
  JLabel d = new JLabel();
  
  JButton e;
  
  JButton f;
  
  CardLayout g = new CardLayout();
  
  String h = null;
  
  List i = null;
  
  j j = null;
  
  boolean k;
  
  o l = new i(this);
  
  public d(p paramp, boolean paramBoolean) {
    this.m = paramp;
    this.k = paramBoolean;
    setLayout(this.g);
    JPanel jPanel1 = j();
    add(jPanel1, "Advanced Connection Settings");
    this.b = new aY();
    this.b.b(true);
    this.b.setVisible(true);
    this.b.a(this);
    this.b.a(false);
    this.b.setPreferredSize(new Dimension(eJ.a(520), eJ.a(320)));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add((Component)this.b, "Center");
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    JButton jButton = new JButton(g.b("Manually set Connection Settings"));
    jButton.addActionListener(new e(this));
    if (paramBoolean) {
      jPanel3.add(jButton);
      jPanel2.add(jPanel3, "South");
    } 
    add(jPanel2, "Detect Connection Settings");
    this.g.show(this, "Detect Connection Settings");
    j.a().a(this.l);
    f f = new f(this);
    f.start();
  }
  
  public void close() {
    j.a().b(this.l);
  }
  
  public void c() {
    if (this.k) {
      this.g.show(this, "Advanced Connection Settings");
      this.b.i();
      this.d.setText(g.b("Not Tested"));
    } else {
      d();
    } 
  }
  
  public void d() {
    this.g.show(this, "Detect Connection Settings");
    this.b.b();
  }
  
  private JPanel j() {
    JPanel jPanel1 = new JPanel();
    this.a = new a(w.c(), (g)i());
    this.a.a(this);
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("Center", (Component)this.a);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(0, 1, 5, 5));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    this.c.setText(g.b("Power on and Click Test"));
    this.e = new JButton(g.b("Auto Detect"));
    this.e.addActionListener(new g(this));
    jPanel3.add(this.e, "East");
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout(4, 4));
    this.f = new JButton(g.b("Test"));
    this.f.addActionListener(new h(this));
    jPanel4.add(this.d, "Center");
    jPanel4.add(this.f, "East");
    jPanel2.add(jPanel4);
    jPanel2.add(jPanel3);
    jPanel1.add("South", jPanel2);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new FlowLayout(1));
    jPanel5.add(jPanel1);
    return jPanel5;
  }
  
  private void k() {
    R r = T.a().c();
    if (r != null) {
      if (r.C() instanceof t) {
        t t = (t)r.C();
        f f = t.a();
        i().a(f);
        this.a.a(f);
      } else if (r.C() instanceof l) {
        l l = (l)r.C();
        f f = l.a();
        i().a(f);
        this.a.a(f);
      } 
    } else {
      v.a().a((ap)new ar((a.a()).an, "FirmwareLoader"));
      try {
        String str = a.a().c("firmwareLoaderCiId", w.c().b().a());
        f f = w.c().a(str, "DEFAULT_INSTANCE");
        v.a().b("FirmwareLoader", f);
        i().a(f);
        this.a.a(f);
      } catch (InstantiationException instantiationException) {
        Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
      } catch (IllegalAccessException illegalAccessException) {
        Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
      } 
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    if (this.a.b() != null && paramString1.equals("Driver")) {
      a.a().b("firmwareLoaderCiId", this.a.b().h());
      this.m.a(this.a.b());
    } else {
      try {
        if (this.m.a() != null)
          this.m.a().a(paramString1, paramString2); 
      } catch (s s) {
        Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, (Throwable)s);
      } 
    } 
    if (this.m.a() != null) {
      ap ap = v.a().c();
      v.a().a((ap)new ar((a.a()).an, "FirmwareLoader"));
      v.a().a("FirmwareLoader", i().a());
      v.a().a(ap);
    } 
  }
  
  public void e() {
    d();
  }
  
  public void f() {
    x x = new x();
    f f = this.a.b();
    if (f != null)
      try {
        f f1 = (f)f.getClass().newInstance();
        x.a(f1);
        for (r r : x.d().l()) {
          if (r.a() != 5)
            x.a(r.c(), f.a(r.c())); 
        } 
        if (i.a().a("HF-05[P54;'FD")) {
          String str = "\\x02\\x00\\x00\\x00\\xFF\\x00";
          this.b.a(x, str);
        } else {
          this.b.b(x);
        } 
        this.f.setEnabled(false);
        this.d.setText(g.b("Testing") + ": " + f.n());
        setCursor(Cursor.getPredefinedCursor(3));
        if (this.j != null)
          this.j.a(); 
        this.j = new j(this);
        this.j.start();
      } catch (InstantiationException instantiationException) {
      
      } catch (IllegalAccessException illegalAccessException) {} 
  }
  
  public boolean a(String paramString1, String paramString2, List paramList, bT parambT) {
    if (paramString2.contains(":")) {
      String str = paramString2.substring(0, paramString2.indexOf(":"));
      paramString2 = paramString2.substring(paramString2.indexOf(":") + 1);
    } 
    try {
      f f = w.c().a(paramString2, "DEFAULT_INSTANCE");
      for (c c : paramList) {
        try {
          f.a(c.a(), c.b());
        } catch (s s) {
          Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, (Throwable)s);
        } 
      } 
      this.a.a(f);
      this.m.a(f);
    } catch (InstantiationException instantiationException) {
      Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
    } 
    this.n = parambT;
    this.h = paramString2;
    this.i = paramList;
    if (parambT.e() != null) {
      this.c.setText(parambT.e().a());
      this.d.setText(g.b("Found") + ": " + parambT.e().a());
    } 
    if (this.j != null)
      this.j.a(); 
    this.f.setEnabled(true);
    setCursor(Cursor.getDefaultCursor());
    return true;
  }
  
  public void b(double paramDouble) {}
  
  public void a(String paramString) {}
  
  public void a() {
    this.d.setText("Failed");
  }
  
  public bT g() {
    return this.n;
  }
  
  public void h() {
    this.b.i();
  }
  
  public p i() {
    if (this.h != null && this.i != null && this.m != null)
      try {
        f f = w.c().a(this.h, "DEFAULT_INSTANCE");
        for (c c : this.i) {
          try {
            if (c.b() != null && !f.a(c.a()).equals(c.b()))
              f.a(c.a(), c.b()); 
          } catch (s s) {
            Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, (Throwable)s);
          } 
        } 
        this.a.a(f);
        this.m.a(f);
      } catch (InstantiationException instantiationException) {
        Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
      } catch (IllegalAccessException illegalAccessException) {
        Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
      }  
    return this.m;
  }
  
  public void a(x paramx) {}
  
  public boolean g_() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */