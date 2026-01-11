package aN;

import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JTextField;

class ListenerInAnPackage implements ActionListener {
  JTextField a;
  
  d(a parama, JTextField paramJTextField) {
    this.a = paramJTextField;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String[] arrayOfString = null;
    String str1 = a.a(this.b, "lastDir", null);
    String str2 = bV.b(this.a, "Load File for Difference", arrayOfString, null, str1);
    if (str2 != null && str2.length() > 2) {
      this.a.setText(str2);
      File file = (new File(str2)).getParentFile();
      a.b(this.b, "lastDir", file.getAbsolutePath());
    } 
    a.c(this.b);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aN/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */