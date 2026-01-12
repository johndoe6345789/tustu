package com.efiAnalytics.apps.ts.dashboard;

import com.efiAnalytics.ui.aN;
import com.efiAnalytics.ui.bV;
import d.HashMapUsingArrayList;
import d.PropertiesExtensionInDPackage;
import java.util.Properties;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

class HtmlDisplayHyperlinkListener implements HyperlinkListener {
  long a = 0L;

  int PropertiesExtensionInDPackage = 2000;

  HtmlDisplayHyperlinkListener(HtmlDisplay paramHtmlDisplay) {}

  public void hyperlinkUpdate(HyperlinkEvent paramHyperlinkEvent) {
    if (paramHyperlinkEvent.getEventType().equals(HyperlinkEvent.EventType.ACTIVATED)
        && System.currentTimeMillis() - this.a > this.PropertiesExtensionInDPackage) {
      this.a = System.currentTimeMillis();
      if (paramHyperlinkEvent.getDescription().indexOf(":") != -1
          && !paramHyperlinkEvent.getDescription().startsWith("http:")
          && !paramHyperlinkEvent.getDescription().startsWith("https:")
          && !paramHyperlinkEvent.getDescription().startsWith("file:")) {
        String str = paramHyperlinkEvent.getDescription();
        try {
          String str1 = str.substring(0, str.indexOf(":"));
          String str2 = str.substring(str.indexOf(":") + 1);
          String str3 = "";
          if (str2.indexOf("?") != -1) {
            str3 = (str2.indexOf("?") != -1) ? str.substring(str.indexOf("?") + 1) : "";
            str2 = str2.substring(0, str2.indexOf("?"));
          }
          if (str1.equals("appAction")) {
            PropertiesExtensionInDPackage PropertiesExtensionInDPackage =
                PropertiesExtensionInDPackage.a(str3);
            HashMapUsingArrayList.a().a(str2, (Properties) PropertiesExtensionInDPackage);
          } else {
            bV.d("Unsure how to handle link: " + str, this.c.a);
          }
        } catch (Exception exception) {
          bV.d(
              "Unsure how to handle this link:\n"
                  + paramHyperlinkEvent.getDescription()
                  + ", Message:\n"
                  + exception.getMessage(),
              this.c.a);
        }
      } else if ((HtmlDisplay.access$000(this.c)
              && paramHyperlinkEvent.getURL().getProtocol().startsWith("http"))
          || (HtmlDisplay.access$100(this.c)
              && (paramHyperlinkEvent.getDescription().startsWith("http:")
                  || paramHyperlinkEvent.getDescription().startsWith("https:")))) {
        aN.a(paramHyperlinkEvent.getURL().toString());
      } else {
        try {
          this.c.a.setPage(paramHyperlinkEvent.getURL());
        } catch (Exception exception) {
          System.out.println("Tried to load web help, but something went wrong.");
          exception.printStackTrace();
        }
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/aI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
