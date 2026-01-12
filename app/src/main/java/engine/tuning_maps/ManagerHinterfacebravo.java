package aP;

import G.ArrayListInGPackage;
import G.GComponentAi;
import G.GComponentCq;
import G.GInterfaceAg;
import G.GInterfaceBo;
import G.GInterfaceCb;
import G.HInterfaceAlpha;
import G.J;
import G.Manager;
import G.ManagerUsingArrayList;
import G.ManagerUsingConcurrentHashMap;
import G.R;
import G.S;
import G.SerializableExtension;
import H.HInterfaceAlpha;
import H.HInterfaceBravo;
import UiSettingServerProviderImpl.HInterfaceAlpha;
import V.HInterfaceAlpha;
import aF.HInterfaceAlpha;
import ac.AcInterfaceGolf;
import bH.D;
import bl.UiSettingServerProviderImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import y.HInterfaceAlpha;

public class ManagerHinterfacebravo implements S {
  private iH e = new iH();

  AcInterfaceGolf HInterfaceAlpha = new AcInterfaceGolf();

  jI HInterfaceBravo = null;

  private static jA f = null;

  public static boolean c = true;

  public static boolean d = true;

  private ManagerHinterfacebravo() {
    jH jH = new jH(this);
    ArrayListInGPackage.HInterfaceAlpha().HInterfaceAlpha(jH);
    ArrayListInGPackage.HInterfaceAlpha().HInterfaceAlpha(jH);
  }

  public static jA HInterfaceAlpha() {
    if (f == null) f = new jA();
    return f;
  }

  public void HInterfaceAlpha(R paramR) {}

  public void HInterfaceBravo(R paramR) {
    paramR.C().HInterfaceBravo(bV.e());
    UiSettingServerProviderImpl.HInterfaceAlpha().HInterfaceBravo();
  }

  public void c(R paramR) {
    paramR.C().HInterfaceAlpha(new jJ(this));
    paramR.C().HInterfaceAlpha((GInterfaceAg) dd.HInterfaceAlpha().HInterfaceBravo());
    if (d && paramR.C().n(paramR.c()))
      paramR.C().HInterfaceAlpha(new ManagerUsingConcurrentHashMap(paramR.c()));
    ArrayList arrayList = HInterfaceAlpha.HInterfaceAlpha(new jH(this)).HInterfaceAlpha(paramR);
    if (arrayList != null) {
      Iterator<GInterfaceBo> iterator = arrayList.iterator();
      while (iterator.hasNext()) paramR.C().HInterfaceAlpha(iterator.next());
    }
    if (HInterfaceAlpha.HInterfaceAlpha()
            .HInterfaceAlpha(HInterfaceAlpha.cm, "true")
            .equals("false")
        || !paramR.O().aI()) paramR.C().HInterfaceBravo(false);
    if (HInterfaceAlpha.HInterfaceAlpha()
        .HInterfaceAlpha(HInterfaceAlpha.ArrayListInGPackage, HInterfaceAlpha.aC)
        .equals("true")) {
      paramR.C();
      J.e(true);
    }
    int i =
        HInterfaceAlpha.HInterfaceAlpha().HInterfaceBravo(HInterfaceAlpha.SerializableExtension, 0);
    paramR.C().e(i);
    paramR.HInterfaceBravo(this.e);
    paramR.HInterfaceAlpha(this.e);
    paramR.C().HInterfaceAlpha(new jB(this));
    if (c) {
      paramR.HInterfaceAlpha(new hH());
    } else {
      paramR.HInterfaceAlpha((GInterfaceCb) new HInterfaceAlpha());
    }
    if (paramR.O().D() == null) {
      HInterfaceAlpha HInterfaceAlpha = new HInterfaceAlpha(paramR);
      paramR.C().HInterfaceAlpha((SerializableExtension) HInterfaceAlpha);
      paramR.C().HInterfaceAlpha((GInterfaceAg) HInterfaceAlpha);
    }
    if (HInterfaceAlpha.HInterfaceBravo.equals(HInterfaceAlpha.as)
        && paramR.i().length() < 3
        && paramR.AcInterfaceGolf("Vbatt") != null) {
      paramR.C().HInterfaceAlpha((SerializableExtension) new HInterfaceBravo());
      HInterfaceAlpha HInterfaceAlpha = new HInterfaceAlpha();
      paramR.C().HInterfaceAlpha((GComponentAi) HInterfaceAlpha);
      try {
        ManagerUsingArrayList.HInterfaceAlpha()
            .HInterfaceAlpha(paramR.c(), "Vbatt", (GComponentCq) HInterfaceAlpha);
      } catch (HInterfaceAlpha a1) {
        D.HInterfaceAlpha("Failed to subscribe OnlineApprover to Vbatt");
      }
    }
    if (HInterfaceAlpha.HInterfaceBravo.equals(HInterfaceAlpha.as)
        || HInterfaceAlpha.HInterfaceBravo.equals(HInterfaceAlpha.at)) {
      jC jC = new jC(this);
      paramR.C().HInterfaceAlpha(jC);
    }
    Manager Manager = paramR.c("tsCanId");
    if (Manager != null)
      try {
        ManagerUsingConcurrentHashMap.HInterfaceAlpha()
            .HInterfaceAlpha(paramR.c(), "tsCanId", new jG(this));
      } catch (HInterfaceAlpha HInterfaceAlpha) {
        Logger.getLogger(jA.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) HInterfaceAlpha);
      }
    paramR.C().HInterfaceAlpha((GInterfaceAg) this.HInterfaceAlpha);
    paramR.C().HInterfaceAlpha(bV.e());
  }

  private jI c() {
    if (this.HInterfaceBravo == null || !this.HInterfaceBravo.isAlive()) {
      this.HInterfaceBravo = new jI(this);
      this.HInterfaceBravo.start();
    }
    return this.HInterfaceBravo;
  }

  public void HInterfaceAlpha(iH paramiH) {
    this.e = paramiH;
  }

  public void HInterfaceBravo() {
    while (this.HInterfaceBravo != null && !this.HInterfaceBravo.HInterfaceAlpha.isEmpty()) {
      try {
        Thread.sleep(50L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(jA.class.getName()).log(Level.WARNING, "Not really", interruptedException);
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/jA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
