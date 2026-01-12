package aP;

import s.SComponentGolf;
import s.SInterfaceFoxtrot;
import x.JMenuExtensionSetpopupmenuvisible;

class JMenuExtensionSetpopupmenuvisibleExtension extends JMenuExtensionSetpopupmenuvisible
    implements SInterfaceFoxtrot {
  String c = null;

  public JMenuExtensionSetpopupmenuvisibleExtension(
      dB paramdB, String paramString, boolean paramBoolean) {
    super(paramString, paramBoolean);
    this.c = paramString;
    setText(SComponentGolf.b(paramString));
    addMouseListener(new gU(paramdB, this));
  }

  public boolean b() {
    return false;
  }

  public void JMenuExtensionSetpopupmenuvisible(String paramString) {
    setText(paramString);
    SComponentGolf.b(this.c, paramString);
  }

  public String JMenuExtensionSetpopupmenuvisible() {
    return this.c;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
