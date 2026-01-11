package aP;

import G.R;
import G.aG;
import G.aH;
import G.aM;
import G.aR;
import G.bT;
import G.cq;
import G.cu;
import V.a;
import aU.d;
import aU.e;
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
import s.g;

public class aG extends JPanel implements aG, cq, bc {
  JDialog a = null;
  
  JTextField b = new JTextField("", 4);
  
  JTextField c = new JTextField("", 4);
  
  dM d = new dM();
  
  private R l = null;
  
  private String m = "0";
  
  int e = 255;
  
  int f = -1;
  
  int g = -1;
  
  JButton h;
  
  JButton i;
  
  aL j = null;
  
  aK k = null;
  
  public aG() {
    setBorder(BorderFactory.createTitledBorder(g.b("Calibrate Throttle")));
    FlowLayout flowLayout = new FlowLayout(2);
    flowLayout.setHgap(10);
    setLayout(new BoxLayout(this, 1));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(flowLayout);
    JLabel jLabel = new JLabel(g.b("Closed throttle ADC count"));
    jLabel.setMinimumSize(new Dimension(180, 20));
    jPanel1.add(jLabel);
    jPanel1.add(this.b);
    jPanel1.add(this.h = b("min"));
    add(jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(flowLayout);
    jLabel = new JLabel(g.b("Full throttle ADC count"));
    jLabel.setMinimumSize(new Dimension(180, 20));
    jPanel2.add(jLabel);
    jPanel2.add(this.c);
    jPanel2.add(this.i = b("max"));
    add(jPanel2);
    this.d.a(0.0D);
    add((Component)this.d);
  }
  
  private JButton b(String paramString) {
    JButton jButton = new JButton(g.b("Get Current"));
    jButton.setActionCommand(paramString);
    jButton.addActionListener(new aH(this));
    return jButton;
  }
  
  private void a(boolean paramBoolean) {
    if (this.l != null) {
      this.h.setEnabled(paramBoolean);
      this.i.setEnabled(paramBoolean);
      this.b.setEditable(paramBoolean);
      this.c.setEditable(paramBoolean);
      if (!paramBoolean) {
        this.b.setToolTipText("Must Go online to edit.");
        this.c.setToolTipText("Must Go online to edit.");
      } else {
        this.b.setToolTipText((String)null);
        this.c.setToolTipText((String)null);
      } 
    } 
  }
  
  public String a() {
    if (b() == null || !b().C().q())
      bV.d("Connection unavailable.", this); 
    return this.m;
  }
  
  public R b() {
    return this.l;
  }
  
  public void a(R paramR) {
    this.l = paramR;
    String str = paramR.c();
    cu cu = cu.a();
    cu.a(this);
    try {
      cu.a(str, paramR.G().a(), this);
    } catch (Exception exception) {
      bV.d("Unable to register TP ADC OutputChannel " + paramR.G().a(), this);
    } 
    try {
      aH aH = paramR.g(paramR.G().a());
      this.e = (int)aH.m();
      String str1 = paramR.G().b();
      String str2 = paramR.G().c();
      aM aM1 = paramR.c(str1);
      aM aM2 = paramR.c(str2);
      if (aM2 != null)
        this.e = (int)aM2.s(); 
      if (aM1 != null && aM2 != null) {
        this.f = (int)aM1.j(paramR.h());
        this.b.setText("" + this.f);
        this.g = (int)aM2.j(paramR.h());
        this.c.setText("" + this.g);
        if (aH.k() != null && !aH.k().equals("")) {
          aM1.a(paramR.p(), 0.0D);
          aM2.a(paramR.p(), 1023.0D);
          paramR.I();
        } 
        this.j = new aL(this);
        aR.a().a(paramR.c(), str1, this.j);
        this.k = new aK(this);
        aR.a().a(paramR.c(), str2, this.k);
      } 
      a(paramR.R());
      paramR.C().a(this);
    } catch (Exception exception) {
      D.c("Unable to get Max tp ADC, using default:" + this.e);
    } 
  }
  
  public void c() {
    if (b() == null) {
      bV.d("No EcuConfiguration set. Can not save calibration.", this);
      return;
    } 
    d d = e.a(this.l);
    if (d == null) {
      bV.d("No Throttle Calibration Writer set. Can not save calibration.", this);
      return;
    } 
    int i = Integer.parseInt(this.b.getText());
    int j = Integer.parseInt(this.c.getText());
    d.a(this.l, i, j);
  }
  
  public boolean d() {
    String str = "";
    try {
      int i = Integer.parseInt(this.c.getText());
      int j = Integer.parseInt(this.b.getText());
      if (j == i) {
        str = str + g.b("Min and Max can not be the same!") + "\n";
      } else if (j > i && str.length() == 0 && !bV.a(g.b("Min is greater than than Max!") + "\n" + g.b("Are you sure you want to use these values?"), this, true)) {
        return false;
      } 
      if (j < 0)
        str = str + g.b("Min should be greater than 0!") + "\n"; 
      if (i > this.e)
        str = str + "Max ADC should not be more than " + this.e + "!\n"; 
    } catch (NumberFormatException numberFormatException) {
      bV.d(g.b("TP ADC Min and Max must be numeric!"), this);
      return false;
    } 
    if (!str.equals("")) {
      bV.d(str, this);
      return false;
    } 
    return true;
  }
  
  public boolean e() {
    if (d()) {
      try {
        c();
      } catch (a a) {
        D.a("Unable to save Throttle Calibration.", (Exception)a, this);
      } 
    } else {
      return false;
    } 
    cu cu = cu.a();
    cu.a(this);
    return true;
  }
  
  public void close() {
    if (this.a != null) {
      this.a.dispose();
    } else {
      e();
    } 
    if (this.j != null) {
      aR.a().a(this.j);
      this.j = null;
    } 
    if (this.k != null) {
      aR.a().a(this.k);
      this.k = null;
    } 
    if (this.l != null)
      this.l.C().b(this); 
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    this.d.a(paramDouble / this.e);
    this.m = X.b(paramDouble, 0);
  }
  
  public void a(Component paramComponent) {
    this.a = new JDialog(bV.a(paramComponent), g.b("Calibrate Throttle Position Sensor"));
    this.a.add("Center", this);
    JButton jButton1 = new JButton(g.b("Cancel"));
    jButton1.addActionListener(new aI(this));
    JButton jButton2 = new JButton(g.b("Accept"));
    jButton2.addActionListener(new aJ(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    if (bV.d()) {
      jPanel.add(jButton2);
      jPanel.add(jButton1);
    } else {
      jPanel.add(jButton1);
      jPanel.add(jButton2);
    } 
    this.a.add("South", jPanel);
    this.a.pack();
    bV.a(bV.a(paramComponent), this.a);
    this.a.setVisible(true);
    validate();
    this.a.pack();
    this.a.setResizable(false);
  }
  
  public boolean a(String paramString, bT parambT) {
    a(true);
    return true;
  }
  
  public void a(String paramString) {
    a(false);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */