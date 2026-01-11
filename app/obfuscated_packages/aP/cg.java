package aP;

import ao.bK;
import ao.bq;
import ao.hx;
import h.IOProperties;
import java.awt.Component;

class cg implements Runnable {
  cg(cc paramcc) {}
  
  public void run() {
    bK bK = bq.a().f();
    if (hx.a().r() != null)
      if (this.a.z.isSelected() && dd.a().n().getComponentCount() == 0) {
        dd.a().n().add((Component)bK);
        boolean bool = IOProperties.a("showDashboard", true);
        dd.a().c().validate();
        hx.a().c(bool);
      } else if (!this.a.z.isSelected() && bq.a().h().getComponentCount() == 0) {
        bq.a().h().add((Component)bK);
        dd.a().c().validate();
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */