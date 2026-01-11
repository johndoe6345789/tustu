package br;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class l implements PropertyChangeListener {
  l(i parami) {}
  
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    if (!this.a.m || this.a.o)
      return; 
    i.a(this.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */