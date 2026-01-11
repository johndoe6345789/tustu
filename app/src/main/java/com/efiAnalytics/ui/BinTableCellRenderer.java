package com.efiAnalytics.ui;

import bH.X;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

class BinTableCellRenderer extends DefaultTableCellRenderer {
  BinTableView a = null;
  
  boolean b = false;
  
  int c = 3;
  
  BasicStroke d = new BasicStroke(this.c);
  
  Color e = Color.DARK_GRAY;
  
  Image f = null;
  
  boolean g = false;
  
  Border h = BorderFactory.createEmptyBorder(0, 0, 0, 0);
  
  public aD(BinTableView paramBinTableView1, BinTableView paramBinTableView2) {
    this.a = paramBinTableView2;
    UIDefaults uIDefaults = new UIDefaults();
    uIDefaults.put("TextArea.borderPainter", new aE(this, paramBinTableView1));
    UIManager.put("Table.cellNoFocusBorder", new Insets(0, 0, 0, 0));
    UIManager.put("Table.focusCellHighlightBorder", new Insets(0, 0, 0, 0));
    putClientProperty("Nimbus.Overrides", uIDefaults);
    putClientProperty("Nimbus.Overrides.InheritDefaults", Boolean.valueOf(false));
    addFocusListener(new aF(this, paramBinTableView1));
  }
  
  public String getText() {
    if (this.a == null || BinTableView.d(this.i))
      return ""; 
    String str = super.getText();
    if (str != null && !str.isEmpty()) {
      double d = Double.valueOf(str).doubleValue();
      return X.c(d, this.i.a);
    } 
    return "";
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    this.b = this.i.c(paramInt1, paramInt2);
    return super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
  }
  
  public void paint(Graphics paramGraphics) {
    if (this.g) {
      Image image = a();
      try {
        a(image.getGraphics());
      } catch (Exception exception) {}
      paramGraphics.drawImage(image, 0, 0, null);
    } else {
      a(paramGraphics);
    } 
  }
  
  public void a(Graphics paramGraphics) {
    super.paint(paramGraphics);
    if (this.b) {
      paramGraphics.setColor(this.e);
      ((Graphics2D)paramGraphics).setStroke(this.d);
      paramGraphics.drawRect(this.c / 2, this.c / 2, getWidth() - this.c, getHeight() - this.c);
    } 
  }
  
  private Image a() {
    if (this.f == null || this.f.getWidth(null) != getWidth() || this.f.getHeight(null) != getHeight())
      this.f = createImage(getWidth(), getHeight()); 
    return this.f;
  }
  
  public Border getBorder() {
    return this.h;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */