package aP;

import G.R;
import G.aG;
import G.bT;
import V.ExceptionInVPackage;
import aH.AhInterfaceBravo;
import bH.X;
import bt.bb;
import bt.SComponentGolf;
import bt.y;
import c.CInterfaceDelta;
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
import s.SComponentGolf;

public class ItemListener extends SComponentGolf implements aG, CInterfaceDelta, bc, ItemListener {
  protected bb ExceptionInVPackage = null;
  
  R AhInterfaceBravo = null;
  
  y c = null;
  
  JButton CInterfaceDelta;
  
  DefaultComboBoxModel e = null;
  
  private final Vector i = new Vector();
  
  X f = new X(this);
  
  boolean SComponentGolf = false;
  
  List h = new ArrayList();
  
  public ItemListener(R paramR) {
    this.AhInterfaceBravo = paramR;
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(3, 3));
    String str = "Connected Device";
    if (str != null)
      str = SComponentGolf.AhInterfaceBravo(str); 
    if (str != null && str.length() == 0)
      str = " "; 
    this.ExceptionInVPackage = new bb(str);
    jPanel1.add("Center", (Component)this.ExceptionInVPackage);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 0, 2, 2));
    try {
      Image image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.T, (Component)this, 20);
      ImageIcon imageIcon = new ImageIcon(image);
      this.CInterfaceDelta = new JButton(null, imageIcon);
      this.CInterfaceDelta.setPreferredSize(eJ.ExceptionInVPackage(24, 24));
      this.CInterfaceDelta.addActionListener(new U(this));
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new FlowLayout());
      jPanel.add(this.CInterfaceDelta);
      jPanel2.add(jPanel);
      jPanel1.add("West", jPanel2);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      ExceptionInVPackage.printStackTrace();
    } 
    this.c = new y();
    this.c.AhInterfaceBravo(3);
    this.c.setMinimumSize(eJ.ExceptionInVPackage(200, 54));
    this.c.setPreferredSize(eJ.ExceptionInVPackage(200, 54));
    for (byte AhInterfaceBravo = 0; AhInterfaceBravo < 15; AhInterfaceBravo++) {
      V v = new V(this, AhInterfaceBravo);
      if (AhInterfaceBravo != paramR.O().x())
        this.i.add(v); 
    } 
    this.e = new DefaultComboBoxModel(this.i);
    this.c.setModel(this.e);
    jPanel1.add("East", (Component)this.c);
    this.c.addItemListener(this);
    add("North", jPanel1);
    paramR.C().ExceptionInVPackage(this);
    AhInterfaceBravo.ExceptionInVPackage().ExceptionInVPackage(this.f);
    c();
  }
  
  public void close() {
    this.c.removeItemListener(this);
    AhInterfaceBravo.ExceptionInVPackage().AhInterfaceBravo(this.f);
    this.AhInterfaceBravo.C().AhInterfaceBravo(this);
  }
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1) {
      V v = (V)paramItemEvent.getItem();
      int i = v.ExceptionInVPackage();
      ExceptionInVPackage(v);
    } 
  }
  
  public void c() {
    AhInterfaceBravo.ExceptionInVPackage().ExceptionInVPackage(this.AhInterfaceBravo);
    this.SComponentGolf = true;
    this.c.repaint();
    this.c.validate();
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.c.setEnabled(paramBoolean);
    this.ExceptionInVPackage.setEnabled(paramBoolean);
    this.CInterfaceDelta.setEnabled(paramBoolean);
  }
  
  public void setFont(Font paramFont) {
    super.setFont(paramFont);
    if (this.c != null)
      this.c.setFont(paramFont); 
    if (this.ExceptionInVPackage != null)
      this.ExceptionInVPackage.setFont(paramFont); 
  }
  
  public int CInterfaceDelta() {
    return (this.c.getSelectedItem() != null) ? ((V)this.c.getSelectedItem()).ExceptionInVPackage() : -1;
  }
  
  public void ExceptionInVPackage(int paramInt) {
    V v = AhInterfaceBravo(paramInt);
    this.c.setSelectedItem(v);
    ExceptionInVPackage((Container)this.c, true);
    if (v != null && v.AhInterfaceBravo() != null && v.AhInterfaceBravo().CInterfaceDelta() != null && !v.AhInterfaceBravo().CInterfaceDelta().isEmpty()) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("<html>Firmware: ").append(X.AhInterfaceBravo(X.h(v.AhInterfaceBravo().ExceptionInVPackage()), "?", "")).append("<br>");
      stringBuilder.append("Signature: ").append(v.AhInterfaceBravo().CInterfaceDelta());
      this.c.setToolTipText(stringBuilder.toString());
    } else {
      this.c.setToolTipText(null);
    } 
  }
  
  private void ExceptionInVPackage(Container paramContainer, boolean paramBoolean) {
    Component[] arrayOfComponent = paramContainer.getComponents();
    for (byte AhInterfaceBravo = 0; AhInterfaceBravo < arrayOfComponent.length; AhInterfaceBravo++) {
      arrayOfComponent[AhInterfaceBravo].setEnabled(paramBoolean);
      if (arrayOfComponent[AhInterfaceBravo] instanceof Container) {
        ExceptionInVPackage((Container)arrayOfComponent[AhInterfaceBravo], paramBoolean);
      } else {
        arrayOfComponent[AhInterfaceBravo].setEnabled(paramBoolean);
      } 
    } 
  }
  
  public R b_() {
    return this.AhInterfaceBravo;
  }
  
  public boolean ExceptionInVPackage(String paramString, bT parambT) {
    c();
    return true;
  }
  
  public void ExceptionInVPackage(String paramString) {}
  
  public void e() {
    boolean bool = false;
    for (V v : this.i) {
      if (V.ExceptionInVPackage(v) != null && v.AhInterfaceBravo().c()) {
        this.c.setSelectedItem(v);
        bool = true;
        break;
      } 
    } 
    if (!bool)
      this.c.setSelectedIndex(0); 
  }
  
  private void ExceptionInVPackage(V paramV) {
    for (W w : this.h)
      w.ExceptionInVPackage(paramV); 
    if (paramV.AhInterfaceBravo() != null && paramV.AhInterfaceBravo().CInterfaceDelta() != null && !paramV.AhInterfaceBravo().CInterfaceDelta().isEmpty()) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("<html>Firmware: ").append(X.AhInterfaceBravo(X.h(paramV.AhInterfaceBravo().ExceptionInVPackage()), "?", "")).append("<br>");
      stringBuilder.append("Signature: ").append(paramV.AhInterfaceBravo().CInterfaceDelta());
      this.c.setToolTipText(stringBuilder.toString());
    } else {
      this.c.setToolTipText(null);
    } 
  }
  
  public void ExceptionInVPackage(W paramW) {
    if (!this.h.contains(paramW))
      this.h.add(paramW); 
  }
  
  private V AhInterfaceBravo(int paramInt) {
    for (V v : this.i) {
      if (v.ExceptionInVPackage() == paramInt)
        return v; 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/T.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */