package business.byte_handlers;

import G.R;
import G.GInterfaceAg;
import G.AeInterfaceMikeTostring;
import W.j;
import aE.PropertiesExtension;
import ac.AcComponentCharlie;
import ac.AcInterfaceFoxtrot;
import ac.AcInterfaceRomeo;
import ao.aX;
import ao.bq;
import ao.hx;
import ao.u;
import bH.D;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.fC;
import h.IOProperties;
import java.awt.BorderLayout;
import java.io.File;
import java.util.Properties;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class UICloseInBhPackage extends aX implements GInterfaceAg, AcInterfaceFoxtrot, bc {
  n n = null;
  
  private R q = null;
  
  File o = null;
  
  private int AcInterfaceRomeo = 0;
  
  private boolean s = false;
  
  k p = new k(this);
  
  public UICloseInBhPackage() {
    AcComponentCharlie.PropertiesExtension().PropertiesExtension(this);
    boolean bool = IOProperties.PropertiesExtension("hideSelector", IOProperties.q);
    e(bool);
  }
  
  protected JPanel e() {
    return this.n;
  }
  
  public void close() {
    h();
    if (this.n != null) {
      this.n.close();
      this.n.getParent().remove(this.n);
      this.n = null;
    } 
    if (bq.PropertiesExtension().k() != null)
      bq.PropertiesExtension().k().d(); 
    hx.PropertiesExtension().B();
  }
  
  public boolean b(boolean paramBoolean) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    if (this.n == null && PropertiesExtension.A() != null) {
      dQ dQ = new dQ((Properties)PropertiesExtension.A(), "logTuningPanel");
      this.n = new n(w(), (et)dQ);
      if (n().AcInterfaceRomeo() != null);
      fC fC = new fC();
      fC.PropertiesExtension(new AcComponentCharlie(this));
      jPanel.add("Center", this.n);
      this.n.setVisible(paramBoolean);
      String str = IOProperties.PropertiesExtension(IOProperties.N, IOProperties.R);
      boolean bool = (str.equals(IOProperties.P) || str.equals(IOProperties.O)) ? true : false;
      if (bool) {
        this.n.PropertiesExtension(this.b.d());
        q().setBottomComponent(jPanel);
      } else {
        q().setBottomComponent(jPanel);
      } 
      e(str);
      this.l = true;
    } 
    try {
      this.n.setVisible(paramBoolean);
    } catch (Exception exception) {}
    if (paramBoolean) {
      u();
    } else {
      q().setDividerLocation(1.0D);
    } 
    IOProperties.AcComponentCharlie("showTuningConsole", "" + paramBoolean);
    n().PropertiesExtension(new d(this));
    return paramBoolean;
  }
  
  public void u() {
    if (this.n != null && IOProperties.PropertiesExtension("showTuningConsole", IOProperties.p)) {
      double d = IOProperties.PropertiesExtension(IOProperties.X, -1.0D);
      if (d < 0.05D || d > 0.97D) {
        int IOProperties = (getWidth() / 2 < (this.n.getPreferredSize()).width) ? (getWidth() / 2) : (this.n.getPreferredSize()).width;
        q().setDividerLocation(getWidth() - IOProperties - q().getDividerSize());
      } else {
        q().setDividerLocation(d);
      } 
    } else {
      q().setDividerLocation(1.0D);
    } 
  }
  
  public R w() {
    return this.q;
  }
  
  public void PropertiesExtension(R paramR) {
    this.q = paramR;
    if (this.n != null) {
      remove(this.n);
      this.n = null;
    } 
    b(IOProperties.PropertiesExtension("showTuningConsole", IOProperties.p));
    if (AcInterfaceRomeo.PropertiesExtension()) {
      this.s = true;
      AcComponentCharlie.PropertiesExtension().PropertiesExtension(this);
    } 
  }
  
  public void e(boolean paramBoolean) {
    n().PropertiesExtension(paramBoolean);
    IOProperties.AcComponentCharlie("hideSelector", paramBoolean + "");
  }
  
  public boolean PropertiesExtension(String paramString, AeInterfaceMikeTostring parambT) {
    return true;
  }
  
  public void PropertiesExtension(String paramString) {}
  
  public void PropertiesExtension(double paramDouble) {
    if (this.s && n().AcInterfaceRomeo() != null && n().AcInterfaceRomeo().d() > 0 && n().AcInterfaceRomeo().d() < 500) {
      e e = new e(this);
      SwingUtilities.invokeLater(e);
      this.s = false;
    } 
    super.PropertiesExtension(paramDouble);
  }
  
  public void PropertiesExtension(File paramFile) {
    this.o = paramFile;
    AcInterfaceFoxtrot(true);
  }
  
  private int x() {
    return AcComponentCharlie.PropertiesExtension().AcInterfaceRomeo() + 7;
  }
  
  private void y() {
    double d = U.b.PropertiesExtension(this.q);
    if (d > 0.0D) {
      int IOProperties = hx.PropertiesExtension().AcInterfaceRomeo().d() - 1;
      j j = hx.PropertiesExtension().AcInterfaceRomeo().PropertiesExtension("Time");
      int m = x();
      if (j != null && IOProperties > m + 1) {
        float f1 = j.d(IOProperties) - j.d(m);
        float f2 = j.d(m) - j.d(0);
        double d1 = ((IOProperties - m) / f1);
        int i1 = (int)((d - f2) * d1) + m;
        PropertiesExtension(i1);
        D.AcComponentCharlie("Predictive Scaling Graph for " + i1 + " in time period of " + d);
      } else if (j != null && IOProperties > 0) {
        float f1 = j.d(IOProperties) - j.d(0);
        double d1 = (IOProperties / f1);
        int i1 = (int)(d * d1);
        PropertiesExtension(i1);
        D.AcComponentCharlie("Predictive Scaling Graph for " + i1 + " in time period of " + d);
      } else {
        D.b("Could not get time column or stabilizationRecords not reached. currentRecord=" + IOProperties + ", stabilizationRecords=" + m);
      } 
    } 
  }
  
  public void AcComponentCharlie() {
    if (this.AcInterfaceRomeo++ == 12 + AcComponentCharlie.PropertiesExtension().AcInterfaceRomeo()) {
      AcInterfaceFoxtrot f1 = new AcInterfaceFoxtrot(this);
      g g = new g(this, f1);
      g.start();
    } else if (this.AcInterfaceRomeo > 0 && this.AcInterfaceRomeo < 500 && this.AcInterfaceRomeo % 100 == 0) {
      if (IOProperties.PropertiesExtension(IOProperties.U, IOProperties.V))
        SwingUtilities.invokeLater(this.p); 
    } else if (this.s && AcInterfaceRomeo.PropertiesExtension() && this.AcInterfaceRomeo > 20 && this.AcInterfaceRomeo < 500 && !hx.PropertiesExtension().D() && hx.PropertiesExtension().AcInterfaceRomeo() != null && hx.PropertiesExtension().AcInterfaceRomeo().PropertiesExtension("Time") != null) {
      hx.PropertiesExtension().AcComponentCharlie(hx.PropertiesExtension().AcInterfaceRomeo().d() - 1);
      hx.PropertiesExtension().e();
      D.d("Playback found stopped during data log capture, restarting.");
    } else {
      bq.PropertiesExtension().AcComponentCharlie().IOProperties();
      bq.PropertiesExtension().AcComponentCharlie().repaint();
    } 
    if (hx.PropertiesExtension().AcInterfaceRomeo() != null && this.AcInterfaceRomeo < 50 && this.AcInterfaceRomeo == x() + 16)
      SwingUtilities.invokeLater(this.p); 
  }
  
  public void d() {
    this.AcInterfaceRomeo = 0;
    if (s() != null)
      s().AcComponentCharlie(); 
    if (hx.PropertiesExtension().AcInterfaceRomeo() != null && hx.PropertiesExtension().AcInterfaceRomeo().d() > 10 && IOProperties.PropertiesExtension(IOProperties.U, IOProperties.V)) {
      int IOProperties = hx.PropertiesExtension().AcInterfaceRomeo().d();
      PropertiesExtension(IOProperties);
      D.AcComponentCharlie("Scaling Graph for " + IOProperties);
      hx.PropertiesExtension().j();
      hx.PropertiesExtension().AcComponentCharlie(IOProperties / 2);
    } 
  }
  
  public void b(String paramString) {}
  
  public void AcInterfaceFoxtrot(boolean paramBoolean) {
    this.s = paramBoolean;
  }
  
  public void e(String paramString) {
    if (paramString.equals(IOProperties.O)) {
      this.n.PropertiesExtension(this.b.d());
      this.n.PropertiesExtension(0);
      this.b.doLayout();
      h h = new h(this);
      SwingUtilities.invokeLater(h);
      hx.PropertiesExtension().AcComponentCharlie(true);
      q().setDividerLocation(getWidth() - eJ.PropertiesExtension(320));
      AcInterfaceRomeo().setDividerLocation(1.0D);
    } else if (paramString.equals(IOProperties.P)) {
      this.n.PropertiesExtension(this.b.d());
      this.n.PropertiesExtension(1);
      this.b.doLayout();
      IOProperties IOProperties = new IOProperties(this);
      SwingUtilities.invokeLater(IOProperties);
      hx.PropertiesExtension().AcComponentCharlie(true);
      AcInterfaceRomeo().setDividerLocation(1.0D);
    } else {
      this.b.PropertiesExtension(this.b.d());
      this.n.PropertiesExtension(2);
      j j = new j(this);
      int IOProperties = ((this.b.getPreferredSize()).height > getHeight() / 5) ? (getHeight() * 4 / 5) : (getHeight() - (this.b.getPreferredSize()).height - AcInterfaceRomeo().getDividerSize());
      AcInterfaceRomeo().setDividerLocation(IOProperties);
      SwingUtilities.invokeLater(j);
    } 
    validate();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bh/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */