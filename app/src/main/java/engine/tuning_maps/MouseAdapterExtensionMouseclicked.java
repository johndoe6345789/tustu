package aP;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import s.JDialogExtensionInSPackage;
import s.SInterfaceFoxtrot;

class MouseAdapterExtensionMouseclicked extends MouseAdapter {
  SInterfaceFoxtrot a = null;

  public MouseAdapterExtensionMouseclicked(dB paramdB, SInterfaceFoxtrot paramf) {
    this.a = paramf;
  }

  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3) paramMouseEvent.consume();
  }

  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3) {
      a();
      paramMouseEvent.consume();
    }
  }

  private void a() {
    JDialogExtensionInSPackage.a(this.a);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
