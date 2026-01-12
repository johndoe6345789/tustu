package aP;

import bA.JMenuItemExtensionInBaPackage;
import bq.BqInterfaceAlpha;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import r.RComponentNovember;
import s.SComponentGolf;

class BqInterfaceAlphaExtensionSetpopupmenuvisible extends BqInterfaceAlpha {
  gO(dB paramdB) {
    super(SComponentGolf.b("Recent Vehicle Projects"));
  }

  public void setPopupMenuVisible(boolean paramBoolean) {
    if (paramBoolean) {
      j();
    } else {
      removeAll();
    }
    super.setPopupMenuVisible(paramBoolean);
  }

  private void j() {
    ArrayList arrayList = (new RComponentNovember()).BqInterfaceAlpha();
    if (arrayList.size() > 0)
      for (String str1 : arrayList) {
        String str2 = str1.substring(str1.lastIndexOf(File.separator) + 1);
        JMenuItemExtensionInBaPackage JMenuItemExtensionInBaPackage =
            new JMenuItemExtensionInBaPackage();
        JMenuItemExtensionInBaPackage.setText(str2);
        JMenuItemExtensionInBaPackage.setActionCommand(str1);
        JMenuItemExtensionInBaPackage.addActionListener(new gP(this));
        add((JMenuItem) JMenuItemExtensionInBaPackage);
      }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
