package ao;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

class cv implements MenuListener {
  cv(cd paramcd) {}
  
  public void menuSelected(MenuEvent paramMenuEvent) {
    ee ee = (ee)paramMenuEvent.getSource();
    this.a.a.p().a(ee);
  }
  
  public void menuDeselected(MenuEvent paramMenuEvent) {
    ee ee = (ee)paramMenuEvent.getSource();
    ee.removeAll();
  }
  
  public void menuCanceled(MenuEvent paramMenuEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */