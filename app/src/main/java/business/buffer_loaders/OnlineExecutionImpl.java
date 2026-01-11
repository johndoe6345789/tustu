package business.buffer_loaders;

import G.R;
import G.T;
import G.l;
import bH.D;
import com.efiAnalytics.plugin.ecu.servers.OnlineExecution;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OnlineExecutionImpl implements OnlineExecution {
  public void goOffline() {
    R r = T.a().c();
    if (r != null) {
      r.C().c();
    } else {
      D.b("Plugin Request to go offline, but no ECU Configuration loaded.");
    } 
  }
  
  public void goOnline() {
    R r = T.a().c();
    if (r != null) {
      try {
        r.C().d();
      } catch (l l) {
        Logger.getLogger(p.class.getName()).log(Level.WARNING, "Error trying to go online", (Throwable)l);
      } 
    } else {
      D.b("Plugin Request to go online, but no ECU Configuration loaded.");
    } 
  }
  
  public boolean isOnline() {
    R r = T.a().c();
    return (r != null) ? r.R() : false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */