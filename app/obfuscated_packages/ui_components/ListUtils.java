package ao;

import c.e;
import com.efiAnalytics.ui.bs;
import java.awt.Component;
import javax.swing.JMenu;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

class ef implements MenuListener {
  ef(ee paramee, cd paramcd) {}
  
  public void menuCanceled(MenuEvent paramMenuEvent) {}
  
  public void menuDeselected(MenuEvent paramMenuEvent) {}
  
  public void menuSelected(MenuEvent paramMenuEvent) {
    JMenu jMenu = (JMenu)paramMenuEvent.getSource();
    for (Component component : jMenu.getMenuComponents()) {
      if (component instanceof bs) {
        e e = ((bs)component).e();
        component.setEnabled((e == null || e.a()));
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ef.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */