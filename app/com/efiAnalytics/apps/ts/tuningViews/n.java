package com.efiAnalytics.apps.ts.tuningViews;

import G.R;
import G.S;
import V.a;
import bH.D;
import c.b;
import com.efiAnalytics.ui.cO;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import n.a;
import n.g;
import n.n;
import r.i;

public class n extends n implements S, a, g {
  int a = 0;
  
  HashMap b = new HashMap<>();
  
  ArrayList c = new ArrayList();
  
  x d = new x(this);
  
  boolean e = false;
  
  private boolean k = false;
  
  boolean f = false;
  
  List g = new ArrayList();
  
  List h = new ArrayList();
  
  List i = new ArrayList();
  
  int j = 0;
  
  public n() {
    setTabPlacement(3);
    this.e = !i.a().a(";LFDS;LFDS0943;L");
    if (!this.e) {
      Image image;
      try {
        image = cO.a().a(cO.I, (Component)this, 16);
      } catch (a a1) {
        image = null;
        Logger.getLogger(n.class.getName()).log(Level.WARNING, "Failed to get TuningView Tab New image", (Throwable)a1);
      } 
      ImageIcon imageIcon = new ImageIcon(image);
      addTab("", imageIcon, new JPanel(), "Add Tuning View");
      addChangeListener(new o(this));
      addMouseListener(this.d);
    } 
  }
  
  public void a(List paramList) {
    if (this.k) {
      b(paramList);
    } else {
      this.g.addAll(paramList);
    } 
  }
  
  private void b(List paramList) {
    boolean bool = false;
    if (bool) {
      p p = new p(this, paramList);
      p.start();
    } else {
      for (k k : paramList)
        b(k); 
      paramList.clear();
      c(0);
    } 
  }
  
  public J a(k paramk) {
    F f = paramk.d();
    J j = a(f, f.b());
    j.c(paramk.a().getAbsolutePath());
    return j;
  }
  
  private void b(k paramk) {
    J j = new J();
    j.c(paramk.a().getAbsolutePath());
    j.d(paramk.c());
    y y = new y(this, paramk, j);
    this.h.add(y);
    a(j, paramk.b());
  }
  
  private void c(int paramInt) {
    if (this.h != null && this.h.size() > paramInt && !((y)this.h.get(paramInt)).a())
      ((y)this.h.get(paramInt)).start(); 
  }
  
  public void a(int paramInt) {
    if (this.h != null && this.h.size() > paramInt && !((y)this.h.get(paramInt)).a())
      ((y)this.h.get(paramInt)).run(); 
  }
  
  public J a(F paramF, String paramString) {
    J j = new J();
    j.a(paramF);
    a(j, paramString);
    return j;
  }
  
  public void setSelectedIndex(int paramInt) {
    int i = getSelectedIndex();
    super.setSelectedIndex(paramInt);
    J j = (J)this.b.get(getTitleAt(paramInt));
    if (j == null)
      D.b("Unable to set Main cluster for title:" + getTitleAt(paramInt)); 
    if (i >= 0) {
      J j1 = (J)this.b.get(getTitleAt(i));
      boolean bool = (j1 != null && j1.s()) ? true : false;
      if (bool) {
        if (j != null)
          j.t(); 
        q q = new q(this, j1);
        SwingUtilities.invokeLater(q);
      } 
    } 
  }
  
  public J a(J paramJ, String paramString) {
    boolean bool = (getTabCount() < 1) ? false : (this.e ? getTabCount() : (getTabCount() - 1));
    return a(paramJ, paramString, bool);
  }
  
  public J a(J paramJ, String paramString, int paramInt) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("Center", paramJ);
    String str = paramString;
    for (byte b = 2; d(paramString); b++)
      paramString = str + "(" + b + ")"; 
    this.b.put(paramString, paramJ);
    setName(paramString);
    paramJ.setName(paramString);
    Icon icon = null;
    this.f = true;
    insertTab(paramString, icon, jPanel, null, paramInt);
    w w = new w(this, paramJ);
    b.a().a(w);
    a(paramJ);
    this.f = false;
    return paramJ;
  }
  
  public void remove(int paramInt) {
    String str = getTitleAt(paramInt);
    this.b.remove(str);
    if (this.g.size() > paramInt)
      this.g.remove(paramInt); 
    if (this.h.size() > paramInt)
      this.h.remove(paramInt); 
    super.remove(paramInt);
  }
  
  public void c() {
    int i = this.e ? (getTabCount() - 1) : (getTabCount() - 2);
    for (int j = i; j >= 0; j--) {
      String str = getTitleAt(j);
      J j1 = (J)this.b.get(str);
      if (j1 != null) {
        j1.close();
        this.b.remove(str);
      } 
      remove(j);
    } 
    this.g.clear();
    this.h.clear();
    this.i.clear();
  }
  
  public J c_() {
    String str = getTitleAt(getSelectedIndex());
    return (str != null) ? (J)this.b.get(str) : null;
  }
  
  public Iterator e() {
    ArrayList<J> arrayList = new ArrayList();
    for (byte b = 0; b < getTabCount() - 1; b++) {
      J j = a(getTitleAt(b));
      arrayList.add(j);
    } 
    return arrayList.iterator();
  }
  
  public void setTitleAt(int paramInt, String paramString) {
    String str = getTitleAt(paramInt);
    J j = (J)this.b.get(str);
    this.b.remove(str);
    this.b.put(paramString, j);
    super.setTitleAt(paramInt, paramString);
  }
  
  public J a(String paramString) {
    return (J)this.b.get(paramString);
  }
  
  public J b(int paramInt) {
    return a(getTitleAt(paramInt));
  }
  
  public void a(a parama) {
    this.c.add(parama);
  }
  
  public boolean b(String paramString) {
    if (paramString == null || paramString.equals("") || f(paramString) < this.j)
      return false; 
    if (c(paramString))
      for (byte b = 0; b < getTabCount(); b++) {
        if (getTitleAt(b).equals(paramString)) {
          removeTabAt(b);
          J j = (J)this.b.get(paramString);
          if (j != null)
            j.close(); 
          this.b.remove(paramString);
          return true;
        } 
      }  
    return false;
  }
  
  private void g() {
    this.f = true;
    Iterator<a> iterator = this.c.iterator();
    while (iterator.hasNext())
      ((a)iterator.next()).a(); 
    this.f = false;
  }
  
  private boolean c(String paramString) {
    J j = a(paramString);
    Iterator<a> iterator = this.c.iterator();
    while (iterator.hasNext()) {
      if (!((a)iterator.next()).a(paramString, this))
        return false; 
    } 
    return true;
  }
  
  private void a(String paramString, int paramInt) {
    J j = a(paramString);
    Iterator<a> iterator = this.c.iterator();
    while (iterator.hasNext())
      ((a)iterator.next()).a(j, paramInt); 
  }
  
  private void a(J paramJ) {
    Iterator<a> iterator = this.c.iterator();
    while (iterator.hasNext())
      ((a)iterator.next()).a(paramJ); 
  }
  
  protected void a(MouseEvent paramMouseEvent) {
    int i = indexAtLocation(paramMouseEvent.getX(), paramMouseEvent.getY());
    String str = getTitleAt(i);
    if (str == null || str.equals("") || getSelectedIndex() < this.j)
      return; 
    JPopupMenu jPopupMenu = new JPopupMenu();
    JMenuItem jMenuItem1 = new JMenuItem("Remove Tuning View");
    jMenuItem1.addActionListener(new r(this, i));
    jPopupMenu.add(jMenuItem1);
    JMenuItem jMenuItem2 = new JMenuItem("Rename Tab");
    jMenuItem2.addActionListener(new s(this, i));
    jPopupMenu.add(jMenuItem2);
    if (i > 0) {
      JMenuItem jMenuItem = new JMenuItem("Move Tab Left");
      jMenuItem.addActionListener(new t(this, i));
      jPopupMenu.add(jMenuItem);
    } 
    if (i < getTabCount() - 2) {
      JMenuItem jMenuItem = new JMenuItem("Move Tab Right");
      jMenuItem.addActionListener(new u(this, i));
      jPopupMenu.add(jMenuItem);
    } 
    jPopupMenu.show((Component)this, paramMouseEvent.getX(), paramMouseEvent.getY());
  }
  
  public boolean a() {
    D.c("TuneViewPanel Activated.");
    this.k = true;
    if (this.g.size() > 0) {
      b(this.g);
    } else if (getTabCount() <= 1) {
      g();
    } 
    return true;
  }
  
  public boolean isOptimizedDrawingEnabled() {
    return false;
  }
  
  public void b() {
    D.c("TuneViewPanel Deactivated.");
    this.k = false;
  }
  
  public void a(R paramR) {}
  
  public void b(R paramR) {
    for (String str : this.b.keySet()) {
      J j = (J)this.b.get(str);
      b(str);
      if (j != null)
        j.close(); 
    } 
    this.h.clear();
    this.i.clear();
  }
  
  public void c(R paramR) {}
  
  public boolean f() {
    return this.k;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */