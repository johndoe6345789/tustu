package business.button_builders;

import bH.ab;
import com.efiAnalytics.apps.ts.dashboard.HtmlDisplay;
import com.efiAnalytics.ui.fT;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JPanel;
import r.IOPropertiesUsingFile;

public class BbInterfaceUniform extends JPanel implements fT {
  ab IOPropertiesUsingFile;

  private static String b =
      "This Utility will install or update the firmware on your "
          + IOPropertiesUsingFile.f
          + ". Please step through this wizard reading instructions carefully.";

  private static String c = "Click the Next Button to continue.";

  public BbInterfaceUniform(ab paramab) {
    this.IOPropertiesUsingFile = paramab;
    setLayout(new BorderLayout());
    HtmlDisplay htmlDisplay = new HtmlDisplay();
    add("Center", (Component) htmlDisplay);
    String str =
        "<html>" + IOPropertiesUsingFile(b) + "<br><br><br>" + IOPropertiesUsingFile(c) + "</html>";
    htmlDisplay.setText(str);
  }

  private String IOPropertiesUsingFile(String paramString) {
    return (this.IOPropertiesUsingFile != null)
        ? this.IOPropertiesUsingFile.IOPropertiesUsingFile(paramString)
        : paramString;
  }

  public boolean g_() {
    return true;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
