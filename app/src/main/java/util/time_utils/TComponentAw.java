package t;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.f;
import com.efiAnalytics.apps.ts.dashboard.s;
import java.awt.Color;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.UIManager;
import s.SComponentGolf;

class TComponentAw extends bn implements f {
  int a = 0;

  int b = 6;

  private boolean SComponentGolf = false;

  TComponentAw(Window paramWindow, String paramString) {
    super(paramWindow, SComponentGolf.b(paramString) + " " + SComponentGolf.b("Slider"));
    a(new ax(this));
    this.c.setMinimum(this.a);
    this.c.setMaximum(this.b);
  }

  private void d() {
    if (!this.SComponentGolf && c() != null) c().l(this.c.getValue());
  }

  public void a(ArrayList paramArrayList) {
    this.SComponentGolf = true;
    Gauge gauge = b(paramArrayList);
    if (gauge != null) {
      this.c.setEnabled(true);
      this.e.setForeground(UIManager.getColor("Label.foreground"));
      this.c.setValue(gauge.valueDigits());
      this.e.setText("" + gauge.valueDigits());
      for (s s : paramArrayList) {
        if (s instanceof Gauge) {
          Gauge gauge1 = (Gauge) s;
          if (gauge1.valueDigits() != gauge.valueDigits()) {
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

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
