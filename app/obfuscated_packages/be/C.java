package be;

import G.Q;
import G.R;
import G.T;
import G.aH;
import G.ah;
import V.a;
import aP.f;
import bH.X;
import bf.a;
import bf.j;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Window;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import s.g;

public class C extends JPanel implements p {
  a a;
  
  s b = new s();
  
  private R j = null;
  
  B c = null;
  
  JButton d;
  
  JButton e;
  
  JButton f;
  
  JButton g;
  
  JComboBox h = new JComboBox();
  
  L i = new L(this);
  
  public C() {
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createTitledBorder(g.b("Custom Configuration Editor")));
    int i = eJ.a(30);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(1, 0, eJ.a(2), eJ.a(2)));
    try {
      Image image = cO.a().a(cO.I, this);
      ImageIcon imageIcon = new ImageIcon(image);
      this.d = new JButton(imageIcon);
      this.d.setToolTipText(g.b("Create New Component"));
      this.d.setPreferredSize(new Dimension(i, i));
      this.d.addActionListener(new D(this));
      jPanel1.add(this.d);
      image = cO.a().a(cO.s, this);
      imageIcon = new ImageIcon(image);
      this.e = new JButton(imageIcon);
      this.e.setToolTipText(g.b("Edit Selected Component"));
      this.e.setPreferredSize(new Dimension(i, i));
      this.e.addActionListener(new E(this));
      jPanel1.add(this.e);
      image = cO.a().a(cO.e, this);
      imageIcon = new ImageIcon(image);
      this.f = new JButton(imageIcon);
      this.f.setToolTipText(g.b("Delete Selected Component"));
      this.f.setPreferredSize(new Dimension(i, i));
      this.f.addActionListener(new F(this));
      jPanel1.add(this.f);
      jPanel1.add(new JLabel());
      image = cO.a().a(cO.P, this);
      imageIcon = new ImageIcon(image);
      this.g = new JButton(imageIcon);
      this.g.setToolTipText(g.b("Save Configuration"));
      this.g.setPreferredSize(new Dimension(i, i));
      this.g.addActionListener(new G(this));
      jPanel1.add(this.g);
    } catch (a a1) {}
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add(jPanel1, "West");
    String[] arrayOfString = T.a().d();
    if (arrayOfString.length > 1) {
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new FlowLayout(2));
      jPanel2.add(jPanel, "Center");
      for (String str : arrayOfString)
        this.h.addItem(str); 
      this.h.addActionListener(new H(this));
      jPanel.add(this.h);
    } 
    add(jPanel2, "North");
    this.a = new a();
    this.a.b(a.a);
    this.a.b(a.b);
    this.a.b(a.c);
    this.a.a(this.i);
    this.a.a(new K(this));
    add((Component)this.a, "West");
    JScrollPane jScrollPane = new JScrollPane(this.b);
    jScrollPane.setPreferredSize(new Dimension(eJ.a(640), eJ.a(500)));
    add(jScrollPane, "Center");
    b();
  }
  
  private void a() {
    String str1 = this.h.getSelectedItem().toString();
    String str2 = this.c.d().c();
    if (str2.equals(str1))
      return; 
    if (!str2.equals(str1) && this.c.c()) {
      boolean bool = bV.a(g.b("There are unsaved changes, Are you sure you want to close without saving?"), this, true);
      if (!bool) {
        this.h.setSelectedItem(str2);
        return;
      } 
    } 
    R r = T.a().c(str1);
    a(r);
  }
  
  private void b() {
    this.d.setEnabled((this.i.a != null));
    this.e.setEnabled((this.i.b != null));
    this.f.setEnabled((this.i.b != null));
    this.g.setEnabled((this.c != null && this.c.c()));
  }
  
  public void a(Window paramWindow) {
    String str = g.b("Custom Configuration Editor");
    JDialog jDialog = new JDialog(paramWindow, str);
    jDialog.add("Center", this);
    jDialog.pack();
    bV.a(paramWindow, jDialog);
    jDialog.addWindowListener(new I(this, jDialog));
    jDialog.setVisible(true);
  }
  
  private void c() {
    if (f.a().b(this.j))
      this.c.b(); 
  }
  
  private void d() {
    Q q = null;
    j j = null;
    if (this.i.a.a() != null) {
      j = (j)this.i.a.getParent();
    } else {
      j = this.i.a;
    } 
    q = r.a(j.toString(), this.j);
    if (q == null) {
      bV.d("Failed to create new component", this);
      return;
    } 
    if (q instanceof ah) {
      String str1 = "Name of new " + j.toString();
      String str2 = bV.a(this, false, g.b(str1), g.b("My") + X.b(j.toString(), " ", ""));
      if (str2 == null || str2.trim().isEmpty())
        return; 
      q.v(X.b(str2, " ", "_"));
      ((ah)q).d(g.b("My Gauges"));
    } else {
      String str = g.b("My") + X.b(j.toString(), " ", "");
      q.v(X.b(str, " ", "_"));
    } 
    d(q);
  }
  
  private void e() {
    d(this.i.b);
  }
  
  private void f() {
    if (this.i.b != null)
      if (this.i.b instanceof aH) {
        aH aH = (aH)this.i.b;
        if (this.c.a(aH.aL()) && bV.a(g.b("There are Gauge Templates referencing this OutputChannel.") + "\n" + g.b("Would you like to delete these Gauge Templates also?."), this, true))
          this.c.b(aH.aL()); 
        this.c.b(aH);
      } else {
        this.c.b(this.i.b);
      }  
  }
  
  public void a(R paramR) {
    this.j = paramR;
    this.a.a(paramR);
    this.b.a(paramR);
    if (this.c == null) {
      this.c = new B(paramR);
      this.c.a(true);
      this.b.a(this.c);
      J j = new J(this);
      this.c.a(j);
      this.c.a((p)this.a.a());
      this.c.a(this);
    } else {
      this.c.a(paramR);
    } 
  }
  
  public void d(Q paramQ) {
    this.b.a(paramQ);
  }
  
  public void a(Q paramQ) {}
  
  public void b(Q paramQ) {}
  
  public void c(Q paramQ) {}
  
  public void a(boolean paramBoolean) {
    this.g.setEnabled(paramBoolean);
    this.g.repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/C.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */