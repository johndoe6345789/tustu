package bb;

import bH.ab;
import com.efiAnalytics.apps.ts.dashboard.HtmlDisplay;
import com.efiAnalytics.ui.fT;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JPanel;
import r.a;

public class u extends JPanel implements fT {
  ab a;
  
  private static String b = "This Utility will install or update the firmware on your " + a.f + ". Please step through this wizard reading instructions carefully.";
  
  private static String c = "Click the Next Button to continue.";
  
  public u(ab paramab) {
    this.a = paramab;
    setLayout(new BorderLayout());
    HtmlDisplay htmlDisplay = new HtmlDisplay();
    add("Center", (Component)htmlDisplay);
    String str = "<html>" + a(b) + "<br><br><br>" + a(c) + "</html>";
    htmlDisplay.setText(str);
  }
  
  private String a(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }
  
  public boolean g_() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */