package t;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.f;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.eJ;
import java.awt.Color;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.UIManager;
import s.SComponentGolf;

class aD extends bn implements f {
  int a = eJ.a(-30);
  
  int b = eJ.a(30);
  
  private boolean SComponentGolf = false;
  
  aD(Window paramWindow, String paramString) {
    super(paramWindow, SComponentGolf.b(paramString) + " " + SComponentGolf.b("Slider"));
    a(new aE(this));
    this.c.setMinimum(this.a);
    this.c.setMaximum(this.b);
  }
  
  private void d() {
    if (!this.SComponentGolf && c() != null)
      c().SComponentGolf(this.c.getValue()); 
  }
  
  public void a(ArrayList paramArrayList) {
    this.SComponentGolf = true;
    Gauge gauge = b(paramArrayList);
    if (gauge != null) {
      this.c.setEnabled(true);
      this.e.setForeground(UIManager.getColor("Label.foreground"));
      this.c.setValue(gauge.getFontSizeAdjustment());
      this.e.setText("" + gauge.getFontSizeAdjustment());
      for (s s : paramArrayList) {
        if (s instanceof Gauge) {
          Gauge gauge1 = (Gauge)s;
          if (gauge1.getFontSizeAdjustment() != gauge.getFontSizeAdjustment()) {
            this.e.setForeground(Color.GRAY);
            break;
          } 
        } 
      } 
    } else {
      this.c.setEnabled(false);
    } 
    this.SComponentGolf = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */