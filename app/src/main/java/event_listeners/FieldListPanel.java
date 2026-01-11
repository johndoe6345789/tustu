package ao;

import W.j;
import W.n;
import aq.JPanelExtensionInAqPackage;
import bH.X;
import bz.JPanelExtensionInAqPackage;
import com.efiAnalytics.ui.eJ;
import g.IOJFileChooser;
import h.ClassTypeInHPackage;
import h.IOProperties;
import IOProperties.JPanelExtensionInAqPackage;
import IOProperties.ClassTypeInHPackage;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class u extends JPanel implements fE, hf, hi, IOJFileChooser, l, JPanelExtensionInAqPackage, ClassTypeInHPackage {
  int JPanelExtensionInAqPackage = 0;
  
  n ClassTypeInHPackage = null;
  
  JLabel c = new JLabel();
  
  y d = new y(this);
  
  JPanel e = new JPanel();
  
  JPanel f = new JPanel();
  
  K g = new K();
  
  hx h = null;
  
  boolean IOProperties = true;
  
  boolean j = true;
  
  double IOJFileChooser = 1.0D;
  
  int l = 160;
  
  int m = 25;
  
  Color n = Color.BLACK;
  
  private A p = null;
  
  JPanelExtensionInAqPackage o = new JPanelExtensionInAqPackage(0, 5, 2, 2);
  
  public u(hx paramhx) {
    this.h = paramhx;
    int IOProperties = IOProperties.JPanelExtensionInAqPackage("prefFontSize", eJ.JPanelExtensionInAqPackage(12)) * 11 / 12;
    setFont(new Font("Arial Unicode MS", 0, IOProperties));
    setLayout(new BorderLayout(2, 2));
    this.e.setLayout(new BorderLayout(2, 2));
    this.e.add(this.c, "West");
    FlowLayout flowLayout = new FlowLayout();
    flowLayout.setAlignment(2);
    this.f.setLayout(flowLayout);
    this.f.add(this.g);
    this.e.add(this.f, "Center");
    add(this.e, "North");
    paramhx.JPanelExtensionInAqPackage(this.g);
    this.g.setVisible(false);
    this.d.setLayout((LayoutManager)this.o);
    this.o.JPanelExtensionInAqPackage(IOProperties.JPanelExtensionInAqPackage(IOProperties.E, IOProperties.F));
    add(this.d, "Center");
    paramhx.JPanelExtensionInAqPackage(this);
  }
  
  public void JPanelExtensionInAqPackage(JPanel paramJPanel) {
    add(paramJPanel, "Center");
  }
  
  public void c(n paramn) {
    if (this.ClassTypeInHPackage != null && paramn != null && this.ClassTypeInHPackage.equals(paramn))
      return; 
    this.ClassTypeInHPackage = paramn;
    if (this.p != null)
      for (byte b2 = 0; b2 < this.d.getComponentCount(); b2++) {
        Component component = this.d.getComponent(b2);
        if (component instanceof ar) {
          ar ar = (ar)component;
          this.p.ClassTypeInHPackage(ar);
          ar.JPanelExtensionInAqPackage((A)null);
        } 
      }  
    this.d.removeAll();
    if (this.ClassTypeInHPackage == null)
      return; 
    ArrayList<Object> arrayList = new ArrayList();
    if (ClassTypeInHPackage.JPanelExtensionInAqPackage().JPanelExtensionInAqPackage("selectableFields")) {
      String str = IOProperties.e(JPanelExtensionInAqPackage.ClassTypeInHPackage, "");
      List list = JPanelExtensionInAqPackage.JPanelExtensionInAqPackage(str);
      for (byte b2 = 0; b2 < this.ClassTypeInHPackage.size(); b2++) {
        if (!list.contains(((j)this.ClassTypeInHPackage.get(b2)).JPanelExtensionInAqPackage()) || ((j)this.ClassTypeInHPackage.get(b2)).JPanelExtensionInAqPackage().equals("Engine"))
          arrayList.add(this.ClassTypeInHPackage.get(b2)); 
      } 
    } else {
      arrayList.addAll((Collection<?>)this.ClassTypeInHPackage);
    } 
    if (IOProperties.JPanelExtensionInAqPackage(IOProperties.E, IOProperties.F))
      Collections.sort(arrayList, new v(this)); 
    j[] arrayOfJ = arrayList.<j>toArray(new j[arrayList.size()]);
    for (byte b1 = 0; b1 < arrayOfJ.length; b1++) {
      j j = arrayOfJ[b1];
      ar ar = new ar(j);
      if (JPanelExtensionInAqPackage(j)) {
        ar.ClassTypeInHPackage(this.j);
        ar.c(this.IOProperties);
      } else {
        ar.c(false);
        ar.e(true);
        ar.ClassTypeInHPackage(true);
      } 
      ar.ClassTypeInHPackage(0);
      if (j.u() != null && !j.JPanelExtensionInAqPackage().equals(j.u())) {
        ar.setToolTipText("Standardized Name: " + j.JPanelExtensionInAqPackage() + ", Name in File: " + j.u());
      } else {
        ar.setToolTipText((String)null);
      } 
      if (this.p != null) {
        ar.JPanelExtensionInAqPackage(this.p);
        this.p.JPanelExtensionInAqPackage(ar);
      } 
      this.d.add(ar);
      if (j.JPanelExtensionInAqPackage().equalsIgnoreCase("Engine"))
        this.g.JPanelExtensionInAqPackage(j); 
    } 
    this.l = e();
    this.d.JPanelExtensionInAqPackage(this.d.getWidth());
    this.g.setVisible((this.ClassTypeInHPackage.JPanelExtensionInAqPackage("Engine") != null));
    validate();
    this.d.validate();
  }
  
  private boolean JPanelExtensionInAqPackage(j paramj) {
    return (paramj.p() == 0 || paramj.p() == 2 || paramj.p() == 1);
  }
  
  private int e() {
    int IOProperties = 30;
    Component[] arrayOfComponent = this.d.getComponents();
    for (byte b1 = 0; b1 < arrayOfComponent.length; b1++) {
      if (arrayOfComponent[b1] instanceof ar) {
        ar ar = (ar)arrayOfComponent[b1];
        int j = ar.d(ar.getHeight());
        if (IOProperties < j)
          IOProperties = j; 
      } 
    } 
    IOProperties += (IOProperties > eJ.JPanelExtensionInAqPackage(120)) ? 0 : eJ.JPanelExtensionInAqPackage(20);
    return IOProperties;
  }
  
  private void c(int paramInt) {
    Component[] arrayOfComponent = this.d.getComponents();
    int IOProperties;
    for (IOProperties = 0; IOProperties < arrayOfComponent.length; IOProperties++) {
      if (arrayOfComponent[IOProperties] instanceof ar) {
        ar ar = (ar)arrayOfComponent[IOProperties];
        ar.ClassTypeInHPackage(paramInt);
      } 
    } 
    IOProperties = e();
    if (IOProperties > this.l + eJ.JPanelExtensionInAqPackage(4)) {
      this.l = IOProperties;
      this.d.doLayout();
    } 
  }
  
  public void ClassTypeInHPackage(boolean paramBoolean) {
    c(paramBoolean);
  }
  
  public void c(boolean paramBoolean) {
    this.d.setVisible(paramBoolean);
    IOJFileChooser.ClassTypeInHPackage(this);
  }
  
  public void c() {
    if (this.ClassTypeInHPackage != null) {
      String str1 = this.ClassTypeInHPackage.ClassTypeInHPackage(this.JPanelExtensionInAqPackage);
      String str2 = this.ClassTypeInHPackage.d(this.JPanelExtensionInAqPackage);
      String str3 = (hx.JPanelExtensionInAqPackage().s() == null) ? null : hx.JPanelExtensionInAqPackage().s().d(this.JPanelExtensionInAqPackage - bq.JPanelExtensionInAqPackage().g().JPanelExtensionInAqPackage());
      String str4 = this.ClassTypeInHPackage.c(this.JPanelExtensionInAqPackage);
      String str5 = (this.ClassTypeInHPackage.d() > 0) ? ("" + (this.JPanelExtensionInAqPackage + 1)) : "0";
      if (str1 != null) {
        this.c.setText(str1);
      } else if (str2 != null || str3 != null) {
        if (str3 == null) {
          this.c.setText("Record " + str5 + " of " + this.ClassTypeInHPackage.d() + " : " + str2 + "                    ");
        } else if (str2 == null) {
          this.c.setText("Record " + str5 + " of " + this.ClassTypeInHPackage.d() + ", Compare: " + str3 + "                    ");
        } else {
          this.c.setText("Record " + str5 + " of " + this.ClassTypeInHPackage.d() + " : " + str2 + ", Compare:  " + str3);
        } 
      } else if (str4 != null) {
        this.c.setText("Record " + str5 + " of " + this.ClassTypeInHPackage.d() + " : " + str4 + "                    ");
      } else {
        byte b1;
        if (this.h.t() < 0.02D) {
          b1 = 3;
        } else {
          b1 = 2;
        } 
        this.c.setText("Record " + str5 + " of " + this.ClassTypeInHPackage.d() + " - Zoom: " + X.ClassTypeInHPackage(this.h.t(), b1) + "x - Play speed: " + (this.IOJFileChooser * 100.0D) + "%                                   ");
      } 
    } 
  }
  
  public void JPanelExtensionInAqPackage(int paramInt) {
    this.JPanelExtensionInAqPackage = paramInt;
    c();
    c(paramInt);
    repaint();
  }
  
  public void ClassTypeInHPackage(double paramDouble) {
    c();
  }
  
  public void c(double paramDouble) {
    this.IOJFileChooser = paramDouble;
    c();
  }
  
  public void d(boolean paramBoolean) {
    Component[] arrayOfComponent = this.d.getComponents();
    for (byte b1 = 0; b1 < arrayOfComponent.length; b1++) {
      if (arrayOfComponent[b1] instanceof ar)
        ((ar)arrayOfComponent[b1]).ClassTypeInHPackage(paramBoolean); 
    } 
    this.j = paramBoolean;
  }
  
  public void e(boolean paramBoolean) {
    Component[] arrayOfComponent = this.d.getComponents();
    for (byte b1 = 0; b1 < arrayOfComponent.length; b1++) {
      if (arrayOfComponent[b1] instanceof ar)
        ((ar)arrayOfComponent[b1]).c(paramBoolean); 
    } 
    this.IOProperties = paramBoolean;
  }
  
  public Dimension getMinimumSize() {
    Dimension dimension = this.e.getPreferredSize();
    dimension.width = 200;
    return dimension;
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    dimension.width = 200;
    return dimension;
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    w w = new w(this);
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    SwingUtilities.invokeLater(w);
  }
  
  public void setBackground(Color paramColor) {
    super.setBackground(paramColor);
  }
  
  public JPanel d() {
    return this.d;
  }
  
  public void setForeground(Color paramColor) {
    super.setForeground(paramColor);
    this.n = paramColor;
  }
  
  public void JPanelExtensionInAqPackage(Color paramColor) {}
  
  public void JPanelExtensionInAqPackage(Color paramColor, int paramInt) {}
  
  public void JPanelExtensionInAqPackage(A paramA) {
    this.p = paramA;
  }
  
  public void JPanelExtensionInAqPackage() {}
  
  public void JPanelExtensionInAqPackage(double paramDouble) {}
  
  public void JPanelExtensionInAqPackage(n paramn) {
    x x = new x(this, paramn);
    SwingUtilities.invokeLater(x);
  }
  
  public void ClassTypeInHPackage(n paramn) {}
  
  public void ClassTypeInHPackage() {}
  
  public void ClassTypeInHPackage(int paramInt) {
    for (Component component : this.d.getComponents()) {
      if (component instanceof ar) {
        ar ar = (ar)component;
        ar.c(paramInt);
      } 
    } 
  }
  
  public void JPanelExtensionInAqPackage(boolean paramBoolean) {
    for (Component component : this.d.getComponents()) {
      if (component instanceof ar) {
        ar ar = (ar)component;
        ar.JPanelExtensionInAqPackage(paramBoolean);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */