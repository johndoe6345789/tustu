package be;

import G.R;
import G.aI;
import G.ah;
import G.dj;
import G.dk;
import G.i;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import ax.ExceptionInAxPackage;
import bH.S;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cF;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.ee;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.ExceptionPrintstacktrace;

public class BeInterfaceYankee extends JPanel implements o {
  A ExceptionInVPackage;
  
  A b;
  
  A c;
  
  A d;
  
  A e;
  
  A f;
  
  A ExceptionPrintstacktrace;
  
  A h;
  
  A i;
  
  A j;
  
  JComboBox k = new JComboBox();
  
  JComboBox l = new JComboBox();
  
  R m = null;
  
  ah n = null;
  
  n o = new n();
  
  static final String p = "[" + ExceptionPrintstacktrace.b("New Category") + "]";
  
  char[] q = new char[] { ' ' };
  
  public BeInterfaceYankee(R paramR) {
    setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Gauge Template")));
    setLayout(new GridLayout(0, 1, eJ.ExceptionInVPackage(4), eJ.ExceptionInVPackage(4)));
    ee ee = new ee();
    byte b = 18;
    this.ExceptionInVPackage = new A(this, "", b);
    this.ExceptionInVPackage.addKeyListener(this.o);
    this.ExceptionInVPackage.addFocusListener((FocusListener)ee);
    add(ExceptionInVPackage("Name", this.ExceptionInVPackage, "A name that will be used to reference this Gauge Template. It must be unique or it will over-ride any existing gauge."));
    this.b = new A(this, "", b);
    this.b.addKeyListener(this.o);
    this.b.addFocusListener((FocusListener)ee);
    add(ExceptionInVPackage("Gauge Title", this.b, "Title to be displayed on the Gauge."));
    this.c = new A(this, "", b);
    this.c.addKeyListener(this.o);
    this.c.addFocusListener((FocusListener)ee);
    add(ExceptionInVPackage("Units", this.c, "(Optional) Units to be displayed on the Gauge Face."));
    this.l.setPreferredSize(this.c.getPreferredSize());
    add(ExceptionInVPackage("Category", this.l, "(Optional) The Category this gauge template will be placed under."));
    this.l.addActionListener(new z(this));
    add(ExceptionInVPackage("OutputChannel", this.k, "The OutputChannel assigned to this Gauge Template, this is the value that will be displayed."));
    this.k.setPreferredSize(this.c.getPreferredSize());
    this.d = new A(this, "", b);
    this.d.addKeyListener(this.o);
    this.d.addFocusListener((FocusListener)ee);
    add(ExceptionInVPackage("Minimum", this.d, "Minimum value on gauge. This can be either ExceptionInVPackage number or an expression."));
    this.e = new A(this, "", b);
    this.e.addKeyListener(this.o);
    this.e.addFocusListener((FocusListener)ee);
    add(ExceptionInVPackage("Maximum", this.e, "Maximum value on gauge. This can be either ExceptionInVPackage number or an expression."));
    this.f = new A(this, "", b);
    this.f.addKeyListener(this.o);
    this.f.addFocusListener((FocusListener)ee);
    add(ExceptionInVPackage("Low Critical", this.f, "Value to be displayed as critically low. This can be either ExceptionInVPackage number or an expression."));
    this.ExceptionPrintstacktrace = new A(this, "", b);
    this.ExceptionPrintstacktrace.addKeyListener(this.o);
    this.ExceptionPrintstacktrace.addFocusListener((FocusListener)ee);
    add(ExceptionInVPackage("Low Warning", this.ExceptionPrintstacktrace, "Value to be displayed as Warning level low. This can be either ExceptionInVPackage number or an expression."));
    this.h = new A(this, "", b);
    this.h.addKeyListener(this.o);
    this.h.addFocusListener((FocusListener)ee);
    add(ExceptionInVPackage("High Warning", this.h, "Value to be displayed as Warning level High. This can be either ExceptionInVPackage number or an expression."));
    this.i = new A(this, "", b);
    this.i.addKeyListener(this.o);
    this.i.addFocusListener((FocusListener)ee);
    add(ExceptionInVPackage("High Critical", this.i, "Value to be displayed as Critical level High. This can be either ExceptionInVPackage number or an expression."));
    this.j = new A(this, "", b);
    this.j.addKeyListener(this.o);
    this.j.addFocusListener((FocusListener)ee);
    add(ExceptionInVPackage("Decimal Places", this.j, "Number of decimal places to display on the Guage. This can be either ExceptionInVPackage number or an expression."));
    ExceptionInVPackage(paramR);
  }
  
  private JPanel ExceptionInVPackage(String paramString1, Component paramComponent, String paramString2) {
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(eJ.ExceptionInVPackage(5), eJ.ExceptionInVPackage(5)));
    JLabel jLabel = new JLabel(ExceptionPrintstacktrace.b(paramString1), 4);
    jPanel1.add(jLabel, "Center");
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(eJ.ExceptionInVPackage(5), eJ.ExceptionInVPackage(5)));
    jPanel2.add(paramComponent, "Center");
    if (paramString2 != null && !paramString2.isEmpty()) {
      cF cF = new cF(ExceptionPrintstacktrace.b(paramString2), ExceptionPrintstacktrace.d());
      jPanel2.add((Component)cF, "East");
    } 
    jPanel1.add(jPanel2, "East");
    return jPanel1;
  }
  
  public void ExceptionInVPackage(ah paramah) {
    this.n = paramah;
    this.ExceptionInVPackage.setText(paramah.aL());
    this.ExceptionInVPackage.setEnabled(false);
    this.b.setText(paramah.k().toString());
    this.c.setText(paramah.j().toString());
    this.l.setSelectedItem(paramah.p());
    this.k.setSelectedItem(paramah.i());
    this.d.setText(paramah.b().toString());
    this.e.setText(paramah.e().toString());
    this.f.setText(paramah.o().toString());
    this.ExceptionPrintstacktrace.setText(paramah.f().toString());
    this.h.setText(paramah.ExceptionPrintstacktrace().toString());
    this.i.setText(paramah.h().toString());
    this.j.setText(paramah.m().toString());
    this.o.b();
  }
  
  public ah ExceptionInVPackage() {
    if (this.n == null)
      this.n = new ah(); 
    this.n.v(this.ExceptionInVPackage.getText());
    this.n.c(this.b.getText());
    this.n.b(this.c.getText());
    this.n.d(this.l.getSelectedItem().toString());
    this.n.ExceptionInVPackage(this.k.getSelectedItem().toString());
    try {
      dj dj = dk.ExceptionInVPackage((aI)this.m, this.d.getText());
      i.ExceptionInVPackage(this.d.getText(), (aI)this.m);
      this.n.ExceptionInVPackage(dj);
      dj = dk.ExceptionInVPackage((aI)this.m, this.e.getText());
      i.ExceptionInVPackage(this.e.getText(), (aI)this.m);
      this.n.b(dj);
      dj = dk.ExceptionInVPackage((aI)this.m, this.f.getText());
      i.ExceptionInVPackage(this.f.getText(), (aI)this.m);
      this.n.h(dj);
      dj = dk.ExceptionInVPackage((aI)this.m, this.ExceptionPrintstacktrace.getText());
      i.ExceptionInVPackage(this.ExceptionPrintstacktrace.getText(), (aI)this.m);
      this.n.c(dj);
      dj = dk.ExceptionInVPackage((aI)this.m, this.h.getText());
      i.ExceptionInVPackage(this.h.getText(), (aI)this.m);
      this.n.d(dj);
      dj = dk.ExceptionInVPackage((aI)this.m, this.i.getText());
      i.ExceptionInVPackage(this.i.getText(), (aI)this.m);
      this.n.e(dj);
      dj = dk.ExceptionInVPackage((aI)this.m, this.j.getText());
      i.ExceptionInVPackage(this.j.getText(), (aI)this.m);
      this.n.f(dj);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      throw new ExceptionInVPackage(ExceptionPrintstacktrace.getMessage());
    } catch (ExceptionInAxPackage u) {
      throw new ExceptionInVPackage(u.getMessage());
    } 
    return this.n;
  }
  
  public void ExceptionInVPackage(String paramString) {
    boolean bool = false;
    for (byte b = 0; b < this.k.getItemCount(); b++) {
      if (this.k.getItemAt(b).equals(paramString)) {
        bool = true;
        break;
      } 
    } 
    if (!bool)
      this.k.addItem(paramString); 
    this.k.setSelectedItem(paramString);
  }
  
  public R b() {
    R r = new R();
    if (this.ExceptionInVPackage.getText().trim().isEmpty()) {
      r.c();
      r.ExceptionInVPackage("Name is required.");
      return r;
    } 
    if (this.ExceptionInVPackage.getText().trim().contains(" ")) {
      r.c();
      r.ExceptionInVPackage("Name cannot have white spaces.");
      return r;
    } 
    if (this.b.getText().trim().isEmpty()) {
      r.c();
      r.ExceptionInVPackage("Title is required.");
      return r;
    } 
    if (this.d.getText().trim().isEmpty()) {
      r.c();
      r.ExceptionInVPackage("Minimum is required.");
      return r;
    } 
    if (this.e.getText().trim().isEmpty()) {
      r.c();
      r.ExceptionInVPackage("Maximum is required.");
      return r;
    } 
    if (this.f.getText().trim().isEmpty()) {
      r.c();
      r.ExceptionInVPackage("Low Critical is required.");
      return r;
    } 
    if (this.ExceptionPrintstacktrace.getText().trim().isEmpty()) {
      r.c();
      r.ExceptionInVPackage("Low Warning is required.");
      return r;
    } 
    if (this.h.getText().trim().isEmpty()) {
      r.c();
      r.ExceptionInVPackage("High Warning is required.");
      return r;
    } 
    if (this.i.getText().trim().isEmpty()) {
      r.c();
      r.ExceptionInVPackage("High Critical is required.");
      return r;
    } 
    if (this.j.getText().trim().isEmpty()) {
      r.c();
      r.ExceptionInVPackage("Digits is required.");
      return r;
    } 
    try {
      i.ExceptionInVPackage(this.d.getText(), (aI)this.m);
      i.ExceptionInVPackage(this.e.getText(), (aI)this.m);
      i.ExceptionInVPackage(this.f.getText(), (aI)this.m);
      i.ExceptionInVPackage(this.ExceptionPrintstacktrace.getText(), (aI)this.m);
      i.ExceptionInVPackage(this.h.getText(), (aI)this.m);
      i.ExceptionInVPackage(this.i.getText(), (aI)this.m);
      i.ExceptionInVPackage(this.j.getText(), (aI)this.m);
    } catch (ExceptionInAxPackage u) {
      r.c();
      r.ExceptionInVPackage(u.getMessage());
      return r;
    } 
    r.b();
    return r;
  }
  
  public void ExceptionInVPackage(R paramR) {
    this.m = paramR;
    this.k.removeAllItems();
    String[] arrayOfString = paramR.s();
    arrayOfString = S.ExceptionInVPackage(arrayOfString);
    for (String str : arrayOfString) {
      if (!str.contains(" "))
        this.k.addItem(str); 
    } 
    ArrayList<String> arrayList = new ArrayList();
    arrayList.add("");
    arrayList.add(p);
    null = paramR.B();
    while (null.hasNext()) {
      ah ah1 = null.next();
      if (ah1.p() != null && !arrayList.contains(ah1.p()))
        arrayList.add(ah1.p()); 
    } 
    S.b(arrayList);
    this.l.removeAllItems();
    for (String str : arrayList)
      this.l.addItem(str); 
  }
  
  private void d() {
    while (true) {
      String str = bV.ExceptionInVPackage(this, false, ExceptionPrintstacktrace.b("New Category Name, No special characters") + ": ", "");
      if (str == null || str.isEmpty()) {
        this.l.setSelectedItem("");
        return;
      } 
      if (!i.ExceptionInVPackage(str, this.q)) {
        this.l.addItem(str);
        this.l.setSelectedItem(str);
        return;
      } 
    } 
  }
  
  public boolean c() {
    return this.o.ExceptionInVPackage();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */