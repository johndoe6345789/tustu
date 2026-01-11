package business.button_builders;

import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import s.SComponentGolf;

public class BbInterfacePapa extends JPanel {
  final p a = this;
  
  JPanel b = new r(this);
  
  JPanel c = null;
  
  JLabel d = new JLabel("", 0);
  
  JLabel e = new JLabel(SComponentGolf.b("Please click Checkbox to continue."), 0);
  
  public BbInterfacePapa(String paramString) {
    this.d.setText(paramString);
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("North", this.d);
    jPanel1.add("South", this.e);
    this.e.setVisible(false);
    add("North", jPanel1);
    Font font = new Font("Dialog", 1, eJ.a() * 2);
    this.d.setFont(font);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(1));
    jPanel2.add(this.b);
    add("Center", jPanel2);
    this.b.setLayout(new BoxLayout(this.b, 1));
  }
  
  public synchronized boolean a(String paramString) {
    q q = new q(this, paramString);
    SwingUtilities.invokeLater(q);
    try {
      wait();
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(p.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    return true;
  }
  
  private void b(String paramString) {
    s s = new s(this);
    s.a(paramString);
    this.b.add(s);
    this.d.setText(SComponentGolf.b("Attention!!"));
    this.e.setVisible(true);
    this.e.repaint();
    validate();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */