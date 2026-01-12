package com.efiAnalytics.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

public class e extends JComboBox {
  private final o a;

  List d = new ArrayList();

  boolean e = false;

  m f = null;

  Color g = null;

  n h = null;

  public e() {
    setDoubleBuffered(false);
    this.a = new l(this);
    addMouseListener(new f(this));
    addFocusListener(new g(this));
    addPopupMenuListener(new h(this));
    addKeyListener(new i(this));
  }

  public void a(String paramString) {
    if (!this.e) this.d.add(paramString.toString());
    super.addItem(paramString);
  }

  public boolean b(String paramString) {
    for (byte b = 0; b < getItemCount(); b++) {
      String str = (String) getItemAt(b);
      if (str.equals(paramString)) {
        setSelectedIndex(b);
        return true;
      }
    }
    return false;
  }

  public String a(int paramInt) {
    return (String) getItemAt(paramInt);
  }

  public void a(boolean paramBoolean) {}

  public void a(Color paramColor) {
    this.g = paramColor;
    repaint();
  }

  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    dimension.width += 10;
    return dimension;
  }

  public Dimension getMinimumSize() {
    Dimension dimension = super.getMinimumSize();
    dimension.width += 10;
    return dimension;
  }

  public void setPopupVisible(boolean paramBoolean) {
    boolean bool = false;
    if (isPopupVisible() && !paramBoolean) bool = true;
    super.setPopupVisible(paramBoolean);
    if (bool) a();
  }

  public void repaint(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.repaint(paramLong, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void repaint(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.repaint(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  private void a() {
    c("");
  }

  public void c(String paramString) {
    if (isVisible() && isShowing()) SwingUtilities.invokeLater(new k(this, paramString));
  }

  public ListCellRenderer getRenderer() {
    if (this.f == null) this.f = new m(this);
    return this.f;
  }

  private void c() {
    super.removeAllItems();
  }

  public void addItem(Object paramObject) {
    if (!this.e) this.d.add(paramObject.toString());
    super.addItem(paramObject.toString());
  }

  public void insertItemAt(Object paramObject, int paramInt) {
    if (!this.e) this.d.add(paramInt, paramObject.toString());
    super.insertItemAt(paramObject, paramInt);
  }

  public void removeItem(Object paramObject) {
    if (!this.e) this.d.remove(paramObject);
    super.removeItem(paramObject);
  }

  public void removeItemAt(int paramInt) {
    if (!this.e) this.d.remove(paramInt);
    super.removeItemAt(paramInt);
  }

  public void removeAllItems() {
    if (!this.e) this.d.clear();
    super.removeAllItems();
  }

  public String[] b() {
    String[] arrayOfString = new String[getItemCount()];
    for (byte b = 0; b < arrayOfString.length; b++) arrayOfString[b] = a(b);
    return arrayOfString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
