package bl;

import com.efiAnalytics.ui.aN;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

class k implements HyperlinkListener {
  k(h paramh) {}
  
  public void hyperlinkUpdate(HyperlinkEvent paramHyperlinkEvent) {
    if (paramHyperlinkEvent.getEventType().equals(HyperlinkEvent.EventType.ACTIVATED))
      aN.a(paramHyperlinkEvent.getURL().toString()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */