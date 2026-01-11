package ao;

import bA.JMenuItemExtensionInBaPackage;
import com.efiAnalytics.ui.bp;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JMenuItem;

class ej extends bp {
  ej(cd paramcd) {
    super("Recent Viewed Log Files");
  }
  
  public void setPopupMenuVisible(boolean paramBoolean) {
    if (paramBoolean) {
      a();
    } else {
      removeAll();
    } 
    super.setPopupMenuVisible(paramBoolean);
  }
  
  private void a() {
    ArrayList arrayList = this.a.u.a();
    if (arrayList.size() > 0)
      for (String str1 : arrayList) {
        String str2 = str1.substring(str1.lastIndexOf(File.separator) + 1);
        JMenuItemExtensionInBaPackage JMenuItemExtensionInBaPackage = new JMenuItemExtensionInBaPackage();
        JMenuItemExtensionInBaPackage.setText(str2);
        JMenuItemExtensionInBaPackage.setActionCommand(str1);
        JMenuItemExtensionInBaPackage.addActionListener(new ek(this));
        add((JMenuItem)JMenuItemExtensionInBaPackage);
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ej.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */