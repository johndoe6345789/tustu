package br;

import com.efiAnalytics.ui.eJ;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class k implements PropertyChangeListener {
  k(i parami) {}
  
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    if (!this.a.m || this.a.p)
      return; 
    int j = this.a.e.getDividerLocation();
    this.a.d.a("horizontalSplitPos", eJ.b(j) + "");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */