package bf;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.tree.TreePath;

class MouseclickedMousepressed extends MouseAdapter {
  c(a parama) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getClickCount() == 2 && this.a.f != null)
      a.a(this.a, this.a.f); 
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger()) {
      int i = this.a.j.getRowForLocation(paramMouseEvent.getX(), paramMouseEvent.getY());
      TreePath treePath = this.a.j.getPathForLocation(paramMouseEvent.getX(), paramMouseEvent.getY());
      this.a.j.setSelectionPath(treePath);
      if (i > -1)
        this.a.j.setSelectionRow(i); 
      a.a(this.a, paramMouseEvent);
    } 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger()) {
      int i = this.a.j.getRowForLocation(paramMouseEvent.getX(), paramMouseEvent.getY());
      TreePath treePath = this.a.j.getPathForLocation(paramMouseEvent.getX(), paramMouseEvent.getY());
      this.a.j.setSelectionPath(treePath);
      if (i > -1)
        this.a.j.setSelectionRow(i); 
      a.a(this.a, paramMouseEvent);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bf/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */