package aP;

import bq.a;
import com.efiAnalytics.ui.bq;
import s.g;

class gI extends a {
  gI(dB paramdB, String paramString) {
    super(g.b(paramString));
  }
  
  public void setPopupMenuVisible(boolean paramBoolean) {
    if (paramBoolean) {
      dd.a().b().a((bq)this);
    } else {
      removeAll();
    } 
    super.setPopupMenuVisible(paramBoolean);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */