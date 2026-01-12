package business.buffer_factories.bF_components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

class DefaultTableCellRendererExtensionUsingColor extends DefaultTableCellRenderer {
  Color b = Color.lightGray;

  private Color a = UIManager.getColor("Label.background").brighter().brighter();

  JTable c;

  private boolean d = true;

  public DefaultTableCellRendererExtensionUsingColor(JTable paramJTable) {
    this.c = paramJTable;
    setHorizontalAlignment(0);
    paramJTable.getColumnModel().getSelectionModel().addListSelectionListener(new w(this));
    setBackground(Color.lightGray);
  }

  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    if (this.d) {
      paramGraphics.setColor(this.b);
      paramGraphics.draw3DRect(0, 0, getWidth() - 1, getHeight() - 1, true);
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
    Color color = getBackground();
    int[] arrayOfInt = this.c.getSelectedColumns();
    if (a(arrayOfInt, paramInt2)) color = a();
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
    if (str != null)
      ;
    return str;
  }

  public void a(boolean paramBoolean) {
    this.d = paramBoolean;
  }

  public Color a() {
    return this.a;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
