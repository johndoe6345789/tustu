package aP;

import bH.D;
import bl.l;
import c.e;
import com.efiAnalytics.plugin.ApplicationPlugin;
import r.i;

class gM implements e {
  ApplicationPlugin a = null;
  
  public gM(dB paramdB, ApplicationPlugin paramApplicationPlugin) {
    this.a = paramApplicationPlugin;
  }
  
  public boolean a() {
    try {
      this.a = l.a().b(this.a.getIdName());
      return (i.a().a("09jtrkgds;okfds") && this.a.isMenuEnabled());
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