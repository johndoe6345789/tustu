package aP;

import G.R;
import G.S;
import G.T;
import G.aB;
import aE.a;
import aE.e;
import bH.D;
import br.K;
import com.efiAnalytics.apps.ts.dashboard.ab;
import com.efiAnalytics.apps.ts.dashboard.x;
import com.efiAnalytics.apps.ts.tuningViews.a;
import com.efiAnalytics.apps.ts.tuningViews.n;
import com.efiAnalytics.apps.ts.tuningViews.z;
import com.efiAnalytics.tunerStudio.search.ContinuousIpSearchPanel;
import com.efiAnalytics.tuningwidgets.panels.ad;
import com.efiAnalytics.ui.eD;
import com.efiAnalytics.ui.fH;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import n.n;
import r.a;
import r.i;
import s.g;

public class hb extends JPanel implements S, e {
  x a = null;
  
  bW b = null;
  
  bj c = null;
  
  dh d = null;
  
  n e = new n();
  
  K f = null;
  
  jL g = null;
  
  n h = null;
  
  ContinuousIpSearchPanel i = null;
  
  eD j = null;
  
  ArrayList k = new ArrayList();
  
  ArrayList l = new ArrayList();
  
  public static String m = g.b("Gauge Cluster");
  
  public static String n = g.b("Diagnostics & High Speed Loggers");
  
  public static String o = g.b("Tuning");
  
  public static String p = g.b("Tune Analyze Live! - Tune For You");
  
  public static String q = g.b("Notes");
  
  public static String r = g.b("Graphing & Logging");
  
  public static String s = g.b("Tuning & Dyno Views");
  
  public static String t = g.b("Register");
  
  public static String u = g.b("Devices");
  
  public static String v = g.b("Shop");
  
  public hb() {
    setLayout(new BorderLayout());
    dd.a().a(this);
    dd.a().a(this.e);
    if (i.a().a("-0spofdspo09432")) {
      add("Center", (Component)this.e);
      a(t, (Component)new ad());
      return;
    } 
    f.a().a(this);
    boolean bool = (a.a().c(a.bq, a.br) && a.a().c(a.bs, a.bt)) ? true : false;
    if (!a.a().c(a.bp, false)) {
      add("Center", (Component)this.e);
      if (i.a().a("64865e43s5hjhcurd")) {
        this.b = new bW();
        this.k.add(this.b);
        dd.a().a(this.b);
        this.a = new x();
        this.a.setName(g.b("Main Dashboard"));
        dd.a().a(this.a);
        this.a = ab.a(this.a);
        this.b.a(this.a, g.b("Main Dashboard"));
        this.a.c();
        this.b.a(new hc(this));
        a(m, (Component)this.b);
        this.b.a();
      } else {
        this.a = new x();
        this.a.setName("Main Dashboard");
        dd.a().a(this.a);
        this.a = ab.a(this.a);
        this.a.c();
        a(m, (Component)this.a);
      } 
      if (!bool) {
        if (!i.a().a(";oAW:OD iqw [PZSD]")) {
          this.h = new n();
          a(s, (Component)this.h);
          dd.a().a(this.h);
          z z = new z(this.h);
          this.h.a((a)z);
          f.a().a((e)z);
          T.a().a((S)this.h);
          this.e.setEnabledAt(this.e.getTabCount() - 1, false);
          jb jb1 = new jb((n)this.h);
          this.h.addChangeListener(jb1);
        } 
        if (!i.a().a(" j;awerf90wer09uavn")) {
          this.d = new dh();
          a(r, this.d);
          this.e.setEnabledAt(this.e.getTabCount() - 1, false);
        } 
        if (i.a().a("oijmoijmf boij reoij")) {
          this.c = new bj();
          a(n, (Component)this.c);
          this.e.setEnabledAt(this.e.getTabCount() - 1, false);
        } 
        if (i.a().a("-0ofdspok54sg")) {
          this.f = new K();
          a(p, (Component)this.f);
          this.e.setEnabledAt(this.e.getTabCount() - 1, false);
          dd.a().a(this.f);
        } else {
          this.f = new K();
          a(p, (Component)this.f);
          this.e.setEnabledAt(this.e.getTabCount() - 1, false);
        } 
        this.g = new jL();
        hd hd = new hd(this);
        T.a().a(hd);
        a(q, this.g);
        this.e.setEnabledAt(this.e.getTabCount() - 1, false);
      } 
      if (i.a().a("5fdsrewpok3=+3vcx-"))
        try {
          this.j = new eD();
          a(v, (Component)this.j);
        } catch (Error error) {
          D.b("No JavaFX, skipping Shop Tab.");
        } catch (Exception exception) {
          D.b("No JavaFX, skipping Shop Tab.");
        }  
      jb jb = new jb(this.e);
      this.e.addChangeListener(jb);
      c();
    } else {
      this.a = new x();
      this.a.setName(g.b("Main Dashboard"));
      dd.a().a(this.a);
      this.a = ab.a(this.a);
      add("Center", (Component)this.a);
      this.a.c();
    } 
    if (i.a().a("kjlkgoi098")) {
      this.i = new ContinuousIpSearchPanel();
      a(u, (Component)this.i);
      this.e.setEnabledAt(this.e.getTabCount() - 1, true);
      this.e.g(u);
    } 
    setOpaque(true);
  }
  
  public void a(String paramString, Component paramComponent) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(0, 0));
    jPanel.add("Center", paramComponent);
    fH fH = new fH();
    fH.setForeground(new Color(0, 0, 192));
    aB.a().a(new hf(this, fH));
    this.k.add(paramComponent);
    jPanel.add("North", (Component)fH);
    this.e.addTab(paramString, jPanel);
  }
  
  public n a() {
    return this.e;
  }
  
  public void a(R paramR) {
    this.a.a(paramR);
  }
  
  public void b(R paramR) {}
  
  public void c() {
    int i = a.a().o();
    int j = a.a().a(a.aH, i);
    Font font1 = this.e.getFont();
    Font font2 = new Font(font1.getFamily(), font1.getStyle(), j);
    this.e.setFont(font2);
    this.e.validate();
    if (this.b != null) {
      this.b.setFont(font2);
      this.b.validate();
    } 
  }
  
  public void c(R paramR) {}
  
  public boolean isOptimizedDrawingEnabled() {
    return false;
  }
  
  public void a(a parama, R paramR) {
    he he = new he(this, paramR, parama);
    SwingUtilities.invokeLater(he);
  }
  
  public void e_() {
    for (e e1 : this.k) {
      if (e1 instanceof e)
        try {
          e e2 = e1;
          e2.e_();
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    } 
    if (this.e != null) {
      Iterator<String> iterator = this.l.iterator();
      while (iterator.hasNext())
        this.e.removeTabAt(this.e.f(iterator.next())); 
      this.l.clear();
      this.e.a(p, false);
      this.e.a(n, false);
      this.e.a(r, false);
      this.e.a(q, false);
      this.e.a(s, false);
      f.a().Q();
    } 
  }
  
  public void a(a parama) {
    if (this.g != null)
      this.g.b(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */