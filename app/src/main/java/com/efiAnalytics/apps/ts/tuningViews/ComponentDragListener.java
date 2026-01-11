package com.efiAnalytics.apps.ts.tuningViews;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

class ComponentDragListener extends MouseAdapter implements MouseMotionListener {
  List a = new ArrayList();
  
  List b = new ArrayList();
  
  boolean c = false;
  
  TuneViewComponent d = null;
  
  ComponentDragListener(J paramJ) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    try {
      if (!this.e.isEnabled())
        return; 
      this.d = a(paramMouseEvent);
      if (this.d == null)
        return; 
      Point point = (this.d.getParent() != null) ? this.d.getParent().getMousePosition() : this.d.getMousePosition();
      if (point == null)
        return; 
      if (paramMouseEvent.getButton() == 1 || paramMouseEvent.getButton() == 3) {
        boolean bool = ((paramMouseEvent.getModifiers() & 0x2) != 2) ? true : false;
        if (!this.e.c(this.d) || !bool)
          this.e.a(this.d, bool); 
      } 
      if (paramMouseEvent.getButton() == 3 && !(this.d instanceof com.efiAnalytics.apps.ts.tuningViews.tuneComps.TuneViewGaugeCluster)) {
        this.e.a(this.d, point.x - this.d.getX(), point.y - this.d.getY());
        if (this.d != null)
          this.d.requestFocus(); 
        return;
      } 
      if (paramMouseEvent.getClickCount() == 2 && paramMouseEvent.getButton() == 1) {
        this.e.t();
        paramMouseEvent.consume();
      } 
      this.a.clear();
      this.b.clear();
      for (TuneViewComponent tuneViewComponent : J.b(this.e)) {
        this.a.add(Integer.valueOf(point.x - tuneViewComponent.getX()));
        this.b.add(Integer.valueOf(point.y - tuneViewComponent.getY()));
      } 
      this.e.requestFocus();
      this.e.repaint();
      this.c = (this.a.size() == 1 && ((Integer)this.a.get(0)).intValue() > this.d.getWidth() - J.c(this.e) && ((Integer)this.b.get(0)).intValue() > this.d.getHeight() - J.c(this.e));
    } finally {
      if (paramMouseEvent.getSource() instanceof TuneViewComponent)
        this.e.dispatchEvent(paramMouseEvent); 
    } 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (!this.e.B() && paramMouseEvent.getSource() instanceof TuneViewComponent)
      this.e.dispatchEvent(paramMouseEvent); 
    if (!this.e.isEnabled())
      return; 
    TuneViewComponent tuneViewComponent = (this.d != null) ? this.d : a(paramMouseEvent);
    if (tuneViewComponent == null)
      return; 
    if (this.c) {
      double d1 = tuneViewComponent.getWidth() / this.e.getWidth();
      double d2 = tuneViewComponent.getHeight() / this.e.getHeight();
      tuneViewComponent.setRelativeWidth(d1);
      tuneViewComponent.setRelativeHeight(d2);
      tuneViewComponent.doLayout();
      tuneViewComponent.validate();
    } else {
      double d1 = tuneViewComponent.getX() / this.e.getWidth();
      double d2 = tuneViewComponent.getY() / this.e.getHeight();
      tuneViewComponent.setRelativeX(d1);
      tuneViewComponent.setRelativeY(d2);
    } 
    this.c = false;
    this.d = null;
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    if (!this.e.isEnabled())
      return; 
    TuneViewComponent tuneViewComponent = a(paramMouseEvent);
    if (tuneViewComponent != null && tuneViewComponent.hasFocus() && this.e.getCursor().getType() != 0)
      this.e.setCursor(Cursor.getDefaultCursor()); 
  }
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    if (!this.e.B() && paramMouseEvent.getSource() instanceof TuneViewComponent)
      this.e.dispatchEvent(paramMouseEvent); 
    if (!this.e.isEnabled() || !this.e.B())
      return; 
    if (this.c) {
      int i = 0;
      int j = 0;
      TuneViewComponent tuneViewComponent = a(paramMouseEvent);
      if (paramMouseEvent.getSource() instanceof J) {
        i = paramMouseEvent.getX() - this.d.getX();
        j = paramMouseEvent.getY() - this.d.getY();
      } else if (tuneViewComponent != null && tuneViewComponent.equals(this.e.f())) {
        i = paramMouseEvent.getX();
        j = paramMouseEvent.getY();
      } else {
        Component component1 = (Component)paramMouseEvent.getSource();
        Component component2 = this.e.f();
        i = paramMouseEvent.getX() + (component1.getLocation()).x - (component2.getLocation()).x;
        j = paramMouseEvent.getY() + (component1.getLocation()).y - (component2.getLocation()).y;
      } 
      this.d.setSize(i, j);
      this.d.doLayout();
    } else if (this.d != null) {
      Point point = this.d.getParent().getMousePosition();
      if (point != null && this.d != null)
        for (byte b = 0; b < J.b(this.e).size(); b++) {
          TuneViewComponent tuneViewComponent = J.b(this.e).get(b);
          int i = point.x - ((Integer)this.a.get(b)).intValue();
          int j = point.y - ((Integer)this.b.get(b)).intValue();
          tuneViewComponent.setLocation(i, j);
        }  
    } 
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {
    if (!this.e.isEnabled())
      return; 
    TuneViewComponent tuneViewComponent = (this.d != null) ? this.d : a(paramMouseEvent);
    if (J.b(this.e).size() == 1 && J.b(this.e).contains(tuneViewComponent) && paramMouseEvent.getX() > tuneViewComponent.getWidth() - J.c(this.e) && paramMouseEvent.getY() > tuneViewComponent.getHeight() - J.c(this.e)) {
      this.e.setCursor(Cursor.getPredefinedCursor(5));
    } else if (this.e.getCursor().getType() != 0) {
      this.e.setCursor(Cursor.getDefaultCursor());
    } 
  }
  
  private TuneViewComponent a(MouseEvent paramMouseEvent) {
    Component component;
    for (component = (Component)paramMouseEvent.getSource(); !(component instanceof TuneViewComponent) && component.getParent() != null; component = component.getParent());
    return (component instanceof TuneViewComponent) ? (TuneViewComponent)component : this.e.a(component.getX() + paramMouseEvent.getX(), component.getY() + paramMouseEvent.getY());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/T.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */