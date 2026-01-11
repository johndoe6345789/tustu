package aP;

import A.c;
import A.d;
import A.f;
import A.g;
import A.h;
import A.j;
import A.o;
import A.p;
import A.r;
import A.s;
import A.v;
import A.x;
import B.a;
import B.i;
import G.J;
import G.R;
import G.T;
import G.aB;
import G.bT;
import G.l;
import G.m;
import G.n;
import G.o;
import V.a;
import W.ap;
import W.ar;
import aD.a;
import aE.a;
import aV.w;
import aW.a;
import aW.p;
import ae.o;
import bQ.j;
import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import r.a;
import r.j;
import s.g;
import z.c;
import z.d;
import z.e;
import z.i;

public class ad extends JPanel implements o, n, p {
  JDialog a = null;
  
  JComboBox b = null;
  
  JComboBox c = null;
  
  JComboBox d = null;
  
  JComboBox e = null;
  
  JLabel f = new JLabel();
  
  JButton g = new JButton(g.b("Test Port"));
  
  JButton h = new JButton(g.b("Detect"));
  
  R i = null;
  
  i j = new i();
  
  String k = "";
  
  String l = "";
  
  String m = "";
  
  a n;
  
  J o = null;
  
  ap p = (ap)new ar(new Properties(), "TempCommSettings");
  
  aY q = null;
  
  JPanel r = null;
  
  JPanel s = null;
  
  private String u = g.b("Scanning Ports") + "...";
  
  private static String v = "LegacyComSettings";
  
  private static String w = "MegaSquirtComSettings";
  
  boolean t = false;
  
  public ad() {
    this((R)null);
  }
  
  public ad(R paramR) {
    this.i = paramR;
    TitledBorder titledBorder = BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), g.b("Communication Settings"));
    setBorder(titledBorder);
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(15, 15));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 2));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(0, 1));
    JPanel jPanel4 = new JPanel();
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout());
    jPanel4.setLayout(new GridLayout(0, 1, 2, 2));
    JLabel jLabel = new JLabel();
    jLabel.setText(g.b("Configuration") + ":");
    boolean bool = false;
    if (bool)
      jPanel3.add(jLabel); 
    this.b = new JComboBox();
    k();
    T t = T.a();
    if (t.c() != null)
      this.b.setSelectedItem(t.c().c()); 
    this.b.addActionListener(new ae(this));
    jPanel5.add("North", this.b);
    if (bool && this.b.getItemCount() > 0)
      jPanel4.add(jPanel5); 
    jPanel5 = new JPanel();
    byte b1 = 0;
    jPanel5.setLayout(new BorderLayout());
    jLabel = new JLabel();
    jLabel.setText(g.b("Driver") + ":");
    this.c = new JComboBox();
    this.c.setEditable(false);
    String str = a.ba;
    Iterator<d> iterator = c.a().b();
    while (iterator.hasNext()) {
      d d = iterator.next();
      an an = new an(this, d);
      this.c.addItem(an);
      b1++;
      if (d.a().equals(str)) {
        an.a(d.b() + " (" + g.b("Default") + ")");
        this.c.setSelectedItem(an);
      } 
    } 
    this.c.addActionListener(new af(this));
    jPanel5.add("South", this.c);
    if (b1 > 1) {
      jPanel3.add(jLabel);
      jPanel4.add(jPanel5);
    } 
    jPanel2.add(jPanel3);
    jPanel2.add(jPanel4);
    jPanel1.add("North", jPanel2);
    jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(0, 1));
    jPanel4 = new JPanel();
    jPanel4.setLayout(new GridLayout(0, 1, 2, 2));
    this.r = new JPanel();
    this.r.setLayout(new CardLayout());
    this.s = new JPanel();
    this.s.setLayout(new GridLayout(1, 1));
    this.r.add(this.s, w);
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new BorderLayout());
    JPanel jPanel7 = new JPanel();
    jPanel7.setLayout(new FlowLayout(1));
    jPanel7.setBorder(BorderFactory.createTitledBorder(g.b("Connection Type")));
    jPanel7.add(new JLabel(g.b("RS232 Serial Port")));
    jPanel6.add("North", jPanel7);
    JPanel jPanel8 = new JPanel();
    jPanel8.setLayout(new BorderLayout());
    jPanel8.setBorder(BorderFactory.createTitledBorder(g.b("Connection Settings")));
    JPanel jPanel9 = new JPanel();
    jPanel9.setLayout(new GridLayout(0, 2, 2, 2));
    jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout());
    jLabel = new JLabel();
    jLabel.setText(g.b("Port") + ":");
    jPanel3.add(jLabel);
    this.e = new JComboBox();
    this.e.setEditable(true);
    this.e.addItem(this.u);
    (new ao(this)).start();
    this.e.addActionListener(new ag(this));
    jPanel5.add("South", this.e);
    jPanel4.add(jPanel5);
    jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout());
    jLabel = new JLabel();
    jLabel.setText(g.b("Baud Rate") + ":");
    jPanel3.add(jLabel);
    this.d = new JComboBox();
    String[] arrayOfString = this.j.c();
    for (byte b2 = 0; b2 < arrayOfString.length; b2++)
      this.d.addItem(arrayOfString[b2]); 
    if (this.i != null && a.A() != null) {
      this.d.setSelectedItem(a.A().m(this.i.c()));
    } else {
      this.d.setSelectedItem(a.c);
    } 
    this.d.addActionListener(new ah(this));
    jPanel5.add("North", this.d);
    jPanel4.add(jPanel5);
    jPanel9.add(jPanel3);
    jPanel9.add(jPanel4);
    JPanel jPanel10 = new JPanel();
    jPanel10.setLayout(new BorderLayout());
    jPanel10.add("North", jPanel9);
    jPanel8.add("Center", jPanel10);
    jPanel6.add("Center", jPanel8);
    this.r.add(jPanel6, v);
    jPanel1.add("Center", this.r);
    add("Center", jPanel1);
    JPanel jPanel11 = new JPanel();
    jPanel11.setLayout(new GridLayout(1, 2));
    jPanel11.add(this.f);
    JPanel jPanel12 = new JPanel();
    jPanel11.add(jPanel12);
    this.g.addActionListener(new ai(this));
    jPanel12.add(this.g);
    jPanel12.add(this.h);
    this.h.addActionListener(new aj(this));
    a(false);
    add("South", jPanel11);
    ((CardLayout)this.r.getLayout()).show(this.r, w);
    try {
      b((String)this.b.getSelectedItem());
    } catch (a a1) {
      Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
    } 
    d.a().a(true);
  }
  
  private void m() {
    an an = (an)this.c.getSelectedItem();
    if (an.a().a().equals(c.e)) {
      this.e.setEnabled(false);
    } else {
      this.e.setEnabled(true);
    } 
    i i1 = null;
    if (a.A() != null)
      i1 = j.d(new File(a.A().t())); 
    this.o = c.a().a(this.i, an.a().a(), w.c(), i1, null);
    if (this.o instanceof g) {
      f f = this.n.b();
      this.n.a(f);
      ((CardLayout)this.r.getLayout()).show(this.r, w);
    } else {
      ((CardLayout)this.r.getLayout()).show(this.r, v);
    } 
    n();
  }
  
  private void n() {
    this.f.setText(g.b("Not tested"));
  }
  
  public void b() {
    setCursor(Cursor.getPredefinedCursor(3));
    this.g.setEnabled(false);
    String[] arrayOfString = this.j.a();
    this.e.removeAllItems();
    for (byte b = 0; b < arrayOfString.length; b++)
      this.e.addItem(arrayOfString[b]); 
    if (this.i != null && a.A() != null) {
      this.e.setSelectedItem(a.A().n(this.i.c()));
    } else if (bV.d()) {
      this.e.setSelectedItem("COM1");
    } else if (this.e.getItemCount() > 0) {
      this.e.setSelectedIndex(0);
    } 
    this.g.setEnabled(true);
    setCursor(Cursor.getDefaultCursor());
  }
  
  public void b(String paramString) {
    if (paramString == null)
      return; 
    T t = T.a();
    R r = t.c(paramString);
    if (r == null)
      throw new a("Ecu Configuration " + paramString + " not currently loaded."); 
    a(r);
  }
  
  public void a(R paramR) {
    if (paramR == null)
      throw new a("Ecu Configuration not valid."); 
    this.i = paramR;
    ak ak = new ak(this, paramR);
    this.t = true;
    ak.start();
    a(this.b, this.i.c());
    a(this.d, this.i.O().r() + "");
    a(this.e, this.i.O().s());
    this.k = this.i.O().s();
    this.l = this.i.O().r() + "";
    if (paramR.C() != null) {
      this.m = paramR.C().n();
    } else {
      this.m = a.aC;
    } 
    this.n = new a(w.c(), (g)v.a().a(paramR));
    this.s.removeAll();
    this.s.add((Component)this.n);
    this.n.a(this);
    m();
    if (paramR.C() instanceof g) {
      g g = (g)paramR.C();
      f f = g.a();
      if (f != null) {
        a(f);
      } else if (w.c().b() != null) {
        try {
          f = w.c().b().c(paramR.c());
        } catch (InstantiationException instantiationException) {
          Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
        } catch (IllegalAccessException illegalAccessException) {
          Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
        } 
      } 
      this.n.a(f);
    } 
  }
  
  private void a(JComboBox paramJComboBox, String paramString) {
    paramJComboBox.setSelectedItem(paramString);
  }
  
  public void c() {
    ap ap1 = new ap(this, this);
    ap1.start();
  }
  
  public String d() {
    return (String)this.d.getSelectedItem();
  }
  
  public String f() {
    return (String)this.e.getSelectedItem();
  }
  
  public String g() {
    an an = (an)this.c.getSelectedItem();
    return an.a().a();
  }
  
  public void c(String paramString) {
    for (byte b = 0; b < this.c.getItemCount(); b++) {
      Object object = this.c.getItemAt(b);
      if (object != null && object instanceof an) {
        an an = this.c.getItemAt(b);
        if (paramString.equals(an.a().a())) {
          this.c.setSelectedItem(an);
          this.m = paramString;
          return;
        } 
      } 
    } 
  }
  
  public void h() {
    if (this.i != null && this.i.C() instanceof g) {
      g g = (g)this.i.C();
      f f = g.a();
      b(f);
    } 
    if (this.i != null && this.t)
      try {
        this.i.C().d();
      } catch (l l) {
        Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, (Throwable)l);
      }  
    i();
  }
  
  public synchronized void i() {
    if (this.a != null)
      this.a.dispose(); 
    j j = j.a();
    j.b(this);
    d.a().a(false);
  }
  
  public void a(Component paramComponent) {
    this.a = new JDialog(bV.a(paramComponent), g.b("Communication Settings"));
    this.a.add("Center", this);
    JButton jButton1 = new JButton(g.b("Cancel"));
    jButton1.addActionListener(new al(this));
    JButton jButton2 = new JButton(g.b("Accept"));
    jButton2.addActionListener(new am(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    if (bV.d()) {
      jPanel.add(jButton2);
      jPanel.add(jButton1);
    } else {
      jPanel.add(jButton1);
      jPanel.add(jButton2);
    } 
    this.a.add("South", jPanel);
    this.a.pack();
    bV.a(bV.a(paramComponent), this.a);
    this.a.setVisible(true);
    validate();
    this.a.pack();
    this.a.setResizable(false);
  }
  
  public void a(boolean paramBoolean) {
    this.h.setEnabled(paramBoolean);
    this.h.setVisible(paramBoolean);
  }
  
  public void j() {
    a a1 = a.A();
    a(a1);
  }
  
  public void a(a parama) {
    this.i.O().j((String)this.d.getSelectedItem());
    this.i.O().k((String)this.e.getSelectedItem());
    String str = g();
    if (parama != null && parama.u().equals(this.b.getSelectedItem())) {
      parama.a((String)this.b.getSelectedItem(), (String)this.d.getSelectedItem());
      parama.b((String)this.b.getSelectedItem(), (String)this.e.getSelectedItem());
      parama.c(this.i.c(), str);
    } 
    if (this.i.C() instanceof e) {
      e e = (e)this.i.C();
      String str1 = e.f();
      String str2 = e.g();
      if (!this.d.getSelectedItem().equals(str1) || !str2.endsWith((String)this.e.getSelectedItem()))
        this.i.C().c(); 
    } 
    if (this.o instanceof bQ.l)
      try {
        f f = this.n.b();
        j.a().a(this.i.c(), f.h());
        List list = f.l();
        for (r r : list) {
          f.a(r.c(), this.n.a(r.c()));
          if (r.c().equals("Baud Rate")) {
            parama.a((String)this.b.getSelectedItem(), this.n.a(r.c()).toString());
            this.i.O().j(this.n.a(r.c()).toString());
          } 
        } 
        j.a().a(this.i.c(), f);
        p.a((h)this.o, f);
        if (f instanceof a && a.A() != null) {
          i i1 = j.d(new File(a.A().t()));
          if (i1 != null) {
            a a1 = (a)f;
            i1.d(a1.a());
            j.a(new File(a.A().t()), i1);
          } 
        } 
      } catch (l l) {
        bV.d(l.getMessage(), this);
        Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, (Throwable)l);
      } catch (s s) {
        bV.d(s.getMessage(), this);
        Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, (Throwable)s);
      }  
    if (this.o instanceof h)
      try {
        f f = this.n.b();
        v.a().a(this.i.c(), f.h());
        List list = f.l();
        for (r r : list) {
          f.a(r.c(), this.n.a(r.c()));
          if (r.c().equals("Baud Rate")) {
            parama.a((String)this.b.getSelectedItem(), this.n.a(r.c()).toString());
            this.i.O().j(this.n.a(r.c()).toString());
          } 
        } 
        v.a().a(this.i.c(), f);
        p.a((h)this.o, f);
      } catch (l l) {
        bV.d(l.getMessage(), this);
        Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, (Throwable)l);
      } catch (s s) {
        bV.d(s.getMessage(), this);
        Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, (Throwable)s);
      }  
    if (this.o != null && !this.o.equals(this.i.C())) {
      this.i.C().c();
      this.i.b(this.o);
    } 
  }
  
  private synchronized void o() {
    boolean bool = this.i.O().G();
    this.i.O().d(true);
    if (this.o instanceof e) {
      boolean bool1 = true;
      if (!bool1) {
        e e = (e)this.o;
        setCursor(Cursor.getPredefinedCursor(3));
        this.g.setEnabled(false);
        m m = m.a((String)this.e.getSelectedItem(), (String)this.d.getSelectedItem());
        m.b(this);
        this.f.setText("");
        e.b(m);
        e.c();
        e.l();
        if (this.f.getText().equals(""))
          this.f.setText(g.b("Failed") + "!"); 
        this.g.setEnabled(true);
        setCursor(Cursor.getDefaultCursor());
      } else {
        f f = null;
        try {
          f = w.c().a(a.d, this.i.c());
          f.a("Baud Rate", this.d.getSelectedItem());
          f.a("Com Port", this.e.getSelectedItem());
          i i1 = null;
          if (a.A() != null)
            i1 = j.d(new File(a.A().t())); 
          J j = c.a().a(this.i, c.e, w.c(), i1, null);
          p.a((h)j, f);
          setCursor(Cursor.getPredefinedCursor(3));
          this.g.setEnabled(false);
          m m = m.a((String)this.e.getSelectedItem(), (String)this.d.getSelectedItem());
          m.b(this);
          this.f.setText("");
          j.b(m);
          if (this.f.getText().equals(""))
            this.f.setText(g.b("Failed") + "!"); 
          this.g.setEnabled(true);
          setCursor(Cursor.getDefaultCursor());
        } catch (l l) {
          bV.d(l.getMessage(), this);
          Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, (Throwable)l);
        } catch (s s) {
          bV.d(s.getMessage(), this);
          Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, (Throwable)s);
        } catch (InstantiationException instantiationException) {
          bV.d(g.b("Application Error testing port. Your port may work fine, try it without testing."), this);
          Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
        } catch (IllegalAccessException illegalAccessException) {
          bV.d(g.b("Application Error testing port. Your port may work fine, try it without testing."), this);
          Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
        } finally {
          if (f != null)
            try {
              f.g();
            } catch (Exception exception) {} 
        } 
      } 
    } else if (this.o instanceof g) {
      f f = null;
      try {
        f = this.n.b();
        List list = f.l();
        for (r r : list)
          f.a(r.c(), this.n.a(r.c())); 
        p.a((h)this.o, f);
        setCursor(Cursor.getPredefinedCursor(3));
        this.g.setEnabled(false);
        m m = m.a((String)this.e.getSelectedItem(), (String)this.d.getSelectedItem());
        m.b(this);
        this.f.setText("");
        this.o.b(m);
        if (this.f.getText().equals(""))
          this.f.setText(g.b("Failed") + "!"); 
        this.g.setEnabled(true);
        setCursor(Cursor.getDefaultCursor());
      } catch (l l) {
        bV.d(l.getMessage(), this);
        Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, (Throwable)l);
      } catch (s s) {
        bV.d(s.getMessage(), this);
        Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, (Throwable)s);
      } finally {
        if (f != null)
          try {
            f.g();
          } catch (Exception exception) {} 
      } 
    } 
    this.i.O().d(bool);
  }
  
  public void a(double paramDouble) {}
  
  public synchronized void a(o paramo) {
    aB.a().e();
    if (paramo.a() == 1) {
      this.f.setText(g.b("Successful") + "!!!");
    } else {
      this.f.setText(g.b("Failed") + "!");
      this.f.repaint();
    } 
    this.g.setEnabled(true);
    setCursor(Cursor.getDefaultCursor());
    notify();
  }
  
  public boolean a(String paramString1, String paramString2, List paramList, bT parambT) {
    try {
      if (!o.a(parambT)) {
        String str = g.b("A Controller was found on") + " " + paramString1 + ".\n" + g.b("However, there appears to be no Firmware loaded.") + "\n" + g.b("Please check help for information on getting and installing firmware.") + "\n\n" + g.b("You must have firmware installed to connect.");
        bV.d(str, this);
      } 
      if (paramString2.contains(":")) {
        String str = paramString2.substring(0, paramString2.indexOf(":"));
        if (!c.a().a(str)) {
          String str1 = g.b("The Controller found requires a driver that is not available in this edition of the application.");
          bV.d(str1, this);
          return false;
        } 
        paramString2 = paramString2.substring(paramString2.indexOf(":") + 1, paramString2.length());
        c(str);
      } 
      f f = w.c().a(paramString2, this.i.c());
      for (c c : paramList) {
        try {
          f.a(c.a(), c.b());
        } catch (s s) {
          Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, (Throwable)s);
        } 
      } 
      this.n.a(f);
    } catch (InstantiationException instantiationException) {
      Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
    } 
    if (paramString2.equals(a.d)) {
      c(c.a);
      for (c c : paramList) {
        if (c.a().equals("Baud Rate")) {
          a(this.d, c.b().toString());
          continue;
        } 
        if (c.a().equals("Com Port")) {
          a(this.e, c.b().toString());
          continue;
        } 
        if (c.a().equals("2nd Com Port"))
          a(this.e, c.b().toString()); 
      } 
    } 
    return true;
  }
  
  public void b(double paramDouble) {}
  
  public void a() {}
  
  public void k() {
    this.b.removeAllItems();
    T t = T.a();
    String[] arrayOfString = t.d();
    if (this.i == null)
      this.i = t.c(); 
    for (byte b = 0; b < arrayOfString.length; b++)
      this.b.addItem(arrayOfString[b]); 
  }
  
  public void e() {
    aB.a().d();
  }
  
  public void l() {
    if (this.q != null) {
      this.q.e();
      this.q = null;
    } 
    this.q = new aY(bV.b(this));
    this.q.setVisible(true);
    this.q.a(this);
  }
  
  public void a(String paramString) {}
  
  private void a(f paramf) {
    try {
      a(paramf, this.p);
    } catch (Exception exception) {
      Logger.getLogger(ad.class.getName()).log(Level.WARNING, "Failed to capture ControllerInterface setting", exception);
    } 
    f f1 = this.n.b(paramf.h());
    if (f1 != null)
      b(f1, this.p); 
  }
  
  private void b(f paramf) {
    b(paramf, this.p);
  }
  
  private ap a(f paramf, ap paramap) {
    String str = paramf.h();
    List list = paramf.l();
    for (r r : list) {
      Object object = paramf.a(r.c());
      if (object != null) {
        paramap.a(str + r.c(), object.toString());
        continue;
      } 
      paramap.a(r.c(), "");
    } 
    return paramap;
  }
  
  private void b(f paramf, ap paramap) {
    String str = paramf.h();
    List list = paramf.l();
    for (r r : list) {
      Object object = paramf.a(r.c());
      object = (object != null) ? object : "";
      String str1 = paramap.b(str + r.c(), object.toString());
      try {
        paramf.a(r.c(), str1);
      } catch (Exception exception) {
        Logger.getLogger(ad.class.getName()).log(Level.WARNING, "Unable to set ControllerInterface setting", exception);
      } 
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    n();
  }
  
  public void a(x paramx) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */