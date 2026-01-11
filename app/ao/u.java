package ao;

import W.j;
import W.n;
import aq.a;
import bH.X;
import bz.a;
import com.efiAnalytics.ui.eJ;
import g.k;
import h.b;
import h.i;
import i.a;
import i.b;
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

public class u extends JPanel implements fE, hf, hi, k, l, a, b {
  int a = 0;
  
  n b = null;
  
  JLabel c = new JLabel();
  
  y d = new y(this);
  
  JPanel e = new JPanel();
  
  JPanel f = new JPanel();
  
  K g = new K();
  
  hx h = null;
  
  boolean i = true;
  
  boolean j = true;
  
  double k = 1.0D;
  
  int l = 160;
  
  int m = 25;
  
  Color n = Color.BLACK;
  
  private A p = null;
  
  a o = new a(0, 5, 2, 2);
  
  public u(hx paramhx) {
    this.h = paramhx;
    int i = i.a("prefFontSize", eJ.a(12)) * 11 / 12;
    setFont(new Font("Arial Unicode MS", 0, i));
    setLayout(new BorderLayout(2, 2));
    this.e.setLayout(new BorderLayout(2, 2));
    this.e.add(this.c, "West");
    FlowLayout flowLayout = new FlowLayout();
    flowLayout.setAlignment(2);
    this.f.setLayout(flowLayout);
    this.f.add(this.g);
    this.e.add(this.f, "Center");
    add(this.e, "North");
    paramhx.a(this.g);
    this.g.setVisible(false);
    this.d.setLayout((LayoutManager)this.o);
    this.o.a(i.a(i.E, i.F));
    add(this.d, "Center");
    paramhx.a(this);
  }
  
  public void a(JPanel paramJPanel) {
    add(paramJPanel, "Center");
  }
  
  public void c(n paramn) {
    if (this.b != null && paramn != null && this.b.equals(paramn))
      return; 
    this.b = paramn;
    if (this.p != null)
      for (byte b2 = 0; b2 < this.d.getComponentCount(); b2++) {
        Component component = this.d.getComponent(b2);
        if (component instanceof ar) {
          ar ar = (ar)component;
          this.p.b(ar);
          ar.a((A)null);
        } 
      }  
    this.d.removeAll();
    if (this.b == null)
      return; 
    ArrayList<Object> arrayList = new ArrayList();
    if (b.a().a("selectableFields")) {
      String str = i.e(a.b, "");
      List list = a.a(str);
      for (byte b2 = 0; b2 < this.b.size(); b2++) {
        if (!list.contains(((j)this.b.get(b2)).a()) || ((j)this.b.get(b2)).a().equals("Engine"))
          arrayList.add(this.b.get(b2)); 
      } 
    } else {
      arrayList.addAll((Collection<?>)this.b);
    } 
    if (i.a(i.E, i.F))
      Collections.sort(arrayList, new v(this)); 
    j[] arrayOfJ = arrayList.<j>toArray(new j[arrayList.size()]);
    for (byte b1 = 0; b1 < arrayOfJ.length; b1++) {
      j j = arrayOfJ[b1];
      ar ar = new ar(j);
      if (a(j)) {
        ar.b(this.j);
        ar.c(this.i);
      } else {
        ar.c(false);
        ar.e(true);
        ar.b(true);
      } 
      ar.b(0);
      if (j.u() != null && !j.a().equals(j.u())) {
        ar.setToolTipText("Standardized Name: " + j.a() + ", Name in File: " + j.u());
      } else {
        ar.setToolTipText((String)null);
      } 
      if (this.p != null) {
        ar.a(this.p);
        this.p.a(ar);
      } 
      this.d.add(ar);
      if (j.a().equalsIgnoreCase("Engine"))
        this.g.a(j); 
    } 
    this.l = e();
    this.d.a(this.d.getWidth());
    this.g.setVisible((this.b.a("Engine") != null));
    validate();
    this.d.validate();
  }
  
  private boolean a(j paramj) {
    return (paramj.p() == 0 || paramj.p() == 2 || paramj.p() == 1);
  }
  
  private int e() {
    int i = 30;
    Component[] arrayOfComponent = this.d.getComponents();
    for (byte b1 = 0; b1 < arrayOfComponent.length; b1++) {
      if (arrayOfComponent[b1] instanceof ar) {
        ar ar = (ar)arrayOfComponent[b1];
        int j = ar.d(ar.getHeight());
        if (i < j)
          i = j; 
      } 
    } 
    i += (i > eJ.a(120)) ? 0 : eJ.a(20);
    return i;
  }
  
  private void c(int paramInt) {
    Component[] arrayOfComponent = this.d.getComponents();
    int i;
    for (i = 0; i < arrayOfComponent.length; i++) {
      if (arrayOfComponent[i] instanceof ar) {
        ar ar = (ar)arrayOfComponent[i];
        ar.b(paramInt);
      } 
    } 
    i = e();
    if (i > this.l + eJ.a(4)) {
      this.l = i;
      this.d.doLayout();
    } 
  }
  
  public void b(boolean paramBoolean) {
    c(paramBoolean);
  }
  
  public void c(boolean paramBoolean) {
    this.d.setVisible(paramBoolean);
    k.b(this);
  }
  
  public void c() {
    if (this.b != null) {
      String str1 = this.b.b(this.a);
      String str2 = this.b.d(this.a);
      String str3 = (hx.a().s() == null) ? null : hx.a().s().d(this.a - bq.a().g().a());
      String str4 = this.b.c(this.a);
      String str5 = (this.b.d() > 0) ? ("" + (this.a + 1)) : "0";
      if (str1 != null) {
        this.c.setText(str1);
      } else if (str2 != null || str3 != null) {
        if (str3 == null) {
          this.c.setText("Record " + str5 + " of " + this.b.d() + " : " + str2 + "                    ");
        } else if (str2 == null) {
          this.c.setText("Record " + str5 + " of " + this.b.d() + ", Compare: " + str3 + "                    ");
        } else {
          this.c.setText("Record " + str5 + " of " + this.b.d() + " : " + str2 + ", Compare:  " + str3);
        } 
      } else if (str4 != null) {
        this.c.setText("Record " + str5 + " of " + this.b.d() + " : " + str4 + "                    ");
      } else {
        byte b1;
        if (this.h.t() < 0.02D) {
          b1 = 3;
        } else {
          b1 = 2;
        } 
        this.c.setText("Record " + str5 + " of " + this.b.d() + " - Zoom: " + X.b(this.h.t(), b1) + "x - Play speed: " + (this.k * 100.0D) + "%                                   ");
      } 
    } 
  }
  
  public void a(int paramInt) {
    this.a = paramInt;
    c();
    c(paramInt);
    repaint();
  }
  
  public void b(double paramDouble) {
    c();
  }
  
  public void c(double paramDouble) {
    this.k = paramDouble;
    c();
  }
  
  public void d(boolean paramBoolean) {
    Component[] arrayOfComponent = this.d.getComponents();
    for (byte b1 = 0; b1 < arrayOfComponent.length; b1++) {
      if (arrayOfComponent[b1] instanceof ar)
        ((ar)arrayOfComponent[b1]).b(paramBoolean); 
    } 
    this.j = paramBoolean;
  }
  
  public void e(boolean paramBoolean) {
    Component[] arrayOfComponent = this.d.getComponents();
    for (byte b1 = 0; b1 < arrayOfComponent.length; b1++) {
      if (arrayOfComponent[b1] instanceof ar)
        ((ar)arrayOfComponent[b1]).c(paramBoolean); 
    } 
    this.i = paramBoolean;
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
  
  public void a(Color paramColor) {}
  
  public void a(Color paramColor, int paramInt) {}
  
  public void a(A paramA) {
    this.p = paramA;
  }
  
  public void a() {}
  
  public void a(double paramDouble) {}
  
  public void a(n paramn) {
    x x = new x(this, paramn);
    SwingUtilities.invokeLater(x);
  }
  
  public void b(n paramn) {}
  
  public void b() {}
  
  public void b(int paramInt) {
    for (Component component : this.d.getComponents()) {
      if (component instanceof ar) {
        ar ar = (ar)component;
        ar.c(paramInt);
      } 
    } 
  }
  
  public void a(boolean paramBoolean) {
    for (Component component : this.d.getComponents()) {
      if (component instanceof ar) {
        ar ar = (ar)component;
        ar.a(paramBoolean);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */