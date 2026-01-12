package aP;

import bA.JCheckBoxMenuItemExtension;
import s.SComponentGolf;
import s.SInterfaceFoxtrot;

class JCheckBoxMenuItemExtensionExtension extends JCheckBoxMenuItemExtension
    implements SInterfaceFoxtrot {
  String a = null;

  public JCheckBoxMenuItemExtensionExtension(
      dB paramdB, String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    super(SComponentGolf.b(paramString), paramBoolean1, paramBoolean2);
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

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
