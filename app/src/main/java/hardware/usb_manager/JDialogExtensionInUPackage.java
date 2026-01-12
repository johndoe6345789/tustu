package u;

import G.R;
import bH.D;
import bt.ManagerBfcomponentcharlie;
import c.CInterfaceAlpha;
import com.efiAnalytics.ui.cI;
import com.efiAnalytics.ui.dz;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextPane;
import r.CInterfaceAlpha;
import s.SComponentGolf;

public class JDialogExtensionInUPackage extends JDialog {
  File CInterfaceAlpha;

  ArrayList b;

  ArrayList c;

  dz d;

  d e;

  public JDialogExtensionInUPackage(
      Window paramWindow,
      R paramR1,
      R paramR2,
      ArrayList paramArrayList1,
      ArrayList paramArrayList2,
      File paramFile) {
    super(paramWindow, SComponentGolf.b("Difference Report"), Dialog.DEFAULT_MODALITY_TYPE);
    String str1;
    this.CInterfaceAlpha = null;
    this.b = new ArrayList();
    this.c = null;
    this.d = null;
    this.CInterfaceAlpha = paramFile;
    this.c = paramArrayList2;
    long l = System.currentTimeMillis();
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JTextPane jTextPane = new JTextPane();
    jTextPane.setContentType("text/html");
    if (paramFile == null || !paramFile.exists()) {
      str1 = SComponentGolf.b(CInterfaceAlpha.CInterfaceAlpha(paramR1.i(), CInterfaceAlpha.f));
      setDefaultCloseOperation(0);
    } else {
      str1 = paramFile.getName();
    }
    String str2 =
        "<html><center><b>"
            + SComponentGolf.b("Difference Report")
            + ":</b><br>"
            + SComponentGolf.b(
                "There are differences between the settings currently in "
                    + CInterfaceAlpha.b
                    + " and the settings")
            + "<br>"
            + SComponentGolf.b("that were found in the")
            + " "
            + str1
            + ". ";
    str2 =
        str2
            + SComponentGolf.b("You must select which settings you wish to use.")
            + "</center></html>";
    jTextPane.setText(str2);
    jTextPane.putClientProperty("JEditorPane.honorDisplayProperties", Boolean.valueOf(true));
    jPanel1.add("Center", jTextPane);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 2));
    jPanel2.add(new JLabel(SComponentGolf.b("Current " + CInterfaceAlpha.b + " Settings"), 0));
    jPanel2.add(new JLabel(SComponentGolf.b("Settings in") + " " + str1, 0));
    jPanel1.add("South", jPanel2);
    add("North", jPanel1);
    D.d("Difference Report disabling shared table Models");
    ManagerBfcomponentcharlie.CInterfaceAlpha().CInterfaceAlpha(false);
    this.e = new d(paramR1, paramR2, paramArrayList1);
    this.d = new dz(this.e, SComponentGolf.d());
    add("Center", (Component) this.d);
    k k = new k(this, getContentPane());
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(1, 0));
    String str3 = "<html><body>" + SComponentGolf.b("Button Actions") + ":<br><br>";
    i i = new i(this);
    byte b1 = 0;
    for (SComponentGolf SComponentGolf : paramArrayList2) {
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new FlowLayout(1));
      CInterfaceAlpha CInterfaceAlpha = new CInterfaceAlpha(SComponentGolf, i);
      jPanel.add(CInterfaceAlpha);
      jPanel3.add(jPanel);
      k.CInterfaceAlpha(CInterfaceAlpha);
      if (b1++ < 1) CInterfaceAlpha.requestFocus();
      str3 =
          str3
              + "<b>"
              + SComponentGolf.b(SComponentGolf.CInterfaceAlpha())
              + " - </b>"
              + SComponentGolf.b(SComponentGolf.b())
              + "<br><br>";
    }
    str3 = str3 + "</body></html>";
    JPanel jPanel4 = new JPanel();
    jPanel4.setToolTipText(str3);
    jPanel4.setLayout(new BorderLayout());
    jPanel4.add("Center", jPanel3);
    add("South", jPanel4);
    cI cI = new cI(str3);
    k.CInterfaceAlpha((Component) cI);
    jPanel4.add("East", (Component) cI);
    pack();
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    dimension.height -= eJ.CInterfaceAlpha(100);
    setSize(
        getWidth() + (this.d.CInterfaceAlpha().getVerticalScrollBar().getPreferredSize()).width,
        getHeight());
    if (getWidth() < dimension.width) dimension.width = getWidth();
    if (getHeight() > dimension.height) setSize(dimension);
    j j = new j(this);
    j.addMouseListener(k);
    j.addMouseMotionListener(k);
    k.CInterfaceAlpha(this.d.CInterfaceAlpha().getHorizontalScrollBar());
    k.CInterfaceAlpha(this.d.CInterfaceAlpha().getVerticalScrollBar());
    byte b2;
    for (b2 = 0; b2 < this.d.CInterfaceAlpha().getHorizontalScrollBar().getComponentCount(); b2++)
      k.CInterfaceAlpha(this.d.CInterfaceAlpha().getHorizontalScrollBar().getComponent(b2));
    for (b2 = 0; b2 < this.d.CInterfaceAlpha().getVerticalScrollBar().getComponentCount(); b2++)
      k.CInterfaceAlpha(this.d.CInterfaceAlpha().getVerticalScrollBar().getComponent(b2));
    k.CInterfaceAlpha(this.d.b());
    k.CInterfaceAlpha(this.d.c());
    JRootPane jRootPane = getRootPane();
    jRootPane.setGlassPane(j);
    j.CInterfaceAlpha();
  }

  public boolean CInterfaceAlpha() {
    return this.e.b.isEmpty();
  }

  public void dispose() {
    this.e.close();
    D.d("Difference Report enabling shared table Models");
    ManagerBfcomponentcharlie.CInterfaceAlpha().CInterfaceAlpha(true);
    super.dispose();
  }

  public boolean b() {
    Iterator<SComponentGolf> iterator = this.c.iterator();
    while (iterator.hasNext()) {
      if (((SComponentGolf) iterator.next()).c()) return true;
    }
    return false;
  }

  public void CInterfaceAlpha(f paramf) {
    this.b.add(paramf);
  }

  public void b(f paramf) {
    this.b.remove(paramf);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/u/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
