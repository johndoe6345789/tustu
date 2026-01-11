package com.efiAnalytics.ui;

import java.awt.Font;
import javax.swing.JPanel;

class ah extends JPanel {
  S a;
  
  ah(w paramw) {}
  
  public S a() {
    return this.a;
  }
  
  public void a(S paramS) {
    this.a = paramS;
    add(paramS);
  }
  
  public void a(int paramInt) {
    if (this.a == null)
      return; 
    Font font = this.b.a.getFont();
    this.a.setFont(new Font(font.getFamily(), font.getStyle(), paramInt));
  }
  
  public String[] b() {
    return this.a.a();
  }
  
  public void b(int paramInt) {
    for (byte b = 0; b < getComponentCount(); b++) {
      if (getComponent(b) instanceof do) {
        do do = (do)getComponent(b);
        do.b(paramInt);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */