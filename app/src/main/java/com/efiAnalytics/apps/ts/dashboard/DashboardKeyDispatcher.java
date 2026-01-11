package com.efiAnalytics.apps.ts.dashboard;

import java.awt.Component;
import java.awt.Container;
import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

public class DashboardKeyDispatcher implements KeyEventDispatcher {
  x a = null;
  
  DashboardKeyDispatcher(x paramx1, x paramx2) {
    this.a = paramx2;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    if (!this.b.L() || !a(paramKeyEvent.getSource()))
      return false; 
    if (paramKeyEvent.getID() == 401) {
      switch (paramKeyEvent.getKeyCode()) {
        case 127:
          this.b.a();
          return true;
        case 39:
          if (paramKeyEvent.getModifiers() == 64 || paramKeyEvent.getModifiers() == 1) {
            this.b.T();
          } else {
            this.b.P();
          } 
          return true;
        case 37:
          if (paramKeyEvent.getModifiers() == 1) {
            this.b.U();
          } else {
            this.b.Q();
          } 
          return true;
        case 38:
          if (paramKeyEvent.getModifiers() == 1) {
            this.b.W();
          } else {
            this.b.R();
          } 
          return true;
        case 40:
          if (paramKeyEvent.getModifiers() == 1) {
            this.b.V();
          } else {
            this.b.S();
          } 
          return true;
        case 9:
          if (paramKeyEvent.getModifiers() == 64 || paramKeyEvent.getModifiers() == 1) {
            this.b.Z();
          } else {
            this.b.Y();
          } 
          return true;
      } 
      if (this.b.L()) {
        if (paramKeyEvent.getModifiers() == 2 && paramKeyEvent.getKeyCode() == 67)
          x.i(this.b); 
        if (paramKeyEvent.getModifiers() == 2 && paramKeyEvent.getKeyCode() == 86)
          x.j(this.b); 
        if (paramKeyEvent.getModifiers() == 2 && paramKeyEvent.getKeyCode() == 65) {
          this.b.w();
          return true;
        } 
      } 
    } 
    return false;
  }
  
  private boolean a(Object paramObject) {
    Container container = this.b.getParent();
    if (this.a.equals(paramObject))
      return true; 
    while (container != null) {
      if (container.equals(paramObject) || (x.f(this.b) != null && container.equals(x.f(this.b)) && x.g(this.b).contains(paramObject)))
        return true; 
      container = container.getParent();
      if (container instanceof java.awt.Window)
        return false; 
    } 
    Component[] arrayOfComponent = this.b.getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (paramObject.equals(arrayOfComponent[b]))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/T.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */