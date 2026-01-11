package com.efiAnalytics.ui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingUtilities;

class ComboBoxKeyAdapter extends KeyAdapter {
  long a = 0L;
  
  StringBuilder b = new StringBuilder(20);
  
  String[] c = null;
  
  ComboBoxKeyAdapter(e parame) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    int j;
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
      case 17:
        return;
      case 16:
        return;
      case 8:
        if (this.b.length() > 0)
          this.b.deleteCharAt(this.b.length() - 1); 
      default:
        if (paramKeyEvent.isAltDown() || paramKeyEvent.isControlDown() || paramKeyEvent.isActionKey())
          return; 
        l = System.currentTimeMillis();
        c = Character.toLowerCase(paramKeyEvent.getKeyChar());
        if (l - this.a > 3000L) {
          this.b.setLength(0);
          this.b.append(c);
          this.a = l;
        } else {
          this.b.append(c);
        } 
        this.d.c(this.b.toString());
        break;
    } 
    int k = this.d.getSelectedIndex();
    if (b != 0) {
      paramKeyEvent.consume();
      j = k + b;
      if (j < 0) {
        j = 0;
      } else if (j >= this.d.getItemCount()) {
        j = this.d.getItemCount() - 1;
      } 
      this.d.setSelectedIndex(j);
    } else {
      j = this.d.getKeySelectionManager().selectionForKey(paramKeyEvent.getKeyChar(), this.d.getModel());
    } 
    paramKeyEvent.consume();
    if (j == -1 || j != k)
      SwingUtilities.invokeLater(new j(this)); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */