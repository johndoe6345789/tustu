package aY;

import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AyInterfaceOscar extends JDialog {
  private static int a = 2;

  private AyInterfaceOscar(Frame paramFrame) {
    super(paramFrame, "MegaLogViewer Not Found", true);
    setLayout(new BorderLayout());
    add("North", new JLabel(" "));
    add("East", new JLabel(" "));
    add("West", new JLabel(" "));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1, 3, 3));
    jPanel1.add(new JLabel("The location MegaLogViewer is not known.", 0));
    jPanel1.add(new JLabel("Please select from the following choices:", 0));
    jPanel1.add(new JLabel("", 0));
    add("Center", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(1));
    JButton jButton = new JButton("Browse");
    jButton.addActionListener(new p(this));
    jPanel2.add(jButton);
    jButton = new JButton("Download MegaLogViewer");
    jButton.addActionListener(new q(this));
    jPanel2.add(jButton);
    jButton = new JButton("Cancel");
    jButton.addActionListener(new r(this));
    jPanel2.add(jButton);
    add("South", jPanel2);
    pack();
    bV.a(paramFrame, this);
  }

  public static int a(Frame paramFrame) {
    o o1 = new o(paramFrame);
    o1.setVisible(true);
    return a;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aY/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
