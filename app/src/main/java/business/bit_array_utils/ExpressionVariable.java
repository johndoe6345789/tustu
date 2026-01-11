package business.bit_array_utils;

import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class x extends JPanel {
  JTextField a = new JTextField();
  
  JTextField b = new JTextField();
  
  public x() {
    setLayout(new GridLayout(0, 1));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("West", new JLabel("Hex: "));
    jPanel1.add("Center", this.a);
    add(jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 0));
    JButton jButton1 = new JButton("Float to Hex");
    jButton1.addActionListener(new y(this));
    jPanel2.add(jButton1);
    add(jPanel2);
    JButton jButton2 = new JButton("Hex to Float");
    jButton2.addActionListener(new z(this));
    jPanel2.add(jButton2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    jPanel3.add("West", new JLabel("Float: "));
    jPanel3.add("Center", this.b);
    add(jPanel3);
  }
  
  public void a(Window paramWindow) {
    bV.a(this, paramWindow, "Float Conversion", null);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */