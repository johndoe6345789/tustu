package aP;

import bQ.BqInterfaceCharlie;
import bQ.BqInterfaceDelta;
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

public class JDialogExtension extends JDialog implements BqInterfaceDelta {
  JTextPane a = new JTextPane();
  
  JTextPane b = new JTextPane();
  
  JTextPane BqInterfaceCharlie = new JTextPane();
  
  JLabel BqInterfaceDelta = new JLabel("", 2);
  
  JLabel e = new JLabel("", 2);
  
  JLabel f = new JLabel("", 2);
  
  public JDialogExtension(Window paramWindow) {
    super(paramWindow, "DAQ Report");
    setDefaultCloseOperation(2);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(1, 0, 5, 5));
    jPanel.add(new JLabel("Max ODT's:", 4));
    jPanel.add(this.BqInterfaceDelta);
    jPanel.add(new JLabel("Max ODT Entries's:", 4));
    jPanel.add(this.e);
    jPanel.add(new JLabel("Max Entry Size:", 4));
    jPanel.add(this.f);
    add("North", jPanel);
    Font font = new Font("Monospaced", 0, eJ.a(12));
    this.a.setFont(font);
    this.b.setFont(font);
    this.BqInterfaceCharlie.setFont(font);
    JTabbedPane jTabbedPane = new JTabbedPane(3);
    JScrollPane jScrollPane = new JScrollPane(this.BqInterfaceCharlie);
    jTabbedPane.add("ODTs", jScrollPane);
    jScrollPane = new JScrollPane(this.b);
    jTabbedPane.add("Channels", jScrollPane);
    jScrollPane = new JScrollPane(this.a);
    jTabbedPane.add("Buffer Ranges", jScrollPane);
    add("Center", jTabbedPane);
    b();
    BqInterfaceCharlie.a().a(this);
    setSize(1024, 800);
    setVisible(true);
    bV.a(paramWindow, this);
  }
  
  public void dispose() {
    BqInterfaceCharlie.a().b(this);
    super.dispose();
  }
  
  private void b() {
    this.BqInterfaceDelta.setText(BqInterfaceCharlie.a().f() + "");
    this.e.setText(BqInterfaceCharlie.a().g() + "");
    this.f.setText(BqInterfaceCharlie.a().e() + "");
    if (BqInterfaceCharlie.a().BqInterfaceCharlie() != null)
      this.b.setText(BqInterfaceCharlie.b(BqInterfaceCharlie.a().BqInterfaceCharlie())); 
    if (BqInterfaceCharlie.a().b() != null)
      this.a.setText(BqInterfaceCharlie.a(BqInterfaceCharlie.a().b())); 
    if (BqInterfaceCharlie.a().BqInterfaceDelta() != null)
      this.BqInterfaceCharlie.setText(BqInterfaceCharlie.BqInterfaceCharlie(BqInterfaceCharlie.a().BqInterfaceDelta())); 
  }
  
  public void a() {
    b();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */