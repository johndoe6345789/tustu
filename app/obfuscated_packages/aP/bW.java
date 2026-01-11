package aP;

import G.T;
import W.ap;
import W.ar;
import bH.D;
import bz.b;
import com.efiAnalytics.apps.ts.dashboard.Z;
import com.efiAnalytics.apps.ts.dashboard.x;
import java.awt.Component;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import n.a;
import n.g;
import n.n;
import r.a;

public class bW extends n implements a, g {
  int a = 0;
  
  HashMap b = new HashMap<>();
  
  ArrayList c = new ArrayList();
  
  ca d = new ca(this);
  
  boolean e = false;
  
  aW f = null;
  
  private boolean h = false;
  
  boolean g = a.a().b(a.ak, false);
  
  public bW() {
    setTabPlacement(3);
    this.e = a.a().a(a.da, a.db);
    if (!this.e) {
      Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/new16.gif"));
      ImageIcon imageIcon = new ImageIcon(image);
      addTab("", imageIcon, new JPanel(), "Add Gauge Cluster");
      addChangeListener(new bX(this));
      addMouseListener(this.d);
    } 
    this.f = new aW(this);
  }
  
  public x a(Z paramZ, String paramString) {
    x x = new x(T.a().c());
    x.a(paramZ);
    a(x, paramString);
    return x;
  }
  
  public void a(boolean paramBoolean) {
    int i = this.e ? (getTabCount() - 1) : (getTabCount() - 2);
    if (getSelectedIndex() < i) {
      a(getSelectedIndex() + 1, paramBoolean);
    } else {
      a(0, paramBoolean);
    } 
  }
  
  public void b(boolean paramBoolean) {
    int i = this.e ? (getTabCount() - 1) : (getTabCount() - 2);
    if (getSelectedIndex() > 0) {
      a(getSelectedIndex() - 1, paramBoolean);
    } else {
      a(i, paramBoolean);
    } 
  }
  
  public int c() {
    return this.e ? getTabCount() : (getTabCount() - 1);
  }
  
  public void a(int paramInt, boolean paramBoolean) {
    int i = getSelectedIndex();
    super.setSelectedIndex(paramInt);
    x x1 = dd.a().b();
    x x2 = (x)this.b.get(getTitleAt(paramInt));
    boolean bool = (x1 != null && x1.s()) ? true : false;
    if (x2 != null) {
      dd.a().a(x2);
      if (paramBoolean && bool) {
        bY bY = new bY(this, x1, x2);
        SwingUtilities.invokeLater(bY);
      } 
    } 
  }
  
  public void setSelectedIndex(int paramInt) {
    int i = getSelectedIndex();
    super.setSelectedIndex(paramInt);
    x x1 = dd.a().b();
    x x2 = (x)this.b.get(getTitleAt(paramInt));
    if (this.g) {
      if (x2 != null)
        x2.h(true); 
      if (x1 != null && !x1.equals(x2))
        x1.h(false); 
    } 
    boolean bool = (x1 != null && x1.s()) ? true : false;
    if (x2 != null)
      dd.a().a(x2); 
  }
  
  public x a(x paramx, String paramString) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout((LayoutManager)new b());
    jPanel.add((Component)paramx);
    String str = paramString;
    if (this.g && !paramString.equals("Main Dashboard"))
      paramx.h(false); 
    for (byte b = 2; d(paramString); b++)
      paramString = str + "(" + b + ")"; 
    this.b.put(paramString, paramx);
    setName(paramString);
    paramx.setName(paramString);
    ar ar = new ar((a.a()).an, paramString);
    paramx.a((ap)ar);
    Icon icon = null;
    if (getTabCount() < 1) {
      insertTab(paramString, icon, jPanel, null, 0);
    } else {
      int i = this.e ? getTabCount() : (getTabCount() - 1);
      insertTab(paramString, icon, jPanel, null, i);
    } 
    paramx.addMouseListener(this.f);
    paramx.addMouseMotionListener(this.f);
    return paramx;
  }
  
  public void f_() {
    int i = this.e ? (getTabCount() - 1) : (getTabCount() - 2);
    for (int j = i; j > 0; j--) {
      String str = getTitleAt(j);
      x x = (x)this.b.get(str);
      if (x != null) {
        x.c();
        this.b.remove(str);
        x.removeMouseListener(this.f);
        x.removeMouseMotionListener(this.f);
      } 
      remove(j);
    } 
  }
  
  public x e() {
    String str = getTitleAt(getSelectedIndex());
    return (str != null) ? (x)this.b.get(str) : null;
  }
  
  public Iterator f() {
    return this.b.values().iterator();
  }
  
  public x a(String paramString) {
    return (x)this.b.get(paramString);
  }
  
  public void a(d paramd) {
    this.c.add(paramd);
  }
  
  public boolean b(String paramString) {
    if (paramString == null || paramString.equals("") || paramString.equals("Main Dashboard"))
      return false; 
    if (h(paramString))
      for (byte b = 0; b < getTabCount(); b++) {
        if (getTitleAt(b).equals(paramString)) {
          removeTabAt(b);
          x x = (x)this.b.get(paramString);
          if (x != null) {
            x.removeMouseListener(this.f);
            x.removeMouseMotionListener(this.f);
          } 
          this.b.remove(paramString);
          return true;
        } 
      }  
    return false;
  }
  
  private void h() {
    Iterator<d> iterator = this.c.iterator();
    while (iterator.hasNext())
      ((d)iterator.next()).a(); 
  }
  
  private boolean h(String paramString) {
    x x = a(paramString);
    Iterator<d> iterator = this.c.iterator();
    while (iterator.hasNext()) {
      if (!((d)iterator.next()).a(paramString, x))
        return false; 
    } 
    return true;
  }
  
  public void c(String paramString) {
    Iterator<x> iterator = this.b.values().iterator();
    while (iterator.hasNext()) {
      try {
        ((x)iterator.next()).c(paramString);
      } catch (Exception exception) {
        D.b("Failed to set new signature for GaugeCluster.");
        exception.printStackTrace();
      } 
    } 
  }
  
  protected void a(MouseEvent paramMouseEvent) {
    String str = getTitleAt(getSelectedIndex());
    if (str == null || str.equals("") || str.equals("Main Dashboard"))
      return; 
    JPopupMenu jPopupMenu = new JPopupMenu();
    JMenuItem jMenuItem = new JMenuItem("Remove Gauge Cluster");
    jMenuItem.addActionListener(new bZ(this));
    jPopupMenu.add(jMenuItem);
    jPopupMenu.show((Component)this, paramMouseEvent.getX(), paramMouseEvent.getY());
  }
  
  public boolean a() {
    this.h = true;
    return true;
  }
  
  public void b() {
    this.h = false;
  }
  
  public boolean g() {
    return this.h;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */