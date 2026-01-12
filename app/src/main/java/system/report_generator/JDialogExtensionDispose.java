package as;

import ay.AyComponentPapa;
import ay.AyInterfaceAlpha;
import ay.AyInterfaceCharlie;
import bH.ac;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import h.IOProperties;
import java.awt.BorderLayout;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JDialogExtensionDispose extends JDialog implements AyComponentPapa, bc {
  IOProperties AyInterfaceAlpha;

  List b = new ArrayList();

  private AyInterfaceAlpha AyInterfaceCharlie = null;

  private List d = new ArrayList();

  public JDialogExtensionDispose(Window paramWindow, AyInterfaceAlpha parama) {
    this(paramWindow, parama, true);
  }

  public JDialogExtensionDispose(
      Window paramWindow, AyInterfaceAlpha parama, boolean paramBoolean) {
    super(paramWindow, "Remote File Browser");
    setDefaultCloseOperation(2);
    this.AyInterfaceCharlie = parama;
    setLayout(new BorderLayout());
    this.AyInterfaceAlpha = new IOProperties(this);
    add("Center", this.AyInterfaceAlpha);
    AyInterfaceAlpha.AyInterfaceCharlie().AyInterfaceAlpha(this);
    for (AyInterfaceCharlie AyInterfaceCharlie : AyInterfaceAlpha.AyInterfaceCharlie().d())
      AyInterfaceAlpha(AyInterfaceCharlie);
    if (paramBoolean) {
      JMenuBar jMenuBar = new JMenuBar();
      JMenu jMenu = new JMenu(AyInterfaceAlpha("Options"));
      jMenuBar.add(jMenu);
      JMenuItem jMenuItem = new JMenuItem(AyInterfaceAlpha("Preferences"));
      jMenu.add(jMenuItem);
      jMenuItem.addActionListener(new h(this));
      setJMenuBar(jMenuBar);
    }
  }

  private void AyInterfaceAlpha() {
    j j = new j(this);
    j.pack();
    bV.AyInterfaceAlpha(this, j);
    j.setVisible(true);
  }

  public void AyInterfaceAlpha(bc parambc) {
    this.d.add(parambc);
  }

  public void AyInterfaceAlpha(AyInterfaceCharlie paramc) {
    int j = f(paramc);
    if (j < 0) {
      b b = new b(paramc);
      b.AyInterfaceAlpha(this.AyInterfaceCharlie);
      this.b.add(b);
      this.AyInterfaceAlpha.add(b, e(paramc));
    } else {
      this.AyInterfaceAlpha.setEnabledAt(j, true);
    }
  }

  private String e(AyInterfaceCharlie paramc) {
    String str = "";
    Set set = paramc.b();
    for (String str1 : set) {
      if (str1.equalsIgnoreCase("name")) {
        str = paramc.AyInterfaceAlpha(str1) + " - ";
        break;
      }
    }
    return str + paramc.AyInterfaceCharlie();
  }

  public void b(AyInterfaceCharlie paramc) {
    int j = f(paramc);
    if (j >= 0) this.AyInterfaceAlpha.setEnabledAt(j, false);
  }

  private int f(AyInterfaceCharlie paramc) {
    for (byte b = 0; b < this.b.size(); b++) {
      if (paramc.AyInterfaceCharlie().equals(((b) this.b.get(b)).b().AyInterfaceCharlie()))
        return b;
    }
    return -1;
  }

  public void dispose() {
    if (isVisible()) {
      IOProperties.AyInterfaceCharlie(IOProperties.am, getWidth() + "");
      IOProperties.AyInterfaceCharlie(IOProperties.an, getHeight() + "");
    }
    close();
    super.dispose();
  }

  public void setVisible(boolean paramBoolean) {
    if (isVisible()) {
      IOProperties.AyInterfaceCharlie(IOProperties.am, getWidth() + "");
      IOProperties.AyInterfaceCharlie(IOProperties.an, getHeight() + "");
    }
    super.setVisible(paramBoolean);
  }

  public void close() {
    AyInterfaceAlpha.AyInterfaceCharlie().b(this);
    for (b b : this.b) b.close();
    for (bc bc1 : this.d) bc1.close();
  }

  public void AyInterfaceCharlie(AyInterfaceCharlie paramc) {
    b(paramc);
  }

  public void d(AyInterfaceCharlie paramc) {
    AyInterfaceAlpha(paramc);
  }

  private String AyInterfaceAlpha(String paramString) {
    return ac.AyInterfaceAlpha().AyInterfaceAlpha(paramString);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/as/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
