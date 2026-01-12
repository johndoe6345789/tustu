package aX;

import A.Exception;
import Exception.g;
import aP.ThreadedJFrameIsoptimizeddrawingenabled;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.fL;
import com.efiAnalytics.ui.fS;
import java.awt.Container;
import java.awt.Window;
import javax.bluetooth.RemoteDevice;
import javax.swing.JDialog;

public class AxInterfaceAlpha implements fS {
  fL a = new fL();

  private aW.a e = null;

  JDialog b = null;

  h c = new h();

  c d = new c();

  public AxInterfaceAlpha() {
    this.a.e(this.c);
    this.c.a();
    this.a.e(this.d);
    this.a.a(this);
  }

  public boolean b() {
    if (this.e != null) {
      this.e.a();
      if (this.e.b() instanceof aC.a && this.c.d() != null) {
        aC.a a1 = (aC.a) this.e.b();
        try {
          a1.a("Bluetooth Device", this.c.d().getBluetoothAddress());
        } catch (Exception Exception) {
        }
      }
      this.e.a();
    }
    return true;
  }

  public void c() {
    this.c.c();
  }

  public boolean a(Container paramContainer) {
    if (paramContainer.equals(this.c)) {
      this.c.c();
      RemoteDevice remoteDevice = this.c.d();
      if (remoteDevice == null) {
        bV.d(g.b("You must select an Un-Paired Device."), paramContainer);
        return false;
      }
      this.d.a(remoteDevice);
    } else if (paramContainer.equals(this.d)) {
      if (!this.d.c()) this.d.a();
      return this.d.c();
    }
    return true;
  }

  public boolean b(Container paramContainer) {
    if (paramContainer.equals(this.c)) this.c.a();
    return true;
  }

  public void a(aW.a parama) {
    this.e = parama;
  }

  public void a(Window paramWindow) {
    String str = g.b("Pair Bluetooth Adapter");
    this.b = this.a.a(paramWindow, str);
    ThreadedJFrameIsoptimizeddrawingenabled.a().a(this.b);
    this.b.setVisible(true);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aX/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
