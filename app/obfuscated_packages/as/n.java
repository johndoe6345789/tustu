package as;

import com.efiAnalytics.ui.bV;
import h.h;
import h.i;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class n implements ActionListener {
  n(j paramj) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str1 = i.e("lastFileDir", h.d());
    String str2 = i.f(i.as, str1);
    String str3 = bV.a(str2, this.a.b);
    if (str3 != null && !str3.isEmpty()) {
      File file = new File(str3);
      if (!file.exists() || !file.isDirectory()) {
        bV.d(file.getAbsolutePath() + "\n" + j.a(this.a, "is not a valid Directory."), this.a.a);
      } else if (!h.a(str3)) {
        bV.d(j.a(this.a, "Do not have write access to directory") + "\n" + file.getAbsolutePath(), this.a.a);
      } else {
        this.a.a.setText(str3);
        i.f(i.as, str3);
      } 
    } else {
      bV.d(j.a(this.a, "A valid Directory is required if downloading to a specific directory."), this.a.a);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/as/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */