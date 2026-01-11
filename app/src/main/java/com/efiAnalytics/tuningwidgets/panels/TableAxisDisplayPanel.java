package com.efiAnalytics.tuningwidgets.panels;

import G.R;
import G.Manager;
import G.CloneableImpl;
import G.GComponentCq;
import G.ManagerUsingArrayList;
import V.ExceptionInVPackage;
import bH.D;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fF;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.s;
import com.efiAnalytics.ui.w;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class TableAxisDisplayPanel extends JPanel implements GComponentCq, bc, TableModelListener {
  R ExceptionInVPackage = null;
  
  Manager b = null;
  
  Manager c = null;
  
  fF d = null;
  
  double e = Double.NaN;
  
  w f = null;
  
  JLabel g = null;
  
  String h = null;
  
  String i = null;
  
  s j = null;
  
  public aP(R paramR, s params, String paramString) {
    this.ExceptionInVPackage = paramR;
    this.j = params;
    setLayout(new BorderLayout());
    this.f = new w();
    this.f.setName(params.z());
    CloneableImpl CloneableImpl = null;
    if (paramR != null && paramString != null && !paramString.equals("")) {
      CloneableImpl = (CloneableImpl)paramR.e().c(paramString);
      this.b = paramR.c(CloneableImpl.b());
      this.c = paramR.c(CloneableImpl.ExceptionInVPackage());
      this.h = CloneableImpl.f();
      this.i = CloneableImpl.d();
    } 
    params.addTableModelListener(this);
    int i = fh.ExceptionInVPackage(params);
    this.f.h().ExceptionInVPackage(i);
    if (this.b != null)
      this.f.b(this.b.v()); 
    this.f.ExceptionInVPackage(params);
    int j = eJ.ExceptionInVPackage();
    this.f.c(j);
    this.f.ExceptionInVPackage(false);
    setBorder(BorderFactory.createTitledBorder(""));
    add("Center", (Component)this.f);
    this.g = new JLabel();
    this.g.setHorizontalAlignment(0);
    add("South", this.g);
    this.d = new fF();
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("Center", (Component)this.d);
    add("West", jPanel);
    if (params.w() != null)
      this.g.setText(this.i); 
    if (params.v() != null) {
      String str;
      if (this.b != null) {
        str = this.h;
        if (this.b.p() != null && !this.b.p().equals(""))
          str = str + " " + this.b.p(); 
      } else if (params.v() != null) {
        str = params.v();
      } else {
        str = "";
      } 
      this.d.setText(str);
    } 
    if (paramR != null)
      try {
        ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(paramR.c(), CloneableImpl.f(), this);
        ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(paramR.c(), CloneableImpl.d(), this);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        D.ExceptionInVPackage("Unable to subscribe x or y axis for hightlights.", (Exception)ExceptionInVPackage, this);
      }  
  }
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {}
  
  public void close() {
    this.j.removeTableModelListener(this);
    ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this);
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (paramString.equals(this.h)) {
      this.e = paramDouble;
    } else if (paramString.equals(this.i) && this.e != Double.NaN) {
      this.f.h().ExceptionInVPackage(this.e + "", paramDouble + "");
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/aP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */