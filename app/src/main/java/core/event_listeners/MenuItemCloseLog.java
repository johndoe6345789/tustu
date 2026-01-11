package ao;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

class au extends JMenuItem {
  private Color b;
  
  private int c;
  
  public void au(ar paramar, Color paramColor, int paramInt) {
    super("      ");
    this.b = paramColor;
    this.c = paramInt;
    setBackground(paramColor);
    setForeground(paramColor);
    setRolloverEnabled(false);
  }
  
  public void addActionListener(ActionListener paramActionListener) {
    super.addActionListener(paramActionListener);
  }
  
  public Color a() {
    return this.b;
  }
  
  public int b() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/au.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */