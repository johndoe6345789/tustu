package aO;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class PropertyChangeListener implements PropertyChangeListener {
  PropertyChangeListener(k paramk) {}

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    if (k.a(this.a) == null) return;
    int i = this.a.g.getDividerLocation();
    k.a(this.a).a(k.w, i + "");
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aO/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
