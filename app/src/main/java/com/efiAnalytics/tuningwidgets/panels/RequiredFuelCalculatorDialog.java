package com.efiAnalytics.tuningwidgets.panels;

import G.Manager;
import G.R;
import V.ExceptionExtensionGetmessage;
import V.ExceptionPrintstacktrace;
import bH.X;
import bt.BtInterfaceBz;
import com.efiAnalytics.ui.NumericTextField;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.et;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import s.ExceptionPrintstacktrace;

public class RequiredFuelCalculatorDialog extends JDialog {
  DisplacementUnitField a = new DisplacementUnitField(this);

  NumericTextField b = new NumericTextField();

  InjectorFlowUnitField c = new InjectorFlowUnitField(this);

  NumericTextField d = new NumericTextField();

  JRadioButton e = null;

  JRadioButton f = null;

  JRadioButton ExceptionPrintstacktrace = null;

  private BtInterfaceBz ExceptionExtensionGetmessage = null;

  private et k = null;

  R h = null;

  boolean i = false;

  public RequiredFuelCalculatorDialog(
      Window paramWindow, R paramR, et paramet, BtInterfaceBz parambZ) {
    super(paramWindow, ExceptionPrintstacktrace.b("Required Fuel Calculator"));
    this.k = paramet;
    this.h = paramR;
    JPanel jPanel1 = new JPanel();
    setLayout(new BorderLayout());
    add("Center", jPanel1);
    jPanel1.setBorder(
        BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Required Fuel Calculator")));
    jPanel1.setLayout(new BorderLayout(10, 10));
    a(parambZ);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("East", c());
    jPanel2.add("Center", b());
    jPanel1.add("Center", jPanel2);
    jPanel1.add("South", h());
    boolean bool1 = b("displacementUnits", "CID").equals("CID");
    if (bool1) {
      d();
    } else if (!this.i) {
      e();
    }
    boolean bool2 = b("injectorUnits", "lb/hr").equals("lb/hr");
    if (bool2) {
      ExceptionPrintstacktrace();
    } else if (!this.i) {
      f();
    }
    pack();
    setResizable(false);
    setAlwaysOnTop(true);
  }

  private JPanel b() {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(4, 2, 5, 5));
    jPanel.add(new JLabel(ExceptionPrintstacktrace.b("Engine Displacement")));
    jPanel.add((Component) this.a);
    String str = "enginesize";
    if (this.h.c(str) != null) {
      Manager Manager = this.h.c(str);
      this.a.setText(Manager.e(this.h.p()));
      this.i = true;
      this.a.a = true;
    } else {
      this.a.a = this.f.isSelected();
      this.a.setText(b("displacement", "350"));
    }
    jPanel.add(new JLabel(ExceptionPrintstacktrace.b("Number of Cylinders")));
    jPanel.add((Component) this.b);
    str = "nCylinders";
    if (this.h.c(str) != null) {
      Manager Manager = this.h.c(str);
      this.b.setText(Manager.e(this.h.p()));
    } else {
      this.b.setText(b("nCylinders", "8"));
    }
    jPanel.add(new JLabel(ExceptionPrintstacktrace.b("Injector Flow")));
    jPanel.add((Component) this.c);
    str = "staged_pri_size";
    if (this.h.c(str) != null) {
      Manager Manager = this.h.c(str);
      this.c.setText(Manager.e(this.h.p()));
      this.i = true;
      this.c.a = true;
    } else {
      this.c.a = this.ExceptionPrintstacktrace.isSelected();
      this.c.setText(b("injectorFlow", "30"));
    }
    jPanel.add(new JLabel(ExceptionPrintstacktrace.b("Air-Fuel Ratio")));
    jPanel.add((Component) this.d);
    str = "stoich";
    if (this.h.c(str) != null) {
      Manager Manager = this.h.c(str);
      this.d.setText(Manager.e(this.h.p()));
    } else {
      this.d.setText(b("afr", "14.7"));
    }
    return jPanel;
  }

  private JPanel c() {
    JPanel jPanel = new JPanel();
    jPanel.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Units")));
    boolean bool1 = (!this.i && b("displacementUnits", "CID").equals("CID")) ? true : false;
    jPanel.setLayout(new GridLayout(0, 2));
    ButtonGroup buttonGroup = new ButtonGroup();
    this.e = new JRadioButton(ExceptionPrintstacktrace.b("CID"));
    buttonGroup.add(this.e);
    this.e.addActionListener(new ao(this));
    this.e.setSelected(bool1);
    jPanel.add(this.e);
    this.f = new JRadioButton(ExceptionPrintstacktrace.b("CC"));
    buttonGroup.add(this.f);
    this.f.addActionListener(new ap(this));
    this.f.setSelected(!bool1);
    jPanel.add(this.f);
    buttonGroup = new ButtonGroup();
    JRadioButton jRadioButton = new JRadioButton(ExceptionPrintstacktrace.b("lb/hr"));
    buttonGroup.add(jRadioButton);
    jRadioButton.addActionListener(new aq(this));
    boolean bool2 = (!this.i && b("injectorUnits", "lb/hr").equals("lb/hr")) ? true : false;
    jRadioButton.setSelected(bool2);
    jPanel.add(jRadioButton);
    this.ExceptionPrintstacktrace = new JRadioButton(ExceptionPrintstacktrace.b("cc/min"));
    buttonGroup.add(this.ExceptionPrintstacktrace);
    this.ExceptionPrintstacktrace.addActionListener(new ar(this));
    this.ExceptionPrintstacktrace.setSelected(!bool2);
    jPanel.add(this.ExceptionPrintstacktrace);
    return jPanel;
  }

  private void d() {
    a("displacementUnits", "CID");
    this.a.b();
  }

  private void e() {
    a("displacementUnits", "CC");
    this.a.a();
  }

  private void f() {
    this.c.a();
    a("injectorUnits", "cc/min");
  }

  private void ExceptionPrintstacktrace() {
    a("injectorUnits", "lb/hr");
    this.c.b();
  }

  private JPanel h() {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    JButton jButton2 = new JButton(ExceptionPrintstacktrace.b("Cancel"));
    jButton2.addActionListener(new as(this));
    JButton jButton1 = new JButton(ExceptionPrintstacktrace.b("Ok"));
    jButton1.addActionListener(new at(this));
    if (bV.d()) {
      jPanel.add(jButton1);
      jPanel.add(jButton2);
    } else {
      jPanel.add(jButton2);
      jPanel.add(jButton1);
    }
    return jPanel;
  }

  public boolean a() {
    a("displacement", this.a.getText());
    a("nCylinders", this.b.getText());
    a("injectorFlow", this.c.getText());
    a("afr", this.d.getText());
    double d1 = 0.0D;
    double d2 = b("displacementUnits", "CID").equals("CID") ? 1.0D : 16.38706D;
    double d3 = b("injectorUnits", "lb/hr").equals("lb/hr") ? 1.0D : 10.5D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    int i = 0;
    d4 = Double.parseDouble(this.a.getText());
    d4 /= d2;
    if (d4 <= 0.0D) {
      bV.d(ExceptionPrintstacktrace.b("Displacement must be a positive number."), this);
      return false;
    }
    d5 = Double.parseDouble(this.c.getText());
    d5 /= d3;
    if (d5 <= 0.0D) {
      bV.d(ExceptionPrintstacktrace.b("Injector Flow must be a positive number."), this);
      return false;
    }
    d6 = Double.parseDouble(this.d.getText());
    if (d6 <= 0.0D) {
      bV.d(ExceptionPrintstacktrace.b("AFR must be a positive number."), this);
      return false;
    }
    i = Integer.parseInt(this.b.getText());
    if (i <= 0) {
      bV.d(
          ExceptionPrintstacktrace.b("Number of Cylinders must be a positive whole number."), this);
      return false;
    }
    double d7 = 3.6E7D;
    double d8 = 4.27793E-5D;
    double d9 = d7 * d4 * d8;
    double d10 = i * d6 * d5;
    d1 = d9 / d10 / 10.0D;
    String str = "enginesize";
    if (this.h.c(str) != null) {
      Manager Manager = this.h.c(str);
      try {
        Manager.a(this.h.h(), d4 * 16.38706D);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(an.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
        Logger.getLogger(an.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionExtensionGetmessage);
      }
    }
    str = "nCylinders";
    if (this.h.c(str) != null) {
      Manager Manager = this.h.c(str);
      try {
        Manager.a(this.h.h(), i);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(an.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
        Logger.getLogger(an.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionExtensionGetmessage);
      }
    }
    str = "staged_pri_size";
    if (this.h.c(str) != null) {
      Manager Manager = this.h.c(str);
      try {
        Manager.a(this.h.h(), d5 * 10.5D);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(an.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
        Logger.getLogger(an.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionExtensionGetmessage);
      }
    }
    str = "stoich";
    if (this.h.c(str) != null) {
      Manager Manager = this.h.c(str);
      try {
        Manager.a(this.h.h(), d6);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(an.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
        Logger.getLogger(an.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionExtensionGetmessage);
      }
    }
    this.ExceptionExtensionGetmessage.b(X.b(d1, 1));
    dispose();
    return true;
  }

  private void a(String paramString1, String paramString2) {
    if (this.k == null) return;
    this.k.a(paramString1, paramString2);
  }

  private String b(String paramString1, String paramString2) {
    if (this.k == null) return paramString2;
    String str = this.k.a(paramString1);
    return (str == null || str.equals("")) ? paramString2 : str;
  }

  public void a(BtInterfaceBz parambZ) {
    this.ExceptionExtensionGetmessage = parambZ;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
