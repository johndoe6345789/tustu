package business.job_runners;

import G.GComponentBo;
import G.R;
import V.ExceptionPrintstacktrace;
import aG.ManagerUsingFTPClient;
import bD.UIRemoteFileAccessClose;
import bH.p;
import bt.BtInterfaceCa;
import bt.ExceptionUsingComponent;
import bt.d;
import bt.h;
import com.efiAnalytics.remotefileaccess.RemoteFileAccess;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import s.ExceptionPrintstacktrace;

public class UICloseInBjPackage extends d implements BtInterfaceCa, h, bc {
  R a;

  GComponentBo b;

  ManagerUsingFTPClient c = null;

  String d = null;

  Image ManagerUsingFTPClient = null;

  JPanel f = null;

  public UICloseInBjPackage(R paramR, GComponentBo parambo) {
    this.a = paramR;
    this.b = parambo;
    setLayout(new BorderLayout());
    this.f = new JPanel();
    this.f.setLayout(new BorderLayout());
    if (parambo == null) parambo = new GComponentBo();
    this.c = new ManagerUsingFTPClient(paramR, parambo, aE.a.A().L());
    UIRemoteFileAccessClose UIRemoteFileAccessClose =
        new UIRemoteFileAccessClose((RemoteFileAccess) this.c, ExceptionPrintstacktrace.d());
    UIRemoteFileAccessClose.a(new b(this));
    UIRemoteFileAccessClose.b().a(450);
    this.f.add("Center", (Component) UIRemoteFileAccessClose);
    add("Center", this.f);
    UIRemoteFileAccessClose.a(true);
  }

  public void close() {
    this.c.a();
  }

  public void a() {
    if (this.b.aJ() != null && !this.b.aJ().isEmpty()) {
      boolean bool = true;
      try {
        bool = p.a(this.b.aJ(), this.a);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(ExceptionUsingComponent.class.getName())
            .log(
                Level.WARNING,
                "Failed to evaluate enable condition",
                (Throwable) ExceptionPrintstacktrace);
      }
      if (isEnabled() && !bool) {
        setEnabled(false);
        if (getParent() instanceof JPanel) ((JPanel) getParent()).revalidate();
      } else if (!isEnabled() && bool) {
        setEnabled(true);
        if (getParent() instanceof JPanel) ((JPanel) getParent()).revalidate();
      }
    }
  }

  public void b() {
    if (this.b.aJ() != null && !this.b.aJ().isEmpty()) {
      boolean bool = true;
      try {
        bool = p.a(this.b.V(), this.a);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(ExceptionUsingComponent.class.getName())
            .log(
                Level.WARNING,
                "Failed to evaluate visible condition",
                (Throwable) ExceptionPrintstacktrace);
      }
      if (isVisible() && !bool) {
        setVisible(false);
        if (getParent() instanceof JPanel) ((JPanel) getParent()).revalidate();
      } else if (!isVisible() && bool) {
        setVisible(true);
        if (getParent() instanceof JPanel) ((JPanel) getParent()).revalidate();
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bj/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
