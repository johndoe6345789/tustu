package business.binary_decoders.bD_components;

import bH.D;
import bH.J;
import bH.X;
import bH.ab;
import bH.t;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JDialogExtensionInBdPackage extends JDialog {
  ab a = bV.a();

  JPanel b = new JPanel();

  JButton c;

  JButton d;

  JCheckBox e;

  boolean f = false;

  List g = null;

  public JDialogExtensionInBdPackage(Window paramWindow, String paramString1, String paramString2) {
    super(paramWindow, paramString1, Dialog.ModalityType.DOCUMENT_MODAL);
    setLayout(new BorderLayout());
    add("North", new JLabel(paramString2, 0));
    this.b.setLayout(new GridLayout(0, 1));
    JScrollPane jScrollPane = new JScrollPane(this.b);
    add("Center", jScrollPane);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    this.d = new JButton(a("Cancel"));
    this.c = new JButton(a("Ok"));
    if (J.a()) jPanel.add(this.d);
    jPanel.add(this.c);
    if (!J.a()) jPanel.add(this.d);
    this.d.addActionListener(new J(this));
    this.c.addActionListener(new K(this));
    add("South", jPanel);
    this.e =
        new JCheckBox(
            a("Apply Name to all, followed by number.")
                + " "
                + a("Example: ZMax --> ZMax001, ZMax002, etc"));
    this.e.setSelected(true);
    this.e.addActionListener(new L(this));
  }

  public File[] a(File[] paramArrayOfFile) {
    this.b.removeAll();
    this.b.add(this.e);
    this.g = new ArrayList();
    for (File file : paramArrayOfFile) {
      N n = new N(this, file);
      this.g.add(n);
      this.b.add(n);
    }
    a(!this.e.isSelected());
    ((N) this.g.get(0)).b.addKeyListener(new M(this));
    pack();
    int i = getHeight();
    if (i > eJ.a(500)) i = eJ.a(500);
    setSize(getWidth() + eJ.a(40), i);
    bV.a(getOwner(), this);
    ((N) this.g.get(0)).b.requestFocus();
    setVisible(true);
    if (this.f) return paramArrayOfFile;
    File[] arrayOfFile = a();
    for (byte b = 0; b < paramArrayOfFile.length; b++) {
      File file1 = paramArrayOfFile[b];
      File file2 = arrayOfFile[b];
      if (file1.exists() && !file1.renameTo(file2)) {
        D.b("Failed to rename Log File: " + file1.getName() + " --> " + file2.getName());
        arrayOfFile[b] = paramArrayOfFile[b];
      }
    }
    return arrayOfFile;
  }

  private File[] a() {
    File[] arrayOfFile = new File[this.g.size()];
    for (byte b = 0; b < this.g.size(); b++) {
      N n = this.g.get(b);
      arrayOfFile[b] = n.a();
    }
    return arrayOfFile;
  }

  private void b() {
    if (this.g != null) {
      String str2;
      String str1 = ((N) this.g.get(0)).b();
      if (str1.contains(".")) {
        str2 = str1.substring(str1.lastIndexOf(".") + 1);
        str1 = str1.substring(0, str1.lastIndexOf("."));
      } else {
        str2 = "";
      }
      for (byte b = 1; b < this.g.size(); b++) {
        String str;
        if (!str2.isEmpty()) {
          str = str1 + "_" + X.a("" + b, '0', 3) + "." + str2;
        } else {
          str = str1 + "_" + X.a("" + b, '0', 3);
        }
        ((N) this.g.get(b)).a(str);
      }
    }
  }

  private void a(boolean paramBoolean) {
    Component[] arrayOfComponent = this.b.getComponents();
    for (byte b = 2; b < arrayOfComponent.length; b++) fp.a(arrayOfComponent[b], paramBoolean);
  }

  private void c() {
    if (e()) {
      this.f = false;
      dispose();
    }
  }

  private void d() {
    this.f = true;
    dispose();
  }

  private boolean e() {
    ArrayList<File> arrayList = new ArrayList();
    File[] arrayOfFile = a();
    for (File file : arrayOfFile) {
      if (!t.a(file.getName())) arrayList.add(file);
    }
    if (!arrayList.isEmpty()) {
      String str =
          a("The following file(s) names contain characters not allowed byt the file system")
              + ":\n";
      for (File file : arrayList) str = str + file.getName() + "\n";
      bV.d(str, this);
      return false;
    }
    return true;
  }

  private String a(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
