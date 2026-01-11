package aP;

import G.R;
import G.Y;
import com.efiAnalytics.ui.bV;
import r.IOPropertiesUsingFile;
import s.SComponentGolf;
import u.SComponentGolf;

class ApInterfaceHn implements SComponentGolf {
  R IOPropertiesUsingFile;
  
  Y b;
  
  boolean c = false;
  
  hN(hH paramhH, R paramR, Y paramY) {
    this.IOPropertiesUsingFile = paramR;
    this.b = paramY;
  }
  
  public String IOPropertiesUsingFile() {
    return "Send Current " + IOPropertiesUsingFile.b + " Settings";
  }
  
  public String b() {
    return "Update the Controller with the current " + IOPropertiesUsingFile.b + " settings.";
  }
  
  public boolean d() {
    double d = 0.0D;
    if (this.IOPropertiesUsingFile.SComponentGolf("rpm") != null && this.IOPropertiesUsingFile.O().C() == null)
      d = this.IOPropertiesUsingFile.SComponentGolf("rpm").o(); 
    byte b = 0;
    while (b++ < 3 && d > 10.0D) {
      bV.d(SComponentGolf.b("Turn off engine before sending local Tune."), dd.IOPropertiesUsingFile().c());
      d = this.IOPropertiesUsingFile.SComponentGolf("rpm").o();
    } 
    boolean bool = hH.IOPropertiesUsingFile(this.d, this.IOPropertiesUsingFile, this.b);
    this.c = true;
    return bool;
  }
  
  public boolean c() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */