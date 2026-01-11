package com.efiAnalytics.tuningwidgets.panels;

import W.j;
import com.efiAnalytics.ui.bq;
import com.efiAnalytics.ui.et;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;

public class I {
  private et b = null;
  
  List a = new ArrayList();
  
  public bq a(bq parambq, j paramj, Component paramComponent) {
    int i = Integer.parseInt(this.b.b("fieldSmoothingFactor_" + paramj.a(), "0"));
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Field Smoothing (" + paramj.s() + ")", (i > 0));
    jCheckBoxMenuItem.addActionListener(new J(this, paramj, paramComponent));
    parambq.add(jCheckBoxMenuItem);
    JMenuItem jMenuItem = new JMenuItem("Smoothing Factor");
    jMenuItem.setEnabled((i > 0));
    jMenuItem.addActionListener(new K(this, paramj, paramComponent));
    parambq.add(jMenuItem);
    return parambq;
  }
  
  public void a(j paramj, int paramInt) {
    this.b.a("fieldSmoothingFactor_" + paramj.a(), Integer.toString(paramInt));
    paramj.b(true);
    paramj.g(paramInt);
    c(paramj.a());
  }
  
  public void a(j paramj) {
    this.b.a("fieldSmoothingFactor_" + paramj.a(), "0");
    paramj.b(false);
    c(paramj.a());
  }
  
  public boolean a(String paramString) {
    return (Integer.parseInt(this.b.b("fieldSmoothingFactor_" + paramString, "0")) > 0);
  }
  
  public int b(String paramString) {
    return Integer.parseInt(this.b.b("fieldSmoothingFactor_" + paramString, "0"));
  }
  
  public void a(et paramet) {
    this.b = paramet;
  }
  
  public void a(L paramL) {
    this.a.add(paramL);
  }
  
  private void c(String paramString) {
    for (L l : this.a)
      l.a(paramString); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */