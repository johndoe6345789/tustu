package com.efiAnalytics.tunerStudio.search;

import B.g;
import B.i;
import D.c;
import aA.h;
import bH.D;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.apps.ts.dashboard.t;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import r.a;
import r.j;
import r.n;

public class ContinuousIpSearchPanel extends s implements t, bc, Serializable {
  JProgressBar a = new JProgressBar();
  
  JPanel b = new JPanel();
  
  r c;
  
  c d = new c(this);
  
  int f = r.a;
  
  e g = null;
  
  d h = null;
  
  JLabel i = new JLabel();
  
  Map j = new HashMap<>();
  
  List k = new ArrayList();
  
  public ContinuousIpSearchPanel() {
    setOpaque(true);
    setBackground(UIManager.getColor("Label.background"));
    setLayout(new BorderLayout(eJ.a(15), eJ.a(15)));
    setBorder(BorderFactory.createEmptyBorder(eJ.a(40), eJ.a(40), eJ.a(40), eJ.a(40)));
    char c1 = 'Ũ';
    String str = a.a().c(a.aX);
    Image image = Toolkit.getDefaultToolkit().createImage(str);
    image = eJ.a(image, (Component)this, c1);
    ImageIcon imageIcon = new ImageIcon(image);
    this.i.setMinimumSize(new Dimension(100, eJ.a(c1)));
    this.i.setVerticalTextPosition(3);
    this.i.setHorizontalTextPosition(0);
    this.i.setHorizontalAlignment(0);
    int i = eJ.a(5);
    this.i.setBorder(BorderFactory.createEmptyBorder(i, i, i, i));
    this.i.setIcon(imageIcon);
    add("North", this.i);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    this.c = new r();
    this.c.getTableHeader().setUI(null);
    JScrollPane jScrollPane = new JScrollPane(this.c);
    jScrollPane.setBorder(BorderFactory.createLineBorder(Color.lightGray, eJ.a(2), true));
    jPanel.add("Center", jScrollPane);
    this.a.setIndeterminate(true);
    jPanel.add("South", this.a);
    add("Center", jPanel);
    this.g = new e(this);
    this.g.start();
  }
  
  private void loadRecentProjects() {
    long l = System.currentTimeMillis();
    ArrayList arrayList = (new n()).a();
    ArrayList<String> arrayList1 = new ArrayList();
    for (String str : arrayList) {
      File file1 = new File(str);
      i i = j.d(file1);
      if (file1.exists() && i != null && !i.e().isEmpty()) {
        c c1 = h.a().d(i.i(), i.e());
        f f = new f();
        i.b("Offline");
        f.a(i);
        f.a(c1.b());
        k k = new k(file1);
        f.a(k);
        this.k.add(f);
        a a = new a(this, f);
        SwingUtilities.invokeLater(a);
        arrayList1.add(str);
      } 
    } 
    File file = new File(j.u());
    for (File file1 : file.listFiles()) {
      i i = j.d(file1);
      if (!arrayList1.contains(file1.getAbsolutePath()) && file1.exists() && i != null && !i.e().isEmpty()) {
        c c1 = h.a().d(i.i(), i.e());
        f f = new f();
        i.b("Offline");
        f.a(i);
        f.a(c1.b());
        k k = new k(file1);
        f.a(k);
        this.k.add(f);
        b b = new b(this, f);
        SwingUtilities.invokeLater(b);
        arrayList1.add(file1.getAbsolutePath());
      } 
    } 
    D.c("Time to load Projects list: " + (System.currentTimeMillis() - l));
  }
  
  public void setRunDemo(boolean paramBoolean) {}
  
  public boolean isRunDemo() {
    return false;
  }
  
  public void goDead() {}
  
  public void invalidatePainter() {}
  
  public boolean isMustPaint() {
    return false;
  }
  
  public boolean isComponentPaintedAt(int paramInt1, int paramInt2) {
    return (paramInt1 >= 0 && paramInt1 < getWidth() && paramInt2 >= 0 && paramInt2 < getHeight());
  }
  
  public void subscribeToOutput() {}
  
  public void paintBackground(Graphics paramGraphics) {}
  
  public boolean requiresBackgroundRepaint() {
    return false;
  }
  
  public void updateGauge(Graphics paramGraphics) {}
  
  public Area areaPainted() {
    Rectangle2D.Double double_ = new Rectangle2D.Double(0.0D, 0.0D, getWidth(), getHeight());
    return new Area(double_);
  }
  
  public void close() {
    g.a().b(this.d);
    e.a(this.g);
    if (this.h != null)
      d.a(this.h); 
  }
  
  private String getKey(i parami) {
    return (parami.e() != null && !parami.e().isEmpty()) ? parami.e() : (parami.c() + ":" + parami.g());
  }
  
  private void removeExpired() {
    String[] arrayOfString = (String[])this.j.keySet().toArray((Object[])new String[this.j.keySet().size()]);
    for (byte b = 0; b < arrayOfString.length; b++) {
      f f = (f)this.j.get(arrayOfString[b]);
      if (f != null && f.f() != null && f.e() < System.currentTimeMillis() - this.f) {
        f.f().b("Offline");
        this.c.b(f);
        this.c.a();
      } 
    } 
    for (f f : this.c.b) {
      if (f.h() != null && f.h().b() != null && !f.h().b().exists()) {
        String str = getKey(f.f());
        this.j.remove(str);
        this.c.c(f);
      } 
    } 
  }
  
  private void updateDeviceStatus() {
    for (f f : this.j.values()) {
      if (f.g() == null || f.g().c().equals("U")) {
        c c1 = h.a().c(f.b(), f.a());
        if (c1.a() == 0 || c1.a() == 32768) {
          if (c1.b() != null)
            f.a(c1.b()); 
          this.c.b(f);
          this.c.a();
          this.c.b();
        } 
      } 
    } 
    for (f f : this.k) {
      c c1 = h.a().c(f.b(), f.a());
      if (c1.a() == 0 || c1.a() == 32768) {
        f.a(c1.b());
        this.c.b(f);
        this.c.a();
        this.c.b();
      } 
    } 
    this.k.clear();
  }
  
  private void devicesUpdated() {
    if (this.h == null || !this.h.isAlive()) {
      this.h = new d(this);
      this.h.start();
    } 
  }
  
  public void unsubscribeToOutput() {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/ContinuousIpSearchPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */