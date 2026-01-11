package bt;

import G.R;
import G.aM;
import G.aN;
import G.aR;
import G.bM;
import G.bR;
import G.bq;
import G.i;
import V.a;
import V.g;
import V.j;
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
import q.h;
import r.a;
import r.i;
import s.g;

public class aV extends g implements aN, L, bZ, ca, h, o, bc, cP {
  protected bq f = null;
  
  protected R g = null;
  
  protected Component h = null;
  
  protected y i = null;
  
  protected A j = null;
  
  protected bK k = null;
  
  protected D l = null;
  
  protected JLabel m = null;
  
  private JPanel a = null;
  
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
  
  public aV(R paramR, bq parambq) {
    this.f = parambq;
    this.g = paramR;
    this.p = parambq.g();
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(3, 3));
    String str = this.f.l();
    if (str != null)
      str = g.b(str); 
    if (str != null && str.length() == 0)
      str = " "; 
    try {
      this.n = (bb)h.a().a(bb.class);
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
      i.a(paramR.c(), this.f.j(), this.q);
    } catch (a a) {
      Logger.getLogger(aV.class.getName()).log(Level.WARNING, "Unable to monitor label changes for " + this.f.l(), (Throwable)a);
    } 
    if (this.f.b() != null) {
      Font font;
      aM aM = paramR.c(this.f.b());
      if (aM != null && aM != null && !aM.i().equals("array")) {
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(1, 0, 2, 2));
        if (i.a().a("lkjfgblkjgdoijre98u")) {
          a a = new a(paramR, parambq.b());
          jPanel1.add(a);
        } 
        l l = new l(paramR, parambq.b());
        jPanel1.add(l);
        jPanel.add("West", jPanel1);
      } 
      if (aM != null) {
        String str2 = aM.p();
        if (str2 != null && !str2.equals("") && this.n.getText() != null && !this.n.getText().endsWith(str2)) {
          String str3 = g.b(str2);
          str = str + "(" + str3 + ")";
          this.n.setText(str);
        } 
        try {
          i.a(paramR.c(), aM.q(), this.q);
        } catch (a a) {
          Logger.getLogger(aV.class.getName()).log(Level.WARNING, "Unable to monitor units changes for " + aM.aL(), (Throwable)a);
        } 
        if (parambq.i()) {
          try {
            this.m = (JLabel)h.a().a(JLabel.class);
            this.m.setText("                             ");
            this.m.setHorizontalAlignment(0);
          } catch (Exception exception) {
            this.m = new JLabel("                             ", 0);
            D.b("Cache Failed, creating new JLabel");
          } 
          this.m.setMinimumSize(eJ.a(1850, 20));
          this.m.setPreferredSize(eJ.a(180, 20));
          jPanel.add("East", this.m);
          this.h = this.m;
          f();
        } else if (aM.i().equals("bits")) {
          try {
            this.i = (y)h.a().a(y.class);
          } catch (Exception exception) {
            this.i = new y();
            D.b("Cache Failed, creating new UI Component");
          } 
          for (String str3 : aM.y()) {
            if (str3.indexOf("INVALID") == -1) {
              String str4 = str3;
              if (str4.startsWith("\"") && str4.endsWith("\"")) {
                str4 = str4.substring(1);
                str4 = str4.substring(0, str4.length() - 1);
              } 
              str4 = g.b(str4);
              this.i.a(str3, str4);
            } 
          } 
          f();
          jPanel.add("East", this.i);
          this.i.a(this);
          this.h = this.i;
        } else if (aM.i().equals("scalar") || aM.i().equals("bits") || aM.i().equals("array")) {
          try {
            this.j = (A)h.a().a(A.class);
            if (parambq.k()) {
              this.j.a(parambq.k());
              this.j.b(aM.z() * 2);
            } else {
              this.j.b(aM.v());
            } 
          } catch (Exception exception) {
            this.j = new A();
            D.b("Failed to create UI Component, creating new.");
          } 
          f();
          this.j.a(this);
          JPanel jPanel1 = new JPanel();
          jPanel1.setLayout(new BorderLayout(1, 1));
          jPanel1.add("Center", (Component)this.j);
          jPanel.add("East", jPanel1);
          if (!aM.i().equals("array")) {
            this.r = new ew();
            this.r.a(this);
            jPanel1.add("East", (Component)this.r);
            this.r.setToolTipText("<html> <b>D</b> or DOWN Arrow to decrease value<br> <b>+</b> or UP Arrow to increase value.</html>");
          } 
          this.t = new aX(this);
          this.j.addKeyListener(this.t);
          this.h = (Component)this.j;
          f();
        } else if (aM.i().equals("string")) {
          try {
            this.k = (bK)h.a().a(bK.class);
          } catch (Exception exception) {
            D.b("Failed to create StringParameterText, creating new.");
            this.k = new bK();
          } 
          this.k.setText("");
          int j = (aM.v() > 0) ? aM.v() : (aM.z() / 2);
          this.k.setColumns(j);
          this.k.a(aM.z());
          this.k.a(this);
          JPanel jPanel1 = new JPanel();
          jPanel1.setLayout(new BorderLayout(1, 1));
          jPanel1.add("Center", this.k);
          jPanel.add("East", jPanel1);
          this.h = this.k;
          f();
        } else {
          try {
            this.j = (A)h.a().a(A.class);
            this.j.b(aM.v());
          } catch (Exception exception) {
            this.j = new A();
            D.b("Failed to create ParameterText, creating new.");
          } 
          jPanel.add("East", (Component)this.j);
        } 
      } else if (paramR.g(this.f.b()) != null) {
        this.l = new D(paramR, parambq);
        jPanel.add("East", this.l);
        this.h = this.l;
      } else {
        this.n.setEnabled(false);
        this.n.setText(" ");
      } 
      int i = a.a().a(a.aH, a.a().o());
      String str1 = getFont().getFamily();
      if (i > 12) {
        font = new Font(str1, 1, i);
      } else {
        font = new Font(str1, 0, i);
      } 
      setFont(font);
      this.n.setFont(font);
      if (this.h != null)
        this.h.setFont(font); 
      try {
        if (aM != null)
          i.a(paramR.c(), aM, this); 
      } catch (a a) {
        Logger.getLogger(aV.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
      } 
    } else if (parambq.j() != null && parambq.i()) {
      this.m = new JLabel("                             ", 0);
      this.m.setMinimumSize(new Dimension(1850, 20));
      this.m.setPreferredSize(new Dimension(180, 20));
      jPanel.add("East", this.m);
      this.h = this.m;
      f();
      int i = a.a().a(a.aH, a.a().o());
      String str1 = getFont().getFamily();
      if (i > 12) {
        setFont(new Font(str1, 1, i));
      } else {
        setFont(new Font(str1, 0, i));
      } 
      JLabel jLabel = new JLabel(" ");
      jLabel.setMinimumSize(new Dimension(15, 15));
      jLabel.setPreferredSize(new Dimension(15, 15));
      jPanel.add("West", jLabel);
    } 
    if (this.h != null)
      this.h.addFocusListener(this.u); 
    this.a = new JPanel();
    this.a.setLayout(new BorderLayout());
    this.a.add("Center", jPanel);
    add("North", this.a);
  }
  
  public void requestFocus() {
    if (this.h != null)
      this.h.requestFocus(); 
  }
  
  public void setFont(Font paramFont) {
    super.setFont(paramFont);
    if (this.h != null)
      this.h.setFont(paramFont); 
    if (this.n != null)
      this.n.setFont(paramFont); 
  }
  
  public void a() {
    if (this.f != null && a_() != null) {
      boolean bool = true;
      try {
        bool = p.a(a_(), n());
        setEnabled(bool);
      } catch (Exception exception) {
        if (!this.s) {
          bV.d("Invalid enable condition on field " + this.f.b() + ":\n { " + a_() + " } ", this);
          this.s = true;
        } 
        D.a(exception.getMessage());
      } 
    } 
  }
  
  public void setEnabled(boolean paramBoolean) {
    boolean bool = (this.y || paramBoolean != isEnabled()) ? true : false;
    if (bool) {
      super.setEnabled(paramBoolean);
      a(this, paramBoolean);
      f();
      if (this.r != null);
      this.y = false;
    } 
  }
  
  protected void b(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    a(this, paramBoolean);
  }
  
  private void a(Container paramContainer, boolean paramBoolean) {
    Component[] arrayOfComponent = paramContainer.getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      arrayOfComponent[b].setEnabled(paramBoolean);
      if (arrayOfComponent[b] instanceof Container)
        a((Container)arrayOfComponent[b], paramBoolean); 
    } 
  }
  
  public void c(boolean paramBoolean) {
    if (this.j != null) {
      this.j.setEditable(paramBoolean);
    } else if (this.k != null) {
      this.k.setEditable(paramBoolean);
    } 
    if (this.r != null)
      this.r.setVisible(paramBoolean); 
  }
  
  public boolean e() {
    return (this.j != null && this.j.isEditable());
  }
  
  public synchronized void f() {
    if (this.f != null && (this.f.b() != null || this.f.i())) {
      aM aM = n().c(this.f.b());
      if (this.i != null) {
        try {
          if (!n().p().j() && !this.i.a(aM.f(n().p())) && this.i.getItemCount() > 0) {
            if (isEnabled())
              b(this.i.a()); 
          } else if (n().p().j()) {
            String str = aM.f(n().p());
            if (str.equals("INVALID") || str.equals("\"INVALID\""))
              this.i.addItem(str); 
            this.i.a(str);
          } 
        } catch (Exception exception) {
          D.b(exception.getMessage());
        } 
      } else if (this.j != null) {
        try {
          String[][] arrayOfString = aM.b(n().p());
          String str = arrayOfString[this.f.f()][this.f.h()];
          if (this.j.f()) {
            int i = Integer.parseInt(str);
            str = "0x" + Integer.toHexString(i).toUpperCase();
          } else {
            this.j.b(aM.v());
          } 
          if (!str.equals(this.j.getText())) {
            this.j.setText(str);
            this.j.selectAll();
          } 
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          D.a("Error in configuration, accessing ivalid index or addressing out of page.", indexOutOfBoundsException, this);
        } catch (g g1) {
          D.a(g1.getMessage(), (Exception)g1, this);
        } 
      } else if (this.k != null) {
        try {
          String str = aM.d(n().p());
          if (!str.equals(this.k.getText())) {
            this.k.setText(str);
            this.k.selectAll();
          } 
        } catch (Exception exception) {
          D.a(exception.getMessage(), exception, this);
        } 
      } else if (this.m != null) {
        if (this.f.j() != null && this.f.i()) {
          try {
            String str;
            if (this.f.k()) {
              int i = Integer.parseInt(this.f.j().a());
              str = Integer.toHexString(i).toUpperCase();
            } else {
              str = this.f.j().a();
            } 
            this.m.setText(str);
          } catch (g g1) {
            D.a("Unable to set Label:" + g1.getLocalizedMessage());
            this.m.setText("ERROR!");
          } 
        } else {
          try {
            String str2;
            String[][] arrayOfString = aM.b(n().p());
            String str1 = arrayOfString[this.f.f()][this.f.h()];
            if (str1.startsWith("\"") && str1.endsWith("\"")) {
              str1 = str1.substring(1);
              str1 = str1.substring(0, str1.length() - 1);
            } 
            if (this.f.k()) {
              int i = Integer.parseInt(str1);
              str2 = Integer.toHexString(i).toUpperCase();
            } else {
              str2 = str1;
            } 
            if (this.m.isEnabled()) {
              this.m.setText(str2);
            } else {
              this.m.setText("");
            } 
          } catch (g g1) {
            D.a(g1.getMessage(), (Exception)g1, this);
          } 
        } 
      } 
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    aY aY = new aY(this);
    SwingUtilities.invokeLater(aY);
  }
  
  public int g() {
    if (this.j != null) {
      aM aM = n().c(this.f.b());
      double d = this.j.a();
      if (d > aM.s())
        return 1; 
      if (d < aM.a(this.f.f()))
        return 2; 
    } 
    return 0;
  }
  
  public void h() {
    if (this.j != null) {
      if (g() == 0) {
        b(this.j.getText());
      } else {
        i();
      } 
    } else if (this.k != null) {
      if (g() == 0) {
        b(this.k.getText());
      } else {
        i();
      } 
    } 
  }
  
  private static void a(String paramString, Component paramComponent) {
    if (System.currentTimeMillis() - w > 500L) {
      w = System.currentTimeMillis();
      bV.d(paramString, paramComponent);
      w = System.currentTimeMillis();
    } 
  }
  
  public void b(String paramString) {
    try {
      if (this.f == null || !p.a(this.f.aJ(), n()))
        return; 
    } catch (g g1) {}
    aM aM = n().c(this.f.b());
    try {
      if (aM.i().equals("bits")) {
        aM.a(n().p(), paramString);
      } else if (aM.i().equals("scalar")) {
        if (this.f.k()) {
          paramString = X.b(paramString, "0x", "");
          double d = Integer.parseInt(paramString, 16);
          aM.a(n().p(), d);
        } else {
          double d = Double.parseDouble(paramString);
          aM.a(n().p(), d);
        } 
      } else if (aM.i().equals("string")) {
        String str = paramString;
        if (str.length() <= aM.z()) {
          aM.a(n().p(), str);
        } else {
          bV.d("String too long, Maximum Characters: " + aM.z(), this.h);
          i();
        } 
      } else if (aM.i().equals("array")) {
        double d = Double.parseDouble(paramString);
        if (d > aM.s()) {
          String str = this.f.b() + " " + g.b("value") + " " + d + " " + g.b("is too high.") + "\n" + g.b("Must be less than:") + " " + aM.s();
          a(str, this);
          i();
          f();
        } else if (d < aM.a(this.f.f())) {
          String str = this.f.b() + " " + g.b("value") + " " + d + " " + g.b("is too low.") + "\n" + g.b("Must be greater than:") + " " + aM.a(this.f.f());
          a(str, this);
          i();
          f();
        } else {
          double[][] arrayOfDouble = aM.i(n().p());
          for (byte b = 0; b < arrayOfDouble.length; b++) {
            for (byte b1 = 0; b1 < (arrayOfDouble[0]).length; b1++) {
              if (arrayOfDouble[b][b1] < aM.a(b)) {
                arrayOfDouble[b][b1] = aM.a(b);
              } else if (arrayOfDouble[b][b1] > aM.s()) {
                arrayOfDouble[b][b1] = aM.s();
              } 
            } 
          } 
          aM.a(n().p(), d, this.f.f(), this.f.h());
          arrayOfDouble = aM.i(n().p());
        } 
      } else {
        D.c("Didn't update it: " + aM);
      } 
      if (this.p)
        n().I(); 
    } catch (g g1) {
      g1.printStackTrace();
      bV.d("Failed to update " + this.f.b() + "\n Error logged", this);
    } catch (NumberFormatException numberFormatException) {
      bV.d("Must be numeric", this);
      i();
    } catch (j j) {
      if (j.a() == 2) {
        String str1 = (this.n != null && !this.n.getText().isEmpty()) ? this.n.getText() : this.f.b();
        String str2 = str1 + " value of " + j.b() + " is too low.\nMust be greater than : " + j.c();
        if (j.d() >= 0)
          str2 = "Col:" + (j.e() + 1) + "\n" + str2; 
        if (j.d() >= 0)
          str2 = "Row:" + (j.d() + 1) + "\n" + str2; 
        if (aM.u() instanceof bR) {
          bR bR = (bR)aM.u();
          String[] arrayOfString = bR.b();
          if (arrayOfString != null && arrayOfString.length == 1 && arrayOfString[0].equals(bR.c().trim())) {
            String str = bM.b(this.g, arrayOfString[0]);
            if (str != null)
              str2 = str2 + "\n\n" + g.b("Note!") + "\n" + g.b("This limit can be adjusted at:") + "\n" + str; 
          } 
        } 
        bV.d(str2, this);
        b(j.c() + "");
        f();
      } else if (j.a() == 1) {
        String str1 = (this.n != null && !this.n.getText().isEmpty()) ? this.n.getText() : this.f.b();
        String str2 = str1 + " value of " + j.b() + " is too high!.\nMust be less than : " + j.c();
        if (j.d() >= 0)
          str2 = "Col:" + (j.e() + 1) + "\n" + str2; 
        if (j.d() >= 0)
          str2 = "Row:" + (j.d() + 1) + "\n" + str2; 
        if (aM.t() instanceof bR) {
          bR bR = (bR)aM.t();
          String[] arrayOfString = bR.b();
          if (arrayOfString != null && arrayOfString.length == 1 && arrayOfString[0].equals(bR.c().trim())) {
            String str = bM.b(this.g, arrayOfString[0]);
            if (str != null)
              str2 = str2 + "\n\n" + g.b("Note!") + "\n" + g.b("This limit can be adjusted at:") + "\n" + str; 
          } 
        } 
        bV.d(str2, this);
        b(j.c() + "");
        f();
      } 
      i();
    } 
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.f.a(paramInt1);
    this.f.b(paramInt2);
    f();
  }
  
  public Insets getInsets() {
    return new Insets(1, 1, 1, 1);
  }
  
  public void close() {
    j();
    aR.a().a(this);
    aR.a().a(this.q);
    if (this.i != null)
      this.i.b(this); 
    if (this.j != null && this.t != null) {
      this.j.removeKeyListener(this.t);
      this.j.b(this);
    } 
    if (this.k != null)
      this.k.b(this); 
    if (this.h != null) {
      this.h.removeFocusListener(this.u);
      h.a().a(this.h);
      this.h = null;
    } 
    if (this.n != null) {
      h.a().a(this.n);
      this.n = null;
    } 
    if (this.l != null)
      this.l.close(); 
    this.f = null;
    this.y = true;
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      this.n.setOpaque(true);
      this.n.setBackground(Color.YELLOW);
      this.n.setForeground(Color.BLACK);
      i();
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
      j();
    } 
  }
  
  public void i() {
    if (this.h != null) {
      this.o = true;
      this.v = new ba(this);
      this.v.start();
    } 
  }
  
  public void j() {
    this.o = false;
    if (this.v != null)
      this.v.a(); 
  }
  
  public boolean k() {
    String str = c();
    if (str != null) {
      aM aM = n().c(this.f.b());
      if (aM != null && !aM.C())
        return true; 
    } 
    return false;
  }
  
  public String c() {
    return (this.f != null) ? this.f.b() : null;
  }
  
  public void setBackground(Color paramColor) {
    if (this.h != null)
      this.h.setBackground(paramColor); 
  }
  
  public void setForeground(Color paramColor) {
    if (this.h != null)
      this.h.setForeground(paramColor); 
  }
  
  public void l() {
    if (!isEnabled() || !e())
      return; 
    aM aM = n().c(this.f.b());
    try {
      if (aM.i().equals("array")) {
        double[][] arrayOfDouble = aM.i(n().p());
        double d = arrayOfDouble[this.f.f()][this.f.h()] + aM.B();
        if (d > aM.s())
          d = aM.s(); 
        aM.a(n().p(), d, this.f.f(), this.f.h());
      } else {
        aM.l(n().h());
      } 
    } catch (g g1) {
      g1.printStackTrace();
    } catch (j j) {}
  }
  
  public void a(JPanel paramJPanel) {
    this.a.add("East", paramJPanel);
  }
  
  public void m() {
    if (!isEnabled() || !e())
      return; 
    aM aM = n().c(this.f.b());
    try {
      if (aM.i().equals("array")) {
        double[][] arrayOfDouble = aM.i(n().p());
        double d = arrayOfDouble[this.f.f()][this.f.h()] - aM.B();
        if (d < aM.a(this.f.f()))
          d = aM.a(this.f.f()); 
        aM.a(n().p(), d, this.f.f(), this.f.h());
      } else {
        aM.m(n().h());
      } 
    } catch (g g1) {
      g1.printStackTrace();
    } catch (j j) {}
  }
  
  public R n() {
    return this.g;
  }
  
  public void a(FocusListener paramFocusListener) {
    if (this.h != null) {
      this.h.addFocusListener(paramFocusListener);
    } else {
      D.a("There is no settingComp, can not add FocusListener");
    } 
  }
  
  public FocusListener[] getFocusListeners() {
    return (this.h != null) ? this.h.getFocusListeners() : super.getFocusListeners();
  }
  
  public void b() {
    if (this.f != null && this.f.m() != null && !this.f.m().equals("")) {
      boolean bool = true;
      try {
        bool = p.a(this.f.m(), n());
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
  
  public void a(int paramInt) {
    if (this.j != null)
      this.j.b(paramInt); 
  }
  
  public void b(int paramInt) {
    if (this.j != null)
      this.j.a(paramInt); 
  }
  
  public void a(K paramK) {
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
      k.a(paramString); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */