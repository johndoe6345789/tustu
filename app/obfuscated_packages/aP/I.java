package aP;

import aE.a;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import java.awt.Dialog;
import java.awt.Rectangle;
import java.util.Properties;
import r.a;

class I implements bc {
  Dialog a = null;
  
  String b = "";
  
  I(f paramf, Dialog paramDialog, String paramString) {
    this.a = paramDialog;
    this.b = paramString;
  }
  
  public void close() {
    Properties properties;
    String str = this.b + this.a.getTitle();
    Rectangle rectangle = this.a.getBounds();
    a a = a.A();
    if (a == null)
      properties = a.a().d(); 
    properties.setProperty(str + "_X", eJ.b(rectangle.x) + "");
    properties.setProperty(str + "_Y", eJ.b(rectangle.y) + "");
    properties.setProperty(str + "_width", eJ.b(rectangle.width) + "");
    properties.setProperty(str + "_height", eJ.b(rectangle.height) + "");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */