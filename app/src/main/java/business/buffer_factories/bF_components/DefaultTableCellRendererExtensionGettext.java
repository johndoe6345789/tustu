package business.buffer_factories.bF_components;

import bH.X;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class DefaultTableCellRendererExtensionGettext extends DefaultTableCellRenderer {
  D a = null;

  boolean b = false;

  int c = 3;

  BasicStroke d = new BasicStroke(this.c);

  Color e = Color.DARK_GRAY;

  Image f = null;

  private int i = 0;

  boolean g = false;

  public DefaultTableCellRendererExtensionGettext(D paramD1, D paramD2) {
    this.a = paramD2;
  }

  public String getText() {
    if (this.a == null) return "";
    String str = super.getText();
    double d = Double.valueOf(str).doubleValue();
    if (str != null) {
      y y = (y) this.h.getModel();
      return X.c(d, y.a(this.i, this.i).c());
    }
    return "";
  }

  public Component getTableCellRendererComponent(
      JTable paramJTable,
      Object paramObject,
      boolean paramBoolean1,
      boolean paramBoolean2,
      int paramInt1,
      int paramInt2) {
    return super.getTableCellRendererComponent(
        paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
  }

  public void paint(Graphics paramGraphics) {
    if (this.g) {
      Image image = a();
      a(image.getGraphics());
      paramGraphics.drawImage(image, 0, 0, null);
    } else {
      a(paramGraphics);
    }
  }

  public void a(Graphics paramGraphics) {
    super.paint(paramGraphics);
    if (this.b) {
      paramGraphics.setColor(this.e);
      ((Graphics2D) paramGraphics).setStroke(this.d);
      paramGraphics.drawRect(this.c / 2, this.c / 2, getWidth() - this.c, getHeight() - this.c);
    }
  }

  private Image a() {
    if (this.f == null
        || this.f.getWidth(null) != getWidth()
        || this.f.getHeight(null) != getHeight()) this.f = createImage(getWidth(), getHeight());
    return this.f;
  }

  public void a(int paramInt) {
    this.i = paramInt;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/N.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
