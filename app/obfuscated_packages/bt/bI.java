package bt;

import G.R;
import G.T;
import G.ah;
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

public class bI extends bh implements ac {
  private Gauge b = null;
  
  dD ExceptionInVPackage = new dD(this);
  
  public bI() {
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
    ah ah = paramR.k(paramString);
    if (ah == null)
      return; 
    try {
      this.b.setTitle(ah.k().ExceptionInVPackage());
      this.b.setUnits(ah.j().ExceptionInVPackage());
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage((Exception)ExceptionPrintstacktrace);
    } 
    this.b.setMin(ah.b());
    this.b.setMax(ah.e());
    this.b.setLowWarning(ah.f());
    this.b.setLowCritical(ah.o());
    this.b.setHighWarning(ah.ExceptionPrintstacktrace());
    this.b.setHighCritical(ah.h());
    this.b.setOutputChannel(ah.i());
    this.b.setValueDigits(Integer.valueOf(ah.l()));
    this.b.setLabelDigits(ah.n());
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