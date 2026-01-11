package bt;

import G.R;
import V.a;
import aE.a;
import aE.g;
import com.efiAnalytics.ui.et;
import r.a;

public class RequiredFuelCalculatorPropertyStore implements et {
  R a = null;
  
  public E(R paramR) {
    this.a = paramR;
  }
  
  public void a(String paramString1, String paramString2) {
    try {
      g g = a.A().i();
      if (paramString1.equals("displacement")) {
        g.setProperty("engineDisplacement", paramString2);
      } else if (paramString1.equals("injectorFlow")) {
        g.setProperty("injectorSize", paramString2);
      } else {
        a.a().b("reqFuelCalc" + paramString1, paramString2);
      } 
    } catch (a a) {
      a.printStackTrace();
    } 
  }
  
  public String a(String paramString) {
    return paramString.equals("displacement") ? c("engineDisplacement", "350") : (paramString.equals("injectorFlow") ? c("injectorSize", "30") : a.a().c("reqFuelCalc" + paramString, ""));
  }
  
  public String b(String paramString1, String paramString2) {
    return paramString2;
  }
  
  private String c(String paramString1, String paramString2) {
    try {
      g g = a.A().i();
      String str = g.getProperty(paramString1, "");
      if (str.equals(""))
        str = a.a().c("reqFuelCalc" + paramString1, paramString2); 
      return str;
    } catch (a a) {
      a.printStackTrace();
      return paramString2;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/E.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */