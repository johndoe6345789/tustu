package aA;

import bH.ab;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JPanelExtensionInAaPackage extends JPanel {
  private String c;

  private String d;

  JDialog a = null;

  D.a b = null;

  private ab e = null;

  private e f = null;

  private e g = null;

  private e h = null;

  private e i = null;

  private e j = null;

  private e k = null;

  public JPanelExtensionInAaPackage(String paramString1, String paramString2, ab paramab) {
    this.e = paramab;
    this.c = paramString1;
    this.d = paramString2;
    c();
  }

  private void c() {
    setLayout(new BorderLayout(eJ.a(10), eJ.a(10)));
    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(BorderFactory.createTitledBorder("Registration Information"));
    jPanel1.setLayout(new GridLayout(0, 1, eJ.a(3), eJ.a(3)));
    this.f = new e(this, "Device type:", this.c, true);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(1));
    jPanel2.add(this.f);
    jPanel1.add(jPanel2);
    this.g = new e(this, "Serial Number:", this.d, true);
    jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(1));
    jPanel2.add(this.g);
    jPanel1.add(jPanel2);
    this.h = new e(this, "Owner First Name:", "");
    jPanel1.add(this.h);
    this.i = new e(this, "Owner Last Name:", "");
    jPanel1.add(this.i);
    this.j = new e(this, "Owner eMail Address:", "");
    jPanel1.add(this.j);
    this.k = new e(this, "Owner Phone:", "");
    jPanel1.add(this.k);
    add("Center", jPanel1);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    JButton jButton = new JButton("Activate");
    jButton.addActionListener(new b(this));
    jPanel3.add(jButton);
    jButton = new JButton("Cancel");
    jButton.addActionListener(new c(this));
    jPanel3.add(jButton);
    add("South", jPanel3);
  }

  private String a(String paramString) {
    return (b() != null) ? b().a(paramString) : paramString;
  }

  public void a(D.a parama) {
    this.b = parama;
    this.f.a(parama.a());
    this.g.a(parama.b());
    this.h.a(parama.e());
    this.i.a(parama.f());
    this.j.a(parama.d());
    this.k.a(parama.g());
  }

  private void d() {
    if (this.a != null) this.a.dispose();
  }

  public D.a a() {
    return this.b;
  }

  private void e() {
    String str = "";
    if (this.h.a().trim().equals("")) str = str + "Invalid First Name\n";
    if (this.i.a().trim().equals("")) str = str + "Invalid Last Name\n";
    if (this.j.a().trim().equals("") || !this.j.a().contains("@") || !this.j.a().contains("."))
      str = str + "Invalid eMail Address\n";
    if (!str.equals("")) {
      str = "Please correct the following:\n" + str;
      JOptionPane.showMessageDialog(this, str);
      return;
    }
    if (this.b == null) this.b = new D.a();
    this.b.a(this.c);
    this.b.b(this.d);
    this.b.e(this.h.a());
    this.b.f(this.i.a());
    this.b.d(this.j.a());
    this.b.g(this.k.a());
    az.a a1 = new az.a(this.a, bV.a());
    bV.a(this.a, (Component) a1);
    a1.setVisible(true);
    d d = new d(this, a1);
    d.start();
  }

  public JDialog a(Window paramWindow) {
    this.a = new JDialog(paramWindow, a("Device Activation"));
    this.a.add("Center", this);
    this.a.pack();
    bV.a(paramWindow, this.a);
    this.a.setModalityType(Dialog.ModalityType.DOCUMENT_MODAL);
    return this.a;
  }

  public ab b() {
    return this.e;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aA/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
