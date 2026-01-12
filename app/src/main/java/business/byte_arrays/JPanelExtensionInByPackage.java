package business.byte_arrays;

import bH.X;
import bH.ab;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JPanelExtensionInByPackage extends JPanel {
  m a;

  List b;

  ab c;

  JTextArea d = new JTextArea("", 4, 40);

  public JPanelExtensionInByPackage(List paramList, m paramm, ab paramab) {
    this.b = paramList;
    this.a = paramm;
    this.c = paramab;
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    this.d.setBorder(BorderFactory.createBevelBorder(1));
    this.d.setLineWrap(true);
    this.d.setWrapStyleWord(true);
    jPanel1.add(this.d, "Center");
    this.d.addMouseListener(new e(this));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(0, eJ.a(1), eJ.a(1)));
    f f = new f(this);
    Dimension dimension = new Dimension(eJ.a(28), eJ.a(26));
    Insets insets = new Insets(0, 0, 0, 0);
    JButton jButton = new JButton("+");
    jButton.setActionCommand("+");
    jButton.setPreferredSize(dimension);
    jButton.setMargin(insets);
    jButton.addActionListener(f);
    jPanel2.add(jButton);
    jButton = new JButton("-");
    jButton.setPreferredSize(dimension);
    jButton.setMargin(insets);
    jButton.setActionCommand("-");
    jButton.addActionListener(f);
    jPanel2.add(jButton);
    jButton = new JButton("/");
    jButton.setPreferredSize(dimension);
    jButton.setMargin(insets);
    jButton.setActionCommand("/");
    jButton.addActionListener(f);
    jPanel2.add(jButton);
    jButton = new JButton("*");
    jButton.setPreferredSize(dimension);
    jButton.setMargin(insets);
    jButton.setActionCommand("*");
    jButton.addActionListener(f);
    jPanel2.add(jButton);
    jButton = new JButton("%");
    jButton.setPreferredSize(dimension);
    jButton.setMargin(insets);
    jButton.setActionCommand("%");
    jButton.addActionListener(f);
    jPanel2.add(jButton);
    jButton = new JButton("&");
    jButton.setPreferredSize(dimension);
    jButton.setMargin(insets);
    jButton.setActionCommand("&");
    jButton.addActionListener(f);
    jPanel2.add(jButton);
    jButton = new JButton("|");
    jButton.setPreferredSize(dimension);
    jButton.setMargin(insets);
    jButton.setActionCommand("|");
    jButton.addActionListener(f);
    jPanel2.add(jButton);
    jButton = new JButton(">");
    jButton.setPreferredSize(dimension);
    jButton.setMargin(insets);
    jButton.setActionCommand(">");
    jButton.addActionListener(f);
    jPanel2.add(jButton);
    jButton = new JButton("<");
    jButton.setPreferredSize(dimension);
    jButton.setMargin(insets);
    jButton.setActionCommand("<");
    jButton.addActionListener(f);
    jPanel2.add(jButton);
    jButton = new JButton("!=");
    jButton.setPreferredSize(dimension);
    jButton.setMargin(insets);
    jButton.setActionCommand("!=");
    jButton.addActionListener(f);
    jPanel2.add(jButton);
    jButton = new JButton("Not");
    jButton.setPreferredSize(dimension);
    jButton.setMargin(insets);
    jButton.setActionCommand("!");
    jButton.addActionListener(f);
    jPanel2.add(jButton);
    jButton = new JButton("And");
    jButton.setPreferredSize(dimension);
    jButton.setMargin(insets);
    jButton.setActionCommand("&&");
    jButton.addActionListener(f);
    jPanel2.add(jButton);
    jButton = new JButton("Or");
    jButton.setPreferredSize(dimension);
    jButton.setMargin(insets);
    jButton.setActionCommand("||");
    jButton.addActionListener(f);
    jPanel2.add(jButton);
    jButton = new JButton("(");
    jButton.setPreferredSize(dimension);
    jButton.setMargin(insets);
    jButton.setActionCommand("(");
    jButton.addActionListener(f);
    jPanel2.add(jButton);
    jButton = new JButton(")");
    jButton.setPreferredSize(dimension);
    jButton.setMargin(insets);
    jButton.setActionCommand(")");
    jButton.addActionListener(f);
    jPanel2.add(jButton);
    jPanel1.add(jPanel2, "South");
    add(jPanel1, "North");
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(1, 0, eJ.a(4), eJ.a(4)));
    for (i i : paramList) {
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new GridLayout(1, 1));
      jPanel.setBorder(BorderFactory.createTitledBorder(e(i.a())));
      List list1 = i.b();
      JList jList1 = new JList(list1.toArray((Object[]) new String[list1.size()]));
      JScrollPane jScrollPane1 = new JScrollPane(jList1);
      jList1.addMouseListener(new g(this));
      jScrollPane1.setPreferredSize(new Dimension(eJ.a(180), eJ.a(150)));
      jPanel.add(jScrollPane1);
      jPanel3.add(jPanel);
    }
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new GridLayout(1, 1));
    jPanel4.setBorder(BorderFactory.createTitledBorder(e("Functions")));
    List list = paramm.a();
    JList jList = new JList(list.toArray((Object[]) new k[list.size()]));
    JScrollPane jScrollPane = new JScrollPane(jList);
    jList.addMouseListener(new h(this));
    jScrollPane.setPreferredSize(new Dimension(eJ.a(180), eJ.a(150)));
    jPanel4.add(jScrollPane);
    jPanel3.add(jPanel4);
    add(jPanel3, "Center");
  }

  private String e(String paramString) {
    return (this.c != null) ? this.c.a(paramString) : paramString;
  }

  public void a(String paramString) {
    this.d.append(" " + paramString + " ");
  }

  public void a() {
    String str = this.d.getText();
    int i = this.d.getCaretPosition();
    if (i > 0
        && this.d.getSelectedText() == null
        && str.lastIndexOf("[", i) != -1
        && str.indexOf("]", i) != -1) {
      int j = str.lastIndexOf("[", i);
      int k = str.indexOf("[", j + 1);
      int n = str.indexOf("]", i) + 1;
      if (j != -1 && n != -1 && (k == -1 || n < k)) {
        this.d.setSelectionStart(j);
        this.d.setSelectionEnd(n);
      }
    }
  }

  public void b(String paramString) {
    if (this.d.getSelectedText() != null && !this.d.getSelectedText().isEmpty()) {
      int i = this.d.getSelectionStart();
      String str1 = this.d.getText();
      String str2 =
          str1.substring(0, i)
              + " "
              + paramString
              + " "
              + str1.substring(this.d.getSelectionEnd(), str1.length());
      this.d.setText(str2);
    } else {
      this.d.insert(" " + paramString + " ", this.d.getCaretPosition());
    }
  }

  public void c(String paramString) {
    b(paramString);
  }

  public void a(k paramk) {
    b(paramk.a());
  }

  public String b() {
    null = this.d.getText();
    return X.b(null, "\n", " ");
  }

  public void d(String paramString) {
    this.d.setText(paramString);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/by/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
