package bF;

import G.c;
import G.db;
import bH.I;
import bH.X;
import bH.ab;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.fh;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javax.swing.DefaultListSelectionModel;
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
import javax.swing.table.TableModel;

public class D extends JTable implements ClipboardOwner, HierarchyListener {
  private int t = (int)(eJ.a() * 1.2D);
  
  private int u = w() * 3;
  
  int a = 0;
  
  Font b = new Font("Arial Unicode MS", 0, w());
  
  Font c = new Font("Arial Unicode MS", 1, w());
  
  private boolean v = true;
  
  private N w = null;
  
  private L x = null;
  
  boolean d = true;
  
  boolean e = true;
  
  double f = -1.0D;
  
  Clipboard g = Toolkit.getDefaultToolkit().getSystemClipboard();
  
  boolean h = false;
  
  private et y = null;
  
  public static String i = "table1DInitialDir";
  
  private ab z = null;
  
  private int A = 5;
  
  private float B = Float.NaN;
  
  Image j = null;
  
  boolean k = true;
  
  private Map C = new HashMap<>();
  
  private String[][] D = null;
  
  private boolean E = false;
  
  List l = new ArrayList();
  
  Stroke m = new BasicStroke(2.0F);
  
  Color n = new Color(0, 0, 255, 180);
  
  Color o = new Color(0, 0, 0, 85);
  
  private boolean F = false;
  
  long p = -1L;
  
  double q = 0.0D;
  
  String r = "";
  
  long s = 0L;
  
  public D() {
    this((y)null);
  }
  
  public D(y paramy) {
    super(paramy);
    DefaultListSelectionModel defaultListSelectionModel = new DefaultListSelectionModel();
    defaultListSelectionModel.setSelectionMode(2);
    setInputVerifier(new O(this));
    setSelectionModel(defaultListSelectionModel);
    setFont(this.b);
    setColumnSelectionAllowed(true);
    addMouseListener(new P(this));
    UIManager.put("ToolTip.background", new Color(240, 240, 240));
    ToolTipManager.sharedInstance().setDismissDelay(15000);
    addKeyListener(new E(this));
  }
  
  public void a() {
    String str = c("Set increment amount");
    if (str != null && !str.equals("")) {
      float f = Float.parseFloat(str);
      a(f);
    } 
  }
  
  private void a(KeyEvent paramKeyEvent) {
    if (h().f()) {
      int i = getSelectedColumn();
      int j = getSelectedRow();
      int k = getRowCount();
      int m = getColumnCount();
      if (paramKeyEvent.getKeyCode() == 9 && paramKeyEvent.isShiftDown()) {
        TableCellEditor tableCellEditor = getCellEditor();
        if (tableCellEditor != null)
          if (I.a(tableCellEditor.getCellEditorValue().toString())) {
            tableCellEditor.stopCellEditing();
          } else {
            tableCellEditor.cancelCellEditing();
          }  
        if (j > 0) {
          changeSelection(j - 1, i, false, false);
        } else if (i > 0) {
          changeSelection(k - 1, i - 1, false, false);
        } else {
          changeSelection(k - 1, m - 1, false, false);
        } 
        paramKeyEvent.consume();
      } else if (paramKeyEvent.getKeyCode() == 10 || paramKeyEvent.getKeyCode() == 9) {
        TableCellEditor tableCellEditor = getCellEditor();
        if (tableCellEditor != null)
          if (I.a(tableCellEditor.getCellEditorValue().toString())) {
            tableCellEditor.stopCellEditing();
          } else {
            tableCellEditor.cancelCellEditing();
          }  
        if (j < k - 1) {
          changeSelection(j + 1, i, false, false);
        } else if (i < m - 1) {
          changeSelection(0, i + 1, false, false);
        } else {
          changeSelection(0, 0, false, false);
        } 
        paramKeyEvent.consume();
      } 
    } 
  }
  
  private String b(String paramString) {
    if (this.z != null) {
      String str = (String)this.C.get(paramString);
      if (str != null)
        return str; 
      str = this.z.a(paramString);
      this.C.put(paramString, str);
      return str;
    } 
    return paramString;
  }
  
  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return ((getSelectedRows()).length <= 1 && (getSelectedColumns()).length <= 1 && d());
  }
  
  public int b() {
    int j;
    int i = 0;
    if (h().f()) {
      j = h().getColumnCount();
    } else {
      j = h().getRowCount();
    } 
    for (byte b = 0; b < j; b++) {
      C c = h().a(b, b);
      if (c.c() > i)
        i = c.c(); 
    } 
    return i;
  }
  
  protected TableModel createDefaultDataModel() {
    y y = new y();
    c c = new c(8);
    c.a((db)new c("Row 1"));
    for (byte b = 0; b < c.a(); b++)
      c.a(b, Double.valueOf(50.0D)); 
    y.a(c);
    return y;
  }
  
  public void lostOwnership(Clipboard paramClipboard, Transferable paramTransferable) {}
  
  public void c() {
    String str = "";
    int[] arrayOfInt1 = getSelectedColumns();
    int[] arrayOfInt2 = getSelectedRows();
    for (int i = arrayOfInt2[0]; i < getRowCount() && i <= arrayOfInt2[arrayOfInt2.length - 1]; i++) {
      for (int j = arrayOfInt1[0]; j < getColumnCount() && j <= arrayOfInt1[arrayOfInt1.length - 1]; j++) {
        y y = (y)getModel();
        Double double_ = (Double)y.getValueAt(i, j);
        str = str + X.c(double_.doubleValue(), y.a(i, j).c()) + "\t";
      } 
      str = str + "\n";
    } 
    StringSelection stringSelection = new StringSelection(str);
    this.g.setContents(stringSelection, this);
  }
  
  protected boolean d() {
    return true;
  }
  
  public void e() {
    if (!d())
      return; 
    s();
    y y = (y)getModel();
    String str = "";
    try {
      str = this.g.getData(DataFlavor.stringFlavor).toString();
    } catch (Exception exception) {
      System.out.println("Clipboard data not valid");
      return;
    } 
    StringTokenizer stringTokenizer = new StringTokenizer(str, "\n");
    for (int i = getSelectedRow(); i < y.getRowCount() && stringTokenizer.hasMoreTokens(); i++) {
      StringTokenizer stringTokenizer1 = new StringTokenizer(stringTokenizer.nextToken(), "\t");
      for (int j = getSelectedColumn(); j < y.getColumnCount() && stringTokenizer1.hasMoreTokens(); j++) {
        String str1 = stringTokenizer1.nextToken();
        try {
          y.setValueAt(new Double(str1), i, j);
        } catch (Exception exception) {
          System.out.println("bad Double " + str1);
          return;
        } 
      } 
    } 
  }
  
  public TableCellEditor getCellEditor(int paramInt1, int paramInt2) {
    L l = (L)super.getCellEditor(paramInt1, paramInt2);
    y y = (y)getModel();
    if (y.f()) {
      l.a(paramInt2);
    } else {
      l.a(paramInt1);
    } 
    return l;
  }
  
  protected TableColumnModel createDefaultColumnModel() {
    TableColumnModel tableColumnModel = super.createDefaultColumnModel();
    tableColumnModel.addColumnModelListener(this);
    return tableColumnModel;
  }
  
  public int f() {
    return getWidth() / getColumnModel().getColumnCount();
  }
  
  protected int g() {
    return (getFont() != null) ? (getFont().getSize() * 3) : (this.t * 3);
  }
  
  public void columnAdded(TableColumnModelEvent paramTableColumnModelEvent) {
    TableColumnModel tableColumnModel = (TableColumnModel)paramTableColumnModelEvent.getSource();
    TableColumn tableColumn = tableColumnModel.getColumn(paramTableColumnModelEvent.getToIndex());
    tableColumn.setMaxWidth(g());
    tableColumn.setPreferredWidth(g());
    super.columnAdded(paramTableColumnModelEvent);
  }
  
  public TableCellRenderer getCellRenderer(int paramInt1, int paramInt2) {
    y y = (y)getModel();
    if (!getFont().equals(this.b))
      setFont(this.b); 
    if (y.f()) {
      x().a(paramInt2);
    } else {
      x().a(paramInt1);
    } 
    if (!isEnabled()) {
      x().setBackground(Color.LIGHT_GRAY);
      x().setForeground(Color.GRAY);
      return x();
    } 
    Color color = h().f() ? a(paramInt2) : a(paramInt1);
    if (color != null) {
      x().setBackground(color);
      x().setForeground(Color.black);
    } else if (this.d && getModel().getValueAt(paramInt1, paramInt2) != null) {
      Double double_ = (Double)y.getValueAt(paramInt1, paramInt2);
      color = fh.a(double_.doubleValue(), y.a(paramInt1, paramInt2).d(), y.a(paramInt1, paramInt2).e());
      x().setBackground(color);
      x().setForeground(Color.black);
    } else {
      x().setBackground(Color.white);
      x().setForeground(Color.black);
    } 
    if (getModel().getValueAt(paramInt1, paramInt2) != null) {
      double d = ((Double)y.getValueAt(paramInt1, paramInt2)).doubleValue() - Double.valueOf(y.c(paramInt1, paramInt2)).doubleValue();
      if (d < 0.0D && Math.abs(d) > c(paramInt1, paramInt2) * 0.5D) {
        x().setForeground(new Color(115, 0, 0));
      } else if (d > c(paramInt1, paramInt2) * 0.5D) {
        x().setForeground(new Color(30, 30, 255));
      } 
      if (!y.b(paramInt1, paramInt2) && x() != null) {
        try {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("<html>").append(b("Beginning Value")).append(": ").append(X.c(y.c(paramInt1, paramInt2), b()));
          if (this.D != null && this.D[paramInt1][paramInt2] != null)
            stringBuilder.append("<br>Interpolated Value: ").append(this.D[paramInt1][paramInt2]); 
          stringBuilder.append("</html>");
          x().setToolTipText(stringBuilder.toString());
        } catch (Exception exception) {
          exception.printStackTrace();
          System.out.println("Error getting clean value for table tooltip");
        } 
      } else if (this.D != null) {
        try {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("<html>");
          stringBuilder.append("Interpolated Value: ").append(this.D[paramInt1][paramInt2]);
          stringBuilder.append("</html>");
          x().setToolTipText(stringBuilder.toString());
        } catch (Exception exception) {
          exception.printStackTrace();
          System.out.println("Error getting clean value for table tooltip");
        } 
      } else {
        x().setToolTipText("");
      } 
    } 
    x();
    x().setHorizontalAlignment(0);
    return x();
  }
  
  protected JTableHeader createDefaultTableHeader() {
    JTableHeader jTableHeader = super.createDefaultTableHeader();
    jTableHeader.setResizingAllowed(false);
    jTableHeader.setAlignmentX(0.5F);
    v v = new v(this);
    v.setFont(new Font("Arial Unicode MS", 0, eJ.a(12)));
    jTableHeader.setDefaultRenderer(v);
    v.setBackground(UIManager.getColor("Label.background"));
    jTableHeader.setBackground(UIManager.getColor("Label.background"));
    v.a(false);
    return jTableHeader;
  }
  
  private Image z() {
    if (this.j == null || this.j.getWidth(null) != getWidth() || this.j.getHeight(null) != getHeight())
      this.j = createImage(getWidth(), getHeight()); 
    return this.j;
  }
  
  public void paint(Graphics paramGraphics) {
    if (this.p > 0L) {
      long l = System.currentTimeMillis() - this.p;
      this.q = (this.q * 4.0D + 1000.0D / l) / 5.0D;
    } 
    this.p = System.currentTimeMillis();
    if (this.k) {
      Image image = z();
      a(image.getGraphics());
      paramGraphics.drawImage(image, 0, 0, null);
    } else {
      a(paramGraphics);
    } 
  }
  
  public void a(Graphics paramGraphics) {
    try {
      super.paint(paramGraphics);
    } catch (Exception exception) {
      exception.printStackTrace();
      bH.D.c("Table1DView paint error.");
      return;
    } 
    if (this.f >= 0.0D) {
      byte b = 2;
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      paramGraphics.setColor(this.o);
      graphics2D.setStroke(this.m);
      if (h().f()) {
        int i = f() * r().getColumnCount() - 3 * b;
        int j = getRowHeight() - 2 * b;
        int k = (int)((getRowHeight() * r().getRowCount()) * this.f);
        paramGraphics.fillRoundRect(b, b + k, i, j, f(), getRowHeight());
        paramGraphics.setColor(this.n);
        paramGraphics.drawRoundRect(b, b + k, i, j, f(), getRowHeight());
      } else {
        int i = f() - 2 * b;
        int j = getRowHeight() * r().getRowCount() - 3 * b;
        int k = (int)((f() * r().getColumnCount()) * this.f);
        paramGraphics.fillRoundRect(b + k, b, i, j, f(), getRowHeight());
        paramGraphics.setColor(this.n);
        paramGraphics.drawRoundRect(b + k, b, i, j, f(), getRowHeight());
      } 
    } 
  }
  
  public void a(double paramDouble) {
    if (!isEnabled() || !this.e)
      return; 
    String[] arrayOfString = ((y)getModel()).e();
    this.f = fh.b(arrayOfString, paramDouble) / arrayOfString.length;
    y y = h();
    int i = y.getRowCount();
    int j = y.getColumnCount();
    if (this.D == null)
      this.D = new String[i][j]; 
    double d = (y.e()).length * this.f;
    int k = (int)Math.floor(d);
    int m = (int)Math.ceil(d);
    for (byte b = 0; b < i; b++) {
      for (byte b1 = 0; b1 < j; b1++) {
        if (b1 >= k && b1 <= m) {
          double d1 = d - k;
          double d2 = ((Double)y.getValueAt(b, k)).doubleValue() * (1.0D - d1) + ((Double)y.getValueAt(b, m)).doubleValue() * d1;
          this.D[b][b1] = X.c(d2, b());
        } else {
          this.D[b][b1] = null;
        } 
      } 
    } 
  }
  
  public y h() {
    return (y)getModel();
  }
  
  public void i() {
    if (!d())
      return; 
    s();
    for (byte b = 0; b < getRowCount(); b++) {
      for (byte b1 = 0; b1 < getColumnCount(); b1++) {
        if (isCellSelected(b, b1)) {
          y y = (y)getModel();
          Double double_ = (Double)y.getValueAt(b, b1);
          if (double_ != null && !double_.isNaN()) {
            double d = double_.doubleValue() + d(b, b1);
            y.setValueAt(Double.valueOf(d), b, b1);
          } 
        } 
      } 
    } 
    repaint();
  }
  
  public void j() {
    if (!d())
      return; 
    s();
    for (byte b = 0; b < getRowCount(); b++) {
      for (byte b1 = 0; b1 < getColumnCount(); b1++) {
        if (isCellSelected(b, b1)) {
          y y = (y)getModel();
          Double double_ = (Double)y.getValueAt(b, b1);
          if (double_ != null && !double_.isNaN()) {
            double d = double_.doubleValue() - d(b, b1);
            y.setValueAt(Double.valueOf(d), b, b1);
          } 
        } 
      } 
    } 
    repaint();
  }
  
  public void k() {
    int[] arrayOfInt1 = getSelectedRows();
    int[] arrayOfInt2 = getSelectedColumns();
    if (arrayOfInt1 != null && arrayOfInt1.length > 0)
      b((d(arrayOfInt1[0], arrayOfInt2[0]) * u())); 
  }
  
  public void l() {
    if (!this.E || (!d() && getSelectedColumn() >= 0 && getSelectedRow() >= 0))
      return; 
    s();
    y y = (y)getModel();
    double d = ((Double)y.getValueAt(getSelectedRow(), getSelectedColumn())).doubleValue();
    for (int i = getSelectionModel().getMaxSelectionIndex(); i >= 0; i--) {
      for (int j = getSelectedColumn(); j < y.getColumnCount(); j++) {
        try {
          y.setValueAt(new Double(d), i, j);
        } catch (Exception exception) {
          System.out.println("bad Double " + d);
          return;
        } 
      } 
    } 
  }
  
  public void m() {
    int[] arrayOfInt1 = getSelectedRows();
    int[] arrayOfInt2 = getSelectedColumns();
    if (arrayOfInt1 != null && arrayOfInt1.length > 0)
      b((-d(arrayOfInt1[0], arrayOfInt2[0]) * u())); 
  }
  
  public void n() {
    if (!d())
      return; 
    s();
    this.e = false;
    String str = bV.a("{" + b("Multiply Selected Cells by: ex. 1.2 = raise by 20%") + "}", true, b("Scale Cells"), true, this);
    this.e = true;
    requestFocus();
    if (str != null && !str.equals("")) {
      double d = Double.parseDouble(str);
      d(d);
    } 
  }
  
  public void o() {
    if (!d())
      return; 
    s();
    this.e = false;
    String str = bV.a("{" + b("Increase Selected Cells by") + ":}", true, b("Add To Cells"), true, this);
    this.e = true;
    requestFocus();
    if (str != null && !str.equals("")) {
      double d = Double.parseDouble(str);
      b(d);
    } 
  }
  
  public void p() {
    if (!d() || !y())
      return; 
    s();
    int[] arrayOfInt1 = getSelectedColumns();
    int[] arrayOfInt2 = getSelectedRows();
    if (arrayOfInt1.length == 0 || arrayOfInt2.length == 0)
      return; 
    if (r().f()) {
      if (arrayOfInt2.length > 1)
        for (byte b = 0; b < arrayOfInt1.length; b++) {
          double d1 = ((Double)h().getValueAt(arrayOfInt2[0], arrayOfInt1[b])).doubleValue();
          double d2 = ((Double)h().getValueAt(arrayOfInt2[arrayOfInt2.length - 1], arrayOfInt1[b])).doubleValue();
          for (byte b1 = 0; b1 < arrayOfInt2.length; b1++) {
            double d = d1 + b1 * (d2 - d1) / (arrayOfInt2.length - 1);
            getModel().setValueAt(Double.valueOf(d), arrayOfInt2[b1], arrayOfInt1[b]);
          } 
        }  
    } else if (arrayOfInt1.length > 1) {
      for (byte b = 0; b < arrayOfInt2.length; b++) {
        C c = r().a(arrayOfInt2[b], arrayOfInt1[0]);
        double d1 = c.a(arrayOfInt1[0]).doubleValue();
        double d2 = c.a(arrayOfInt1[arrayOfInt1.length - 1]).doubleValue();
        for (byte b1 = 0; b1 < arrayOfInt1.length; b1++) {
          double d = d1 + b1 * (d2 - d1) / (arrayOfInt1.length - 1);
          getModel().setValueAt(Double.valueOf(d), arrayOfInt2[b], arrayOfInt1[b1]);
        } 
      } 
    } 
    repaint();
  }
  
  public void removeEditor() {
    int i = getEditingColumn();
    int j = getEditingRow();
    super.removeEditor();
    if (this.F && i >= 0 && j >= 0) {
      F f = new F(this, j, i);
      SwingUtilities.invokeLater(f);
      this.F = false;
    } 
  }
  
  public void q() {
    if (!d())
      return; 
    this.e = false;
    String str = bV.a("{" + b("Decrease Selected Cells by") + ":}", true, b("Subtract From Cells"), true, this);
    this.e = true;
    requestFocus();
    if (str != null && !str.equals("")) {
      double d = Double.parseDouble(str);
      b(-d);
    } 
  }
  
  public void b(double paramDouble) {
    if (!d())
      return; 
    s();
    for (byte b = 0; b < getRowCount(); b++) {
      for (byte b1 = 0; b1 < getColumnCount(); b1++) {
        if (isCellSelected(b, b1)) {
          y y = (y)getModel();
          Double double_ = (Double)y.getValueAt(b, b1);
          if (double_ != null && !double_.isNaN())
            y.setValueAt(new Double(a(double_.doubleValue(), paramDouble)), b, b1); 
        } 
      } 
    } 
    repaint();
  }
  
  private double a(double paramDouble1, double paramDouble2) {
    long l1 = (long)((paramDouble1 + paramDouble2) * 1000000.0D);
    long l2 = Math.round(l1 / 100.0D);
    return l2 / 10000.0D;
  }
  
  public void c(double paramDouble) {
    if (!d())
      return; 
    s();
    ((y)getModel()).e(true);
    for (byte b = 0; b < getColumnCount(); b++) {
      for (byte b1 = 0; b1 < getRowCount(); b1++) {
        if (isCellSelected(b1, b)) {
          y y = (y)getModel();
          Double double_ = (Double)y.getValueAt(b1, b);
          if (double_ != null)
            y.setValueAt(Double.valueOf(paramDouble), b1, b); 
        } 
      } 
    } 
    repaint();
  }
  
  public void d(double paramDouble) {
    if (!d())
      return; 
    s();
    for (byte b = 0; b < getColumnCount(); b++) {
      for (byte b1 = 0; b1 < getRowCount(); b1++) {
        if (isCellSelected(b1, b)) {
          y y = (y)getModel();
          Double double_ = (Double)y.getValueAt(b1, b);
          double d = double_.doubleValue() * paramDouble;
          y.setValueAt(new Double(d), b1, b);
        } 
      } 
    } 
  }
  
  public y r() {
    return (y)getModel();
  }
  
  public void s() {
    y y = (y)getModel();
    this.h = true;
  }
  
  private boolean A() {
    return (getSelectedRowCount() > 1 || getSelectedColumnCount() > 1);
  }
  
  public void a(String paramString) {
    y y = (y)getModel();
    if (paramString != null && paramString.equals(b("Increment - Key: > or ,"))) {
      i();
      repaint();
    } else if (paramString != null && paramString.equals(b("Decrement - Key: < or ."))) {
      j();
      repaint();
    } else if (paramString != null && paramString.equals(b("Increase by - Key: +"))) {
      o();
      repaint();
    } else if (paramString != null && paramString.equals(b("Decrease by - Key: -"))) {
      q();
      repaint();
    } else if (paramString != null && paramString.equals(b("Scale by - Key: *"))) {
      n();
      repaint();
    } else if (paramString != null && paramString.equals(b("Set to - Key: ="))) {
      t();
    } else if (paramString != null && paramString.equals(b("Copy CTRL-C"))) {
      c();
    } else if (paramString != null && paramString.equals(b("Paste CTRL-V"))) {
      e();
      repaint();
    } else if (paramString != null && paramString.equals(b("Interpolate - Key: /"))) {
      p();
    } else if (paramString != null && paramString.startsWith(b("Set increment amount"))) {
      B();
    } 
  }
  
  public void t() {
    if (!d())
      return; 
    this.e = false;
    String str = bV.a("{" + b("Set Selected Cells to") + ":}", true, b("Set Cell Values"), true, this);
    this.e = true;
    requestFocus();
    if (str != null && !str.equals("")) {
      double d = Double.parseDouble(str);
      c(d);
      ((y)getModel()).e(false);
    } 
  }
  
  public void a(int paramInt1, int paramInt2) {
    int i = paramInt1 / f();
    int j = paramInt2 / getRowHeight();
    if (!isCellSelected(j, i))
      changeSelection(j, i, false, false); 
  }
  
  public void b(int paramInt1, int paramInt2) {
    int i = paramInt1 / f();
    int j = paramInt2 / getRowHeight();
    JPopupMenu jPopupMenu = new JPopupMenu();
    add(jPopupMenu);
    G g = new G(this);
    if (d() && y()) {
      jPopupMenu.add(b("Set to - Key: =")).addActionListener(g);
      jPopupMenu.add(b("Increment - Key: > or ,")).addActionListener(g);
      jPopupMenu.add(b("Decrement - Key: < or .")).addActionListener(g);
      jPopupMenu.add(b("Increase by - Key: +")).addActionListener(g);
      jPopupMenu.add(b("Decrease by - Key: -")).addActionListener(g);
      jPopupMenu.add(b("Scale by - Key: *")).addActionListener(g);
      jPopupMenu.add(b("Set increment amount")).addActionListener(g);
      jPopupMenu.add(b("Interpolate - Key: /")).addActionListener(g);
      jPopupMenu.addSeparator();
    } 
    jPopupMenu.add(b("Copy CTRL-C")).addActionListener(g);
    if (d())
      jPopupMenu.add(b("Paste CTRL-V")).addActionListener(g); 
    jPopupMenu.addSeparator();
    jPopupMenu.show(this, paramInt1, paramInt2);
  }
  
  public void changeSelection(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    super.changeSelection(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    this.r = "";
    v();
  }
  
  public void a(ab paramab) {
    this.z = paramab;
  }
  
  public int u() {
    return this.A;
  }
  
  private void B() {
    String str = bV.a(this, true, b("Preferred Cell Increment Size"), d(0, 0) + "");
    if (str != null && !str.equals("")) {
      float f = d(0, 0);
      try {
        f = Float.parseFloat(str);
        if (f <= 0.0F) {
          bV.d(b("Increment size should be greater than zero."), this);
          return;
        } 
        a(f);
      } catch (Exception exception) {
        bV.d(b("Invalid Increment size") + " " + f, this);
        return;
      } 
    } 
  }
  
  public void a(float paramFloat) {
    this.B = paramFloat;
    a("Set increment amount", paramFloat + "");
  }
  
  private float d(int paramInt1, int paramInt2) {
    return !Float.isNaN(this.B) ? this.B : (float)c(paramInt1, paramInt2);
  }
  
  public void repaint() {
    super.repaint();
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
    v();
  }
  
  public void v() {
    y y = (y)getModel();
    if (y.j())
      y.e(false); 
  }
  
  public double c(int paramInt1, int paramInt2) {
    double d;
    if (h().f()) {
      d = h().a(paramInt1, paramInt2).d(paramInt1);
    } else {
      d = h().a(paramInt1, paramInt2).d(paramInt2);
    } 
    if (Double.isNaN(d)) {
      y y = (y)getModel();
      return Math.pow(10.0D, 1.0D - y.a(paramInt1, paramInt2).c()) / 10.0D;
    } 
    return d;
  }
  
  public TableCellEditor getDefaultEditor(Class paramClass) {
    if (this.x == null) {
      this.x = new L(this);
      this.x.getComponent().setFont(getFont());
      this.x.getComponent().addFocusListener(new H(this));
    } 
    return this.x;
  }
  
  public boolean editCellAt(int paramInt1, int paramInt2, EventObject paramEventObject) {
    if (paramEventObject instanceof KeyEvent) {
      KeyEvent keyEvent = (KeyEvent)paramEventObject;
      if (keyEvent.getKeyCode() == 32)
        return false; 
    } 
    boolean bool = super.editCellAt(paramInt1, paramInt2, paramEventObject);
    if (bool)
      this.x.a(); 
    return bool;
  }
  
  public Color a(int paramInt) {
    return (paramInt < this.l.size()) ? this.l.get(paramInt) : null;
  }
  
  public void a(Color paramColor) {
    this.l.add(paramColor);
  }
  
  public int w() {
    return this.t;
  }
  
  public void b(int paramInt) {
    this.t = paramInt;
    if (this.v) {
      this.b = new Font(this.b.getFontName(), 1, paramInt);
    } else {
      this.b = new Font(this.b.getFontName(), 0, paramInt);
    } 
    this.c = new Font(this.b.getFontName(), 1, paramInt);
    this.w = null;
    this.x = null;
  }
  
  protected boolean processKeyBinding(KeyStroke paramKeyStroke, KeyEvent paramKeyEvent, int paramInt, boolean paramBoolean) {
    if (paramKeyEvent.getID() == 401 && paramKeyEvent.getKeyCode() == 10 && isEditing()) {
      this.F = true;
    } else if (paramKeyEvent.getID() == 401 && (I.a(paramKeyEvent.getKeyChar() + "") || (paramKeyEvent.getKeyCode() == 8 && !this.r.isEmpty())) && ((paramKeyEvent.getKeyCode() != 46 && paramKeyEvent.getKeyCode() != 110) || (!this.r.isEmpty() && !this.r.contains(".")))) {
      this.s = System.currentTimeMillis();
      if (paramKeyEvent.getKeyCode() == 8) {
        if (!this.r.isEmpty())
          this.r = this.r.substring(0, this.r.length() - 1); 
      } else if (!this.r.contains(".") || this.r.length() - this.r.indexOf(".") <= b()) {
        this.r += paramKeyEvent.getKeyChar();
      } 
      if (!this.r.isEmpty()) {
        c(Double.parseDouble(this.r));
      } else {
        c(0.0D);
      } 
      return true;
    } 
    if (paramKeyEvent.getID() == 401) {
      this.r = "";
      v();
    } 
    if (paramKeyEvent.getID() == 401 && paramInt == 0) {
      if (paramKeyEvent.getModifiers() == 1)
        switch (paramKeyEvent.getKeyCode()) {
          case 61:
            SwingUtilities.invokeLater(new I(this));
            return true;
          case 56:
            n();
            return true;
        }  
      if (paramKeyEvent.getModifiers() == 2)
        switch (paramKeyEvent.getKeyCode()) {
          case 67:
            c();
            return true;
          case 86:
            e();
            return true;
          case 44:
            m();
            return true;
          case 46:
            k();
            return true;
          case 87:
            return false;
          case 81:
            return false;
          case 9:
            transferFocus();
            return true;
          case 70:
            l();
            return true;
        }  
      switch (paramKeyEvent.getKeyCode()) {
        case 45:
          if (A()) {
            SwingUtilities.invokeLater(new J(this));
            return true;
          } 
          break;
        case 109:
          if (A()) {
            SwingUtilities.invokeLater(new K(this));
            return true;
          } 
          break;
        case 521:
          o();
          return true;
        case 106:
          n();
          return true;
        case 44:
          j();
          return true;
        case 46:
          i();
          return true;
        case 87:
          j();
          return true;
        case 81:
          i();
          return true;
        case 61:
          t();
          return true;
        case 107:
          o();
          return true;
        case 47:
          p();
          return true;
        case 111:
          p();
          return true;
        case 70:
          l();
          return true;
      } 
      if (paramKeyEvent.getModifiers() == 0 && a(paramKeyEvent.getKeyChar()) && !I.a(paramKeyEvent.getKeyChar() + "") && paramKeyEvent.getKeyCode() != 10 && paramKeyEvent.getKeyCode() != 9 && paramKeyEvent.getKeyCode() != 38 && paramKeyEvent.getKeyCode() != 40 && paramKeyEvent.getKeyCode() != 37 && paramKeyEvent.getKeyCode() != 32 && paramKeyEvent.getKeyCode() != 39) {
        v();
        return true;
      } 
    } 
    return super.processKeyBinding(paramKeyStroke, paramKeyEvent, paramInt, paramBoolean);
  }
  
  private boolean a(char paramChar) {
    return ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".indexOf(paramChar) != -1);
  }
  
  protected N x() {
    if (this.w == null)
      this.w = new N(this, this); 
    return this.w;
  }
  
  private String c(String paramString) {
    return (this.y == null) ? "" : this.y.a(paramString);
  }
  
  private void a(String paramString1, String paramString2) {
    if (this.y != null)
      this.y.a(paramString1, paramString2); 
  }
  
  public void a(et paramet) {
    this.y = paramet;
    a();
  }
  
  public boolean y() {
    return this.E;
  }
  
  public void a(boolean paramBoolean) {
    this.E = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */