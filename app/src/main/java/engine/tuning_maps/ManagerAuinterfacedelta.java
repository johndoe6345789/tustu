package aP;

import G.AeInterfaceMikeTostring;
import G.GComponentCq;
import G.GInterfaceAg;
import G.Manager;
import G.ManagerUsingArrayList;
import G.ManagerUsingConcurrentHashMap;
import G.R;
import G.SerializableImpl;
import V.ExceptionInVPackage;
import aU.AuInterfaceDelta;
import aU.AuInterfaceEcho;
import bH.D;
import bH.X;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.dM;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import s.SComponentGolf;

public class ManagerAuinterfacedelta extends JPanel implements GInterfaceAg, GComponentCq, bc {
  JDialog ExceptionInVPackage = null;

  JTextField b = new JTextField("", 4);

  JTextField c = new JTextField("", 4);

  dM AuInterfaceDelta = new dM();

  private R l = null;

  private String m = "0";

  int AuInterfaceEcho = 255;

  int f = -1;

  int SComponentGolf = -1;

  JButton h;

  JButton i;

  aL j = null;

  aK k = null;

  public ManagerAuinterfacedelta() {
    setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Calibrate Throttle")));
    FlowLayout flowLayout = new FlowLayout(2);
    flowLayout.setHgap(10);
    setLayout(new BoxLayout(this, 1));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(flowLayout);
    JLabel jLabel = new JLabel(SComponentGolf.b("Closed throttle ADC count"));
    jLabel.setMinimumSize(new Dimension(180, 20));
    jPanel1.add(jLabel);
    jPanel1.add(this.b);
    jPanel1.add(this.h = b("min"));
    add(jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(flowLayout);
    jLabel = new JLabel(SComponentGolf.b("Full throttle ADC count"));
    jLabel.setMinimumSize(new Dimension(180, 20));
    jPanel2.add(jLabel);
    jPanel2.add(this.c);
    jPanel2.add(this.i = b("max"));
    add(jPanel2);
    this.AuInterfaceDelta.ExceptionInVPackage(0.0D);
    add((Component) this.AuInterfaceDelta);
  }

  private JButton b(String paramString) {
    JButton jButton = new JButton(SComponentGolf.b("Get Current"));
    jButton.setActionCommand(paramString);
    jButton.addActionListener(new SerializableImpl(this));
    return jButton;
  }

  private void ExceptionInVPackage(boolean paramBoolean) {
    if (this.l != null) {
      this.h.setEnabled(paramBoolean);
      this.i.setEnabled(paramBoolean);
      this.b.setEditable(paramBoolean);
      this.c.setEditable(paramBoolean);
      if (!paramBoolean) {
        this.b.setToolTipText("Must Go online to edit.");
        this.c.setToolTipText("Must Go online to edit.");
      } else {
        this.b.setToolTipText((String) null);
        this.c.setToolTipText((String) null);
      }
    }
  }

  public String ExceptionInVPackage() {
    if (b() == null || !b().C().q()) bV.AuInterfaceDelta("Connection unavailable.", this);
    return this.m;
  }

  public R b() {
    return this.l;
  }

  public void ExceptionInVPackage(R paramR) {
    this.l = paramR;
    String str = paramR.c();
    ManagerUsingArrayList ManagerUsingArrayList = ManagerUsingArrayList.ExceptionInVPackage();
    ManagerUsingArrayList.ExceptionInVPackage(this);
    try {
      ManagerUsingArrayList.ExceptionInVPackage(str, paramR.G().ExceptionInVPackage(), this);
    } catch (Exception exception) {
      bV.AuInterfaceDelta(
          "Unable to register TP ADC OutputChannel " + paramR.G().ExceptionInVPackage(), this);
    }
    try {
      SerializableImpl SerializableImpl = paramR.SComponentGolf(paramR.G().ExceptionInVPackage());
      this.AuInterfaceEcho = (int) SerializableImpl.m();
      String str1 = paramR.G().b();
      String str2 = paramR.G().c();
      Manager aM1 = paramR.c(str1);
      Manager aM2 = paramR.c(str2);
      if (aM2 != null) this.AuInterfaceEcho = (int) aM2.s();
      if (aM1 != null && aM2 != null) {
        this.f = (int) aM1.j(paramR.h());
        this.b.setText("" + this.f);
        this.SComponentGolf = (int) aM2.j(paramR.h());
        this.c.setText("" + this.SComponentGolf);
        if (SerializableImpl.k() != null && !SerializableImpl.k().equals("")) {
          aM1.ExceptionInVPackage(paramR.p(), 0.0D);
          aM2.ExceptionInVPackage(paramR.p(), 1023.0D);
          paramR.I();
        }
        this.j = new aL(this);
        ManagerUsingConcurrentHashMap.ExceptionInVPackage()
            .ExceptionInVPackage(paramR.c(), str1, this.j);
        this.k = new aK(this);
        ManagerUsingConcurrentHashMap.ExceptionInVPackage()
            .ExceptionInVPackage(paramR.c(), str2, this.k);
      }
      ExceptionInVPackage(paramR.R());
      paramR.C().ExceptionInVPackage(this);
    } catch (Exception exception) {
      D.c("Unable to get Max tp ADC, using default:" + this.AuInterfaceEcho);
    }
  }

  public void c() {
    if (b() == null) {
      bV.AuInterfaceDelta("No EcuConfiguration set. Can not save calibration.", this);
      return;
    }
    AuInterfaceDelta AuInterfaceDelta = AuInterfaceEcho.ExceptionInVPackage(this.l);
    if (AuInterfaceDelta == null) {
      bV.AuInterfaceDelta("No Throttle Calibration Writer set. Can not save calibration.", this);
      return;
    }
    int i = Integer.parseInt(this.b.getText());
    int j = Integer.parseInt(this.c.getText());
    AuInterfaceDelta.ExceptionInVPackage(this.l, i, j);
  }

  public boolean AuInterfaceDelta() {
    String str = "";
    try {
      int i = Integer.parseInt(this.c.getText());
      int j = Integer.parseInt(this.b.getText());
      if (j == i) {
        str = str + SComponentGolf.b("Min and Max can not be the same!") + "\n";
      } else if (j > i
          && str.length() == 0
          && !bV.ExceptionInVPackage(
              SComponentGolf.b("Min is greater than than Max!")
                  + "\n"
                  + SComponentGolf.b("Are you sure you want to use these values?"),
              this,
              true)) {
        return false;
      }
      if (j < 0) str = str + SComponentGolf.b("Min should be greater than 0!") + "\n";
      if (i > this.AuInterfaceEcho)
        str = str + "Max ADC should not be more than " + this.AuInterfaceEcho + "!\n";
    } catch (NumberFormatException numberFormatException) {
      bV.AuInterfaceDelta(SComponentGolf.b("TP ADC Min and Max must be numeric!"), this);
      return false;
    }
    if (!str.equals("")) {
      bV.AuInterfaceDelta(str, this);
      return false;
    }
    return true;
  }

  public boolean AuInterfaceEcho() {
    if (AuInterfaceDelta()) {
      try {
        c();
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        D.ExceptionInVPackage(
            "Unable to save Throttle Calibration.", (Exception) ExceptionInVPackage, this);
      }
    } else {
      return false;
    }
    ManagerUsingArrayList ManagerUsingArrayList = ManagerUsingArrayList.ExceptionInVPackage();
    ManagerUsingArrayList.ExceptionInVPackage(this);
    return true;
  }

  public void close() {
    if (this.ExceptionInVPackage != null) {
      this.ExceptionInVPackage.dispose();
    } else {
      AuInterfaceEcho();
    }
    if (this.j != null) {
      ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(this.j);
      this.j = null;
    }
    if (this.k != null) {
      ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(this.k);
      this.k = null;
    }
    if (this.l != null) this.l.C().b(this);
  }

  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    this.AuInterfaceDelta.ExceptionInVPackage(paramDouble / this.AuInterfaceEcho);
    this.m = X.b(paramDouble, 0);
  }

  public void ExceptionInVPackage(Component paramComponent) {
    this.ExceptionInVPackage =
        new JDialog(
            bV.ExceptionInVPackage(paramComponent),
            SComponentGolf.b("Calibrate Throttle Position Sensor"));
    this.ExceptionInVPackage.add("Center", this);
    JButton jButton1 = new JButton(SComponentGolf.b("Cancel"));
    jButton1.addActionListener(new aI(this));
    JButton jButton2 = new JButton(SComponentGolf.b("Accept"));
    jButton2.addActionListener(new aJ(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    if (bV.AuInterfaceDelta()) {
      jPanel.add(jButton2);
      jPanel.add(jButton1);
    } else {
      jPanel.add(jButton1);
      jPanel.add(jButton2);
    }
    this.ExceptionInVPackage.add("South", jPanel);
    this.ExceptionInVPackage.pack();
    bV.ExceptionInVPackage(bV.ExceptionInVPackage(paramComponent), this.ExceptionInVPackage);
    this.ExceptionInVPackage.setVisible(true);
    validate();
    this.ExceptionInVPackage.pack();
    this.ExceptionInVPackage.setResizable(false);
  }

  public boolean ExceptionInVPackage(String paramString, AeInterfaceMikeTostring parambT) {
    ExceptionInVPackage(true);
    return true;
  }

  public void ExceptionInVPackage(String paramString) {
    ExceptionInVPackage(false);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/GInterfaceAg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
