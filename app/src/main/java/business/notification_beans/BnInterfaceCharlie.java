package business.notification_beans;

import G.EqualsInGPackage;
import G.ExceptionprintstacktraceInGPackage;
import G.R;
import V.ExceptionPrintstacktrace;
import aE.PropertiesExtension;
import bH.D;
import bH.X;
import bo.JPanelExtensionInBoPackage;
import bt.ManagerBfcomponentcharlie;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.s;
import java.util.HashMap;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import s.ExceptionPrintstacktrace;

public class BnInterfaceCharlie {
  public static String PropertiesExtension = "veTableGenerator";

  public static String JPanelExtensionInBoPackage = "afrTableGenerator";

  public static String c = "Two Point Calculator";

  public static String d = "Calculator";

  private static c f = null;

  HashMap e = new HashMap<>();

  public static c PropertiesExtension() {
    if (f == null) f = new c();
    return f;
  }

  public PropertiesExtension PropertiesExtension(R paramR, EqualsInGPackage parambI) {
    String str = X.JPanelExtensionInBoPackage(parambI.aL(), " ", "");
    if (this.e.get(str) != null) return (PropertiesExtension) this.e.get(str);
    if (str.equals(PropertiesExtension))
      try {
        s s =
            ManagerBfcomponentcharlie.PropertiesExtension()
                .PropertiesExtension(paramR, parambI.PropertiesExtension(), "", "");
        String str1 = ExceptionprintstacktraceInGPackage.c(paramR, parambI.PropertiesExtension());
        str1 = ExceptionPrintstacktrace.JPanelExtensionInBoPackage(str1);
        return (PropertiesExtension)
            new JPanelExtensionInBoPackage(
                str1,
                paramR,
                parambI.PropertiesExtension(),
                s,
                (et) new dQ((Properties) PropertiesExtension.A(), "veGenerator"),
                JPanelExtensionInBoPackage.p);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(c.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
        throw new e("Unable to create VE Table Generator for " + parambI.PropertiesExtension());
      } catch (Exception exception) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String) null, exception);
        throw new e("Unable to create VE Table Generator for " + parambI.PropertiesExtension());
      }
    if (str.equals(JPanelExtensionInBoPackage))
      try {
        s s =
            ManagerBfcomponentcharlie.PropertiesExtension()
                .PropertiesExtension(paramR, parambI.PropertiesExtension(), "", "");
        String str1 = ExceptionprintstacktraceInGPackage.c(paramR, parambI.PropertiesExtension());
        str1 = ExceptionPrintstacktrace.JPanelExtensionInBoPackage(str1);
        if (paramR.d("NARROW_BAND_EGO") != null)
          D.PropertiesExtension(
              "Narrow band AFR target generation is are not currently supported - Use at own risk",
              null,
              null);
        boolean bool = (paramR.d("LAMBDA") != null) ? true : false;
        return (PropertiesExtension)
            new JPanelExtensionInBoPackage(
                str1,
                paramR,
                parambI.PropertiesExtension(),
                s,
                (et) new dQ((Properties) PropertiesExtension.A(), "veGenerator"),
                bool ? JPanelExtensionInBoPackage.r : JPanelExtensionInBoPackage.q);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(c.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
        throw new e("Unable to create AFR Table Generator for " + parambI.PropertiesExtension());
      } catch (Exception exception) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String) null, exception);
        throw new e("Unable to create AFR Table Generator for " + parambI.PropertiesExtension());
      }
    throw new e("Unknown Tool:" + str);
  }

  public void PropertiesExtension(String paramString, PropertiesExtension parama) {
    this.e.put(X.JPanelExtensionInBoPackage(paramString, " ", ""), parama);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bn/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
