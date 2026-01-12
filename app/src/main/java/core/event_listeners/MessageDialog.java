package ao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class eJ extends JDialog implements ActionListener {
  boolean a = false;

  JButton b;

  JButton c;

  public eJ(Frame paramFrame, String paramString, boolean paramBoolean) {
    super(paramFrame, "Message", true);
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(0, 1));
    add("Center", jPanel);
    StringTokenizer stringTokenizer = new StringTokenizer(paramString, "\n");
    while (stringTokenizer.hasMoreElements()) {
      JLabel jLabel = new JLabel(stringTokenizer.nextToken(), 0);
      if (jLabel.getText().startsWith("!")) jLabel.setBackground(Color.red);
      jPanel.add(jLabel);
    }
    add(new JLabel(""), "West");
    add(new JLabel(""), "East");
    add(new JLabel(""), "North");
    a(paramBoolean);
    pack();
    Dimension dimension1 = paramFrame.getSize();
    Dimension dimension2 = getSize();
    Point point = paramFrame.getLocation();
    if (point.getX() <= 0.0D || point.getY() <= 0.0D) {
      dimension1 = Toolkit.getDefaultToolkit().getScreenSize();
      setLocation(
          (int) (point.getX() + (dimension1.getWidth() - dimension2.getWidth()) / 2.0D),
          (int) (point.getY() + (dimension1.getHeight() - dimension2.getHeight()) / 2.0D));
    } else {
      setLocation(
          (int) (point.getX() + (dimension1.getWidth() - dimension2.getWidth()) / 2.0D),
          (int) (point.getY() + (dimension1.getHeight() - dimension2.getHeight()) / 2.0D));
    }
    setVisible(true);
  }

  protected void a(boolean paramBoolean) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout());
    a(jPanel);
    if (paramBoolean == true) b(jPanel);
    add("South", jPanel);
  }

  protected void a(JPanel paramJPanel) {
    paramJPanel.add(this.b = new JButton("Yes"));
    this.b.addActionListener(this);
  }

  protected void b(JPanel paramJPanel) {
    paramJPanel.add(this.c = new JButton("No"));
    this.c.addActionListener(this);
  }

  public void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getSource() == this.b) {
      this.a = true;
      setVisible(false);
    } else if (paramActionEvent.getSource() == this.c) {
      setVisible(false);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/eJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
