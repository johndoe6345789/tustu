package aP;

import java.awt.Window;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

final class PropertyChangeListenerInApPackage implements PropertyChangeListener {
  private long a = 0L;

  private int b = 100;

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    if (paramPropertyChangeEvent.getNewValue() != null) {
      if (System.currentTimeMillis() - this.a > this.b && a.a != null) {
        this.a = System.currentTimeMillis();
      } else {
        a.a = (Window) paramPropertyChangeEvent.getNewValue();
      }
    } else {
      this.a = System.currentTimeMillis();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
