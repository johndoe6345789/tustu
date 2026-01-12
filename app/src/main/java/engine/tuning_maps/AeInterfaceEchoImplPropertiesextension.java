package aP;

import B.BInterfaceBravo;
import B.BInterfaceGolf;
import BrComponentRomeo.j;
import G.R;
import G.T;
import G.h;
import aE.AeInterfaceEcho;
import aE.PropertiesExtension;
import br.BrComponentRomeo;
import com.efiAnalytics.tuningwidgets.panels.W;
import java.io.File;

class AeInterfaceEchoImplPropertiesextension implements AeInterfaceEcho {
  AeInterfaceEchoImplPropertiesextension(hO paramhO) {}

  public void PropertiesExtension(PropertiesExtension parama, R paramR) {}

  public void e_() {
    BrComponentRomeo.PropertiesExtension().BInterfaceBravo();
    h.PropertiesExtension().BInterfaceBravo();
    BInterfaceGolf.PropertiesExtension().f();
    BInterfaceBravo.c().PropertiesExtension(null);
    W.PropertiesExtension();
  }

  public void PropertiesExtension(PropertiesExtension parama) {
    R BrComponentRomeo = T.PropertiesExtension().c();
    if (BrComponentRomeo != null
        && BInterfaceBravo.c().d() != null
        && BInterfaceBravo.c().d().AeInterfaceEcho() != null
        && !BInterfaceBravo.c().d().AeInterfaceEcho().isEmpty())
      j.PropertiesExtension(new File(parama.t()), BInterfaceBravo.c().d());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
