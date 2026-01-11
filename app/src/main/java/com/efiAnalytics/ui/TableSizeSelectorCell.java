package com.efiAnalytics.ui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

class TableSizeSelectorCell extends JPanel {
  int a;
  
  int b;
  
  TableSizeSelectorCell(fc paramfc, int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public void TableSizeSelectorCell(Graphics paramGraphics) {
    paramGraphics.setColor(Color.BLACK);
    paramGraphics.fillRect(0, 0, TableSizeSelectorCell(), TableSizeSelectorCell());
    if (this.c.a(this.a, this.b)) {
      paramGraphics.setColor(this.c.c);
      int i = eJ.a(4);
      ((Graphics2D)paramGraphics).setStroke(new BasicStroke(i));
      paramGraphics.drawRect(i / 2, i / 2, TableSizeSelectorCell() - i, TableSizeSelectorCell() - i);
    } else {
      paramGraphics.setColor(Color.WHITE);
      ((Graphics2D)paramGraphics).setStroke(new BasicStroke(1.0F));
      paramGraphics.drawRect(0, 0, TableSizeSelectorCell(), TableSizeSelectorCell());
    } 
  }
  
  public Dimension TableSizeSelectorCell() {
    return new Dimension(eJ.a(24), eJ.a(24));
  }
  
  public Dimension TableSizeSelectorCell() {
    return new Dimension(eJ.a(24), eJ.a(24));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */