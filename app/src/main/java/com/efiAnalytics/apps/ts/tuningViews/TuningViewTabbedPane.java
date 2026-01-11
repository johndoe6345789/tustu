package com.efiAnalytics.apps.ts.tuningViews;

import G.R;
import G.S;
import V.ExceptionInVPackage;
import bH.D;
import c.CInterfaceBravo;
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
import Isoptimizeddrawingenabled.ExceptionInVPackage;
import Isoptimizeddrawingenabled.NInterfaceGolf;
import Isoptimizeddrawingenabled.Isoptimizeddrawingenabled;
import r.RInterfaceIndia;

public class TuningViewTabbedPane extends Isoptimizeddrawingenabled implements S, ExceptionInVPackage, NInterfaceGolf {
  int ExceptionInVPackage = 0;
  
  HashMap CInterfaceBravo = new HashMap<>();
  
  ArrayList c = new ArrayList();
  
  x d = new x(this);
  
  boolean e = false;
  
  private boolean k = false;
  
  boolean f = false;
  
  List NInterfaceGolf = new ArrayList();
  
  List h = new ArrayList();
  
  List RInterfaceIndia = new ArrayList();
  
  int j = 0;
  
  public Isoptimizeddrawingenabled() {
    setTabPlacement(3);
    this.e = !RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage(";LFDS;LFDS0943;L");
    if (!this.e) {
      Image image;
      try {
        image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.I, (Component)this, 16);
      } catch (ExceptionInVPackage a1) {
        image = null;
        Logger.getLogger(Isoptimizeddrawingenabled.class.getName()).log(Level.WARNING, "Failed to get TuningView Tab New image", (Throwable)a1);
      } 
      ImageIcon imageIcon = new ImageIcon(image);
      addTab("", imageIcon, new JPanel(), "Add Tuning View");
      addChangeListener(new o(this));
      addMouseListener(this.d);
    } 
  }
  
  public void ExceptionInVPackage(List paramList) {
    if (this.k) {
      CInterfaceBravo(paramList);
    } else {
      this.NInterfaceGolf.addAll(paramList);
    } 
  }
  
  private void CInterfaceBravo(List paramList) {
    boolean bool = false;
    if (bool) {
      p p = new p(this, paramList);
      p.start();
    } else {
      for (k k : paramList)
        CInterfaceBravo(k); 
      paramList.clear();
      c(0);
    } 
  }
  
  public J ExceptionInVPackage(k paramk) {
    F f = paramk.d();
    J j = ExceptionInVPackage(f, f.CInterfaceBravo());
    j.c(paramk.ExceptionInVPackage().getAbsolutePath());
    return j;
  }
  
  private void CInterfaceBravo(k paramk) {
    J j = new J();
    j.c(paramk.ExceptionInVPackage().getAbsolutePath());
    j.d(paramk.c());
    y y = new y(this, paramk, j);
    this.h.add(y);
    ExceptionInVPackage(j, paramk.CInterfaceBravo());
  }
  
  private void c(int paramInt) {
    if (this.h != null && this.h.size() > paramInt && !((y)this.h.get(paramInt)).ExceptionInVPackage())
      ((y)this.h.get(paramInt)).start(); 
  }
  
  public void ExceptionInVPackage(int paramInt) {
    if (this.h != null && this.h.size() > paramInt && !((y)this.h.get(paramInt)).ExceptionInVPackage())
      ((y)this.h.get(paramInt)).run(); 
  }
  
  public J ExceptionInVPackage(F paramF, String paramString) {
    J j = new J();
    j.ExceptionInVPackage(paramF);
    ExceptionInVPackage(j, paramString);
    return j;
  }
  
  public void setSelectedIndex(int paramInt) {
    int RInterfaceIndia = getSelectedIndex();
    super.setSelectedIndex(paramInt);
    J j = (J)this.CInterfaceBravo.get(getTitleAt(paramInt));
    if (j == null)
      D.CInterfaceBravo("Unable to set Main cluster for title:" + getTitleAt(paramInt)); 
    if (RInterfaceIndia >= 0) {
      J j1 = (J)this.CInterfaceBravo.get(getTitleAt(RInterfaceIndia));
      boolean bool = (j1 != null && j1.s()) ? true : false;
      if (bool) {
        if (j != null)
          j.t(); 
        q q = new q(this, j1);
        SwingUtilities.invokeLater(q);
      } 
    } 
  }
  
  public J ExceptionInVPackage(J paramJ, String paramString) {
    boolean bool = (getTabCount() < 1) ? false : (this.e ? getTabCount() : (getTabCount() - 1));
    return ExceptionInVPackage(paramJ, paramString, bool);
  }
  
  public J ExceptionInVPackage(J paramJ, String paramString, int paramInt) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("Center", paramJ);
    String str = paramString;
    for (byte CInterfaceBravo = 2; d(paramString); CInterfaceBravo++)
      paramString = str + "(" + CInterfaceBravo + ")"; 
    this.CInterfaceBravo.put(paramString, paramJ);
    setName(paramString);
    paramJ.setName(paramString);
    Icon icon = null;
    this.f = true;
    insertTab(paramString, icon, jPanel, null, paramInt);
    w w = new w(this, paramJ);
    CInterfaceBravo.ExceptionInVPackage().ExceptionInVPackage(w);
    ExceptionInVPackage(paramJ);
    this.f = false;
    return paramJ;
  }
  
  public void remove(int paramInt) {
    String str = getTitleAt(paramInt);
    this.CInterfaceBravo.remove(str);
    if (this.NInterfaceGolf.size() > paramInt)
      this.NInterfaceGolf.remove(paramInt); 
    if (this.h.size() > paramInt)
      this.h.remove(paramInt); 
    super.remove(paramInt);
  }
  
  public void c() {
    int RInterfaceIndia = this.e ? (getTabCount() - 1) : (getTabCount() - 2);
    for (int j = RInterfaceIndia; j >= 0; j--) {
      String str = getTitleAt(j);
      J j1 = (J)this.CInterfaceBravo.get(str);
      if (j1 != null) {
        j1.close();
        this.CInterfaceBravo.remove(str);
      } 
      remove(j);
    } 
    this.NInterfaceGolf.clear();
    this.h.clear();
    this.RInterfaceIndia.clear();
  }
  
  public J c_() {
    String str = getTitleAt(getSelectedIndex());
    return (str != null) ? (J)this.CInterfaceBravo.get(str) : null;
  }
  
  public Iterator e() {
    ArrayList<J> arrayList = new ArrayList();
    for (byte CInterfaceBravo = 0; CInterfaceBravo < getTabCount() - 1; CInterfaceBravo++) {
      J j = ExceptionInVPackage(getTitleAt(CInterfaceBravo));
      arrayList.add(j);
    } 
    return arrayList.iterator();
  }
  
  public void setTitleAt(int paramInt, String paramString) {
    String str = getTitleAt(paramInt);
    J j = (J)this.CInterfaceBravo.get(str);
    this.CInterfaceBravo.remove(str);
    this.CInterfaceBravo.put(paramString, j);
    super.setTitleAt(paramInt, paramString);
  }
  
  public J ExceptionInVPackage(String paramString) {
    return (J)this.CInterfaceBravo.get(paramString);
  }
  
  public J CInterfaceBravo(int paramInt) {
    return ExceptionInVPackage(getTitleAt(paramInt));
  }
  
  public void ExceptionInVPackage(ExceptionInVPackage parama) {
    this.c.add(parama);
  }
  
  public boolean CInterfaceBravo(String paramString) {
    if (paramString == null || paramString.equals("") || f(paramString) < this.j)
      return false; 
    if (c(paramString))
      for (byte CInterfaceBravo = 0; CInterfaceBravo < getTabCount(); CInterfaceBravo++) {
        if (getTitleAt(CInterfaceBravo).equals(paramString)) {
          removeTabAt(CInterfaceBravo);
          J j = (J)this.CInterfaceBravo.get(paramString);
          if (j != null)
            j.close(); 
          this.CInterfaceBravo.remove(paramString);
          return true;
        } 
      }  
    return false;
  }
  
  private void NInterfaceGolf() {
    this.f = true;
    Iterator<ExceptionInVPackage> iterator = this.c.iterator();
    while (iterator.hasNext())
      ((ExceptionInVPackage)iterator.next()).ExceptionInVPackage(); 
    this.f = false;
  }
  
  private boolean c(String paramString) {
    J j = ExceptionInVPackage(paramString);
    Iterator<ExceptionInVPackage> iterator = this.c.iterator();
    while (iterator.hasNext()) {
      if (!((ExceptionInVPackage)iterator.next()).ExceptionInVPackage(paramString, this))
        return false; 
    } 
    return true;
  }
  
  private void ExceptionInVPackage(String paramString, int paramInt) {
    J j = ExceptionInVPackage(paramString);
    Iterator<ExceptionInVPackage> iterator = this.c.iterator();
    while (iterator.hasNext())
      ((ExceptionInVPackage)iterator.next()).ExceptionInVPackage(j, paramInt); 
  }
  
  private void ExceptionInVPackage(J paramJ) {
    Iterator<ExceptionInVPackage> iterator = this.c.iterator();
    while (iterator.hasNext())
      ((ExceptionInVPackage)iterator.next()).ExceptionInVPackage(paramJ); 
  }
  
  protected void ExceptionInVPackage(MouseEvent paramMouseEvent) {
    int RInterfaceIndia = indexAtLocation(paramMouseEvent.getX(), paramMouseEvent.getY());
    String str = getTitleAt(RInterfaceIndia);
    if (str == null || str.equals("") || getSelectedIndex() < this.j)
      return; 
    JPopupMenu jPopupMenu = new JPopupMenu();
    JMenuItem jMenuItem1 = new JMenuItem("Remove Tuning View");
    jMenuItem1.addActionListener(new r(this, RInterfaceIndia));
    jPopupMenu.add(jMenuItem1);
    JMenuItem jMenuItem2 = new JMenuItem("Rename Tab");
    jMenuItem2.addActionListener(new s(this, RInterfaceIndia));
    jPopupMenu.add(jMenuItem2);
    if (RInterfaceIndia > 0) {
      JMenuItem jMenuItem = new JMenuItem("Move Tab Left");
      jMenuItem.addActionListener(new t(this, RInterfaceIndia));
      jPopupMenu.add(jMenuItem);
    } 
    if (RInterfaceIndia < getTabCount() - 2) {
      JMenuItem jMenuItem = new JMenuItem("Move Tab Right");
      jMenuItem.addActionListener(new u(this, RInterfaceIndia));
      jPopupMenu.add(jMenuItem);
    } 
    jPopupMenu.show((Component)this, paramMouseEvent.getX(), paramMouseEvent.getY());
  }
  
  public boolean ExceptionInVPackage() {
    D.c("TuneViewPanel Activated.");
    this.k = true;
    if (this.NInterfaceGolf.size() > 0) {
      CInterfaceBravo(this.NInterfaceGolf);
    } else if (getTabCount() <= 1) {
      NInterfaceGolf();
    } 
    return true;
  }
  
  public boolean isOptimizedDrawingEnabled() {
    return false;
  }
  
  public void CInterfaceBravo() {
    D.c("TuneViewPanel Deactivated.");
    this.k = false;
  }
  
  public void ExceptionInVPackage(R paramR) {}
  
  public void CInterfaceBravo(R paramR) {
    for (String str : this.CInterfaceBravo.keySet()) {
      J j = (J)this.CInterfaceBravo.get(str);
      CInterfaceBravo(str);
      if (j != null)
        j.close(); 
    } 
    this.h.clear();
    this.RInterfaceIndia.clear();
  }
  
  public void c(R paramR) {}
  
  public boolean f() {
    return this.k;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/Isoptimizeddrawingenabled.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */