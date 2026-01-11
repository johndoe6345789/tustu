package br;

import com.efiAnalytics.ui.eJ;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import s.SComponentGolf;

class JLabelExtensionPaint extends JLabel {
  boolean a = false;
  
  E b = null;
  
  public JLabelExtensionPaint(s params, String paramString, int paramInt) {
    super(paramString, paramInt);
    setPreferredSize(new Dimension(eJ.a(110), eJ.a(26)));
    setMinimumSize(new Dimension(eJ.a(110), eJ.a(26)));
    setMaximumSize(new Dimension(eJ.a(110), eJ.a(26)));
    setBorder(BorderFactory.createEtchedBorder(0));
  }
  
  public String a() {
    return !this.c.a.C().q() ? SComponentGolf.b("Offline") : (!this.c.h.b() ? SComponentGolf.b("Idle") : (!this.c.h.f() ? SComponentGolf.b("Table Inactive") : SComponentGolf.b("Correcting Table")));
  }
  
  public void paint(Graphics paramGraphics) {
    if (this.a) {
      byte b = 14;
      int i = getWidth() - b - 5;
      int j = (getHeight() - b) / 2;
      paramGraphics.setColor(Color.red);
      paramGraphics.fill3DRect(0, 0, getWidth(), getHeight(), true);
    } 
    super.paint(paramGraphics);
  }
  
  public void a(boolean paramBoolean) {
    if (this.b != null)
      this.b.a(); 
    if (paramBoolean) {
      this.b = new E(this);
      this.b.start();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */