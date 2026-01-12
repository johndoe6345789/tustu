package ao;

import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class fX implements ActionListener {
  fX(fK paramfK) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.a.i().n() + "";
    String str =
        bV.a("{Minimum Dot Size}", true, fK.m(), true, (Component) this.a.i(), arrayOfString);
    if (str == null) return;
    try {
      double d = Double.parseDouble(str);
      if (d < 0.0D) d = 0.0D;
      if (d > 35.0D) {
        bV.d("Maximum value is 25, using that.", (Component) this.a.i());
        d = 35.0D;
      }
      int i = (int) Math.round(d);
      fK.a(this.a, fK.m(), "" + i);
      this.a.i().d(i);
    } catch (Exception exception) {
      bV.d("Invalid value: " + str, (Component) this.a.i());
    }
    this.a.h();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
