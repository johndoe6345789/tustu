package aP;

import G.R;
import G.aG;
import G.bT;
import V.a;
import aH.b;
import bH.X;
import bt.bb;
import bt.g;
import bt.y;
import c.d;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import s.g;

public class T extends g implements aG, d, bc, ItemListener {
  protected bb a = null;
  
  R b = null;
  
  y c = null;
  
  JButton d;
  
  DefaultComboBoxModel e = null;
  
  private final Vector i = new Vector();
  
  X f = new X(this);
  
  boolean g = false;
  
  List h = new ArrayList();
  
  public T(R paramR) {
    this.b = paramR;
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(3, 3));
    String str = "Connected Device";
    if (str != null)
      str = g.b(str); 
    if (str != null && str.length() == 0)
      str = " "; 
    this.a = new bb(str);
    jPanel1.add("Center", (Component)this.a);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 0, 2, 2));
    try {
      Image image = cO.a().a(cO.T, (Component)this, 20);
      ImageIcon imageIcon = new ImageIcon(image);
      this.d = new JButton(null, imageIcon);
      this.d.setPreferredSize(eJ.a(24, 24));
      this.d.addActionListener(new U(this));
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new FlowLayout());
      jPanel.add(this.d);
      jPanel2.add(jPanel);
      jPanel1.add("West", jPanel2);
    } catch (a a) {
      a.printStackTrace();
    } 
    this.c = new y();
    this.c.b(3);
    this.c.setMinimumSize(eJ.a(200, 54));
    this.c.setPreferredSize(eJ.a(200, 54));
    for (byte b = 0; b < 15; b++) {
      V v = new V(this, b);
      if (b != paramR.O().x())
        this.i.add(v); 
    } 
    this.e = new DefaultComboBoxModel(this.i);
    this.c.setModel(this.e);
    jPanel1.add("East", (Component)this.c);
    this.c.addItemListener(this);
    add("North", jPanel1);
    paramR.C().a(this);
    b.a().a(this.f);
    c();
  }
  
  public void close() {
    this.c.removeItemListener(this);
    b.a().b(this.f);
    this.b.C().b(this);
  }
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1) {
      V v = (V)paramItemEvent.getItem();
      int i = v.a();
      a(v);
    } 
  }
  
  public void c() {
    b.a().a(this.b);
    this.g = true;
    this.c.repaint();
    this.c.validate();
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.c.setEnabled(paramBoolean);
    this.a.setEnabled(paramBoolean);
    this.d.setEnabled(paramBoolean);
  }
  
  public void setFont(Font paramFont) {
    super.setFont(paramFont);
    if (this.c != null)
      this.c.setFont(paramFont); 
    if (this.a != null)
      this.a.setFont(paramFont); 
  }
  
  public int d() {
    return (this.c.getSelectedItem() != null) ? ((V)this.c.getSelectedItem()).a() : -1;
  }
  
  public void a(int paramInt) {
    V v = b(paramInt);
    this.c.setSelectedItem(v);
    a((Container)this.c, true);
    if (v != null && v.b() != null && v.b().d() != null && !v.b().d().isEmpty()) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("<html>Firmware: ").append(X.b(X.h(v.b().a()), "?", "")).append("<br>");
      stringBuilder.append("Signature: ").append(v.b().d());
      this.c.setToolTipText(stringBuilder.toString());
    } else {
      this.c.setToolTipText(null);
    } 
  }
  
  private void a(Container paramContainer, boolean paramBoolean) {
    Component[] arrayOfComponent = paramContainer.getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      arrayOfComponent[b].setEnabled(paramBoolean);
      if (arrayOfComponent[b] instanceof Container) {
        a((Container)arrayOfComponent[b], paramBoolean);
      } else {
        arrayOfComponent[b].setEnabled(paramBoolean);
      } 
    } 
  }
  
  public R b_() {
    return this.b;
  }
  
  public boolean a(String paramString, bT parambT) {
    c();
    return true;
  }
  
  public void a(String paramString) {}
  
  public void e() {
    boolean bool = false;
    for (V v : this.i) {
      if (V.a(v) != null && v.b().c()) {
        this.c.setSelectedItem(v);
        bool = true;
        break;
      } 
    } 
    if (!bool)
      this.c.setSelectedIndex(0); 
  }
  
  private void a(V paramV) {
    for (W w : this.h)
      w.a(paramV); 
    if (paramV.b() != null && paramV.b().d() != null && !paramV.b().d().isEmpty()) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("<html>Firmware: ").append(X.b(X.h(paramV.b().a()), "?", "")).append("<br>");
      stringBuilder.append("Signature: ").append(paramV.b().d());
      this.c.setToolTipText(stringBuilder.toString());
    } else {
      this.c.setToolTipText(null);
    } 
  }
  
  public void a(W paramW) {
    if (!this.h.contains(paramW))
      this.h.add(paramW); 
  }
  
  private V b(int paramInt) {
    for (V v : this.i) {
      if (v.a() == paramInt)
        return v; 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/T.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */