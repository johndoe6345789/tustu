package ai;

import com.efiAnalytics.ui.aN;
import com.efiAnalytics.ui.bV;
import java.io.FileNotFoundException;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

class HyperlinkListenerHyperlinkupdate implements HyperlinkListener {
  HyperlinkListenerHyperlinkupdate(f paramf) {}

  public void hyperlinkUpdate(HyperlinkEvent paramHyperlinkEvent) {
    if (paramHyperlinkEvent.getEventType().equals(HyperlinkEvent.EventType.ACTIVATED))
      if (paramHyperlinkEvent.getDescription().startsWith("app")) {
        String str = paramHyperlinkEvent.getDescription();
        str = str.substring(4);
        e e = a.a().a(str);
        this.a.a(e.a());
      } else if (paramHyperlinkEvent.getURL().getProtocol().startsWith("http")) {
        aN.a(paramHyperlinkEvent.getURL().toString());
      } else {
        try {
          this.a.a.setPage(paramHyperlinkEvent.getURL());
        } catch (FileNotFoundException fileNotFoundException) {
          System.out.println("Tried to load web help, File Not Found.");
          bV.d("File Not Found:\n" + fileNotFoundException.getMessage(), this.a.a);
          fileNotFoundException.printStackTrace();
        } catch (Exception exception) {
          System.out.println("Tried to load web help, but something went wrong.");
          exception.printStackTrace();
        }
      }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ai/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
