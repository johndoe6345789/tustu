package rendering.output_handlers;

import G.AeInterfaceMikeTostring;
import G.GInterfaceCx;
import G.T;

public class OInterfaceHotel implements GInterfaceCx {
  public boolean a(AeInterfaceMikeTostring parambT) {
    if (parambT != null) {
      String str = parambT.b();
      if (str.equals("\024") || str.equals("\n")) return true;
      if (str.equals("20") || str.equals("10")) return true;
      if (str.startsWith("MSII")
          || str.startsWith("MS2Extra")
          || str.startsWith("MS4PPC Rev")
          || str.startsWith("MSPNP Gen")
          || str.startsWith("P&H Lite V")
          || str.startsWith("MS3")
          || str.startsWith("MS Ext")
          || str.startsWith("MS1/Extra")
          || str.startsWith("Trans")
          || str.startsWith("Picosquirt")
          || str.startsWith("MSnS-extra")
          || str.startsWith("JSMgauge")
          || str.startsWith("Mega")
          || str.toLowerCase().indexOf("gpio") != -1
          || str.indexOf("JimStim") != -1
          || str.startsWith("SEQ Rev")
          || str.startsWith("LCT Rev")
          || str.toLowerCase().startsWith("speeduino")
          || str.startsWith("MShift")
          || str.startsWith("IOExte")
          || str.startsWith("BT Tester")
          || str.startsWith("PWB")
          || str.startsWith("rusEFI ")
          || str.startsWith("impact ")
          || str.startsWith("MSLabs")
          || str.startsWith("DBWX2")
          || str.startsWith("MS/Extra")
          || str.startsWith("AMP")
          || str.startsWith("DD-EFI Pro")
          || str.startsWith("CoreEFI_V")) return (T.a().c() == null) ? true : T.a().c().C().H();
    }
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/O/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
