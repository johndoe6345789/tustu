package ao;

import h.i;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class aY implements PropertyChangeListener {
  aY(aX paramaX) {}
  
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    if (aX.a(this.a).r() != null && "dividerLocation".equals(paramPropertyChangeEvent.getPropertyName())) {
      double d1 = aX.b(this.a).getDividerLocation();
      double d2 = this.a.getHeight();
      if (d1 <= 0.0D || d2 <= 0.0D)
        return; 
      double d3 = d1 / d2;
      i.c(i.W, "" + d3);
      if (d3 < 0.88D && !i.e(i.N, i.R).equals(i.P)) {
        aX.a(this.a).c(true);
      } else if (this.a.getHeight() - aX.b(this.a).getDividerLocation() <= (this.a.b.e.getPreferredSize()).height + aX.b(this.a).getDividerSize()) {
        if (i.Q.equals(i.e(i.N, i.R)))
          aX.a(this.a).c(false); 
        this.a.t();
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/aY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */