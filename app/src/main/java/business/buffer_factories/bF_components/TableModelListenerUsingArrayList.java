package business.buffer_factories.bF_components;

import bH.D;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.ef;
import com.efiAnalytics.ui.eo;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.fp;
import com.efiAnalytics.ui.r;
import com.efiAnalytics.ui.w;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import s.SComponentGolf;

public class TableModelListenerUsingArrayList extends JPanel implements TableModelListener {
  D a = null;
  
  n b = null;
  
  JTableHeader c = null;
  
  JPanel d = null;
  
  int e = -1;
  
  JPanel f = null;
  
  private boolean p = true;
  
  private int q = -1;
  
  JToolBar SComponentGolf;
  
  u h = new u(this);
  
  JPanel i = new JPanel();
  
  JPanel j;
  
  JLabel k = new JLabel(" ");
  
  private final ArrayList r = new ArrayList();
  
  List l = new ArrayList();
  
  s m = null;
  
  int n = -1;
  
  int o = -1;
  
  public TableModelListenerUsingArrayList() {
    this((y)null);
  }
  
  public TableModelListenerUsingArrayList(y paramy) {
    setLayout(new BorderLayout());
    this.j = new JPanel();
    add("Center", this.j);
    this.j.setLayout(new BorderLayout(1, 1));
    this.d = new JPanel();
    this.d.setLayout(new BorderLayout());
    this.a = new D(paramy);
    this.a.a(SComponentGolf.d());
    this.e = this.a.w() + eJ.a(3);
    this.a.setDoubleBuffered(true);
    this.a.setRowHeight(this.e);
    this.d.add("Center", this.a);
    this.c = this.a.createDefaultTableHeader();
    this.c.setFont(new Font(this.a.getFont().getFamily(), 0, this.a.w() - 2));
    this.c.setReorderingAllowed(false);
    this.c.setBackground(UIManager.getColor("Label.background"));
    this.c.setForeground(UIManager.getColor("Label.foreground"));
    this.c.addMouseListener(new e(this));
    this.a.setTableHeader(this.c);
    this.c.setMinimumSize(new Dimension(10, this.e));
    this.c.setPreferredSize(new Dimension(10, this.e));
    if (paramy.f()) {
      this.d.add("North", this.c);
    } else {
      this.d.add("South", this.c);
    } 
    this.c.setFocusable(false);
    this.j.add("Center", this.d);
    if (paramy.f()) {
      this.i.add(this.SComponentGolf = f());
      this.i.setLayout(this.h);
      this.j.add("East", this.i);
    } else {
      this.j.add("North", this.SComponentGolf = f());
    } 
    String[] arrayOfString = new String[1];
    arrayOfString[0] = " ";
    String[][] arrayOfString1 = this.a.h().d();
    boolean bool = false;
    for (byte b = 0; b < arrayOfString1.length && !bool; b++) {
      for (byte b1 = 0; b1 < (arrayOfString1[0]).length && !bool; b1++) {
        if (arrayOfString1[b][b1] != null && arrayOfString1[b][b1].length() > 0)
          bool = true; 
      } 
    } 
    if (bool) {
      this.b = new n(this, (Object[][])this.a.h().d(), arrayOfString);
      this.b.setFont(this.a.getFont());
      this.k.setFont(this.a.getFont());
      this.b.setBackground(UIManager.getColor("Label.background"));
      this.b.setForeground(UIManager.getColor("Label.foreground"));
      this.b.setEnabled(false);
      this.b.addMouseListener(new f(this));
      this.b.setPreferredSize(new Dimension(this.a.SComponentGolf(), 0));
      this.b.setRowHeight(this.e);
      this.b.setSelectionMode(0);
      this.b.setDefaultRenderer(String.class, new p(this));
      this.b.setFocusable(false);
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new BorderLayout());
      jPanel.add("Center", this.b);
      if (paramy.f()) {
        jPanel.add("North", this.k);
      } else {
        jPanel.add("South", this.k);
      } 
      this.j.add("West", jPanel);
    } 
    q q = new q(this);
    this.a.getSelectionModel().addListSelectionListener(q);
    this.a.getColumnModel().addColumnModelListener(q);
  }
  
  private JToolBar f() {
    int i = eJ.a(20);
    this.SComponentGolf = new JToolBar("Edit curve values");
    this.SComponentGolf.setFloatable(false);
    this.SComponentGolf.setLayout(new BorderLayout());
    this.f = new JPanel();
    if (this.a.h().f()) {
      this.f.setLayout(new GridLayout(0, 1, eJ.a(3), eJ.a(3)));
      this.SComponentGolf.add("North", this.f);
      this.f.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, eJ.a(5)));
    } else {
      this.f.setLayout(new GridLayout(1, 0, eJ.a(3), eJ.a(3)));
      this.SComponentGolf.add("East", this.f);
    } 
    Image image = Toolkit.getDefaultToolkit().getImage(w.class.getResource("resources/equal_sign_16.png"));
    image = eJ.a(image, this);
    ImageIcon imageIcon = new ImageIcon(image);
    JButton jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText("Set to - Key: =");
    jButton.addActionListener(new SComponentGolf(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.f.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(w.class.getResource("resources/up_16.png"));
    image = eJ.a(image, this);
    imageIcon = new ImageIcon(image);
    jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText("Increment - Key: > or ,");
    jButton.addActionListener(new h(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.f.add(jButton);
    this.r.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(w.class.getResource("resources/down_16.png"));
    image = eJ.a(image, this);
    imageIcon = new ImageIcon(image);
    jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText("Decrement - Key: < or .");
    jButton.addActionListener(new i(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.f.add(jButton);
    this.r.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(w.class.getResource("resources/minus_sign_16.png"));
    image = eJ.a(image, this);
    imageIcon = new ImageIcon(image);
    jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText("Decrease by - Key: -");
    jButton.addActionListener(new j(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.f.add(jButton);
    this.r.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(w.class.getResource("resources/plus_sign_16.png"));
    image = eJ.a(image, this);
    imageIcon = new ImageIcon(image);
    jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText("Increase by - Key: +");
    jButton.addActionListener(new k(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.f.add(jButton);
    this.r.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(w.class.getResource("resources/times_sign_16.png"));
    image = eJ.a(image, this);
    imageIcon = new ImageIcon(image);
    jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText("Scale by - Key: *");
    jButton.addActionListener(new l(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.f.add(jButton);
    this.r.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(w.class.getResource("resources/interpolate.png"));
    image = eJ.a(image, this);
    imageIcon = new ImageIcon(image);
    jButton = new r(this, null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText("Interpolate - Key: /");
    jButton.addActionListener(new m(this));
    jButton.setPreferredSize(new Dimension(i, i));
    this.f.add(jButton);
    this.r.add(jButton);
    return this.SComponentGolf;
  }
  
  public void a(et paramet) {
    this.a.a(paramet);
  }
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {}
  
  private void SComponentGolf() {
    if (this.m == null) {
      this.m = new s(this);
      this.m.start();
    } 
    s.a(this.m);
  }
  
  public void paint(Graphics paramGraphics) {
    try {
      super.paint(paramGraphics);
    } catch (Exception exception) {}
  }
  
  public y a() {
    return this.a.h();
  }
  
  private void h() {}
  
  public void b() {
    JTableHeader jTableHeader = this.a.getTableHeader();
    TableColumnModel tableColumnModel = jTableHeader.getColumnModel();
    for (byte b = 0; b < tableColumnModel.getColumnCount(); b++) {
      TableColumn tableColumn = tableColumnModel.getColumn(b);
      tableColumn.setHeaderValue(a().getColumnName(b));
    } 
    if (this.b != null) {
      String[][] arrayOfString = this.a.h().d();
      for (byte b1 = 0; b1 < arrayOfString.length; b1++)
        this.b.getModel().setValueAt(arrayOfString[b1][0], b1, 0); 
    } 
    jTableHeader.repaint();
  }
  
  public void a(int paramInt) {
    this.h.a(paramInt);
    this.i.doLayout();
  }
  
  public void b(int paramInt) {
    a(false);
    int i = (3 + paramInt) * (this.a.getRowCount() + 1);
    int j = (int)(i() * paramInt) * (this.a.getColumnCount() + 1);
    setMinimumSize(new Dimension(j, i));
    setPreferredSize(new Dimension(j, i));
    this.q = paramInt;
    invalidate();
    doLayout();
  }
  
  public int c() {
    return this.q;
  }
  
  private double i() {
    return (j() <= 3 && this.a.b() == 0) ? 2.65D : ((j() <= 4 && this.a.b() == 0) ? 2.71D : 3.35D);
  }
  
  private int j() {
    double d1 = 0.0D;
    TableModel tableModel = this.a.getModel();
    int i = tableModel.getRowCount();
    int j = tableModel.getColumnCount();
    for (byte b = 0; b < i; b++) {
      for (byte b1 = 0; b1 < j; b1++) {
        double d2 = ((Double)tableModel.getValueAt(b, b1)).doubleValue();
        if (Math.abs(d2) > d1)
          d1 = d2; 
      } 
    } 
    return (int)Math.log10(d1) + 1 + this.a.b();
  }
  
  public Dimension c(int paramInt) {
    byte b1 = (!d() || this.a.h().f()) ? 0 : (this.SComponentGolf.getPreferredSize()).height;
    byte b2 = (d() && this.a.h().f()) ? (this.SComponentGolf.getPreferredSize()).width : 0;
    int i = (eJ.a(3) + paramInt) * (this.a.getRowCount() + 1) + eJ.a(2) + b1;
    double d1 = i();
    byte b3 = (this.b != null) ? (this.b.getPreferredSize()).width : 0;
    int j = (int)(d1 * paramInt) * this.a.getColumnCount() + b3 + b2;
    return new Dimension(j, i);
  }
  
  public Dimension getPreferredSize() {
    byte b1 = (!d() || this.a.h().f()) ? 0 : (this.SComponentGolf.getPreferredSize()).height;
    byte b2 = (d() && this.a.h().f()) ? (this.SComponentGolf.getPreferredSize()).width : 0;
    if (this.q > 0 && !this.p)
      return c(this.q); 
    int i = (3 + this.a.w()) * (this.a.getRowCount() + 1) + 2 + b1;
    int j = (int)(i() * getFont().getSize()) * (this.a.getColumnCount() + 1) + b2 + eJ.a(5);
    byte b3 = b2;
    boolean bool = (b3 > j) ? b3 : j;
    if (this.a.h().f())
      i = Math.max((this.SComponentGolf.getPreferredSize()).height, i); 
    return new Dimension(bool, i);
  }
  
  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
  
  public void a(boolean paramBoolean) {
    this.p = paramBoolean;
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.a != null && paramInt3 > 0 && paramInt4 > 0) {
      if (Math.abs(paramInt4 - this.n) > 3 || this.o != paramInt3) {
        this.n = paramInt4;
        byte b1 = (this.a.h().f() || !this.SComponentGolf.isVisible()) ? 0 : (this.SComponentGolf.getPreferredSize()).height;
        byte b2 = (this.a.h().f() && this.SComponentGolf.isVisible()) ? (this.SComponentGolf.getPreferredSize()).width : 0;
        int i = (this.b != null) ? (this.b.getPreferredSize()).width : 0;
        if (this.b != null) {
          this.b.setRowHeight(this.e);
          this.b.setFont(this.a.getFont());
          this.k.setFont(this.a.getFont());
          String[][] arrayOfString = this.a.h().d();
          int i5 = 0;
          FontMetrics fontMetrics = getFontMetrics(this.b.getFont());
          for (byte b = 0; b < arrayOfString.length; b++) {
            int i6 = fontMetrics.stringWidth(arrayOfString[b][0]);
            if (i6 > i5)
              i5 = i6; 
          } 
          i = i5 + 15;
          this.b.getColumnModel().getColumn(0).setMaxWidth(i);
          this.b.getColumnModel().getColumn(0).setMinWidth(i5);
          this.b.setMinimumSize(new Dimension(i, 10));
          this.b.setPreferredSize(new Dimension(i, 10));
        } 
        TableColumnModel tableColumnModel = this.a.getColumnModel();
        int j = (paramInt4 - b1 - 2) / (this.a.getModel().getRowCount() + 1) - 4;
        j = (j < 1) ? 1 : j;
        int k = paramInt3 - i - b2;
        int m = (int)Math.round((k / this.a.getModel().getColumnCount()) / i());
        m = (m < 1) ? 1 : m;
        int i1 = (m < j) ? m : j;
        int i2 = eJ.a(11);
        if (i1 < i2 && this.a.h().f())
          i1 = i2; 
        this.a.b(i1);
        int i3 = Math.round((k / this.a.getModel().getColumnCount()));
        int i4;
        for (i4 = 0; i4 < tableColumnModel.getColumnCount(); i4++)
          tableColumnModel.getColumn(i4).setMaxWidth(i3); 
        this.e = (paramInt4 - (getInsets()).top - (getInsets()).bottom - b1) / (this.a.getModel().getRowCount() + 1);
        if (this.e > 0) {
          this.a.setRowHeight(this.e);
          i4 = paramInt4 - b1 - this.e * this.a.getModel().getRowCount() - (getInsets()).top - (getInsets()).bottom;
          this.c.setMinimumSize(new Dimension(10, i4));
          this.c.setPreferredSize(new Dimension(10, i4));
        } 
      } 
      super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
      h();
    } else {
      super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    } 
  }
  
  public void setSize(Dimension paramDimension) {
    setSize(paramDimension.width, paramDimension.height);
  }
  
  public void a(double paramDouble) {
    this.a.a(paramDouble);
  }
  
  public void a(ef[] paramArrayOfef) {
    if (!b(paramArrayOfef)) {
      if (paramArrayOfef.length == 0) {
        this.a.getSelectionModel().clearSelection();
        D.c("Clearing selection. Vertical: " + this.a.h().f());
      } 
      int i = Integer.MAX_VALUE;
      int j = Integer.MAX_VALUE;
      int k = Integer.MIN_VALUE;
      int m = Integer.MIN_VALUE;
      for (ef ef1 : paramArrayOfef) {
        int i1;
        int i2;
        int i3 = this.a.h().SComponentGolf() ? (ef1.a() + 1) : ef1.a();
        if (this.a.h().f()) {
          i2 = i3;
          i1 = ef1.b();
        } else {
          i1 = i3;
          i2 = ef1.b();
        } 
        i = Math.min(i1, i);
        k = Math.max(i1, k);
        j = Math.min(i2, j);
        m = Math.max(i2, m);
      } 
      if (paramArrayOfef.length > 0)
        this.a.changeSelection(i, j, false, false); 
      if (paramArrayOfef.length > 1)
        this.a.changeSelection(k, m, false, true); 
    } 
  }
  
  private boolean b(ef[] paramArrayOfef) {
    List<ef> list = k();
    if (list.size() != paramArrayOfef.length)
      return false; 
    for (byte b = 0; b < paramArrayOfef.length; b++) {
      if (paramArrayOfef[b].a() != ((ef)list.get(b)).a() || paramArrayOfef[b].b() != ((ef)list.get(b)).b())
        return false; 
    } 
    return true;
  }
  
  private List k() {
    int[] arrayOfInt1 = this.a.getSelectedRows();
    int[] arrayOfInt2 = this.a.getSelectedColumns();
    ArrayList<r> arrayList = new ArrayList();
    for (byte b = 0; b < arrayOfInt1.length; b++) {
      for (byte b1 = 0; b1 < arrayOfInt2.length; b1++) {
        r r;
        if (this.a.h().f()) {
          r = new r(arrayOfInt2[b1], arrayOfInt1[b]);
        } else {
          r = new r(arrayOfInt1[b], arrayOfInt2[b1]);
        } 
        if ((!this.a.h().SComponentGolf() || r.a() != 0) && (!this.a.h().h() || r.a() != this.a.h().a() - 1))
          if (this.a.h().SComponentGolf()) {
            r.a(r.a() - 1);
            arrayList.add(r);
          } else {
            arrayList.add(r);
          }  
      } 
    } 
    return arrayList;
  }
  
  public void a(eo parameo) {
    if (!this.l.contains(parameo))
      this.l.add(parameo); 
  }
  
  private void a(List paramList) {
    ef[] arrayOfEf = (ef[])paramList.toArray((Object[])new ef[paramList.size()]);
    for (eo eo : this.l)
      eo.a(arrayOfEf); 
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.a.setEnabled(paramBoolean);
    fp.a(this.SComponentGolf, paramBoolean);
  }
  
  public void a(Color paramColor) {
    this.a.a(paramColor);
  }
  
  public boolean d() {
    return this.a.y();
  }
  
  public void b(boolean paramBoolean) {
    this.a.a(paramBoolean);
    ListSelectionModel listSelectionModel = this.a.getSelectionModel();
    if (paramBoolean) {
      listSelectionModel.setSelectionMode(2);
    } else if (a().f()) {
      listSelectionModel.setSelectionMode(0);
    } else {
      listSelectionModel.setSelectionMode(1);
    } 
    for (Component component : this.r) {
      if (component instanceof r)
        ((r)component).setEnabled(isEnabled()); 
    } 
    if (!paramBoolean) {
      this.j.remove(this.SComponentGolf);
      this.SComponentGolf.setVisible(false);
    } else {
      this.SComponentGolf.setVisible(true);
      if (a().f()) {
        this.j.add("East", this.i);
      } else {
        this.j.add("North", this.SComponentGolf);
      } 
    } 
  }
  
  public D e() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */