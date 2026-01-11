package t;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.f;
import com.efiAnalytics.apps.ts.dashboard.s;
import java.awt.Color;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.UIManager;
import s.SComponentGolf;

class BorderWidthSliderDialog extends bn implements f {
  private boolean a = false;
  
  BorderWidthSliderDialog(Window paramWindow, String paramString) {
    super(paramWindow, SComponentGolf.b(paramString) + " " + SComponentGolf.b("Slider"));
    a(new c(this));
    this.c.setMinimum(0);
    this.c.setMaximum(100);
  }
  
  private void d() {
    if (!this.a && c() != null)
      c().f(this.c.getValue()); 
  }
  
  public void a(ArrayList paramArrayList) {
    this.a = true;
    Gauge gauge = b(paramArrayList);
    if (gauge != null) {
      this.c.setEnabled(true);
      this.e.setForeground(UIManager.getColor("Label.foreground"));
      this.c.setValue(gauge.getBorderWidth());
      this.e.setText("" + gauge.getBorderWidth());
      for (s s : paramArrayList) {
        if (s instanceof Gauge) {
          Gauge gauge1 = (Gauge)s;
          if (gauge1.getBorderWidth() != gauge.getBorderWidth()) {
            this.e.setForeground(Color.GRAY);
            break;
          } 
        } 
      } 
    } else {
      this.c.setEnabled(false);
    } 
    this.a = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */