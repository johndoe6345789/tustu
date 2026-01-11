package com.efiAnalytics.apps.ts.tuningViews.tuneComps;

import G.R;
import G.T;
import G.Manager;
import G.ExceptionprintstacktraceInGPackage;
import G.CloneableImpl;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.ManagerUsingArrayList;
import V.ExceptionInVPackage;
import bH.X;
import bt.Q;
import bt.ManagerBfcomponentcharlie;
import com.efiAnalytics.apps.ts.dashboard.t;
import com.efiAnalytics.apps.ts.tuningViews.TuneViewComponent;
import com.efiAnalytics.apps.ts.tuningViews.h;
import com.efiAnalytics.ui.aR;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.dD;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.s;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.SComponentGolf;

public class TableCellCrossHair extends TuneViewComponent implements t {
  aR c = new aR();
  
  JButton d = new JButton(SComponentGolf.b("Select Table To Track"));
  
  JPanel e = new JPanel();
  
  JPanel f = new JPanel();
  
  JLabel SComponentGolf = new JLabel("");
  
  private String r = null;
  
  R h = null;
  
  s i = null;
  
  private int s = 1;
  
  i j = new i(this);
  
  String k = null;
  
  String l = null;
  
  dD m = new dD((Component)this.c);
  
  int n = -1;
  
  int o = -1;
  
  int p = -1;
  
  boolean q = true;
  
  public TableCellCrossHair() {
    setLayout((LayoutManager)new h(this));
    setDoubleBuffered(true);
    this.e.setLayout(new FlowLayout(2));
    this.e.add(this.SComponentGolf);
    this.e.add(this.d);
    this.d.addActionListener(new SComponentGolf(this));
    addEditComponent(this.d);
    this.d.setPreferredSize(eJ.ExceptionInVPackage(150, 16));
    this.f.setLayout(new BorderLayout());
  }
  
  private void showSelectPopup(int paramInt1, int paramInt2) {
    R r = getEcuConfiguration();
    Q q = new Q(r, this.s);
    h h = new h(this);
    q.ExceptionInVPackage(h);
    this.e.add((Component)q);
    q.show((Component)this, paramInt1, paramInt2);
  }
  
  private void setSelectedTable(String paramString) {
    R r = getEcuConfiguration();
    ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = r.e().c(paramString);
    ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.j);
    if (ArrayListExceptionprintstacktraceInGPackage != null) {
      this.r = paramString;
      try {
        this.i = ManagerBfcomponentcharlie.ExceptionInVPackage().ExceptionInVPackage(r, paramString);
        if (this.i == null)
          throw new ExceptionInVPackage("Unknown Table: " + paramString); 
        this.SComponentGolf.setText(ExceptionprintstacktraceInGPackage.c(r, paramString));
        CloneableImpl CloneableImpl = (CloneableImpl)r.e().c(paramString);
        this.k = CloneableImpl.d();
        this.l = CloneableImpl.f();
        ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(r.c(), this.k, this.j);
        ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(r.c(), this.l, this.j);
        Manager Manager = r.c(CloneableImpl.c());
        this.p = Manager.v();
        setClean(false);
        double d = this.i.d(0, 0).doubleValue();
        this.c.ExceptionInVPackage(X.b(d, this.p));
        if (this.i.A() == Double.MAX_VALUE)
          this.i.C(); 
        Color color = fh.ExceptionInVPackage(d, this.i.A(), this.i.B());
        this.c.ExceptionInVPackage(color);
        this.c.repaint();
      } catch (Exception exception) {
        Logger.getLogger(TableCellCrossHair.class.getName()).log(Level.SEVERE, (String)null, exception);
        throw new ExceptionInVPackage("Unable to load table: " + paramString);
      } 
    } else {
      close();
      this.i = null;
      this.c.ExceptionInVPackage();
      this.SComponentGolf.setText("");
    } 
  }
  
  public void setSelectedTableName(String paramString) {
    this.r = paramString;
  }
  
  public String getSelectedTableName() {
    return this.r;
  }
  
  public void initializeComponents() {
    add("Center", this.f);
    this.f.add("Center", (Component)this.c);
    if (this.r != null && !this.r.isEmpty())
      try {
        setSelectedTable(this.r);
        setClean(true);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        bV.d(ExceptionInVPackage.getMessage(), (Component)this);
      }  
  }
  
  public void close() {
    ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.j);
  }
  
  public boolean isDirty() {
    return !this.q;
  }
  
  public void setClean(boolean paramBoolean) {
    this.q = paramBoolean;
  }
  
  public void enableEditMode(boolean paramBoolean) {
    super.enableEditMode(paramBoolean);
    this.e.setLayout(new FlowLayout(2));
    if (paramBoolean) {
      this.f.add("North", this.e);
      this.q = false;
    } else {
      this.f.remove(this.e);
    } 
    doLayout();
    validate();
  }
  
  public void setEcuConfigurationName(String paramString) {
    String str = getEcuConfigurationName();
    super.setEcuConfigurationName(paramString);
    if (paramString == null || paramString.isEmpty()) {
      this.h = T.ExceptionInVPackage().c();
    } else {
      this.h = T.ExceptionInVPackage().c(paramString);
    } 
    super.setEcuConfigurationName(paramString);
    if (!str.equals(paramString))
      try {
        setSelectedTable(this.r);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        Logger.getLogger(TableCellCrossHair.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
      }  
  }
  
  public R getEcuConfiguration() {
    if (this.h == null) {
      String str = getEcuConfigurationName();
      if (str == null || str.isEmpty()) {
        this.h = T.ExceptionInVPackage().c();
      } else {
        this.h = T.ExceptionInVPackage().c(str);
      } 
    } 
    return this.h;
  }
  
  private void setXValues(double paramDouble) {
    double d2;
    double d3;
    double d4;
    double d1 = fh.b(this.i.b(), paramDouble);
    if (d1 >= ((this.i.b()).length - 2)) {
      double d = (Double.parseDouble(this.i.b()[(this.i.b()).length - 1]) - Double.parseDouble(this.i.b()[(this.i.b()).length - 2])) / 2.0D;
      d3 = Double.parseDouble(this.i.b()[(this.i.b()).length - 1]) + d;
      d2 = Double.parseDouble(this.i.b()[(this.i.b()).length - 1]) - d;
      this.o = Math.round((float)d1);
      d4 = Double.parseDouble(this.i.b()[this.o]);
    } else if (d1 <= 1.0D) {
      double d = (Double.parseDouble(this.i.b()[1]) - Double.parseDouble(this.i.b()[0])) / 2.0D;
      d3 = Double.parseDouble(this.i.b()[0]) + d;
      d2 = Double.parseDouble(this.i.b()[0]) - d;
      this.o = Math.round((float)d1);
      d4 = Double.parseDouble(this.i.b()[this.o]);
    } else if (d1 == Math.floor(d1)) {
      this.o = (int)Math.floor(d1);
      d4 = Double.parseDouble(this.i.b()[this.o]);
      double d5 = Double.parseDouble(this.i.b()[(int)Math.floor(d1) - 1]) / 2.0D;
      double d6 = Double.parseDouble(this.i.b()[(int)Math.floor(d1) + 1]) / 2.0D;
      d3 = d4 + d6;
      d2 = d4 - d5;
    } else {
      int j;
      if (d1 - Math.floor(d1) > 0.5D) {
        j = (int)(Math.floor(d1) + 1.0D);
      } else {
        j = (int)Math.floor(d1);
      } 
      this.o = (int)Math.floor(j);
      d4 = Double.parseDouble(this.i.b()[this.o]);
      double d5 = (Double.parseDouble(this.i.b()[(int)Math.floor(j) + 1]) - d4) / 2.0D;
      double d6 = (d4 - Double.parseDouble(this.i.b()[(int)Math.floor(j) - 1])) / 2.0D;
      d3 = d4 + d5;
      d2 = d4 - d6;
    } 
    this.c.b(d3);
    this.c.ExceptionInVPackage(d2);
    this.c.SComponentGolf(d4);
    this.c.e(paramDouble);
  }
  
  private void setYValues(double paramDouble) {
    double d2;
    double d3;
    double d4;
    double d1 = fh.ExceptionInVPackage(this.i.ExceptionInVPackage(), paramDouble);
    if (d1 >= ((this.i.ExceptionInVPackage()).length - 2)) {
      double d = (Double.parseDouble(this.i.ExceptionInVPackage()[(this.i.ExceptionInVPackage()).length - 2]) - Double.parseDouble(this.i.ExceptionInVPackage()[(this.i.ExceptionInVPackage()).length - 1])) / 2.0D;
      d3 = Double.parseDouble(this.i.ExceptionInVPackage()[(this.i.ExceptionInVPackage()).length - 1]) + d;
      d2 = Double.parseDouble(this.i.ExceptionInVPackage()[(this.i.ExceptionInVPackage()).length - 1]) - d;
      this.n = Math.round((float)d1);
      d4 = Double.parseDouble(this.i.ExceptionInVPackage()[this.n]);
    } else if (d1 <= 1.0D) {
      double d = (Double.parseDouble(this.i.ExceptionInVPackage()[0]) - Double.parseDouble(this.i.ExceptionInVPackage()[1])) / 2.0D;
      d3 = Double.parseDouble(this.i.ExceptionInVPackage()[0]) + d;
      d2 = Double.parseDouble(this.i.ExceptionInVPackage()[0]) - d;
      this.n = Math.round((float)d1);
      d4 = Double.parseDouble(this.i.ExceptionInVPackage()[this.n]);
    } else if (d1 == Math.floor(d1)) {
      this.n = (int)Math.floor(d1);
      d4 = Double.parseDouble(this.i.ExceptionInVPackage()[this.n]);
      double d5 = Double.parseDouble(this.i.ExceptionInVPackage()[(int)Math.floor(d1) + 1]) / 2.0D;
      double d6 = Double.parseDouble(this.i.ExceptionInVPackage()[(int)Math.floor(d1) - 1]) / 2.0D;
      d3 = d4 + d6;
      d2 = d4 - d5;
    } else {
      int j;
      if (d1 - Math.floor(d1) > 0.5D) {
        j = (int)(Math.floor(d1) + 1.0D);
      } else {
        j = (int)Math.floor(d1);
      } 
      this.n = (int)Math.floor(j);
      d4 = Double.parseDouble(this.i.ExceptionInVPackage()[this.n]);
      double d5 = (d4 - Double.parseDouble(this.i.ExceptionInVPackage()[(int)Math.floor(j) + 1])) / 2.0D;
      double d6 = (Double.parseDouble(this.i.ExceptionInVPackage()[(int)Math.floor(j) - 1]) - d4) / 2.0D;
      d3 = d4 + d6;
      d2 = d4 - d5;
    } 
    this.c.d(d3);
    this.c.c(d2);
    this.c.h(d4);
    this.c.f(paramDouble);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/tuneComps/TableCellCrossHair.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */