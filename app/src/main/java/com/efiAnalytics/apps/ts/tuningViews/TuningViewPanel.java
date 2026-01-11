package com.efiAnalytics.apps.ts.tuningViews;

import G.R;
import G.T;
import V.ExceptionInVPackage;
import bH.A;
import bH.D;
import bH.K;
import bH.aa;
import com.efiAnalytics.apps.ts.dashboard.aR;
import com.efiAnalytics.apps.ts.tuningViews.tuneComps.BurnButtonTv;
import com.efiAnalytics.apps.ts.tuningViews.tuneComps.SelectableTable;
import com.efiAnalytics.apps.ts.tuningViews.tuneComps.TableCellCrossHair;
import com.efiAnalytics.apps.ts.tuningViews.tuneComps.TuneSettingsPanel;
import com.efiAnalytics.apps.ts.tuningViews.tuneComps.TuneViewGaugeCluster;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.bq;
import com.efiAnalytics.ui.br;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.ct;
import com.efiAnalytics.ui.cz;
import com.efiAnalytics.ui.dn;
import com.efiAnalytics.ui.eJ;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.KeyboardFocusManager;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import n.ExceptionInVPackage;
import n.NInterfaceGolf;
import r.ExceptionInVPackage;
import r.RInterfaceIndia;
import r.ThreadedFile;
import s.NInterfaceGolf;
import v.NInterfaceGolf;

public class TuningViewPanel extends JPanel implements bc, ExceptionInVPackage, NInterfaceGolf {
  T ExceptionInVPackage = new TuningViewPanel(this);
  
  Q b = new TuningViewPanel(this);
  
  private int C = eJ.ExceptionInVPackage(8);
  
  private Window D = null;
  
  private Container E = null;
  
  boolean c = false;
  
  private Dimension F = null;
  
  private boolean G = false;
  
  private R H = null;
  
  List d = new ArrayList();
  
  private String I = null;
  
  private boolean J = false;
  
  private ArrayList K = new ArrayList();
  
  private boolean L = true;
  
  public static final String e = NInterfaceGolf.b("Edit Enabled Condition");
  
  public static final String f = NInterfaceGolf.b("Edit Tuning View Name");
  
  public static final String NInterfaceGolf = NInterfaceGolf.b("Bring Forward");
  
  public static final String h = NInterfaceGolf.b("Send Backward");
  
  public static final String RInterfaceIndia = NInterfaceGolf.b("Bring to Front");
  
  public static final String ThreadedFile = NInterfaceGolf.b("Send to Back");
  
  public static final String k = NInterfaceGolf.b("Gauge Properties");
  
  public static final String l = NInterfaceGolf.b("Add Settings Panel");
  
  public static final String m = NInterfaceGolf.b("Add Tuning Table");
  
  public static final String n = NInterfaceGolf.b("Add Gauge Cluster");
  
  public static final String o = NInterfaceGolf.b("Add Table Cell Cross Hair");
  
  public static final String p = NInterfaceGolf.b("Add Burn Button");
  
  public static final String q = NInterfaceGolf.b("Remove From Tuning View");
  
  public static final String r = NInterfaceGolf.b("Export / Save As");
  
  public static final String s = NInterfaceGolf.b("Save Tuning View");
  
  public static final String t = NInterfaceGolf.b("Load Tuning View");
  
  public static final String u = NInterfaceGolf.b("Designer Mode");
  
  public static final String v = NInterfaceGolf.b("Copy");
  
  public static final String w = NInterfaceGolf.b("Paste");
  
  public static final String x = NInterfaceGolf.b("Show Grid");
  
  public static final String y = u;
  
  private static String M = ThreadedFile.A() + ".tempView";
  
  private boolean N = true;
  
  private boolean O = true;
  
  private String P = null;
  
  private F Q = null;
  
  private Image R = null;
  
  X z = null;
  
  private String S = "";
  
  int A = eJ.ExceptionInVPackage(2);
  
  Stroke B = new BasicStroke(this.A);
  
  public TuningViewPanel() {
    TuningViewPanel(true);
    if (A.RInterfaceIndia().b()) {
      TuningViewPanel(new TuningViewPanel());
      TuningViewPanel(this.b);
      TuningViewPanel(this.b);
      TuningViewPanel(true);
      TuningViewPanel(true);
    } 
  }
  
  public void TuningViewPanel() {
    TuneSettingsPanel tuneSettingsPanel = new TuneSettingsPanel();
    try {
      ExceptionInVPackage((TuneViewComponent)tuneSettingsPanel);
    } TuningViewPanel(ExceptionInVPackage a1) {}
    TuningViewPanel();
  }
  
  public void ExceptionInVPackage(TuneViewComponent paramTuneViewComponent) {
    TuningViewPanel(paramTuneViewComponent);
    if (T.ExceptionInVPackage().c() != null)
      paramTuneViewComponent.initializeComponents(); 
    paramTuneViewComponent.addMouseListener(this.ExceptionInVPackage);
    paramTuneViewComponent.addMouseMotionListener(this.ExceptionInVPackage);
    paramTuneViewComponent.enableEditMode(B());
    if (B()) {
      this.K.clear();
      this.K.add(paramTuneViewComponent);
      TuningViewPanel();
    } 
    if (paramTuneViewComponent instanceof TuneViewGaugeCluster) {
      TuneViewGaugeCluster tuneViewGaugeCluster = (TuneViewGaugeCluster)paramTuneViewComponent;
      tuneViewGaugeCluster.addFullScreenRequestListener(new TuningViewPanel(this));
    } 
    if (B())
      TuningViewPanel(paramTuneViewComponent); 
  }
  
  public void TuningViewPanel() {
    Iterator<TuneViewComponent> iterator = TuningViewPanel().iterator();
    while (iterator.hasNext()) {
      TuneViewComponent tuneViewComponent = iterator.next();
      iterator.remove();
      TuningViewPanel(tuneViewComponent);
    } 
    TuningViewPanel();
  }
  
  public void TuningViewPanel(TuneViewComponent paramTuneViewComponent) {
    paramTuneViewComponent.removeMouseListener(this.ExceptionInVPackage);
    paramTuneViewComponent.removeMouseMotionListener(this.ExceptionInVPackage);
    TuningViewPanel(paramTuneViewComponent);
    paramTuneViewComponent.close();
    this.K.remove(paramTuneViewComponent);
    TuningViewPanel();
  }
  
  public void TuningViewPanel() {
    Component[] arrayOfComponent = TuningViewPanel();
    int RInterfaceIndia = TuningViewPanel();
    for (byte b = 0; b < RInterfaceIndia; b++) {
      if (arrayOfComponent[b] instanceof TuneViewComponent)
        TuningViewPanel((TuneViewComponent)arrayOfComponent[b]); 
    } 
    super.removeAll();
  }
  
  public void TuningViewPanel(Graphics paramGraphics) {
    if (B()) {
      paramGraphics.setColor(getBackground());
      paramGraphics.fillRect(0, 0, TuningViewPanel(), TuningViewPanel());
      if (this.O) {
        byte b = 10;
        Color color = UIManager.getColor("Button.disabledText");
        if (color == null)
          color = Color.GRAY; 
        paramGraphics.setColor(color);
        int RInterfaceIndia;
        for (RInterfaceIndia = 0; RInterfaceIndia < TuningViewPanel(); RInterfaceIndia += b)
          paramGraphics.drawLine(RInterfaceIndia, 0, RInterfaceIndia, TuningViewPanel()); 
        for (RInterfaceIndia = 0; RInterfaceIndia < TuningViewPanel(); RInterfaceIndia += b)
          paramGraphics.drawLine(0, RInterfaceIndia, TuningViewPanel(), RInterfaceIndia); 
      } 
      TuningViewPanel(paramGraphics);
      for (TuneViewComponent tuneViewComponent : this.K)
        ExceptionInVPackage(paramGraphics, tuneViewComponent); 
      ExceptionInVPackage(paramGraphics);
    } else {
      super.paint(paramGraphics);
    } 
    if (this.z != null && this.z.ExceptionInVPackage) {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      Image image = TuningViewPanel();
      if (image != null) {
        int RInterfaceIndia = image.getWidth(null) / 2;
        int ThreadedFile = image.getHeight(null) / 2;
        int k = (getWidth() - RInterfaceIndia) / 2;
        int m = (getHeight() - ThreadedFile) / 2;
        paramGraphics.drawImage(image, k, m, RInterfaceIndia, ThreadedFile, null);
      } 
    } 
    if (this.I != null) {
      paramGraphics.setFont(UIManager.getFont("TabbedPane.font"));
      paramGraphics.setColor(UIManager.getColor("Label.foreground"));
      int RInterfaceIndia = (getWidth() - paramGraphics.getFontMetrics().stringWidth(this.I)) / 2;
      paramGraphics.drawString(this.I, RInterfaceIndia, TuningViewPanel() / 2);
    } 
  }
  
  private void ExceptionInVPackage(Graphics paramGraphics) {
    if (this.b.ExceptionInVPackage() != null) {
      Rectangle rectangle = this.b.ExceptionInVPackage();
      paramGraphics.setColor(Color.YELLOW);
      paramGraphics.setXORMode(getBackground());
      int RInterfaceIndia = Math.abs(rectangle.width);
      int ThreadedFile = Math.abs(rectangle.height);
      int k = (rectangle.width < 0) ? (rectangle.x + rectangle.width) : rectangle.x;
      int m = (rectangle.height < 0) ? (rectangle.y + rectangle.height) : rectangle.y;
      BasicStroke basicStroke = new BasicStroke(1.0F, 0, 2, 0.0F, new float[] { 2.0F, 1.0F }, 0.0F);
      ((Graphics2D)paramGraphics).setStroke(basicStroke);
      paramGraphics.drawRect(k, m, RInterfaceIndia, ThreadedFile);
    } 
  }
  
  private void ExceptionInVPackage(Graphics paramGraphics, TuneViewComponent paramTuneViewComponent) {
    if (!B())
      return; 
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    int RInterfaceIndia = paramTuneViewComponent.getX();
    int ThreadedFile = paramTuneViewComponent.getY();
    int k = paramTuneViewComponent.getWidth();
    int m = paramTuneViewComponent.getHeight();
    int n = this.C - this.A / 2;
    if (k > 0 && m > 0) {
      graphics2D.setStroke(this.B);
      Color color = Color.yellow;
      paramGraphics.setColor(color);
      paramGraphics.drawLine(RInterfaceIndia + n, ThreadedFile + n, RInterfaceIndia + k - n, ThreadedFile + m - n);
      paramGraphics.drawLine(RInterfaceIndia + n, ThreadedFile + m - n, RInterfaceIndia + k - n, ThreadedFile + n);
      paramGraphics.fillRect(RInterfaceIndia, ThreadedFile, this.C, this.C);
      paramGraphics.fillRect(RInterfaceIndia, ThreadedFile + m - this.C, this.C, this.C);
      paramGraphics.fillRect(RInterfaceIndia + k - this.C, ThreadedFile, this.C, this.C);
      if (this.K.size() == 1)
        paramGraphics.setColor(Color.red); 
      paramGraphics.fillRect(RInterfaceIndia + k - this.C, ThreadedFile + m - this.C, this.C, this.C);
      String str = "X: " + RInterfaceIndia + ", Y:" + ThreadedFile + ", Width: " + k + ", Height: " + m;
      paramGraphics.setColor(Color.DARK_GRAY);
      paramGraphics.fillRect(RInterfaceIndia + 10, ThreadedFile, paramGraphics.getFontMetrics().stringWidth(str) + 10, paramGraphics.getFont().getSize() + 2);
      paramGraphics.setColor(Color.WHITE);
      paramGraphics.drawString(str, RInterfaceIndia + 15, ThreadedFile + paramGraphics.getFont().getSize() - 1);
    } 
  }
  
  public void ExceptionInVPackage(Component paramComponent, int paramInt1, int paramInt2) {
    boolean bool = ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage(ExceptionInVPackage.da, ExceptionInVPackage.db);
    if (bool)
      return; 
    JPopupMenu jPopupMenu = TuningViewPanel();
    TuningViewPanel(jPopupMenu);
    if (paramComponent != null) {
      jPopupMenu.show(paramComponent, paramInt1, paramInt2);
    } else {
      jPopupMenu.show(this, paramInt1, paramInt2);
    } 
  }
  
  public JPopupMenu TuningViewPanel() {
    br br = new TuningViewPanel();
    ExceptionInVPackage((bq)br);
    return (JPopupMenu)br;
  }
  
  public bq ExceptionInVPackage(bq parambq) {
    S s = new TuningViewPanel(this);
    JMenu jMenu = null;
    if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("43wunjt58j7tjtht")) {
      JMenu jMenu1 = new JMenu(NInterfaceGolf.b("Load / Save"));
      parambq.add(jMenu1);
      jMenu1.add(t).addActionListener(s);
      jMenu1.add(s).addActionListener(s);
      jMenu1.add(r).addActionListener(s);
    } 
    if (B()) {
      JMenu jMenu1 = new JMenu(NInterfaceGolf.b("Designer Menu"));
      jMenu1.add(f).addActionListener(s);
      jMenu1.add(e).addActionListener(s);
      jMenu = new JMenu(NInterfaceGolf.b("New"));
      jMenu.add(l).addActionListener(s);
      jMenu.add(m).addActionListener(s);
      jMenu.add(n).addActionListener(s);
      jMenu.add(o).addActionListener(s);
      if (!RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("OIJFDSFDSAPOFS"))
        jMenu.add(p).addActionListener(s); 
      jMenu1.add(jMenu);
      if (this.K.size() > 0)
        jMenu1.add(q).addActionListener(s); 
      if (r().size() > 0) {
        jMenu = new JMenu(NInterfaceGolf.b("Order"));
        jMenu.add(NInterfaceGolf).addActionListener(s);
        jMenu.add(h).addActionListener(s);
        jMenu.add(RInterfaceIndia).addActionListener(s);
        jMenu.add(ThreadedFile).addActionListener(s);
        jMenu1.add(jMenu);
      } 
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(x);
      jCheckBoxMenuItem.setState(this.O);
      jCheckBoxMenuItem.addActionListener(new TuningViewPanel(this));
      jMenu1.add(jCheckBoxMenuItem);
      parambq.add(jMenu1);
    } 
    if (P()) {
      JMenuItem jMenuItem = new JMenuItem(NInterfaceGolf.b("Full Screen"));
      jMenuItem.setSelected(s());
      jMenuItem.addActionListener(new TuningViewPanel(this));
      parambq.add(jMenuItem);
    } 
    if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage(";LFDS;LFDS0943;L")) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(u);
      jCheckBoxMenuItem.setState(B());
      jCheckBoxMenuItem.addActionListener(new TuningViewPanel(this));
      parambq.add(jCheckBoxMenuItem);
      if (!RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("sesrhsfghyuf754"))
        jCheckBoxMenuItem.setEnabled(false); 
    } 
    return parambq;
  }
  
  public Component TuningViewPanel() {
    return (this.K.size() > 0) ? this.K.get(0) : null;
  }
  
  public F NInterfaceGolf() {
    if (!this.J && this.Q != null)
      return this.Q; 
    F f = new TuningViewPanel();
    f.b(getName());
    f.d(this.S);
    if (T.ExceptionInVPackage().c() != null)
      f.ExceptionInVPackage(T.ExceptionInVPackage().c().RInterfaceIndia()); 
    for (byte b = 0; b < TuningViewPanel(); b++) {
      if (getComponent(b) instanceof TuneViewComponent)
        f.add((E)getComponent(b)); 
    } 
    try {
      File file = (new TuningViewPanel()).ExceptionInVPackage(this, 800, 450);
      f.ExceptionInVPackage(file);
    } TuningViewPanel(IOException iOException) {
      Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } TuningViewPanel(ExceptionInVPackage a1) {
      Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
    } 
    return f;
  }
  
  public void ExceptionInVPackage(String paramString) {
    if (paramString.equals(l)) {
      TuningViewPanel();
    } else if (paramString.equals(m)) {
      TuningViewPanel();
    } else if (paramString.equals(n)) {
      TuningViewPanel();
    } else if (paramString.equals(o)) {
      TuningViewPanel();
    } else if (paramString.equals(p)) {
      TuningViewPanel();
    } else if (paramString.equals(r)) {
      TuningViewPanel();
    } else if (paramString.equals(s)) {
      TuningViewPanel();
    } else if (paramString.equals(t)) {
      TuningViewPanel();
    } else if (paramString.equals(f)) {
      ThreadedFile();
    } else if (paramString.equals(e)) {
      TuningViewPanel();
    } 
    Component component = TuningViewPanel();
    if (component == null) {
      TuningViewPanel();
      return;
    } 
    if (paramString.equals(NInterfaceGolf)) {
      ExceptionInVPackage(component);
    } else if (paramString.equals(h)) {
      TuningViewPanel(component);
    } else if (paramString.equals(RInterfaceIndia)) {
      TuningViewPanel(component);
    } else if (paramString.equals(ThreadedFile)) {
      TuningViewPanel(component);
    } else if (component instanceof TuneViewComponent && paramString.equals(q)) {
      TuningViewPanel();
    } 
    TuningViewPanel();
  }
  
  private void TuningViewPanel() {
    String[] arrayOfString = { ExceptionInVPackage.cp };
    String str = (w() == null) ? ("*." + ExceptionInVPackage.cp) : TuningViewPanel();
    str = bV.ExceptionInVPackage(this, NInterfaceGolf.b("Save Tuning View"), arrayOfString, "*." + ExceptionInVPackage.cp, ThreadedFile.k().getAbsolutePath(), false);
    if (str == null)
      return; 
    if (!str.toLowerCase().endsWith("." + ExceptionInVPackage.cp.toLowerCase()))
      str = str + "." + ExceptionInVPackage.cp; 
    TuningViewPanel(str);
    ThreadedFile.e(new File(str));
  }
  
  public void TuningViewPanel() {
    if (w() != null) {
      ExceptionInVPackage(w(), (String)null);
      this.L = true;
    } else {
      TuningViewPanel();
    } 
  }
  
  public void TuningViewPanel(String paramString) {
    ExceptionInVPackage(paramString, (String)null);
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
    if (paramString1 == null || paramString1.trim().equals(""))
      return; 
    NInterfaceGolf g1 = new NInterfaceGolf();
    try {
      F f = NInterfaceGolf();
      File file = new File(paramString1);
      TuningViewPanel(this) {
        g1.ExceptionInVPackage(f, file);
      } 
    } TuningViewPanel(ExceptionInVPackage a1) {
      bV.d("Error saving Tuning View.\n" + a1.getMessage() + "\nCheck Log for more details", this);
    } 
  }
  
  public TuneViewComponent[] RInterfaceIndia() {
    ArrayList<Component> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < TuningViewPanel(); b1++) {
      if (getComponent(b1) instanceof TuneViewComponent)
        arrayList.add(getComponent(b1)); 
    } 
    TuneViewComponent[] arrayOfTuneViewComponent = new TuneViewComponent[arrayList.size()];
    for (byte b2 = 0; b2 < arrayList.size(); b2++)
      arrayOfTuneViewComponent[b2] = (TuneViewComponent)arrayList.get(b2); 
    return arrayOfTuneViewComponent;
  }
  
  public void ThreadedFile() {
    String str = JOptionPane.showInputDialog(this, "Change Tuning View Name", TuningViewPanel());
    if (str != null)
      TuningViewPanel(str); 
  }
  
  public void TuningViewPanel() {
    String str1 = (A() != null) ? TuningViewPanel() : "";
    String str2 = JOptionPane.showInputDialog(this, "Tuning View Enable Condition", str1);
    if (str2 != null)
      TuningViewPanel(str2); 
  }
  
  protected void TuningViewPanel() {
    TuningViewPanel();
  }
  
  public void TuningViewPanel() {
    b b = new TuningViewPanel();
    String[] arrayOfString1 = T.ExceptionInVPackage().d();
    String[] arrayOfString2 = new String[arrayOfString1.length];
    ArrayList<R> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < arrayOfString1.length; b1++) {
      R r = T.ExceptionInVPackage().c(arrayOfString1[b1]);
      arrayList.add(r);
      arrayOfString2[b1] = r.RInterfaceIndia();
    } 
    V v = new TuningViewPanel(this, b, arrayOfString2);
    J ThreadedFile = this;
    O o = new TuningViewPanel(this, arrayList, b, ThreadedFile);
    o.start();
    Window window1 = bV.b(this);
    Window window2 = window1;
    if (!(window2 instanceof java.awt.Dialog) && !(window2 instanceof java.awt.Frame))
      window2 = null; 
    ct ct = new TuningViewPanel(window2, b, "Select Tuning View", v, 7);
    if (v != null)
      ct.ExceptionInVPackage(v); 
    ct.setSize(640, 480);
    bV.ExceptionInVPackage(window1, (Component)ct);
    ct.setVisible(true);
  }
  
  public void ExceptionInVPackage(F paramF) {
    this.Q = paramF;
    if (this.J)
      TuningViewPanel(); 
  }
  
  private void TuningViewPanel() {
    TuningViewPanel();
    aa aa = new TuningViewPanel();
    aa.ExceptionInVPackage();
    for (TuneViewComponent tuneViewComponent : this.Q) {
      try {
        ExceptionInVPackage(tuneViewComponent);
      } TuningViewPanel(ExceptionInVPackage a1) {
        Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
      } 
    } 
    TuningViewPanel(this.Q.e());
    TuningViewPanel();
    TuningViewPanel();
    D.d("Loaded TuningView Components for " + TuningViewPanel() + " in " + aa.d() + "ms.");
  }
  
  public void TuningViewPanel() {
    SelectableTable selectableTable = new SelectableTable();
    try {
      ExceptionInVPackage((TuneViewComponent)selectableTable);
    } TuningViewPanel(ExceptionInVPackage a1) {}
    TuningViewPanel();
  }
  
  public void TuningViewPanel() {
    TuneViewGaugeCluster tuneViewGaugeCluster = new TuneViewGaugeCluster();
    try {
      ExceptionInVPackage((TuneViewComponent)tuneViewGaugeCluster);
    } TuningViewPanel(ExceptionInVPackage a1) {}
    TuningViewPanel();
  }
  
  public void TuningViewPanel() {
    TableCellCrossHair tableCellCrossHair = new TableCellCrossHair();
    try {
      ExceptionInVPackage((TuneViewComponent)tableCellCrossHair);
    } TuningViewPanel(ExceptionInVPackage a1) {}
    TuningViewPanel();
  }
  
  public void TuningViewPanel() {
    BurnButtonTv burnButtonTv = new BurnButtonTv();
    try {
      ExceptionInVPackage((TuneViewComponent)burnButtonTv);
    } TuningViewPanel(ExceptionInVPackage a1) {}
    TuningViewPanel();
  }
  
  public void ExceptionInVPackage(Component paramComponent) {
    int RInterfaceIndia = TuningViewPanel(paramComponent);
    if (RInterfaceIndia > 0 && RInterfaceIndia < TuningViewPanel() - 1)
      TuningViewPanel(paramComponent, RInterfaceIndia - 1); 
  }
  
  public void TuningViewPanel(Component paramComponent) {
    int RInterfaceIndia = TuningViewPanel(paramComponent);
    if (RInterfaceIndia >= 0 && RInterfaceIndia < TuningViewPanel() - 1)
      TuningViewPanel(paramComponent, RInterfaceIndia + 1); 
  }
  
  public void TuningViewPanel(Component paramComponent) {
    TuningViewPanel(paramComponent, TuningViewPanel() - 1);
  }
  
  public void TuningViewPanel(Component paramComponent) {
    TuningViewPanel(paramComponent, 0);
  }
  
  public ArrayList TuningViewPanel() {
    return this.K;
  }
  
  public boolean TuningViewPanel() {
    return (this.D != null);
  }
  
  public void TuningViewPanel() {
    if (this.D == null) {
      D.c("FullScreen");
      TuningViewPanel();
    } else {
      D.c("End FullScreen");
      TuningViewPanel();
    } 
  }
  
  public void TuningViewPanel() {
    if (this.E != null && this.D != null) {
      this.E.add(this);
      TuningViewPanel();
      this.E.validate();
      if (bH.J.c());
      this.D.dispose();
      this.D = null;
      this.c = false;
    } 
  }
  
  public void ExceptionInVPackage(Rectangle paramRectangle) {
    Component[] arrayOfComponent = TuningViewPanel();
    TuneViewComponent tuneViewComponent = null;
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof TuneViewComponent) {
        TuneViewComponent tuneViewComponent1 = (TuneViewComponent)arrayOfComponent[b];
        Rectangle rectangle = tuneViewComponent1.getBounds();
        if (rectangle.x > paramRectangle.x && rectangle.y > paramRectangle.y && rectangle.x + rectangle.width < paramRectangle.x + paramRectangle.width && rectangle.y + rectangle.height < paramRectangle.y + paramRectangle.height) {
          ExceptionInVPackage(tuneViewComponent1, false);
          if (tuneViewComponent == null)
            tuneViewComponent = tuneViewComponent1; 
        } 
      } 
    } 
    if (tuneViewComponent != null)
      tuneViewComponent.requestFocus(); 
  }
  
  public boolean TuningViewPanel(TuneViewComponent paramTuneViewComponent) {
    return this.K.contains(paramTuneViewComponent);
  }
  
  public void TuningViewPanel() {
    if (this.N && !s()) {
      this.E = TuningViewPanel();
      this.D = new TuningViewPanel(this, bV.ExceptionInVPackage(this));
      this.D.setLayout(new BorderLayout());
      GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
      Point point = MouseInfo.getPointerInfo().getLocation();
      Rectangle rectangle = dn.ExceptionInVPackage(point.x, point.y);
      this.D.setBounds(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
      JPanel jPanel = new JPanel();
      jPanel.setDoubleBuffered(true);
      jPanel.setLayout(new GridLayout(1, 1));
      jPanel.add(this);
      this.D.add("Center", jPanel);
      if (bH.J.c()) {
        K.ExceptionInVPackage(this.D);
        K.b(this.D);
      } else if (!bH.J.ExceptionInVPackage() && graphicsDevice.isFullScreenSupported()) {
        graphicsDevice.setFullScreenWindow(this.D);
      } 
      this.D.setVisible(true);
      this.D.validate();
    } 
  }
  
  public TuneViewComponent ExceptionInVPackage(int paramInt1, int paramInt2) {
    for (TuneViewComponent tuneViewComponent : this.K) {
      int ThreadedFile = tuneViewComponent.getX() + tuneViewComponent.getWidth() - this.C;
      int k = tuneViewComponent.getY() + tuneViewComponent.getHeight() - this.C;
      int m = tuneViewComponent.getX() + tuneViewComponent.getWidth();
      int n = tuneViewComponent.getY() + tuneViewComponent.getHeight();
      if (paramInt1 >= ThreadedFile && paramInt1 <= m && paramInt2 >= k && paramInt2 <= n)
        return tuneViewComponent; 
    } 
    Component[] arrayOfComponent = TuningViewPanel();
    for (int RInterfaceIndia = TuningViewPanel() - 1; RInterfaceIndia >= 0; RInterfaceIndia--) {
      if (arrayOfComponent[RInterfaceIndia] instanceof TuneViewComponent) {
        TuneViewComponent tuneViewComponent = (TuneViewComponent)arrayOfComponent[RInterfaceIndia];
        int ThreadedFile = tuneViewComponent.getX();
        int k = tuneViewComponent.getY();
        int m = tuneViewComponent.getX() + tuneViewComponent.getWidth();
        int n = tuneViewComponent.getY() + tuneViewComponent.getHeight();
        if (tuneViewComponent instanceof aR) {
          aR aR = (aR)tuneViewComponent;
          if (paramInt1 >= ThreadedFile && paramInt1 <= m && paramInt2 >= k && paramInt2 <= n && aR.isComponentPaintedAt(paramInt1 - ThreadedFile, paramInt2 - k))
            return tuneViewComponent; 
        } else if (paramInt1 >= ThreadedFile && paramInt1 <= m && paramInt2 >= k && paramInt2 <= n) {
          return tuneViewComponent;
        } 
      } 
    } 
    return null;
  }
  
  public Dimension TuningViewPanel() {
    return (this.F != null) ? this.F : super.getPreferredSize();
  }
  
  public Dimension TuningViewPanel() {
    return (this.F != null) ? this.F : super.getMinimumSize();
  }
  
  public void TuningViewPanel() {
    D.c("Closing TuneViewPanel " + TuningViewPanel());
    for (byte b = 0; b < TuningViewPanel(); b++) {
      if (getComponent(b) instanceof bc)
        ((bc)getComponent(b)).close(); 
    } 
    TuningViewPanel();
  }
  
  public String TuningViewPanel() {
    String str = super.getName();
    if (str == null || str.isEmpty())
      str = "TuningPanel" + (int)(Math.random() * 200.0D); 
    return str;
  }
  
  public String TuningViewPanel() {
    return this.P;
  }
  
  public void TuningViewPanel(String paramString) {
    this.P = paramString;
  }
  
  public boolean ExceptionInVPackage() {
    this.J = true;
    if (this.Q != null && TuningViewPanel() == 0) {
      P p = new TuningViewPanel(this);
      SwingUtilities.invokeLater(p);
    } 
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(M());
    return true;
  }
  
  public void TuningViewPanel() {
    KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(M());
  }
  
  protected Image TuningViewPanel() {
    if (this.R == null)
      try {
        this.R = cO.ExceptionInVPackage().ExceptionInVPackage(cO.w);
        this.R = eJ.ExceptionInVPackage(this.R, this);
      } TuningViewPanel(ExceptionInVPackage a1) {
        Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
      }  
    return this.R;
  }
  
  public void TuningViewPanel() {
    TuningViewPanel();
    this.z = new TuningViewPanel(this);
    this.z.start();
    this.I = null;
  }
  
  public void TuningViewPanel() {
    if (this.z != null) {
      this.z.ExceptionInVPackage();
      this.z = null;
    } 
    TuningViewPanel();
  }
  
  public String TuningViewPanel() {
    return this.S;
  }
  
  public void TuningViewPanel(String paramString) {
    this.S = paramString;
  }
  
  public void TuningViewPanel(String paramString) {
    this.I = paramString;
  }
  
  public void TuningViewPanel(Dimension paramDimension) {
    this.F = paramDimension;
  }
  
  public boolean TuningViewPanel() {
    return this.G;
  }
  
  public void ExceptionInVPackage(boolean paramBoolean) {
    if (paramBoolean)
      this.L = false; 
    this.G = paramBoolean;
    for (byte b = 0; b < TuningViewPanel(); b++) {
      if (getComponent(b) instanceof TuneViewComponent)
        ((TuneViewComponent)getComponent(b)).enableEditMode(paramBoolean); 
    } 
    TuningViewPanel();
    TuningViewPanel();
  }
  
  public void TuningViewPanel() {
    this.K.clear();
  }
  
  public void ExceptionInVPackage(TuneViewComponent paramTuneViewComponent, boolean paramBoolean) {
    if (paramBoolean)
      this.K.clear(); 
    if (this.K.contains(paramTuneViewComponent) && !paramBoolean) {
      this.K.remove(paramTuneViewComponent);
    } else {
      this.K.add(paramTuneViewComponent);
      paramTuneViewComponent.requestFocus();
    } 
  }
  
  public void TuningViewPanel() {
    for (TuneViewComponent tuneViewComponent : this.K) {
      tuneViewComponent.setSize(tuneViewComponent.getWidth() + 1, tuneViewComponent.getHeight());
      tuneViewComponent.updateRelativeBoundsToCurrent();
      tuneViewComponent.validate();
    } 
  }
  
  public void TuningViewPanel() {
    for (TuneViewComponent tuneViewComponent : this.K) {
      tuneViewComponent.setSize(tuneViewComponent.getWidth() - 1, tuneViewComponent.getHeight());
      tuneViewComponent.updateRelativeBoundsToCurrent();
      tuneViewComponent.validate();
    } 
  }
  
  public void TuningViewPanel() {
    for (TuneViewComponent tuneViewComponent : this.K) {
      tuneViewComponent.setSize(tuneViewComponent.getWidth(), tuneViewComponent.getHeight() + 1);
      tuneViewComponent.updateRelativeBoundsToCurrent();
      tuneViewComponent.validate();
    } 
  }
  
  public void TuningViewPanel() {
    for (TuneViewComponent tuneViewComponent : this.K) {
      tuneViewComponent.setSize(tuneViewComponent.getWidth(), tuneViewComponent.getHeight() - 1);
      tuneViewComponent.updateRelativeBoundsToCurrent();
      tuneViewComponent.validate();
    } 
  }
  
  public void TuningViewPanel() {
    for (TuneViewComponent tuneViewComponent : this.K)
      tuneViewComponent.validate(); 
  }
  
  public void TuningViewPanel() {
    for (TuneViewComponent tuneViewComponent : TuningViewPanel()) {
      tuneViewComponent.setLocation((tuneViewComponent.getLocation()).x + 1, (tuneViewComponent.getLocation()).y);
      tuneViewComponent.updateRelativeBoundsToCurrent();
    } 
  }
  
  public void TuningViewPanel() {
    for (TuneViewComponent tuneViewComponent : TuningViewPanel()) {
      tuneViewComponent.setLocation((tuneViewComponent.getLocation()).x - 1, (tuneViewComponent.getLocation()).y);
      tuneViewComponent.updateRelativeBoundsToCurrent();
    } 
  }
  
  public void TuningViewPanel() {
    for (TuneViewComponent tuneViewComponent : TuningViewPanel()) {
      tuneViewComponent.setLocation((tuneViewComponent.getLocation()).x, (tuneViewComponent.getLocation()).y - 1);
      tuneViewComponent.updateRelativeBoundsToCurrent();
    } 
  }
  
  public void TuningViewPanel() {
    for (TuneViewComponent tuneViewComponent : TuningViewPanel()) {
      tuneViewComponent.setLocation((tuneViewComponent.getLocation()).x, (tuneViewComponent.getLocation()).y + 1);
      tuneViewComponent.updateRelativeBoundsToCurrent();
    } 
  }
  
  public R TuningViewPanel() {
    if (this.H == null)
      this.H = new TuningViewPanel(this, this); 
    return this.H;
  }
  
  public void TuningViewPanel() {
    Component[] arrayOfComponent = TuningViewPanel();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof TuneViewComponent) {
        if (f() == null) {
          ExceptionInVPackage((TuneViewComponent)arrayOfComponent[b], true);
          TuningViewPanel();
          return;
        } 
        if (r().contains(arrayOfComponent[b])) {
          if (arrayOfComponent.length > b + 1 && arrayOfComponent[b + 1] instanceof TuneViewComponent) {
            ExceptionInVPackage((TuneViewComponent)arrayOfComponent[b + 1], true);
            TuningViewPanel();
            return;
          } 
          if (arrayOfComponent[0] instanceof TuneViewComponent) {
            ExceptionInVPackage((TuneViewComponent)arrayOfComponent[0], true);
            TuningViewPanel();
            return;
          } 
        } 
      } 
    } 
  }
  
  public boolean TuningViewPanel() {
    TuneViewComponent[] arrayOfTuneViewComponent = RInterfaceIndia();
    for (TuneViewComponent tuneViewComponent : arrayOfTuneViewComponent) {
      if (tuneViewComponent.isDirty())
        return false; 
    } 
    return this.L;
  }
  
  public void TuningViewPanel(boolean paramBoolean) {
    TuneViewComponent[] arrayOfTuneViewComponent = RInterfaceIndia();
    for (TuneViewComponent tuneViewComponent : arrayOfTuneViewComponent)
      tuneViewComponent.setClean(paramBoolean); 
    this.L = paramBoolean;
    this.I = null;
  }
  
  public boolean TuningViewPanel() {
    return (this.N && RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("d67nhtrbd4es8j"));
  }
  
  public void ExceptionInVPackage(m paramm) {
    if (!this.d.contains(paramm))
      this.d.add(paramm); 
  }
  
  private boolean TuningViewPanel(String paramString1, String paramString2) {
    for (m m : this.d) {
      if (!m.ExceptionInVPackage(paramString1, paramString2))
        return false; 
    } 
    return true;
  }
  
  public void TuningViewPanel(String paramString) {
    String str = TuningViewPanel();
    if (b(str, paramString))
      super.setName(paramString); 
  }
  
  public boolean TuningViewPanel() {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */