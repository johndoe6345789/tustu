package business.binary_transformers;

import G.R;
import G.Manager;
import G.GInterfaceAn;
import G.ManagerUsingConcurrentHashMap;
import G.GInterfaceBc;
import G.RInterfaceIndia;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import bH.D;
import bH.p;
import c.CInterfaceDelta;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.ew;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import r.ExceptionInVPackage;
import r.RInterfaceIndia;
import s.ExceptionPrintstacktrace;

public class ChangeListenerUsingJSlider extends ExceptionPrintstacktrace implements GInterfaceAn, h, CInterfaceDelta, bc, ChangeListener {
  protected GInterfaceBc ExceptionInVPackage = null;
  
  protected R b = null;
  
  protected JSlider c = null;
  
  private double m = 1.0D;
  
  protected JLabel CInterfaceDelta = new JLabel("", 0);
  
  protected bb e = null;
  
  boolean f = false;
  
  boolean ExceptionPrintstacktrace = false;
  
  ew h = null;
  
  boolean RInterfaceIndia = false;
  
  Manager ExceptionExtensionGetmessage = null;
  
  bs k = null;
  
  static long l = 0L;
  
  public ChangeListenerUsingJSlider(R paramR, GInterfaceBc parambC) {
    this.ExceptionInVPackage = parambC;
    this.b = paramR;
    this.ExceptionPrintstacktrace = parambC.ExceptionPrintstacktrace();
    c_(parambC.aJ());
    setBorder(BorderFactory.createTitledBorder(""));
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(3, 3));
    String str = this.ExceptionInVPackage.l();
    if (str != null)
      str = ExceptionPrintstacktrace.b(str); 
    if (str != null && str.length() == 0)
      str = " "; 
    this.e = new bb(str);
    if (this.ExceptionInVPackage.e()) {
      this.e.setBackground(Color.BLUE);
      this.e.setForeground(Color.WHITE);
    } else if (this.ExceptionInVPackage.CInterfaceDelta()) {
      this.e.setBackground(Color.RED);
      this.e.setForeground(Color.WHITE);
    } 
    this.e.setHorizontalAlignment(0);
    jPanel.add("South", this.e);
    this.CInterfaceDelta.setMinimumSize(new Dimension(eJ.ExceptionInVPackage(50), eJ.ExceptionInVPackage(20)));
    this.CInterfaceDelta.setPreferredSize(new Dimension(eJ.ExceptionInVPackage(50), eJ.ExceptionInVPackage(20)));
    if (this.ExceptionInVPackage.b() != null) {
      this.ExceptionExtensionGetmessage = paramR.c(this.ExceptionInVPackage.b());
      if (parambC != null && parambC.b() != null && this.ExceptionExtensionGetmessage != null && !this.ExceptionExtensionGetmessage.RInterfaceIndia().equals("array")) {
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(1, 0, 2, 2));
        if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("lkjfgblkjgdoijre98u")) {
          ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage(paramR, parambC.b());
          jPanel1.add(ExceptionInVPackage);
        } 
        l l = new l(paramR, parambC.b());
        jPanel1.add(l);
        jPanel.add("West", jPanel1);
      } 
      if (this.ExceptionExtensionGetmessage != null) {
        String str2 = this.ExceptionExtensionGetmessage.p();
        if (str2 != null && !str2.equals("") && this.e.getText() != null && !this.e.getText().endsWith(str2)) {
          String str3 = ExceptionPrintstacktrace.b(str2);
          str = str + "(" + str3 + ")";
          this.e.setText(str);
        } 
        boolean bool = false;
        if (this.ExceptionInVPackage.ExceptionInVPackage() == GInterfaceBc.b)
          bool = true; 
        this.m = 1.0D / this.ExceptionExtensionGetmessage.B();
        int ExceptionExtensionGetmessage = (int)(this.ExceptionExtensionGetmessage.r() * this.m);
        int k = (int)(this.ExceptionExtensionGetmessage.s() * this.m);
        this.c = new JSlider(bool, ExceptionExtensionGetmessage, k, ExceptionExtensionGetmessage);
        h();
        this.k = new bs(this);
        try {
          RInterfaceIndia.ExceptionInVPackage(paramR.c(), this.ExceptionExtensionGetmessage, this.k);
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(bq.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
        } 
        this.c.setPaintTicks(true);
        if (this.ExceptionExtensionGetmessage.RInterfaceIndia().equals("scalar")) {
          c();
          this.c.addChangeListener(this);
          JPanel jPanel1 = new JPanel();
          jPanel1.setLayout(new BorderLayout(1, 1));
          jPanel1.add("Center", this.CInterfaceDelta);
          jPanel.add("East", jPanel1);
          jPanel.add("Center", this.c);
        } else {
          this.e.setText("Unsupported data type: " + this.ExceptionExtensionGetmessage.RInterfaceIndia());
        } 
      } else {
        this.e.setEnabled(false);
        this.e.setText(" ");
      } 
      int RInterfaceIndia = ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage(ExceptionInVPackage.aH, ExceptionInVPackage.ExceptionInVPackage().o());
      String str1 = getFont().getFamily();
      if (RInterfaceIndia > 12) {
        setFont(new Font(str1, 1, RInterfaceIndia));
      } else {
        setFont(new Font(str1, 0, RInterfaceIndia));
      } 
    } 
    if (this.c != null)
      this.c.addFocusListener(new br(this)); 
    add("North", jPanel);
  }
  
  public void requestFocus() {
    if (this.c != null)
      this.c.requestFocus(); 
  }
  
  public void setFont(Font paramFont) {
    super.setFont(paramFont);
    if (this.c != null)
      this.c.setFont(paramFont); 
    if (this.e != null)
      this.e.setFont(paramFont); 
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    ExceptionInVPackage(this, paramBoolean);
    c();
    if (this.h != null);
  }
  
  private void ExceptionInVPackage(Container paramContainer, boolean paramBoolean) {
    Component[] arrayOfComponent = paramContainer.getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      arrayOfComponent[b].setEnabled(paramBoolean);
      if (arrayOfComponent[b] instanceof Container)
        ExceptionInVPackage((Container)arrayOfComponent[b], paramBoolean); 
    } 
  }
  
  public void c() {
    if (this.ExceptionInVPackage.b() != null) {
      Manager aM1 = b_().c(this.ExceptionInVPackage.b());
      if (this.c != null)
        try {
          double d1 = aM1.RInterfaceIndia(b_().p())[this.ExceptionInVPackage.f()][this.ExceptionInVPackage.h()];
          int RInterfaceIndia = (int)Math.round(d1 * this.m);
          if (RInterfaceIndia != this.c.getValue())
            this.c.setValue(RInterfaceIndia); 
        } catch (ExceptionPrintstacktrace g1) {
          D.ExceptionInVPackage(g1.getMessage(), (Exception)g1, this);
        }  
      if (this.CInterfaceDelta != null)
        try {
          String str = aM1.b(b_().p())[this.ExceptionInVPackage.f()][this.ExceptionInVPackage.h()];
          if (this.CInterfaceDelta.isEnabled()) {
            this.CInterfaceDelta.setText(str);
          } else {
            this.CInterfaceDelta.setText("");
          } 
        } catch (ExceptionPrintstacktrace g1) {
          D.ExceptionInVPackage(g1.getMessage(), (Exception)g1, this);
        }  
    } 
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
    c();
  }
  
  public int CInterfaceDelta() {
    return 0;
  }
  
  public void e() {
    if (CInterfaceDelta() == 0) {
      ExceptionInVPackage(this.c.getValue() / this.m);
    } else {
      f();
    } 
  }
  
  private static void ExceptionInVPackage(String paramString, Component paramComponent) {
    if (System.currentTimeMillis() - l > 500L) {
      l = System.currentTimeMillis();
      bV.CInterfaceDelta(paramString, paramComponent);
      l = System.currentTimeMillis();
    } 
  }
  
  public void ExceptionInVPackage(double paramDouble) {
    Manager aM1 = b_().c(this.ExceptionInVPackage.b());
    try {
      if (aM1.RInterfaceIndia().equals("scalar")) {
        aM1.ExceptionInVPackage(b_().p(), paramDouble);
      } else if (aM1.RInterfaceIndia().equals("array")) {
        if (paramDouble > aM1.s()) {
          String str = this.ExceptionInVPackage.b() + " value of " + paramDouble + " is too high.\nMust be less than : " + aM1.s();
          ExceptionInVPackage(str, this);
          f();
          c();
        } else if (paramDouble < aM1.r()) {
          String str = this.ExceptionInVPackage.b() + " value of " + paramDouble + " is too low.\nMust be greater than : " + aM1.r();
          ExceptionInVPackage(str, this);
          f();
          c();
        } else {
          double[][] arrayOfDouble = aM1.RInterfaceIndia(b_().p());
          arrayOfDouble[this.ExceptionInVPackage.f()][this.ExceptionInVPackage.h()] = paramDouble;
          aM1.ExceptionInVPackage(b_().p(), arrayOfDouble);
        } 
      } else {
        D.c("Didn't update it: " + aM1);
      } 
      if (this.ExceptionPrintstacktrace)
        b_().I(); 
    } catch (ExceptionPrintstacktrace g1) {
      g1.printStackTrace();
      bV.CInterfaceDelta("Failed to update " + this.ExceptionInVPackage.b() + "\n Error logged", this);
    } catch (NumberFormatException numberFormatException) {
      bV.CInterfaceDelta("Must be numeric", this);
      f();
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      if (ExceptionExtensionGetmessage.ExceptionInVPackage() == 2) {
        String str = this.ExceptionInVPackage.b() + " value of " + ExceptionExtensionGetmessage.b() + " is too low.\nMust be greater than : " + ExceptionExtensionGetmessage.c();
        if (ExceptionExtensionGetmessage.CInterfaceDelta() >= 0)
          str = "Col:" + (ExceptionExtensionGetmessage.e() + 1) + "\n" + str; 
        if (ExceptionExtensionGetmessage.CInterfaceDelta() >= 0)
          str = "Row:" + (ExceptionExtensionGetmessage.CInterfaceDelta() + 1) + "\n" + str; 
        bV.CInterfaceDelta(str, this);
        ExceptionInVPackage(ExceptionExtensionGetmessage.c());
        c();
      } else if (ExceptionExtensionGetmessage.ExceptionInVPackage() == 1) {
        String str = this.ExceptionInVPackage.b() + " value of " + ExceptionExtensionGetmessage.b() + " is too high!.\nMust be less than : " + ExceptionExtensionGetmessage.c();
        if (ExceptionExtensionGetmessage.CInterfaceDelta() >= 0)
          str = "Col:" + (ExceptionExtensionGetmessage.e() + 1) + "\n" + str; 
        if (ExceptionExtensionGetmessage.CInterfaceDelta() >= 0)
          str = "Row:" + (ExceptionExtensionGetmessage.CInterfaceDelta() + 1) + "\n" + str; 
        bV.CInterfaceDelta(str, this);
        ExceptionInVPackage(ExceptionExtensionGetmessage.c());
        c();
      } 
      f();
    } 
  }
  
  public Insets getInsets() {
    return new Insets(1, 1, 1, 1);
  }
  
  public void close() {
    ExceptionPrintstacktrace();
    ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(this);
    if (this.k != null)
      ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(this.k); 
  }
  
  public void f() {
    this.f = true;
    bt bt = new bt(this);
    bt.start();
  }
  
  public void ExceptionPrintstacktrace() {
    this.f = false;
  }
  
  public void setBackground(Color paramColor) {
    if (this.c != null)
      this.c.setBackground(paramColor); 
  }
  
  public R b_() {
    return this.b;
  }
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    e();
  }
  
  public void ExceptionInVPackage() {
    if (a_() != null) {
      boolean bool = true;
      try {
        bool = p.ExceptionInVPackage(a_(), this.b);
        setEnabled(bool);
      } catch (Exception exception) {
        D.ExceptionInVPackage(exception.getMessage());
        exception.printStackTrace();
      } 
    } 
  }
  
  private void h() {
    if (this.ExceptionExtensionGetmessage != null) {
      this.m = 1.0D / this.ExceptionExtensionGetmessage.B();
      int RInterfaceIndia = (int)(this.ExceptionExtensionGetmessage.r() * this.m);
      int ExceptionExtensionGetmessage = (int)(this.ExceptionExtensionGetmessage.s() * this.m);
      this.c.setMinimum(RInterfaceIndia);
      this.c.setMaximum(ExceptionExtensionGetmessage);
      if ((ExceptionExtensionGetmessage - RInterfaceIndia) % 4 == 0) {
        int k = (ExceptionExtensionGetmessage - RInterfaceIndia) / 4;
        this.c.setMajorTickSpacing(k);
      } else if ((ExceptionExtensionGetmessage - RInterfaceIndia) % 5 == 0) {
        int k = (ExceptionExtensionGetmessage - RInterfaceIndia) / 5;
        this.c.setMajorTickSpacing(k);
      } else if ((ExceptionExtensionGetmessage - RInterfaceIndia) % 2 == 0) {
        int k = (ExceptionExtensionGetmessage - RInterfaceIndia) / 2;
        this.c.setMajorTickSpacing(k);
      } 
      if ((ExceptionExtensionGetmessage - RInterfaceIndia) % 20 == 0) {
        int k = (ExceptionExtensionGetmessage - RInterfaceIndia) / 20;
        this.c.setMinorTickSpacing(k);
      } else if ((ExceptionExtensionGetmessage - RInterfaceIndia) % 10 == 0) {
        int k = (ExceptionExtensionGetmessage - RInterfaceIndia) / 10;
        this.c.setMinorTickSpacing(k);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */