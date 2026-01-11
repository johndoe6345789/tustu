package com.efiAnalytics.ui;

import V.a;
import bH.D;
import bH.X;
import bH.ab;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.MediaTracker;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import r.a;
import r.i;

public class TableEditorPanel extends JPanel implements TableModelListener {
  protected BinTableView a = null;
  
  ae b = null;
  
  ae c = null;
  
  JTableHeader d = null;
  
  JPanel e = null;
  
  ak f = null;
  
  JPanel g;
  
  JPanel h = null;
  
  JCheckBox i = null;
  
  int j = -1;
  
  private int w = 0;
  
  private final ArrayList x = new ArrayList();
  
  private boolean y = true;
  
  private int z = -1;
  
  ArrayList k = new ArrayList();
  
  private boolean A = true;
  
  private final ArrayList B = new ArrayList();
  
  ah l = new ah(this);
  
  ah m = new ah(this);
  
  int n = 0;
  
  JPanel o = new JPanel();
  
  JPanel p = new JPanel();
  
  private int C = 0;
  
  private boolean D = false;
  
  JButton q = null;
  
  JButton r = null;
  
  JButton s = null;
  
  JButton t = null;
  
  int u = 0;
  
  private final List E = new ArrayList();
  
  JPanel v = new JPanel();
  
  private boolean F = false;
  
  public w(s params) {
    this();
    a(params);
  }
  
  public w() {
    if (UIManager.getLookAndFeel().toString().contains("Nimbus")) {
      this.u = 2;
    } else {
      this.u = 1;
    } 
    setLayout(new BorderLayout(1, 1));
    JPanel jPanel1 = new JPanel();
    add("Center", jPanel1);
    jPanel1.setLayout(new BorderLayout(1, 1));
    this.e = new JPanel();
    this.e.setLayout(new BorderLayout());
    this.a = new BinTableView(new s());
    this.j = this.a.Q() + 3;
    this.a.setDoubleBuffered(true);
    this.a.setRowHeight(this.j);
    this.e.add("Center", this.a);
    this.d = this.a.createDefaultTableHeader();
    this.d.setFont(new Font(this.a.getFont().getFamily(), 0, this.a.Q() - 2));
    this.d.setReorderingAllowed(false);
    this.d.setBackground(Color.lightGray);
    this.d.setForeground(Color.BLACK);
    this.d.addMouseListener(new x(this));
    this.a.setTableHeader(this.d);
    this.d.setMinimumSize(new Dimension(10, this.j));
    this.d.setPreferredSize(new Dimension(10, this.j));
    this.e.add("South", this.d);
    this.d.setFocusable(false);
    jPanel1.add("Center", this.e);
    jPanel1.add("North", a());
    String[] arrayOfString = new String[1];
    arrayOfString[0] = " ";
    this.b = new ae(this, ((s)this.a.getModel()).x(), (Object[])arrayOfString);
    this.b.setFont(this.a.getFont());
    this.b.setBackground(Color.lightGray);
    this.b.setForeground(Color.BLACK);
    this.b.setEnabled(false);
    this.b.addMouseListener(new I(this));
    this.b.setPreferredSize(new Dimension(this.a.j(), 0));
    this.b.setRowHeight(this.j);
    this.b.setSelectionMode(0);
    this.b.setDefaultRenderer(String.class, new ai(this));
    this.b.setFocusable(false);
    this.v.setLayout(new BorderLayout());
    this.v.add("Center", this.b);
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/xy16.png"));
    ImageIcon imageIcon = new ImageIcon(image);
    if (BinTableView.S()) {
      this.s = new JButton(null, imageIcon);
      this.s.setToolTipText(c("Toggle Re-bin X & Y"));
    } else {
      this.s = new ag(this, null, imageIcon);
      this.s.setToolTipText(c("Upgrade to enable X-Y Re-Bin"));
    } 
    this.v.add("South", this.s);
    this.s.addActionListener(new L(this));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(1, 2));
    this.l.setLayout(new GridLayout(0, 1, 2, 1));
    jPanel2.add("West", this.l);
    jPanel2.add("East", this.v);
    jPanel1.add("West", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    this.m.setLayout(new GridLayout(1, 0, 2, 3));
    this.o.setLayout(new BorderLayout());
    this.o.add("North", this.m);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new FlowLayout(2));
    this.r = new JButton(c("Apply New X&Y, Z Unchanged"));
    this.r.addActionListener(new M(this));
    jPanel4.add(this.r);
    this.q = new JButton(c("Apply New X&Y values, Interpolate Z"));
    this.q.addActionListener(new N(this));
    jPanel4.add(this.q);
    this.o.add("Center", jPanel4);
    jPanel3.add("West", this.p);
    jPanel3.add("Center", this.o);
    this.n = (jPanel3.getPreferredSize()).height;
    jPanel1.add("South", jPanel3);
    g(false);
  }
  
  public void c() {
    if (this.h == null) {
      this.h = new JPanel();
      this.a.e(true);
      this.h.setLayout(new FlowLayout(2));
      this.i = new JCheckBox(c("Follow Mode"));
      this.i.addActionListener(new O(this));
      this.a.a(new P(this));
      this.h.add(this.i);
      this.f.add("Center", this.h);
    } 
  }
  
  public boolean requestFocusInWindow() {
    return this.a.requestFocusInWindow();
  }
  
  private JToolBar a() {
    int i = eJ.a(22);
    this.f = new ak(this, "Edit table values");
    this.f.setFloatable(false);
    this.f.setLayout(new BorderLayout());
    this.g = new JPanel();
    this.g.setLayout(new GridLayout(1, 0, eJ.a(3), eJ.a(3)));
    MediaTracker mediaTracker = new MediaTracker(this.g);
    boolean bool = true;
    this.f.add("East", this.g);
    try {
      Image image1 = cO.a().a(cO.N, this.g, 22);
      ImageIcon imageIcon1 = new ImageIcon(image1);
      this.t = new JButton(imageIcon1);
      this.t.setFocusable(false);
      this.t.addActionListener(new Q(this));
      this.t.setPreferredSize(new Dimension(i, i));
      this.g.add(this.t);
      JLabel jLabel = new JLabel(" ");
      jLabel.setPreferredSize(new Dimension(i, i));
      this.g.add(jLabel);
      this.t.setVisible(false);
    } catch (a a) {
      bV.d(c("Failed to create Resize Button.") + "\n" + a.getLocalizedMessage(), this);
    } 
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/export_sm.png"));
    mediaTracker.addImage(image, bool);
    a(mediaTracker);
    mediaTracker.removeImage(image, bool);
    image = eJ.a(image);
    ImageIcon imageIcon = new ImageIcon(image);
    JButton jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText("Export Table");
    jButton.addActionListener(new R(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.g.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/import_sm.png"));
    mediaTracker.addImage(image, bool);
    a(mediaTracker);
    mediaTracker.removeImage(image, bool);
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText("Import Table");
    jButton.addActionListener(new y(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.g.add(jButton);
    this.B.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/equal_sign_16.png"));
    mediaTracker.addImage(image, bool);
    a(mediaTracker);
    mediaTracker.removeImage(image, bool);
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText("Set to - Key: =");
    jButton.addActionListener(new z(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.g.add(jButton);
    this.B.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/up_16.png"));
    mediaTracker.addImage(image, bool);
    a(mediaTracker);
    mediaTracker.removeImage(image, bool);
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText("Increment - Key: > or ,");
    jButton.addActionListener(new A(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.g.add(jButton);
    this.B.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/down_16.png"));
    mediaTracker.addImage(image, bool);
    a(mediaTracker);
    mediaTracker.removeImage(image, bool);
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText("Decrement - Key: < or .");
    jButton.addActionListener(new B(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.g.add(jButton);
    this.B.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/minus_sign_16.png"));
    mediaTracker.addImage(image, bool);
    a(mediaTracker);
    mediaTracker.removeImage(image, bool);
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText("Decrease by - Key: -");
    jButton.addActionListener(new C(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.g.add(jButton);
    this.B.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/plus_sign_16.png"));
    mediaTracker.addImage(image, bool);
    a(mediaTracker);
    mediaTracker.removeImage(image, bool);
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText("Increase by - Key: +");
    jButton.addActionListener(new D(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.g.add(jButton);
    this.B.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/times_sign_16.png"));
    mediaTracker.addImage(image, bool);
    a(mediaTracker);
    mediaTracker.removeImage(image, bool);
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText("Scale by - Key: *");
    jButton.addActionListener(new E(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.g.add(jButton);
    this.B.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/interpolate.png"));
    mediaTracker.addImage(image, bool);
    a(mediaTracker);
    mediaTracker.removeImage(image, bool);
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText("Interpolate - Key: /");
    jButton.addActionListener(new F(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.g.add(jButton);
    this.B.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/interpolateHorizontal.png"));
    mediaTracker.addImage(image, bool);
    a(mediaTracker);
    mediaTracker.removeImage(image, bool);
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    if (BinTableView.S()) {
      jButton = new JButton(null, imageIcon);
    } else {
      jButton = new ag(this, null, imageIcon);
    } 
    jButton.setFocusable(false);
    jButton.setToolTipText("Interpolate Horizontal - Key: H");
    jButton.addActionListener(new G(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.g.add(jButton);
    this.B.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/interpolateVertical.png"));
    mediaTracker.addImage(image, bool);
    a(mediaTracker);
    mediaTracker.removeImage(image, bool);
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    if (BinTableView.S()) {
      jButton = new JButton(null, imageIcon);
    } else {
      jButton = new ag(this, null, imageIcon);
    } 
    jButton.setFocusable(false);
    jButton.setToolTipText("Interpolate Vertical - Key: V");
    jButton.addActionListener(new H(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.g.add(jButton);
    this.B.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/smooth.png"));
    mediaTracker.addImage(image, bool);
    a(mediaTracker);
    mediaTracker.removeImage(image, bool);
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    if (BinTableView.S()) {
      jButton = new JButton(null, imageIcon);
    } else {
      jButton = new ag(this, null, imageIcon);
    } 
    jButton.setFocusable(false);
    jButton.setToolTipText("Smooth Cells - Key: s, " + c("Right click to set smoothing factor"));
    jButton.addMouseListener(new J(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.g.add(jButton);
    this.B.add(jButton);
    return this.f;
  }
  
  private void b() {
    br br = new br();
    this.a.a(br);
    this.t.add(br);
    br.show(this.t, 0, this.t.getHeight());
  }
  
  private synchronized void a(MediaTracker paramMediaTracker) {
    try {
      paramMediaTracker.waitForAll(250L);
    } catch (InterruptedException interruptedException) {}
  }
  
  private void s() {
    if (!BinTableView.S())
      return; 
    String str = bV.a(this, true, c("Smoothing Factor") + " (0.0 - 1.0) " + c("High for more smoothing."), this.a.M() + "");
    if (str != null && !str.equals("")) {
      float f = this.a.M();
      try {
        f = Float.parseFloat(str);
        this.a.a(f);
      } catch (Exception exception) {
        bV.d(c("Invalid Smoothing Factor") + " " + f, this);
      } 
    } 
  }
  
  private String c(String paramString) {
    if (this.a.K() != null)
      paramString = this.a.K().a(paramString); 
    return paramString;
  }
  
  public void d() {
    if (t()) {
      if (this.D) {
        s s = g();
        String[] arrayOfString1 = this.m.b();
        String[] arrayOfString2 = this.l.b();
        s.c(arrayOfString1);
        double d = Double.parseDouble(arrayOfString1[0]);
        a(d, d);
        for (byte b = 0; b < arrayOfString2.length; b++) {
          a(b, arrayOfString2[b]);
          try {
            double d1 = Double.parseDouble(arrayOfString2[b]);
            b(d1, d1);
          } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
          } 
        } 
        this.d.resizeAndRepaint();
      } else {
        s s1 = g();
        s s2 = fh.b(s1);
        String[] arrayOfString1 = this.m.b();
        String[] arrayOfString2 = this.l.b();
        s1.c(arrayOfString1);
        for (byte b = 0; b < arrayOfString2.length; b++)
          a(b, arrayOfString2[b]); 
        s2 = fh.b(s2, s1);
        this.d.resizeAndRepaint();
      } 
      this.a.repaint(1000L);
      this.a.validate();
    } 
  }
  
  private boolean t() {
    String[] arrayOfString1 = this.m.b();
    String[] arrayOfString2 = this.l.b();
    double d = Double.NaN;
    byte b;
    for (b = 0; b < arrayOfString1.length; b++) {
      try {
        double d1 = Double.parseDouble(arrayOfString1[b]);
        if (b == 0) {
          d = d1;
        } else if (d >= d1) {
          bV.d(c("Invalid value at column:") + " " + (b + 1) + "\n" + c("New X values should be low to high from left to right.") + "\n" + c("Please correct before applying new X & Y values."), this);
          return false;
        } 
      } catch (NumberFormatException numberFormatException) {
        bV.d(c("Non-Numeric value on X Axis on column:") + " " + (b + 1) + "\n" + c("Please correct before applying new X & Y values."), this);
        return false;
      } 
    } 
    if (g().I())
      for (b = 0; b < arrayOfString2.length; b++) {
        try {
          double d1 = Double.parseDouble(arrayOfString2[b]);
          if (b == 0) {
            d = d1;
          } else if (d < d1) {
            bV.d(c("Invalid value at row:") + " " + (b + 1) + "\n" + c("New Y values should be low to high from bottom to top.") + "\n" + c("Please correct before applying new X & Y values."), this);
            return false;
          } 
        } catch (NumberFormatException numberFormatException) {
          bV.d(c("Non-Numeric value on Y Axis on row:") + " " + (b + 1) + "\n" + c("Please correct before applying new X & Y values."), this);
          return false;
        } 
      }  
    return true;
  }
  
  public void e() {
    if (m()) {
      boolean bool = !v() ? true : false;
      u();
    } 
  }
  
  private void u() {
    w w1 = new w(g());
    JDialog jDialog = bV.b(w1, this, c("Re-Bin Table"), (bc)null);
    w1.g(true);
    w1.f(this.D);
    w1.h().a(h().b());
    w1.h().b(h().c());
    w1.m.b(h().c());
    w1.b(this.w);
    w1.h().c(h().N());
    Point point = getLocationOnScreen();
    Dimension dimension = getSize();
    w1.setPreferredSize(dimension);
    w1.k = this.k;
    if (this.D);
    w1.h().f(this.a.U());
    w1.b(false);
    jDialog.pack();
    int i = (jDialog.getInsets()).left + (jDialog.getInsets()).right + this.b.getWidth();
    int j = jDialog.getHeight() - w1.getHeight() + this.n + this.j;
    jDialog.setLocation(point.x - i, point.y - (jDialog.getInsets()).top);
    jDialog.setSize(dimension.width + i, dimension.height + j);
    jDialog.setVisible(true);
    jDialog.setSize(dimension.width + i, dimension.height + j + 2);
  }
  
  private void g(boolean paramBoolean) {
    this.o.setVisible(paramBoolean);
    this.l.setVisible(paramBoolean);
    this.p.setVisible(paramBoolean);
    this.s.setEnabled(!paramBoolean);
    validate();
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    fp.a(this, paramBoolean);
    this.d.setEnabled(paramBoolean);
    repaint();
    this.b.repaint();
  }
  
  private boolean v() {
    return this.o.isVisible();
  }
  
  public void a(ab paramab) {
    this.a.a(paramab);
  }
  
  public JTable f() {
    return this.b;
  }
  
  public void a(p paramp) {
    this.x.add(paramp);
  }
  
  private void a(int paramInt, String paramString1, String paramString2) {
    for (p p : this.x)
      p.a(paramInt, paramString1, paramString2); 
  }
  
  private void b(int paramInt, String paramString1, String paramString2) {
    for (p p : this.x)
      p.b(paramInt, paramString1, paramString2); 
    if (this.c != null && this.c.getModel() instanceof ec)
      ((ec)this.c.getModel()).a(); 
  }
  
  private void d(int paramInt) {
    if (!m() || !g().G())
      return; 
    JTable jTable = f();
    TableModel tableModel = jTable.getModel();
    String str = g().v();
    if (paramInt < tableModel.getRowCount()) {
      String str1;
      if (tableModel.getValueAt(paramInt, 0) != null) {
        double d1 = (Double.parseDouble(tableModel.getValueAt(paramInt, 0).toString()) - 100.0D) * 0.145038D;
        str1 = "" + X.b(d1, 2);
      } else {
        str1 = "";
      } 
      String str2 = bV.a(this, true, "Set " + str + " Value", str1);
      double d = Double.parseDouble(str2) / 0.145038D + 100.0D;
      str2 = "" + d;
      if (str2 != null && !str2.equals(""))
        a(paramInt, str2); 
      requestFocusInWindow();
    } 
  }
  
  private void e(int paramInt) {
    if (!m() || !g().G())
      return; 
    JTable jTable = f();
    TableModel tableModel = jTable.getModel();
    String str = g().v();
    if (paramInt < tableModel.getRowCount()) {
      String str1 = (tableModel.getValueAt(paramInt, 0) != null) ? tableModel.getValueAt(paramInt, 0).toString() : "";
      String str2 = bV.a(this, true, "Set " + str + " Value", str1);
      if (str2 != null && !str2.equals(""))
        a(paramInt, str2); 
      requestFocusInWindow();
    } 
  }
  
  public void a(int paramInt, String paramString) {
    JTable jTable = f();
    TableModel tableModel = jTable.getModel();
    s s = (s)this.a.getModel();
    String str = tableModel.getValueAt(paramInt, 0).toString();
    double d1 = Double.parseDouble(paramString);
    double d2 = 0.0D;
    try {
      d2 = Double.parseDouble(str);
    } catch (Exception exception) {}
    if (b(d1, d2)) {
      tableModel.setValueAt(paramString, paramInt, 0);
      s.b(paramString, paramInt);
      b(paramInt, paramString, str);
      jTable.repaint();
    } 
  }
  
  private void f(int paramInt) {
    if (!m())
      return; 
    String str1 = (String)this.d.getColumnModel().getColumn(paramInt).getHeaderValue();
    String str2 = g().w();
    String str3 = bV.a(this, true, "Set " + str2 + " Value", (String)this.d.getColumnModel().getColumn(paramInt).getHeaderValue());
    if (str3 != null && !str3.equals(""))
      b(paramInt, str3); 
    requestFocusInWindow();
  }
  
  public void b(int paramInt, String paramString) {
    String str = this.d.getColumnModel().getColumn(paramInt).getHeaderValue().toString();
    s s = (s)this.a.getModel();
    if (paramString.equals(str))
      return; 
    double d1 = Double.parseDouble(paramString);
    double d2 = 0.0D;
    try {
      d2 = Double.parseDouble(this.d.getColumnModel().getColumn(paramInt).getHeaderValue().toString());
    } catch (Exception exception) {}
    if (a(d1, d2)) {
      this.d.getColumnModel().getColumn(paramInt).setHeaderValue(paramString);
      s.a(paramString, paramInt);
      this.d.resizeAndRepaint();
      a(paramInt, paramString, str);
    } 
  }
  
  public Insets getInsets() {
    Insets insets = super.getInsets();
    insets.bottom += 4;
    insets.left += 4;
    insets.top += 4;
    insets.right += 4;
    return insets;
  }
  
  public void paint(Graphics paramGraphics) {
    try {
      super.paint(paramGraphics);
    } catch (Exception exception) {}
    if (!isEnabled()) {
      Color color = new Color(64, 64, 64, 80);
      paramGraphics.setColor(color);
      paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    } 
  }
  
  public void a(s params) {
    if (g() != null)
      g().removeTableModelListener(this); 
    params.addTableModelListener(this);
    this.a.setModel(params);
    k();
  }
  
  public s g() {
    return (s)this.a.getModel();
  }
  
  public BinTableView h() {
    return this.a;
  }
  
  public void a(String paramString) {
    this.f.setToolTipText(paramString);
  }
  
  public void b(String paramString) {
    this.f.a(paramString);
    this.f.repaint();
  }
  
  public boolean i() {
    return this.a.d();
  }
  
  public void j() {
    this.a.e();
  }
  
  public void k() {
    this.a.repaint();
    String[] arrayOfString = g().a();
    DefaultTableModel defaultTableModel = new DefaultTableModel();
    boolean bool = (this.l.getComponentCount() == 0) ? true : false;
    if (bool)
      this.l.removeAll(); 
    defaultTableModel.addColumn("");
    int i = 0;
    byte b1;
    for (b1 = 0; b1 < arrayOfString.length && arrayOfString[b1] != null; b1++) {
      if (arrayOfString[b1].length() > i)
        i = arrayOfString[b1].length(); 
    } 
    if (arrayOfString.length / 2 == g().getRowCount()) {
      for (b1 = 0; b1 < arrayOfString.length; b1++) {
        String[] arrayOfString1 = new String[1];
        arrayOfString1[0] = arrayOfString[b1];
        defaultTableModel.addRow((Object[])arrayOfString1);
        b1++;
      } 
    } else {
      for (b1 = 0; b1 < arrayOfString.length; b1++) {
        String[] arrayOfString1 = new String[1];
        arrayOfString1[0] = arrayOfString[b1];
        defaultTableModel.addRow((Object[])arrayOfString1);
      } 
    } 
    if (bool) {
      this.m.a(new S(this, g().b(), false));
      this.l.a(new S(this, g().a(), true));
    } 
    this.p.setMinimumSize(new Dimension(this.l.getParent().getWidth(), 20));
    this.p.setPreferredSize(new Dimension(this.l.getParent().getWidth(), 20));
    this.b.setModel(defaultTableModel);
    if (this.c != null && this.c.getModel() instanceof ec)
      ((ec)this.c.getModel()).a(defaultTableModel); 
    defaultTableModel.fireTableStructureChanged();
    TableColumnModel tableColumnModel = this.a.getColumnModel();
    for (byte b2 = 0; b2 < tableColumnModel.getColumnCount(); b2++) {
      TableColumn tableColumn = tableColumnModel.getColumn(b2);
      tableColumn.setHeaderValue(this.a.getModel().getColumnName(b2));
    } 
    this.d.repaint();
    ((s)this.a.getModel()).C();
    if (isVisible())
      try {
        super.validate();
      } catch (Exception exception) {} 
  }
  
  public void repaint() {
    super.repaint();
    if (this.b != null)
      this.b.repaint(); 
  }
  
  private void g(int paramInt) {
    if (!this.F) {
      int i = (int)Math.round(paramInt * 0.08D);
      i = (i < eJ.a(22)) ? eJ.a(22) : i;
      for (byte b = 0; b < this.f.getComponentCount(); b++) {
        Component component = this.f.getComponent(b);
        if (component instanceof JButton) {
          JButton jButton = (JButton)component;
          jButton.setPreferredSize(new Dimension(i, i));
        } else if (component instanceof JPanel) {
          JPanel jPanel = (JPanel)component;
          a(jPanel, i);
        } 
      } 
    } 
  }
  
  private void a(JPanel paramJPanel, int paramInt) {
    for (byte b = 0; b < paramJPanel.getComponentCount(); b++) {
      Component component = paramJPanel.getComponent(b);
      if (component instanceof JButton) {
        JButton jButton = (JButton)component;
        jButton.setPreferredSize(new Dimension(paramInt, paramInt));
        jButton.setMinimumSize(new Dimension(paramInt, paramInt));
      } else if (component instanceof JPanel) {
        JPanel jPanel = (JPanel)component;
        a(jPanel, paramInt);
      } 
    } 
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    g(paramInt4);
    if (this.a != null) {
      int i = this.l.isShowing() ? (this.a.getModel().getRowCount() + 2) : (this.a.getModel().getRowCount() + 1);
      int j = (int)((paramInt4 - 3) / i * 1.22D);
      j = (j < 1) ? 1 : j;
      int k = this.m.isShowing() ? (this.a.getModel().getColumnCount() + 2) : (this.a.getModel().getColumnCount() + 1);
      int m = (int)Math.round((paramInt3 / k) / y()) - this.u;
      m = (m < 1) ? 1 : m;
      int n = (m < j) ? m : j;
      if (j - i > m) {
        this.C = i;
      } else if (m - i * y() > j) {
        this.C = (int)-Math.round(k * y());
      } else {
        this.C = 0;
      } 
      this.a.e(n);
      this.l.a((n > 3) ? (n - 2) : n);
      this.m.a((n > 2) ? (n - 1) : n);
      TableColumnModel tableColumnModel = this.a.getColumnModel();
      int i1 = Math.round((paramInt3 / k));
      int i2;
      for (i2 = 0; i2 < tableColumnModel.getColumnCount(); i2++)
        tableColumnModel.getColumn(i2).setMaxWidth(i1); 
      this.b.a(i1);
      this.j = (paramInt4 - (getInsets()).top - (getInsets()).bottom - (this.f.getPreferredSize()).height - (this.o.isVisible() ? this.o.getHeight() : 0)) / (this.a.getModel().getRowCount() + 1);
      if (this.j > 0) {
        this.b.setRowHeight(this.j);
        this.a.setRowHeight(this.j);
        this.b.setFont(this.a.getFont());
        i2 = paramInt4 - (this.f.getPreferredSize()).height - (this.o.isVisible() ? this.o.getHeight() : 0) - this.j * this.a.getModel().getRowCount() - (getInsets()).top - (getInsets()).bottom;
        this.d.setMinimumSize(new Dimension(10, i2));
        this.d.setPreferredSize(new Dimension(10, i2));
        this.s.setPreferredSize(new Dimension(10, i2));
        if (this.l.a() != null)
          S.a(this.l.a(), i1, this.j); 
        if (this.m.a() != null)
          S.a(this.m.a(), i1, this.j); 
      } 
      if (this.c != null) {
        this.c.a(i1);
        this.c.setRowHeight(this.b.getRowHeight());
        this.c.setFont(w());
      } 
      l();
      super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
      try {
        k();
      } catch (Exception exception) {
        D.c("BinTablePanel::refresh error caught");
      } 
    } else {
      super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    } 
  }
  
  public void l() {
    this.b.setFont(this.a.getFont());
    this.b.repaint();
  }
  
  private Font w() {
    Font font = this.b.getFont();
    return (font.getSize() > 0) ? new Font(font.getFamily(), font.getStyle(), font.getSize() - 1) : new Font(font.getFamily(), font.getStyle(), 1);
  }
  
  public void setSize(Dimension paramDimension) {
    setSize(paramDimension.width, paramDimension.height);
  }
  
  public void a(boolean paramBoolean) {
    this.y = paramBoolean;
  }
  
  public boolean m() {
    return this.A;
  }
  
  public void b(boolean paramBoolean) {
    this.A = paramBoolean;
    this.s.setEnabled(paramBoolean);
    this.s.setToolTipText(paramBoolean ? "Edit X & Y Axis" : "X & Y are read only in this view.");
  }
  
  public void validate() {
    if (this.a != null) {
      boolean bool = (this.a.g() && isEnabled()) ? true : false;
      Iterator<Component> iterator = this.B.iterator();
      while (iterator.hasNext())
        ((Component)iterator.next()).setEnabled(bool); 
    } 
    super.validate();
  }
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    if (paramTableModelEvent.getColumn() == -1) {
      int i = paramTableModelEvent.getFirstRow();
      JTable jTable = f();
      TableModel tableModel = jTable.getModel();
      s s = (s)this.a.getModel();
      String str = s.a()[paramTableModelEvent.getFirstRow()];
      try {
        tableModel.setValueAt(str, i, 0);
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        D.c("Calling reFresh for Y Axis.");
        k();
      } 
      jTable.repaint();
    } 
  }
  
  public void c(boolean paramBoolean) {
    this.a.a(paramBoolean);
  }
  
  public int n() {
    return this.C;
  }
  
  public boolean isOptimizedDrawingEnabled() {
    return false;
  }
  
  public void a(am paramam) {
    this.a.a(paramam);
    this.t.setVisible(paramam.a());
  }
  
  public void d(boolean paramBoolean) {
    if (!i.a().a("645fds645fds  fdsd098532#@") || !a.a().c(a.cc, a.cd))
      paramBoolean = false; 
    if (paramBoolean && (this.c == null || !this.c.isVisible())) {
      if (this.c == null)
        x(); 
      this.v.remove(this.b);
      this.v.add("Center", this.c);
      this.c.setVisible(true);
    } else if (!paramBoolean && this.c != null && this.c.isVisible()) {
      this.c.setVisible(false);
      this.v.remove(this.c);
      this.v.add("Center", this.b);
    } 
    if (this.c != null)
      validate(); 
  }
  
  private void x() {
    double d = a.a().a(a.ai, 100.0D);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = " ";
    this.c = new ae(this, ((s)this.a.getModel()).y(), (Object[])arrayOfString);
    this.c.a(new al(this));
    this.c.setFont(w());
    this.c.setBackground(Color.lightGray);
    this.c.setForeground(Color.BLACK);
    this.c.setEnabled(false);
    this.c.addMouseListener(new K(this));
    this.c.setPreferredSize(new Dimension(this.a.j(), 0));
    this.c.setRowHeight(this.j);
    this.c.setSelectionMode(0);
    al al = new al(this);
    al.a(2);
    this.c.setDefaultRenderer(String.class, al);
    this.c.setDefaultRenderer(Double.class, al);
    this.c.setFocusable(false);
    ec ec = new ec();
    ec.b(-d);
    ec.a(0.145038D);
    this.c.setModel(ec);
    this.c.a(this.b.getWidth());
    this.c.setRowHeight(this.b.getRowHeight());
    this.c.setFont(w());
  }
  
  public void a(String paramString, int paramInt) {
    while (this.E.size() < paramInt)
      this.E.add(""); 
    this.E.add(paramInt, paramString);
  }
  
  public void o() {
    this.E.clear();
  }
  
  public int p() {
    return this.z;
  }
  
  public void e(boolean paramBoolean) {
    this.F = paramBoolean;
  }
  
  public void a(fz paramfz) {
    this.k.add(paramfz);
  }
  
  private boolean a(double paramDouble1, double paramDouble2) {
    for (fz fz : this.k) {
      if (!fz.a(paramDouble1, paramDouble2))
        return false; 
    } 
    return true;
  }
  
  private boolean b(double paramDouble1, double paramDouble2) {
    for (fz fz : this.k) {
      if (!fz.b(paramDouble1, paramDouble2))
        return false; 
    } 
    return true;
  }
  
  public int q() {
    return this.w;
  }
  
  public int r() {
    return this.a.c();
  }
  
  public void a(int paramInt) {
    this.m.b(paramInt);
    this.a.b(paramInt);
  }
  
  public void b(int paramInt) {
    if (this.w != paramInt) {
      this.w = paramInt;
      this.l.b(paramInt);
    } 
  }
  
  public void a(et paramet) {
    this.a.a(paramet);
  }
  
  public void c(int paramInt) {
    a(false);
    int i = (3 + paramInt) * (this.a.getRowCount() + 1) + (this.f.getPreferredSize()).height;
    int j = (int)(y() * paramInt) * (this.a.getColumnCount() + 1);
    setMinimumSize(new Dimension(j, i));
    setPreferredSize(new Dimension(j, i));
    this.z = paramInt;
    invalidate();
    doLayout();
  }
  
  private double y() {
    boolean bool = UIManager.getLookAndFeel().toString().contains("Nimbus");
    return bool ? ((z() <= 3 && this.w == 0) ? 2.65D : 3.75D) : ((z() <= 3 && this.w == 0) ? 2.65D : 3.27D);
  }
  
  private int z() {
    double d = 0.0D;
    TableModel tableModel = this.a.getModel();
    int i = tableModel.getRowCount();
    int j = tableModel.getColumnCount();
    int k;
    for (k = 0; k < i; k++) {
      for (byte b = 0; b < j; b++) {
        Double double_ = (Double)tableModel.getValueAt(k, b);
        if (double_ != null && Math.abs(double_.doubleValue()) > d)
          d = double_.doubleValue(); 
      } 
    } 
    k = (int)Math.log10(d);
    if (k == 0)
      k = 1; 
    return k + this.a.b();
  }
  
  public Dimension getPreferredSize() {
    if (this.z > 0 && !this.y) {
      int k = (4 + this.z) * (this.a.getRowCount() + 1) + (this.f.getPreferredSize()).height + 3;
      double d = y();
      int m = (int)(d * this.z) * (this.a.getColumnCount() + 1);
      return new Dimension(m, k);
    } 
    int i = (3 + this.a.getFont().getSize()) * (this.a.getRowCount() + 1) + (this.f.getPreferredSize()).height + 2;
    int j = (int)(y() * this.a.getFont().getSize()) * (this.a.getColumnCount() + 1);
    return new Dimension(j, i);
  }
  
  public Dimension getMinimumSize() {
    Dimension dimension = getPreferredSize();
    dimension.width /= 2;
    dimension.height /= 2;
    return dimension;
  }
  
  public void f(boolean paramBoolean) {
    this.D = paramBoolean;
    if (paramBoolean) {
      this.q.setText("Apply X & Y Axis Values");
      this.r.setVisible(false);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */