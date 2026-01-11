package n;

import G.R;
import G.ArrayListExceptionprintstacktraceInGPackage;
import com.efiAnalytics.ui.bV;
import java.awt.Window;

public class NInterfaceHotel {
  private static h a = null;
  
  private l b = null;
  
  public static h a() {
    if (a == null)
      a = new h(); 
    return a;
  }
  
  public void a(R paramR, ArrayListExceptionprintstacktraceInGPackage parambv, Window paramWindow) {
    if (this.b != null) {
      this.b.a(paramR, parambv, paramWindow);
    } else {
      bV.d("ShowEcuDialogActionProvider must be set in EventActions", paramWindow);
    } 
  }
  
  public void a(l paraml) {
    this.b = paraml;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/n/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */