package p;

import S.SInterfaceLima;
import bH.ab;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.awt.Window;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class PComponentAlpha extends JPanel implements bc {
  ab a;

  J b;

  p c;

  public PComponentAlpha(SInterfaceLima paraml, B paramB, ab paramab) {
    this.a = paramab;
    setLayout(new BorderLayout());
    JTabbedPane jTabbedPane = new JTabbedPane();
    JScrollPane jScrollPane = new JScrollPane(jTabbedPane);
    add("Center", jScrollPane);
    this.b = new J(paramB, paramab);
    this.c = new p(paraml, paramab);
    jTabbedPane.add(a("Action Triggers"), this.c);
    paramB.a(this.c);
    jTabbedPane.add(a("User Actions"), this.b);
  }

  private String a(String paramString) {
    if (this.a != null) paramString = this.a.a(paramString);
    return paramString;
  }

  public void a(Window paramWindow) {
    JDialog jDialog = bV.b(this, paramWindow, a("Action Manager"), this);
    jDialog.pack();
    bV.a(paramWindow, jDialog);
    jDialog.setVisible(true);
  }

  public void close() {
    this.c.close();
    this.b.close();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
