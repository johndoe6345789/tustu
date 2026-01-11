package aY;

import G.R;
import G.aI;
import G.i;
import V.g;
import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class l extends JDialog {
  JTextField a = new JTextField("", 40);
  
  JTextField b = new JTextField("", 40);
  
  R c = null;
  
  public l(Window paramWindow, R paramR) {
    super(paramWindow, "Expression Evaluator");
    this.c = paramR;
    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(BorderFactory.createTitledBorder("Expression Evaluator"));
    jPanel1.setLayout(new BorderLayout(5, 5));
    add("Center", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(0, 1));
    jPanel2.add(new JLabel("Expression:"));
    jPanel2.add(this.a);
    jPanel2.add(new JLabel("Result:"));
    jPanel2.add(this.b);
    jPanel1.add("Center", jPanel2);
    JButton jButton1 = new JButton("Evaluate Expression");
    jButton1.addActionListener(new m(this));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    jPanel3.add("West", jButton1);
    JButton jButton2 = new JButton("Close");
    jButton2.addActionListener(new n(this));
    jPanel3.add("East", jButton2);
    jPanel1.add("South", jPanel3);
    pack();
  }
  
  protected void a() {
    try {
      double d = i.a((aI)this.c, " " + this.a.getText() + " ");
      this.b.setText("" + d);
    } catch (g g) {
      bV.d("Error:" + g.getMessage(), this);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aY/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */