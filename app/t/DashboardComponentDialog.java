package t;

import com.efiAnalytics.apps.ts.dashboard.DashLabel;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.Indicator;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.et;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JDialog;

public abstract class DashboardComponentDialog extends JDialog {
  private ai a = null;
  
  private et b = null;
  
  boolean f = true;
  
  public a(Window paramWindow, String paramString) {
    super(paramWindow, paramString);
  }
  
  public et b() {
    return this.b;
  }
  
  public void a(et paramet) {
    this.b = paramet;
    enableEvents(201L);
  }
  
  public void processWindowEvent(WindowEvent paramWindowEvent) {
    if (paramWindowEvent.getID() == 201 && this.b != null) {
      this.b.a("X", getX() + "");
      this.b.a("Y", getY() + "");
      this.f = true;
    } 
    super.processWindowEvent(paramWindowEvent);
  }
  
  protected boolean a(Component paramComponent, String paramString) {
    if (c().a().size() <= 1 || !this.f)
      return true; 
    this.f = !bV.a("There is more than 1 item selected.\nAre you sure you want to set all " + paramString + " values?", paramComponent, true);
    return !this.f;
  }
  
  public void setVisible(boolean paramBoolean) {
    if (paramBoolean) {
      Rectangle rectangle = getBounds();
      rectangle = bV.a(rectangle);
      setBounds(rectangle);
    } 
    super.setVisible(paramBoolean);
  }
  
  public ai c() {
    return this.a;
  }
  
  public void a(ai paramai) {
    this.a = paramai;
  }
  
  public Gauge b(ArrayList paramArrayList) {
    for (s s : paramArrayList) {
      if (s instanceof Gauge)
        return (Gauge)s; 
    } 
    return null;
  }
  
  public Indicator c(ArrayList paramArrayList) {
    for (s s : paramArrayList) {
      if (s instanceof Indicator)
        return (Indicator)s; 
    } 
    return null;
  }
  
  public DashLabel d(ArrayList paramArrayList) {
    for (s s : paramArrayList) {
      if (s instanceof DashLabel)
        return (DashLabel)s; 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */