package business.binary_transformers;

import G.R;
import G.Manager;
import G.GInterfaceAn;
import G.ManagerUsingConcurrentHashMap;
import G.ExceptionprintstacktraceInGPackage;
import G.SerializableImplTostring;
import G.GComponentBq;
import G.RInterfaceIndia;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import bH.D;
import bH.X;
import bH.p;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.cP;
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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import q.QInterfaceHotel;
import r.ExceptionInVPackage;
import r.RInterfaceIndia;
import s.ExceptionPrintstacktrace;

public class ExceptionUsingComponent extends ExceptionPrintstacktrace implements GInterfaceAn, L, bZ, ca, QInterfaceHotel, o, bc, cP {
  protected GComponentBq f = null;
  
  protected R ExceptionPrintstacktrace = null;
  
  protected Component QInterfaceHotel = null;
  
  protected y RInterfaceIndia = null;
  
  protected A ExceptionExtensionGetmessage = null;
  
  protected bK k = null;
  
  protected D l = null;
  
  protected JLabel m = null;
  
  private JPanel ExceptionInVPackage = null;
  
  protected bb n = null;
  
  boolean o = false;
  
  boolean p = false;
  
  aZ q = new aZ(this);
  
  ew r = null;
  
  boolean s = false;
  
  KeyAdapter t = null;
  
  FocusAdapter u = new aW(this);
  
  ba v = null;
  
  static long w = 0L;
  
  List x = new ArrayList();
  
  boolean y = true;
  
  public ExceptionUsingComponent(R paramR, GComponentBq parambq) {
    this.f = parambq;
    this.ExceptionPrintstacktrace = paramR;
    this.p = parambq.ExceptionPrintstacktrace();
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(3, 3));
    String str = this.f.l();
    if (str != null)
      str = ExceptionPrintstacktrace.b(str); 
    if (str != null && str.length() == 0)
      str = " "; 
    try {
      this.n = (bb)QInterfaceHotel.ExceptionInVPackage().ExceptionInVPackage(bb.class);
      this.n.setText(str);
    } catch (Exception exception) {
      this.n = new bb(str);
      D.b("Failed to get SettingsLabel from cache, creating...");
    } 
    if (this.f.e()) {
      this.n.setOpaque(true);
      this.n.setBackground(Color.BLUE);
      this.n.setForeground(Color.WHITE);
    } else if (this.f.d()) {
      this.n.setOpaque(true);
      this.n.setBackground(Color.RED);
      this.n.setForeground(Color.WHITE);
    } else {
      Color color = UIManager.getColor("Label.foreground");
      this.n.setForeground(color);
    } 
    jPanel.add("Center", this.n);
    try {
      RInterfaceIndia.ExceptionInVPackage(paramR.c(), this.f.ExceptionExtensionGetmessage(), this.q);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(aV.class.getName()).log(Level.WARNING, "Unable to monitor label changes for " + this.f.l(), (Throwable)ExceptionInVPackage);
    } 
    if (this.f.b() != null) {
      Font font;
      Manager Manager = paramR.c(this.f.b());
      if (Manager != null && Manager != null && !Manager.RInterfaceIndia().equals("array")) {
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(1, 0, 2, 2));
        if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("lkjfgblkjgdoijre98u")) {
          ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage(paramR, parambq.b());
          jPanel1.add(ExceptionInVPackage);
        } 
        l l = new l(paramR, parambq.b());
        jPanel1.add(l);
        jPanel.add("West", jPanel1);
      } 
      if (Manager != null) {
        String str2 = Manager.p();
        if (str2 != null && !str2.equals("") && this.n.getText() != null && !this.n.getText().endsWith(str2)) {
          String str3 = ExceptionPrintstacktrace.b(str2);
          str = str + "(" + str3 + ")";
          this.n.setText(str);
        } 
        try {
          RInterfaceIndia.ExceptionInVPackage(paramR.c(), Manager.q(), this.q);
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(aV.class.getName()).log(Level.WARNING, "Unable to monitor units changes for " + Manager.aL(), (Throwable)ExceptionInVPackage);
        } 
        if (parambq.RInterfaceIndia()) {
          try {
            this.m = (JLabel)QInterfaceHotel.ExceptionInVPackage().ExceptionInVPackage(JLabel.class);
            this.m.setText("                             ");
            this.m.setHorizontalAlignment(0);
          } catch (Exception exception) {
            this.m = new JLabel("                             ", 0);
            D.b("Cache Failed, creating new JLabel");
          } 
          this.m.setMinimumSize(eJ.ExceptionInVPackage(1850, 20));
          this.m.setPreferredSize(eJ.ExceptionInVPackage(180, 20));
          jPanel.add("East", this.m);
          this.QInterfaceHotel = this.m;
          f();
        } else if (Manager.RInterfaceIndia().equals("bits")) {
          try {
            this.RInterfaceIndia = (y)QInterfaceHotel.ExceptionInVPackage().ExceptionInVPackage(y.class);
          } catch (Exception exception) {
            this.RInterfaceIndia = new y();
            D.b("Cache Failed, creating new UI Component");
          } 
          for (String str3 : Manager.y()) {
            if (str3.indexOf("INVALID") == -1) {
              String str4 = str3;
              if (str4.startsWith("\"") && str4.endsWith("\"")) {
                str4 = str4.substring(1);
                str4 = str4.substring(0, str4.length() - 1);
              } 
              str4 = ExceptionPrintstacktrace.b(str4);
              this.RInterfaceIndia.ExceptionInVPackage(str3, str4);
            } 
          } 
          f();
          jPanel.add("East", this.RInterfaceIndia);
          this.RInterfaceIndia.ExceptionInVPackage(this);
          this.QInterfaceHotel = this.RInterfaceIndia;
        } else if (Manager.RInterfaceIndia().equals("scalar") || Manager.RInterfaceIndia().equals("bits") || Manager.RInterfaceIndia().equals("array")) {
          try {
            this.ExceptionExtensionGetmessage = (A)QInterfaceHotel.ExceptionInVPackage().ExceptionInVPackage(A.class);
            if (parambq.k()) {
              this.ExceptionExtensionGetmessage.ExceptionInVPackage(parambq.k());
              this.ExceptionExtensionGetmessage.b(Manager.z() * 2);
            } else {
              this.ExceptionExtensionGetmessage.b(Manager.v());
            } 
          } catch (Exception exception) {
            this.ExceptionExtensionGetmessage = new A();
            D.b("Failed to create UI Component, creating new.");
          } 
          f();
          this.ExceptionExtensionGetmessage.ExceptionInVPackage(this);
          JPanel jPanel1 = new JPanel();
          jPanel1.setLayout(new BorderLayout(1, 1));
          jPanel1.add("Center", (Component)this.ExceptionExtensionGetmessage);
          jPanel.add("East", jPanel1);
          if (!Manager.RInterfaceIndia().equals("array")) {
            this.r = new ew();
            this.r.ExceptionInVPackage(this);
            jPanel1.add("East", (Component)this.r);
            this.r.setToolTipText("<html> <b>D</b> or DOWN Arrow to decrease value<br> <b>+</b> or UP Arrow to increase value.</html>");
          } 
          this.t = new aX(this);
          this.ExceptionExtensionGetmessage.addKeyListener(this.t);
          this.QInterfaceHotel = (Component)this.ExceptionExtensionGetmessage;
          f();
        } else if (Manager.RInterfaceIndia().equals("string")) {
          try {
            this.k = (bK)QInterfaceHotel.ExceptionInVPackage().ExceptionInVPackage(bK.class);
          } catch (Exception exception) {
            D.b("Failed to create StringParameterText, creating new.");
            this.k = new bK();
          } 
          this.k.setText("");
          int ExceptionExtensionGetmessage = (Manager.v() > 0) ? Manager.v() : (Manager.z() / 2);
          this.k.setColumns(ExceptionExtensionGetmessage);
          this.k.ExceptionInVPackage(Manager.z());
          this.k.ExceptionInVPackage(this);
          JPanel jPanel1 = new JPanel();
          jPanel1.setLayout(new BorderLayout(1, 1));
          jPanel1.add("Center", this.k);
          jPanel.add("East", jPanel1);
          this.QInterfaceHotel = this.k;
          f();
        } else {
          try {
            this.ExceptionExtensionGetmessage = (A)QInterfaceHotel.ExceptionInVPackage().ExceptionInVPackage(A.class);
            this.ExceptionExtensionGetmessage.b(Manager.v());
          } catch (Exception exception) {
            this.ExceptionExtensionGetmessage = new A();
            D.b("Failed to create ParameterText, creating new.");
          } 
          jPanel.add("East", (Component)this.ExceptionExtensionGetmessage);
        } 
      } else if (paramR.ExceptionPrintstacktrace(this.f.b()) != null) {
        this.l = new D(paramR, parambq);
        jPanel.add("East", this.l);
        this.QInterfaceHotel = this.l;
      } else {
        this.n.setEnabled(false);
        this.n.setText(" ");
      } 
      int RInterfaceIndia = ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage(ExceptionInVPackage.aH, ExceptionInVPackage.ExceptionInVPackage().o());
      String str1 = getFont().getFamily();
      if (RInterfaceIndia > 12) {
        font = new Font(str1, 1, RInterfaceIndia);
      } else {
        font = new Font(str1, 0, RInterfaceIndia);
      } 
      setFont(font);
      this.n.setFont(font);
      if (this.QInterfaceHotel != null)
        this.QInterfaceHotel.setFont(font); 
      try {
        if (Manager != null)
          RInterfaceIndia.ExceptionInVPackage(paramR.c(), Manager, this); 
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        Logger.getLogger(aV.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
      } 
    } else if (parambq.ExceptionExtensionGetmessage() != null && parambq.RInterfaceIndia()) {
      this.m = new JLabel("                             ", 0);
      this.m.setMinimumSize(new Dimension(1850, 20));
      this.m.setPreferredSize(new Dimension(180, 20));
      jPanel.add("East", this.m);
      this.QInterfaceHotel = this.m;
      f();
      int RInterfaceIndia = ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage(ExceptionInVPackage.aH, ExceptionInVPackage.ExceptionInVPackage().o());
      String str1 = getFont().getFamily();
      if (RInterfaceIndia > 12) {
        setFont(new Font(str1, 1, RInterfaceIndia));
      } else {
        setFont(new Font(str1, 0, RInterfaceIndia));
      } 
      JLabel jLabel = new JLabel(" ");
      jLabel.setMinimumSize(new Dimension(15, 15));
      jLabel.setPreferredSize(new Dimension(15, 15));
      jPanel.add("West", jLabel);
    } 
    if (this.QInterfaceHotel != null)
      this.QInterfaceHotel.addFocusListener(this.u); 
    this.ExceptionInVPackage = new JPanel();
    this.ExceptionInVPackage.setLayout(new BorderLayout());
    this.ExceptionInVPackage.add("Center", jPanel);
    add("North", this.ExceptionInVPackage);
  }
  
  public void requestFocus() {
    if (this.QInterfaceHotel != null)
      this.QInterfaceHotel.requestFocus(); 
  }
  
  public void setFont(Font paramFont) {
    super.setFont(paramFont);
    if (this.QInterfaceHotel != null)
      this.QInterfaceHotel.setFont(paramFont); 
    if (this.n != null)
      this.n.setFont(paramFont); 
  }
  
  public void ExceptionInVPackage() {
    if (this.f != null && a_() != null) {
      boolean bool = true;
      try {
        bool = p.ExceptionInVPackage(a_(), n());
        setEnabled(bool);
      } catch (Exception exception) {
        if (!this.s) {
          bV.d("Invalid enable condition on field " + this.f.b() + ":\n { " + a_() + " } ", this);
          this.s = true;
        } 
        D.ExceptionInVPackage(exception.getMessage());
      } 
    } 
  }
  
  public void setEnabled(boolean paramBoolean) {
    boolean bool = (this.y || paramBoolean != isEnabled()) ? true : false;
    if (bool) {
      super.setEnabled(paramBoolean);
      ExceptionInVPackage(this, paramBoolean);
      f();
      if (this.r != null);
      this.y = false;
    } 
  }
  
  protected void b(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    ExceptionInVPackage(this, paramBoolean);
  }
  
  private void ExceptionInVPackage(Container paramContainer, boolean paramBoolean) {
    Component[] arrayOfComponent = paramContainer.getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      arrayOfComponent[b].setEnabled(paramBoolean);
      if (arrayOfComponent[b] instanceof Container)
        ExceptionInVPackage((Container)arrayOfComponent[b], paramBoolean); 
    } 
  }
  
  public void c(boolean paramBoolean) {
    if (this.ExceptionExtensionGetmessage != null) {
      this.ExceptionExtensionGetmessage.setEditable(paramBoolean);
    } else if (this.k != null) {
      this.k.setEditable(paramBoolean);
    } 
    if (this.r != null)
      this.r.setVisible(paramBoolean); 
  }
  
  public boolean e() {
    return (this.ExceptionExtensionGetmessage != null && this.ExceptionExtensionGetmessage.isEditable());
  }
  
  public synchronized void f() {
    if (this.f != null && (this.f.b() != null || this.f.RInterfaceIndia())) {
      Manager Manager = n().c(this.f.b());
      if (this.RInterfaceIndia != null) {
        try {
          if (!n().p().ExceptionExtensionGetmessage() && !this.RInterfaceIndia.ExceptionInVPackage(Manager.f(n().p())) && this.RInterfaceIndia.getItemCount() > 0) {
            if (isEnabled())
              b(this.RInterfaceIndia.ExceptionInVPackage()); 
          } else if (n().p().ExceptionExtensionGetmessage()) {
            String str = Manager.f(n().p());
            if (str.equals("INVALID") || str.equals("\"INVALID\""))
              this.RInterfaceIndia.addItem(str); 
            this.RInterfaceIndia.ExceptionInVPackage(str);
          } 
        } catch (Exception exception) {
          D.b(exception.getMessage());
        } 
      } else if (this.ExceptionExtensionGetmessage != null) {
        try {
          String[][] arrayOfString = Manager.b(n().p());
          String str = arrayOfString[this.f.f()][this.f.QInterfaceHotel()];
          if (this.ExceptionExtensionGetmessage.f()) {
            int RInterfaceIndia = Integer.parseInt(str);
            str = "0x" + Integer.toHexString(RInterfaceIndia).toUpperCase();
          } else {
            this.ExceptionExtensionGetmessage.b(Manager.v());
          } 
          if (!str.equals(this.ExceptionExtensionGetmessage.getText())) {
            this.ExceptionExtensionGetmessage.setText(str);
            this.ExceptionExtensionGetmessage.selectAll();
          } 
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          D.ExceptionInVPackage("Error in configuration, accessing ivalid index or addressing out of page.", indexOutOfBoundsException, this);
        } catch (ExceptionPrintstacktrace g1) {
          D.ExceptionInVPackage(g1.getMessage(), (Exception)g1, this);
        } 
      } else if (this.k != null) {
        try {
          String str = Manager.d(n().p());
          if (!str.equals(this.k.getText())) {
            this.k.setText(str);
            this.k.selectAll();
          } 
        } catch (Exception exception) {
          D.ExceptionInVPackage(exception.getMessage(), exception, this);
        } 
      } else if (this.m != null) {
        if (this.f.ExceptionExtensionGetmessage() != null && this.f.RInterfaceIndia()) {
          try {
            String str;
            if (this.f.k()) {
              int RInterfaceIndia = Integer.parseInt(this.f.ExceptionExtensionGetmessage().ExceptionInVPackage());
              str = Integer.toHexString(RInterfaceIndia).toUpperCase();
            } else {
              str = this.f.ExceptionExtensionGetmessage().ExceptionInVPackage();
            } 
            this.m.setText(str);
          } catch (ExceptionPrintstacktrace g1) {
            D.ExceptionInVPackage("Unable to set Label:" + g1.getLocalizedMessage());
            this.m.setText("ERROR!");
          } 
        } else {
          try {
            String str2;
            String[][] arrayOfString = Manager.b(n().p());
            String str1 = arrayOfString[this.f.f()][this.f.QInterfaceHotel()];
            if (str1.startsWith("\"") && str1.endsWith("\"")) {
              str1 = str1.substring(1);
              str1 = str1.substring(0, str1.length() - 1);
            } 
            if (this.f.k()) {
              int RInterfaceIndia = Integer.parseInt(str1);
              str2 = Integer.toHexString(RInterfaceIndia).toUpperCase();
            } else {
              str2 = str1;
            } 
            if (this.m.isEnabled()) {
              this.m.setText(str2);
            } else {
              this.m.setText("");
            } 
          } catch (ExceptionPrintstacktrace g1) {
            D.ExceptionInVPackage(g1.getMessage(), (Exception)g1, this);
          } 
        } 
      } 
    } 
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
    aY aY = new aY(this);
    SwingUtilities.invokeLater(aY);
  }
  
  public int ExceptionPrintstacktrace() {
    if (this.ExceptionExtensionGetmessage != null) {
      Manager Manager = n().c(this.f.b());
      double d = this.ExceptionExtensionGetmessage.ExceptionInVPackage();
      if (d > Manager.s())
        return 1; 
      if (d < Manager.ExceptionInVPackage(this.f.f()))
        return 2; 
    } 
    return 0;
  }
  
  public void QInterfaceHotel() {
    if (this.ExceptionExtensionGetmessage != null) {
      if (ExceptionPrintstacktrace() == 0) {
        b(this.ExceptionExtensionGetmessage.getText());
      } else {
        RInterfaceIndia();
      } 
    } else if (this.k != null) {
      if (ExceptionPrintstacktrace() == 0) {
        b(this.k.getText());
      } else {
        RInterfaceIndia();
      } 
    } 
  }
  
  private static void ExceptionInVPackage(String paramString, Component paramComponent) {
    if (System.currentTimeMillis() - w > 500L) {
      w = System.currentTimeMillis();
      bV.d(paramString, paramComponent);
      w = System.currentTimeMillis();
    } 
  }
  
  public void b(String paramString) {
    try {
      if (this.f == null || !p.ExceptionInVPackage(this.f.aJ(), n()))
        return; 
    } catch (ExceptionPrintstacktrace g1) {}
    Manager Manager = n().c(this.f.b());
    try {
      if (Manager.RInterfaceIndia().equals("bits")) {
        Manager.ExceptionInVPackage(n().p(), paramString);
      } else if (Manager.RInterfaceIndia().equals("scalar")) {
        if (this.f.k()) {
          paramString = X.b(paramString, "0x", "");
          double d = Integer.parseInt(paramString, 16);
          Manager.ExceptionInVPackage(n().p(), d);
        } else {
          double d = Double.parseDouble(paramString);
          Manager.ExceptionInVPackage(n().p(), d);
        } 
      } else if (Manager.RInterfaceIndia().equals("string")) {
        String str = paramString;
        if (str.length() <= Manager.z()) {
          Manager.ExceptionInVPackage(n().p(), str);
        } else {
          bV.d("String too long, Maximum Characters: " + Manager.z(), this.QInterfaceHotel);
          RInterfaceIndia();
        } 
      } else if (Manager.RInterfaceIndia().equals("array")) {
        double d = Double.parseDouble(paramString);
        if (d > Manager.s()) {
          String str = this.f.b() + " " + ExceptionPrintstacktrace.b("value") + " " + d + " " + ExceptionPrintstacktrace.b("is too high.") + "\n" + ExceptionPrintstacktrace.b("Must be less than:") + " " + Manager.s();
          ExceptionInVPackage(str, this);
          RInterfaceIndia();
          f();
        } else if (d < Manager.ExceptionInVPackage(this.f.f())) {
          String str = this.f.b() + " " + ExceptionPrintstacktrace.b("value") + " " + d + " " + ExceptionPrintstacktrace.b("is too low.") + "\n" + ExceptionPrintstacktrace.b("Must be greater than:") + " " + Manager.ExceptionInVPackage(this.f.f());
          ExceptionInVPackage(str, this);
          RInterfaceIndia();
          f();
        } else {
          double[][] arrayOfDouble = Manager.RInterfaceIndia(n().p());
          for (byte b = 0; b < arrayOfDouble.length; b++) {
            for (byte b1 = 0; b1 < (arrayOfDouble[0]).length; b1++) {
              if (arrayOfDouble[b][b1] < Manager.ExceptionInVPackage(b)) {
                arrayOfDouble[b][b1] = Manager.ExceptionInVPackage(b);
              } else if (arrayOfDouble[b][b1] > Manager.s()) {
                arrayOfDouble[b][b1] = Manager.s();
              } 
            } 
          } 
          Manager.ExceptionInVPackage(n().p(), d, this.f.f(), this.f.QInterfaceHotel());
          arrayOfDouble = Manager.RInterfaceIndia(n().p());
        } 
      } else {
        D.c("Didn't update it: " + Manager);
      } 
      if (this.p)
        n().I(); 
    } catch (ExceptionPrintstacktrace g1) {
      g1.printStackTrace();
      bV.d("Failed to update " + this.f.b() + "\n Error logged", this);
    } catch (NumberFormatException numberFormatException) {
      bV.d("Must be numeric", this);
      RInterfaceIndia();
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      if (ExceptionExtensionGetmessage.ExceptionInVPackage() == 2) {
        String str1 = (this.n != null && !this.n.getText().isEmpty()) ? this.n.getText() : this.f.b();
        String str2 = str1 + " value of " + ExceptionExtensionGetmessage.b() + " is too low.\nMust be greater than : " + ExceptionExtensionGetmessage.c();
        if (ExceptionExtensionGetmessage.d() >= 0)
          str2 = "Col:" + (ExceptionExtensionGetmessage.e() + 1) + "\n" + str2; 
        if (ExceptionExtensionGetmessage.d() >= 0)
          str2 = "Row:" + (ExceptionExtensionGetmessage.d() + 1) + "\n" + str2; 
        if (Manager.u() instanceof SerializableImplTostring) {
          SerializableImplTostring SerializableImplTostring = (SerializableImplTostring)Manager.u();
          String[] arrayOfString = SerializableImplTostring.b();
          if (arrayOfString != null && arrayOfString.length == 1 && arrayOfString[0].equals(SerializableImplTostring.c().trim())) {
            String str = ExceptionprintstacktraceInGPackage.b(this.ExceptionPrintstacktrace, arrayOfString[0]);
            if (str != null)
              str2 = str2 + "\n\n" + ExceptionPrintstacktrace.b("Note!") + "\n" + ExceptionPrintstacktrace.b("This limit can be adjusted at:") + "\n" + str; 
          } 
        } 
        bV.d(str2, this);
        b(ExceptionExtensionGetmessage.c() + "");
        f();
      } else if (ExceptionExtensionGetmessage.ExceptionInVPackage() == 1) {
        String str1 = (this.n != null && !this.n.getText().isEmpty()) ? this.n.getText() : this.f.b();
        String str2 = str1 + " value of " + ExceptionExtensionGetmessage.b() + " is too high!.\nMust be less than : " + ExceptionExtensionGetmessage.c();
        if (ExceptionExtensionGetmessage.d() >= 0)
          str2 = "Col:" + (ExceptionExtensionGetmessage.e() + 1) + "\n" + str2; 
        if (ExceptionExtensionGetmessage.d() >= 0)
          str2 = "Row:" + (ExceptionExtensionGetmessage.d() + 1) + "\n" + str2; 
        if (Manager.t() instanceof SerializableImplTostring) {
          SerializableImplTostring SerializableImplTostring = (SerializableImplTostring)Manager.t();
          String[] arrayOfString = SerializableImplTostring.b();
          if (arrayOfString != null && arrayOfString.length == 1 && arrayOfString[0].equals(SerializableImplTostring.c().trim())) {
            String str = ExceptionprintstacktraceInGPackage.b(this.ExceptionPrintstacktrace, arrayOfString[0]);
            if (str != null)
              str2 = str2 + "\n\n" + ExceptionPrintstacktrace.b("Note!") + "\n" + ExceptionPrintstacktrace.b("This limit can be adjusted at:") + "\n" + str; 
          } 
        } 
        bV.d(str2, this);
        b(ExceptionExtensionGetmessage.c() + "");
        f();
      } 
      RInterfaceIndia();
    } 
  }
  
  public void ExceptionInVPackage(int paramInt1, int paramInt2) {
    this.f.ExceptionInVPackage(paramInt1);
    this.f.b(paramInt2);
    f();
  }
  
  public Insets getInsets() {
    return new Insets(1, 1, 1, 1);
  }
  
  public void close() {
    ExceptionExtensionGetmessage();
    ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(this);
    ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(this.q);
    if (this.RInterfaceIndia != null)
      this.RInterfaceIndia.b(this); 
    if (this.ExceptionExtensionGetmessage != null && this.t != null) {
      this.ExceptionExtensionGetmessage.removeKeyListener(this.t);
      this.ExceptionExtensionGetmessage.b(this);
    } 
    if (this.k != null)
      this.k.b(this); 
    if (this.QInterfaceHotel != null) {
      this.QInterfaceHotel.removeFocusListener(this.u);
      QInterfaceHotel.ExceptionInVPackage().ExceptionInVPackage(this.QInterfaceHotel);
      this.QInterfaceHotel = null;
    } 
    if (this.n != null) {
      QInterfaceHotel.ExceptionInVPackage().ExceptionInVPackage(this.n);
      this.n = null;
    } 
    if (this.l != null)
      this.l.close(); 
    this.f = null;
    this.y = true;
  }
  
  public void ExceptionInVPackage(boolean paramBoolean) {
    if (paramBoolean) {
      this.n.setOpaque(true);
      this.n.setBackground(Color.YELLOW);
      this.n.setForeground(Color.BLACK);
      RInterfaceIndia();
    } else {
      if (this.f.e()) {
        this.n.setOpaque(true);
        this.n.setBackground(Color.BLUE);
        this.n.setForeground(Color.WHITE);
      } else if (this.f.d()) {
        this.n.setOpaque(true);
        this.n.setBackground(Color.RED);
        this.n.setForeground(Color.WHITE);
      } else {
        this.n.setOpaque(false);
        Color color = UIManager.getColor("Label.foreground");
        this.n.setForeground(color);
        this.n.setBackground(UIManager.getColor("Label.background"));
      } 
      ExceptionExtensionGetmessage();
    } 
  }
  
  public void RInterfaceIndia() {
    if (this.QInterfaceHotel != null) {
      this.o = true;
      this.v = new ba(this);
      this.v.start();
    } 
  }
  
  public void ExceptionExtensionGetmessage() {
    this.o = false;
    if (this.v != null)
      this.v.ExceptionInVPackage(); 
  }
  
  public boolean k() {
    String str = c();
    if (str != null) {
      Manager Manager = n().c(this.f.b());
      if (Manager != null && !Manager.C())
        return true; 
    } 
    return false;
  }
  
  public String c() {
    return (this.f != null) ? this.f.b() : null;
  }
  
  public void setBackground(Color paramColor) {
    if (this.QInterfaceHotel != null)
      this.QInterfaceHotel.setBackground(paramColor); 
  }
  
  public void setForeground(Color paramColor) {
    if (this.QInterfaceHotel != null)
      this.QInterfaceHotel.setForeground(paramColor); 
  }
  
  public void l() {
    if (!isEnabled() || !e())
      return; 
    Manager Manager = n().c(this.f.b());
    try {
      if (Manager.RInterfaceIndia().equals("array")) {
        double[][] arrayOfDouble = Manager.RInterfaceIndia(n().p());
        double d = arrayOfDouble[this.f.f()][this.f.QInterfaceHotel()] + Manager.B();
        if (d > Manager.s())
          d = Manager.s(); 
        Manager.ExceptionInVPackage(n().p(), d, this.f.f(), this.f.QInterfaceHotel());
      } else {
        Manager.l(n().QInterfaceHotel());
      } 
    } catch (ExceptionPrintstacktrace g1) {
      g1.printStackTrace();
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {}
  }
  
  public void ExceptionInVPackage(JPanel paramJPanel) {
    this.ExceptionInVPackage.add("East", paramJPanel);
  }
  
  public void m() {
    if (!isEnabled() || !e())
      return; 
    Manager Manager = n().c(this.f.b());
    try {
      if (Manager.RInterfaceIndia().equals("array")) {
        double[][] arrayOfDouble = Manager.RInterfaceIndia(n().p());
        double d = arrayOfDouble[this.f.f()][this.f.QInterfaceHotel()] - Manager.B();
        if (d < Manager.ExceptionInVPackage(this.f.f()))
          d = Manager.ExceptionInVPackage(this.f.f()); 
        Manager.ExceptionInVPackage(n().p(), d, this.f.f(), this.f.QInterfaceHotel());
      } else {
        Manager.m(n().QInterfaceHotel());
      } 
    } catch (ExceptionPrintstacktrace g1) {
      g1.printStackTrace();
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {}
  }
  
  public R n() {
    return this.ExceptionPrintstacktrace;
  }
  
  public void ExceptionInVPackage(FocusListener paramFocusListener) {
    if (this.QInterfaceHotel != null) {
      this.QInterfaceHotel.addFocusListener(paramFocusListener);
    } else {
      D.ExceptionInVPackage("There is no settingComp, can not add FocusListener");
    } 
  }
  
  public FocusListener[] getFocusListeners() {
    return (this.QInterfaceHotel != null) ? this.QInterfaceHotel.getFocusListeners() : super.getFocusListeners();
  }
  
  public void b() {
    if (this.f != null && this.f.m() != null && !this.f.m().equals("")) {
      boolean bool = true;
      try {
        bool = p.ExceptionInVPackage(this.f.m(), n());
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
  
  public void ExceptionInVPackage(int paramInt) {
    if (this.ExceptionExtensionGetmessage != null)
      this.ExceptionExtensionGetmessage.b(paramInt); 
  }
  
  public void b(int paramInt) {
    if (this.ExceptionExtensionGetmessage != null)
      this.ExceptionExtensionGetmessage.ExceptionInVPackage(paramInt); 
  }
  
  public void ExceptionInVPackage(K paramK) {
    this.x.add(paramK);
  }
  
  public void b(K paramK) {
    this.x.remove(paramK);
  }
  
  public String d() {
    return this.f.b();
  }
  
  private void c(String paramString) {
    for (K k : this.x)
      k.b(paramString); 
  }
  
  private void d(String paramString) {
    for (K k : this.x)
      k.ExceptionInVPackage(paramString); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */