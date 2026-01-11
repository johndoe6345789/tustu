package bt;

import aE.PropertiesExtension;
import com.efiAnalytics.ui.BinTableView;
import com.efiAnalytics.ui.et;

class BtInterfaceBa implements et {
  bA(bu parambu) {}
  
  public void PropertiesExtension(String paramString1, String paramString2) {
    PropertiesExtension PropertiesExtension = PropertiesExtension.A();
    PropertiesExtension.setProperty("2DTable_" + this.PropertiesExtension.getName() + "_" + paramString1, paramString2);
  }
  
  public String PropertiesExtension(String paramString) {
    String str = "";
    return paramString.equals(BinTableView.n) ? PropertiesExtension.A().t() : b(paramString, str);
  }
  
  public String b(String paramString1, String paramString2) {
    PropertiesExtension PropertiesExtension = PropertiesExtension.A();
    return PropertiesExtension.getProperty("2DTable_" + this.PropertiesExtension.getName() + "_" + paramString1, paramString2);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */