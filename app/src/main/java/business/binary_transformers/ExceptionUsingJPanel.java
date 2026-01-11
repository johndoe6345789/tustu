package business.binary_transformers;

import G.R;
import G.Manager;
import G.GInterfaceAn;
import G.ManagerUsingConcurrentHashMap;
import G.GComponentBy;
import G.RInterfaceIndia;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.p;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.FocusAdapter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import r.ExceptionInVPackage;
import r.RInterfaceIndia;
import s.ExceptionPrintstacktrace;

public class ExceptionUsingJPanel extends ExceptionPrintstacktrace implements GInterfaceAn, L, ca, h, o, bc {
  protected GComponentBy ExceptionInVPackage = null;
  
  private R h = null;
  
  Manager b;
  
  private JPanel RInterfaceIndia = new JPanel();
  
  ButtonGroup c = new ButtonGroup();
  
  List d = new ArrayList();
  
  FocusAdapter e = new bm(this);
  
  bo f = null;
  
  boolean ExceptionPrintstacktrace = false;
  
  public ExceptionUsingJPanel(R paramR, GComponentBy paramby) {
    this.h = paramR;
    this.ExceptionInVPackage = paramby;
    c_(paramby.aJ());
    if (paramby.l() != null && !paramby.l().isEmpty()) {
      setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), ExceptionPrintstacktrace.b(paramby.l())));
    } else {
      setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), ""));
    } 
    if (paramby.ExceptionInVPackage()) {
      this.RInterfaceIndia.setLayout(new GridLayout(1, 1));
    } else {
      this.RInterfaceIndia.setLayout(new GridLayout(0, 1));
    } 
    setLayout(new BorderLayout());
    add("Center", this.RInterfaceIndia);
    this.b = paramR.c(this.ExceptionInVPackage.b());
    if (this.b != null && this.b.RInterfaceIndia().equals("bits")) {
      JPanel jPanel1 = new JPanel();
      jPanel1.setLayout(new GridLayout(1, 0, 2, 2));
      if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("lkjfgblkjgdoijre98u")) {
        ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage(paramR, paramby.b());
        jPanel1.add(ExceptionInVPackage);
      } 
      l l = new l(paramR, paramby.b());
      jPanel1.add(l);
      JPanel jPanel2 = new JPanel();
      jPanel2.setLayout(new BorderLayout());
      add("West", jPanel2);
      jPanel2.add("North", jPanel1);
      bn bn = new bn(this);
      for (String str1 : this.b.y()) {
        if (!str1.contains("INVALID")) {
          String str2 = str1;
          if (str2.startsWith("\"") && str2.endsWith("\"")) {
            str2 = str2.substring(1);
            str2 = str2.substring(0, str2.length() - 1);
          } 
          str2 = ExceptionPrintstacktrace.b(str2);
          JRadioButton jRadioButton = new JRadioButton(str2);
          jRadioButton.setActionCommand(str1);
          jRadioButton.addActionListener(bn);
          jRadioButton.addFocusListener(this.e);
          jRadioButton.setOpaque(false);
          this.c.add(jRadioButton);
          this.RInterfaceIndia.add(jRadioButton);
        } 
      } 
      e();
    } else {
      D.ExceptionInVPackage("Invalid Parameter type for Radio. Only Bit fields supported.");
    } 
    int RInterfaceIndia = ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage(ExceptionInVPackage.aH, ExceptionInVPackage.ExceptionInVPackage().o());
    String str = getFont().getFamily();
    if (RInterfaceIndia > 12) {
      setFont(new Font(str, 1, RInterfaceIndia));
    } else {
      setFont(new Font(str, 0, RInterfaceIndia));
    } 
    try {
      if (this.b != null)
        RInterfaceIndia.ExceptionInVPackage(paramR.c(), this.b, this); 
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(aV.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
    } 
  }
  
  public void e() {
    try {
      if (!ExceptionPrintstacktrace().p().j() && c(this.b.f(ExceptionPrintstacktrace().p())) && this.c.getButtonCount() > 0) {
        if (isEnabled())
          b(f()); 
      } else if (ExceptionPrintstacktrace().p().j()) {
        String str = this.b.f(ExceptionPrintstacktrace().p());
        if (str.equals("INVALID") || str.equals("\"INVALID\"")) {
          JRadioButton jRadioButton = new JRadioButton(str);
          jRadioButton.setActionCommand(str);
          this.c.add(jRadioButton);
          this.RInterfaceIndia.add(jRadioButton);
        } 
        c(str);
      } 
    } catch (Exception exception) {
      D.b(exception.getMessage());
    } 
  }
  
  public void b(String paramString) {
    if (this.ExceptionInVPackage == null)
      return; 
    Manager aM1 = ExceptionPrintstacktrace().c(this.ExceptionInVPackage.b());
    try {
      if (aM1.RInterfaceIndia().equals("bits")) {
        aM1.ExceptionInVPackage(ExceptionPrintstacktrace().p(), paramString);
      } else {
        D.c("Didn't update it: " + aM1);
      } 
    } catch (ExceptionPrintstacktrace g1) {
      g1.printStackTrace();
      bV.d("Failed to update " + this.ExceptionInVPackage.b() + "\n Error logged", this);
    } 
  }
  
  public boolean c(String paramString) {
    Enumeration<AbstractButton> enumeration = this.c.getElements();
    while (enumeration.hasMoreElements()) {
      AbstractButton abstractButton = enumeration.nextElement();
      if (abstractButton.getActionCommand() != null && abstractButton.getActionCommand().equals(paramString)) {
        abstractButton.setSelected(true);
        return true;
      } 
    } 
    return false;
  }
  
  public String f() {
    Enumeration<AbstractButton> enumeration = this.c.getElements();
    while (enumeration.hasMoreElements()) {
      AbstractButton abstractButton = enumeration.nextElement();
      if (abstractButton.isSelected())
        return abstractButton.getActionCommand(); 
    } 
    return null;
  }
  
  public void close() {
    ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(this);
    this.ExceptionInVPackage = null;
  }
  
  public R ExceptionPrintstacktrace() {
    return this.h;
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
    e();
  }
  
  public void ExceptionInVPackage() {
    if (this.ExceptionInVPackage != null && a_() != null && !a_().isEmpty()) {
      boolean bool = true;
      try {
        bool = p.ExceptionInVPackage(a_(), ExceptionPrintstacktrace());
        setEnabled(bool);
      } catch (Exception exception) {
        D.ExceptionInVPackage(exception.getMessage());
      } 
    } 
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    fp.ExceptionInVPackage(this, paramBoolean);
  }
  
  public void b() {
    if (this.ExceptionInVPackage != null && this.ExceptionInVPackage.m() != null && !this.ExceptionInVPackage.m().equals("")) {
      boolean bool = true;
      try {
        bool = p.ExceptionInVPackage(this.ExceptionInVPackage.m(), ExceptionPrintstacktrace());
      } catch (ExceptionPrintstacktrace g1) {
        Logger.getLogger(aV.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
      } 
      if (isVisible() && !bool) {
        setVisible(false);
        if (getParent() instanceof JPanel)
          ((JPanel)getParent()).revalidate(); 
      } else if (!isVisible() && bool) {
        setVisible(true);
        if (getParent() instanceof JPanel)
          ((JPanel)getParent()).revalidate(); 
      } 
    } 
  }
  
  public void ExceptionInVPackage(K paramK) {
    this.d.add(paramK);
  }
  
  public void b(K paramK) {
    this.d.remove(paramK);
  }
  
  private void d(String paramString) {
    for (K k : this.d)
      k.b(paramString); 
  }
  
  private void e(String paramString) {
    for (K k : this.d)
      k.ExceptionInVPackage(paramString); 
  }
  
  public String d() {
    return this.ExceptionInVPackage.b();
  }
  
  public String c() {
    return this.b.aL();
  }
  
  public void ExceptionInVPackage(boolean paramBoolean) {
    if (paramBoolean) {
      this.RInterfaceIndia.setOpaque(true);
      this.RInterfaceIndia.setBackground(Color.YELLOW);
      this.RInterfaceIndia.setForeground(Color.BLACK);
      h();
    } else {
      if (this.ExceptionInVPackage.e()) {
        this.RInterfaceIndia.setOpaque(true);
        this.RInterfaceIndia.setBackground(Color.BLUE);
        this.RInterfaceIndia.setForeground(Color.WHITE);
      } else if (this.ExceptionInVPackage.d()) {
        this.RInterfaceIndia.setOpaque(true);
        this.RInterfaceIndia.setBackground(Color.RED);
        this.RInterfaceIndia.setForeground(Color.WHITE);
      } else {
        this.RInterfaceIndia.setOpaque(false);
        Color color = UIManager.getColor("Label.foreground");
        this.RInterfaceIndia.setForeground(color);
        this.RInterfaceIndia.setBackground(UIManager.getColor("Label.background"));
      } 
      RInterfaceIndia();
    } 
  }
  
  public void h() {
    if (this.RInterfaceIndia != null) {
      this.ExceptionPrintstacktrace = true;
      this.f = new bo(this);
      this.f.start();
    } 
  }
  
  public void RInterfaceIndia() {
    this.ExceptionPrintstacktrace = false;
    if (this.f != null)
      this.f.ExceptionInVPackage(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */