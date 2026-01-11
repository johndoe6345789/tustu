package bt;

import G.R;
import G.aM;
import G.aN;
import G.aR;
import G.by;
import G.i;
import V.a;
import V.g;
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
import r.a;
import r.i;
import s.g;

public class bl extends g implements aN, L, ca, h, o, bc {
  protected by a = null;
  
  private R h = null;
  
  aM b;
  
  private JPanel i = new JPanel();
  
  ButtonGroup c = new ButtonGroup();
  
  List d = new ArrayList();
  
  FocusAdapter e = new bm(this);
  
  bo f = null;
  
  boolean g = false;
  
  public bl(R paramR, by paramby) {
    this.h = paramR;
    this.a = paramby;
    c_(paramby.aJ());
    if (paramby.l() != null && !paramby.l().isEmpty()) {
      setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), g.b(paramby.l())));
    } else {
      setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), ""));
    } 
    if (paramby.a()) {
      this.i.setLayout(new GridLayout(1, 1));
    } else {
      this.i.setLayout(new GridLayout(0, 1));
    } 
    setLayout(new BorderLayout());
    add("Center", this.i);
    this.b = paramR.c(this.a.b());
    if (this.b != null && this.b.i().equals("bits")) {
      JPanel jPanel1 = new JPanel();
      jPanel1.setLayout(new GridLayout(1, 0, 2, 2));
      if (i.a().a("lkjfgblkjgdoijre98u")) {
        a a = new a(paramR, paramby.b());
        jPanel1.add(a);
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
          str2 = g.b(str2);
          JRadioButton jRadioButton = new JRadioButton(str2);
          jRadioButton.setActionCommand(str1);
          jRadioButton.addActionListener(bn);
          jRadioButton.addFocusListener(this.e);
          jRadioButton.setOpaque(false);
          this.c.add(jRadioButton);
          this.i.add(jRadioButton);
        } 
      } 
      e();
    } else {
      D.a("Invalid Parameter type for Radio. Only Bit fields supported.");
    } 
    int i = a.a().a(a.aH, a.a().o());
    String str = getFont().getFamily();
    if (i > 12) {
      setFont(new Font(str, 1, i));
    } else {
      setFont(new Font(str, 0, i));
    } 
    try {
      if (this.b != null)
        i.a(paramR.c(), this.b, this); 
    } catch (a a) {
      Logger.getLogger(aV.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
  }
  
  public void e() {
    try {
      if (!g().p().j() && c(this.b.f(g().p())) && this.c.getButtonCount() > 0) {
        if (isEnabled())
          b(f()); 
      } else if (g().p().j()) {
        String str = this.b.f(g().p());
        if (str.equals("INVALID") || str.equals("\"INVALID\"")) {
          JRadioButton jRadioButton = new JRadioButton(str);
          jRadioButton.setActionCommand(str);
          this.c.add(jRadioButton);
          this.i.add(jRadioButton);
        } 
        c(str);
      } 
    } catch (Exception exception) {
      D.b(exception.getMessage());
    } 
  }
  
  public void b(String paramString) {
    if (this.a == null)
      return; 
    aM aM1 = g().c(this.a.b());
    try {
      if (aM1.i().equals("bits")) {
        aM1.a(g().p(), paramString);
      } else {
        D.c("Didn't update it: " + aM1);
      } 
    } catch (g g1) {
      g1.printStackTrace();
      bV.d("Failed to update " + this.a.b() + "\n Error logged", this);
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
    aR.a().a(this);
    this.a = null;
  }
  
  public R g() {
    return this.h;
  }
  
  public void a(String paramString1, String paramString2) {
    e();
  }
  
  public void a() {
    if (this.a != null && a_() != null && !a_().isEmpty()) {
      boolean bool = true;
      try {
        bool = p.a(a_(), g());
        setEnabled(bool);
      } catch (Exception exception) {
        D.a(exception.getMessage());
      } 
    } 
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    fp.a(this, paramBoolean);
  }
  
  public void b() {
    if (this.a != null && this.a.m() != null && !this.a.m().equals("")) {
      boolean bool = true;
      try {
        bool = p.a(this.a.m(), g());
      } catch (g g1) {
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
  
  public void a(K paramK) {
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
      k.a(paramString); 
  }
  
  public String d() {
    return this.a.b();
  }
  
  public String c() {
    return this.b.aL();
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      this.i.setOpaque(true);
      this.i.setBackground(Color.YELLOW);
      this.i.setForeground(Color.BLACK);
      h();
    } else {
      if (this.a.e()) {
        this.i.setOpaque(true);
        this.i.setBackground(Color.BLUE);
        this.i.setForeground(Color.WHITE);
      } else if (this.a.d()) {
        this.i.setOpaque(true);
        this.i.setBackground(Color.RED);
        this.i.setForeground(Color.WHITE);
      } else {
        this.i.setOpaque(false);
        Color color = UIManager.getColor("Label.foreground");
        this.i.setForeground(color);
        this.i.setBackground(UIManager.getColor("Label.background"));
      } 
      i();
    } 
  }
  
  public void h() {
    if (this.i != null) {
      this.g = true;
      this.f = new bo(this);
      this.f.start();
    } 
  }
  
  public void i() {
    this.g = false;
    if (this.f != null)
      this.f.a(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */