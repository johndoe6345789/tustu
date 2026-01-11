package com.efiAnalytics.ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;

class AxisTableContextMenuListener extends MouseAdapter {
  AxisTableContextMenuListener(AxisEditorTable paramS, w paramw, boolean paramBoolean) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3) {
      int[] arrayOfInt1 = this.b ? this.c.getSelectedRows() : this.c.getSelectedColumns();
      if (arrayOfInt1.length == 0)
        arrayOfInt1 = new int[] { this.b ? this.c.rowAtPoint(paramMouseEvent.getPoint()) : this.c.columnAtPoint(paramMouseEvent.getPoint()) }; 
      int[] arrayOfInt2 = arrayOfInt1;
      JPopupMenu jPopupMenu = new JPopupMenu();
      jPopupMenu.add("Revert to starting value").addActionListener(new U(this, arrayOfInt2));
      if (arrayOfInt2.length > 2)
        jPopupMenu.add("Interpolate selected cell values").addActionListener(new V(this, arrayOfInt2)); 
      this.c.add(jPopupMenu);
      jPopupMenu.show(this.c, paramMouseEvent.getX(), paramMouseEvent.getY());
      this.c.d = true;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/T.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */