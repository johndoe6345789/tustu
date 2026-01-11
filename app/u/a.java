package u;

import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.ToolTipManager;

class a extends JButton {
  public a(g paramg, c paramc) {
    super(paramg.a());
    if (paramg.b() != null)
      setToolTipText(paramg.b()); 
    addActionListener(new b(this, paramg, paramc));
  }
  
  public void a() {
    ToolTipManager toolTipManager = ToolTipManager.sharedInstance();
    MouseEvent mouseEvent = new MouseEvent(this, 504, System.currentTimeMillis(), 0, 0, 0, 0, false);
    toolTipManager.mouseMoved(mouseEvent);
  }
  
  public void b() {
    ToolTipManager toolTipManager = ToolTipManager.sharedInstance();
    MouseEvent mouseEvent = new MouseEvent(this, 505, System.currentTimeMillis(), 0, 0, 0, 0, false);
    toolTipManager.mouseMoved(mouseEvent);
    toolTipManager.mouseExited(mouseEvent);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/u/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */