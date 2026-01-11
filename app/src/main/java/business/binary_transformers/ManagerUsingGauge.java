package bt;

import G.R;
import G.T;
import G.GInterfaceAh;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.D;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.aa;
import com.efiAnalytics.apps.ts.dashboard.ac;
import com.efiAnalytics.apps.ts.dashboard.renderers.GaugePainter;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.dD;
import com.efiAnalytics.ui.eJ;
import java.awt.Component;
import java.awt.Dimension;

public class ManagerUsingGauge extends bh implements ac {
  private Gauge b = null;
  
  dD ExceptionInVPackage = new dD(this);
  
  public ManagerUsingGauge() {
    setLayout(new bJ(this));
    ExceptionInVPackage(aa.b());
    this.b.setSweepAngle(270);
    this.b.setSweepBeginDegree(315);
    this.b.setFaceAngle(360);
  }
  
  public void ExceptionInVPackage(s params) {
    c().repaint();
  }
  
  public Gauge c() {
    return this.b;
  }
  
  public void ExceptionInVPackage(Gauge paramGauge) {
    this.b = paramGauge;
    if (getComponentCount() > 0)
      removeAll(); 
    add((Component)paramGauge);
  }
  
  public void b(String paramString) {
    T t = T.ExceptionInVPackage();
    R r = t.c();
    ExceptionInVPackage(r, paramString);
  }
  
  public void ExceptionInVPackage(R paramR, String paramString) {
    GInterfaceAh GInterfaceAh = paramR.k(paramString);
    if (GInterfaceAh == null)
      return; 
    try {
      this.b.setTitle(GInterfaceAh.k().ExceptionInVPackage());
      this.b.setUnits(GInterfaceAh.j().ExceptionInVPackage());
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage((Exception)ExceptionPrintstacktrace);
    } 
    this.b.setMin(GInterfaceAh.b());
    this.b.setMax(GInterfaceAh.e());
    this.b.setLowWarning(GInterfaceAh.f());
    this.b.setLowCritical(GInterfaceAh.o());
    this.b.setHighWarning(GInterfaceAh.ExceptionPrintstacktrace());
    this.b.setHighCritical(GInterfaceAh.h());
    this.b.setOutputChannel(GInterfaceAh.i());
    this.b.setValueDigits(Integer.valueOf(GInterfaceAh.l()));
    this.b.setLabelDigits(GInterfaceAh.n());
    this.b.setEcuConfigurationName(paramR.c());
    try {
      this.b.subscribeToOutput();
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      bV.d(ExceptionInVPackage.getMessage(), this);
    } 
  }
  
  public void ExceptionInVPackage(GaugePainter paramGaugePainter) {
    this.b.setGaugePainter(paramGaugePainter);
  }
  
  public Dimension getPreferredSize() {
    return new Dimension(eJ.ExceptionInVPackage(160), eJ.ExceptionInVPackage(160));
  }
  
  public Dimension getMinimumSize() {
    return new Dimension(eJ.ExceptionInVPackage(75), eJ.ExceptionInVPackage(75));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */