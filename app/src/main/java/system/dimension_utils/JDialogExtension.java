package aN;

import W.WInterfaceAp;
import bH.X;
import bH.c;
import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class JDialogExtension extends JDialog {
  JTextPane a;

  JTextPane b;

  JTextField c = new JTextField();

  JTextField d = new JTextField();

  JLabel e = new JLabel("<html> <br> </html>");

  JButton f;

  WInterfaceAp g = null;

  public JDialogExtension(Frame paramFrame, WInterfaceAp paramap) {
    super(paramFrame);
    setTitle("Binary File Difference");
    setDefaultCloseOperation(2);
    this.g = paramap;
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(5, 5));
    jPanel1.setBorder(BorderFactory.createTitledBorder("Binary Difference Report"));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(5, 5));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(0, 1, 4, 4));
    jPanel3.add(a(this.c, "File 1:"));
    jPanel3.add(a(this.d, "File 2:"));
    jPanel2.add("North", jPanel3);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    jPanel4.add("North", new JLabel("Different Addresses:"));
    this.b = new JTextPane();
    this.b.setEditable(false);
    this.b.setPreferredSize(new Dimension(300, 100));
    JScrollPane jScrollPane = new JScrollPane(this.b);
    jPanel4.add("Center", jScrollPane);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout(5, 5));
    this.f = new JButton("Perform Difference");
    this.f.addActionListener(new b(this));
    jPanel5.add("East", this.f);
    jPanel5.add("Center", this.e);
    this.e.setFont(new Font("DialogInput", 0, 13));
    jPanel2.add("South", jPanel5);
    jPanel1.add("North", jPanel2);
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new GridLayout(1, 1, 5, 5));
    this.a = new JTextPane();
    this.a.setEditable(false);
    jScrollPane = new JScrollPane(this.a);
    this.a.setFont(new Font("DialogInput", 1, 13));
    jScrollPane.setMinimumSize(new Dimension(400, 500));
    jScrollPane.setBorder(BorderFactory.createLoweredBevelBorder());
    jPanel6.add(jScrollPane);
    jPanel1.add("Center", jPanel6);
    add("Center", jPanel1);
    this.a.addCaretListener(new c(this));
    b();
  }

  private JPanel a(JTextField paramJTextField, String paramString) {
    JPanel jPanel = new JPanel();
    paramJTextField.setBorder(BorderFactory.createLoweredBevelBorder());
    jPanel.setLayout(new BorderLayout(5, 5));
    jPanel.add("West", new JLabel(paramString));
    jPanel.add("Center", paramJTextField);
    JButton jButton = new JButton("Select File");
    jPanel.add("East", jButton);
    jButton.addActionListener(new d(this, paramJTextField));
    return jPanel;
  }

  private void a() {
    String str1 = b(this.a.getSelectedText());
    String str2 = b(c(this.a.getSelectedText()));
    if (str1.length() > 0) {
      BigInteger bigInteger1 = new BigInteger(str1, 16);
      BigInteger bigInteger2 = new BigInteger(str2, 16);
      String str =
          "<html>Big endian Decimal: "
              + bigInteger1.toString(10)
              + ", Bin: "
              + bigInteger1.toString(2)
              + "<br>Lit endian Decimal: "
              + bigInteger2.toString(10)
              + ", Bin: "
              + bigInteger2.toString(2)
              + "</html>";
      this.e.setText(str);
    } else {
      this.e.setText("");
    }
  }

  private String b(String paramString) {
    paramString = X.b(paramString, "x0", "");
    paramString = X.b(paramString, "x", "");
    paramString = X.b(paramString, "\"", "");
    paramString = X.b(paramString, "\n", "");
    paramString = X.b(paramString, "\t", "");
    return X.b(paramString, " ", "");
  }

  private String c(String paramString) {
    String[] arrayOfString = paramString.split("x");
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = arrayOfString.length - 1; i >= 0; i--) stringBuilder.append(arrayOfString[i]);
    return stringBuilder.toString();
  }

  private void a(String paramString1, String paramString2) {
    if (this.g != null) this.g.a(paramString1, paramString2);
  }

  private String b(String paramString1, String paramString2) {
    return (this.g != null) ? this.g.b(paramString1, paramString2) : paramString2;
  }

  private void b() {
    if ((new File(this.c.getText())).exists() && (new File(this.d.getText())).exists()) {
      this.f.setEnabled(true);
    } else {
      this.f.setEnabled(false);
    }
  }

  private void c() {
    int[] arrayOfInt1;
    int[] arrayOfInt2;
    try {
      arrayOfInt1 = a(this.c.getText());
    } catch (FileNotFoundException fileNotFoundException) {
      bV.d("File not found:\n" + this.c.getText(), this);
      return;
    } catch (IOException iOException) {
      bV.d(
          "Error loading file '" + iOException.getLocalizedMessage() + "':\n" + this.c.getText(),
          this);
      return;
    }
    try {
      arrayOfInt2 = a(this.d.getText());
    } catch (FileNotFoundException fileNotFoundException) {
      bV.d("File not found:\n" + this.c.getText(), this);
      return;
    } catch (IOException iOException) {
      bV.d(
          "Error loading file '" + iOException.getLocalizedMessage() + "':\n" + this.c.getText(),
          this);
      return;
    }
    this.a.setText(c.a(arrayOfInt1, arrayOfInt2));
    this.a.setCaretPosition(0);
  }

  protected int[] a(String paramString) {
    File file = new File(paramString);
    FileInputStream fileInputStream = new FileInputStream(file);
    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
    ArrayList<Integer> arrayList = new ArrayList();
    int i;
    for (i = bufferedInputStream.read(); i != -1; i = bufferedInputStream.read())
      arrayList.add(Integer.valueOf(i));
    int[] arrayOfInt = new int[arrayList.size()];
    for (byte b = 0; b < arrayOfInt.length; b++)
      arrayOfInt[b] = ((Integer) arrayList.get(b)).intValue();
    return arrayOfInt;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aN/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
