package bD;

import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class JPanelExtensionInBdPackage extends JPanel {
  JTextField a = new JTextField();
  
  JTextField b = new JTextField();
  
  String c;
  
  File d;
  
  public JPanelExtensionInBdPackage(I paramI, File paramFile) {
    this.d = paramFile;
    int i = eJ.a(5);
    setBorder(BorderFactory.createEmptyBorder(i, i, i, i));
    setLayout(new GridLayout(1, 0, i, i));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("West", new JLabel(I.a(paramI, "Default Name") + ": "));
    jPanel.add("Center", this.a);
    add(jPanel);
    jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    this.a.setEditable(false);
    jPanel.add("West", new JLabel(I.a(paramI, "New Name") + ": "));
    jPanel.add("Center", this.b);
    add(jPanel);
    String str = paramFile.getName();
    if (str.contains(".")) {
      this.c = str.substring(str.lastIndexOf("."));
      str = str.substring(0, str.lastIndexOf("."));
    } else {
      this.c = "";
    } 
    this.b.addFocusListener(new O(this, paramI));
    this.a.setText(str);
    this.b.setText(str);
  }
  
  public File a() {
    return new File(this.d.getParent(), this.b.getText() + this.c);
  }
  
  public String b() {
    return this.b.getText();
  }
  
  public void a(String paramString) {
    this.b.setText(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/N.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */