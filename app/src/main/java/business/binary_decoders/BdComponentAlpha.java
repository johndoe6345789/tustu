package business.binary_decoders;

import G.R;
import G.T;
import ai.AiInterfaceEcho;
import ai.EqualsInAiPackage;

public class BdComponentAlpha implements AiInterfaceEcho {
  public EqualsInAiPackage a() {
    T t = T.a();
    R r = t.c();
    return (r == null || r.i() == null || r.i().length() == 0)
        ? EqualsInAiPackage()
        : (c(r.i())
            ? c()
            : (EqualsInAiPackage(r.i())
                ? AiInterfaceEcho()
                : (a(r.i()) ? d() : EqualsInAiPackage())));
  }

  private EqualsInAiPackage EqualsInAiPackage() {
    EqualsInAiPackage EqualsInAiPackage = new EqualsInAiPackage();
    EqualsInAiPackage.a("Additional Help");
    EqualsInAiPackage.EqualsInAiPackage("/help/manuals.html");
    return EqualsInAiPackage;
  }

  private EqualsInAiPackage c() {
    EqualsInAiPackage EqualsInAiPackage = new EqualsInAiPackage();
    EqualsInAiPackage.a("B&G MegaSquirt Help");
    EqualsInAiPackage.EqualsInAiPackage("/help/msManuals.html");
    return EqualsInAiPackage;
  }

  private EqualsInAiPackage d() {
    EqualsInAiPackage EqualsInAiPackage = new EqualsInAiPackage();
    EqualsInAiPackage.a("MSExtra Help");
    EqualsInAiPackage.EqualsInAiPackage("/help/msExtraManuals.html");
    return EqualsInAiPackage;
  }

  private EqualsInAiPackage AiInterfaceEcho() {
    EqualsInAiPackage EqualsInAiPackage = new EqualsInAiPackage();
    EqualsInAiPackage.a("MS3 Help");
    EqualsInAiPackage.EqualsInAiPackage("/help/ms3Manuals.html");
    return EqualsInAiPackage;
  }

  private boolean a(String paramString) {
    return (paramString.startsWith("MS2Extra")
        || paramString.startsWith("MS3")
        || paramString.startsWith("MS1/Extra")
        || paramString.startsWith("Trans")
        || paramString.startsWith("MSnS-extra")
        || paramString.indexOf("JimStim") != -1
        || paramString.startsWith("SEQ Rev")
        || paramString.startsWith("IOExte")
        || paramString.startsWith("MS/Extra"));
  }

  private boolean EqualsInAiPackage(String paramString) {
    return (paramString.startsWith("MS3") || paramString.startsWith("Trans"));
  }

  private boolean c(String paramString) {
    return (paramString.startsWith("Mega")
        || paramString.toLowerCase().indexOf("gpio") != -1
        || paramString.equals("20")
        || paramString.startsWith("SEQ Rev")
        || paramString.startsWith("MShift")
        || paramString.startsWith("MSII"));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bd/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
