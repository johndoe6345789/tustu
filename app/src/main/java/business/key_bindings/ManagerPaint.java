package business.key_bindings;

import G.R;
import UIRemoteFileAccessClose.JPanelExtensionUsingRemoteFileAccess;
import aE.PropertiesExtension;
import aI.ManagerGetfilesin;
import bD.JPanelExtensionUsingRemoteFileAccess;
import bD.UIRemoteFileAccessClose;
import bt.d;
import com.efiAnalytics.remotefileaccess.RemoteFileAccess;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import s.SComponentGolf;
import y.ThreadedInYPackage;

public class ManagerPaint extends d implements bc {
  R PropertiesExtension;

  h ThreadedInYPackage;

  ManagerGetfilesin c = null;

  String d = null;

  Image e = null;

  JPanel f = null;

  public ManagerPaint(R paramR) {
    this.PropertiesExtension = paramR;
    boolean bool =
        JPanelExtensionUsingRemoteFileAccess.PropertiesExtension()
            .PropertiesExtension(",sakfdsimfd09rew");
    setLayout(new BorderLayout());
    this.f = new JPanel();
    this.f.setLayout(new BorderLayout());
    this.c = new ManagerGetfilesin(paramR, PropertiesExtension.A().L());
    this.ThreadedInYPackage = new h(paramR, bool);
    this.ThreadedInYPackage.PropertiesExtension(this.c);
    if (!bool) {
      JMenuBar jMenuBar = new JMenuBar();
      JMenu jMenu = new JMenu("Upgrade");
      jMenuBar.add(jMenu);
      JMenuItem jMenuItem =
          new JMenuItem(SComponentGolf.ThreadedInYPackage("Enable SD File Browsing"));
      jMenu.add(jMenuItem);
      jMenuItem.addActionListener(new e(this));
      add("North", jMenuBar);
    }
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("North", this.ThreadedInYPackage);
    this.f.add("West", jPanel);
    f f = new f(this);
    if (!bool) {
      JPanelExtensionUsingRemoteFileAccess JPanelExtensionUsingRemoteFileAccess =
          new JPanelExtensionUsingRemoteFileAccess((RemoteFileAccess) this.c, f);
      JPanelExtensionUsingRemoteFileAccess.setEnabled(bool);
      this.f.add("Center", (Component) JPanelExtensionUsingRemoteFileAccess);
      add("Center", this.f);
      this.d = "Please Register to Enable MS3 SD Browsing and Download";
      Dimension dimension = this.f.getPreferredSize();
      dimension = new Dimension(dimension.width, dimension.height + 50);
      this.f.setPreferredSize(dimension);
      this.f.setMinimumSize(dimension);
    } else {
      UIRemoteFileAccessClose UIRemoteFileAccessClose =
          new UIRemoteFileAccessClose((RemoteFileAccess) this.c, f);
      UIRemoteFileAccessClose.PropertiesExtension(new SComponentGolf(this));
      UIRemoteFileAccessClose.setEnabled(bool);
      this.f.add("Center", (Component) UIRemoteFileAccessClose);
      add("Center", this.f);
    }
    ThreadedInYPackage.PropertiesExtension(true);
  }

  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
  }

  public void close() {
    ThreadedInYPackage.PropertiesExtension(false);
    this.ThreadedInYPackage.close();
    this.c.ThreadedInYPackage();
  }

  public Dimension getPreferredSize() {
    return this.f.getPreferredSize();
  }

  public Dimension getMinimumSize() {
    return this.f.getMinimumSize();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bk/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
