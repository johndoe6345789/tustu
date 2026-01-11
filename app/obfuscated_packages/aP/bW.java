package aP;

import G.T;
import W.ap;
import W.ar;
import bH.D;
import bz.ManagerPreferredlayoutsize;
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
import Isoptimizeddrawingenabled.NComponentAlpha;
import Isoptimizeddrawingenabled.NInterfaceGolf;
import Isoptimizeddrawingenabled.Isoptimizeddrawingenabled;
import r.NComponentAlpha;

public class bW extends Isoptimizeddrawingenabled implements NComponentAlpha, NInterfaceGolf {
  int NComponentAlpha = 0;
  
  HashMap ManagerPreferredlayoutsize = new HashMap<>();
  
  ArrayList c = new ArrayList();
  
  ca d = new ca(this);
  
  boolean e = false;
  
  aW f = null;
  
  private boolean h = false;
  
  boolean NInterfaceGolf = NComponentAlpha.NComponentAlpha().ManagerPreferredlayoutsize(NComponentAlpha.ak, false);
  
  public bW() {
    setTabPlacement(3);
    this.e = NComponentAlpha.NComponentAlpha().NComponentAlpha(NComponentAlpha.da, NComponentAlpha.db);
    if (!this.e) {
      Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/new16.gif"));
      ImageIcon imageIcon = new ImageIcon(image);
      addTab("", imageIcon, new JPanel(), "Add Gauge Cluster");
      addChangeListener(new bX(this));
      addMouseListener(this.d);
    } 
    this.f = new aW(this);
  }
  
  public x NComponentAlpha(Z paramZ, String paramString) {
    x x = new x(T.NComponentAlpha().c());
    x.NComponentAlpha(paramZ);
    NComponentAlpha(x, paramString);
    return x;
  }
  
  public void NComponentAlpha(boolean paramBoolean) {
    int i = this.e ? (getTabCount() - 1) : (getTabCount() - 2);
    if (getSelectedIndex() < i) {
      NComponentAlpha(getSelectedIndex() + 1, paramBoolean);
    } else {
      NComponentAlpha(0, paramBoolean);
    } 
  }
  
  public void ManagerPreferredlayoutsize(boolean paramBoolean) {
    int i = this.e ? (getTabCount() - 1) : (getTabCount() - 2);
    if (getSelectedIndex() > 0) {
      NComponentAlpha(getSelectedIndex() - 1, paramBoolean);
    } else {
      NComponentAlpha(i, paramBoolean);
    } 
  }
  
  public int c() {
    return this.e ? getTabCount() : (getTabCount() - 1);
  }
  
  public void NComponentAlpha(int paramInt, boolean paramBoolean) {
    int i = getSelectedIndex();
    super.setSelectedIndex(paramInt);
    x x1 = dd.NComponentAlpha().ManagerPreferredlayoutsize();
    x x2 = (x)this.ManagerPreferredlayoutsize.get(getTitleAt(paramInt));
    boolean bool = (x1 != null && x1.s()) ? true : false;
    if (x2 != null) {
      dd.NComponentAlpha().NComponentAlpha(x2);
      if (paramBoolean && bool) {
        bY bY = new bY(this, x1, x2);
        SwingUtilities.invokeLater(bY);
      } 
    } 
  }
  
  public void setSelectedIndex(int paramInt) {
    int i = getSelectedIndex();
    super.setSelectedIndex(paramInt);
    x x1 = dd.NComponentAlpha().ManagerPreferredlayoutsize();
    x x2 = (x)this.ManagerPreferredlayoutsize.get(getTitleAt(paramInt));
    if (this.NInterfaceGolf) {
      if (x2 != null)
        x2.h(true); 
      if (x1 != null && !x1.equals(x2))
        x1.h(false); 
    } 
    boolean bool = (x1 != null && x1.s()) ? true : false;
    if (x2 != null)
      dd.NComponentAlpha().NComponentAlpha(x2); 
  }
  
  public x NComponentAlpha(x paramx, String paramString) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout((LayoutManager)new ManagerPreferredlayoutsize());
    jPanel.add((Component)paramx);
    String str = paramString;
    if (this.NInterfaceGolf && !paramString.equals("Main Dashboard"))
      paramx.h(false); 
    for (byte ManagerPreferredlayoutsize = 2; d(paramString); ManagerPreferredlayoutsize++)
      paramString = str + "(" + ManagerPreferredlayoutsize + ")"; 
    this.ManagerPreferredlayoutsize.put(paramString, paramx);
    setName(paramString);
    paramx.setName(paramString);
    ar ar = new ar((NComponentAlpha.NComponentAlpha()).an, paramString);
    paramx.NComponentAlpha((ap)ar);
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
      x x = (x)this.ManagerPreferredlayoutsize.get(str);
      if (x != null) {
        x.c();
        this.ManagerPreferredlayoutsize.remove(str);
        x.removeMouseListener(this.f);
        x.removeMouseMotionListener(this.f);
      } 
      remove(j);
    } 
  }
  
  public x e() {
    String str = getTitleAt(getSelectedIndex());
    return (str != null) ? (x)this.ManagerPreferredlayoutsize.get(str) : null;
  }
  
  public Iterator f() {
    return this.ManagerPreferredlayoutsize.values().iterator();
  }
  
  public x NComponentAlpha(String paramString) {
    return (x)this.ManagerPreferredlayoutsize.get(paramString);
  }
  
  public void NComponentAlpha(d paramd) {
    this.c.add(paramd);
  }
  
  public boolean ManagerPreferredlayoutsize(String paramString) {
    if (paramString == null || paramString.equals("") || paramString.equals("Main Dashboard"))
      return false; 
    if (h(paramString))
      for (byte ManagerPreferredlayoutsize = 0; ManagerPreferredlayoutsize < getTabCount(); ManagerPreferredlayoutsize++) {
        if (getTitleAt(ManagerPreferredlayoutsize).equals(paramString)) {
          removeTabAt(ManagerPreferredlayoutsize);
          x x = (x)this.ManagerPreferredlayoutsize.get(paramString);
          if (x != null) {
            x.removeMouseListener(this.f);
            x.removeMouseMotionListener(this.f);
          } 
          this.ManagerPreferredlayoutsize.remove(paramString);
          return true;
        } 
      }  
    return false;
  }
  
  private void h() {
    Iterator<d> iterator = this.c.iterator();
    while (iterator.hasNext())
      ((d)iterator.next()).NComponentAlpha(); 
  }
  
  private boolean h(String paramString) {
    x x = NComponentAlpha(paramString);
    Iterator<d> iterator = this.c.iterator();
    while (iterator.hasNext()) {
      if (!((d)iterator.next()).NComponentAlpha(paramString, x))
        return false; 
    } 
    return true;
  }
  
  public void c(String paramString) {
    Iterator<x> iterator = this.ManagerPreferredlayoutsize.values().iterator();
    while (iterator.hasNext()) {
      try {
        ((x)iterator.next()).c(paramString);
      } catch (Exception exception) {
        D.ManagerPreferredlayoutsize("Failed to set new signature for GaugeCluster.");
        exception.printStackTrace();
      } 
    } 
  }
  
  protected void NComponentAlpha(MouseEvent paramMouseEvent) {
    String str = getTitleAt(getSelectedIndex());
    if (str == null || str.equals("") || str.equals("Main Dashboard"))
      return; 
    JPopupMenu jPopupMenu = new JPopupMenu();
    JMenuItem jMenuItem = new JMenuItem("Remove Gauge Cluster");
    jMenuItem.addActionListener(new bZ(this));
    jPopupMenu.add(jMenuItem);
    jPopupMenu.show((Component)this, paramMouseEvent.getX(), paramMouseEvent.getY());
  }
  
  public boolean NComponentAlpha() {
    this.h = true;
    return true;
  }
  
  public void ManagerPreferredlayoutsize() {
    this.h = false;
  }
  
  public boolean NInterfaceGolf() {
    return this.h;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */