package business.binary_transformers;

import java.awt.Adjustable;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

class AdjustmentListener implements AdjustmentListener {
  AdjustmentListener(an paraman) {}

  public void adjustmentValueChanged(AdjustmentEvent paramAdjustmentEvent) {
    Adjustable adjustable = paramAdjustmentEvent.getAdjustable();
    if (paramAdjustmentEvent.getValueIsAdjusting())
      ;
    int i = paramAdjustmentEvent.getValue();
    this.a.v.c(i);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
