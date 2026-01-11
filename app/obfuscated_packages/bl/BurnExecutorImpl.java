package bl;

import G.R;
import G.T;
import com.efiAnalytics.plugin.ecu.ControllerException;
import com.efiAnalytics.plugin.ecu.servers.BurnExecutor;

public class BurnExecutorImpl implements BurnExecutor {
  public void burnData(String paramString) {
    R r = T.a().c(paramString);
    if (r == null)
      throw new ControllerException("Burn Failed, Configuration name is not valid. Has it been unloaded?"); 
    r.I();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */