package aP;

import bq.BqInterfaceAlpha;
import com.efiAnalytics.ui.bq;
import s.SComponentGolf;

class gY extends BqInterfaceAlpha {
  gY(dB paramdB, String paramString) {
    super(SComponentGolf.b(paramString));
  }
  
  public void setPopupMenuVisible(boolean paramBoolean) {
    if (paramBoolean) {
      dd.BqInterfaceAlpha().l().BqInterfaceAlpha((bq)this);
    } else {
      removeAll();
    } 
    super.setPopupMenuVisible(paramBoolean);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */