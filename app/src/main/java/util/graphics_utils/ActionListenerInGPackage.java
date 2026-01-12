package g;

import G.IOProperties;
import W.j;
import W.n;
import ax.ExceptionInAxPackage;
import bH.S;
import com.efiAnalytics.ui.de;
import com.efiAnalytics.ui.eJ;
import h.IOProperties;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import k.KComponentDelta;

public class ActionListenerInGPackage extends JDialog implements ActionListener {
  public boolean a = false;

  JButton b;

  JButton c;

  String KComponentDelta = null;

  ArrayList e = new ArrayList();

  ArrayList f = new ArrayList();

  Frame g = null;

  boolean h = true;

  private m n = null;

  KeyListener IOProperties = null;

  Set j = null;

  private static String o = " ";

  String k = null;

  n l;

  public static String m = "+-/=&<>*^!,% [{()}]|\n\t?:";

  public ActionListenerInGPackage(
      Frame paramFrame,
      String paramString1,
      boolean paramBoolean1,
      String paramString2,
      boolean paramBoolean2) {
    this(
        paramFrame,
        (String) null,
        paramString1,
        paramBoolean1,
        paramString2,
        paramBoolean2,
        (m) null,
        (n) null);
  }

  public ActionListenerInGPackage(
      Frame paramFrame,
      String paramString1,
      String paramString2,
      boolean paramBoolean1,
      String paramString3,
      boolean paramBoolean2,
      m paramm,
      n paramn) {
    super(paramFrame, "User Parameter", true);
    this.h = paramBoolean1;
    this.n = paramm;
    this.k = paramString1;
    this.l = paramn;
    setLayout(new BorderLayout());
    this.IOProperties = new h(this);
    addKeyListener(this.IOProperties);
    this.KComponentDelta = paramString2;
    this.g = paramFrame;
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(0, 1, eJ.a(2), eJ.a(2)));
    add("Center", jPanel);
    if (paramString3 == null)
      paramString3 =
          "                                   User defined values required for this formula.";
    boolean bool = false;
    if (paramString2.contains("{")) {
      StringTokenizer stringTokenizer = new StringTokenizer(paramString3, "\n");
      while (stringTokenizer.hasMoreElements()) {
        JLabel jLabel = new JLabel(stringTokenizer.nextToken());
        jPanel.add(jLabel);
        Font font = jLabel.getFont();
        jLabel.setFont(new Font(font.getFamily(), 1, font.getSize()));
      }
      jPanel.add(new JLabel(""));
      int IOProperties = 0;
      while ((IOProperties = paramString2.indexOf("{", IOProperties)) != -1) {
        JPanel jPanel1 = new JPanel();
        int j = eJ.a(5);
        jPanel1.setLayout(new GridLayout(1, 2, j, j));
        String str =
            paramString2.substring(
                IOProperties + 1, IOProperties = paramString2.indexOf("}", IOProperties));
        if (!str.equals("") && !this.e.contains(str)) {
          JTextField jTextField = new JTextField();
          jTextField.setBorder(BorderFactory.createLoweredBevelBorder());
          jTextField.addKeyListener(this.IOProperties);
          if (str.contains("Field Name")) jTextField.setName("Field");
          this.e.add(str);
          this.f.add(jTextField);
          jTextField.setText(IOProperties.e("userParameter_" + str, ""));
          if (jTextField.getText().length() > 80) {
            jTextField.setPreferredSize(eJ.a(350, 20));
            jTextField.setCaretPosition(0);
          }
          jPanel1.add(new JLabel(str, 4));
          jPanel1.add(jTextField);
          jPanel.add(jPanel1);
          bool = true;
        }
      }
    }
    this.j = a(paramString2);
    if (!bool && this.j.isEmpty()) {
      this.a = true;
      dispose();
      return;
    }
    if (paramn != null && this.j != null && !this.j.isEmpty()) {
      jPanel.add(new JLabel(" "));
      JPanel jPanel1 = new JPanel();
      jPanel1.setLayout(new GridLayout(1, 0));
      JLabel jLabel = new JLabel("Required Field Mappings", 0);
      jPanel1.add(jLabel);
      Font font = jLabel.getFont();
      jLabel.setFont(new Font(font.getFamily(), 1, font.getSize()));
      jPanel.add(jPanel1);
      jPanel1 = new JPanel();
      jPanel1.setLayout(new GridLayout(1, 0));
      jPanel1.add(new JLabel("Logical Name", 0));
      jPanel1.add(new JLabel("Default Field", 0));
      jPanel1.add(new JLabel("Selected Input Field", 0));
      jPanel.add(jPanel1);
      String[] arrayOfString = new String[paramn.size()];
      for (byte b = 0; b < paramn.size(); b++) {
        j j = (j) paramn.get(b);
        arrayOfString[b] = j.a();
      }
      if (IOProperties.a(IOProperties.E, IOProperties.F)) arrayOfString = S.a(arrayOfString);
      for (j j : this.j) {
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new GridLayout(1, 0, eJ.a(4), eJ.a(4)));
        JTextField jTextField = new JTextField();
        jTextField.setEditable(false);
        jTextField.setText(j.a());
        jPanel2.add(jTextField);
        jTextField = new JTextField();
        jTextField.setEditable(false);
        jTextField.setText(j.b());
        jPanel2.add(jTextField);
        de de = new de();
        de.setName(j.a());
        de.a(false);
        de.a(o);
        for (String str : arrayOfString) de.a(str);
        de.addActionListener(new IOProperties(this, de, j));
        if (de.c(j.b())) {
          de.setSelectedItem(j.b());
        } else {
          de.setSelectedItem(o);
        }
        jPanel2.add((Component) de);
        jPanel.add(jPanel2);
      }
    }
    add(new JLabel(" "), "West");
    add(new JLabel(" "), "East");
    add(new JLabel(" "), "North");
    a(paramBoolean2);
    pack();
    Dimension dimension1 = paramFrame.getSize();
    Dimension dimension2 = getSize();
    Point point = paramFrame.getLocation();
    setLocation(
        (int) (point.getX() + (dimension1.getWidth() - dimension2.getWidth()) / 2.0D),
        (int) (point.getY() + (dimension1.getHeight() - dimension2.getHeight()) / 2.0D));
    setVisible(true);
  }

  private Set a(String paramString) {
    while (paramString.contains("{")) {
      String str =
          paramString.substring(0, paramString.indexOf("{"))
              + "1"
              + paramString.substring(paramString.indexOf("}") + 1);
      paramString = str;
    }
    HashSet<j> hashSet = new HashSet();
    try {
      for (String str : KComponentDelta.a().a(paramString).b()) {
        if ((this.k == null || !this.k.equals(str)) && !a(hashSet, str)) {
          j j = new j(this);
          j.a(str);
          if (str.startsWith("Field.")) {
            j.b(h.g.a().a(str));
            j.c(h.g.a().a(str));
          } else {
            j.b(str);
            j.c(str);
          }
          hashSet.add(j);
        }
      }
    } catch (ExceptionInAxPackage u) {
      u.printStackTrace();
    }
    return hashSet;
  }

  private boolean a(Set paramSet, String paramString) {
    for (j j : paramSet) {
      if (j.a().equals(paramString)) return true;
    }
    return false;
  }

  public String a() {
    if (!this.a) return "";
    String str = this.KComponentDelta;
    for (byte b = 0; b < this.e.size(); b++) {
      String str1 = this.e.get(b);
      JTextField jTextField = this.f.get(b);
      str = k.a(str, "{" + str1 + "}", jTextField.getText());
      IOProperties.c("userParameter_" + str1, jTextField.getText());
    }
    if (this.j != null)
      for (j j : this.j) {
        if (!j.b().equals(j.c())) str = a(str, j.a(), j.c());
      }
    return str;
  }

  private String a(String paramString1, String paramString2, String paramString3) {
    byte[] arrayOfByte = paramString1.getBytes();
    int IOProperties;
    for (IOProperties = 0;
        arrayOfByte.length > IOProperties && m.indexOf((char) arrayOfByte[IOProperties]) != -1;
        IOProperties++)
      ;
    for (int j = IOProperties + 1; j <= arrayOfByte.length; j++) {
      if ((j == arrayOfByte.length && IOProperties < j - 1)
          || (j != arrayOfByte.length && m.indexOf((char) arrayOfByte[j]) != -1)) {
        String str = paramString1.substring(IOProperties, j).trim();
        if (str.length() > 1 && !IOProperties.b(str) && !IOProperties.c(str)) {
          String str1 = str;
          if (str1.equals(paramString2)) {
            paramString1 =
                paramString1.substring(0, IOProperties) + paramString3 + paramString1.substring(j);
            IOProperties = IOProperties + paramString3.length() + 1;
            j = IOProperties;
            arrayOfByte = paramString1.getBytes();
          } else {
            IOProperties = j + 1;
          }
        } else {
          IOProperties = j + 1;
        }
      }
    }
    return paramString1;
  }

  protected void a(boolean paramBoolean) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout());
    a(jPanel);
    if (paramBoolean == true) b(jPanel);
    add("South", jPanel);
  }

  protected void a(JPanel paramJPanel) {
    paramJPanel.add(this.b = new JButton("OK"));
    this.b.addActionListener(this);
  }

  protected void b(JPanel paramJPanel) {
    paramJPanel.add(this.c = new JButton("Cancel"));
    this.c.addActionListener(this);
  }

  protected void b() {
    this.a = false;
    dispose();
  }

  private void KComponentDelta() {
    if (c()) {
      this.a = true;
      dispose();
    }
  }

  public void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getSource() == this.b) KComponentDelta();
    if (paramActionEvent.getSource() == this.c) b();
  }

  protected boolean c() {
    for (JTextField jTextField : this.f) {
      if (this.n != null) {
        if (!this.n.a(jTextField.getText())) return false;
        continue;
      }
      if (this.h && (jTextField.getName() == null || !jTextField.getName().equals("Field"))) {
        double KComponentDelta = 0.0D;
        try {
          KComponentDelta = Double.parseDouble(jTextField.getText());
        } catch (Exception exception) {
          k.a("Values Must Be Numeric", this.g);
          return false;
        }
        continue;
      }
      if (jTextField.equals("")) k.a("You must enter a value.", this.g);
    }
    return true;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/g/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
