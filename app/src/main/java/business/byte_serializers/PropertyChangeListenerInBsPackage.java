package business.byte_serializers;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class PropertyChangeListenerInBsPackage implements PropertyChangeListener {
  PropertyChangeListenerInBsPackage(f paramf) {}

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    if (!this.a.m || this.a.p) return;
    int i = this.a.e.getDividerLocation();
    this.a.d.a("horizontalSplitPos", i + "");
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
