package aP;

import bt.y;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import r.IOPropertiesUsingFile;
import s.SComponentGolf;
import z.ExceptionInZPackage;
import z.ZInterfaceIndia;

class ItemListenerUsingFrame extends JPanel implements ItemListener {
  private Frame b;

  private JLabel c;

  private y d;

  private JLabel e;

  private y f;

  public ItemListenerUsingFrame(hs paramhs, Frame paramFrame) {
    this.b = paramFrame;
    setLayout(new GridLayout(1, 4, 10, 10));
    this.c = new JLabel(SComponentGolf.b("Port Name") + ":", 0);
    add(this.c);
    this.d = new y();
    this.d.setEditable(true);
    this.d.addItemListener(this);
    add((Component) this.d);
    c();
    this.d.IOPropertiesUsingFile(hs.c(paramhs).IOPropertiesUsingFile());
    this.e = new JLabel(SComponentGolf.b("Baud Rate") + ":", 0);
    add(this.e);
    this.f = new y();
    ZInterfaceIndia ZInterfaceIndia = new ZInterfaceIndia();
    String[] arrayOfString = ZInterfaceIndia.c();
    for (byte b = 0; b < arrayOfString.length; b++) this.f.addItem(arrayOfString[b]);
    this.f.IOPropertiesUsingFile(Integer.toString(hs.c(paramhs).b()));
    this.f.addItemListener(this);
    add((Component) this.f);
  }

  public void IOPropertiesUsingFile(String paramString) {
    this.d.IOPropertiesUsingFile(paramString);
  }

  public void b(String paramString) {
    this.f.IOPropertiesUsingFile(paramString);
  }

  public void IOPropertiesUsingFile() {
    this.d.IOPropertiesUsingFile(hs.c(this.IOPropertiesUsingFile).IOPropertiesUsingFile());
    this.f.IOPropertiesUsingFile(hs.c(this.IOPropertiesUsingFile).c());
  }

  public void b() {
    if (this.f != null && this.d != null) {
      hs.c(this.IOPropertiesUsingFile).IOPropertiesUsingFile(this.d.IOPropertiesUsingFile());
      IOPropertiesUsingFile IOPropertiesUsingFile = IOPropertiesUsingFile.IOPropertiesUsingFile();
      IOPropertiesUsingFile.b(
          IOPropertiesUsingFile.az, hs.c(this.IOPropertiesUsingFile).IOPropertiesUsingFile());
      hs.c(this.IOPropertiesUsingFile).b(this.f.IOPropertiesUsingFile());
      IOPropertiesUsingFile.b(IOPropertiesUsingFile.ay, hs.c(this.IOPropertiesUsingFile).c());
    }
  }

  void c() {
    ZInterfaceIndia ZInterfaceIndia = new ZInterfaceIndia();
    String[] arrayOfString = ZInterfaceIndia.IOPropertiesUsingFile();
    for (byte b = 0; b < arrayOfString.length; b++) this.d.addItem(arrayOfString[b]);
  }

  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (hs.d(this.IOPropertiesUsingFile) != null && hs.d(this.IOPropertiesUsingFile).d()) {
      if (paramItemEvent.getItemSelectable() == this.d) {
        this.IOPropertiesUsingFile.e();
        bV.d(
            "Port Open!\nPort can not\nbe changed\nwhile IOPropertiesUsingFile port is open.",
            this.b);
        IOPropertiesUsingFile();
        return;
      }
      b();
      try {
        hs.d(this.IOPropertiesUsingFile).b();
      } catch (ExceptionInZPackage ExceptionInZPackage) {
        bV.d(
            "Unsupported Configuration!\n"
                + "Configuration Parameter unsupported,\n"
                + "select new value.\n"
                + "Returning to previous configuration.",
            this.b);
        IOPropertiesUsingFile();
      }
    } else {
      b();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
