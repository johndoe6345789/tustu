package ao;

import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class fZ implements ActionListener {
  fZ(fK paramfK) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.a.i().q() + "";
    String str = bV.a("{Number of Y Sections}", true, fK.o(), true, (Component)this.a.i(), arrayOfString);
    if (str == null)
      return; 
    try {
      double d = Double.parseDouble(str);
      if (d < 1.0D)
        d = 1.0D; 
      if (d > fK.p()) {
        bV.d("Maximum value is " + fK.p() + ", using that.", (Component)this.a.i());
        d = fK.p();
      } 
      int i = (int)Math.round(d);
      fK.a(this.a, fK.o(), "" + i);
      this.a.i().g(i);
    } catch (Exception exception) {
      bV.d("Invalid value: " + str, (Component)this.a.i());
    } 
    this.a.h();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */