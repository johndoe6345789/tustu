package ao;

import ActionListenerInGPackage.ActionListenerInGPackage;
import ActionListenerInGPackage.BeInterfaceKilo;
import V.ExceptionInVPackage;
import W.j;
import W.n;
import aw.AwInterfaceCharlie;
import aw.ExceptionInVPackage;
import bE.BeInterfaceKilo;
import bE.BeInterfaceQuebec;
import bE.JComponentExtension;
import bH.D;
import bH.S;
import bx.BxInterfaceLima;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.dE;
import com.efiAnalytics.ui.e;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.fF;
import h.ClassTypeInHPackage;
import h.IOProperties;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class fK extends JPanel implements BeInterfaceKilo {
  private JComponentExtension z = new JComponentExtension();

  JToolBar ExceptionInVPackage = new JToolBar();

  JToolBar ClassTypeInHPackage = new JToolBar();

  e AwInterfaceCharlie = new e();

  e d = new e();

  e e = new e();

  eq f = new eq(this);

  JLabel ActionListenerInGPackage = new JLabel(" ", 0);

  JLabel h = new JLabel(" ", 0);

  fF IOProperties = new fF();

  ExceptionInVPackage j = null;

  JPanel BeInterfaceKilo = null;

  JToggleButton BxInterfaceLima = new JToggleButton("Scales");

  JButton JComponentExtension = new JButton("Saved Views");

  JButton n = new JButton("Pop");

  private et A = null;

  private int B = 0;

  private int C = 0;

  private static String D = "xField";

  private static String E = "yField";

  private static String F = "zField";

  private static String G = "Hits";

  private String H = "Hits";

  private String I = null;

  private String J = null;

  private static String K = "showFilterPanel";

  private static String L = "showRangeScale";

  public static String o = "Current View";

  private static String M = "Save Current View As";

  private static String N = "Delete View";

  private static String O = "Minimum Dot Size";

  private static String P = "Maximum Dot Size";

  private static String Q = "Number of Y Sections";

  private static String R = "Number of X Sections";

  private static String S = "Maximum Number of Z Gradients";

  private static int T = 30;

  JPanel p;

  AwInterfaceCharlie BeInterfaceQuebec = null;

  private String U = "zColorKey";

  ArrayList r = new ArrayList();

  private dE V = null;

  private boolean W = false;

  JButton s = null;

  JButton t = null;

  JButton u = null;

  JToggleButton v = null;

  ImageIcon w = null;

  ImageIcon x = null;

  JButton y = null;

  public fK() {
    setLayout(new BorderLayout());
    this.V = new dE((Component) this.z);
    this.V.ExceptionInVPackage(250);
    this.z.ExceptionInVPackage(this);
    setBorder(BorderFactory.createLineBorder(Color.darkGray));
    this.p = new JPanel();
    this.p.setLayout(new BorderLayout());
    try {
      Image image1 = cO.ExceptionInVPackage().ExceptionInVPackage(cO.ar, this, 20);
      this.n.setText("");
      ImageIcon imageIcon1 = new ImageIcon(image1);
      this.n.setIcon(imageIcon1);
    } catch (ExceptionInVPackage a1) {
      this.n.setText("Popout");
      Logger.getLogger(fK.class.getName())
          .log(Level.WARNING, "Failed to load Scatter plot full screen image.", (Throwable) a1);
    }
    if (ClassTypeInHPackage.ExceptionInVPackage().ExceptionInVPackage("fdsahoirew098rew3284lksafd"))
      this.ExceptionInVPackage.add(this.n);
    this.ExceptionInVPackage.add(this.JComponentExtension);
    this.ExceptionInVPackage.add(new JLabel(" X Axis:"));
    this.ExceptionInVPackage.add((Component) this.AwInterfaceCharlie);
    this.ExceptionInVPackage.add(new JLabel(" Y Axis:"));
    this.ExceptionInVPackage.add((Component) this.d);
    this.ExceptionInVPackage.add(new JLabel(" Z Axis:"));
    this.ExceptionInVPackage.add((Component) this.e);
    this.ExceptionInVPackage.add(this.BxInterfaceLima);
    Dimension dimension = eJ.ExceptionInVPackage(140, getFont().getSize() + 4);
    this.AwInterfaceCharlie.setPreferredSize(dimension);
    this.d.setPreferredSize(dimension);
    this.e.setPreferredSize(dimension);
    this.JComponentExtension.addActionListener(new fL(this));
    this.AwInterfaceCharlie.addItemListener(new fW(this));
    this.d.addItemListener(new gc(this));
    this.e.addItemListener(new gd(this));
    this.BxInterfaceLima.addActionListener(new ge(this));
    this.n.addActionListener(new gf(this));
    this.p.add("North", this.ExceptionInVPackage);
    add("North", this.p);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("Center", (Component) this.z);
    jPanel.add("North", this.ActionListenerInGPackage);
    jPanel.add("West", (Component) this.IOProperties);
    jPanel.add("South", this.h);
    this.ActionListenerInGPackage.setOpaque(true);
    this.IOProperties.setOpaque(true);
    this.h.setOpaque(true);
    this.ActionListenerInGPackage.setBackground(Color.BLACK);
    this.IOProperties.setBackground(Color.BLACK);
    this.h.setBackground(Color.BLACK);
    this.ActionListenerInGPackage.setForeground(Color.WHITE);
    this.IOProperties.setForeground(Color.WHITE);
    this.h.setForeground(Color.WHITE);
    this.ActionListenerInGPackage.setFont(new Font("Times", 1, eJ.ExceptionInVPackage(18)));
    add("Center", jPanel);
    this.z.ExceptionInVPackage(this.f, 0);
    this.z.addMouseListener(new gk(this));
    this.BeInterfaceQuebec = new AwInterfaceCharlie(null);
    this.BeInterfaceQuebec.ExceptionInVPackage(new gl(this));
    this.ClassTypeInHPackage.add((Component) this.BeInterfaceQuebec);
    this.p.add("Center", this.ClassTypeInHPackage);
    ExceptionInVPackage(new gm(this));
    ExceptionInVPackage(true);
    Image image =
        Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/zoomout.gif"));
    image = eJ.ExceptionInVPackage(image);
    ImageIcon imageIcon = new ImageIcon(image);
    this.y = new JButton(null, imageIcon);
    this.z.add(this.y);
    this.y.setVisible(
        (!this.BeInterfaceQuebec.ExceptionInVPackage() || !this.BeInterfaceQuebec.d()));
    this.y.addActionListener(new gg(this));
    image =
        Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/scatter_line.png"));
    image = eJ.ExceptionInVPackage(image, 20);
    this.w = new ImageIcon(image);
    image =
        Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/scatter_dots.png"));
    image = eJ.ExceptionInVPackage(image, 20);
    this.x = new ImageIcon(image);
    this.v = new JToggleButton(null, this.x);
    this.z.add(this.v);
    this.v.addActionListener(new gh(this));
  }

  private void s() {
    JPopupMenu jPopupMenu = new JPopupMenu();
    jPopupMenu.add(M).addActionListener(new gi(this));
    JMenu jMenu = new JMenu("Delete Saved View");
    fM fM = new fM(this);
    List list = fI.ExceptionInVPackage();
    for (String str : list) {
      if (!str.equals(o)) jMenu.add(str).addActionListener(fM);
    }
    jPopupMenu.add(jMenu);
    jPopupMenu.addSeparator();
    fN fN = new fN(this);
    for (String str : list) {
      if (!str.equals(o)) jPopupMenu.add(str).addActionListener(fN);
    }
    this.JComponentExtension.add(jPopupMenu);
    jPopupMenu.show(this.JComponentExtension, 0, this.JComponentExtension.getHeight());
  }

  private void d(String paramString) {
    fI.ClassTypeInHPackage(paramString);
  }

  private void t() {
    String str = "Scatter Plot View Name";
    IOProperties.AwInterfaceCharlie(
        "userParameter_" + str, this.ActionListenerInGPackage.getText());
    ActionListenerInGPackage ActionListenerInGPackage =
        new ActionListenerInGPackage(
            BeInterfaceKilo.ExceptionInVPackage(this),
            "{" + str + "}",
            false,
            "       Save current Histogram View As",
            true);
    if (ActionListenerInGPackage.ExceptionInVPackage) {
      String str1 = ActionListenerInGPackage.ExceptionInVPackage();
      fH fH = ExceptionInVPackage();
      fH.ExceptionInVPackage(str1);
      fI.ExceptionInVPackage(fH);
    }
  }

  private void e(String paramString) {
    fH fH = null;
    try {
      fH = fI.ExceptionInVPackage(paramString);
    } catch (ExceptionInVPackage a1) {
      Logger.getLogger(fK.class.getName())
          .log(
              Level.WARNING,
              "Scatter Plot View " + paramString + " cannot be loaded.",
              (Throwable) a1);
    }
    if (fH == null) {
      bV.d("Scatter Plot View " + paramString + " cannot be loaded.", this);
      return;
    }
    ExceptionInVPackage(fH);
  }

  private void ExceptionInVPackage(fH paramfH) {
    this.AwInterfaceCharlie.ClassTypeInHPackage(paramfH.ClassTypeInHPackage());
    this.BeInterfaceQuebec.ClassTypeInHPackage(paramfH.e(), paramfH.f());
    this.BeInterfaceQuebec.ClassTypeInHPackage(paramfH.ActionListenerInGPackage());
    this.d.ClassTypeInHPackage(paramfH.AwInterfaceCharlie());
    this.BeInterfaceQuebec.ExceptionInVPackage(paramfH.h(), paramfH.IOProperties());
    this.BeInterfaceQuebec.ExceptionInVPackage(paramfH.j());
    this.e.ClassTypeInHPackage(paramfH.d());
    this.BeInterfaceQuebec.AwInterfaceCharlie(paramfH.BeInterfaceKilo(), paramfH.BxInterfaceLima());
    this.BeInterfaceQuebec.AwInterfaceCharlie(paramfH.JComponentExtension());
  }

  private void u() {
    fF fF1 = bq.ExceptionInVPackage().ExceptionInVPackage(this);
    fF1.ExceptionInVPackage(this.f);
    fF1.ExceptionInVPackage(this.z.n(), this.z.o());
    if (!fF1.isVisible()) fF1.setVisible(true);
    fF1.ClassTypeInHPackage(this.z.getWidth(), this.z.getHeight());
  }

  public fH ExceptionInVPackage() {
    fH fH = new fH(this.ActionListenerInGPackage.getText());
    String str =
        (this.AwInterfaceCharlie.getSelectedItem() == null)
            ? " "
            : this.AwInterfaceCharlie.getSelectedItem().toString();
    fH.ClassTypeInHPackage(str);
    fH.ExceptionInVPackage(this.BeInterfaceQuebec.ClassTypeInHPackage());
    fH.ClassTypeInHPackage(this.BeInterfaceQuebec.AwInterfaceCharlie());
    fH.ExceptionInVPackage(this.BeInterfaceQuebec.ExceptionInVPackage());
    str = (this.d.getSelectedItem() == null) ? " " : this.d.getSelectedItem().toString();
    fH.AwInterfaceCharlie(str);
    fH.AwInterfaceCharlie(this.BeInterfaceQuebec.e());
    fH.d(this.BeInterfaceQuebec.f());
    fH.ClassTypeInHPackage(this.BeInterfaceQuebec.d());
    str = (this.e.getSelectedItem() == null) ? " " : this.e.getSelectedItem().toString();
    fH.d(str);
    fH.e(this.BeInterfaceQuebec.h());
    fH.f(this.BeInterfaceQuebec.IOProperties());
    fH.AwInterfaceCharlie(this.BeInterfaceQuebec.ActionListenerInGPackage());
    return fH;
  }

  public void ExceptionInVPackage(boolean paramBoolean) {
    if (this.j == null) {
      this.BeInterfaceKilo = new JPanel();
      this.BeInterfaceKilo.setBackground(Color.BLACK);
      this.BeInterfaceKilo.setLayout(new BorderLayout());
      JPanel jPanel1 = new JPanel();
      jPanel1.setLayout(new BorderLayout());
      Image image =
          Toolkit.getDefaultToolkit()
              .getImage(getClass().getResource("resources/icon_close_11x11.gif"));
      image = eJ.ExceptionInVPackage(image, jPanel1);
      ImageIcon imageIcon = new ImageIcon(image);
      this.s = new JButton(null, imageIcon);
      this.s.setFocusable(false);
      this.s.setToolTipText("Close");
      this.s.addActionListener(new fO(this));
      this.s.setPreferredSize(
          new Dimension(eJ.ExceptionInVPackage(14), eJ.ExceptionInVPackage(14)));
      JPanel jPanel2 = new JPanel();
      jPanel2.setLayout(new BorderLayout());
      jPanel2.add("North", this.s);
      jPanel1.add("East", jPanel2);
      this.BeInterfaceKilo.add("North", jPanel1);
      image =
          Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/filter-16.png"));
      image = eJ.ExceptionInVPackage(image, jPanel2);
      imageIcon = new ImageIcon(image);
      this.t = new JButton(null, imageIcon);
      this.t.setFocusable(false);
      this.t.setToolTipText("Show Filters");
      this.t.addActionListener(new fP(this));
      this.t.setPreferredSize(
          new Dimension(eJ.ExceptionInVPackage(18), eJ.ExceptionInVPackage(18)));
      this.z.add(this.t);
      this.z.setLayout(new gj(this));
      image =
          Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/edit-icon.png"));
      image = eJ.ExceptionInVPackage(image, jPanel2);
      imageIcon = new ImageIcon(image);
      this.u = new JButton(null, imageIcon);
      this.u.setFocusable(false);
      this.u.setToolTipText("Show Filters");
      this.u.addActionListener(new fQ(this));
      this.u.setPreferredSize(
          new Dimension(eJ.ExceptionInVPackage(18), eJ.ExceptionInVPackage(18)));
      jPanel1.add("West", this.u);
      this.j = new ExceptionInVPackage(null);
      this.j.ExceptionInVPackage(new fR(this));
      M.ExceptionInVPackage().ExceptionInVPackage((BxInterfaceLima) this.j);
      this.BeInterfaceKilo.add("Center", (Component) this.j);
      add("East", this.BeInterfaceKilo);
    }
    if (paramBoolean)
      ;
    this.BeInterfaceKilo.setVisible(paramBoolean);
    this.t.setVisible(!paramBoolean);
    ExceptionInVPackage(K, "" + paramBoolean);
  }

  private void v() {
    if (this.j.ExceptionInVPackage().isEmpty()) {
      this.t.setBackground(getBackground());
    } else {
      this.t.setBackground(Color.RED);
    }
  }

  public void ClassTypeInHPackage() {
    boolean bool = this.BxInterfaceLima.isSelected();
    ClassTypeInHPackage(bool);
  }

  public void ClassTypeInHPackage(boolean paramBoolean) {
    this.BxInterfaceLima.setSelected(paramBoolean);
    this.BeInterfaceQuebec.setVisible(paramBoolean);
    ExceptionInVPackage(L, "" + paramBoolean);
  }

  public void ExceptionInVPackage(h paramh) {
    this.r.add(paramh);
  }

  private void w() {
    String str =
        (this.AwInterfaceCharlie.getSelectedItem() == null)
            ? ""
            : this.AwInterfaceCharlie.getSelectedItem().toString();
    Iterator<h> iterator = this.r.iterator();
    while (iterator.hasNext()) ((h) iterator.next()).ExceptionInVPackage(str);
  }

  private void x() {
    String str = (this.d.getSelectedItem() == null) ? "" : this.d.getSelectedItem().toString();
    Iterator<h> iterator = this.r.iterator();
    while (iterator.hasNext()) ((h) iterator.next()).ClassTypeInHPackage(str);
  }

  private void y() {
    String str = (this.e.getSelectedItem() == null) ? "" : this.e.getSelectedItem().toString();
    Iterator<h> iterator = this.r.iterator();
    while (iterator.hasNext()) ((h) iterator.next()).AwInterfaceCharlie(str);
  }

  public void ExceptionInVPackage(n paramn) {
    this.f.ExceptionInVPackage(paramn);
    if (paramn != null && paramn.size() > 0) {
      ClassTypeInHPackage(paramn);
      this.y.setVisible(
          (!this.BeInterfaceQuebec.ExceptionInVPackage() || !this.BeInterfaceQuebec.d()));
      D.AwInterfaceCharlie("Dataset size: " + paramn.d());
      String str = (String) this.AwInterfaceCharlie.getSelectedItem();
      this.f.ExceptionInVPackage(str);
      str = (String) this.d.getSelectedItem();
      this.f.ClassTypeInHPackage(str);
      str = (String) this.e.getSelectedItem();
      this.f.AwInterfaceCharlie(str);
    }
  }

  public void AwInterfaceCharlie() {
    if (this.BeInterfaceQuebec.ExceptionInVPackage()) {
      double d1 = this.f.ExceptionInVPackage();
      double d2 = this.f.ClassTypeInHPackage();
      this.BeInterfaceQuebec.ClassTypeInHPackage(d1, d2);
    }
    if (this.BeInterfaceQuebec.d()) {
      double d1 = this.f.AwInterfaceCharlie();
      double d2 = this.f.d();
      this.BeInterfaceQuebec.ExceptionInVPackage(d1, d2);
    }
    if (this.BeInterfaceQuebec.ActionListenerInGPackage()) {
      double d1 = this.f.h();
      double d2 = this.f.IOProperties();
      this.BeInterfaceQuebec.AwInterfaceCharlie(d1, d2);
    }
  }

  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dimension dimension;
    int IOProperties = (this.AwInterfaceCharlie.getPreferredSize()).width;
    int j = (paramInt3 - eJ.ExceptionInVPackage(260)) / 3;
    if (IOProperties < j) {
      dimension = new Dimension(IOProperties, 20);
    } else {
      dimension = new Dimension(j, 20);
    }
    this.AwInterfaceCharlie.setMinimumSize(dimension);
    this.d.setMinimumSize(dimension);
    this.e.setMinimumSize(dimension);
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void repaint() {
    super.repaint();
    if (this.z != null) this.z.ExceptionInVPackage();
  }

  private void ClassTypeInHPackage(n paramn) {
    this.W = true;
    ExceptionInVPackage(this.AwInterfaceCharlie, paramn, " ");
    ExceptionInVPackage(this.d, paramn, " ");
    ExceptionInVPackage(this.e, paramn, G);
    e();
    this.W = false;
  }

  private void ExceptionInVPackage(e parame, n paramn, String paramString) {
    if (paramn == null) return;
    String str = (String) parame.getSelectedItem();
    boolean bool1 = false;
    String[] arrayOfString1 = parame.ClassTypeInHPackage();
    String[] arrayOfString2 = new String[paramn.size()];
    boolean bool2 = (arrayOfString1.length == arrayOfString2.length + 1) ? true : false;
    byte ClassTypeInHPackage;
    for (ClassTypeInHPackage = 0; ClassTypeInHPackage < paramn.size(); ClassTypeInHPackage++) {
      j j = (j) paramn.get(ClassTypeInHPackage);
      arrayOfString2[ClassTypeInHPackage] = j.ExceptionInVPackage();
      if (bool2
          && !arrayOfString2[ClassTypeInHPackage].equals(arrayOfString1[ClassTypeInHPackage + 1]))
        bool2 = false;
    }
    if (!bool2) {
      parame.removeAllItems();
      if (parame.getItemCount() == 0) parame.ExceptionInVPackage(paramString);
      if (IOProperties.ExceptionInVPackage(IOProperties.E, IOProperties.F))
        arrayOfString2 = S.ExceptionInVPackage(arrayOfString2);
      ClassTypeInHPackage = 1;
      for (byte b1 = 0; b1 < arrayOfString2.length; b1++) {
        if (!bool1 && arrayOfString2[b1].equals(str)) bool1 = true;
        int IOProperties = b1 + ClassTypeInHPackage;
        parame.ExceptionInVPackage(arrayOfString2[b1]);
      }
    }
    try {
      if (!bool1) parame.ClassTypeInHPackage(str);
    } catch (Exception exception) {
      parame.ClassTypeInHPackage(paramString);
    }
  }

  protected void d() {
    if (this.AwInterfaceCharlie.getSelectedItem() != null
        && this.d.getSelectedItem() != null
        && ((String) this.AwInterfaceCharlie.getSelectedItem()).length() > 0
        && ((String) this.d.getSelectedItem()).length() > 0) {
      String str;
      if (this.e.getSelectedItem() != null && !this.e.getSelectedItem().toString().equals(" ")) {
        str =
            this.d.getSelectedItem()
                + " vs "
                + this.AwInterfaceCharlie.getSelectedItem()
                + " vs "
                + this.e.getSelectedItem().toString();
      } else {
        str = this.d.getSelectedItem() + " vs " + this.AwInterfaceCharlie.getSelectedItem();
      }
      this.ActionListenerInGPackage.setText(str);
      this.h.setText(this.AwInterfaceCharlie.getSelectedItem().toString());
      this.IOProperties.setText(this.d.getSelectedItem().toString());
      this.z.ExceptionInVPackage(this.AwInterfaceCharlie.getSelectedItem().toString());
      this.z.ClassTypeInHPackage(this.d.getSelectedItem().toString());
      if (this.e.getSelectedItem() != null) {
        this.z.AwInterfaceCharlie(this.e.getSelectedItem().toString());
      } else {
        this.z.AwInterfaceCharlie("");
      }
    }
  }

  public void ExceptionInVPackage(int paramInt) {
    if (paramInt > this.C
        && this.f.ExceptionInVPackage != null
        && paramInt < this.B
        && this.f.ClassTypeInHPackage != null
        && paramInt < this.f.ClassTypeInHPackage.IOProperties()) {
      BeInterfaceQuebec BeInterfaceQuebec = this.f.ClassTypeInHPackage(paramInt);
      this.z.ExceptionInVPackage(BeInterfaceQuebec.getX(), BeInterfaceQuebec.getY());
      this.z.repaint();
    } else {
      this.z.BxInterfaceLima();
    }
  }

  public void ExceptionInVPackage(et paramet) {
    this.A = paramet;
  }

  private boolean ExceptionInVPackage(e parame, String paramString) {
    for (byte ClassTypeInHPackage = 0;
        ClassTypeInHPackage < parame.getItemCount();
        ClassTypeInHPackage++) {
      if (parame.ExceptionInVPackage(ClassTypeInHPackage).equals(paramString)) return true;
    }
    return false;
  }

  public void e() {
    if (this.A != null) {
      String str1 = this.A.ExceptionInVPackage(D);
      String str2 = this.A.ExceptionInVPackage(E);
      if (str1 != null && ExceptionInVPackage(this.AwInterfaceCharlie, str1)) {
        this.AwInterfaceCharlie.ClassTypeInHPackage(str1);
      } else {
        str1 = null;
      }
      if (str2 != null && ExceptionInVPackage(this.d, str2)) {
        this.d.ClassTypeInHPackage(str2);
      } else {
        str2 = null;
      }
      if ((str1 == null || str2 == null) && this.I != null && this.J != null) {
        this.AwInterfaceCharlie.ClassTypeInHPackage(this.I);
        this.d.ClassTypeInHPackage(this.J);
      }
      String str3 = this.A.ExceptionInVPackage(F);
      if (str3 == null && this.H != null) str3 = this.H;
      if (str3 != null) this.e.ClassTypeInHPackage(str3);
      String str4 = this.A.ExceptionInVPackage(this.U);
      if (str4 != null)
        try {
          d(Integer.parseInt(str4));
        } catch (NumberFormatException numberFormatException) {
          d(1);
        }
      String str5 = this.A.ExceptionInVPackage(K);
      boolean bool1 = (str5 != null && Boolean.parseBoolean(str5)) ? true : false;
      ExceptionInVPackage(bool1);
      str5 = this.A.ExceptionInVPackage(L);
      boolean bool2 = (str5 != null && Boolean.parseBoolean(str5)) ? true : false;
      ClassTypeInHPackage(bool2);
      double d = 0.0D;
      int IOProperties = 0;
      try {
        str5 = this.A.ExceptionInVPackage(O);
        if (str5 != null) {
          d = Double.parseDouble(str5);
          IOProperties = (int) Math.round(d);
          this.z.d(IOProperties);
        }
      } catch (NumberFormatException numberFormatException) {
      }
      try {
        str5 = this.A.ExceptionInVPackage(P);
        if (str5 != null) {
          d = Double.parseDouble(str5);
          IOProperties = (int) Math.round(d);
          this.z.e(IOProperties);
        }
      } catch (NumberFormatException numberFormatException) {
      }
      try {
        str5 = this.A.ExceptionInVPackage(R);
        if (str5 != null) {
          IOProperties = Integer.parseInt(str5);
          this.z.f(IOProperties);
        }
      } catch (Exception exception) {
      }
      try {
        str5 = this.A.ExceptionInVPackage(Q);
        if (str5 != null) {
          IOProperties = Integer.parseInt(str5);
          this.z.ActionListenerInGPackage(IOProperties);
        }
      } catch (Exception exception) {
      }
      try {
        str5 = this.A.ExceptionInVPackage(S);
        if (str5 != null) {
          IOProperties = Integer.parseInt(str5);
          this.z.BeInterfaceKilo(IOProperties);
        }
      } catch (Exception exception) {
      }
    }
  }

  private void ExceptionInVPackage(String paramString1, String paramString2) {
    if (this.A != null) this.A.ExceptionInVPackage(paramString1, paramString2);
  }

  public int f() {
    return this.B;
  }

  public void ClassTypeInHPackage(int paramInt) {
    this.B = paramInt;
    this.z.d();
    this.V.ExceptionInVPackage();
  }

  public int ActionListenerInGPackage() {
    return this.C;
  }

  public void AwInterfaceCharlie(int paramInt) {
    this.C = paramInt;
    this.z.d();
    this.V.ExceptionInVPackage();
  }

  public void ExceptionInVPackage(String paramString) {
    this.I = paramString;
  }

  public void ClassTypeInHPackage(String paramString) {
    this.J = paramString;
  }

  public void AwInterfaceCharlie(String paramString) {
    this.H = paramString;
  }

  public void ExceptionInVPackage(Component paramComponent, int paramInt1, int paramInt2) {
    JPopupMenu jPopupMenu = new JPopupMenu();
    JMenu jMenu = new JMenu("Z Axis Color Mode");
    String str = this.A.ExceptionInVPackage(this.U);
    if (str == null || str.equals("")) str = "" + this.z.BeInterfaceKilo();
    IOProperties IOProperties = new IOProperties();
    JCheckBoxMenuItem jCheckBoxMenuItem1 =
        new JCheckBoxMenuItem(
            "Color to Max Value for Point",
            str.equals("" + JComponentExtension.ExceptionInVPackage));
    IOProperties.ExceptionInVPackage(jCheckBoxMenuItem1);
    jCheckBoxMenuItem1.addItemListener(new fS(this));
    jMenu.add(jCheckBoxMenuItem1);
    JCheckBoxMenuItem jCheckBoxMenuItem2 =
        new JCheckBoxMenuItem(
            "Color to Average Value for Point",
            str.equals("" + JComponentExtension.ClassTypeInHPackage));
    IOProperties.ExceptionInVPackage(jCheckBoxMenuItem2);
    jCheckBoxMenuItem2.addItemListener(new fT(this));
    jMenu.add(jCheckBoxMenuItem2);
    JCheckBoxMenuItem jCheckBoxMenuItem3 =
        new JCheckBoxMenuItem(
            "Color to Min Value for Point",
            str.equals("" + JComponentExtension.AwInterfaceCharlie));
    IOProperties.ExceptionInVPackage(jCheckBoxMenuItem3);
    jCheckBoxMenuItem3.addItemListener(new fU(this));
    jMenu.add(jCheckBoxMenuItem3);
    jPopupMenu.add(jMenu);
    if (!this.BeInterfaceQuebec.ExceptionInVPackage() || !this.BeInterfaceQuebec.d()) {
      JMenuItem jMenuItem1 = new JMenuItem("Default X & Y Scale");
      jMenuItem1.addActionListener(new fV(this));
      jPopupMenu.add(jMenuItem1);
    }
    JMenuItem jMenuItem = new JMenuItem(O);
    jMenuItem.addActionListener(new fX(this));
    jPopupMenu.add(jMenuItem);
    jMenuItem = new JMenuItem(P);
    jMenuItem.addActionListener(new fY(this));
    jPopupMenu.add(jMenuItem);
    jMenuItem = new JMenuItem(Q);
    jMenuItem.addActionListener(new fZ(this));
    jPopupMenu.add(jMenuItem);
    jMenuItem = new JMenuItem(R);
    jMenuItem.addActionListener(new ga(this));
    jPopupMenu.add(jMenuItem);
    jMenuItem = new JMenuItem(S);
    jMenuItem.addActionListener(new gb(this));
    jPopupMenu.add(jMenuItem);
    jPopupMenu.show(paramComponent, paramInt1, paramInt2);
  }

  public void d(int paramInt) {
    this.z.AwInterfaceCharlie(paramInt);
    this.z.d();
    this.z.repaint();
    ExceptionInVPackage(this.U, paramInt + "");
  }

  public void h() {
    this.z.d();
    this.z.repaint();
    if (bq.ExceptionInVPackage().j() != null && bq.ExceptionInVPackage().j().d().equals(this)) {
      bq.ExceptionInVPackage().j().AwInterfaceCharlie().d();
      bq.ExceptionInVPackage().j().AwInterfaceCharlie().repaint();
    }
  }

  public void ExceptionInVPackage(
      double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    this.BeInterfaceQuebec.ClassTypeInHPackage(paramDouble1, paramDouble2);
    this.BeInterfaceQuebec.ExceptionInVPackage(paramDouble3, paramDouble4);
    this.BeInterfaceQuebec.ClassTypeInHPackage(false);
    this.BeInterfaceQuebec.ExceptionInVPackage(false);
    this.y.setVisible(true);
    repaint();
    if (bq.ExceptionInVPackage().j() != null && bq.ExceptionInVPackage().j().d().equals(this))
      bq.ExceptionInVPackage().j().AwInterfaceCharlie().ExceptionInVPackage();
  }

  public JComponentExtension IOProperties() {
    return this.z;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
