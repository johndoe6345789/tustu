package business.base_adapters.bA_components;

import com.efiAnalytics.ui.bs;
import javax.swing.JMenuItem;

public class JMenuItemExtensionInBaPackage extends JMenuItem implements bs {
  private boolean a = true;
  
  private c.e b = null;
  
  private c.e c = null;
  
  public JMenuItemExtensionInBaPackage() {}
  
  public JMenuItemExtensionInBaPackage(String paramString, boolean paramBoolean) {
    super(paramString);
    a(paramBoolean);
  }
  
  public void a(boolean paramBoolean) {
    this.a = paramBoolean;
  }
  
  public c.e e() {
    return this.b;
  }
  
  public void a(c.e parame) {
    this.b = parame;
  }
  
  public c.e i() {
    return this.c;
  }
  
  public void b(c.e parame) {
    this.c = parame;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bA/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */