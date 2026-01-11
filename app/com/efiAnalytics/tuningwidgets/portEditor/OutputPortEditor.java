package com.efiAnalytics.tuningwidgets.portEditor;

import G.R;
import G.aM;
import G.aS;
import G.bq;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import bH.D;
import bH.X;
import bH.p;
import bt.a;
import bt.l;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import r.RInterfaceIndia;
import s.ExceptionPrintstacktrace;

public class OutputPortEditor extends JPanel implements bc {
  R a = null;
  
  private aM o = null;
  
  private aM p = null;
  
  private aM q = null;
  
  private aM r = null;
  
  private aM s = null;
  
  private aM t = null;
  
  private List u = new ArrayList();
  
  private l v = new l(this);
  
  h b = null;
  
  s c = null;
  
  s d = null;
  
  ExceptionPrintstacktrace e = null;
  
  ExceptionPrintstacktrace f = null;
  
  ExceptionExtensionGetmessage ExceptionPrintstacktrace = null;
  
  aS h = null;
  
  JLabel RInterfaceIndia = new JLabel(ExceptionPrintstacktrace.b("Active Delay"), 0);
  
  JLabel ExceptionExtensionGetmessage = new JLabel(ExceptionPrintstacktrace.b("InActive Delay"), 0);
  
  List k = new ArrayList();
  
  List l = new ArrayList();
  
  JButton m = null;
  
  JButton n = null;
  
  public OutputPortEditor(R paramR, aS paramaS) {
    this.h = paramaS;
    this.a = paramR;
    this.o = paramR.c(paramaS.d());
    this.p = paramR.c(paramaS.h());
    this.q = paramR.c(paramaS.RInterfaceIndia());
    this.r = paramR.c(paramaS.ExceptionExtensionGetmessage());
    this.s = paramR.c(paramaS.t());
    this.t = paramR.c(paramaS.u());
    for (String str : paramaS.v())
      this.u.add(paramR.c(str)); 
    for (String str : paramaS.w())
      this.k.add(new JLabel(ExceptionPrintstacktrace.b(str), 0)); 
    a();
    setLayout(new BorderLayout(5, 5));
    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Output Port")));
    this.n = c();
    jPanel1.setLayout(new GridLayout());
    byte b1 = 0;
    Iterator<String> iterator = paramaS.a();
    while (iterator.hasNext()) {
      String str = iterator.next();
      boolean bool = true;
      try {
        bool = p.a(paramaS.a(b1), paramR);
      } catch (ExceptionPrintstacktrace g1) {
        Logger.getLogger(OutputPortEditor.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
      } 
      if (bool && !str.equals("INVALID") && !str.equals("\"INVALID\""))
        l.a(this.v, new o(this, paramR, paramaS.d(), str, b1)); 
      b1++;
    } 
    this.v.setSelectedIndex(0);
    l.a(this.v, new a(this));
    this.v.setBackground(getBackground());
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    jPanel3.add("West", new JLabel(ExceptionPrintstacktrace.b("Port")));
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new FlowLayout(2));
    l l1 = new l(paramR, paramaS.d());
    jPanel4.add((Component)l1);
    if (RInterfaceIndia.a().a("HF-0FD-0HHFJG")) {
      a a = new a(paramR, paramaS.d());
      jPanel4.add((Component)a);
      this.m = b();
      jPanel4.add(this.m);
      jPanel4.add(this.n);
      f();
    } 
    jPanel3.add("Center", jPanel4);
    jPanel2.add("North", jPanel3);
    JScrollPane jScrollPane = new JScrollPane(this.v);
    jPanel2.add("Center", jScrollPane);
    jPanel1.add(jPanel2);
    add("West", jPanel1);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout());
    JPanel jPanel6 = new JPanel();
    jPanel6.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Port Settings")));
    jPanel6.setLayout(new FlowLayout(1, 10, 10));
    this.b = new h(this, paramR, this.o.aL(), ExceptionPrintstacktrace.b("Enabled"));
    this.b.addItemListener(new b(this));
    JPanel jPanel7 = new JPanel();
    jPanel7.setLayout(new GridLayout(0, 1));
    jPanel7.add(new JLabel(""));
    jPanel7.add(this.b);
    jPanel6.add(jPanel7);
    this.c = new s(paramR, paramaS.k(), ExceptionPrintstacktrace.b("Power On Value"), false);
    jPanel6.add(this.c);
    this.d = new s(paramR, paramaS.l(), ExceptionPrintstacktrace.b("Active Value"), false);
    jPanel6.add(this.d);
    if (paramaS.t() != null && paramR.c(paramaS.t()) != null) {
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new GridLayout(0, 1));
      jPanel.add(this.RInterfaceIndia);
      bq bq = new bq();
      bq.b(paramaS.t());
      this.e = new ExceptionPrintstacktrace(this, paramR, bq);
      jPanel.add((Component)this.e);
      jPanel6.add(jPanel);
    } 
    if (paramaS.u() != null && paramR.c(paramaS.u()) != null) {
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new GridLayout(0, 1));
      jPanel.add(this.ExceptionExtensionGetmessage);
      bq bq = new bq();
      bq.b(paramaS.u());
      this.f = new ExceptionPrintstacktrace(this, paramR, bq);
      jPanel.add((Component)this.f);
      jPanel6.add(jPanel);
    } 
    for (byte b2 = 0; b2 < this.u.size(); b2++) {
      aM aM1 = this.u.get(b2);
      if (aM1 != null) {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(0, 1));
        if (this.k.size() > b2) {
          jPanel.add(this.k.get(b2));
        } else {
          jPanel.add(new JLabel(ExceptionPrintstacktrace.b("Attribute " + b2), 0));
        } 
        bq bq = new bq();
        bq.b(aM1.aL());
        ExceptionPrintstacktrace g1 = new ExceptionPrintstacktrace(this, paramR, bq);
        jPanel.add((Component)g1);
        this.l.add(g1);
        jPanel6.add(jPanel);
      } 
    } 
    jPanel5.add("North", jPanel6);
    f f = new f(this);
    f.setLayout(new FlowLayout(1, 6, 6));
    f.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Active Conditions")));
    this.ExceptionPrintstacktrace = new ExceptionExtensionGetmessage(this, paramR, paramaS);
    f.add(this.ExceptionPrintstacktrace);
    jPanel5.add("Center", f);
    add("Center", jPanel5);
    a(0);
    a(this.b.isSelected());
    c c = new c(this);
    SwingUtilities.invokeLater(c);
  }
  
  private void a() {
    if (this.s == null && this.t == null)
      return; 
    try {
      double[][] arrayOfDouble = this.o.RInterfaceIndia(this.a.h());
      if (this.s != null) {
        double[][] arrayOfDouble1 = this.s.RInterfaceIndia(this.a.h());
        for (byte b = 0; b < arrayOfDouble.length; b++) {
          if (arrayOfDouble[b][0] == 0.0D)
            arrayOfDouble1[b][0] = 0.0D; 
        } 
        try {
          this.s.a(this.a.h(), arrayOfDouble1);
        } catch (ExceptionExtensionGetmessage j1) {
          Logger.getLogger(OutputPortEditor.class.getName()).log(Level.SEVERE, "Zero should be supported by onDelay", (Throwable)j1);
        } 
      } 
      if (this.t != null) {
        double[][] arrayOfDouble1 = this.t.RInterfaceIndia(this.a.h());
        for (byte b = 0; b < arrayOfDouble.length; b++) {
          if (arrayOfDouble[b][0] == 0.0D)
            arrayOfDouble1[b][0] = 0.0D; 
        } 
        try {
          this.t.a(this.a.h(), arrayOfDouble1);
        } catch (ExceptionExtensionGetmessage j1) {
          Logger.getLogger(OutputPortEditor.class.getName()).log(Level.SEVERE, "Zero should be supported by offDelay", (Throwable)j1);
        } 
      } 
    } catch (ExceptionPrintstacktrace g1) {
      D.a((Exception)g1);
    } 
  }
  
  private JButton b() {
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("rename.png"));
    ImageIcon imageIcon = new ImageIcon(image);
    JButton jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText(ExceptionPrintstacktrace.b("Set an alias name for selected port"));
    jButton.addActionListener(new d(this));
    jButton.setPreferredSize(new Dimension(18, 18));
    return jButton;
  }
  
  private JButton c() {
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("eraser16.png"));
    ImageIcon imageIcon = new ImageIcon(image);
    JButton jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText(ExceptionPrintstacktrace.b("Clear alias name for selected port, return to default naming."));
    jButton.addActionListener(new e(this));
    jButton.setPreferredSize(new Dimension(18, 18));
    jButton.setEnabled(false);
    return jButton;
  }
  
  private void d() {
    o o = (o)this.v.a();
    String str1 = X.b(o.a(), "\"", "");
    String str2 = ExceptionPrintstacktrace.b(str1);
    String str3 = JOptionPane.showInputDialog(this, ExceptionPrintstacktrace.b("Enter Alias for") + " " + str2, str2);
    if (str3 != null && !str3.isEmpty())
      ExceptionPrintstacktrace.c(str1, str3); 
    this.v.repaint();
  }
  
  private void e() {
    o o = (o)this.v.a();
    String str = X.b(o.a(), "\"", "");
    ExceptionPrintstacktrace.d(str);
    this.v.repaint();
  }
  
  protected void a(String paramString) {
    for (byte b = 0; b < this.v.b(); b++) {
      o o = (o)this.v.a(b);
      String str = o.a();
      if (paramString.equals(str)) {
        a(o.a(o));
        f();
        return;
      } 
    } 
  }
  
  private void f() {
    o o = (o)this.v.a();
    String str = X.b(o.a(), "\"", "");
    this.n.setEnabled(ExceptionPrintstacktrace.e(str));
  }
  
  private void a(boolean paramBoolean) {
    this.c.setEnabled(paramBoolean);
    this.d.setEnabled(paramBoolean);
    this.ExceptionPrintstacktrace.setEnabled(paramBoolean);
    if (this.e != null) {
      this.e.setEnabled(paramBoolean);
      this.RInterfaceIndia.setEnabled(paramBoolean);
    } 
    if (this.f != null) {
      this.f.setEnabled(paramBoolean);
      this.ExceptionExtensionGetmessage.setEnabled(paramBoolean);
    } 
    for (ExceptionPrintstacktrace g1 : this.l)
      g1.setEnabled(paramBoolean); 
    for (JLabel jLabel : this.k)
      jLabel.setEnabled(paramBoolean); 
  }
  
  protected void a(int paramInt) {
    this.b.a(paramInt);
    this.b.b();
    this.c.b(paramInt);
    this.d.b(paramInt);
    this.ExceptionPrintstacktrace.a(paramInt);
    if (this.e != null)
      this.e.c(paramInt); 
    if (this.f != null)
      this.f.c(paramInt); 
    for (ExceptionPrintstacktrace g1 : this.l)
      g1.c(paramInt); 
  }
  
  public void close() {
    for (byte b = 0; b < getComponentCount(); b++) {
      Component component = getComponent(b);
      if (component instanceof bc)
        ((bc)component).close(); 
    } 
    this.b.close();
    if (this.q != null) {
      this.q.b(1.0D);
      this.q.c(0.0D);
    } 
    if (this.r != null) {
      this.r.b(1.0D);
      this.r.c(0.0D);
    } 
    if (this.e != null)
      this.e.close(); 
    if (this.f != null)
      this.f.close(); 
    for (ExceptionPrintstacktrace g1 : this.l)
      g1.close(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/OutputPortEditor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */