package business.action_zones;

import com.efiAnalytics.ui.aN;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MouseAdapterExtensionInAzPackage extends MouseAdapter {
  MouseAdapterExtensionInAzPackage(f paramf) {}

  public void mouseClicked(MouseEvent paramMouseEvent) {
    aN.a("https://www.efianalytics.com/activate");
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/az/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
