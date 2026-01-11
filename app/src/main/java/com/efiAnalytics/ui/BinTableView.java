package com.efiAnalytics.ui;

import V.ExceptionInVPackage;
import ak.AkInterfaceAe;
import bH.D;
import bH.I;
import bH.X;
import bH.ab;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import javax.swing.BorderFactory;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import javax.swing.event.TableColumnModelEvent;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class BinTableView extends JTable implements ClipboardOwner, HierarchyListener {
  private int D = 11;
  
  int ExceptionInVPackage = 0;
  
  int b = 0;
  
  Font c = new Font("Arial Unicode MS", 0, Q());
  
  Font d = new Font("Arial Unicode MS", 1, Q());
  
  private boolean E = false;
  
  private aD F = null;
  
  private aB G = null;
  
  public static int e = 0;
  
  public static int f = 1;
  
  public static int g = 2;
  
  private int H = f;
  
  private double I = Double.NaN;
  
  private double J = Double.NaN;
  
  boolean h = true;
  
  double i = -1.0D;
  
  double j = -1.0D;
  
  Clipboard k = Toolkit.getDefaultToolkit().getSystemClipboard();
  
  boolean l = false;
  
  private boolean K = true;
  
  aM[] m = null;
  
  private int L = 40;
  
  private et M = null;
  
  public static String n = "tableInitialDir";
  
  private ArrayList N = new ArrayList();
  
  private ab O = null;
  
  private int P = 5;
  
  private double Q = 0.05D;
  
  private double R = Double.NaN;
  
  private float S = Float.NaN;
  
  Image o = null;
  
  boolean p = true;
  
  private Map T = new HashMap<>();
  
  private static boolean U = false;
  
  private static boolean V = true;
  
  private float W = 0.7F;
  
  private boolean X = true;
  
  private boolean Y = true;
  
  private boolean Z = false;
  
  private boolean aa = false;
  
  private boolean ab = false;
  
  ArrayList q = new ArrayList();
  
  boolean r = false;
  
  private fA ac = null;
  
  Stroke s = new BasicStroke(2.0F);
  
  Stroke t = new BasicStroke(1.0F);
  
  Color u = new Color(0, 0, 255, 220);
  
  private double ad = 10.0D;
  
  aK v = new aK(this);
  
  private boolean ae = false;
  
  private am af = new aJ(this);
  
  NumericTextField w = null;
  
  NumericTextField x = null;
  
  JPanel y = null;
  
  String z = "";
  
  long A = 0L;
  
  boolean B = false;
  
  boolean C = false;
  
  public BinTableView(s params) {
    this();
    setModel(params);
  }
  
  public BinTableView() {
    DefaultListSelectionModel defaultListSelectionModel = new DefaultListSelectionModel();
    defaultListSelectionModel.setSelectionMode(2);
    setInputVerifier(new aI(this));
    setSelectionModel(defaultListSelectionModel);
    setFont(this.c);
    setColumnSelectionAllowed(true);
    aL aL = new aL(this);
    addMouseListener(aL);
    addMouseWheelListener(aL);
    UIManager.put("ToolTip.background", new Color(240, 240, 240));
    ToolTipManager.sharedInstance().setDismissDelay(15000);
    if (!U)
      this.L = 5; 
  }
  
  public void ExceptionInVPackage() {
    if (I()) {
      String str1 = d("History Trace Length");
      if (str1 != null && !str1.equals("")) {
        int i = (int)Math.round(Double.parseDouble(str1));
        c(i);
      } 
    } 
    String str = d("Smooth Cells - Key: s");
    if (str != null && !str.equals("")) {
      float f = Float.parseFloat(str);
      ExceptionInVPackage(f);
    } 
    str = d("Set increment amount");
    if (str != null && !str.equals("")) {
      float f = Float.parseFloat(str);
      b(f);
    } 
    str = d("Set number of increments (CTRL pressed)");
    if (str != null && !str.equals("")) {
      int i = (int)Float.parseFloat(str);
      d(i);
    } 
    str = d("Set percent increment size (SHIFT pressed)");
    if (str != null && !str.equals("")) {
      double d = Double.parseDouble(str);
      d(d);
    } 
    am();
    ah();
  }
  
  private String c(String paramString) {
    if (this.O != null) {
      String str = (String)this.T.get(paramString);
      if (str != null)
        return str; 
      str = this.O.ExceptionInVPackage(paramString);
      this.T.put(paramString, str);
      return str;
    } 
    return paramString;
  }
  
  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return ((getSelectedRows()).length <= 1 && (getSelectedColumns()).length <= 1 && g());
  }
  
  public void ExceptionInVPackage(int paramInt) {
    this.ExceptionInVPackage = paramInt;
  }
  
  public int b() {
    return this.ExceptionInVPackage;
  }
  
  public void b(int paramInt) {
    this.b = paramInt;
  }
  
  public int c() {
    return this.b;
  }
  
  public boolean d() {
    return this.l;
  }
  
  public void e() {
    this.l = false;
    if (getModel() instanceof s)
      ((s)getModel()).q(); 
  }
  
  public void lostOwnership(Clipboard paramClipboard, Transferable paramTransferable) {}
  
  public void f() {
    String str = "";
    int[] arrayOfInt1 = getSelectedColumns();
    int[] arrayOfInt2 = getSelectedRows();
    for (int i = arrayOfInt2[0]; i < getRowCount() && i <= arrayOfInt2[arrayOfInt2.length - 1]; i++) {
      for (int j = arrayOfInt1[0]; j < getColumnCount() && j <= arrayOfInt1[arrayOfInt1.length - 1]; j++) {
        s s = (s)getModel();
        Double double_ = s.d(i, j);
        if (double_ != null) {
          str = str + X.c(double_.doubleValue(), this.ExceptionInVPackage) + "\t";
        } else {
          str = str + "\t";
        } 
      } 
      str = str + "\n";
    } 
    StringSelection stringSelection = new StringSelection(str);
    this.k.setContents(stringSelection, this);
  }
  
  protected boolean g() {
    return T();
  }
  
  public void h() {
    if (!g())
      return; 
    D();
    s s = (s)getModel();
    String str = ad();
    if (str == null)
      return; 
    AkInterfaceAe AkInterfaceAe = new AkInterfaceAe(str, "\n");
    for (int i = getSelectedRow(); i < s.getRowCount() && AkInterfaceAe.ExceptionInVPackage(); i++) {
      AkInterfaceAe aE1 = new AkInterfaceAe(AkInterfaceAe.b(), "\t");
      for (int j = getSelectedColumn(); j < s.getColumnCount() && aE1.ExceptionInVPackage(); j++) {
        String str1 = aE1.b();
        try {
          if (I.ExceptionInVPackage(str1))
            s.setValueAt(new Double(str1), i, j); 
        } catch (Exception exception) {
          System.out.println("bad Double " + str1);
          return;
        } 
      } 
    } 
  }
  
  private void Z() {
    if (!g())
      return; 
    D();
    s s = (s)getModel();
    String str = ad();
    if (str == null)
      return; 
    AkInterfaceAe AkInterfaceAe = new AkInterfaceAe(str, "\n");
    for (int i = getSelectedRow(); i < s.getRowCount() && AkInterfaceAe.ExceptionInVPackage(); i++) {
      AkInterfaceAe aE1 = new AkInterfaceAe(AkInterfaceAe.b(), "\t");
      for (int j = getSelectedColumn(); j < s.getColumnCount() && aE1.ExceptionInVPackage(); j++) {
        String str1 = aE1.b();
        try {
          if (I.ExceptionInVPackage(str1)) {
            Double double_ = s.d(i, j);
            double d = Double.valueOf(str1).doubleValue() / 100.0D;
            if (d > -1.0D && d < 1.0D)
              d++; 
            s.setValueAt(Double.valueOf(double_.doubleValue() * d), i, j);
          } 
        } catch (Exception exception) {
          String str2 = "Bad Double " + str1;
          bV.d(str2, this);
          System.out.println("bad Double " + str1);
          return;
        } 
      } 
    } 
  }
  
  private void aa() {
    if (!g())
      return; 
    D();
    s s = (s)getModel();
    String str = ad();
    if (str == null)
      return; 
    AkInterfaceAe AkInterfaceAe = new AkInterfaceAe(str, "\n");
    for (int i = getSelectedRow(); i < s.getRowCount() && AkInterfaceAe.ExceptionInVPackage(); i++) {
      AkInterfaceAe aE1 = new AkInterfaceAe(AkInterfaceAe.b(), "\t");
      for (int j = getSelectedColumn(); j < s.getColumnCount() && aE1.ExceptionInVPackage(); j++) {
        String str1 = aE1.b();
        try {
          if (I.ExceptionInVPackage(str1)) {
            Double double_ = s.d(i, j);
            double d = Double.valueOf(str1).doubleValue();
            s.setValueAt(Double.valueOf(double_.doubleValue() * d), i, j);
          } 
        } catch (Exception exception) {
          String str2 = "Bad Double " + str1;
          bV.d(str2, this);
          System.out.println("bad Double " + str1);
          return;
        } 
      } 
    } 
  }
  
  private void ab() {
    if (!g())
      return; 
    D();
    s s = (s)getModel();
    String str = ad();
    if (str == null)
      return; 
    AkInterfaceAe AkInterfaceAe = new AkInterfaceAe(str, "\n");
    for (int i = getSelectedRow(); i < s.getRowCount() && AkInterfaceAe.ExceptionInVPackage(); i++) {
      AkInterfaceAe aE1 = new AkInterfaceAe(AkInterfaceAe.b(), "\t");
      for (int j = getSelectedColumn(); j < s.getColumnCount() && aE1.ExceptionInVPackage(); j++) {
        String str1 = aE1.b();
        try {
          if (I.ExceptionInVPackage(str1)) {
            Double double_ = s.d(i, j);
            double d = Double.valueOf(str1).doubleValue();
            s.setValueAt(Double.valueOf(double_.doubleValue() + d), i, j);
          } 
        } catch (Exception exception) {
          String str2 = "Bad Double " + str1;
          bV.d(str2, this);
          System.out.println("bad Double " + str1);
          return;
        } 
      } 
    } 
  }
  
  private void ac() {
    if (!g())
      return; 
    D();
    s s = (s)getModel();
    String str = ad();
    if (str == null)
      return; 
    AkInterfaceAe AkInterfaceAe = new AkInterfaceAe(str, "\n");
    for (int i = getSelectedRow(); i < s.getRowCount() && AkInterfaceAe.ExceptionInVPackage(); i++) {
      AkInterfaceAe aE1 = new AkInterfaceAe(AkInterfaceAe.b(), "\t");
      for (int j = getSelectedColumn(); j < s.getColumnCount() && aE1.ExceptionInVPackage(); j++) {
        String str1 = aE1.b();
        try {
          if (I.ExceptionInVPackage(str1)) {
            Double double_ = s.d(i, j);
            double d = Double.valueOf(str1).doubleValue();
            s.setValueAt(Double.valueOf(double_.doubleValue() - d), i, j);
          } 
        } catch (Exception exception) {
          String str2 = "Bad Double " + str1;
          bV.d(str2, this);
          System.out.println("bad Double " + str1);
          return;
        } 
      } 
    } 
  }
  
  private String ad() {
    String str = "";
    try {
      str = this.k.getData(DataFlavor.stringFlavor).toString();
    } catch (UnsupportedFlavorException|java.io.IOException unsupportedFlavorException) {
      String str1 = "Clipboard data not ExceptionInVPackage valid table copy";
      bV.d(str1, this);
      D.ExceptionInVPackage(str1, unsupportedFlavorException);
      return null;
    } 
    if (str == null || str.trim().isEmpty()) {
      String str1 = "Clipboard data Empty";
      bV.d(str1, this);
      return null;
    } 
    if (str.contains("\t")) {
      String str1 = str.substring(0, str.indexOf("\t"));
      try {
        double d = Double.parseDouble(str1);
      } catch (Exception exception) {
        String str2 = "Clipboard table data not numeric";
        bV.d(str2, this);
        return null;
      } 
    } else {
      try {
        double d = Double.parseDouble(str);
      } catch (Exception exception) {
        String str1 = "Clipboard data not numeric";
        bV.d(str1, this);
        return null;
      } 
    } 
    return str;
  }
  
  public TableCellEditor getCellEditor(int paramInt1, int paramInt2) {
    return super.getCellEditor(paramInt1, paramInt2);
  }
  
  protected TableColumnModel createDefaultColumnModel() {
    TableColumnModel tableColumnModel = super.createDefaultColumnModel();
    tableColumnModel.addColumnModelListener(this);
    return tableColumnModel;
  }
  
  public int i() {
    return getWidth() / getColumnModel().getColumnCount();
  }
  
  protected int j() {
    return getFont().getSize() * 3;
  }
  
  public void columnAdded(TableColumnModelEvent paramTableColumnModelEvent) {
    TableColumnModel tableColumnModel = (TableColumnModel)paramTableColumnModelEvent.getSource();
    TableColumn tableColumn = tableColumnModel.getColumn(paramTableColumnModelEvent.getToIndex());
    tableColumn.setMaxWidth(j());
    tableColumn.setPreferredWidth(j());
    super.columnAdded(paramTableColumnModelEvent);
  }
  
  public TableCellRenderer getCellRenderer(int paramInt1, int paramInt2) {
    if (this.Z)
      return R(); 
    s s = (s)getModel();
    b[][] arrayOfB = s.D();
    if (!getFont().equals(this.c))
      setFont(this.c); 
    if (U() == f && getModel().getValueAt(paramInt1, paramInt2) != null) {
      Double double_ = s.d(paramInt1, paramInt2);
      double d1 = Double.isNaN(this.J) ? s.A() : this.J;
      double d2 = Double.isNaN(this.I) ? s.B() : this.I;
      Color color = fh.ExceptionInVPackage(double_.doubleValue(), d1, d2);
      R().setBackground(color);
      R().setForeground(Color.black);
      if (arrayOfB != null && R() != null) {
        String str = "";
        if (arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].m()) {
          str = "<br>" + c("Cell is Locked from Analysis");
          R().setBackground(Color.LIGHT_GRAY);
        } 
        StringBuilder stringBuilder = new StringBuilder();
        if (this.Y && arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].h() > 1.8D) {
          stringBuilder.append("<html>").append(c("Begining Value")).append(": ").append(X.b(s.c(paramInt1, paramInt2).doubleValue())).append("<br> ").append(c("Hit Count")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].j()).append("<br> ").append(c("Hit Weighting")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].l()).append("<br> ").append(c("Target AFR")).append(":").append(X.b(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].h())).append(str).append("</html>");
        } else if (this.Y) {
          stringBuilder.append("<html>").append(c("Begining Value")).append(": ").append(X.b(s.c(paramInt1, paramInt2).doubleValue())).append("<br> ").append(c("Hit Count")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].j()).append("<br> ").append(c("Hit Weighting")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].l()).append("<br> ").append(c("Lambda AFR")).append(":").append(X.c(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].h(), 3)).append(str).append("</html>");
        } else {
          stringBuilder.append("<html>").append(c("Begining Value")).append(": ").append(X.b(s.c(paramInt1, paramInt2).doubleValue())).append("<br> ").append(c("Hit Count")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].j()).append("<br> ").append(c("Hit Weighting")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].l()).append("</html>");
        } 
        R().setToolTipText(stringBuilder.toString());
      } else if (!s.b(paramInt1, paramInt2) && R() != null) {
        try {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("<html>").append(c("Begining Value")).append(": ").append(X.b(s.c(paramInt1, paramInt2).doubleValue())).append("</html>");
          R().setToolTipText(stringBuilder.toString());
        } catch (Exception exception) {
          exception.printStackTrace();
          System.out.println("Error getting clean value for table tooltip");
        } 
      } else {
        R().setToolTipText((String)null);
      } 
      boolean bool = false;
      if (this.j - paramInt2 > -1.0D && this.j - paramInt2 < 1.0D && this.i - paramInt1 > -1.0D && this.i - paramInt1 < 1.0D) {
        double d3 = (this.j - paramInt2 >= 0.0D) ? Math.abs(this.j - paramInt2 - 1.0D) : Math.abs(1.0D + this.j - paramInt2);
        double d4 = (this.i - paramInt1 >= 0.0D) ? Math.abs(this.i - paramInt1 - 1.0D) : Math.abs(1.0D + this.i - paramInt1);
        double d5 = (d3 == 0.0D || d4 == 0.0D) ? 0.005D : (d3 * d4);
        if (!fh.ExceptionInVPackage()) {
          byte b1 = (color.getRed() > 128) ? (color.getRed() - 128) : 0;
          byte b2 = (color.getGreen() > 128) ? (color.getGreen() - 128) : 0;
          byte b3 = (color.getBlue() > 128) ? (color.getBlue() - 128) : 0;
          b1 = (b1 < '') ? (b1 + 128) : 255;
          b2 = (b2 < '') ? (b2 + 128) : 255;
          b3 = (b3 + 32 < 256) ? (b3 + 32) : 255;
          color = new Color((int)(b1 + (255 - b1) * d5), (int)(b2 + (255 - b2) * d5), (int)(b3 * (1.0D - d5)));
        } else {
          int i = color.getRed();
          int j = color.getGreen();
          char c = 'ÿ';
          c = 'ÿ';
          color = new Color((int)(i * (1.0D - d5)), (int)(j * (1.0D - d5)), (int)(c + (255 - c) * d5));
        } 
        R().setBackground(color);
        if (fh.ExceptionInVPackage() && d5 >= 0.5D) {
          R().setForeground(Color.WHITE);
          bool = true;
        } 
        if (arrayOfB != null) {
          String str = "";
          if (arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].m())
            str = "<br>" + c("Cell is Locked from Analysis"); 
          if (this.Y) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<html>").append(c("Begining Value")).append(":").append(X.b(s.c(paramInt1, paramInt2).doubleValue())).append("<br> ").append(c("Hit Count")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].j()).append("<br> ").append(c("Hit Weighting")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].l()).append("<br> ").append(c("Target AFR")).append(":").append(X.b(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].h())).append("<br> ").append(DecimalFormat.getPercentInstance().format(d5)).append(str).append("</html>");
            R().setToolTipText(stringBuilder.toString());
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<html>").append(c("Begining Value")).append(":").append(X.b(s.c(paramInt1, paramInt2).doubleValue())).append("<br> ").append(c("Hit Count")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].j()).append("<br> ").append(c("Hit Weighting")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].l()).append("<br> ").append(DecimalFormat.getPercentInstance().format(d5)).append(str).append("</html>");
            R().setToolTipText(stringBuilder.toString());
          } 
        } else if (!s.b(paramInt1, paramInt2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("<html>").append(c("Begining Value")).append(":").append(X.b(s.c(paramInt1, paramInt2).doubleValue())).append("<br> ").append(DecimalFormat.getPercentInstance().format(d5)).append("</html>");
          R().setToolTipText(stringBuilder.toString());
        } else {
          R().setToolTipText(DecimalFormat.getPercentInstance().format(d5));
        } 
      } 
      if (!bool && !s.b(paramInt1, paramInt2)) {
        double d = s.d(paramInt1, paramInt2).doubleValue() - s.c(paramInt1, paramInt2).doubleValue();
        if (d < 0.0D && Math.abs(d) > P() * 0.5D) {
          if (color.getRed() < 255 || color.getGreen() > 115) {
            R().setForeground(new Color(225, 0, 0));
          } else {
            R().setForeground(new Color(115, 0, 0));
          } 
        } else if (d > P() * 0.5D) {
          R().setForeground(new Color(0, 0, 220));
        } 
      } else if (!bool && arrayOfB != null && double_.doubleValue() != arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].ExceptionInVPackage()) {
        double d = double_.doubleValue() - arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].ExceptionInVPackage();
        if (d < 0.0D && Math.abs(d) > P() * 0.5D) {
          if (color.getRed() < 255 || color.getGreen() > 115) {
            R().setForeground(new Color(225, 0, 0));
          } else {
            R().setForeground(new Color(115, 0, 0));
          } 
        } else if (d > P() * 0.5D) {
          R().setForeground(new Color(0, 0, 220));
        } 
      } 
    } else if (U() == g && arrayOfB != null && arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2] != null) {
      Color color;
      if (arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].k() == 0.0D) {
        color = Color.white;
      } else {
        color = V().ExceptionInVPackage(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].k());
      } 
      R().setBackground(color);
      R().setForeground(Color.black);
      if (arrayOfB != null && R() != null) {
        String str = "";
        if (arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].m()) {
          str = "<br>" + c("Cell is Locked from Analysis");
          R().setBackground(Color.LIGHT_GRAY);
        } 
        StringBuilder stringBuilder = new StringBuilder();
        if (this.Y && arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].h() > 1.8D) {
          stringBuilder.append("<html>").append(c("Begining Value")).append(":").append(X.b(s.c(paramInt1, paramInt2).doubleValue())).append("<br> ").append(c("Hit Count")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].j()).append("<br> ").append(c("Hit Weighting")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].l()).append("</html>");
        } else if (this.Y) {
          stringBuilder.append("<html>").append(c("Begining Value")).append(":").append(X.b(s.c(paramInt1, paramInt2).doubleValue())).append("<br> ").append(c("Hit Count")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].j()).append("<br> ").append(c("Hit Weighting")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].l()).append("<br> ").append(c("Lambda AFR")).append(":").append(X.c(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].h(), 3)).append(str).append("</html>");
        } else {
          stringBuilder.append("<html>").append(c("Begining Value")).append(":").append(X.b(s.c(paramInt1, paramInt2).doubleValue())).append("<br> ").append(c("Hit Count")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].j()).append("<br> ").append(c("Hit Weighting")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].l()).append("</html>");
        } 
        R().setToolTipText(stringBuilder.toString());
      } else if (!s.b(paramInt1, paramInt2) && R() != null) {
        try {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("<html>").append(c("Begining Value")).append(X.b(s.c(paramInt1, paramInt2).doubleValue())).append(" :").append("</html>");
          R().setToolTipText(stringBuilder.toString());
        } catch (Exception exception) {
          exception.printStackTrace();
          System.out.println("Error getting clean value for table tooltip");
        } 
      } else {
        R().setToolTipText((String)null);
      } 
      boolean bool = false;
      if (this.j - paramInt2 > -1.0D && this.j - paramInt2 < 1.0D && this.i - paramInt1 > -1.0D && this.i - paramInt1 < 1.0D) {
        double d1 = (this.j - paramInt2 >= 0.0D) ? Math.abs(this.j - paramInt2 - 1.0D) : Math.abs(1.0D + this.j - paramInt2);
        double d2 = (this.i - paramInt1 >= 0.0D) ? Math.abs(this.i - paramInt1 - 1.0D) : Math.abs(1.0D + this.i - paramInt1);
        double d3 = (d1 == 0.0D || d2 == 0.0D) ? 0.005D : (d1 * d2);
        if (arrayOfB != null) {
          String str = "";
          if (arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].m())
            str = "<br>" + c("Cell is Locked from Analysis"); 
          if (this.Y) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<html>").append(c("Begining Value")).append(":").append(X.b(s.c(paramInt1, paramInt2).doubleValue())).append("<br> ").append(c("Hit Count")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].j()).append("<br> ").append(c("Hit Weighting")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].l()).append("<br> ").append(c("Target AFR")).append(":").append(X.b(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].h())).append("<br> ").append(DecimalFormat.getPercentInstance().format(d3)).append(str).append("</html>");
            R().setToolTipText(stringBuilder.toString());
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<html>").append(c("Begining Value")).append(":").append(X.b(s.c(paramInt1, paramInt2).doubleValue())).append("<br> ").append(c("Hit Count")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].j()).append("<br> ").append(c("Hit Weighting")).append(":").append(arrayOfB[arrayOfB.length - paramInt1 - 1][paramInt2].l()).append("<br> ").append(DecimalFormat.getPercentInstance().format(d3)).append(str).append("</html>");
            R().setToolTipText(stringBuilder.toString());
          } 
        } else if (!s.b(paramInt1, paramInt2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("<html>").append(c("Begining Value")).append(":").append(X.b(s.c(paramInt1, paramInt2).doubleValue())).append("<br> ").append(DecimalFormat.getPercentInstance().format(d3)).append("</html>");
          R().setToolTipText(stringBuilder.toString());
        } else {
          R().setToolTipText(DecimalFormat.getPercentInstance().format(d3));
        } 
      } 
    } else {
      R().setBackground(Color.white);
      R().setForeground(Color.black);
    } 
    R();
    R().setHorizontalAlignment(0);
    return R();
  }
  
  protected JTableHeader createDefaultTableHeader() {
    JTableHeader jTableHeader = super.createDefaultTableHeader();
    jTableHeader.setResizingAllowed(false);
    jTableHeader.setAlignmentX(0.5F);
    aG aG = new aG(this, this);
    aG.setFont(new Font("Arial Unicode MS", 0, eJ.ExceptionInVPackage(12)));
    jTableHeader.setDefaultRenderer(aG);
    jTableHeader.setForeground(Color.BLACK);
    return jTableHeader;
  }
  
  private Image ae() {
    if (this.o == null || this.o.getWidth(null) != getWidth() || this.o.getHeight(null) != getHeight())
      this.o = createImage(getWidth(), getHeight()); 
    return this.o;
  }
  
  public void paint(Graphics paramGraphics) {
    if (this.p) {
      Image image = ae();
      try {
        ExceptionInVPackage(image.getGraphics());
      } catch (Exception exception) {}
      paramGraphics.drawImage(image, 0, 0, null);
    } else {
      ExceptionInVPackage(paramGraphics);
    } 
    if (!isEnabled()) {
      Color color = new Color(64, 64, 64, 100);
      paramGraphics.setColor(color);
      paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    } 
  }
  
  public void ExceptionInVPackage(Graphics paramGraphics) {
    try {
      super.paint(paramGraphics);
    } catch (Exception exception) {
      D.c("Bintableview paint error.");
      return;
    } 
    if (I() && this.m != null) {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      paramGraphics.setColor(this.u);
      graphics2D.setStroke(this.s);
      int i = i() - 6;
      int j = getRowHeight() - 4;
      paramGraphics.drawOval((this.m[0]).ExceptionInVPackage - i / 2, (this.m[0]).b - j / 2, i, j);
      graphics2D.setStroke(this.t);
      paramGraphics.fillOval((this.m[0]).ExceptionInVPackage - 2, (this.m[0]).b - 2, 4, 4);
      for (byte b = 0; b < this.m.length - 1; b++) {
        if (this.m[b + 1] != null) {
          paramGraphics.fillOval((this.m[b + 1]).ExceptionInVPackage - 2, (this.m[b + 1]).b - 2, 4, 4);
          paramGraphics.drawLine((this.m[b]).ExceptionInVPackage, (this.m[b]).b, (this.m[b + 1]).ExceptionInVPackage, (this.m[b + 1]).b);
        } 
      } 
    } 
  }
  
  public void ExceptionInVPackage(String[] paramArrayOfString1, String[] paramArrayOfString2) {
    if (!I()) {
      this.m = null;
      return;
    } 
    String[] arrayOfString1 = ((s)getModel()).ExceptionInVPackage();
    String[] arrayOfString2 = ((s)getModel()).b();
    boolean bool = ((s)getModel()).H();
    this.m = new aM[paramArrayOfString1.length];
    Rectangle rectangle = getCellRect(0, 0, true);
    try {
      for (byte b = 0; b < paramArrayOfString1.length; b++) {
        double d1 = ExceptionInVPackage(arrayOfString2, Double.parseDouble(paramArrayOfString1[b]));
        double d2 = bool ? b(arrayOfString1, Double.parseDouble(paramArrayOfString2[b])) : ExceptionInVPackage(arrayOfString1, Double.parseDouble(paramArrayOfString2[b]));
        int i = (int)(rectangle.width * d1) + rectangle.width / 2;
        int j = (int)(rectangle.height * d2) + rectangle.height / 2;
        this.m[b] = new aM(this, i, j, d1, d2);
      } 
    } catch (Exception exception) {}
    if (this.aa && !this.r)
      ExceptionInVPackage((float)this.i, (float)this.j); 
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
    if (!isEnabled())
      return; 
    String[] arrayOfString1 = ((s)getModel()).ExceptionInVPackage();
    String[] arrayOfString2 = ((s)getModel()).b();
    if (arrayOfString2 == null || arrayOfString2.length == 0 || arrayOfString2[0] == null || arrayOfString1 == null || arrayOfString1.length == 0 || arrayOfString1[0] == null)
      return; 
    double d1 = Double.parseDouble(paramString1);
    double d2 = Double.parseDouble(paramString2);
    boolean bool = ((s)getModel()).H();
    this.i = bool ? fh.ExceptionInVPackage(arrayOfString1, d1) : fh.b(arrayOfString1, d1);
    this.j = fh.b(arrayOfString2, d2);
    if (I()) {
      Rectangle rectangle = getCellRect(0, 0, true);
      double d3 = ExceptionInVPackage(arrayOfString2, d2);
      double d4 = bool ? fh.ExceptionInVPackage(arrayOfString1, d1) : fh.b(arrayOfString1, d1);
      int i = (int)Math.round(rectangle.width * d3 + (rectangle.width / 2.0F));
      int j = (int)(rectangle.height * d4) + rectangle.height / 2;
      if (this.m == null || this.m.length < J() + 1) {
        this.m = new aM[J() + 1];
        for (byte b = 0; b < this.m.length; b++)
          this.m[b] = new aM(this, i, j, d2, d1); 
      } 
      for (int k = this.m.length - 2; k >= 0; k--)
        this.m[k + 1] = this.m[k]; 
      this.m[0] = new aM(this, i, j, d2, d1);
    } 
    if (this.h) {
      this.v.ExceptionInVPackage();
      ar();
    } 
    if (this.aa && !this.r)
      ExceptionInVPackage((float)this.i, (float)this.j); 
  }
  
  public void ExceptionInVPackage(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
    if (!isEnabled() || paramArrayOffloat1.length < 1 || paramArrayOffloat2.length < 1)
      return; 
    String[] arrayOfString1 = ((s)getModel()).ExceptionInVPackage();
    String[] arrayOfString2 = ((s)getModel()).b();
    if (arrayOfString2 == null || arrayOfString2.length == 0 || arrayOfString2[0] == null || arrayOfString1 == null || arrayOfString1.length == 0 || arrayOfString1[0] == null)
      return; 
    double d1 = paramArrayOffloat1[0];
    double d2 = paramArrayOffloat2[0];
    boolean bool = ((s)getModel()).H();
    this.i = bool ? fh.ExceptionInVPackage(arrayOfString1, d1) : fh.b(arrayOfString1, d1);
    this.j = fh.b(arrayOfString2, d2);
    if (this.aa && !this.r)
      ExceptionInVPackage((float)this.i, (float)this.j); 
    if (I()) {
      int i = Math.min(J() + 1, Math.min(paramArrayOffloat1.length, paramArrayOffloat2.length));
      this.m = new aM[i];
      Rectangle rectangle = getCellRect(0, 0, true);
      for (byte b = 0; b < i; b++) {
        double d3 = ExceptionInVPackage(arrayOfString2, paramArrayOffloat2[b]);
        double d4 = bool ? fh.ExceptionInVPackage(arrayOfString1, paramArrayOffloat1[b]) : fh.b(arrayOfString1, paramArrayOffloat1[b]);
        int j = (int)Math.round(rectangle.width * d3 + (rectangle.width / 2.0F));
        int k = (int)(rectangle.height * d4) + rectangle.height / 2;
        this.m[b] = new aM(this, j, k, paramArrayOffloat2[b], paramArrayOffloat1[b]);
      } 
    } 
    if (this.h) {
      this.v.ExceptionInVPackage();
      ar();
    } 
  }
  
  public void k() {
    if (!isEnabled() || !this.h || !isShowing() || this.m == null)
      return; 
    String[] arrayOfString1 = ((s)getModel()).ExceptionInVPackage();
    String[] arrayOfString2 = ((s)getModel()).b();
    Rectangle rectangle = getCellRect(0, 0, true);
    try {
      for (byte b = 0; b < this.m.length; b++) {
        double d1 = ExceptionInVPackage(arrayOfString2, (this.m[b]).c);
        double d2 = b(arrayOfString1, (this.m[b]).d);
        int i = (int)(rectangle.width * d1) + rectangle.width / 2;
        int j = (int)(rectangle.height * d2) + rectangle.height / 2;
        (this.m[b]).ExceptionInVPackage = i;
        (this.m[b]).b = j;
      } 
      this.v.ExceptionInVPackage();
    } catch (Exception exception) {}
  }
  
  public void l() {
    this.m = null;
    repaint();
  }
  
  public void m() {
    this.v.ExceptionInVPackage();
  }
  
  public void n() {
    if (this.B) {
      p();
    } else if (this.C) {
      r();
    } else {
      ExceptionInVPackage(aq());
    } 
  }
  
  public void o() {
    if (this.B) {
      q();
    } else if (this.C) {
      s();
    } else {
      ExceptionInVPackage(-aq());
    } 
  }
  
  public void p() {
    ExceptionInVPackage((aq() * L()));
  }
  
  public void q() {
    ExceptionInVPackage((-aq() * L()));
  }
  
  public void r() {
    c(1.0D + this.Q);
  }
  
  public void s() {
    c(1.0D - this.Q);
  }
  
  public void t() {
    if (!U || (!g() && getSelectedColumn() >= 0 && getSelectedRow() >= 0))
      return; 
    D();
    s s = (s)getModel();
    double d = s.d(getSelectedRow(), getSelectedColumn()).doubleValue();
    for (int i = getSelectionModel().getMaxSelectionIndex(); i >= 0; i--) {
      for (int j = getSelectedColumn(); j < s.getColumnCount(); j++) {
        try {
          s.setValueAt(new Double(d), i, j);
        } catch (Exception exception) {
          System.out.println("bad Double " + d);
          return;
        } 
      } 
    } 
  }
  
  public void u() {
    if (!g())
      return; 
    D();
    this.h = false;
    String str = bV.ExceptionInVPackage("{" + c("Multiply Selected Cells by: ex. 1.2 = raise by 20%") + "}", true, c("Scale Cells"), true, this);
    this.h = true;
    requestFocus();
    if (str != null && !str.equals("")) {
      double d = Double.parseDouble(str);
      c(d);
    } 
  }
  
  public void v() {
    if (!g())
      return; 
    D();
    this.h = false;
    String str = bV.ExceptionInVPackage("{" + c("Increase Selected Cells by") + ":}", true, c("Add To Cells"), true, this);
    this.h = true;
    requestFocus();
    if (str != null && !str.equals("")) {
      double d = Double.parseDouble(str);
      ExceptionInVPackage(d);
    } 
  }
  
  public void w() {
    if (!U || !g())
      return; 
    D();
    int[] arrayOfInt1 = getSelectedColumns();
    int[] arrayOfInt2 = getSelectedRows();
    if (arrayOfInt1.length == 0 || arrayOfInt2.length == 0)
      return; 
    fh.ExceptionInVPackage((s)getModel(), arrayOfInt1, arrayOfInt2, M());
    repaint();
  }
  
  public void x() {
    if (!g())
      return; 
    D();
    s s1 = new s();
    s1.ExceptionInVPackage(2, 2);
    int[] arrayOfInt1 = getSelectedColumns();
    int[] arrayOfInt2 = getSelectedRows();
    if (arrayOfInt1.length == 0 || arrayOfInt2.length == 0)
      return; 
    s s2 = (s)getModel();
    s1.setValueAt(s2.d(arrayOfInt2[0], arrayOfInt1[0]), 0, 0);
    s1.setValueAt(s2.d(arrayOfInt2[0], arrayOfInt1[arrayOfInt1.length - 1]), 0, 1);
    s1.setValueAt(s2.d(arrayOfInt2[arrayOfInt2.length - 1], arrayOfInt1[0]), 1, 0);
    s1.setValueAt(s2.d(arrayOfInt2[arrayOfInt2.length - 1], arrayOfInt1[arrayOfInt1.length - 1]), 1, 1);
    String[] arrayOfString1 = new String[2];
    String[] arrayOfString2 = new String[2];
    arrayOfString1[0] = s2.b()[arrayOfInt1[0]];
    arrayOfString1[1] = s2.b()[arrayOfInt1[arrayOfInt1.length - 1]];
    s1.c(arrayOfString1);
    arrayOfString2[0] = s2.ExceptionInVPackage()[arrayOfInt2[0]];
    arrayOfString2[1] = s2.ExceptionInVPackage()[arrayOfInt2[arrayOfInt2.length - 1]];
    s1.e(arrayOfString2);
    for (int i = arrayOfInt1[0]; i <= arrayOfInt1[arrayOfInt1.length - 1]; i++) {
      for (int j = arrayOfInt2[0]; j <= arrayOfInt2[arrayOfInt2.length - 1]; j++) {
        double d1 = Double.parseDouble(s2.b()[i]);
        double d2 = Double.parseDouble(s2.ExceptionInVPackage()[j]);
        double d3 = fh.ExceptionInVPackage(s1, d1, d2);
        s2.setValueAt(new Double(d3), j, i);
      } 
    } 
    repaint();
  }
  
  public void y() {
    if (!g())
      return; 
    D();
    int[] arrayOfInt1 = getSelectedColumns();
    int[] arrayOfInt2 = getSelectedRows();
    if (arrayOfInt1.length == 0 || arrayOfInt2.length == 0)
      return; 
    s s = (s)getModel();
    for (int i = arrayOfInt2[0]; i <= arrayOfInt2[arrayOfInt2.length - 1]; i++) {
      double d1 = s.d(i, arrayOfInt1[0]).doubleValue();
      double d2 = s.d(i, arrayOfInt1[arrayOfInt1.length - 1]).doubleValue();
      s s1 = new s();
      s1.ExceptionInVPackage(1, 2);
      s1.setValueAt(Double.valueOf(d1), 0, 0);
      s1.setValueAt(Double.valueOf(d2), 0, 1);
      String[] arrayOfString1 = s.b();
      String[] arrayOfString2 = { arrayOfString1[arrayOfInt1[0]], arrayOfString1[arrayOfInt1[arrayOfInt1.length - 1]] };
      s1.c(arrayOfString2);
      String[] arrayOfString3 = { "1" };
      s1.d(arrayOfString3);
      for (int j = arrayOfInt1[0]; j <= arrayOfInt1[arrayOfInt1.length - 1]; j++) {
        double d3 = Double.parseDouble(s.b()[j]);
        double d4 = 0.0D;
        double d5 = fh.ExceptionInVPackage(s1, d3, d4);
        s.setValueAt(new Double(d5), i, j);
      } 
    } 
    repaint();
  }
  
  public void z() {
    if (!g())
      return; 
    D();
    int[] arrayOfInt1 = getSelectedColumns();
    int[] arrayOfInt2 = getSelectedRows();
    if (arrayOfInt1.length == 0 || arrayOfInt2.length == 0)
      return; 
    s s = (s)getModel();
    for (int i = arrayOfInt1[0]; i <= arrayOfInt1[arrayOfInt1.length - 1]; i++) {
      double d1 = s.d(arrayOfInt2[0], i).doubleValue();
      double d2 = s.d(arrayOfInt2[arrayOfInt2.length - 1], i).doubleValue();
      s s1 = new s();
      s1.ExceptionInVPackage(2, 1);
      s1.setValueAt(Double.valueOf(d1), 0, 0);
      s1.setValueAt(Double.valueOf(d2), 1, 0);
      String[] arrayOfString1 = s.ExceptionInVPackage();
      String[] arrayOfString2 = { arrayOfString1[arrayOfInt2[arrayOfInt2.length - 1]], arrayOfString1[arrayOfInt2[0]] };
      s1.d(arrayOfString2);
      String[] arrayOfString3 = { "1" };
      s1.c(arrayOfString3);
      for (int j = arrayOfInt2[0]; j <= arrayOfInt2[arrayOfInt2.length - 1]; j++) {
        double d3 = 0.0D;
        double d4 = Double.parseDouble(s.ExceptionInVPackage()[j]);
        double d5 = fh.ExceptionInVPackage(s1, d3, d4);
        s.setValueAt(new Double(d5), j, i);
      } 
    } 
    repaint();
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (getWidth() < 10 || getHeight() < 10)
      l(); 
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    an an = new an(this);
    SwingUtilities.invokeLater(an);
  }
  
  public void A() {
    b[][] arrayOfB = ((s)getModel()).D();
    for (byte b = 0; b < getColumnCount(); b++) {
      for (byte b1 = 0; b1 < getRowCount(); b1++) {
        if (isCellSelected(b1, b) && arrayOfB != null) {
          s s = (s)getModel();
          Double double_ = s.c(b1, b);
          arrayOfB[arrayOfB.length - 1 - b1][b].b(arrayOfB[arrayOfB.length - 1 - b1][b].ExceptionInVPackage());
          s.setValueAt(double_, b1, b);
        } 
      } 
    } 
  }
  
  public void B() {
    if (!g())
      return; 
    this.h = false;
    String str = bV.ExceptionInVPackage("{" + c("Decrease Selected Cells by") + ":}", true, c("Subtract From Cells"), true, this);
    this.h = true;
    requestFocus();
    if (str != null && !str.equals("")) {
      double d = Double.parseDouble(str);
      ExceptionInVPackage(-d);
    } 
  }
  
  public void ExceptionInVPackage(double paramDouble) {
    if (!g())
      return; 
    D();
    for (byte b = 0; b < getRowCount(); b++) {
      for (byte b1 = 0; b1 < getColumnCount(); b1++) {
        if (isCellSelected(b, b1)) {
          s s = (s)getModel();
          Double double_ = s.d(b, b1);
          if (double_ != null && !double_.isNaN())
            s.setValueAt(new Double(ExceptionInVPackage(double_.doubleValue(), paramDouble)), b, b1); 
        } 
      } 
    } 
    O();
    repaint();
  }
  
  public void C() {
    if (!g())
      return; 
    D();
    for (byte b = 0; b < getRowCount(); b++) {
      for (byte b1 = 0; b1 < getColumnCount(); b1++) {
        if (isCellSelected(b, b1)) {
          s s = (s)getModel();
          Double double_1 = s.d(b, b1);
          Double double_2 = s.c(b, b1);
          if (double_1 != null && !double_1.isNaN())
            s.setValueAt(double_2, b, b1); 
        } 
      } 
    } 
    repaint();
  }
  
  private double ExceptionInVPackage(double paramDouble1, double paramDouble2) {
    long l = (long)((paramDouble1 + paramDouble2) * 1000000.0D);
    int i = Math.round((float)(l / 100.0D));
    return i / 10000.0D;
  }
  
  public void b(double paramDouble) {
    if (!g())
      return; 
    D();
    for (byte b = 0; b < getColumnCount(); b++) {
      for (byte b1 = 0; b1 < getRowCount(); b1++) {
        if (isCellSelected(b1, b)) {
          s s = (s)getModel();
          s.c(true);
          Double double_ = s.d(b1, b);
          if (double_ != null)
            s.setValueAt(new Double(paramDouble), b1, b); 
        } 
      } 
    } 
    repaint();
  }
  
  public void c(double paramDouble) {
    if (!g())
      return; 
    D();
    for (byte b = 0; b < getColumnCount(); b++) {
      for (byte b1 = 0; b1 < getRowCount(); b1++) {
        if (isCellSelected(b1, b)) {
          s s = (s)getModel();
          Double double_ = s.d(b1, b);
          double d = double_.doubleValue() * paramDouble;
          s.setValueAt(Double.valueOf(d), b1, b);
        } 
      } 
    } 
  }
  
  public void D() {
    s s = (s)getModel();
    if (!s.p()) {
      bV.d("This is ExceptionInVPackage Read Only table. \nIf this table is edited, the new values will be used for analysis, \nbut will not be saved with Tune File.", this);
      s.ExceptionInVPackage(true);
    } 
    this.l = true;
  }
  
  private boolean af() {
    return (getSelectedRowCount() > 1 || getSelectedColumnCount() > 1);
  }
  
  public void ExceptionInVPackage(String paramString) {
    s s = (s)getModel();
    if (paramString != null && paramString.equals(c("Increment - Key: > or ,"))) {
      n();
      repaint();
    } else if (paramString != null && paramString.equals(c("Decrement - Key: < or ."))) {
      o();
      repaint();
    } else if (paramString != null && paramString.equals(c("Increase by - Key: +"))) {
      v();
      repaint();
    } else if (paramString != null && paramString.equals(c("Decrease by - Key: -"))) {
      B();
      repaint();
    } else if (paramString != null && paramString.equals(c("Scale by - Key: *"))) {
      u();
      repaint();
    } else if (paramString != null && paramString.equals(c("Back to original value"))) {
      A();
      repaint();
    } else if (paramString != null && paramString.equals(c("Set to - Key: ="))) {
      H();
    } else if (paramString != null && paramString.equals(c("Copy CTRL-C"))) {
      f();
    } else if (paramString != null && paramString.equals(c("Paste CTRL-V"))) {
      h();
      repaint();
    } else if (paramString != null && paramString.equals(c("Interpolate Vertical - Key: V"))) {
      z();
    } else if (paramString != null && paramString.equals(c("Interpolate Horizontal - Key: H"))) {
      y();
    } else if (paramString != null && paramString.equals(c("Interpolate - Key: /"))) {
      x();
    } else if (paramString != null && paramString.equals(c("Export Table"))) {
      E();
    } else if (paramString != null && paramString.equals(c("Import Table"))) {
      G();
    } else if (paramString != null && paramString.startsWith(c("History Trace Length"))) {
      F();
    } else if (paramString != null && paramString.startsWith(c("Lock Selected Cells"))) {
      b(true);
    } else if (paramString != null && paramString.startsWith(c("Unlock Selected Cells"))) {
      b(false);
    } else if (paramString != null && paramString.startsWith(c("Smooth Cells - Key: s"))) {
      w();
    } else if (paramString != null && paramString.startsWith(c("Fill Up and Right - Key: f"))) {
      t();
    } else if (paramString != null && paramString.startsWith(c("Set increment amount"))) {
      an();
    } else if (paramString != null && paramString.startsWith(c("Set number of increments (CTRL pressed)"))) {
      ao();
    } else if (paramString != null && paramString.startsWith(c("Set percent increment size (SHIFT pressed)"))) {
      ap();
    } else if (paramString != null && paramString.equals(c("Revert to starting value"))) {
      C();
    } else if (paramString != null && paramString.equals(c("Cell Color By Value"))) {
      ai();
    } else if (paramString != null && paramString.equals(c("Multiply By Copied Values - Percent"))) {
      Z();
    } else if (paramString != null && paramString.equals(c("Multiply By Copied Values - Raw"))) {
      aa();
    } else if (paramString != null && paramString.equals(c("Add Copied Table Values"))) {
      ab();
    } else if (paramString != null && paramString.equals(c("Subtract Copied Table Values"))) {
      ac();
    } else {
      try {
        if (paramString != null && paramString.equals(c("Insert Column After Selected"))) {
          this.af.c(getSelectedColumn() + 1);
        } else if (paramString != null && paramString.equals(c("Insert Column Before Selected"))) {
          this.af.c(getSelectedColumn());
        } else if (paramString != null && paramString.equals(c("Insert Row Above Selected"))) {
          this.af.ExceptionInVPackage(getSelectedRow());
        } else if (paramString != null && paramString.equals(c("Insert Row Below Selected"))) {
          this.af.ExceptionInVPackage(getSelectedRow() + 1);
        } else if (paramString != null && paramString.equals(c("Delete Selected Row"))) {
          this.af.b(getSelectedRow());
        } else if (paramString != null && paramString.equals(c("Delete Selected Column"))) {
          this.af.d(getSelectedColumn());
        } else if (paramString != null && paramString.equals(c("Resize Table"))) {
          this.af.h();
        } 
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        bV.d(c(ExceptionInVPackage.getLocalizedMessage()), this);
      } 
    } 
  }
  
  public void E() {
    b("");
  }
  
  public void b(String paramString) {
    String[] arrayOfString = { "table", "vex" };
    String str1 = paramString + "_" + X.ExceptionInVPackage() + ".table";
    String str2 = d(n);
    String str3 = bV.ExceptionInVPackage(this, "Export Table", arrayOfString, str1, str2);
    if (str3 != null && !str3.equals("")) {
      String str = str3.toLowerCase();
      if (str.endsWith(".vex")) {
        fG fG = new fG();
        try {
          fG.ExceptionInVPackage((s)getModel(), str3, this.ExceptionInVPackage);
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          bV.d("Error Saving VEX file:\n" + ExceptionInVPackage.getMessage(), this);
          ExceptionInVPackage.printStackTrace();
        } 
      } else {
        if (str.indexOf(".table") == -1)
          str3 = str3 + ".table"; 
        eY eY = new eY();
        try {
          eY.ExceptionInVPackage(str3, (s)getModel());
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          bV.d("Error Saving table file:\n" + ExceptionInVPackage.getMessage(), this);
          ExceptionInVPackage.printStackTrace();
        } 
      } 
    } 
  }
  
  public void F() {
    String str = bV.ExceptionInVPackage("{" + c("Number of records for History Trace (the blue line)") + "}", true, c("History Length"), true, this);
    if (str == null || str.equals(""))
      return; 
    int i = (int)Math.round(Double.parseDouble(str));
    c(i);
    this.m = null;
    b("History Trace Length", "" + i);
  }
  
  public void G() {
    if (!g())
      return; 
    String[] arrayOfString = { "table", "vex" };
    String str1 = "*.vex" + File.pathSeparator + "*.table";
    String str2 = d(n);
    String str3 = bV.b(this, c("Import Table"), arrayOfString, str1, str2);
    if (str3 != null && !str3.equals("")) {
      if (str3.indexOf(File.separator) != -1)
        b(n, str3.substring(0, str3.lastIndexOf(File.separator))); 
      if (str3.toLowerCase().endsWith(".vex")) {
        fG fG = new fG();
        try {
          fG.ExceptionInVPackage((s)getModel(), str3);
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          bV.d(c("Error Importing table!") + "\n" + ExceptionInVPackage.getMessage(), this);
        } catch (Exception exception) {
          D.ExceptionInVPackage("Unexpected problem importing table!", exception, this);
        } 
      } else {
        eY eY = new eY();
        try {
          eY.b(str3, (s)getModel());
        } catch (Exception exception) {
          bV.d("Error Loading table file:\n" + exception.getMessage(), this);
          exception.printStackTrace();
        } 
      } 
    } 
  }
  
  public void H() {
    if (!g())
      return; 
    this.h = false;
    String str = bV.ExceptionInVPackage("{" + c("Set Selected Cells to") + ":}", true, c("Set Cell Values"), true, this);
    this.h = true;
    requestFocus();
    if (str != null && !str.equals("")) {
      double d = Double.parseDouble(str);
      b(d);
      O();
    } 
  }
  
  public void ExceptionInVPackage(int paramInt1, int paramInt2) {
    int i = paramInt1 / i();
    int j = paramInt2 / getRowHeight();
    if (!isCellSelected(j, i))
      changeSelection(j, i, false, false); 
  }
  
  public void b(int paramInt1, int paramInt2) {
    int i = paramInt1 / i();
    int j = paramInt2 / getRowHeight();
    JPopupMenu jPopupMenu = new JPopupMenu();
    add(jPopupMenu);
    as as = new as(this);
    b[][] arrayOfB = ((s)getModel()).D();
    if (arrayOfB != null) {
      jPopupMenu.add(c("Back to original value")).addActionListener(as);
      jPopupMenu.addSeparator();
    } else {
      jPopupMenu.add(c("Revert to starting value")).addActionListener(as);
    } 
    if (g()) {
      jPopupMenu.add(c("Set to - Key: =")).addActionListener(as);
      jPopupMenu.add(c("Increment - Key: > or ,")).addActionListener(as);
      jPopupMenu.add(c("Decrement - Key: < or .")).addActionListener(as);
      jPopupMenu.add(c("Increase by - Key: +")).addActionListener(as);
      jPopupMenu.add(c("Decrease by - Key: -")).addActionListener(as);
      jPopupMenu.add(c("Scale by - Key: *")).addActionListener(as);
      jPopupMenu.add(c("Interpolate - Key: /")).addActionListener(as);
      if (S()) {
        jPopupMenu.add(c("Interpolate Horizontal - Key: H")).addActionListener(as);
        jPopupMenu.add(c("Interpolate Vertical - Key: V")).addActionListener(as);
        jPopupMenu.add(c("Smooth Cells - Key: s")).addActionListener(as);
        jPopupMenu.add(c("Fill Up and Right - Key: f")).addActionListener(as);
        jPopupMenu.add(c("Set increment amount")).addActionListener(as);
        jPopupMenu.add(c("Set number of increments (CTRL pressed)")).addActionListener(as);
        jPopupMenu.add(c("Set percent increment size (SHIFT pressed)")).addActionListener(as);
        jPopupMenu.add(c("Cell Color By Value")).addActionListener(as);
      } else {
        jPopupMenu.add(c("Interpolate Horizontal - Key: H")).setEnabled(U);
        jPopupMenu.add(c("Interpolate Vertical - Key: V")).setEnabled(U);
        jPopupMenu.add(c("Smooth Cells - Key: s")).setEnabled(U);
        jPopupMenu.add(c("Fill Up and Right - Key: f")).setEnabled(U);
      } 
      jPopupMenu.addSeparator();
    } 
    jPopupMenu.add(c("Copy CTRL-C")).addActionListener(as);
    if (g()) {
      jPopupMenu.add(c("Paste CTRL-V")).addActionListener(as);
      if (S()) {
        JMenu jMenu = new JMenu(c("Paste Special"));
        jPopupMenu.add(jMenu);
        jMenu.add(c("Multiply By Copied Values - Percent")).addActionListener(as);
        jMenu.add(c("Multiply By Copied Values - Raw")).addActionListener(as);
        jMenu.add(c("Add Copied Table Values")).addActionListener(as);
        jMenu.add(c("Subtract Copied Table Values")).addActionListener(as);
      } 
    } 
    if (this.af != null && this.af.ExceptionInVPackage()) {
      jPopupMenu.addSeparator();
      bp bp = new bp(c("Adjust Table Size & Shape"));
      ExceptionInVPackage(bp);
      jPopupMenu.add(bp);
    } 
    jPopupMenu.addSeparator();
    jPopupMenu.add(c("Export Table")).addActionListener(as);
    if (g())
      jPopupMenu.add(c("Import Table")).addActionListener(as); 
    if (this.ab) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(c("Follow Mode"), this.aa);
      jCheckBoxMenuItem.addActionListener(new at(this));
      jPopupMenu.add(jCheckBoxMenuItem);
    } 
    if (I())
      if (S()) {
        jPopupMenu.add(c("History Trace Length") + " (" + this.L + ")").addActionListener(as);
      } else {
        jPopupMenu.add(c("History Trace Length") + " (" + this.L + ")").setEnabled(false);
        c(5);
      }  
    if (aj())
      jPopupMenu.add(c("Lock Selected Cells")).addActionListener(as); 
    if (ak())
      jPopupMenu.add(c("Unlock Selected Cells")).addActionListener(as); 
    jPopupMenu.show(this, paramInt1, paramInt2);
  }
  
  protected bq ExceptionInVPackage(bq parambq) {
    au au = new au(this);
    if ((getSelectedColumns()).length == 1) {
      if (getColumnCount() < this.af.d() && (getColumnCount() + 1) * getRowCount() <= this.af.f()) {
        parambq.add("Insert Column Before Selected").addActionListener(au);
        parambq.add("Insert Column After Selected").addActionListener(au);
      } 
      if (getColumnCount() > this.af.e())
        parambq.add("Delete Selected Column").addActionListener(au); 
    } 
    if ((getSelectedRows()).length == 1) {
      if (getRowCount() > this.af.c())
        parambq.add("Delete Selected Row").addActionListener(au); 
      if (getRowCount() < this.af.b() && getColumnCount() * (getRowCount() + 1) <= this.af.f()) {
        parambq.add("Insert Row Above Selected").addActionListener(au);
        parambq.add("Insert Row Below Selected").addActionListener(au);
      } 
    } 
    parambq.add("Resize Table").addActionListener(au);
    return parambq;
  }
  
  private void ag() {
    double d1 = Double.NaN;
    double d2 = Double.NaN;
    try {
      d1 = Double.parseDouble(this.w.getText());
    } catch (NumberFormatException numberFormatException) {
      if (this.w.getText().trim().isEmpty()) {
        this.w.ExceptionInVPackage("Auto");
        this.w.selectAll();
      } 
    } 
    try {
      d2 = Double.parseDouble(this.x.getText());
    } catch (NumberFormatException numberFormatException) {
      if (this.x.getText().trim().isEmpty()) {
        this.x.ExceptionInVPackage("Auto");
        this.x.selectAll();
      } 
    } 
    h(d1);
    g(d2);
    ((s)getModel()).C();
    repaint();
  }
  
  private void ah() {
    double d1 = Double.NaN;
    double d2 = Double.NaN;
    try {
      d1 = Double.parseDouble(d("cellColorMin"));
    } catch (Exception exception) {}
    try {
      d2 = Double.parseDouble(d("cellColorMax"));
    } catch (Exception exception) {}
    h(d1);
    g(d2);
    ((s)getModel()).C();
    repaint();
  }
  
  private void ai() {
    if (this.y == null) {
      this.w = new NumericTextField("Auto", 1);
      this.x = new NumericTextField("Auto", 1);
      double d1 = Double.NaN;
      double d2 = Double.NaN;
      try {
        d1 = Double.parseDouble(d("cellColorMin"));
      } catch (Exception exception) {}
      if (!Double.isNaN(d1))
        this.w.ExceptionInVPackage(d1); 
      try {
        d2 = Double.parseDouble(d("cellColorMax"));
      } catch (Exception exception) {}
      if (!Double.isNaN(d2))
        this.x.ExceptionInVPackage(d2); 
      av av = new av(this);
      aw aw = new aw(this);
      this.w.addKeyListener(aw);
      this.x.addKeyListener(aw);
      this.y = new JPanel();
      this.y.setBorder(BorderFactory.createTitledBorder(c("Fixed color Min/Max")));
      this.y.setLayout(new GridLayout(1, 4, 6, 6));
      JLabel jLabel1 = new JLabel(c("Color Min"), 0);
      this.y.add(jLabel1);
      this.y.add(this.w);
      JLabel jLabel2 = new JLabel(c("Color Min"), 0);
      this.y.add(jLabel2);
      this.y.add(this.x);
      this.w.addFocusListener(av);
      this.x.addFocusListener(av);
    } 
    ax ax = new ax(this);
    bV.ExceptionInVPackage(this.y, this, c("Color Limits"), ax);
  }
  
  public double ExceptionInVPackage(String[] paramArrayOfString, double paramDouble) {
    return fh.b(paramArrayOfString, paramDouble);
  }
  
  public void changeSelection(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    super.changeSelection(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    this.z = "";
    O();
  }
  
  public double b(String[] paramArrayOfString, double paramDouble) {
    double d1 = 10.0D;
    try {
      d1 = Double.parseDouble(paramArrayOfString[paramArrayOfString.length - 1]);
    } catch (Exception exception) {
      System.out.println("axisValues=" + paramArrayOfString);
      System.out.println("Exception in getYaxisPosition, axisValues[axisValues.length-1]=" + paramArrayOfString[paramArrayOfString.length - 1] + ", axisValues.length=" + paramArrayOfString.length);
    } 
    double d2 = 0.0D;
    for (int i = paramArrayOfString.length - 1; i >= 0; i--) {
      double d = Double.parseDouble(paramArrayOfString[i]);
      if (d == paramDouble) {
        d2 = i;
        break;
      } 
      if (d > paramDouble) {
        if (i == paramArrayOfString.length - 1) {
          d2 = i;
          break;
        } 
        d2 = i + (d - paramDouble) / (d - d1);
        break;
      } 
      d1 = d;
    } 
    return d2;
  }
  
  public boolean I() {
    return this.K;
  }
  
  public void ExceptionInVPackage(boolean paramBoolean) {
    this.K = paramBoolean;
  }
  
  public int J() {
    return this.L;
  }
  
  public void c(int paramInt) {
    this.L = paramInt;
    this.m = null;
  }
  
  public void b(boolean paramBoolean) {
    s s = (s)getModel();
    if (s.j == null || s.j.length == 0 || (s.j[0]).length == 0 || s.j[0][0] == null) {
      D.c("Request to unlock cells, but there are no AnanlysisCells available");
      return;
    } 
    for (byte b = 0; b < getColumnCount(); b++) {
      for (byte b1 = 0; b1 < getRowCount(); b1++) {
        if (isCellSelected(b1, b)) {
          b b2 = s.D()[s.j.length - b1 - 1][b];
          b2.ExceptionInVPackage(paramBoolean);
        } 
      } 
    } 
    repaint();
    al();
  }
  
  private boolean aj() {
    if (!g())
      return false; 
    s s = (s)getModel();
    if (s.j == null || s.j.length == 0 || (s.j[0]).length == 0 || s.j[0][0] == null)
      return false; 
    for (byte b = 0; b < getColumnCount(); b++) {
      for (byte b1 = 0; b1 < getRowCount(); b1++) {
        if (isCellSelected(b1, b)) {
          b b2 = s.D()[s.j.length - b1 - 1][b];
          if (!b2.m())
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  private boolean ak() {
    s s = (s)getModel();
    if (s.j == null || s.j.length == 0 || (s.j[0]).length == 0 || s.j[0][0] == null)
      return false; 
    for (byte b = 0; b < getColumnCount(); b++) {
      for (byte b1 = 0; b1 < getRowCount(); b1++) {
        if (isCellSelected(b1, b)) {
          b b2 = s.D()[(s.D()).length - b1 - 1][b];
          if (b2.m())
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  public boolean c(int paramInt1, int paramInt2) {
    s s = (s)getModel();
    if (s.j == null || s.j.length < paramInt1 || (s.j[0]).length < paramInt2 || s.j[0][0] == null)
      return false; 
    b b = s.D()[(s.D()).length - paramInt1 - 1][paramInt2];
    return b.m();
  }
  
  private void al() {
    s s = (s)getModel();
    if (s.j == null || s.j.length == 0 || (s.j[0]).length == 0 || s.j[0][0] == null || this.M == null)
      return; 
    String str = "";
    for (byte b = 0; b < getColumnCount(); b++) {
      for (byte b1 = 0; b1 < getRowCount(); b1++) {
        b b2 = s.D()[s.j.length - b1 - 1][b];
        if (b2.m())
          str = str + "[" + b1 + ":" + b + "]"; 
      } 
    } 
    b("Lock Selected Cells", str);
  }
  
  private void am() {
    s s = (s)getModel();
    if (s.j == null || s.j.length == 0 || (s.j[0]).length == 0 || s.j[0][0] == null || this.M == null)
      return; 
    String str = d("Lock Selected Cells");
    if (str == null || str.equals(""))
      return; 
    StringTokenizer stringTokenizer = new StringTokenizer(str, "[");
    while (stringTokenizer.hasMoreTokens()) {
      String str1 = stringTokenizer.nextToken();
      str1 = str1.substring(0, str1.length() - 1);
      int i = Integer.parseInt(str1.substring(0, str1.indexOf(":")));
      int j = Integer.parseInt(str1.substring(str1.indexOf(":") + 1, str1.length()));
      if (i < s.j.length && j < (s.j[i]).length) {
        b b = s.D()[s.j.length - i - 1][j];
        b.ExceptionInVPackage(true);
      } 
    } 
  }
  
  public ab K() {
    return this.O;
  }
  
  public void ExceptionInVPackage(ab paramab) {
    this.O = paramab;
  }
  
  public int L() {
    return this.P;
  }
  
  public float M() {
    return this.W;
  }
  
  public void ExceptionInVPackage(float paramFloat) {
    if (paramFloat < 0.0F)
      paramFloat = 0.0F; 
    if (paramFloat > 1.0D)
      paramFloat = 1.0F; 
    if (this.W != paramFloat)
      b("Smooth Cells - Key: s", Float.toString(paramFloat)); 
    this.W = paramFloat;
  }
  
  private void an() {
    String str = bV.ExceptionInVPackage(this, true, c("Preferred Cell Increment Size"), aq() + "");
    if (str != null && !str.equals("")) {
      float f = aq();
      try {
        f = Float.parseFloat(str);
        if (f <= 0.0F) {
          bV.d(c("Increment size should be greater than zero."), this);
          an();
          return;
        } 
        b(f);
      } catch (Exception exception) {
        bV.d(c("Invalid Increment size") + " " + f, this);
        return;
      } 
    } 
  }
  
  private void ao() {
    String str = bV.ExceptionInVPackage(this, true, "<html>" + c("Preferred Multi-Increment Count.") + "<br>" + c("With CTRL key down, will increment this many times"), L() + "");
    if (str != null && !str.equals("")) {
      int i = this.P;
      try {
        i = (int)Float.parseFloat(str);
        if (i <= 0) {
          bV.d(c("Increment size should be greater than zero."), this);
          ao();
          return;
        } 
        if (i >= 20) {
          bV.d(c("20 Seems ExceptionInVPackage bit excessive, don't you think?"), this);
          ao();
          return;
        } 
        d(i);
      } catch (Exception exception) {
        bV.d(c("Invalid Increment count") + " " + i, this);
        return;
      } 
    } 
  }
  
  private void ap() {
    String str1 = X.c(X() * 100.0D, 0);
    String str2 = bV.ExceptionInVPackage(this, true, "<html>" + c("Preferred Percent-Increment Amount.") + "<br>" + c("With SHIFT key down, increments by this percentage"), str1 + "%");
    if (str2 != null && !str2.equals("")) {
      double d = this.Q;
      str2 = X.b(str2, "%", "");
      try {
        d = Double.parseDouble(str2) / 100.0D;
        if (d <= 0.0D) {
          bV.d(c("Increment size should be greater than zero."), this);
          ap();
          return;
        } 
        if (d >= 0.5D) {
          bV.d(c("50 percent Seems ExceptionInVPackage bit excessive, don't you think?"), this);
          ap();
          return;
        } 
        d(d);
      } catch (Exception exception) {
        bV.d(c("Invalid Increment percent") + " " + d, this);
        return;
      } 
    } 
  }
  
  public void b(float paramFloat) {
    this.S = paramFloat;
    b("Set increment amount", paramFloat + "");
  }
  
  public void d(int paramInt) {
    this.P = paramInt;
    b("Set number of increments (CTRL pressed)", paramInt + "");
  }
  
  public void d(double paramDouble) {
    i(paramDouble);
    b("Set percent increment size (SHIFT pressed)", paramDouble + "");
  }
  
  private float aq() {
    return !Float.isNaN(this.S) ? this.S : (float)P();
  }
  
  public boolean N() {
    return this.E;
  }
  
  public void c(boolean paramBoolean) {
    this.E = paramBoolean;
  }
  
  public void e(double paramDouble) {
    this.ad = paramDouble;
    if (this.v != null)
      this.v.b = Math.round(1000.0D / paramDouble); 
  }
  
  protected void ExceptionInVPackage(am paramam) {
    this.af = paramam;
  }
  
  public void d(boolean paramBoolean) {
    boolean bool = this.aa ^ paramBoolean;
    this.aa = paramBoolean;
    if (bool)
      j(paramBoolean); 
  }
  
  public void ExceptionInVPackage(aA paramaA) {
    this.q.add(paramaA);
  }
  
  private void j(boolean paramBoolean) {
    for (aA aA : this.q)
      aA.ExceptionInVPackage(paramBoolean); 
  }
  
  public void e(boolean paramBoolean) {
    this.ab = paramBoolean;
  }
  
  public void addNotify() {
    super.addNotify();
    addHierarchyListener(this);
  }
  
  public void removeNotify() {
    removeHierarchyListener(this);
    super.removeNotify();
  }
  
  public void hierarchyChanged(HierarchyEvent paramHierarchyEvent) {
    O();
  }
  
  public void O() {
    s s = (s)getModel();
    if (s.K())
      s.c(false); 
  }
  
  private void ar() {
    Iterator<eg> iterator = this.N.iterator();
    while (iterator.hasNext()) {
      double d = ((s)getModel()).ExceptionInVPackage(this.i, this.j);
      ((eg)iterator.next()).ExceptionInVPackage((int)Math.round(this.j), (int)Math.round(this.i), d);
    } 
  }
  
  public void f(double paramDouble) {
    this.R = paramDouble;
  }
  
  public double P() {
    return Double.isNaN(this.R) ? (Math.pow(10.0D, 1.0D - this.ExceptionInVPackage) / 10.0D) : this.R;
  }
  
  public TableCellEditor getDefaultEditor(Class paramClass) {
    if (this.G == null) {
      this.G = new aB(this);
      this.G.getComponent().setFont(getFont());
      this.G.getComponent().addFocusListener(new ay(this));
    } 
    return this.G;
  }
  
  public void removeEditor() {
    int i = getEditingColumn();
    int j = getEditingRow();
    super.removeEditor();
    if (this.ae && i >= 0 && j >= 0) {
      az az = new az(this, j, i);
      SwingUtilities.invokeLater(az);
      this.ae = false;
    } 
  }
  
  public boolean editCellAt(int paramInt1, int paramInt2, EventObject paramEventObject) {
    if (paramEventObject instanceof KeyEvent) {
      KeyEvent keyEvent = (KeyEvent)paramEventObject;
      if (keyEvent.getKeyCode() == 32)
        return false; 
    } 
    boolean bool = super.editCellAt(paramInt1, paramInt2, paramEventObject);
    if (bool)
      this.G.ExceptionInVPackage(); 
    return bool;
  }
  
  public int Q() {
    return this.D;
  }
  
  public void e(int paramInt) {
    this.D = paramInt;
    if (this.E) {
      this.c = new Font(this.c.getFontName(), 1, paramInt);
    } else {
      this.c = new Font(this.c.getFontName(), 0, paramInt);
    } 
    this.d = new Font(this.c.getFontName(), 1, paramInt);
    setFont(this.c);
    this.F = null;
    this.G = null;
  }
  
  protected boolean processKeyBinding(KeyStroke paramKeyStroke, KeyEvent paramKeyEvent, int paramInt, boolean paramBoolean) {
    if (paramKeyEvent.getID() == 401) {
      if (paramKeyEvent.getKeyCode() == 16)
        this.C = true; 
      if (paramKeyEvent.getKeyCode() == 17)
        this.B = true; 
    } 
    if (paramKeyEvent.getID() == 402) {
      if (paramKeyEvent.getKeyCode() == 16)
        this.C = false; 
      if (paramKeyEvent.getKeyCode() == 17)
        this.B = false; 
    } 
    if (paramKeyEvent.getKeyCode() == 16 || paramKeyEvent.getKeyCode() == 17) {
      if (paramKeyEvent.getID() == 401)
        this.r = true; 
      if (paramKeyEvent.getID() == 402)
        this.r = false; 
    } 
    if (paramKeyEvent.getID() == 401 && paramKeyEvent.getKeyCode() == 10 && isEditing()) {
      this.ae = true;
    } else if (paramKeyEvent.getID() == 401 && at() && (I.ExceptionInVPackage(paramKeyEvent.getKeyChar() + "") || (paramKeyEvent.getKeyCode() == 8 && !this.z.isEmpty())) && ((paramKeyEvent.getKeyCode() != 46 && paramKeyEvent.getKeyCode() != 110) || (!this.z.isEmpty() && !this.z.contains(".")))) {
      this.A = System.currentTimeMillis();
      if (paramKeyEvent.getKeyCode() == 8) {
        if (!this.z.isEmpty())
          this.z = this.z.substring(0, this.z.length() - 1); 
      } else if (!this.z.contains(".") || this.z.length() - this.z.indexOf(".") <= this.ExceptionInVPackage) {
        this.z += paramKeyEvent.getKeyChar();
      } 
      if (!this.z.isEmpty()) {
        b(Double.parseDouble(this.z));
      } else {
        b(0.0D);
      } 
      return true;
    } 
    if (paramKeyEvent.getID() == 401) {
      this.z = "";
      O();
    } 
    if (paramKeyEvent.getID() == 401 && paramInt == 0) {
      if (paramKeyEvent.getKeyChar() == '+') {
        SwingUtilities.invokeLater(new ao(this));
        return true;
      } 
      if (paramKeyEvent.getKeyChar() == '*') {
        SwingUtilities.invokeLater(new ap(this));
        return true;
      } 
      if (paramKeyEvent.getModifiers() == 2)
        switch (paramKeyEvent.getKeyCode()) {
          case 67:
            f();
            return true;
          case 86:
            h();
            return true;
          case 44:
            q();
            return true;
          case 46:
            p();
            return true;
          case 87:
            return false;
          case 81:
            return false;
          case 9:
            transferFocus();
            return true;
          case 70:
            t();
            return true;
        }  
      switch (paramKeyEvent.getKeyCode()) {
        case 45:
          if (af()) {
            SwingUtilities.invokeLater(new aq(this));
            return true;
          } 
          break;
        case 109:
          if (af()) {
            SwingUtilities.invokeLater(new ar(this));
            return true;
          } 
          break;
        case 521:
          v();
          return true;
        case 106:
          u();
          return true;
        case 44:
          o();
          return true;
        case 46:
          n();
          return true;
        case 87:
          o();
          return true;
        case 81:
          n();
          return true;
        case 61:
          H();
          return true;
        case 107:
          v();
          return true;
        case 47:
          x();
          return true;
        case 111:
          x();
          return true;
        case 72:
          y();
          return true;
        case 86:
          z();
          return true;
        case 70:
          t();
          return true;
        case 83:
          w();
          return true;
      } 
      if (paramKeyEvent.getModifiers() == 0 && ExceptionInVPackage(paramKeyEvent.getKeyChar()) && !I.ExceptionInVPackage(paramKeyEvent.getKeyChar() + "") && paramKeyEvent.getKeyCode() != 10 && paramKeyEvent.getKeyCode() != 9 && paramKeyEvent.getKeyCode() != 38 && paramKeyEvent.getKeyCode() != 40 && paramKeyEvent.getKeyCode() != 37 && paramKeyEvent.getKeyCode() != 32 && paramKeyEvent.getKeyCode() != 39)
        return true; 
    } 
    if (U && paramKeyEvent.getModifiers() == 0 && paramKeyEvent.getID() == 401) {
      if (paramKeyEvent.getKeyCode() == 39 && as())
        return true; 
      if (paramKeyEvent.getKeyCode() == 37 && au())
        return true; 
      if (paramKeyEvent.getKeyCode() == 40 && av())
        return true; 
      if (paramKeyEvent.getKeyCode() == 38 && aw())
        return true; 
    } 
    return super.processKeyBinding(paramKeyStroke, paramKeyEvent, paramInt, paramBoolean);
  }
  
  private boolean as() {
    int[] arrayOfInt1 = getSelectedColumns();
    int[] arrayOfInt2 = getSelectedRows();
    if (arrayOfInt1.length * arrayOfInt2.length > 1) {
      if (arrayOfInt1[arrayOfInt1.length - 1] < getColumnCount() - 1) {
        changeSelection(arrayOfInt2[0], arrayOfInt1[0] + 1, false, false);
        changeSelection(arrayOfInt2[arrayOfInt2.length - 1], arrayOfInt1[arrayOfInt1.length - 1] + 1, false, true);
      } 
      return true;
    } 
    return false;
  }
  
  private int[] ExceptionInVPackage(float paramFloat, int paramInt1, int paramInt2) {
    if (paramInt1 % 2 == 0)
      paramFloat += 0.5F; 
    int[] arrayOfInt = new int[paramInt1];
    int i = Math.round(paramFloat);
    int j = arrayOfInt.length / 2;
    while (i - j < 0) {
      paramFloat++;
      i = Math.round(paramFloat);
    } 
    while (i - j + arrayOfInt.length - 1 > paramInt2) {
      paramFloat--;
      i = Math.round(paramFloat);
    } 
    arrayOfInt[j] = Math.round(paramFloat);
    for (byte b = 1; b <= arrayOfInt.length - j; b++) {
      int k = j - b;
      int m = arrayOfInt[j] - b;
      if (k >= 0 && m >= 0)
        arrayOfInt[k] = m; 
      int n = j + b;
      int i1 = arrayOfInt[j] + b;
      if (n < arrayOfInt.length && i1 <= paramInt2)
        arrayOfInt[n] = i1; 
    } 
    return arrayOfInt;
  }
  
  private void ExceptionInVPackage(float paramFloat1, float paramFloat2) {
    int[] arrayOfInt1 = getSelectedColumns();
    int[] arrayOfInt2 = getSelectedRows();
    if (arrayOfInt1.length * arrayOfInt2.length > 1) {
      int[] arrayOfInt3 = ExceptionInVPackage(paramFloat2, arrayOfInt1.length, getModel().getColumnCount() - 1);
      int[] arrayOfInt4 = ExceptionInVPackage(paramFloat1, arrayOfInt2.length, getModel().getRowCount() - 1);
      if (arrayOfInt3[arrayOfInt3.length - 1] <= getColumnCount() - 1 && (arrayOfInt1[0] != arrayOfInt3[0] || arrayOfInt2[0] != arrayOfInt4[0])) {
        changeSelection(arrayOfInt4[0], arrayOfInt3[0], false, false);
        changeSelection(arrayOfInt4[arrayOfInt4.length - 1], arrayOfInt3[arrayOfInt3.length - 1], false, true);
      } 
    } else if (arrayOfInt1.length * arrayOfInt2.length == 1) {
      int i = Math.round(paramFloat2);
      int j = Math.round(paramFloat1);
      if (arrayOfInt1[0] != i || arrayOfInt2[0] != j) {
        arrayOfInt1[0] = i;
        arrayOfInt2[0] = j;
        changeSelection(arrayOfInt2[0], arrayOfInt1[0], false, false);
      } 
    } 
  }
  
  private boolean at() {
    int[] arrayOfInt1 = getSelectedColumns();
    int[] arrayOfInt2 = getSelectedRows();
    return (arrayOfInt1.length * arrayOfInt2.length > 1);
  }
  
  private boolean au() {
    int[] arrayOfInt1 = getSelectedColumns();
    int[] arrayOfInt2 = getSelectedRows();
    if (arrayOfInt1.length * arrayOfInt2.length > 1) {
      if (arrayOfInt1[0] > 0) {
        changeSelection(arrayOfInt2[0], arrayOfInt1[0] - 1, false, false);
        changeSelection(arrayOfInt2[arrayOfInt2.length - 1], arrayOfInt1[arrayOfInt1.length - 1] - 1, false, true);
      } 
      return true;
    } 
    return false;
  }
  
  private boolean av() {
    int[] arrayOfInt1 = getSelectedColumns();
    int[] arrayOfInt2 = getSelectedRows();
    if (arrayOfInt1.length * arrayOfInt2.length > 1) {
      if (arrayOfInt2[arrayOfInt2.length - 1] < getRowCount() - 1) {
        changeSelection(arrayOfInt2[0] + 1, arrayOfInt1[0], false, false);
        changeSelection(arrayOfInt2[arrayOfInt2.length - 1] + 1, arrayOfInt1[arrayOfInt1.length - 1], false, true);
      } 
      return true;
    } 
    return false;
  }
  
  private boolean aw() {
    int[] arrayOfInt1 = getSelectedColumns();
    int[] arrayOfInt2 = getSelectedRows();
    if (arrayOfInt1.length * arrayOfInt2.length > 1) {
      if (arrayOfInt2[0] > 0) {
        changeSelection(arrayOfInt2[0] - 1, arrayOfInt1[0], false, false);
        changeSelection(arrayOfInt2[arrayOfInt2.length - 1] - 1, arrayOfInt1[arrayOfInt1.length - 1], false, true);
      } 
      return true;
    } 
    return false;
  }
  
  private boolean ExceptionInVPackage(char paramChar) {
    return ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".indexOf(paramChar) != -1);
  }
  
  protected aD R() {
    if (this.F == null)
      this.F = new aD(this, this); 
    return this.F;
  }
  
  private String d(String paramString) {
    return (this.M == null) ? "" : this.M.ExceptionInVPackage(c(paramString));
  }
  
  private void b(String paramString1, String paramString2) {
    if (this.M != null)
      this.M.ExceptionInVPackage(c(paramString1), paramString2); 
  }
  
  public void ExceptionInVPackage(et paramet) {
    this.M = paramet;
    ExceptionInVPackage();
  }
  
  public static boolean S() {
    return U;
  }
  
  public static void f(boolean paramBoolean) {
    U = paramBoolean;
  }
  
  public boolean T() {
    return this.X;
  }
  
  public void g(boolean paramBoolean) {
    this.X = paramBoolean;
  }
  
  public void h(boolean paramBoolean) {
    this.Y = paramBoolean;
  }
  
  public int U() {
    return this.H;
  }
  
  public void f(int paramInt) {
    this.H = paramInt;
  }
  
  public fA V() {
    if (this.ac == null)
      this.ac = fA.ExceptionInVPackage(Color.WHITE); 
    return this.ac;
  }
  
  public static boolean W() {
    return V;
  }
  
  public static void i(boolean paramBoolean) {
    V = paramBoolean;
  }
  
  public void g(double paramDouble) {
    this.I = paramDouble;
  }
  
  public void h(double paramDouble) {
    this.J = paramDouble;
  }
  
  public double X() {
    return this.Q;
  }
  
  public void i(double paramDouble) {
    this.Q = paramDouble;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/BinTableView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */