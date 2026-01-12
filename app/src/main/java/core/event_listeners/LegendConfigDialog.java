package ao;

import h.IOProperties;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class ba implements PropertyChangeListener {
  ba(aX paramaX) {}

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    String str = paramPropertyChangeEvent.getPropertyName();
    if (aX.a(this.a).r() != null && str.equals("dividerLocation")) {
      double d =
          aX.c(this.a).getDividerLocation()
              / (aX.c(this.a).getWidth() - aX.c(this.a).getDividerSize());
      if (this.a.l) IOProperties.c(IOProperties.X, "" + d);
      if (d > 0.0D && d < 0.88D && !IOProperties.a("showTuningConsole", IOProperties.p)) {
        aX.a(this.a).b(true);
      } else if (d > 0.97D
          && this.a.e() != null
          && IOProperties.a("showTuningConsole", IOProperties.p)) {
        aX.a(this.a).b(false);
        this.a.u();
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ba.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
