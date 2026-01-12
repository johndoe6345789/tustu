package aY;

import G.T;
import aP.ApInterfaceOscar;
import aP.ApInterfaceQuebec;
import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;

public class JDialogExtensionInAyPackage extends JDialog implements ApInterfaceQuebec {
  JTextField a = new JTextField("");

  JTextField b = new JTextField("");

  JButton c = new JButton("Browse");

  JButton d = new JButton("Browse");

  JToggleButton e = new JToggleButton("Start Test");

  JLabel f = new JLabel("", 2);

  JLabel g = new JLabel("", 2);

  JLabel h = new JLabel("", 2);

  ApInterfaceOscar i = new ApInterfaceOscar(T.a().c());

  int j = 0;

  String k =
      "<html><center>This dialog will continuously load the 2 msq files alternating.<br>The second"
          + " will be loaded once the previous has completed writing to the controller.<br>data"
          + " verification will be performed after every page burn by means of crc check or <br>a"
          + " full page read and byte compare.</center></html>";

  public JDialogExtensionInAyPackage(Window paramWindow) {
    super(paramWindow, "Automated msq loader");
    this.i.a(this);
    c();
  }

  private void c() {
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 1));
    jPanel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    JTextPane jTextPane = new JTextPane();
    jTextPane.setOpaque(true);
    jTextPane.setContentType("text/html");
    jTextPane.setEditable(false);
    jTextPane.setText(this.k);
    jPanel2.add(jTextPane);
    add("North", jPanel2);
    jPanel1.setLayout(new GridLayout(0, 1));
    jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    jPanel3.add("West", new JLabel("MSQ file 1:"));
    jPanel3.add("Center", this.a);
    jPanel3.add("East", this.c);
    this.c.addActionListener(new b(this));
    jPanel2.add("South", jPanel3);
    jPanel1.add(jPanel2);
    jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    jPanel4.add("West", new JLabel("MSQ file 2:"));
    jPanel4.add("Center", this.b);
    jPanel4.add("East", this.d);
    this.d.addActionListener(new c(this));
    jPanel2.add("South", jPanel4);
    jPanel1.add(jPanel2);
    jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new GridLayout(1, 0));
    jPanel5.add(new JLabel("Total File Loads:", 4));
    jPanel5.add(this.g);
    jPanel5.add(new JLabel("Bytes Sent:", 4));
    jPanel5.add(this.h);
    jPanel5.add(new JLabel("Time to send Last:", 4));
    jPanel5.add(this.f);
    jPanel2.add("South", jPanel5);
    jPanel1.add(jPanel2);
    add("Center", jPanel1);
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new FlowLayout(1));
    this.e.addActionListener(new d(this));
    jPanel6.add(this.e);
    JButton jButton = new JButton("Close");
    jButton.addActionListener(new e(this));
    jPanel6.add(jButton);
    add("South", jPanel6);
  }

  public void a() {
    try {
      this.i.a(new File(this.a.getText()));
      this.i.b(new File(this.b.getText()));
      this.i.a();
      this.i.start();
      this.e.setSelected(true);
      this.e.setText("Stop Test");
    } catch (V.a a1) {
      bV.d(a1.getMessage(), this);
      this.e.setSelected(false);
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) a1);
    }
  }

  public void b() {
    this.i.b();
    this.i = new ApInterfaceOscar(T.a().c());
    this.e.setSelected(false);
    this.e.setText("Start Test");
  }

  private String d() {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = r.a.cw;
    String str = (aE.a.A() != null) ? aE.a.A().t() : "";
    return bV.b(this, "Open Tune File", arrayOfString, "", str);
  }

  public void a(int paramInt1, int paramInt2) {
    this.g.setText("" + this.j++);
    this.f.setText((paramInt1 / 1000.0D) + "s.");
    this.h.setText("" + paramInt2);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aY/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
