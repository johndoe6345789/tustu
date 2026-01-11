package bs;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class h implements PropertyChangeListener {
  h(f paramf) {}
  
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    if (!this.a.m || this.a.p)
      return; 
    int i = this.a.e.getDividerLocation();
    this.a.d.a("horizontalSplitPos", i + "");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */