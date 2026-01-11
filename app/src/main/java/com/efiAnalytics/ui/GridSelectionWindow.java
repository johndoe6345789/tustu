package com.efiAnalytics.ui;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;

public class GridSelectionWindow extends JWindow {
  int a = -1;
  
  int b = -1;
  
  Color c = Color.YELLOW;
  
  int d = 4;
  
  int e = 3;
  
  ArrayList f = new ArrayList();
  
  public GridSelectionWindow() {
    setLayout(new GridLayout(this.e, this.d));
    ff ff = new ff(this);
    for (byte b = 0; b < this.e; b++) {
      for (byte b1 = 0; b1 < this.d; b1++) {
        fg fg = new fg(this, b, b1);
        add(fg);
        fg.addMouseListener(ff);
        fg.addMouseMotionListener(ff);
      } 
    } 
    addWindowFocusListener(new fd(this));
    setFocusable(true);
    fe fe = new fe(this);
    SwingUtilities.invokeLater(fe);
  }
  
  public boolean a(int paramInt1, int paramInt2) {
    return (this.a >= paramInt1 && this.b >= paramInt2);
  }
  
  public void a(fb paramfb) {
    this.f.add(paramfb);
  }
  
  private void b(int paramInt1, int paramInt2) {
    for (fb fb : this.f)
      fb.a(paramInt1, paramInt2); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */