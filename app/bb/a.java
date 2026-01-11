package bb;

import aP.f;
import bH.M;
import com.efiAnalytics.apps.ts.dashboard.HtmlDisplay;
import com.efiAnalytics.ui.cn;
import com.efiAnalytics.ui.fT;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import s.g;

public class a extends JPanel implements M, fT {
  HtmlDisplay a = new HtmlDisplay();
  
  public static String b = "./help/firmwareLoader/archiveProjectInfo.html";
  
  JButton c = new JButton(g.b("Backup Project Now"));
  
  JProgressBar d = new JProgressBar(0, 100);
  
  cn e = new cn();
  
  JPanel f = new JPanel();
  
  String g = "";
  
  public a() {
    setBorder(BorderFactory.createTitledBorder(g.b("Backup Car Project")));
    setLayout(new BorderLayout());
    add((Component)this.a, "Center");
    try {
      this.a.setDocumentUrl(b);
    } catch (V.a a1) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
    } 
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add(this.d, "South");
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add(this.c, "East");
    jPanel2.add(this.f, "Center");
    this.f.setVisible(false);
    this.f.setLayout(new BorderLayout(4, 4));
    this.f.add(new JLabel(g.b("Backup saved to") + ": "), "West");
    this.f.add((Component)this.e, "Center");
    jPanel1.add(jPanel2, "Center");
    add(jPanel1, "South");
    this.c.addActionListener(new b(this));
  }
  
  private void c() {
    this.g = f.a().a(this);
  }
  
  public void a() {
    this.c.setEnabled(false);
    this.d.setValue(0);
  }
  
  public void a(double paramDouble) {
    this.d.setValue((int)Math.round(paramDouble + 100.0D));
  }
  
  public void b() {
    this.f.setVisible(true);
    this.e.a(this.g);
    this.d.setValue(100);
  }
  
  public boolean g_() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */