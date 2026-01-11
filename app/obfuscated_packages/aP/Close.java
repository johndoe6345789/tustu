package aP;

import aE.PropertiesExtension;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import java.awt.Dialog;
import java.awt.Rectangle;
import java.util.Properties;
import r.PropertiesExtension;

class Close implements bc {
  Dialog PropertiesExtension = null;
  
  String b = "";
  
  I(f paramf, Dialog paramDialog, String paramString) {
    this.PropertiesExtension = paramDialog;
    this.b = paramString;
  }
  
  public void close() {
    Properties properties;
    String str = this.b + this.PropertiesExtension.getTitle();
    Rectangle rectangle = this.PropertiesExtension.getBounds();
    PropertiesExtension PropertiesExtension = PropertiesExtension.A();
    if (PropertiesExtension == null)
      properties = PropertiesExtension.PropertiesExtension().d(); 
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