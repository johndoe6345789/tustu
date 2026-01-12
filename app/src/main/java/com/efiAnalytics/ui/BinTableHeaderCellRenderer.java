package com.efiAnalytics.ui;

import bH.X;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class BinTableHeaderCellRenderer extends DefaultTableCellRenderer {
  Color a = Color.lightGray;

  Color b = Color.lightGray;

  Color c = new Color(225, 225, 232);

  JTable d;

  public BinTableHeaderCellRenderer(BinTableView paramBinTableView, JTable paramJTable) {
    this.d = paramJTable;
    setHorizontalAlignment(0);
    setForeground(Color.BLACK);
    paramJTable
        .getColumnModel()
        .getSelectionModel()
        .addListSelectionListener(new aH(this, paramBinTableView));
  }

  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    paramGraphics.setColor(this.a);
    paramGraphics.draw3DRect(0, 0, getWidth() - 1, getHeight() - 1, true);
    if (!this.d.isEnabled()) {
      Color color = new Color(64, 64, 64, 80);
      paramGraphics.setColor(color);
      paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    }
  }

  public Component getTableCellRendererComponent(
      JTable paramJTable,
      Object paramObject,
      boolean paramBoolean1,
      boolean paramBoolean2,
      int paramInt1,
      int paramInt2) {
    Component component =
        super.getTableCellRendererComponent(
            paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    Color color = this.a;
    int[] arrayOfInt = this.e.getSelectedColumns();
    if (a(arrayOfInt, paramInt2)) color = this.c;
    component.setBackground(color);
    return component;
  }

  private boolean a(int[] paramArrayOfint, int paramInt) {
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      if (paramArrayOfint[b] == paramInt) return true;
    }
    return false;
  }

  public String getText() {
    String str = super.getText();
    return (str != null) ? X.b(str, this.e.c()) : str;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
