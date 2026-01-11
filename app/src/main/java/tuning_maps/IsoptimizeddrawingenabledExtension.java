package aP;

import G.R;
import aE.PropertiesExtension;
import aE.AeInterfaceEcho;
import bt.RInterfaceIndia;
import com.efiAnalytics.tunerStudio.panels.TriggerLoggerPanel;
import com.efiAnalytics.ui.et;
import java.awt.Component;
import Isoptimizeddrawingenabled.PropertiesExtension;
import Isoptimizeddrawingenabled.NInterfaceGolf;
import Isoptimizeddrawingenabled.Isoptimizeddrawingenabled;
import r.RInterfaceIndia;
import s.NInterfaceGolf;

public class IsoptimizeddrawingenabledExtension extends Isoptimizeddrawingenabled implements AeInterfaceEcho, PropertiesExtension, NInterfaceGolf {
  TriggerLoggerPanel PropertiesExtension = null;
  
  R b = null;
  
  public IsoptimizeddrawingenabledExtension() {
    setTabPlacement(1);
  }
  
  public void PropertiesExtension(PropertiesExtension parama, R paramR) {
    this.b = paramR;
  }
  
  public void e_() {
    if (this.PropertiesExtension != null && this.b != null)
      this.PropertiesExtension.b(this.b); 
    removeAll();
    this.PropertiesExtension = null;
    this.b = null;
  }
  
  private void c() {
    boolean bool = RInterfaceIndia.PropertiesExtension().PropertiesExtension("pokfr09i0943");
    this.PropertiesExtension = new TriggerLoggerPanel(bool);
    this.PropertiesExtension.PropertiesExtension((et)new RInterfaceIndia("ignitionLogger"));
    this.PropertiesExtension.c();
    addTab(NInterfaceGolf.b("High Speed Logger"), (Component)this.PropertiesExtension);
    this.PropertiesExtension.d(this.b);
  }
  
  public boolean PropertiesExtension() {
    if (this.PropertiesExtension == null)
      c(); 
    return true;
  }
  
  public void PropertiesExtension(PropertiesExtension parama) {}
  
  public void b() {
    if (this.PropertiesExtension != null)
      this.PropertiesExtension.b(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */