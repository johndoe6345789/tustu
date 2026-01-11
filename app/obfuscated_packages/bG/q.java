package bG;

import V.a;
import W.ap;
import W.ar;
import aE.a;
import bH.D;
import bH.I;
import bH.S;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class q extends JToolBar implements j {
  m a;
  
  ap b;
  
  ArrayList c = new ArrayList();
  
  public q(m paramm) {
    this.a = paramm;
    b();
    this.b = (ap)new ar((Properties)a.A(), "TriggerWheelewditor_" + paramm.getName());
    paramm.a(this);
    paramm.setFocusable(true);
    paramm.addKeyListener(new D(this));
  }
  
  private JToolBar b() {
    byte b = 28;
    q q1 = this;
    q1.setFloatable(false);
    q1.setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(0, 1, 3, 3));
    q1.add("North", jPanel);
    try {
      Image image = cO.a().a(cO.I);
      ImageIcon imageIcon = new ImageIcon(image);
      JButton jButton = new JButton(null, imageIcon);
      jButton.setFocusable(false);
      jButton.setToolTipText("Create new Trigger Wheel");
      jButton.addActionListener(new r(this));
      jButton.setPreferredSize(new Dimension(b, b));
      jPanel.add(jButton);
    } catch (a a) {
      Logger.getLogger(q.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
    try {
      Image image = cO.a().a(cO.d);
      ImageIcon imageIcon = new ImageIcon(image);
      JButton jButton = new JButton(null, imageIcon);
      jButton.setFocusable(false);
      jButton.setToolTipText("Add a Trigger Tooth");
      jButton.addActionListener(new v(this));
      jButton.setPreferredSize(new Dimension(b, b));
      jPanel.add(jButton);
    } catch (a a) {
      Logger.getLogger(q.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
    try {
      Image image = cO.a().a(cO.N);
      ImageIcon imageIcon = new ImageIcon(image);
      JButton jButton = new JButton(null, imageIcon);
      jButton.setFocusable(false);
      jButton.setToolTipText("Resize Selected Teeth");
      jButton.addActionListener(new w(this));
      jButton.setPreferredSize(new Dimension(b, b));
      jPanel.add(jButton);
      this.c.add(jButton);
    } catch (a a) {
      Logger.getLogger(q.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
    try {
      Image image = cO.a().a(cO.J);
      ImageIcon imageIcon = new ImageIcon(image);
      JButton jButton = new JButton(null, imageIcon);
      jButton.setFocusable(false);
      jButton.setToolTipText("Move Selected Teeth");
      jButton.addActionListener(new x(this));
      jButton.setPreferredSize(new Dimension(b, b));
      jPanel.add(jButton);
      this.c.add(jButton);
    } catch (a a) {
      Logger.getLogger(q.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
    try {
      Image image = cO.a().a(cO.e);
      ImageIcon imageIcon = new ImageIcon(image);
      JButton jButton = new JButton(null, imageIcon);
      jButton.setFocusable(false);
      jButton.setToolTipText("Delete Selected Teeth");
      jButton.addActionListener(new y(this));
      jButton.setPreferredSize(new Dimension(b, b));
      jPanel.add(jButton);
      this.c.add(jButton);
    } catch (a a) {
      Logger.getLogger(q.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
    a(new ArrayList());
    return q1;
  }
  
  private void c() {
    d d = new d(bV.b(this), this.b);
    bV.a(this, d);
    d.setVisible(true);
    if (d.d()) {
      int i = d.a();
      int k = d.b();
      double d1 = d.c();
      D.c("Teeth = " + i + ", NumMissingTeeth=" + k + ", width=" + d1);
      a a = new a(i, k);
      if (!Double.isNaN(d1) && d1 > 0.0D)
        a.a(d1); 
      l l = this.a.e();
      if (l instanceof b) {
        ((b)l).a(a.a());
        this.a.repaint();
      } 
    } 
  }
  
  private void d() {
    l l = this.a.e();
    if (l instanceof b) {
      String str1 = "{Position in Degrees of new tooth:}:{Size in Degrees of new tooth:}";
      String str2 = bV.a(str1, true, "Add a tooth.", true, this);
      if (str2 != null && !str2.isEmpty() && !str2.equals(":")) {
        String[] arrayOfString = str2.split(":");
        if (arrayOfString.length != 2)
          return; 
        double d1 = Double.parseDouble(arrayOfString[0]);
        double d2 = Double.parseDouble(arrayOfString[1]);
        d1 %= 360.0D;
        b b = (b)l;
        k k = new k();
        k.a(d1);
        k.b(d2);
        b.a().add(k);
        b(b.a());
        b.a(b.a());
        this.a.repaint();
      } 
    } 
  }
  
  private void e() {
    double d = 1.0D;
    l l = this.a.e();
    if (l instanceof b) {
      b b = (b)l;
      d = b.d();
    } 
    a(-d);
  }
  
  private void f() {
    double d = 1.0D;
    l l = this.a.e();
    if (l instanceof b) {
      b b = (b)l;
      d = b.d();
    } 
    a(d);
  }
  
  private void g() {
    l l = this.a.e();
    if (l instanceof b) {
      String str1 = "{Number of Degrees to shift selected teeth.}";
      String str2 = bV.a(str1, true, "Number of Degrees to shift selected teeth.", true, this);
      if (str2 != null && I.a(str2)) {
        double d = Double.parseDouble(str2);
        a(d);
      } 
    } 
  }
  
  private void a(double paramDouble) {
    l l = this.a.e();
    if (l instanceof b) {
      paramDouble %= 360.0D;
      Integer[] arrayOfInteger = this.a.h();
      b b = (b)l;
      arrayOfInteger = S.a(arrayOfInteger);
      for (int i = arrayOfInteger.length - 1; i >= 0; i--) {
        if (arrayOfInteger[i].intValue() < b.a().size()) {
          k k = b.a().get(arrayOfInteger[i].intValue());
          if (k.a() + paramDouble < 0.0D)
            paramDouble = 360.0D + paramDouble; 
          k.a((k.a() + paramDouble) % 360.0D);
        } 
      } 
      b(b.a());
      b.a(b.a());
      this.a.repaint();
    } 
  }
  
  private void h() {
    l l = this.a.e();
    if (l instanceof b) {
      String str1 = "{Set selected teeth width in degrees }";
      String str2 = bV.a(str1, true, "Resize selected teeth.", true, this);
      if (str2 != null && I.a(str2)) {
        double d = Double.parseDouble(str2);
        b(d);
      } 
    } 
  }
  
  private void b(double paramDouble) {
    l l = this.a.e();
    if (l instanceof b) {
      paramDouble %= 360.0D;
      if (paramDouble <= 0.0D) {
        bV.d("Size must be greater than zero.", this);
        return;
      } 
      Integer[] arrayOfInteger = this.a.h();
      b b = (b)l;
      arrayOfInteger = S.a(arrayOfInteger);
      for (int i = arrayOfInteger.length - 1; i >= 0; i--) {
        k k = b.a().get(arrayOfInteger[i].intValue());
        k.b(paramDouble);
      } 
      b.a(b.a());
      this.a.repaint();
    } 
  }
  
  public JMenu a() {
    JMenu jMenu = new JMenu("Edit");
    JMenuItem jMenuItem = new JMenuItem("New Wheel");
    jMenuItem.addActionListener(new z(this));
    jMenu.add(jMenuItem);
    jMenuItem = new JMenuItem("Add Tooth");
    jMenuItem.addActionListener(new A(this));
    jMenu.add(jMenuItem);
    jMenuItem = new JMenuItem("Move Selected Teeth");
    jMenuItem.addActionListener(new B(this));
    jMenu.add(jMenuItem);
    this.c.add(jMenuItem);
    jMenuItem = new JMenuItem("Resize Selected Teeth");
    jMenuItem.addActionListener(new C(this));
    jMenu.add(jMenuItem);
    this.c.add(jMenuItem);
    jMenuItem = new JMenuItem("Delete Selected Teeth");
    jMenuItem.addActionListener(new s(this));
    jMenu.add(jMenuItem);
    this.c.add(jMenuItem);
    jMenu.addSeparator();
    jMenuItem = new JMenuItem("Select All Teeth");
    jMenuItem.addActionListener(new t(this));
    jMenu.add(jMenuItem);
    jMenuItem = new JMenuItem("Clear Selected Teeth");
    jMenuItem.addActionListener(new u(this));
    jMenu.add(jMenuItem);
    this.c.add(jMenuItem);
    a(new ArrayList());
    return jMenu;
  }
  
  private void i() {
    l l = this.a.e();
    if (l instanceof b) {
      Integer[] arrayOfInteger = this.a.h();
      b b = (b)l;
      arrayOfInteger = S.a(arrayOfInteger);
      for (int i = arrayOfInteger.length - 1; i >= 0; i--)
        b.a(arrayOfInteger[i].intValue()); 
      b.a(b.a());
      this.a.i();
      this.a.repaint();
    } 
  }
  
  private List b(List<k> paramList) {
    for (byte b = 0; b < paramList.size(); b++) {
      for (int i = b + 1; i < paramList.size(); i++) {
        k k1 = paramList.get(b);
        k k2 = paramList.get(i);
        if (k1.a() > k2.a()) {
          paramList.set(b, k2);
          paramList.set(i, k1);
        } 
      } 
    } 
    return paramList;
  }
  
  public void a(List paramList) {
    boolean bool = (paramList != null && !paramList.isEmpty()) ? true : false;
    for (JComponent jComponent : this.c)
      jComponent.setEnabled(bool); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bG/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */