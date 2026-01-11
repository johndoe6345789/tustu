package com.efiAnalytics.ui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingUtilities;

class dh extends KeyAdapter {
  long a = 0L;
  
  StringBuilder b = new StringBuilder(20);
  
  String[] c = null;
  
  dh(de paramde) {}
  
  private int a() {
    if (this.c == null) {
      this.c = new String[this.d.getModel().getSize()];
      for (byte b1 = 0; b1 < this.c.length; b1++)
        this.c[b1] = this.d.getModel().getElementAt(b1).toString().toLowerCase(); 
    } 
    for (byte b = 0; b < this.c.length; b++) {
      if (this.c[b].startsWith(this.b.toString()))
        return b; 
    } 
    return -1;
  }
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    int i;
    long l;
    char c;
    byte b = 0;
    switch (paramKeyEvent.getKeyCode()) {
      case 38:
        b = -1;
        break;
      case 40:
        b = 1;
        break;
      case 33:
        b = -5;
        break;
      case 34:
        b = 5;
        break;
      case 10:
        return;
      default:
        l = System.currentTimeMillis();
        c = Character.toLowerCase(paramKeyEvent.getKeyChar());
        if (l - this.a > 1500L) {
          this.b.setLength(0);
          this.b.append(c);
          this.a = l;
          break;
        } 
        this.b.append(c);
        i = a();
        if (i != -1)
          this.d.setSelectedIndex(i); 
        break;
    } 
    int j = this.d.getSelectedIndex();
    if (b != 0) {
      paramKeyEvent.consume();
      i = j + b;
      if (i < 0) {
        i = 0;
      } else if (i >= this.d.getItemCount()) {
        i = this.d.getItemCount() - 1;
      } 
      this.d.setSelectedIndex(i);
    } else {
      i = this.d.getKeySelectionManager().selectionForKey(paramKeyEvent.getKeyChar(), this.d.getModel());
    } 
    if (i == -1 || i != j)
      SwingUtilities.invokeLater(new di(this)); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */