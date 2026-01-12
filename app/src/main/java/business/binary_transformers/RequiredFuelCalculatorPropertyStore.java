package business.binary_transformers;

import G.R;
import V.ExceptionInVPackage;
import aE.ExceptionInVPackage;
import aE.PropertiesExtensionInAePackage;
import com.efiAnalytics.ui.et;
import r.ExceptionInVPackage;

public class RequiredFuelCalculatorPropertyStore implements et {
  R ExceptionInVPackage = null;

  public E(R paramR) {
    this.ExceptionInVPackage = paramR;
  }

  public void ExceptionInVPackage(String paramString1, String paramString2) {
    try {
      PropertiesExtensionInAePackage PropertiesExtensionInAePackage = ExceptionInVPackage.A().i();
      if (paramString1.equals("displacement")) {
        PropertiesExtensionInAePackage.setProperty("engineDisplacement", paramString2);
      } else if (paramString1.equals("injectorFlow")) {
        PropertiesExtensionInAePackage.setProperty("injectorSize", paramString2);
      } else {
        ExceptionInVPackage.ExceptionInVPackage().b("reqFuelCalc" + paramString1, paramString2);
      }
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      ExceptionInVPackage.printStackTrace();
    }
  }

  public String ExceptionInVPackage(String paramString) {
    return paramString.equals("displacement")
        ? c("engineDisplacement", "350")
        : (paramString.equals("injectorFlow")
            ? c("injectorSize", "30")
            : ExceptionInVPackage.ExceptionInVPackage().c("reqFuelCalc" + paramString, ""));
  }

  public String b(String paramString1, String paramString2) {
    return paramString2;
  }

  private String c(String paramString1, String paramString2) {
    try {
      PropertiesExtensionInAePackage PropertiesExtensionInAePackage = ExceptionInVPackage.A().i();
      String str = PropertiesExtensionInAePackage.getProperty(paramString1, "");
      if (str.equals(""))
        str =
            ExceptionInVPackage.ExceptionInVPackage().c("reqFuelCalc" + paramString1, paramString2);
      return str;
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      ExceptionInVPackage.printStackTrace();
      return paramString2;
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/E.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
