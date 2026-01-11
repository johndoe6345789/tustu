package business.base_adapters.bA_components;

import c.CInterfaceEcho;
import com.efiAnalytics.ui.bs;
import com.efiAnalytics.ui.eA;
import javax.swing.JCheckBoxMenuItem;

public class JCheckBoxMenuItemExtension extends JCheckBoxMenuItem implements bs {
  private boolean a = true;
  
  private CInterfaceEcho b = null;
  
  private CInterfaceEcho c = null;
  
  private eA d = null;
  
  public JCheckBoxMenuItemExtension() {}
  
  public JCheckBoxMenuItemExtension(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramString, paramBoolean2);
    a(paramBoolean1);
  }
  
  public void a(boolean paramBoolean) {
    this.a = paramBoolean;
  }
  
  public CInterfaceEcho CInterfaceEcho() {
    return this.b;
  }
  
  public void a(CInterfaceEcho parame) {
    this.b = parame;
  }
  
  public eA b() {
    return this.d;
  }
  
  public void a(eA parameA) {
    this.d = parameA;
  }
  
  public CInterfaceEcho i() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bA/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */