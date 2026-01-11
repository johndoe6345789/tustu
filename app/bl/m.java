package bl;

import G.T;
import com.efiAnalytics.plugin.ecu.servers.EcuConfigurationNameServer;

final class m implements EcuConfigurationNameServer {
  public String[] getAllConfigurationNames() {
    return T.a().d();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */