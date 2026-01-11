package s;

import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import r.RInterfaceIndia;

public class JDialogExtensionInSPackage extends JDialog {
  JLabel a = new JLabel("", 0);
  
  JLabel b = new JLabel("", 0);
  
  JTextField c = new JTextField();
  
  f d = null;
  
  String e = null;
  
  public JDialogExtensionInSPackage(f paramf) {
    super(bV.b(paramf.getComponent()), g.b("Update Translation"), Dialog.ModalityType.APPLICATION_MODAL);
    this.d = paramf;
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.setBorder(BorderFactory.createTitledBorder(a("")));
    add("Center", jPanel1);
    String str1 = g.c().getDisplayLanguage();
    String str2 = g.c().getLanguage();
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(0, 1, 4, 4));
    jPanel2.add(new JLabel(a("Update Translation")));
    jPanel2.add(new JLabel(a("English verbiage:"), 2));
    this.b.setText(paramf.a());
    jPanel2.add(this.b);
    jPanel2.add(new JLabel(a("Current Translation") + " (" + str1 + "):", 2));
    String str3 = g.b(paramf.a());
    this.a.setText(str3);
    jPanel2.add(this.a);
    jPanel2.add(new JLabel(a("Proposed Translation") + " (" + str1 + "):", 2));
    jPanel2.add(this.c);
    str3 = g.b(paramf.a());
    this.c.setText(str3);
    jPanel1.add("Center", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    JButton jButton1 = new JButton(a("Submit Translation Update"));
    jButton1.addActionListener(new c(this));
    jPanel3.add(jButton1);
    JButton jButton2 = new JButton(a("Cancel"));
    jButton2.addActionListener(new d(this));
    jPanel3.add(jButton2);
    jPanel1.add("South", jPanel3);
  }
  
  private void a() {
    if (!this.e.equals(this.c.getText()))
      this.d.a(this.c.getText()); 
    dispose();
  }
  
  private void b() {
    dispose();
  }
  
  private String a(String paramString) {
    return g.b(paramString);
  }
  
  public static void a(f paramf) {
    if (RInterfaceIndia.a().a("-=[pfds;'43-0pd")) {
      b b1 = new b(paramf);
      b1.pack();
      bV.a(paramf.getComponent(), b1);
      b1.setVisible(true);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/s/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */