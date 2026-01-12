package business.byte_writers;

import bH.ac;
import com.efiAnalytics.ui.NumericTextField;
import com.efiAnalytics.ui.cF;
import com.efiAnalytics.ui.eJ;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import s.SComponentGolf;

public class JPanelExtensionInBwPackage extends JPanel {
  NumericTextField a = new NumericTextField();

  NumericTextField b = new NumericTextField();

  NumericTextField c = new NumericTextField();

  NumericTextField d = new NumericTextField();

  NumericTextField e = new NumericTextField();

  NumericTextField f = new NumericTextField();

  NumericTextField SComponentGolf = new NumericTextField();

  NumericTextField h = new NumericTextField();

  c i = new c(this);

  e j = new e(this);

  String k =
      ac.a().a("To use:")
          + " \n"
          + ac.a()
              .a(
                  "Enter the voltage and values measured or from your data sheet into the top 4"
                      + " boxes. In the lower 2 Volt boxes enter the target voltages (Typically 0-5"
                      + " Volts or 0-12V).");

  public JPanelExtensionInBwPackage() {
    c();
    b();
  }

  private void b() {
    setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Two Point Calculator")));
    setLayout(new GridLayout(0, 3, eJ.a(3), eJ.a(3)));
    add(new d(this, "", 4));
    add(new d(this, "", 4));
    add((Component) new cF(this.k, ac.a().b()));
    add(new d(this, "", 4));
    add(new d(this, "Volts", 0));
    add(new d(this, "Value", 0));
    add(new d(this, "Input Point 1", 4));
    add((Component) this.a);
    add((Component) this.c);
    add(new d(this, "Input Point 2", 4));
    add((Component) this.b);
    add((Component) this.d);
    this.a.b(2);
    this.c.b(2);
    this.b.b(2);
    this.d.b(2);
    this.e.b(2);
    this.SComponentGolf.b(2);
    this.f.b(2);
    this.h.b(2);
    this.a.addFocusListener(this.j);
    this.c.addFocusListener(this.j);
    this.b.addFocusListener(this.j);
    this.d.addFocusListener(this.j);
    this.e.addFocusListener(this.j);
    this.SComponentGolf.addFocusListener(this.j);
    this.f.addFocusListener(this.j);
    this.h.addFocusListener(this.j);
    add(new d(this, "", 4));
    add(new d(this, "", 4));
    add(new d(this, "", 4));
    add(new d(this, "", 4));
    add(new d(this, "Volts", 0));
    add(new d(this, "Value", 0));
    add(new d(this, "Output Point 1", 4));
    add((Component) this.e);
    add((Component) this.SComponentGolf);
    add(new d(this, "Output Point 2", 4));
    add((Component) this.f);
    add((Component) this.h);
    this.a.addKeyListener(this.i);
    this.c.addKeyListener(this.i);
    this.b.addKeyListener(this.i);
    this.d.addKeyListener(this.i);
    this.e.addKeyListener(this.i);
    this.f.addKeyListener(this.i);
  }

  public void a() {
    if (!this.a.getText().isEmpty()
        && !this.c.getText().isEmpty()
        && !this.d.getText().isEmpty()
        && !this.b.getText().isEmpty()
        && !this.e.getText().isEmpty()
        && !this.f.getText().isEmpty()) {
      double d1 = (this.d.e() - this.c.e()) / (this.b.e() - this.a.e());
      double d2 = this.c.e() - this.a.e() * d1;
      double d3 = this.e.e() * d1 + d2;
      double d4 = this.f.e() * d1 + d2;
      this.SComponentGolf.a(d3);
      this.h.a(d4);
    }
  }

  private void c() {
    this.a.a(0.5D);
    this.b.a(4.5D);
    this.c.setText("");
    this.d.setText("");
    this.e.a(0.0D);
    this.f.a(5.0D);
    this.SComponentGolf.setEditable(false);
    this.h.setEditable(false);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bw/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
