package aP;

import bH.D;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JLabel;

class iZ extends JLabel {
  String a = "";
  
  final ArrayList b = new ArrayList();
  
  int c = 32;
  
  iZ(iW paramiW) {}
  
  public void setText(String paramString) {
    super.setText(paramString);
    this.a = paramString;
    if (this.b != null)
      synchronized (this.b) {
        if (!paramString.trim().equals(""))
          this.b.add(paramString); 
        if (this.b.size() > this.c + 1)
          this.b.remove(0); 
        String str = "<html>";
        try {
          Iterator<String> iterator = this.b.iterator();
          while (iterator.hasNext()) {
            if (!str.equals("<html>"))
              str = str + "<br>"; 
            str = str + iterator.next();
          } 
        } catch (Exception exception) {
          D.c("Caught an exception trying to update status history, handled.\n\t" + exception.getMessage());
        } 
        str = str + "</html>";
        setToolTipText(str);
      }  
    repaint();
  }
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
  }
  
  public Dimension getMinimumSize() {
    Dimension dimension = super.getMinimumSize();
    JFrame jFrame = dd.a().c();
    dimension.width = jFrame.getWidth() / 4;
    return dimension;
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    JFrame jFrame = dd.a().c();
    dimension.width = jFrame.getWidth() / 4;
    return dimension;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */