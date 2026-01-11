package G;

import V.ExceptionPrintstacktrace;
import bH.D;
import java.io.Serializable;
import java.util.List;

public abstract class GInterfaceBl extends Q implements Serializable {
  protected String a = "basicPattern";
  
  public void a(String paramString) {
    if (paramString == null || (!paramString.equals("fixedAngle") && !paramString.equals("basicPattern") && !paramString.equals("bitArrayPattern")))
      throw new ExceptionPrintstacktrace("Unrecognized TriggerWheel Pattern Class: " + paramString); 
    this.a = paramString;
  }
  
  public void u(String paramString) {
    D.a("setActiveCondition in EcuUiTriggerWheelPattern is not used. Use the active condition when adding to TriggerWheel");
  }
  
  public abstract List a();
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */