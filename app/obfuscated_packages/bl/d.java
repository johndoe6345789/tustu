package bl;

import G.aN;
import com.efiAnalytics.plugin.ecu.ControllerParameterChangeListener;

class d implements aN {
  private ControllerParameterChangeListener b = null;
  
  d(c paramc, ControllerParameterChangeListener paramControllerParameterChangeListener) {
    a(paramControllerParameterChangeListener);
  }
  
  public void a(String paramString1, String paramString2) {
    a().parameterValueChanged(paramString2);
  }
  
  public ControllerParameterChangeListener a() {
    return this.b;
  }
  
  public void a(ControllerParameterChangeListener paramControllerParameterChangeListener) {
    this.b = paramControllerParameterChangeListener;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */