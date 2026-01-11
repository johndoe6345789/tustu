package aP;

import bQ.c;
import bQ.d;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;

public class aV extends JDialog implements d {
  JTextPane a = new JTextPane();
  
  JTextPane b = new JTextPane();
  
  JTextPane c = new JTextPane();
  
  JLabel d = new JLabel("", 2);
  
  JLabel e = new JLabel("", 2);
  
  JLabel f = new JLabel("", 2);
  
  public aV(Window paramWindow) {
    super(paramWindow, "DAQ Report");
    setDefaultCloseOperation(2);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(1, 0, 5, 5));
    jPanel.add(new JLabel("Max ODT's:", 4));
    jPanel.add(this.d);
    jPanel.add(new JLabel("Max ODT Entries's:", 4));
    jPanel.add(this.e);
    jPanel.add(new JLabel("Max Entry Size:", 4));
    jPanel.add(this.f);
    add("North", jPanel);
    Font font = new Font("Monospaced", 0, eJ.a(12));
    this.a.setFont(font);
    this.b.setFont(font);
    this.c.setFont(font);
    JTabbedPane jTabbedPane = new JTabbedPane(3);
    JScrollPane jScrollPane = new JScrollPane(this.c);
    jTabbedPane.add("ODTs", jScrollPane);
    jScrollPane = new JScrollPane(this.b);
    jTabbedPane.add("Channels", jScrollPane);
    jScrollPane = new JScrollPane(this.a);
    jTabbedPane.add("Buffer Ranges", jScrollPane);
    add("Center", jTabbedPane);
    b();
    c.a().a(this);
    setSize(1024, 800);
    setVisible(true);
    bV.a(paramWindow, this);
  }
  
  public void dispose() {
    c.a().b(this);
    super.dispose();
  }
  
  private void b() {
    this.d.setText(c.a().f() + "");
    this.e.setText(c.a().g() + "");
    this.f.setText(c.a().e() + "");
    if (c.a().c() != null)
      this.b.setText(c.b(c.a().c())); 
    if (c.a().b() != null)
      this.a.setText(c.a(c.a().b())); 
    if (c.a().d() != null)
      this.c.setText(c.c(c.a().d())); 
  }
  
  public void a() {
    b();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */