package bt;

import aE.a;
import com.efiAnalytics.ui.BinTableView;
import com.efiAnalytics.ui.et;

class bA implements et {
  bA(bu parambu) {}
  
  public void a(String paramString1, String paramString2) {
    a a = a.A();
    a.setProperty("2DTable_" + this.a.getName() + "_" + paramString1, paramString2);
  }
  
  public String a(String paramString) {
    String str = "";
    return paramString.equals(BinTableView.n) ? a.A().t() : b(paramString, str);
  }
  
  public String b(String paramString1, String paramString2) {
    a a = a.A();
    return a.getProperty("2DTable_" + this.a.getName() + "_" + paramString1, paramString2);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */