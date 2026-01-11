package aP;

import s.SInterfaceFoxtrot;
import s.SComponentGolf;
import x.JMenuExtensionSetpopupmenuvisible;

public class JMenuExtensionSetpopupmenuvisibleExtensionInApPackage extends JMenuExtensionSetpopupmenuvisible implements SInterfaceFoxtrot {
  String c = null;
  
  public JMenuExtensionSetpopupmenuvisibleExtensionInApPackage(dB paramdB, String paramString, boolean paramBoolean) {
    this.c = paramString;
    setText(SComponentGolf.b(paramString));
    JMenuExtensionSetpopupmenuvisible(paramBoolean);
    addMouseListener(new gU(paramdB, this));
  }
  
  public JMenuExtensionSetpopupmenuvisibleExtensionInApPackage(dB paramdB, String paramString) {
    this(paramdB, paramString, true);
  }
  
  public void JMenuExtensionSetpopupmenuvisible(String paramString) {
    setText(paramString);
    SComponentGolf.b(this.c, paramString);
  }
  
  public String JMenuExtensionSetpopupmenuvisible() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */