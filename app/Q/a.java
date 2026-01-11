package Q;

import R.k;
import R.m;
import bH.D;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.dq;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import s.g;

public class a extends JPanel implements dq {
  JTextPane a = new JTextPane();
  
  JTextPane b = new JTextPane();
  
  JTextPane c = new JTextPane();
  
  String d = null;
  
  String e = null;
  
  String f = null;
  
  String g = null;
  
  String h = null;
  
  String i = null;
  
  int j = 5;
  
  String k = null;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6) {
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramString5;
    this.i = paramString6;
    setBorder(BorderFactory.createLoweredBevelBorder());
    this.k = "<html><font size=\"" + eJ.a(12) + "\"><center><strong>" + g.b(paramString4 + " " + paramString5 + " Review") + "</strong></font></center><br>" + g.b("Briefly tell us about your experience using " + paramString4 + " " + paramString5) + ".<br> <br></html>";
    this.a.setContentType("text/html");
    this.a.setText(this.k);
    this.a.setEditable(false);
    this.a.setOpaque(true);
    setLayout(new BorderLayout());
    add("North", this.a);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.setBorder(BorderFactory.createTitledBorder(""));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(0));
    jPanel2.add(new JLabel(g.b("Overall Rating (5-Good, 1-Problematic)") + ":"));
    b b = new b(this);
    ButtonGroup buttonGroup = new ButtonGroup();
    JRadioButton jRadioButton = new JRadioButton("5", true);
    jRadioButton.addActionListener(b);
    buttonGroup.add(jRadioButton);
    jPanel2.add(jRadioButton);
    jRadioButton = new JRadioButton("4", false);
    jRadioButton.addActionListener(b);
    buttonGroup.add(jRadioButton);
    jPanel2.add(jRadioButton);
    jRadioButton = new JRadioButton("3", false);
    jRadioButton.addActionListener(b);
    buttonGroup.add(jRadioButton);
    jPanel2.add(jRadioButton);
    jRadioButton = new JRadioButton("2", false);
    jRadioButton.addActionListener(b);
    buttonGroup.add(jRadioButton);
    jPanel2.add(jRadioButton);
    jRadioButton = new JRadioButton("1", false);
    jRadioButton.addActionListener(b);
    buttonGroup.add(jRadioButton);
    jPanel2.add(jRadioButton);
    jPanel1.add("North", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(2, 1));
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    jPanel4.add("North", new JLabel(g.b("Good Experiences") + ":"));
    this.b.setEditable(true);
    JScrollPane jScrollPane = new JScrollPane(this.b);
    jPanel4.add("Center", jScrollPane);
    jPanel3.add(jPanel4);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout());
    jPanel5.add("North", new JLabel(g.b("Improvements you would like to see") + ":"));
    this.c.setEditable(true);
    jScrollPane = new JScrollPane(this.c);
    jPanel5.add("Center", jScrollPane);
    jPanel3.add(jPanel5);
    jPanel1.add("Center", jPanel3);
    add("Center", jPanel1);
  }
  
  public void a(Component paramComponent) {
    JDialog jDialog = new JDialog(bV.a(paramComponent), g.b("User Feedback"));
    jDialog.add("Center", this);
    JButton jButton1 = new JButton(g.b("Complete Later"));
    c c = new c(this, this, jDialog);
    jButton1.addActionListener(c);
    JButton jButton2 = new JButton(g.b("Submit Review"));
    jButton2.setDefaultCapable(true);
    d d = new d(this, this, jDialog);
    jButton2.addActionListener(d);
    jDialog.enableInputMethods(true);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    if (bV.d()) {
      jPanel.add(jButton2);
      jPanel.add(jButton1);
    } else {
      jPanel.add(jButton1);
      jPanel.add(jButton2);
    } 
    jDialog.add("South", jPanel);
    jDialog.pack();
    jDialog.setSize(eJ.a(640), eJ.a(480));
    bV.a(bV.a(paramComponent), jDialog);
    jDialog.setVisible(true);
  }
  
  public boolean a() {
    m m = new m();
    String str = g.c().getLanguage() + "\nPros:\n" + this.b.getText() + "\nWant:\n" + this.c.getText();
    try {
      boolean bool = !m.a(this.d, this.e, this.f, this.g, this.h, this.i, this.j, str) ? true : false;
      D.c("UserReview Queued:" + bool);
    } catch (k k) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)k);
    } 
    return true;
  }
  
  public boolean b() {
    bV.d(g.b("You can return to the User Review Dialog at any time.") + "\n" + g.b("Check the Main Menubar under Help"), this);
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/Q/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */