package bk;

import G.R;
import aE.a;
import aI.l;
import bD.i;
import bD.r;
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
import r.i;
import s.g;
import y.b;

public class d extends d implements bc {
  R a;
  
  h b;
  
  l c = null;
  
  String d = null;
  
  Image e = null;
  
  JPanel f = null;
  
  public d(R paramR) {
    this.a = paramR;
    boolean bool = i.a().a(",sakfdsimfd09rew");
    setLayout(new BorderLayout());
    this.f = new JPanel();
    this.f.setLayout(new BorderLayout());
    this.c = new l(paramR, a.A().L());
    this.b = new h(paramR, bool);
    this.b.a(this.c);
    if (!bool) {
      JMenuBar jMenuBar = new JMenuBar();
      JMenu jMenu = new JMenu("Upgrade");
      jMenuBar.add(jMenu);
      JMenuItem jMenuItem = new JMenuItem(g.b("Enable SD File Browsing"));
      jMenu.add(jMenuItem);
      jMenuItem.addActionListener(new e(this));
      add("North", jMenuBar);
    } 
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("North", this.b);
    this.f.add("West", jPanel);
    f f = new f(this);
    if (!bool) {
      i i = new i((RemoteFileAccess)this.c, f);
      i.setEnabled(bool);
      this.f.add("Center", (Component)i);
      add("Center", this.f);
      this.d = "Please Register to Enable MS3 SD Browsing and Download";
      Dimension dimension = this.f.getPreferredSize();
      dimension = new Dimension(dimension.width, dimension.height + 50);
      this.f.setPreferredSize(dimension);
      this.f.setMinimumSize(dimension);
    } else {
      r r = new r((RemoteFileAccess)this.c, f);
      r.a(new g(this));
      r.setEnabled(bool);
      this.f.add("Center", (Component)r);
      add("Center", this.f);
    } 
    b.a(true);
  }
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
  }
  
  public void close() {
    b.a(false);
    this.b.close();
    this.c.b();
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