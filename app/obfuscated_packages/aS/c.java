package aS;

import aP.dd;
import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import r.a;
import s.g;

class c extends Thread {
  c(b paramb) {}
  
  public void run() {
    if (a.b(this.a.g)) {
      JPanel jPanel = new JPanel();
      if (this.a.g.d) {
        jPanel.setBorder(BorderFactory.createTitledBorder(g.b("Attention!")));
      } else {
        jPanel.setBorder(BorderFactory.createTitledBorder(g.b("Settings Error!")));
      } 
      jPanel.setLayout(new BorderLayout());
      JLabel jLabel = new JLabel(b.a(this.a));
      jLabel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
      jPanel.add("Center", jLabel);
      d d = new d(this);
      if (this.a.g.d) {
        bV.a(jPanel, dd.a().c(), g.b("Attention") + "!", d);
      } else {
        bV.a(jPanel, dd.a().c(), g.b("Error") + "!", d);
      } 
    } 
    try {
      Thread.sleep(1000L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    String str = g.b("Settings Configuration Error!") + "\n" + g.b(a.b + " is online") + "\n" + g.b("Correct Settings and Power Cycle Controller.");
    if (this.a.d != null && this.a.d.length() > 0)
      str = str + "\n \nReported Setting Error:       \n" + this.a.d; 
    str = str + "\n\nYou must correct this error, then power cycle your controller.";
    this.a.f = dd.a().b();
    this.a.f.l(str);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aS/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */