package aP;

import bA.JMenuItemExtensionInBaPackage;
import s.SInterfaceFoxtrot;
import s.SComponentGolf;

class JMenuItemExtensionInBaPackageExtension extends JMenuItemExtensionInBaPackage implements SInterfaceFoxtrot {
  String a = null;
  
  public JMenuItemExtensionInBaPackageExtension(dB paramdB, String paramString, boolean paramBoolean) {
    setText(SComponentGolf.b(paramString));
    a(paramBoolean);
    this.a = paramString;
    addMouseListener(new gU(paramdB, this));
  }
  
  public void a(String paramString) {
    setText(paramString);
    SComponentGolf.b(this.a, paramString);
  }
  
  public String a() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */