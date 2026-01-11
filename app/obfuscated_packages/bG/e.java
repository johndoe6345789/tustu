package bG;

import com.efiAnalytics.ui.do;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class e implements FocusListener {
  e(d paramd) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {
    do do = (do)paramFocusEvent.getSource();
    do.selectAll();
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bG/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */