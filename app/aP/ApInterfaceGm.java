package aP;

import bH.D;
import bl.ApplicationPluginExtension;
import c.CInterfaceEcho;
import com.efiAnalytics.plugin.ApplicationPlugin;
import r.RInterfaceIndia;

class ApInterfaceGm implements CInterfaceEcho {
  ApplicationPlugin a = null;
  
  public ApInterfaceGm(dB paramdB, ApplicationPlugin paramApplicationPlugin) {
    this.a = paramApplicationPlugin;
  }
  
  public boolean a() {
    try {
      this.a = ApplicationPluginExtension.a().b(this.a.getIdName());
      return (RInterfaceIndia.a().a("09jtrkgds;okfds") && this.a.isMenuEnabled());
    } catch (Error error) {
      D.a("Error calling isMenuEnabled() on Plugin " + this.a.getIdName() + " by " + this.a.getAuthor() + "\nMessage\n" + error.getMessage());
      return false;
    } catch (Exception exception) {
      if (this.a != null) {
        D.a("Exception calling isMenuEnabled() on Plugin " + this.a.getIdName() + " by " + this.a.getAuthor() + "\nMessage\n" + exception.getMessage());
      } else {
        D.a("Exception calling isMenuEnabled() on Plugin, It does not seem to be loaded \nMessage\n" + exception.getMessage());
      } 
      return false;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */