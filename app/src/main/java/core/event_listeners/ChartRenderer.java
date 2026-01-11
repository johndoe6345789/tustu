package ao;

import bH.J;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cF;
import com.efiAnalytics.ui.de;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class by extends JPanel {
  List a;
  
  final List b = new ArrayList();
  
  JDialog c = null;
  
  de d = new de();
  
  public by(List paramList, boolean paramBoolean) {
    this.a = paramList;
    setLayout(new BorderLayout());
    if (paramBoolean) {
      add("North", new JLabel("Select Settings to export", 0));
    } else {
      add("North", new JLabel("Select Settings available to import", 0));
    } 
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 2, eJ.a(5), 0));
    for (bB bB : paramList) {
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new BorderLayout(1, 1));
      JCheckBox jCheckBox = new JCheckBox(bB.b(), true);
      jPanel.add("Center", jCheckBox);
      this.b.add(jCheckBox);
      jCheckBox.setActionCommand(bB.a());
      if (!bB.c().isEmpty())
        jPanel.add("East", (Component)new cF(bB.c(), null)); 
      jPanel1.add(jPanel);
    } 
    if (!paramBoolean) {
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new BorderLayout());
      jPanel.add("Center", (Component)this.d);
      this.d.a("Replace Current Settings");
      this.d.a("Merge with Current Settings");
      this.d.b("Merge with Current Settings");
      jPanel.add("East", (Component)new cF("Replace Current Settings: Settings for each category will be removed and replaced with those in this import file.<br>Merge with Current Settings: Current settings will be left in place and only overwridden when a setting with the same name is imported.", null));
      if (jPanel1.getComponentCount() % 2 > 0)
        jPanel1.add(new JLabel("")); 
      jPanel1.add(jPanel);
    } 
    add("Center", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(1));
    JButton jButton1 = new JButton("OK");
    jButton1.addActionListener(new bz(this));
    JButton jButton2 = new JButton("Cancel");
    jButton2.addActionListener(new bA(this));
    if (J.a()) {
      jPanel2.add(jButton1);
      jPanel2.add(jButton2);
    } else {
      jPanel2.add(jButton2);
      jPanel2.add(jButton1);
    } 
    add("South", jPanel2);
  }
  
  private void c() {
    if (this.c != null)
      this.c.dispose(); 
  }
  
  private void d() {
    this.a.clear();
    if (this.c != null)
      this.c.dispose(); 
  }
  
  public boolean a() {
    return (this.d.getSelectedItem() != null && this.d.getSelectedItem().equals("Replace Current Settings"));
  }
  
  public List b() {
    ArrayList<String> arrayList = new ArrayList();
    for (bB bB : this.a) {
      if (a(bB.a())) {
        arrayList.add(bB.a());
        for (String str : bB.d())
          arrayList.add(str); 
      } 
    } 
    return arrayList;
  }
  
  private boolean a(String paramString) {
    for (JCheckBox jCheckBox : this.b) {
      if (jCheckBox.getActionCommand().equals(paramString))
        return jCheckBox.isSelected(); 
    } 
    return false;
  }
  
  public void a(Window paramWindow) {
    this.c = new JDialog(paramWindow, "Setting Selector");
    this.c.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
    this.c.add("Center", this);
    this.c.pack();
    bV.a(paramWindow, this.c);
    this.c.setVisible(true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/by.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */