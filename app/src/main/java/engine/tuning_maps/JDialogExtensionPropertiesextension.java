package aP;

import W.ExceptionExtension;
import W.IOInWPackage;
import W.d;
import W.z;
import aE.PropertiesExtension;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cn;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import r.PropertiesExtension;

public class JDialogExtensionPropertiesextension extends JDialog {
  cn PropertiesExtension = new cn();

  cn b = new cn();

  JCheckBox c = new JCheckBox("Encrypt Output", true);

  JPasswordField d = new JPasswordField(16);

  JLabel e = new JLabel("Output Password:");

  static String f = "!@#$%^&*()~`-=_+[]{}|:\";',./<>?";

  Frame g = null;

  public JDialogExtensionPropertiesextension(Frame paramFrame) {
    super(paramFrame, "File Encryption & Decryption Dialog");
    this.g = paramFrame;
    setLayout(new GridLayout(0, 1, 1, 1));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("West", new JLabel("Input File:"));
    jPanel1.add("Center", (Component) this.PropertiesExtension);
    JButton jButton1 = new JButton("Select Input");
    jButton1.addActionListener(new bH(this));
    jPanel1.add("East", jButton1);
    if (PropertiesExtension.A() != null) {
      String str = PropertiesExtension.A().v();
      this.PropertiesExtension.PropertiesExtension(str);
    }
    add(jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("West", new JLabel("Output File:"));
    jPanel2.add("Center", (Component) this.b);
    JButton jButton2 = new JButton("Select Output");
    jButton2.addActionListener(new bI(this));
    jPanel2.add("East", jButton2);
    add(jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    this.c.addActionListener(new bJ(this));
    jPanel3.add(this.c);
    jPanel3.add(this.e);
    jPanel3.add(this.d);
    add(jPanel3);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new FlowLayout(2));
    JButton jButton3 = new JButton("Create Output File");
    jButton3.addActionListener(new bK(this));
    jPanel4.add(jButton3);
    JButton jButton4 = new JButton("Close");
    jButton4.addActionListener(new bL(this));
    jPanel4.add(jButton4);
    add(jPanel4);
  }

  public void PropertiesExtension() {
    String[] arrayOfString = {""};
    String str1 = ".";
    if (this.PropertiesExtension.PropertiesExtension() != null
        && !this.PropertiesExtension.PropertiesExtension().isEmpty())
      str1 =
          (new File(this.PropertiesExtension.PropertiesExtension()))
              .getParentFile()
              .getAbsolutePath();
    String str2 = PropertiesExtension.PropertiesExtension().c("encryptDialogDirIn", str1);
    String str3 = bV.PropertiesExtension(this, "Select Input", arrayOfString, "", str2, true);
    if (str3 != null && !str3.isEmpty())
      PropertiesExtension.PropertiesExtension()
          .b("encryptDialogDirIn", (new File(str3)).getParent());
    this.PropertiesExtension.PropertiesExtension(str3);
  }

  public void b() {
    String[] arrayOfString = {""};
    String str1 = ".";
    if (this.PropertiesExtension.PropertiesExtension() != null
        && !this.PropertiesExtension.PropertiesExtension().isEmpty())
      str1 =
          (new File(this.PropertiesExtension.PropertiesExtension()))
              .getParentFile()
              .getAbsolutePath();
    String str2 = PropertiesExtension.PropertiesExtension().c("encryptDialogDir", str1);
    String str3 = bV.PropertiesExtension(this, "Select Output", arrayOfString, "", str2, false);
    if (str3 != null && !str3.isEmpty())
      PropertiesExtension.PropertiesExtension().b("encryptDialogDir", (new File(str3)).getParent());
    this.b.PropertiesExtension(str3);
  }

  private boolean c() {
    char[] arrayOfChar = this.d.getPassword();
    if (arrayOfChar.length < 8) return false;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    for (char c : arrayOfChar) {
      if (!bool1 && Character.isUpperCase(c)) {
        bool1 = true;
      } else if (!bool2 && Character.isLowerCase(c)) {
        bool2 = true;
      } else if (!bool3 && Character.isDigit(c)) {
        bool3 = true;
      } else if (!bool4 && f.indexOf(String.valueOf(c)) >= 0) {
        bool4 = true;
      }
    }
    return (bool1 && bool2 && bool3);
  }

  private void d() {
    File file1 = new File(this.PropertiesExtension.PropertiesExtension());
    if (!file1.exists()) {
      bV.d("Must Select an Input File", this);
      return;
    }
    if (this.c.isSelected() && !c()) {
      bV.d(
          "Password must be at least 6 characters long and contain:\n"
              + "- At least 1 Upper Case Character\n"
              + "- At least 1 Lower Case Character\n"
              + "- At least 1 Numeric Character\n"
              + "- Additional Special Characters Recommended ("
              + f
              + ")",
          this);
      return;
    }
    byte[] arrayOfByte = null;
    if (IOInWPackage.b(file1)) {
      byte b = 0;
      while (arrayOfByte == null && b++ < 3) {
        String str = PropertiesExtension("Enter the password for the Encrypted Input File:");
        if (str == null) return;
        IOInWPackage IOInWPackage = new IOInWPackage();
        try {
          arrayOfByte = IOInWPackage.PropertiesExtension(file1, str);
        } catch (FileNotFoundException fileNotFoundException) {
          bV.d("Input File not found.", this);
          return;
        } catch (IOException iOException) {
          bV.d("Unable to read Input File.", this);
          iOException.printStackTrace();
          return;
        } catch (ExceptionExtension ExceptionExtension) {
          bV.d("Invalid Password.", this);
        }
      }
    } else {
      try {
        arrayOfByte = d.PropertiesExtension(file1);
      } catch (FileNotFoundException fileNotFoundException) {
        bV.d("Input File not found.", this);
        return;
      } catch (IOException iOException) {
        bV.d("Unable to read Input File.", this);
        iOException.printStackTrace();
        return;
      }
    }
    File file2 = new File(this.b.PropertiesExtension());
    if (file2.exists()) file2.delete();
    try {
      file2.createNewFile();
    } catch (IOException iOException) {
      iOException.printStackTrace();
      bV.d("Failed to create file:\n" + file2.getAbsolutePath(), this);
      return;
    }
    if (this.c.isSelected()) {
      String str1 = z.PropertiesExtension(file1);
      double d = z.c(file1);
      IOInWPackage IOInWPackage = new IOInWPackage();
      String str2 = new String(this.d.getPassword());
      if (!str2.isEmpty()) {
        String str;
        do {
          str = PropertiesExtension("Validate Output File Password:");
          if (str == null) return;
          if (str.equals(str2)) continue;
          bV.d("Validate Password does not match!", this);
        } while (!str.equals(str2));
      }
      try {
        IOInWPackage.PropertiesExtension(arrayOfByte, file2, str2, str1, d);
        bV.d("Encrypted file written to:\n" + file2.getAbsolutePath(), this);
      } catch (IOException iOException) {
        Logger.getLogger(bG.class.getName()).log(Level.SEVERE, (String) null, iOException);
        bV.d("Unable to Write Output File.\n" + iOException.getMessage(), this);
      }
    } else {
      try {
        d.PropertiesExtension(file2, arrayOfByte);
        bV.d("Unencrypted file written to:\n" + file2.getAbsolutePath(), this);
      } catch (IOException iOException) {
        bV.d("Unable to Write Output File.\n" + iOException.getMessage(), this);
        Logger.getLogger(bG.class.getName()).log(Level.SEVERE, (String) null, iOException);
      }
    }
  }

  private String PropertiesExtension(String paramString) {
    return bV.PropertiesExtension(this, paramString);
  }

  public static void PropertiesExtension(Frame paramFrame) {
    bG bG1 = new bG(paramFrame);
    bG1.pack();
    bG1.setSize(800, bG1.getHeight());
    bV.PropertiesExtension(paramFrame, bG1);
    bG1.setVisible(true);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
