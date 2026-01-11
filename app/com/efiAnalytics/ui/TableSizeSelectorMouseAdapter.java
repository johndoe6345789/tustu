package com.efiAnalytics.ui;

import bH.D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class TableSizeSelectorMouseAdapter extends MouseAdapter {
  ff(fc paramfc) {}
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getSource() instanceof fg)
      fg fg = (fg)paramMouseEvent.getSource(); 
    this.a.repaint();
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    if (this.a.a >= 0 && paramMouseEvent.getSource() instanceof fg) {
      fg fg = (fg)paramMouseEvent.getSource();
      this.a.a = fg.a;
      this.a.b = fg.b;
    } 
    this.a.repaint();
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getSource() instanceof fg) {
      fg fg = (fg)paramMouseEvent.getSource();
      this.a.a = fg.a;
      this.a.b = fg.b;
    } 
    this.a.repaint();
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getSource() instanceof fg)
      fg fg = (fg)paramMouseEvent.getSource(); 
    D.c("Selected: " + (this.a.b + 1) + " x " + (this.a.a + 1));
    fc.a(this.a, this.a.a + 1, this.a.b + 1);
    this.a.dispose();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ff.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */