package aP;

import bH.X;
import com.efiAnalytics.ui.aN;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

class MouseAdapterExtensionMouseentered extends MouseAdapter {
  Component a = null;

  public MouseAdapterExtensionMouseentered(ir paramir, Component paramComponent) {
    this.a = paramComponent;
  }

  public void mouseEntered(MouseEvent paramMouseEvent) {
    this.a.setCursor(Cursor.getPredefinedCursor(12));
  }

  public void mouseExited(MouseEvent paramMouseEvent) {
    this.a.setCursor(Cursor.getDefaultCursor());
  }

  public void mouseClicked(MouseEvent paramMouseEvent) {
    String str = (this.b.a[this.b.c]).b;
    if (str.startsWith("[localfile]"))
      str = X.b(str, "[localfile]", "file:///" + (new File(".")).getAbsolutePath());
    aN.a(str);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/it.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
