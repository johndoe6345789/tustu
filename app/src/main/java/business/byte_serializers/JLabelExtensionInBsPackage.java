package business.byte_serializers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import s.SComponentGolf;

class JLabelExtensionInBsPackage extends JLabel {
  boolean a = false;
  
  x b = null;
  
  public JLabelExtensionInBsPackage(k paramk, String paramString, int paramInt) {
    super(paramString, paramInt);
    setPreferredSize(new Dimension(110, 26));
    setMinimumSize(new Dimension(110, 26));
    setMaximumSize(new Dimension(110, 26));
    setBorder(BorderFactory.createEtchedBorder(0));
  }
  
  public String a() {
    return !this.c.c.C().q() ? SComponentGolf.b("Offline") : (!this.c.b.a() ? SComponentGolf.b("Idle") : SComponentGolf.b("Correcting WUE"));
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
      this.b = new x(this);
      this.b.start();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */