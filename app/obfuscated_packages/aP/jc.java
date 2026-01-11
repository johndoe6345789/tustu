package aP;

import G.T;
import G.Y;
import bH.D;
import bH.X;
import com.efiAnalytics.ui.aO;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.dF;
import com.efiAnalytics.ui.eJ;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerListModel;
import javax.swing.table.TableModel;
import n.JPanelExtensionInNPackage;
import r.IOPropertiesUsingFile;
import s.SComponentGolf;

public class jc extends dF implements aO, FocusListener {
  int IOPropertiesUsingFile = 1;
  
  int JPanelExtensionInNPackage = 16;
  
  Y c = null;
  
  jp d = new jp(this);
  
  Vector e = new Vector();
  
  Vector f = new Vector();
  
  jj SComponentGolf = new jj(this, this.d);
  
  jp h = new jp(this);
  
  JTable i = new JTable(this.h);
  
  JScrollPane j;
  
  int k = -1;
  
  Color l = new Color(242, 242, 255);
  
  private boolean p = false;
  
  ji m = new ji(this);
  
  String[] n = new String[] { 
      "0x00", "0x01", "0x02", "0x03", "0x04", "0x05", "0x06", "0x07", "0x08", "0x09", 
      "0x0A", "0x0B", "0x0C", "0x0D", "0x0E", "0x0F" };
  
  public jc(Frame paramFrame, Y paramY) {
    super(paramFrame, "Controller RAM Editor");
    this.c = paramY;
    setDefaultCloseOperation(2);
    IOPropertiesUsingFile(IOPropertiesUsingFile.IOPropertiesUsingFile().c(IOPropertiesUsingFile.aU, this.IOPropertiesUsingFile));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new FlowLayout());
    Integer[] arrayOfInteger = new Integer[paramY.e()];
    for (byte JPanelExtensionInNPackage = 0; JPanelExtensionInNPackage < arrayOfInteger.length; JPanelExtensionInNPackage++)
      arrayOfInteger[arrayOfInteger.length - JPanelExtensionInNPackage - 1] = new Integer(JPanelExtensionInNPackage); 
    SpinnerListModel spinnerListModel = new SpinnerListModel((Object[])arrayOfInteger);
    JSpinner jSpinner = new JSpinner(spinnerListModel);
    jSpinner.setValue(arrayOfInteger[arrayOfInteger.length - 1]);
    jSpinner.addChangeListener(new jd(this));
    jPanel1.add(new JLabel("Page:"));
    jSpinner.setPreferredSize(eJ.IOPropertiesUsingFile(40, 20));
    jPanel1.add(jSpinner);
    JPanel jPanel2 = new JPanel();
    ButtonGroup buttonGroup = new ButtonGroup();
    jPanel2.setLayout(new GridLayout(1, 0));
    JRadioButton jRadioButton = new JRadioButton("Bin", (this.IOPropertiesUsingFile == 3));
    jRadioButton.addActionListener(new je(this));
    jPanel2.add(jRadioButton);
    buttonGroup.add(jRadioButton);
    jRadioButton = new JRadioButton("Dec", (this.IOPropertiesUsingFile == 2));
    jRadioButton.addActionListener(new jf(this));
    jPanel2.add(jRadioButton);
    buttonGroup.add(jRadioButton);
    jRadioButton = new JRadioButton("Hex", (this.IOPropertiesUsingFile == 1));
    jRadioButton.addActionListener(new jg(this));
    jPanel2.add(jRadioButton);
    buttonGroup.add(jRadioButton);
    jPanel1.add(jPanel2);
    JPanelExtensionInNPackage b1 = new JPanelExtensionInNPackage();
    b1.IOPropertiesUsingFile(this);
    jPanel1.add((Component)b1);
    add("South", jPanel1);
    for (String str : this.n)
      this.e.add(str); 
    this.d.setColumnIdentifiers(this.e);
    this.d.addTableModelListener(new js(this));
    this.j = new JScrollPane(this.SComponentGolf);
    this.j.setRowHeaderView(this.i);
    this.j.setCorner("UPPER_LEFT_CORNER", this.i.getTableHeader());
    Vector<String> vector = new Vector();
    vector.add(" ");
    this.h.setColumnIdentifiers(vector);
    this.i.getColumnModel().getColumn(0).setPreferredWidth(eJ.IOPropertiesUsingFile(50));
    this.i.setPreferredScrollableViewportSize(this.i.getPreferredSize());
    add("Center", this.j);
    JPanelExtensionInNPackage(0);
    setSize(720, 480);
    bV.IOPropertiesUsingFile(paramFrame, (Component)this);
    paramY.IOPropertiesUsingFile(this.m);
    this.SComponentGolf.addMouseListener(new jt(this));
  }
  
  public void IOPropertiesUsingFile(int paramInt) {
    if (paramInt < 1 || paramInt > 3)
      return; 
    this.IOPropertiesUsingFile = paramInt;
    if (isVisible())
      JPanelExtensionInNPackage(this.k); 
    IOPropertiesUsingFile.IOPropertiesUsingFile().JPanelExtensionInNPackage(IOPropertiesUsingFile.aU, this.IOPropertiesUsingFile + "");
  }
  
  private int JPanelExtensionInNPackage(String paramString) {
    byte JPanelExtensionInNPackage;
    paramString = X.JPanelExtensionInNPackage(paramString, "0x", "");
    paramString = X.JPanelExtensionInNPackage(paramString, "0b", "");
    if (this.IOPropertiesUsingFile == 1) {
      JPanelExtensionInNPackage = 16;
    } else if (this.IOPropertiesUsingFile == 3) {
      JPanelExtensionInNPackage = 2;
    } else {
      JPanelExtensionInNPackage = 10;
    } 
    return Integer.parseInt(paramString, JPanelExtensionInNPackage);
  }
  
  private String JPanelExtensionInNPackage(int paramInt1, int paramInt2) {
    if (paramInt1 > 255) {
      paramInt1 = 255;
    } else if (paramInt1 < 0) {
      paramInt1 = 0;
    } 
    switch (paramInt2) {
      case 1:
        return "0x" + X.IOPropertiesUsingFile(Integer.toHexString(paramInt1).toUpperCase(), '0', 2);
      case 2:
        return Integer.toString(paramInt1);
      case 3:
        return "0b" + X.IOPropertiesUsingFile(Integer.toBinaryString(paramInt1).toUpperCase(), '0', 8);
    } 
    return "0x" + X.IOPropertiesUsingFile(Integer.toHexString(paramInt1).toUpperCase(), '0', 2);
  }
  
  public void JPanelExtensionInNPackage(int paramInt) {
    if (this.c == null || paramInt < 0 || paramInt >= this.c.e()) {
      bV.d("Invalid Page: " + paramInt, (Component)this);
      return;
    } 
    this.k = paramInt;
    this.f.clear();
    Vector<Vector<String>> vector = new Vector();
    int[] arrayOfInt = this.c.JPanelExtensionInNPackage(paramInt);
    byte JPanelExtensionInNPackage = 0;
    while (JPanelExtensionInNPackage < arrayOfInt.length) {
      Vector<String> vector2 = new Vector();
      this.f.add(vector2);
      Vector<String> vector3 = new Vector();
      vector3.add("  " + X.IOPropertiesUsingFile(Integer.toHexString(JPanelExtensionInNPackage).toUpperCase(), '0', 4));
      vector.add(vector3);
      for (byte b1 = 0; JPanelExtensionInNPackage < arrayOfInt.length && b1 < this.JPanelExtensionInNPackage; b1++)
        vector2.add(JPanelExtensionInNPackage(arrayOfInt[JPanelExtensionInNPackage++], this.IOPropertiesUsingFile)); 
    } 
    Vector<String> vector1 = new Vector();
    vector1.add(" ");
    this.h.setDataVector((Vector)vector, vector1);
    this.d.setDataVector(this.f, this.e);
  }
  
  public void c(int paramInt) {
    for (byte JPanelExtensionInNPackage = 0; JPanelExtensionInNPackage < this.d.getRowCount(); JPanelExtensionInNPackage++) {
      for (byte b1 = 0; b1 < this.d.getColumnCount(); b1++) {
        if (this.SComponentGolf.isCellSelected(JPanelExtensionInNPackage, b1)) {
          TableModel tableModel = this.SComponentGolf.getModel();
          try {
            if (((Vector)this.f.get(JPanelExtensionInNPackage)).get(b1) != null) {
              int i = JPanelExtensionInNPackage(((Vector<String>)this.f.get(JPanelExtensionInNPackage)).get(b1));
              tableModel.setValueAt(JPanelExtensionInNPackage(paramInt + i, this.IOPropertiesUsingFile), JPanelExtensionInNPackage, b1);
            } 
          } catch (NumberFormatException numberFormatException) {
            D.c("Unable to parse: " + (String)((Vector<String>)this.f.get(JPanelExtensionInNPackage)).get(b1));
          } 
        } 
      } 
    } 
    this.SComponentGolf.repaint();
  }
  
  public void IOPropertiesUsingFile(String paramString) {
    if (paramString != null && paramString.equals("Increment - Key: > or ,")) {
      IOPropertiesUsingFile();
    } else if (paramString != null && paramString.equals("Decrement - Key: < or .")) {
      SComponentGolf();
    } else if (paramString != null && paramString.equals("Increase by - Key: +")) {
      j();
    } else if (paramString != null && paramString.equals("Decrease by - Key: -")) {
      c();
    } else if (paramString != null && paramString.equals("Scale by - Key: *")) {
      h();
    } else if (paramString != null && paramString.equals("Set to - Key: =")) {
      JPanelExtensionInNPackage();
    } 
  }
  
  public void IOPropertiesUsingFile() {
    c(1);
  }
  
  public void JPanelExtensionInNPackage() {
    String str = bV.IOPropertiesUsingFile("{" + c("Set Selected Cells to") + ":}", true, c("Set Cell Values"), true, (Component)this);
    this.SComponentGolf.requestFocus();
    if (str != null && !str.equals("")) {
      int i = Integer.parseInt(str);
      d(i);
    } 
  }
  
  public void d(int paramInt) {
    if (paramInt < 0 || paramInt > 255) {
      bV.d("Invalid Value: " + paramInt, (Component)this);
      return;
    } 
    for (byte JPanelExtensionInNPackage = 0; JPanelExtensionInNPackage < this.SComponentGolf.getColumnCount(); JPanelExtensionInNPackage++) {
      for (byte b1 = 0; b1 < this.SComponentGolf.getRowCount(); b1++) {
        if (this.SComponentGolf.isCellSelected(b1, JPanelExtensionInNPackage)) {
          TableModel tableModel = this.SComponentGolf.getModel();
          try {
            tableModel.setValueAt(JPanelExtensionInNPackage(paramInt, this.IOPropertiesUsingFile), b1, JPanelExtensionInNPackage);
          } catch (NumberFormatException numberFormatException) {
            D.c("Unable to parse: " + (String)((Vector<String>)this.f.get(b1)).get(JPanelExtensionInNPackage));
          } 
        } 
      } 
    } 
    repaint();
  }
  
  public void c() {
    String str = bV.IOPropertiesUsingFile("{" + c("Decrease Selected Cells by") + ":}", true, c("Subtract From Cells"), true, (Component)this);
    this.SComponentGolf.requestFocus();
    if (str != null && !str.equals("")) {
      int i = Integer.parseInt(str);
      c(-i);
    } 
  }
  
  public void SComponentGolf() {
    c(-1);
  }
  
  public void h() {
    String str = bV.IOPropertiesUsingFile("{" + c("Multiply Selected Cells by: ex. 1.2 = raise by 20%") + "}", true, c("Scale Cells"), true, (Component)this);
    this.SComponentGolf.requestFocus();
    if (str != null && !str.equals("")) {
      int i = Integer.parseInt(str);
      e(i);
    } 
  }
  
  public void j() {
    String str = bV.IOPropertiesUsingFile("{" + c("Increase Selected Cells by") + ":}", true, c("Add To Cells"), true, (Component)this);
    this.SComponentGolf.requestFocus();
    if (str != null && !str.equals("")) {
      int i = Integer.parseInt(str);
      c(i);
    } 
  }
  
  private String c(String paramString) {
    return SComponentGolf.JPanelExtensionInNPackage(paramString);
  }
  
  public void e(int paramInt) {
    for (byte JPanelExtensionInNPackage = 0; JPanelExtensionInNPackage < this.SComponentGolf.getColumnCount(); JPanelExtensionInNPackage++) {
      for (byte b1 = 0; b1 < this.SComponentGolf.getRowCount(); b1++) {
        if (this.SComponentGolf.isCellSelected(b1, JPanelExtensionInNPackage))
          try {
            TableModel tableModel = this.SComponentGolf.getModel();
            int i = JPanelExtensionInNPackage(((Vector<String>)this.f.get(b1)).get(JPanelExtensionInNPackage));
            tableModel.setValueAt(JPanelExtensionInNPackage(paramInt * i, this.IOPropertiesUsingFile), b1, JPanelExtensionInNPackage);
          } catch (NumberFormatException numberFormatException) {
            D.c("Unable to parse: " + (String)((Vector<String>)this.f.get(b1)).get(JPanelExtensionInNPackage));
          }  
      } 
    } 
  }
  
  public void IOPropertiesUsingFile(int paramInt1, int paramInt2) {
    JPopupMenu jPopupMenu = new JPopupMenu();
    this.SComponentGolf.add(jPopupMenu);
    jh jh = new jh(this);
    jPopupMenu.add("Set to - Key: =").addActionListener(jh);
    jPopupMenu.add("Increment - Key: > or ,").addActionListener(jh);
    jPopupMenu.add("Decrement - Key: < or .").addActionListener(jh);
    jPopupMenu.add("Increase by - Key: +").addActionListener(jh);
    jPopupMenu.add("Decrease by - Key: -").addActionListener(jh);
    jPopupMenu.add("Scale by - Key: *").addActionListener(jh);
    jPopupMenu.show(this.SComponentGolf, paramInt1, paramInt2);
  }
  
  public void e() {}
  
  public void d() {}
  
  public void f() {
    T.IOPropertiesUsingFile().c().I();
  }
  
  public void i() {
    dispose();
  }
  
  public void dispose() {
    this.c.JPanelExtensionInNPackage(this.m);
    super.dispose();
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {
    D.c(paramFocusEvent.toString());
  }
  
  public void focusGained(FocusEvent paramFocusEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/jc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */