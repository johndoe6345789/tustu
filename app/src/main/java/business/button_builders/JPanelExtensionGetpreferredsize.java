package business.button_builders;

import com.efiAnalytics.ui.eJ;
import java.awt.Dimension;
import javax.swing.JPanel;

class JPanelExtensionGetpreferredsize extends JPanel {
  JPanelExtensionGetpreferredsize(p paramp) {}

  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    if (dimension.width < eJ.a(480)) dimension.width = eJ.a(480);
    return dimension;
  }

  public Dimension getMinimumSize() {
    Dimension dimension = super.getMinimumSize();
    if (dimension.width < eJ.a(480)) dimension.width = eJ.a(480);
    return dimension;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
