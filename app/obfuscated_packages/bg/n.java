package bg;

import G.bf;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class n extends JPanel {
  JTextField a = new JTextField("", 20);
  
  JTextField b = new JTextField("", 20);
  
  bf c = null;
  
  public n() {
    setLayout(new GridLayout(1, 0));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("West", new JLabel("Tune View Reference Name:"));
    jPanel.add("Center", this.a);
    add(jPanel);
    jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("West", new JLabel("Tune View Tab Title:"));
    jPanel.add("Center", this.b);
    add(jPanel);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bg/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */