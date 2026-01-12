package business.buffer_loaders;

import G.R;
import G.T;
import com.efiAnalytics.plugin.ecu.ControllerException;
import com.efiAnalytics.plugin.ecu.servers.UiSettingServer;
import com.efiAnalytics.plugin.ecu.servers.UiSettingServerProvider;
import java.util.HashMap;
import java.util.Map;

public class UiSettingServerProviderImpl implements UiSettingServerProvider {
  private static r b = null;

  Map a = new HashMap<>();

  public static r a() {
    if (b == null) b = new r();
    return b;
  }

  public UiSettingServer getUiComponentServer(String paramString) {
    R r1 = T.a().c(paramString);
    if (r1 == null)
      throw new ControllerException("Configuration not found for name: " + paramString);
    e e = (e) this.a.get(paramString);
    if (e == null) {
      e = new e(r1);
      this.a.put(paramString, e);
    }
    return e;
  }

  public void b() {
    this.a.clear();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
