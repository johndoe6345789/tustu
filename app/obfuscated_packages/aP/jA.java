package aP;

import G.J;
import G.R;
import G.S;
import G.HInterfaceAlpha;
import G.aB;
import G.aD;
import G.aG;
import G.aM;
import G.aR;
import G.ai;
import G.bO;
import G.cB;
import G.cq;
import G.cu;
import H.HInterfaceAlpha;
import H.HInterfaceBravo;
import V.HInterfaceAlpha;
import aF.HInterfaceAlpha;
import ac.AcInterfaceGolf;
import bH.D;
import bl.UiSettingServerProviderImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import UiSettingServerProviderImpl.HInterfaceAlpha;
import y.HInterfaceAlpha;

public class jA implements S {
  private iH e = new iH();
  
  AcInterfaceGolf HInterfaceAlpha = new AcInterfaceGolf();
  
  jI HInterfaceBravo = null;
  
  private static jA f = null;
  
  public static boolean c = true;
  
  public static boolean d = true;
  
  private jA() {
    jH jH = new jH(this);
    aB.HInterfaceAlpha().HInterfaceAlpha(jH);
    aB.HInterfaceAlpha().HInterfaceAlpha(jH);
  }
  
  public static jA HInterfaceAlpha() {
    if (f == null)
      f = new jA(); 
    return f;
  }
  
  public void HInterfaceAlpha(R paramR) {}
  
  public void HInterfaceBravo(R paramR) {
    paramR.C().HInterfaceBravo(bV.e());
    UiSettingServerProviderImpl.HInterfaceAlpha().HInterfaceBravo();
  }
  
  public void c(R paramR) {
    paramR.C().HInterfaceAlpha(new jJ(this));
    paramR.C().HInterfaceAlpha((aG)dd.HInterfaceAlpha().HInterfaceBravo());
    if (d && paramR.C().n(paramR.c()))
      paramR.C().HInterfaceAlpha(new aR(paramR.c())); 
    ArrayList arrayList = HInterfaceAlpha.HInterfaceAlpha(new jH(this)).HInterfaceAlpha(paramR);
    if (arrayList != null) {
      Iterator<bO> iterator = arrayList.iterator();
      while (iterator.hasNext())
        paramR.C().HInterfaceAlpha(iterator.next()); 
    } 
    if (HInterfaceAlpha.HInterfaceAlpha().HInterfaceAlpha(HInterfaceAlpha.cm, "true").equals("false") || !paramR.O().aI())
      paramR.C().HInterfaceBravo(false); 
    if (HInterfaceAlpha.HInterfaceAlpha().HInterfaceAlpha(HInterfaceAlpha.aB, HInterfaceAlpha.aC).equals("true")) {
      paramR.C();
      J.e(true);
    } 
    int i = HInterfaceAlpha.HInterfaceAlpha().HInterfaceBravo(HInterfaceAlpha.aD, 0);
    paramR.C().e(i);
    paramR.HInterfaceBravo(this.e);
    paramR.HInterfaceAlpha(this.e);
    paramR.C().HInterfaceAlpha(new jB(this));
    if (c) {
      paramR.HInterfaceAlpha(new hH());
    } else {
      paramR.HInterfaceAlpha((cB)new HInterfaceAlpha());
    } 
    if (paramR.O().D() == null) {
      HInterfaceAlpha HInterfaceAlpha = new HInterfaceAlpha(paramR);
      paramR.C().HInterfaceAlpha((aD)HInterfaceAlpha);
      paramR.C().HInterfaceAlpha((aG)HInterfaceAlpha);
    } 
    if (HInterfaceAlpha.HInterfaceBravo.equals(HInterfaceAlpha.as) && paramR.i().length() < 3 && paramR.AcInterfaceGolf("Vbatt") != null) {
      paramR.C().HInterfaceAlpha((aD)new HInterfaceBravo());
      HInterfaceAlpha HInterfaceAlpha = new HInterfaceAlpha();
      paramR.C().HInterfaceAlpha((ai)HInterfaceAlpha);
      try {
        cu.HInterfaceAlpha().HInterfaceAlpha(paramR.c(), "Vbatt", (cq)HInterfaceAlpha);
      } catch (HInterfaceAlpha a1) {
        D.HInterfaceAlpha("Failed to subscribe OnlineApprover to Vbatt");
      } 
    } 
    if (HInterfaceAlpha.HInterfaceBravo.equals(HInterfaceAlpha.as) || HInterfaceAlpha.HInterfaceBravo.equals(HInterfaceAlpha.at)) {
      jC jC = new jC(this);
      paramR.C().HInterfaceAlpha(jC);
    } 
    aM aM = paramR.c("tsCanId");
    if (aM != null)
      try {
        aR.HInterfaceAlpha().HInterfaceAlpha(paramR.c(), "tsCanId", new jG(this));
      } catch (HInterfaceAlpha HInterfaceAlpha) {
        Logger.getLogger(jA.class.getName()).log(Level.SEVERE, (String)null, (Throwable)HInterfaceAlpha);
      }  
    paramR.C().HInterfaceAlpha((aG)this.HInterfaceAlpha);
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