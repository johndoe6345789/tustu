package business.binary_transformers;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.ui.eg;

class BtInterfaceAb implements eg {
  Gauge a = null;
  
  BtInterfaceAb(W paramW, Gauge paramGauge) {
    this.a = paramGauge;
  }
  
  public void a(int paramInt1, int paramInt2, double paramDouble) {
    if (this.a != null) {
      this.a.setCurrentOutputChannelValue("", paramDouble);
      this.a.repaint();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */