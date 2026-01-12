package com.efiAnalytics.ui;

import bH.X;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JTable;

class al extends ai {
  private int e = 2;

  public al(w paramw) {
    super(paramw);
  }

  public String getText() {
    String str = super.getText();
    return (str != null) ? X.a(str, a()) : str;
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
    int[] arrayOfInt = this.d.a.getSelectedRows();
    if (a(arrayOfInt, paramInt1)) color = this.b;
    component.setBackground(color);
    if (component instanceof JComponent && w.d(this.d).size() > paramInt1)
      ((JComponent) component).setToolTipText(w.d(this.d).get(paramInt1));
    return component;
  }

  private boolean a(int[] paramArrayOfint, int paramInt) {
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      if (paramArrayOfint[b] == paramInt) return true;
    }
    return false;
  }

  public int a() {
    return this.e;
  }

  public void a(int paramInt) {
    this.e = paramInt;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/al.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
