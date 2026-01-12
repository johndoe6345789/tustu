package com.efiAnalytics.ui;

import bH.X;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class RowHeaderCellRenderer extends DefaultTableCellRenderer {
  Color a = Color.lightGray;

  Color b = new Color(225, 225, 232);

  private int d = -1;

  public RowHeaderCellRenderer(w paramw) {
    RowHeaderCellRenderer(this.a);
    RowHeaderCellRenderer(Color.BLACK);
    RowHeaderCellRenderer(0);
    paramw.a.getSelectionModel().addListSelectionListener(new RowHeaderCellRenderer(this, paramw));
  }

  public void RowHeaderCellRenderer(Graphics paramGraphics) {
    super.paint(paramGraphics);
    paramGraphics.setColor(this.a);
    paramGraphics.draw3DRect(0, 0, RowHeaderCellRenderer() - 1, RowHeaderCellRenderer() - 1, true);
    if (!this.c.a.isEnabled()) {
      Color color = new Color(64, 64, 64, 80);
      paramGraphics.setColor(color);
      paramGraphics.fillRect(0, 0, RowHeaderCellRenderer(), RowHeaderCellRenderer());
    }
  }

  public String RowHeaderCellRenderer() {
    String str = super.getText();
    return (str != null) ? X.a(str, RowHeaderCellRenderer()) : str;
  }

  public Component RowHeaderCellRenderer(
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
    int[] arrayOfInt = this.c.a.getSelectedRows();
    if (a(arrayOfInt, paramInt1)) color = this.b;
    component.setBackground(color);
    if (component instanceof JComponent && w.d(this.c).size() > paramInt1)
      ((JComponent) component).setToolTipText(w.d(this.c).get(paramInt1));
    return component;
  }

  private boolean RowHeaderCellRenderer(int[] paramArrayOfint, int paramInt) {
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      if (paramArrayOfint[b] == paramInt) return true;
    }
    return false;
  }

  public int RowHeaderCellRenderer() {
    return (this.d >= 0) ? this.d : this.c.q();
  }

  public void RowHeaderCellRenderer(int paramInt) {
    this.d = paramInt;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ai.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
