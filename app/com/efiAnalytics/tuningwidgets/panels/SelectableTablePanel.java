package com.efiAnalytics.tuningwidgets.panels;

import G.R;
import G.T;
import G.Abstract;
import G.ExceptionprintstacktraceInGPackage;
import G.GComponentBq;
import G.ArrayListExceptionprintstacktraceInGPackage;
import bt.Q;
import bt.T;
import bt.ManagerIinterfacecharlie;
import bt.ManagerCinterfacedelta;
import bt.ExceptionEqualsinaipackage;
import bt.e;
import bt.p;
import com.efiAnalytics.apps.ts.dashboard.t;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import i.IInterfaceCharlie;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.SComponentGolf;

public class SelectableTablePanel extends JComponent implements t, bc {
  JPanel a = new JPanel();
  
  JLabel b = new JLabel();
  
  ExceptionEqualsinaipackage IInterfaceCharlie = null;
  
  R d = null;
  
  private JButton f = null;
  
  ArrayList e = new ArrayList();
  
  private boolean SComponentGolf = true;
  
  private int h = 3;
  
  private et i = null;
  
  public SelectableTablePanel(R paramR) {
    this.d = paramR;
    setLayout(new BorderLayout());
    this.a.setLayout(new BorderLayout());
    this.a.add("Center", this.b);
    this.f = new JButton(SComponentGolf.b("Select a table"));
    this.f.setPreferredSize(eJ.a(150, 16));
    this.f.setToolTipText(SComponentGolf.b("Click to select Table"));
    this.f.addActionListener(new aw(this));
    this.f.setFocusable(false);
    this.a.add("East", this.f);
    add("North", this.a);
  }
  
  private void a(int paramInt1, int paramInt2) {
    R r = b();
    Q q = new Q(r, this.h);
    ax ax = new ax(this);
    q.a(ax);
    this.a.add((Component)q);
    q.show(this, paramInt1, paramInt2);
  }
  
  private R b() {
    String str = d();
    if (str == null || str.isEmpty())
      str = T.a().IInterfaceCharlie().IInterfaceCharlie(); 
    return T.a().IInterfaceCharlie(str);
  }
  
  public Dimension getPreferredSize() {
    int i = eJ.a(450);
    Dimension dimension = super.getPreferredSize();
    if (dimension.height > i)
      dimension.height = i; 
    return dimension;
  }
  
  public void a(String paramString) {
    R r = b();
    ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = r.e().IInterfaceCharlie(paramString);
    IInterfaceCharlie();
    if (ArrayListExceptionprintstacktraceInGPackage != null) {
      if (!W.a(r, ArrayListExceptionprintstacktraceInGPackage, bV.IInterfaceCharlie())) {
        ArrayListExceptionprintstacktraceInGPackage = new ArrayListExceptionprintstacktraceInGPackage();
        GComponentBq GComponentBq = new GComponentBq();
        GComponentBq.e(SComponentGolf.b("Password Protected Information"));
        ArrayListExceptionprintstacktraceInGPackage.a((Abstract)GComponentBq);
        GComponentBq = new GComponentBq();
        GComponentBq.e(SComponentGolf.b("You must have the password to table."));
        ArrayListExceptionprintstacktraceInGPackage.a((Abstract)GComponentBq);
      } 
      this.IInterfaceCharlie = new ExceptionEqualsinaipackage(r, ArrayListExceptionprintstacktraceInGPackage, getName(), this.i);
      add("Center", (Component)this.IInterfaceCharlie);
      e.a().a(r.IInterfaceCharlie(), this.IInterfaceCharlie);
      b(paramString);
      if (this.SComponentGolf) {
        if (ArrayListExceptionprintstacktraceInGPackage.S()) {
          List list = a((JPanel)this.IInterfaceCharlie);
          for (ManagerCinterfacedelta ManagerCinterfacedelta : list) {
            Q q = new Q(r, ManagerCinterfacedelta.SComponentGolf(), (p)ManagerCinterfacedelta);
            ManagerCinterfacedelta.a(q);
            if (IInterfaceCharlie.a().e() != null)
              q.a(IInterfaceCharlie.a().f()); 
          } 
        } 
        if (ArrayListExceptionprintstacktraceInGPackage.T())
          for (ManagerIinterfacecharlie ManagerIinterfacecharlie : b((JPanel)this.IInterfaceCharlie)) {
            O o = new O(r, ManagerIinterfacecharlie.l(), ManagerIinterfacecharlie);
            ManagerIinterfacecharlie.a(o);
            ManagerIinterfacecharlie.i().j(false);
            if (IInterfaceCharlie.a().e() != null)
              o.a(IInterfaceCharlie.a().f()); 
            T t1 = ManagerIinterfacecharlie.j();
            if (t1 != null) {
              P p = new P(r, t1.SComponentGolf(), t1);
              ManagerIinterfacecharlie.b(p);
              if (IInterfaceCharlie.a().e() != null)
                p.a(IInterfaceCharlie.a().f()); 
            } 
          }  
      } 
    } else {
      b((String)null);
    } 
    String str = ExceptionprintstacktraceInGPackage.IInterfaceCharlie(r, paramString);
    if (str == null || str.isEmpty())
      str = SComponentGolf.b("Select Table"); 
    a().setText(str);
  }
  
  private List a(JPanel paramJPanel) {
    ArrayList arrayList = new ArrayList();
    return a(paramJPanel, arrayList);
  }
  
  private List a(JPanel paramJPanel, List<ManagerCinterfacedelta> paramList) {
    if (paramJPanel instanceof ManagerCinterfacedelta) {
      paramList.add((ManagerCinterfacedelta)paramJPanel);
    } else {
      for (Component component : paramJPanel.getComponents()) {
        if (component instanceof JPanel)
          a((JPanel)component, paramList); 
      } 
    } 
    return paramList;
  }
  
  private List b(JPanel paramJPanel) {
    ArrayList arrayList = new ArrayList();
    return b(paramJPanel, arrayList);
  }
  
  private List b(JPanel paramJPanel, List<ManagerIinterfacecharlie> paramList) {
    if (paramJPanel instanceof ManagerIinterfacecharlie) {
      paramList.add((ManagerIinterfacecharlie)paramJPanel);
    } else {
      for (Component component : paramJPanel.getComponents()) {
        if (component instanceof JPanel)
          b((JPanel)component, paramList); 
      } 
    } 
    return paramList;
  }
  
  public void a(et paramet) {
    this.i = paramet;
  }
  
  private void IInterfaceCharlie() {
    if (this.IInterfaceCharlie != null) {
      if (b() != null)
        e.a().b(b().IInterfaceCharlie(), this.IInterfaceCharlie); 
      this.IInterfaceCharlie.close();
      remove((Component)this.IInterfaceCharlie);
    } 
  }
  
  public void close() {
    IInterfaceCharlie();
  }
  
  private String d() {
    return this.d.IInterfaceCharlie();
  }
  
  public void a(ay paramay) {
    this.e.add(paramay);
  }
  
  private void b(String paramString) {
    for (ay ay : this.e)
      ay.panelSelectionChanged(this.d.IInterfaceCharlie(), paramString); 
  }
  
  public void a(boolean paramBoolean) {
    this.SComponentGolf = paramBoolean;
  }
  
  public void a(int paramInt) {
    this.h = paramInt;
  }
  
  public void b(boolean paramBoolean) {
    a().setVisible(paramBoolean);
  }
  
  public JButton a() {
    return this.f;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/SelectableTablePanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */