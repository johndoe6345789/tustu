package com.efiAnalytics.ui;

import bH.D;
import bH.ab;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class WizardPanel extends JPanel {
  JButton a = new JButton("Cancel");
  
  JButton b = new JButton("Next >");
  
  JPanel c = new JPanel();
  
  int d = 0;
  
  CardLayout e = new CardLayout();
  
  ArrayList f = new ArrayList();
  
  boolean g = false;
  
  private ab i = null;
  
  ArrayList h = new ArrayList();
  
  public fL() {
    this((String)null);
  }
  
  public fL(String paramString) {
    this(paramString, (ab)null);
  }
  
  public fL(String paramString, ab paramab) {
    a(paramab);
    paramString = (paramString == null) ? "" : a(paramString);
    setBorder(BorderFactory.createEmptyBorder(5, 5, 25, 5));
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    jPanel.add(this.a);
    this.a.addActionListener(new fM(this));
    jPanel.add(new JLabel("   "));
    jPanel.add(this.b);
    this.b.addActionListener(new fN(this));
    add("South", jPanel);
    this.c.setLayout(this.e);
    if (paramString != null && !paramString.isEmpty())
      this.c.setBorder(BorderFactory.createTitledBorder(a(paramString))); 
    add("Center", this.c);
  }
  
  public void a(Container paramContainer) {
    if (!this.h.contains(paramContainer))
      this.h.add(paramContainer); 
  }
  
  public void b(Container paramContainer) {
    this.h.remove(paramContainer);
  }
  
  public void a(boolean paramBoolean) {
    this.a.setEnabled(paramBoolean);
  }
  
  private String a(String paramString) {
    return (g() != null) ? g().a(paramString) : paramString;
  }
  
  public void a() {
    setCursor(Cursor.getPredefinedCursor(3));
    boolean bool = false;
    if (this.d < this.c.getComponentCount() - 1) {
      if (c(h())) {
        this.d++;
        this.e.next(this.c);
        Container container = a(this.d);
        if (container != null && this.h.contains(container)) {
          this.d++;
          this.e.next(this.c);
        } 
        bool = !d(h()) ? true : false;
        f();
      } 
    } else {
      c();
    } 
    if (bool) {
      fO fO = new fO(this);
      SwingUtilities.invokeLater(fO);
    } 
    setCursor(Cursor.getPredefinedCursor(0));
  }
  
  public void b() {
    if (this.d > 0) {
      this.d--;
      this.e.previous(this.c);
      for (Container container = a(this.d); container != null && this.h.contains(container); container = a(this.d)) {
        this.d--;
        this.e.previous(this.c);
      } 
      f();
    } else {
      d();
    } 
  }
  
  public void c() {
    if (c(h()))
      for (fS fS : this.f) {
        if (!fS.b())
          break; 
      }  
  }
  
  public boolean c(Container paramContainer) {
    for (fS fS : this.f) {
      if (!fS.a(paramContainer))
        return false; 
    } 
    return true;
  }
  
  public boolean d(Container paramContainer) {
    for (fS fS : this.f) {
      if (!fS.b(paramContainer))
        return false; 
    } 
    return true;
  }
  
  public void d() {
    for (fS fS : this.f)
      fS.c(); 
    D.c("Cancel Wizard");
  }
  
  public Container a(int paramInt) {
    return (paramInt >= 0 && paramInt < this.c.getComponentCount()) ? (Container)((Container)this.c.getComponent(paramInt)).getComponent(0) : null;
  }
  
  public int e() {
    return this.c.getComponentCount();
  }
  
  private Container h() {
    for (byte b = 0; b < this.c.getComponentCount(); b++) {
      if (this.c.getComponent(b).isVisible())
        return (Container)((Container)this.c.getComponent(b)).getComponent(0); 
    } 
    return null;
  }
  
  public void e(Container paramContainer) {
    JPanel jPanel = new JPanel();
    if (paramContainer instanceof fT) {
      fT fT = (fT)paramContainer;
      if (fT.g_()) {
        jPanel.setLayout(new GridLayout(1, 1));
      } else {
        jPanel.setLayout(new fR(this));
      } 
    } else {
      jPanel.setLayout(new fR(this));
    } 
    jPanel.add(paramContainer);
    this.c.add(jPanel, "" + this.c.getComponentCount());
  }
  
  public void a(fS paramfS) {
    this.f.add(paramfS);
  }
  
  public void f() {
    if (this.d == 0) {
      this.a.setText(a("Cancel"));
    } else {
      this.a.setText("< " + a("Back"));
    } 
    if (this.d == this.c.getComponentCount() - 1) {
      this.b.setText(a("Finish"));
    } else {
      this.b.setText(a("Next") + " >");
    } 
  }
  
  public JDialog a(Window paramWindow, String paramString) {
    return a(paramWindow, paramString, true);
  }
  
  public JDialog a(Window paramWindow, String paramString, boolean paramBoolean) {
    if (paramString == null || paramString.equals(""))
      paramString = "Wizard"; 
    paramString = a(paramString);
    fQ fQ = new fQ(this, paramWindow, paramString);
    fQ.add("Center", this);
    this.e.first(this.c);
    fQ.pack();
    a(new fP(this, fQ));
    bV.a(paramWindow, fQ);
    if (paramBoolean)
      fQ.setModalityType(Dialog.ModalityType.DOCUMENT_MODAL); 
    return fQ;
  }
  
  public ab g() {
    return this.i;
  }
  
  public void a(ab paramab) {
    this.i = paramab;
    this.a.setText(a("Cancel"));
    this.b.setText(a("Next") + " >");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */