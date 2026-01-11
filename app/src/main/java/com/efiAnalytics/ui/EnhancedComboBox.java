package com.efiAnalytics.ui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.ListCellRenderer;

public class EnhancedComboBox extends JComboBox {
  dj a = null;
  
  Color b = null;
  
  public de() {
    setDoubleBuffered(false);
    addMouseListener(new df(this));
    addFocusListener(new dg(this));
    addKeyListener(new dh(this));
  }
  
  public void a(String paramString) {
    addItem((E)paramString);
  }
  
  public boolean b(String paramString) {
    for (byte b = 0; b < getItemCount(); b++) {
      String str = (String)getItemAt(b);
      if (str.equals(paramString)) {
        setSelectedIndex(b);
        return true;
      } 
    } 
    return false;
  }
  
  public String a(int paramInt) {
    return (getItemAt(paramInt) == null) ? null : getItemAt(paramInt).toString();
  }
  
  public void a(boolean paramBoolean) {}
  
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
  
  public void repaint(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.repaint(paramLong, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void repaint(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.repaint(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public ListCellRenderer getRenderer() {
    if (this.a == null)
      this.a = new dj(this); 
    return this.a;
  }
  
  public boolean c(String paramString) {
    for (byte b = 0; b < getItemCount(); b++) {
      if (a(b).equals(paramString))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/de.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */