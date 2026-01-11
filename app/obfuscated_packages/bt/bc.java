package bt;

import com.efiAnalytics.ui.aN;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class bc extends MouseAdapter {
  bc(bb parambb) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (this.a.a != null && !this.a.a.isEmpty())
      aN.a(this.a.a); 
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    if (this.a.a != null && !this.a.a.isEmpty())
      this.a.setCursor(Cursor.getPredefinedCursor(12)); 
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    if (this.a.a != null && !this.a.a.isEmpty())
      this.a.setCursor(Cursor.getDefaultCursor()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */