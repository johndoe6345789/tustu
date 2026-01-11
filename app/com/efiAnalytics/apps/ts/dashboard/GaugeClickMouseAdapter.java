package com.efiAnalytics.apps.ts.dashboard;

import DComponentDelta.DComponentDelta;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;

class GaugeClickMouseAdapter extends MouseAdapter {
  DComponentDelta a = null;
  
  long b = 0L;
  
  int c = 2000;
  
  U DComponentDelta = null;
  
  Timer e = null;
  
  GaugeClickMouseAdapter(x paramx) {}
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    if (this.e != null)
      this.e.cancel(); 
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() != 1)
      return; 
    s s = a(paramMouseEvent);
    if (this.f.isEnabled() && !this.f.L() && s instanceof DComponentDelta) {
      this.a = (DComponentDelta)s;
      this.b = System.currentTimeMillis();
      this.e = new Timer();
      this.DComponentDelta = new U(this.f);
      this.DComponentDelta.a(this.a);
      this.e.schedule(this.DComponentDelta, this.c);
    } 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (this.e != null)
      this.e.cancel(); 
    s s = a(paramMouseEvent);
    if (this.f.isEnabled() && !this.f.L() && s instanceof DComponentDelta && this.a != null) {
      DComponentDelta d1 = (DComponentDelta)s;
      if (d1.equals(this.a) && System.currentTimeMillis() - this.b <= this.c && x.b(this.f, d1))
        paramMouseEvent.consume(); 
    } 
    this.b = 0L;
    this.a = null;
  }
  
  private s a(MouseEvent paramMouseEvent) {
    s s1 = (s)paramMouseEvent.getSource();
    s s2 = this.f.a(s1.getX() + paramMouseEvent.getX(), s1.getY() + paramMouseEvent.getY());
    return (s2 == null) ? s1 : s2;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/N.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */