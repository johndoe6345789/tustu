package com.efiAnalytics.ui;

import bH.D;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;

public class SleepPreventionManager {
  private static SleepPreventionManager c = null;
  
  dJ a = null;
  
  public List b = new ArrayList();
  
  public static dI a() {
    if (c == null)
      c = new dI(); 
    return c;
  }
  
  public void a(eu parameu) {
    this.b.add(parameu);
  }
  
  public void b() {
    if (!d()) {
      c();
      this.a = new dJ(this);
      this.a.start();
      D.d("Starting Prevent Sleep");
    } 
  }
  
  public void c() {
    if (this.a != null) {
      this.a.a(false);
      this.a = null;
      D.d("Stopping Prevent Sleep");
    } 
  }
  
  public boolean d() {
    return (this.a != null && this.a.a() && this.a.isAlive());
  }
  
  private boolean e() {
    if (!this.b.isEmpty())
      return true; 
    Window[] arrayOfWindow = Window.getWindows();
    try {
      for (Window window : arrayOfWindow) {
        if (window.isVisible() && window.isActive())
          return true; 
      } 
    } catch (Exception exception) {
      D.a(exception);
    } 
    return false;
  }
  
  private boolean f() {
    if (e()) {
      for (eu eu : this.b) {
        if (!eu.a())
          return false; 
      } 
      return true;
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */