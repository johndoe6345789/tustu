package be;

import G.Q;
import G.R;
import G.T;
import G.SerializableImpl;
import G.GInterfaceAh;
import V.ExceptionInVPackage;
import aP.NetworkHashMap;
import bH.X;
import bf.ExceptionInVPackage;
import bf.DefaultMutableTreeNodeExtension;
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
import s.SComponentGolf;

public class UIInBePackage extends JPanel implements p {
  ExceptionInVPackage ExceptionInVPackage;
  
  s b = new s();
  
  private R DefaultMutableTreeNodeExtension = null;
  
  B c = null;
  
  JButton d;
  
  JButton e;
  
  JButton NetworkHashMap;
  
  JButton SComponentGolf;
  
  JComboBox h = new JComboBox();
  
  L i = new L(this);
  
  public UIInBePackage() {
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Custom Configuration Editor")));
    int i = eJ.ExceptionInVPackage(30);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(1, 0, eJ.ExceptionInVPackage(2), eJ.ExceptionInVPackage(2)));
    try {
      Image image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.I, this);
      ImageIcon imageIcon = new ImageIcon(image);
      this.d = new JButton(imageIcon);
      this.d.setToolTipText(SComponentGolf.b("Create New Component"));
      this.d.setPreferredSize(new Dimension(i, i));
      this.d.addActionListener(new D(this));
      jPanel1.add(this.d);
      image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.s, this);
      imageIcon = new ImageIcon(image);
      this.e = new JButton(imageIcon);
      this.e.setToolTipText(SComponentGolf.b("Edit Selected Component"));
      this.e.setPreferredSize(new Dimension(i, i));
      this.e.addActionListener(new E(this));
      jPanel1.add(this.e);
      image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.e, this);
      imageIcon = new ImageIcon(image);
      this.NetworkHashMap = new JButton(imageIcon);
      this.NetworkHashMap.setToolTipText(SComponentGolf.b("Delete Selected Component"));
      this.NetworkHashMap.setPreferredSize(new Dimension(i, i));
      this.NetworkHashMap.addActionListener(new F(this));
      jPanel1.add(this.NetworkHashMap);
      jPanel1.add(new JLabel());
      image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.P, this);
      imageIcon = new ImageIcon(image);
      this.SComponentGolf = new JButton(imageIcon);
      this.SComponentGolf.setToolTipText(SComponentGolf.b("Save Configuration"));
      this.SComponentGolf.setPreferredSize(new Dimension(i, i));
      this.SComponentGolf.addActionListener(new G(this));
      jPanel1.add(this.SComponentGolf);
    } catch (ExceptionInVPackage a1) {}
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add(jPanel1, "West");
    String[] arrayOfString = T.ExceptionInVPackage().d();
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
    this.ExceptionInVPackage = new ExceptionInVPackage();
    this.ExceptionInVPackage.b(ExceptionInVPackage.ExceptionInVPackage);
    this.ExceptionInVPackage.b(ExceptionInVPackage.b);
    this.ExceptionInVPackage.b(ExceptionInVPackage.c);
    this.ExceptionInVPackage.ExceptionInVPackage(this.i);
    this.ExceptionInVPackage.ExceptionInVPackage(new K(this));
    add((Component)this.ExceptionInVPackage, "West");
    JScrollPane jScrollPane = new JScrollPane(this.b);
    jScrollPane.setPreferredSize(new Dimension(eJ.ExceptionInVPackage(640), eJ.ExceptionInVPackage(500)));
    add(jScrollPane, "Center");
    b();
  }
  
  private void ExceptionInVPackage() {
    String str1 = this.h.getSelectedItem().toString();
    String str2 = this.c.d().c();
    if (str2.equals(str1))
      return; 
    if (!str2.equals(str1) && this.c.c()) {
      boolean bool = bV.ExceptionInVPackage(SComponentGolf.b("There are unsaved changes, Are you sure you want to close without saving?"), this, true);
      if (!bool) {
        this.h.setSelectedItem(str2);
        return;
      } 
    } 
    R r = T.ExceptionInVPackage().c(str1);
    ExceptionInVPackage(r);
  }
  
  private void b() {
    this.d.setEnabled((this.i.ExceptionInVPackage != null));
    this.e.setEnabled((this.i.b != null));
    this.NetworkHashMap.setEnabled((this.i.b != null));
    this.SComponentGolf.setEnabled((this.c != null && this.c.c()));
  }
  
  public void ExceptionInVPackage(Window paramWindow) {
    String str = SComponentGolf.b("Custom Configuration Editor");
    JDialog jDialog = new JDialog(paramWindow, str);
    jDialog.add("Center", this);
    jDialog.pack();
    bV.ExceptionInVPackage(paramWindow, jDialog);
    jDialog.addWindowListener(new I(this, jDialog));
    jDialog.setVisible(true);
  }
  
  private void c() {
    if (NetworkHashMap.ExceptionInVPackage().b(this.DefaultMutableTreeNodeExtension))
      this.c.b(); 
  }
  
  private void d() {
    Q q = null;
    DefaultMutableTreeNodeExtension DefaultMutableTreeNodeExtension = null;
    if (this.i.ExceptionInVPackage.ExceptionInVPackage() != null) {
      DefaultMutableTreeNodeExtension = (DefaultMutableTreeNodeExtension)this.i.ExceptionInVPackage.getParent();
    } else {
      DefaultMutableTreeNodeExtension = this.i.ExceptionInVPackage;
    } 
    q = r.ExceptionInVPackage(DefaultMutableTreeNodeExtension.toString(), this.DefaultMutableTreeNodeExtension);
    if (q == null) {
      bV.d("Failed to create new component", this);
      return;
    } 
    if (q instanceof GInterfaceAh) {
      String str1 = "Name of new " + DefaultMutableTreeNodeExtension.toString();
      String str2 = bV.ExceptionInVPackage(this, false, SComponentGolf.b(str1), SComponentGolf.b("My") + X.b(DefaultMutableTreeNodeExtension.toString(), " ", ""));
      if (str2 == null || str2.trim().isEmpty())
        return; 
      q.v(X.b(str2, " ", "_"));
      ((GInterfaceAh)q).d(SComponentGolf.b("My Gauges"));
    } else {
      String str = SComponentGolf.b("My") + X.b(DefaultMutableTreeNodeExtension.toString(), " ", "");
      q.v(X.b(str, " ", "_"));
    } 
    d(q);
  }
  
  private void e() {
    d(this.i.b);
  }
  
  private void NetworkHashMap() {
    if (this.i.b != null)
      if (this.i.b instanceof SerializableImpl) {
        SerializableImpl SerializableImpl = (SerializableImpl)this.i.b;
        if (this.c.ExceptionInVPackage(SerializableImpl.aL()) && bV.ExceptionInVPackage(SComponentGolf.b("There are Gauge Templates referencing this OutputChannel.") + "\n" + SComponentGolf.b("Would you like to delete these Gauge Templates also?."), this, true))
          this.c.b(SerializableImpl.aL()); 
        this.c.b(SerializableImpl);
      } else {
        this.c.b(this.i.b);
      }  
  }
  
  public void ExceptionInVPackage(R paramR) {
    this.DefaultMutableTreeNodeExtension = paramR;
    this.ExceptionInVPackage.ExceptionInVPackage(paramR);
    this.b.ExceptionInVPackage(paramR);
    if (this.c == null) {
      this.c = new B(paramR);
      this.c.ExceptionInVPackage(true);
      this.b.ExceptionInVPackage(this.c);
      J DefaultMutableTreeNodeExtension = new J(this);
      this.c.ExceptionInVPackage(DefaultMutableTreeNodeExtension);
      this.c.ExceptionInVPackage((p)this.ExceptionInVPackage.ExceptionInVPackage());
      this.c.ExceptionInVPackage(this);
    } else {
      this.c.ExceptionInVPackage(paramR);
    } 
  }
  
  public void d(Q paramQ) {
    this.b.ExceptionInVPackage(paramQ);
  }
  
  public void ExceptionInVPackage(Q paramQ) {}
  
  public void b(Q paramQ) {}
  
  public void c(Q paramQ) {}
  
  public void ExceptionInVPackage(boolean paramBoolean) {
    this.SComponentGolf.setEnabled(paramBoolean);
    this.SComponentGolf.repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/C.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */