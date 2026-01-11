package ai;

import com.efiAnalytics.ui.aN;
import com.efiAnalytics.ui.bV;
import d.PropertiesExtensionInDPackage;
import java.util.Properties;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

class HyperlinkListener implements HyperlinkListener {
  HyperlinkListener(f paramf) {}
  
  public void hyperlinkUpdate(HyperlinkEvent paramHyperlinkEvent) {
    long l = 0L;
    char c = 'ߐ';
    if (paramHyperlinkEvent.getEventType().equals(HyperlinkEvent.EventType.ACTIVATED) && System.currentTimeMillis() - l > c) {
      l = System.currentTimeMillis();
      if (paramHyperlinkEvent.getDescription().contains(":") && !paramHyperlinkEvent.getDescription().startsWith("http:") && !paramHyperlinkEvent.getDescription().startsWith("https:") && !paramHyperlinkEvent.getDescription().startsWith("file:")) {
        String str = paramHyperlinkEvent.getDescription();
        try {
          String str1 = str.substring(0, str.indexOf(":"));
          String str2 = str.substring(str.indexOf(":") + 1);
          String str3 = "";
          if (str2.contains("?")) {
            str3 = str2.contains("?") ? str.substring(str.indexOf("?") + 1) : "";
            str2 = str2.substring(0, str2.indexOf("?"));
          } 
          if (str1.equalsIgnoreCase("appAction")) {
            PropertiesExtensionInDPackage PropertiesExtensionInDPackage = PropertiesExtensionInDPackage.a(str3);
            d.g.a().a(str2, (Properties)PropertiesExtensionInDPackage);
          } else {
            bV.d("Unsure how to handle link: " + str, this.a.a);
          } 
        } catch (Exception exception) {
          bV.d("Unsure how to handle this link:\n" + paramHyperlinkEvent.getDescription() + ", Message:\n" + exception.getMessage(), this.a.a);
        } 
      } else if (paramHyperlinkEvent.getURL().getProtocol().startsWith("http")) {
        aN.a(paramHyperlinkEvent.getURL().toString());
      } else {
        try {
          this.a.a.setPage(paramHyperlinkEvent.getURL());
        } catch (Exception exception) {
          System.out.println("Tried to load web help, but something went wrong.");
          exception.printStackTrace();
        } 
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ai/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */