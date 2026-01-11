package com.efiAnalytics.apps.ts.tuningViews;

import java.awt.Component;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

public class MouseEventShield extends JComponent {
  TuneViewComponent a;
  
  public MouseEventShield(TuneViewComponent paramTuneViewComponent) {
    this.a = paramTuneViewComponent;
  }
  
  protected void processMouseEvent(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getID() == 500 || paramMouseEvent.getID() == 501 || paramMouseEvent.getID() == 502) {
      Component component = a(paramMouseEvent.getX(), paramMouseEvent.getY());
      if (this.a.isEditComponent(component) || !this.a.isShieldedDuringEdit()) {
        paramMouseEvent.setSource(component);
        Point point1 = paramMouseEvent.getLocationOnScreen();
        Point point2 = component.getLocationOnScreen();
        int i = point1.x - point2.x;
        int j = point1.y - point2.y;
        MouseEvent mouseEvent = new MouseEvent(component, paramMouseEvent.getID(), paramMouseEvent.getWhen(), paramMouseEvent.getModifiers(), i, j, paramMouseEvent.getClickCount(), paramMouseEvent.isPopupTrigger(), paramMouseEvent.getButton());
        component.dispatchEvent(mouseEvent);
        paramMouseEvent.consume();
      } else {
        super.processMouseEvent(paramMouseEvent);
      } 
    } else {
      super.processMouseEvent(paramMouseEvent);
    } 
  }
  
  private Component a(int paramInt1, int paramInt2) {
    Component component = null;
    synchronized (getTreeLock()) {
      for (Component component1 : this.a.getComponents()) {
        if (!(component1 instanceof g) && component1.contains(paramInt1 - component1.getX(), paramInt2 + (this.a.getInsets()).top - component1.getY()) && component1 instanceof Container) {
          Container container = (Container)component1;
          component = container.findComponentAt(paramInt1, paramInt2);
        } 
      } 
    } 
    return (component != null) ? component : this;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */