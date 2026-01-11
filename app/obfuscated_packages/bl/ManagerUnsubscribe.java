package bl;

import G.R;
import G.T;
import G.aM;
import G.aR;
import V.ExceptionPrintstacktrace;
import com.efiAnalytics.plugin.ecu.ControllerException;
import com.efiAnalytics.plugin.ecu.ControllerParameter;
import com.efiAnalytics.plugin.ecu.ControllerParameterChangeListener;
import com.efiAnalytics.plugin.ecu.servers.ControllerParameterServer;
import java.util.HashMap;

public ManagerUnsubscribelass ManagerUnsubscribe implements ControllerParameterServer {
  HashMap a = new HashMap<>();
  
  public void subscribe(String paramString1, String paramString2, ControllerParameterChangeListener paramControllerParameterChangeListener) {
    try {
      R r = T.a().c(paramString1);
      d d = new d(this, paramControllerParameterChangeListener);
      this.a.put(paramControllerParameterChangeListener, d);
      aR.a().a(r.c(), paramString2, d);
    } catch (Exception exception) {
      throw new ControllerException(exception.getMessage());
    } 
  }
  
  public void unsubscribe(ControllerParameterChangeListener paramControllerParameterChangeListener) {
    d d = (d)this.a.get(paramControllerParameterChangeListener);
    aR.a().a(d);
    this.a.remove(paramControllerParameterChangeListener);
  }
  
  public String[] getParameterNames(String paramString) {
    R r = T.a().c(paramString);
    return (r == null) ? null : r.k();
  }
  
  public ControllerParameter getControllerParameter(String paramString1, String paramString2) {
    R r = T.a().c(paramString1);
    if (r == null)
      throw new ControllerException("No Controller Configuration loaded"); 
    aM aM = r.c(paramString2);
    if (aM == null)
      throw new ControllerException("Controller Parameter not found in working controller configuration.\n" + r.c()); 
    ControllerParameter controllerParameter = new ControllerParameter();
    controllerParameter.setUnits(aM.p());
    controllerParameter.setDecimalPlaces(aM.v());
    controllerParameter.setMax(aM.s());
    controllerParameter.setMin(aM.r());
    controllerParameter.setOptionDescriptions(aM.y());
    controllerParameter.setParamClass(aM.i());
    try {
      if (aM.i().equals("bits")) {
        controllerParameter.setStringValue(aM.f(r.p()));
      } else if (aM.i().equals("scalar")) {
        controllerParameter.setScalarValue(aM.j(r.p()));
      } else if (aM.i().equals("array")) {
        controllerParameter.setArrayValues(aM.i(r.p()));
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      throw new ControllerException(ExceptionPrintstacktrace.getMessage());
    } 
    return controllerParameter;
  }
  
  public void updateParameter(String paramString1, String paramString2, double paramDouble) {
    try {
      R r = T.a().c(paramString1);
      aM aM = r.c(paramString2);
      aM.a(r.p(), paramDouble);
    } catch (Exception exception) {
      throw new ControllerException(exception.getMessage());
    } 
  }
  
  public void updateParameter(String paramString1, String paramString2, double[][] paramArrayOfdouble) {
    try {
      R r = T.a().c(paramString1);
      aM aM = r.c(paramString2);
      aM.a(r.p(), paramArrayOfdouble);
    } catch (Exception exception) {
      throw new ControllerException(exception.getMessage());
    } 
  }
  
  public void updateParameter(String paramString1, String paramString2, String paramString3) {
    try {
      R r = T.a().c(paramString1);
      aM aM = r.c(paramString2);
      aM.a(r.p(), paramString3);
    } catch (Exception exception) {
      throw new ControllerException(exception.getMessage());
    } 
  }
  
  public void burnData(String paramString) {
    R r = T.a().c(paramString);
    if (r == null)
      throw new ControllerException("No Controller found by name of: " + paramString); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */