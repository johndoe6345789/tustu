package com.efiAnalytics.ui;

import bH.D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class TableSizeSelectorMouseAdapter extends MouseAdapter {
  TableSizeSelectorMouseAdapter(fc paramfc) {}
  
  public void TableSizeSelectorMouseAdapter(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getSource() instanceof fg) {
      fg fg = (fg)paramMouseEvent.getSource();
    }
    this.a.repaint();
  }
  
  public void TableSizeSelectorMouseAdapter(MouseEvent paramMouseEvent) {}
  
  public void TableSizeSelectorMouseAdapter(MouseEvent paramMouseEvent) {
    if (this.a.a >= 0 && paramMouseEvent.getSource() instanceof fg) {
      fg fg = (fg)paramMouseEvent.getSource();
      this.a.a = fg.a;
      this.a.b = fg.b;
    } 
    this.a.repaint();
  }
  
  public void TableSizeSelectorMouseAdapter(MouseEvent paramMouseEvent) {}
  
  public void TableSizeSelectorMouseAdapter(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getSource() instanceof fg) {
      fg fg = (fg)paramMouseEvent.getSource();
      this.a.a = fg.a;
      this.a.b = fg.b;
    } 
    this.a.repaint();
  }
  
  public void TableSizeSelectorMouseAdapter(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getSource() instanceof fg) {
      fg fg = (fg)paramMouseEvent.getSource();
    }
    D.c("Selected: " + (this.a.b + 1) + " x " + (this.a.a + 1));
    fc.a(this.a, this.a.a + 1, this.a.b + 1);
    this.a.dispose();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ff.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */