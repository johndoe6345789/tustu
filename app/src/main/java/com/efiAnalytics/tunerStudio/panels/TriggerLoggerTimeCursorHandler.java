package com.efiAnalytics.tunerStudio.panels;

import com.efiAnalytics.ui.aY;
import java.awt.Rectangle;
import java.util.StringTokenizer;

class TriggerLoggerTimeCursorHandler implements aY {
  TriggerLoggerTimeCursorHandler(TriggerLoggerPanel paramTriggerLoggerPanel) {}

  public void a(double paramDouble1, double paramDouble2) {
    String str1 = this.a.b.getText();
    byte b = 0;
    String str2 = "";
    StringTokenizer stringTokenizer = new StringTokenizer(str1, "\n");
    while (stringTokenizer.hasMoreTokens()) {
      String str = str2;
      str2 = stringTokenizer.nextToken();
      if (str2.contains("\t")) {
        String str3 = str2.substring(str2.lastIndexOf("\t")).trim();
        try {
          double d = Double.parseDouble(str3);
          if (d > paramDouble1) {
            int i = str1.indexOf(str);
            str3 = str.substring(str.lastIndexOf("\t")).trim();
            int j = str1.indexOf("\n", str1.indexOf(str3, i));
            this.a.b.requestFocus();
            this.a.b.select(i, j);
            if (this.a.Z) {
              this.a.d.getSelectionModel().setSelectionInterval(b - 1, b - 1);
              Rectangle rectangle = this.a.Y.getBounds();
              rectangle.y += this.a.d.getHeight() * (b - 10) / this.a.c.getRowCount();
              this.a.d.scrollRectToVisible(rectangle);
            }
            break;
          }
          b++;
        } catch (NumberFormatException numberFormatException) {
        }
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
