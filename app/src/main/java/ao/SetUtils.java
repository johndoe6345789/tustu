package ao;

import com.efiAnalytics.ui.bq;
import javax.swing.JMenu;

class ee extends JMenu implements bq {
  public ee(cd paramcd, String paramString) {
    super(paramString);
    addMenuListener(new ef(this, paramcd));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ee.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */