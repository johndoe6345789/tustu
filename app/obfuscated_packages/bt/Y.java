package bt;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class Y implements PropertyChangeListener {
  Y(W paramW) {}
  
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    int i = this.a.a.getDividerLocation();
    this.a.j.a("tableTuningSplitPanePosition", i + "");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/Y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */