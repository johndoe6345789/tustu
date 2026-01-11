package business.binary_transformers;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class ArrayEditorFocusListener implements FocusListener {
  int a = -1;
  
  ArrayEditorFocusListener(R paramR, int paramInt) {
    this.a = paramInt;
  }
  
  public void focusGained(FocusEvent paramFocusEvent) {
    R.a(this.b, this.a);
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/S.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */