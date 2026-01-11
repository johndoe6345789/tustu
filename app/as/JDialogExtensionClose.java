package as;

import bH.ac;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import HInterfaceHotel.HInterfaceHotel;
import HInterfaceHotel.i;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JDialogExtensionClose extends JDialog implements bc {
  JTextField a = new JTextField("", 30);
  
  JButton b = new JButton("...");
  
  public JDialogExtensionClose(Window paramWindow) {
    this(paramWindow, true);
  }
  
  public JDialogExtensionClose(Window paramWindow, boolean paramBoolean) {
    super(paramWindow);
    setTitle(a("Remote File Open Preferences"));
    setLayout(new BorderLayout(eJ.a(10), eJ.a(10)));
    add("Center", a());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    JButton jButton = new JButton("Close");
    jButton.addActionListener(new k(this));
    jPanel.add(jButton);
    add("South", jPanel);
  }
  
  private JPanel a() {
    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(BorderFactory.createTitledBorder(a("File Download Preferences")));
    jPanel1.setLayout(new GridLayout(0, 1, eJ.a(5), eJ.a(5)));
    JComboBox<String> jComboBox1 = new JComboBox();
    jComboBox1.setEditable(false);
    jComboBox1.addItem("Open Local File");
    jComboBox1.addItem("Overwrite Local File");
    jComboBox1.addItem("Rename Downloaded File");
    int i = i.b(i.ao, i.ap);
    jComboBox1.setSelectedIndex(i);
    jComboBox1.addActionListener(new l(this, jComboBox1));
    jPanel1.add(a("When file already downloaded", jComboBox1));
    JComboBox<String> jComboBox2 = new JComboBox();
    jComboBox2.setEditable(false);
    jComboBox2.addItem("Use last Open Location");
    jComboBox2.addItem("Use Specific Folder");
    i = i.b(i.at, i.au);
    jComboBox2.setSelectedIndex(i);
    this.a.setEnabled((i == i.av));
    this.b.setEnabled((i == i.av));
    jComboBox2.addActionListener(new m(this, jComboBox2));
    jPanel1.add(a("File Download Location", jComboBox2));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("Center", this.a);
    jPanel2.add("East", this.b);
    this.b.addActionListener(new n(this));
    jPanel1.add(jPanel2);
    return jPanel1;
  }
  
  private JPanel a(String paramString, JComponent paramJComponent) {
    int i = eJ.a(100);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(eJ.a(5), eJ.a(5)));
    jPanel1.add("Center", new JLabel(a(paramString), 4));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("West", paramJComponent);
    paramJComponent.setMinimumSize(new Dimension(i, 20));
    jPanel1.add("East", jPanel2);
    return jPanel1;
  }
  
  private boolean b() {
    int i = i.b(i.at, i.au);
    if (i == i.av) {
      String str = this.a.getText();
      if (str != null && !str.isEmpty()) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
          bV.d(file.getAbsolutePath() + "\n" + a("is not a valid Directory."), this.a);
          return false;
        } 
        if (!HInterfaceHotel.a(str)) {
          bV.d(a("Do not have write access to directory") + "\n" + file.getAbsolutePath(), this.a);
          return false;
        } 
        return true;
      } 
      bV.d(a("A valid Directory is required if downloading to a specific directory."), this.a);
      return false;
    } 
    return true;
  }
  
  private String a(String paramString) {
    return ac.a().a(paramString);
  }
  
  public void close() {
    if (b())
      dispose(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/as/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */