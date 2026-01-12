package business.binary_transformers;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class NumericTextFieldFocusAdapter extends FocusAdapter {
  NumericTextFieldFocusAdapter(A paramA) {}

  public void focusGained(FocusEvent paramFocusEvent) {
    this.a.selectAll();
  }

  public void focusLost(FocusEvent paramFocusEvent) {
    A.a(this.a);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/B.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
