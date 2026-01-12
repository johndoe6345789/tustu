package ao;

import W.n;
import i.IComponentDelta;
import java.io.File;
import javax.swing.JToggleButton;

class an implements IComponentDelta {
  an(aj paramaj) {}

  public void a(String paramString1, String paramString2) {
    File file = new File(paramString2);
    n n = (n) aj.e(this.a).remove(paramString1);
    n.a(file);
    aj.e(this.a).put(paramString2, n);
    JToggleButton jToggleButton = (JToggleButton) aj.f(this.a).remove(paramString1);
    aj.f(this.a).put(paramString2, jToggleButton);
    jToggleButton.setActionCommand(paramString2);
    jToggleButton.setText(file.getName());
    this.a.doLayout();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
