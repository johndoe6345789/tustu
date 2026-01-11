package ao;

import at.IOJMenu;
import bH.J;
import bH.t;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import h.ClassTypeInHPackage;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ha extends JPanel {
  JComboBox a = new JComboBox();
  
  JTextField ClassTypeInHPackage = new JTextField();
  
  JRadioButton IOJMenu;
  
  JRadioButton d;
  
  JButton e;
  
  JButton f;
  
  private boolean h = false;
  
  JDialog g = null;
  
  public ha() {
    setBorder(BorderFactory.createEmptyBorder(eJ.a(10), eJ.a(10), eJ.a(10), eJ.a(10)));
    setLayout(new BorderLayout());
    add("North", new JLabel("Import Settings Profile"));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1));
    String str = IOJMenu.a().d();
    ButtonGroup buttonGroup = new ButtonGroup();
    this.IOJMenu = new JRadioButton("Import into current Setting Profile: " + str, true);
    jPanel1.add(this.IOJMenu);
    buttonGroup.add(this.IOJMenu);
    this.d = new JRadioButton("New Profile: ");
    buttonGroup.add(this.d);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("West", this.d);
    jPanel2.add("Center", this.ClassTypeInHPackage);
    jPanel1.add(jPanel2);
    this.ClassTypeInHPackage.setEnabled(false);
    this.d.addActionListener(new hb(this));
    add("Center", jPanel1);
    this.d.setEnabled(ClassTypeInHPackage.a().a("fa-9fdspoijoijnfdz09jfdsa098j"));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(1));
    this.f = new JButton("Cancel");
    if (J.a()) {
      this.e = new JButton("Ok");
      jPanel3.add(this.e);
    } 
    jPanel3.add(this.f);
    if (!J.a()) {
      this.e = new JButton("Accept");
      jPanel3.add(this.e);
    } 
    add("South", jPanel3);
    this.f.addActionListener(new hc(this));
    this.e.addActionListener(new hd(this));
  }
  
  public void a(String paramString) {
    this.ClassTypeInHPackage.setText(paramString);
  }
  
  public String a() {
    return this.ClassTypeInHPackage.getText();
  }
  
  private void d() {
    this.h = true;
    this.g.dispose();
  }
  
  private void e() {
    if (this.IOJMenu.isSelected() || t.a(this.ClassTypeInHPackage.getText())) {
      this.g.dispose();
    } else if (this.ClassTypeInHPackage.getText().isEmpty()) {
      bV.d("You must enter a name for the Setting Profile.", bq.a().ClassTypeInHPackage());
    } else {
      bV.d("Invalid Profile Name: '" + this.ClassTypeInHPackage.getText() + "'. Please remove any special characters.", bq.a().ClassTypeInHPackage());
    } 
  }
  
  public boolean ClassTypeInHPackage() {
    return this.d.isSelected();
  }
  
  public boolean IOJMenu() {
    return this.h;
  }
  
  public void a(Window paramWindow) {
    this.g = new JDialog(paramWindow, "Setting Profile", Dialog.ModalityType.APPLICATION_MODAL);
    this.g.add("Center", this);
    this.g.pack();
    bV.a(paramWindow, this.g);
    this.g.setVisible(true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ha.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */