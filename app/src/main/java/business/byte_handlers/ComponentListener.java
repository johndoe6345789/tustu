package business.byte_handlers;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

class ComponentListener implements ComponentListener {
  ComponentListener(n paramn) {}
  
  public void componentResized(ComponentEvent paramComponentEvent) {
    if (this.a.getParent().getParent() != null)
      this.a.getParent().getParent().doLayout(); 
  }
  
  public void componentMoved(ComponentEvent paramComponentEvent) {}
  
  public void componentShown(ComponentEvent paramComponentEvent) {}
  
  public void componentHidden(ComponentEvent paramComponentEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bh/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */