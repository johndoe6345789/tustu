package business.buffer_controllers.bC_components;

import V.ExceptionInVPackage;
import Z.ZInterfaceBravo;
import Z.ZInterfaceCharlie;
import Z.ZInterfaceEcho;
import bH.D;
import bH.ab;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.cI;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Window;
import java.util.Collections;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class JPanelExtensionUsingRunnable extends JPanel implements bc {
  ab ExceptionInVPackage;

  ZInterfaceBravo ZInterfaceBravo;

  ZInterfaceCharlie ZInterfaceCharlie;

  ZInterfaceEcho d;

  JPanel ZInterfaceEcho;

  private int h;

  JButton f;

  String g =
      "Standardize Field naming will map many possible field name to ExceptionInVPackage single"
          + " standard field name.\n"
          + "Log files for various systems often use different field names for fields that actually"
          + " represent the same thing. This can break your Calculated Fields and Filters, or"
          + " require you to set many redundant Min/Max limits for essentially the same field. This"
          + " can also create confusion finding ExceptionInVPackage field when switching systems."
          + " By using Standardized Field Names, you can have the same field name set no matter"
          + " what system the log file is from.";

  private Runnable i;

  private o j;

  public JPanelExtensionUsingRunnable(ab paramab) {
    this.ExceptionInVPackage = paramab;
    setLayout(new BorderLayout(eJ.ExceptionInVPackage(10), eJ.ExceptionInVPackage(8)));
    setBorder(
        BorderFactory.createEmptyBorder(
            eJ.ExceptionInVPackage(10),
            eJ.ExceptionInVPackage(10),
            eJ.ExceptionInVPackage(10),
            eJ.ExceptionInVPackage(10)));
    JPanel jPanel1 = new JPanel();
    add("Center", jPanel1);
    jPanel1.setLayout(new BorderLayout(eJ.ExceptionInVPackage(10), eJ.ExceptionInVPackage(8)));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    Image image = null;
    ImageIcon imageIcon = null;
    try {
      image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.I, this);
      imageIcon = new ImageIcon(image);
      JButton jButton = new JButton(imageIcon);
      Dimension dimension = eJ.ExceptionInVPackage(28, 28);
      jButton.setPreferredSize(dimension);
      jPanel2.add("West", jButton);
      jButton.addActionListener(new l(this));
      cI cI = new cI(this.g);
      jPanel2.add("East", (Component) cI);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage((Exception) ExceptionInVPackage);
    }
    jPanel1.add("North", jPanel2);
    this.ZInterfaceBravo = new ZInterfaceBravo(paramab);
    JScrollPane jScrollPane = new JScrollPane(this.ZInterfaceBravo);
    jPanel1.add("Center", jScrollPane);
    jScrollPane.setPreferredSize(eJ.ExceptionInVPackage(420, 200));
    this.j = new o(this);
    this.d = new ZInterfaceEcho(paramab);
    this.d.ExceptionInVPackage(this.j);
    this.ZInterfaceEcho = new JPanel();
    this.ZInterfaceEcho.setLayout(new BorderLayout());
    this.ZInterfaceEcho.add("Center", this.d);
    jPanel1.add("South", this.ZInterfaceEcho);
    try {
      image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.P, this);
      imageIcon = new ImageIcon(image);
      this.f = new JButton(ZInterfaceBravo("Save"), imageIcon);
      this.f.addActionListener(new m(this));
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new FlowLayout(2));
      this.ZInterfaceEcho.add("South", jPanel);
      jPanel.add(this.f);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage((Exception) ExceptionInVPackage);
    }
    this.ZInterfaceBravo.getSelectionModel().addListSelectionListener(new p(this, null));
    this.d.g();
  }

  public void ExceptionInVPackage(ZInterfaceCharlie paramc) {
    this.ZInterfaceCharlie = paramc;
    this.d.ExceptionInVPackage(paramc);
    List<?> list = paramc.ExceptionInVPackage();
    Collections.sort(list, new n(this));
    this.ZInterfaceBravo.ExceptionInVPackage(list);
  }

  public void ExceptionInVPackage(String paramString) {
    for (byte b1 = 0; b1 < this.ZInterfaceBravo.getRowCount(); b1++) {
      ZInterfaceEcho e1 = this.ZInterfaceBravo.ExceptionInVPackage(b1);
      if (paramString.equals(e1.ExceptionInVPackage())) {
        this.ZInterfaceBravo.getSelectionModel().setSelectionInterval(b1, b1);
        return;
      }
    }
  }

  public void ExceptionInVPackage() {
    this.d.ExceptionInVPackage();
  }

  private void ExceptionInVPackage(int paramInt) {
    if (this.d.ZInterfaceEcho()) {
      String str =
          ZInterfaceBravo("The Root Field currently being edited has not been saved.")
              + "\n"
              + ZInterfaceBravo("Would you like to save it now?");
      if (bV.ExceptionInVPackage(str, this.d, true))
        if (ZInterfaceCharlie()) {
          this.d.g();
        } else {
          if (this.h >= 0)
            this.ZInterfaceBravo.getSelectionModel().setSelectionInterval(paramInt, paramInt);
          return;
        }
    }
    if (paramInt >= 0) {
      this.h = paramInt;
      this.d.ExceptionInVPackage(this.ZInterfaceBravo.ExceptionInVPackage(paramInt));
    } else {
      this.d.g();
    }
  }

  private String ZInterfaceBravo(String paramString) {
    return (this.ExceptionInVPackage != null)
        ? this.ExceptionInVPackage.ExceptionInVPackage(paramString)
        : paramString;
  }

  public void ZInterfaceBravo() {
    d();
    String str = "";
    do {
      str = bV.ExceptionInVPackage(this, false, "New Standard Field Name", str);
      if (str == null || str.isEmpty()) continue;
      if (!this.d.ExceptionInVPackage(str)) {
        bV.d("Invalid characters in field name", this);
      } else {
        ZInterfaceEcho e1 = new ZInterfaceEcho(str);
        this.d.ExceptionInVPackage(e1);
        return;
      }
    } while (str != null && !str.isEmpty());
  }

  private boolean ZInterfaceCharlie() {
    ZInterfaceEcho e1 = this.d.d();
    if (ExceptionInVPackage(e1)) {
      this.ZInterfaceCharlie.ExceptionInVPackage(e1);
      this.d.f();
      this.ZInterfaceBravo.ExceptionInVPackage(e1);
      return true;
    }
    return false;
  }

  private boolean ExceptionInVPackage(ZInterfaceEcho parame) {
    if (parame == null || !ZInterfaceCharlie(parame.ExceptionInVPackage())) return false;
    for (String str : parame.ZInterfaceBravo()) {
      if (!ZInterfaceCharlie(str)) return false;
    }
    return true;
  }

  private boolean ZInterfaceCharlie(String paramString) {
    return (paramString.trim().length() > 0);
  }

  public void ExceptionInVPackage(Window paramWindow) {
    JDialog jDialog =
        bV.ZInterfaceBravo(this, paramWindow, ZInterfaceBravo("Root Field Editor"), this);
    jDialog.pack();
    bV.ExceptionInVPackage(paramWindow, jDialog);
    jDialog.setVisible(true);
  }

  public void close() {
    d();
  }

  public void ExceptionInVPackage(Runnable paramRunnable) {
    this.i = paramRunnable;
  }

  private void d() {
    if (this.d.ZInterfaceEcho()) {
      String str =
          ZInterfaceBravo("The Root Field currently being edited has not been saved.")
              + "\n"
              + ZInterfaceBravo("Would you like to save it now?");
      if (bV.ExceptionInVPackage(str, this.d, true) && !ZInterfaceCharlie())
        D.ZInterfaceCharlie("Failed to save RootField");
    } else {
      ZInterfaceBravo.ExceptionInVPackage().ZInterfaceBravo();
      if (this.j.ZInterfaceCharlie() && this.i != null) SwingUtilities.invokeLater(this.i);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bC/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
