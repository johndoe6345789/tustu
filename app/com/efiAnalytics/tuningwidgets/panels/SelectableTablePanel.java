package com.efiAnalytics.tuningwidgets.panels;

import G.R;
import G.T;
import G.bA;
import G.bM;
import G.bq;
import G.bv;
import bt.Q;
import bt.T;
import bt.an;
import bt.bd;
import bt.bh;
import bt.e;
import bt.p;
import com.efiAnalytics.apps.ts.dashboard.t;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import i.c;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.g;

public class SelectableTablePanel extends JComponent implements t, bc {
  JPanel a = new JPanel();
  
  JLabel b = new JLabel();
  
  bh c = null;
  
  R d = null;
  
  private JButton f = null;
  
  ArrayList e = new ArrayList();
  
  private boolean g = true;
  
  private int h = 3;
  
  private et i = null;
  
  public SelectableTablePanel(R paramR) {
    this.d = paramR;
    setLayout(new BorderLayout());
    this.a.setLayout(new BorderLayout());
    this.a.add("Center", this.b);
    this.f = new JButton(g.b("Select a table"));
    this.f.setPreferredSize(eJ.a(150, 16));
    this.f.setToolTipText(g.b("Click to select Table"));
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
      str = T.a().c().c(); 
    return T.a().c(str);
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
    bv bv = r.e().c(paramString);
    c();
    if (bv != null) {
      if (!W.a(r, bv, bV.c())) {
        bv = new bv();
        bq bq = new bq();
        bq.e(g.b("Password Protected Information"));
        bv.a((bA)bq);
        bq = new bq();
        bq.e(g.b("You must have the password to table."));
        bv.a((bA)bq);
      } 
      this.c = new bh(r, bv, getName(), this.i);
      add("Center", (Component)this.c);
      e.a().a(r.c(), this.c);
      b(paramString);
      if (this.g) {
        if (bv.S()) {
          List list = a((JPanel)this.c);
          for (bd bd : list) {
            Q q = new Q(r, bd.g(), (p)bd);
            bd.a(q);
            if (c.a().e() != null)
              q.a(c.a().f()); 
          } 
        } 
        if (bv.T())
          for (an an : b((JPanel)this.c)) {
            O o = new O(r, an.l(), an);
            an.a(o);
            an.i().j(false);
            if (c.a().e() != null)
              o.a(c.a().f()); 
            T t1 = an.j();
            if (t1 != null) {
              P p = new P(r, t1.g(), t1);
              an.b(p);
              if (c.a().e() != null)
                p.a(c.a().f()); 
            } 
          }  
      } 
    } else {
      b((String)null);
    } 
    String str = bM.c(r, paramString);
    if (str == null || str.isEmpty())
      str = g.b("Select Table"); 
    a().setText(str);
  }
  
  private List a(JPanel paramJPanel) {
    ArrayList arrayList = new ArrayList();
    return a(paramJPanel, arrayList);
  }
  
  private List a(JPanel paramJPanel, List<bd> paramList) {
    if (paramJPanel instanceof bd) {
      paramList.add((bd)paramJPanel);
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
  
  private List b(JPanel paramJPanel, List<an> paramList) {
    if (paramJPanel instanceof an) {
      paramList.add((an)paramJPanel);
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
  
  private void c() {
    if (this.c != null) {
      if (b() != null)
        e.a().b(b().c(), this.c); 
      this.c.close();
      remove((Component)this.c);
    } 
  }
  
  public void close() {
    c();
  }
  
  private String d() {
    return this.d.c();
  }
  
  public void a(ay paramay) {
    this.e.add(paramay);
  }
  
  private void b(String paramString) {
    for (ay ay : this.e)
      ay.panelSelectionChanged(this.d.c(), paramString); 
  }
  
  public void a(boolean paramBoolean) {
    this.g = paramBoolean;
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