package aP;

import G.R;
import G.S;
import G.T;
import G.ArrayListInGPackage;
import aE.PropertiesExtension;
import aE.AeInterfaceEcho;
import bH.D;
import br.ThreadedImagePaint;
import com.efiAnalytics.apps.ts.dashboard.ab;
import com.efiAnalytics.apps.ts.dashboard.x;
import com.efiAnalytics.apps.ts.tuningViews.PropertiesExtension;
import com.efiAnalytics.apps.ts.tuningViews.Isoptimizeddrawingenabled;
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
import Isoptimizeddrawingenabled.Isoptimizeddrawingenabled;
import r.PropertiesExtension;
import r.RInterfaceIndia;
import s.SComponentGolf;

public class ManagerPropertiesextension extends JPanel implements S, AeInterfaceEcho {
  x PropertiesExtension = null;
  
  bW b = null;
  
  bj c = null;
  
  dh d = null;
  
  Isoptimizeddrawingenabled AeInterfaceEcho = new Isoptimizeddrawingenabled();
  
  ThreadedImagePaint f = null;
  
  jL SComponentGolf = null;
  
  Isoptimizeddrawingenabled h = null;
  
  ContinuousIpSearchPanel RInterfaceIndia = null;
  
  eD j = null;
  
  ArrayList k = new ArrayList();
  
  ArrayList l = new ArrayList();
  
  public static String m = SComponentGolf.b("Gauge Cluster");
  
  public static String Isoptimizeddrawingenabled = SComponentGolf.b("Diagnostics & High Speed Loggers");
  
  public static String o = SComponentGolf.b("Tuning");
  
  public static String p = SComponentGolf.b("Tune Analyze Live! - Tune For You");
  
  public static String q = SComponentGolf.b("Notes");
  
  public static String r = SComponentGolf.b("Graphing & Logging");
  
  public static String s = SComponentGolf.b("Tuning & Dyno Views");
  
  public static String t = SComponentGolf.b("Register");
  
  public static String u = SComponentGolf.b("Devices");
  
  public static String v = SComponentGolf.b("Shop");
  
  public ManagerPropertiesextension() {
    setLayout(new BorderLayout());
    dd.PropertiesExtension().PropertiesExtension(this);
    dd.PropertiesExtension().PropertiesExtension(this.AeInterfaceEcho);
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("-0spofdspo09432")) {
      add("Center", (Component)this.AeInterfaceEcho);
      PropertiesExtension(t, (Component)new ad());
      return;
    } 
    f.PropertiesExtension().PropertiesExtension(this);
    boolean bool = (PropertiesExtension.PropertiesExtension().c(PropertiesExtension.bq, PropertiesExtension.br) && PropertiesExtension.PropertiesExtension().c(PropertiesExtension.bs, PropertiesExtension.bt)) ? true : false;
    if (!PropertiesExtension.PropertiesExtension().c(PropertiesExtension.bp, false)) {
      add("Center", (Component)this.AeInterfaceEcho);
      if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("64865e43s5hjhcurd")) {
        this.b = new bW();
        this.k.add(this.b);
        dd.PropertiesExtension().PropertiesExtension(this.b);
        this.PropertiesExtension = new x();
        this.PropertiesExtension.setName(SComponentGolf.b("Main Dashboard"));
        dd.PropertiesExtension().PropertiesExtension(this.PropertiesExtension);
        this.PropertiesExtension = ab.PropertiesExtension(this.PropertiesExtension);
        this.b.PropertiesExtension(this.PropertiesExtension, SComponentGolf.b("Main Dashboard"));
        this.PropertiesExtension.c();
        this.b.PropertiesExtension(new hc(this));
        PropertiesExtension(m, (Component)this.b);
        this.b.PropertiesExtension();
      } else {
        this.PropertiesExtension = new x();
        this.PropertiesExtension.setName("Main Dashboard");
        dd.PropertiesExtension().PropertiesExtension(this.PropertiesExtension);
        this.PropertiesExtension = ab.PropertiesExtension(this.PropertiesExtension);
        this.PropertiesExtension.c();
        PropertiesExtension(m, (Component)this.PropertiesExtension);
      } 
      if (!bool) {
        if (!RInterfaceIndia.PropertiesExtension().PropertiesExtension(";oAW:OD iqw [PZSD]")) {
          this.h = new Isoptimizeddrawingenabled();
          PropertiesExtension(s, (Component)this.h);
          dd.PropertiesExtension().PropertiesExtension(this.h);
          z z = new z(this.h);
          this.h.PropertiesExtension((PropertiesExtension)z);
          f.PropertiesExtension().PropertiesExtension((AeInterfaceEcho)z);
          T.PropertiesExtension().PropertiesExtension((S)this.h);
          this.AeInterfaceEcho.setEnabledAt(this.AeInterfaceEcho.getTabCount() - 1, false);
          jb jb1 = new jb((Isoptimizeddrawingenabled)this.h);
          this.h.addChangeListener(jb1);
        } 
        if (!RInterfaceIndia.PropertiesExtension().PropertiesExtension(" j;awerf90wer09uavn")) {
          this.d = new dh();
          PropertiesExtension(r, this.d);
          this.AeInterfaceEcho.setEnabledAt(this.AeInterfaceEcho.getTabCount() - 1, false);
        } 
        if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("oijmoijmf boij reoij")) {
          this.c = new bj();
          PropertiesExtension(Isoptimizeddrawingenabled, (Component)this.c);
          this.AeInterfaceEcho.setEnabledAt(this.AeInterfaceEcho.getTabCount() - 1, false);
        } 
        if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("-0ofdspok54sg")) {
          this.f = new ThreadedImagePaint();
          PropertiesExtension(p, (Component)this.f);
          this.AeInterfaceEcho.setEnabledAt(this.AeInterfaceEcho.getTabCount() - 1, false);
          dd.PropertiesExtension().PropertiesExtension(this.f);
        } else {
          this.f = new ThreadedImagePaint();
          PropertiesExtension(p, (Component)this.f);
          this.AeInterfaceEcho.setEnabledAt(this.AeInterfaceEcho.getTabCount() - 1, false);
        } 
        this.SComponentGolf = new jL();
        hd hd = new hd(this);
        T.PropertiesExtension().PropertiesExtension(hd);
        PropertiesExtension(q, this.SComponentGolf);
        this.AeInterfaceEcho.setEnabledAt(this.AeInterfaceEcho.getTabCount() - 1, false);
      } 
      if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("5fdsrewpok3=+3vcx-"))
        try {
          this.j = new eD();
          PropertiesExtension(v, (Component)this.j);
        } catch (Error error) {
          D.b("No JavaFX, skipping Shop Tab.");
        } catch (Exception exception) {
          D.b("No JavaFX, skipping Shop Tab.");
        }  
      jb jb = new jb(this.AeInterfaceEcho);
      this.AeInterfaceEcho.addChangeListener(jb);
      c();
    } else {
      this.PropertiesExtension = new x();
      this.PropertiesExtension.setName(SComponentGolf.b("Main Dashboard"));
      dd.PropertiesExtension().PropertiesExtension(this.PropertiesExtension);
      this.PropertiesExtension = ab.PropertiesExtension(this.PropertiesExtension);
      add("Center", (Component)this.PropertiesExtension);
      this.PropertiesExtension.c();
    } 
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("kjlkgoi098")) {
      this.RInterfaceIndia = new ContinuousIpSearchPanel();
      PropertiesExtension(u, (Component)this.RInterfaceIndia);
      this.AeInterfaceEcho.setEnabledAt(this.AeInterfaceEcho.getTabCount() - 1, true);
      this.AeInterfaceEcho.SComponentGolf(u);
    } 
    setOpaque(true);
  }
  
  public void PropertiesExtension(String paramString, Component paramComponent) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(0, 0));
    jPanel.add("Center", paramComponent);
    fH fH = new fH();
    fH.setForeground(new Color(0, 0, 192));
    ArrayListInGPackage.PropertiesExtension().PropertiesExtension(new hf(this, fH));
    this.k.add(paramComponent);
    jPanel.add("North", (Component)fH);
    this.AeInterfaceEcho.addTab(paramString, jPanel);
  }
  
  public Isoptimizeddrawingenabled PropertiesExtension() {
    return this.AeInterfaceEcho;
  }
  
  public void PropertiesExtension(R paramR) {
    this.PropertiesExtension.PropertiesExtension(paramR);
  }
  
  public void b(R paramR) {}
  
  public void c() {
    int RInterfaceIndia = PropertiesExtension.PropertiesExtension().o();
    int j = PropertiesExtension.PropertiesExtension().PropertiesExtension(PropertiesExtension.aH, RInterfaceIndia);
    Font font1 = this.AeInterfaceEcho.getFont();
    Font font2 = new Font(font1.getFamily(), font1.getStyle(), j);
    this.AeInterfaceEcho.setFont(font2);
    this.AeInterfaceEcho.validate();
    if (this.b != null) {
      this.b.setFont(font2);
      this.b.validate();
    } 
  }
  
  public void c(R paramR) {}
  
  public boolean isOptimizedDrawingEnabled() {
    return false;
  }
  
  public void PropertiesExtension(PropertiesExtension parama, R paramR) {
    he he = new he(this, paramR, parama);
    SwingUtilities.invokeLater(he);
  }
  
  public void e_() {
    for (AeInterfaceEcho e1 : this.k) {
      if (e1 instanceof AeInterfaceEcho)
        try {
          AeInterfaceEcho e2 = e1;
          e2.e_();
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    } 
    if (this.AeInterfaceEcho != null) {
      Iterator<String> iterator = this.l.iterator();
      while (iterator.hasNext())
        this.AeInterfaceEcho.removeTabAt(this.AeInterfaceEcho.f(iterator.next())); 
      this.l.clear();
      this.AeInterfaceEcho.PropertiesExtension(p, false);
      this.AeInterfaceEcho.PropertiesExtension(Isoptimizeddrawingenabled, false);
      this.AeInterfaceEcho.PropertiesExtension(r, false);
      this.AeInterfaceEcho.PropertiesExtension(q, false);
      this.AeInterfaceEcho.PropertiesExtension(s, false);
      f.PropertiesExtension().Q();
    } 
  }
  
  public void PropertiesExtension(PropertiesExtension parama) {
    if (this.SComponentGolf != null)
      this.SComponentGolf.b(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */