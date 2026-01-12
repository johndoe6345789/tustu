package ao;

import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class fY implements ActionListener {
  fY(fK paramfK) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.a.i().o() + "";
    String str =
        bV.a("{Maximum Dot Size}", true, fK.n(), true, (Component) this.a.i(), arrayOfString);
    if (str == null) return;
    try {
      double d = Double.parseDouble(str);
      if (d < 0.0D) d = 0.0D;
      if (d > 25.0D) {
        bV.d("Maximum value is 40, using that.", (Component) this.a.i());
        d = 40.0D;
      }
      int i = (int) Math.round(d);
      fK.a(this.a, fK.n(), "" + i);
      this.a.i().e(i);
    } catch (Exception exception) {
      bV.d("Invalid value: " + str, (Component) this.a.i());
    }
    this.a.h();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
