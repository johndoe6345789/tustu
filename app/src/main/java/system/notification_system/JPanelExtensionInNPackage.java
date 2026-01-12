package system.notification_system;

import V.ExceptionInVPackage;
import com.efiAnalytics.ui.aO;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import r.RInterfaceIndia;
import s.SComponentGolf;

public class JPanelExtensionInNPackage extends JPanel {
  ArrayList ExceptionInVPackage = new ArrayList();

  JButton b = null;

  JButton c = null;

  JButton d = null;

  JButton e = null;

  ImageIcon f = null;

  ImageIcon SComponentGolf = null;

  public JPanelExtensionInNPackage() {
    this(24);
  }

  public JPanelExtensionInNPackage(int paramInt) {
    setLayout(
        new GridLayout(
            eJ.ExceptionInVPackage(1),
            eJ.ExceptionInVPackage(3),
            eJ.ExceptionInVPackage(2),
            eJ.ExceptionInVPackage(2)));
    try {
      Image image1 = cO.ExceptionInVPackage().ExceptionInVPackage(cO.V, this, paramInt);
      this.f = new ImageIcon(image1);
      image1 = cO.ExceptionInVPackage().ExceptionInVPackage(cO.Y, this, paramInt);
      this.SComponentGolf = new ImageIcon(image1);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(b.class.getName())
          .log(Level.INFO, "Unable to load burn button image.", (Throwable) ExceptionInVPackage);
    }
    Image image = null;
    Border border =
        BorderFactory.createEmptyBorder(
            eJ.ExceptionInVPackage(3),
            eJ.ExceptionInVPackage(4),
            eJ.ExceptionInVPackage(2),
            eJ.ExceptionInVPackage(4));
    try {
      image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.ad, this, paramInt);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(b.class.getName())
          .log(Level.WARNING, "Failed to get Undo Image", (Throwable) ExceptionInVPackage);
    }
    ImageIcon imageIcon = new ImageIcon(image);
    this.b = new JButton(null, imageIcon);
    this.b.setMnemonic(90);
    this.b.setToolTipText(SComponentGolf.b("Undo Changes (Alt+Z)"));
    this.b.addActionListener(new c(this));
    this.b.setEnabled(false);
    this.b.setBorder(border);
    this.b.setToolTipText(SComponentGolf.b("Undo last change made to configuration"));
    add(this.b);
    try {
      image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.ae, this, paramInt);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(b.class.getName())
          .log(Level.WARNING, "Failed to get Redo Image", (Throwable) ExceptionInVPackage);
    }
    imageIcon = new ImageIcon(image);
    this.c = new JButton(null, imageIcon);
    this.c.setMnemonic(89);
    this.c.setToolTipText(SComponentGolf.b("Redo Changes (Alt+Y)"));
    this.c.addActionListener(new d(this));
    this.c.setEnabled(false);
    this.c.setBorder(border);
    this.c.setToolTipText(SComponentGolf.b("Redo last Undo made to configuration"));
    add(this.c);
    this.e = new JButton(SComponentGolf.b("Burn"));
    this.e.setMnemonic(66);
    this.e.addActionListener(new e(this));
    if (!RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("OIJFDSFDSAPOFS")) add(this.e);
    this.e.setBorder(border);
    this.d = new JButton(SComponentGolf.b("Close"));
    this.d.setMnemonic(67);
    this.d.addActionListener(new f(this));
    this.d.setBorder(border);
    add(this.d);
  }

  private void ExceptionInVPackage() {
    for (aO aO : this.ExceptionInVPackage) aO.d();
  }

  private void b() {
    for (aO aO : this.ExceptionInVPackage) aO.e();
  }

  private void c() {
    for (aO aO : this.ExceptionInVPackage) aO.f();
  }

  private void d() {
    for (aO aO : this.ExceptionInVPackage) aO.RInterfaceIndia();
  }

  public void ExceptionInVPackage(aO paramaO) {
    this.ExceptionInVPackage.add(paramaO);
  }

  public void ExceptionInVPackage(boolean paramBoolean) {
    this.b.setEnabled(paramBoolean);
  }

  public void b(boolean paramBoolean) {
    this.c.setEnabled(paramBoolean);
  }

  public void c(boolean paramBoolean) {
    if (paramBoolean && this.f != null) {
      this.e.setIcon(this.f);
    } else if (!paramBoolean && this.SComponentGolf != null) {
      this.e.setIcon(this.SComponentGolf);
    } else {
      this.e.setEnabled(paramBoolean);
    }
  }

  public void d(boolean paramBoolean) {
    if (!paramBoolean) {
      remove(this.d);
    } else {
      add(this.d);
    }
  }

  public void e(boolean paramBoolean) {
    this.b.setVisible(paramBoolean);
    this.c.setVisible(paramBoolean);
    this.e.setVisible(paramBoolean);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/n/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
