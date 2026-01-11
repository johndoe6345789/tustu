package com.efiAnalytics.ui;

import bH.X;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class ai extends DefaultTableCellRenderer {
  Color a = Color.lightGray;
  
  Color b = new Color(225, 225, 232);
  
  private int d = -1;
  
  public ai(w paramw) {
    setBackground(this.a);
    setForeground(Color.BLACK);
    setHorizontalAlignment(0);
    paramw.a.getSelectionModel().addListSelectionListener(new aj(this, paramw));
  }
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    paramGraphics.setColor(this.a);
    paramGraphics.draw3DRect(0, 0, getWidth() - 1, getHeight() - 1, true);
    if (!this.c.a.isEnabled()) {
      Color color = new Color(64, 64, 64, 80);
      paramGraphics.setColor(color);
      paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    } 
  }
  
  public String getText() {
    String str = super.getText();
    return (str != null) ? X.a(str, a()) : str;
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    Component component = super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    Color color = this.a;
    int[] arrayOfInt = this.c.a.getSelectedRows();
    if (a(arrayOfInt, paramInt1))
      color = this.b; 
    component.setBackground(color);
    if (component instanceof JComponent && w.d(this.c).size() > paramInt1)
      ((JComponent)component).setToolTipText(w.d(this.c).get(paramInt1)); 
    return component;
  }
  
  private boolean a(int[] paramArrayOfint, int paramInt) {
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      if (paramArrayOfint[b] == paramInt)
        return true; 
    } 
    return false;
  }
  
  public int a() {
    return (this.d >= 0) ? this.d : this.c.q();
  }
  
  public void a(int paramInt) {
    this.d = paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ai.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */