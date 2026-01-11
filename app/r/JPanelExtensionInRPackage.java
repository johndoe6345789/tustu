package r;

import G.R;
import V.ExceptionInVPackage;
import W.z;
import bH.D;
import com.efiAnalytics.apps.ts.dashboard.Z;
import com.efiAnalytics.apps.ts.dashboard.x;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.LayoutManager;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import s.SComponentGolf;
import v.IOInVPackage;

public class JPanelExtensionInRPackage extends JPanel {
  File ExceptionInVPackage = null;
  
  x b = new x();
  
  JComboBox IOInVPackage = new JComboBox();
  
  JTextField d = new JTextField("", 25);
  
  JCheckBox e = new JCheckBox(SComponentGolf.b("Other"));
  
  JButton f = new JButton("...");
  
  private R h = null;
  
  Runnable SComponentGolf = new f(this);
  
  public JPanelExtensionInRPackage() {
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Select Dashboard")));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    this.b.setMinimumSize(eJ.ExceptionInVPackage(420, 240));
    this.b.setPreferredSize(eJ.ExceptionInVPackage(420, 240));
    this.IOInVPackage.addItem("");
    this.IOInVPackage.addItemListener(new IOInVPackage(this));
    jPanel1.add("North", this.IOInVPackage);
    jPanel1.add("West", this.e);
    this.e.addItemListener(new d(this));
    jPanel1.add("Center", this.d);
    this.d.setEnabled(this.e.isSelected());
    this.d.setEditable(false);
    jPanel1.add("East", this.f);
    this.f.setEnabled(this.e.isSelected());
    this.f.addActionListener(new h(this));
    if (!i.ExceptionInVPackage().ExceptionInVPackage("43wunjt58j7tjtht")) {
      JLabel jLabel = new JLabel(SComponentGolf.b("Lite! Edition will always load default cluster on project load!"));
      jLabel.setForeground(Color.red);
      jPanel1.add("South", jLabel);
    } 
    add("North", jPanel1);
    this.b.setEnabled(false);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout((LayoutManager)new bz.b());
    jPanel2.add((Component)this.b);
    add("Center", jPanel2);
  }
  
  public void ExceptionInVPackage(String paramString) {
    File file = new File(paramString);
    ExceptionInVPackage(file);
  }
  
  public void ExceptionInVPackage(File paramFile) {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile != null) {
      for (byte b1 = 0; b1 < arrayOfFile.length; b1++)
        this.IOInVPackage.addItem(new SComponentGolf(this, arrayOfFile[b1])); 
    } else {
      D.b("No dashfiles found in :\n\t" + paramFile);
    } 
  }
  
  public void ExceptionInVPackage() {
    try {
      File[] arrayOfFile = j.p();
      for (byte b1 = 0; b1 < arrayOfFile.length; b1++)
        this.IOInVPackage.addItem(new SComponentGolf(this, arrayOfFile[b1])); 
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      bV.d(ExceptionInVPackage.getMessage(), this);
    } 
  }
  
  public File b() {
    return this.ExceptionInVPackage;
  }
  
  public void b(File paramFile) {
    this.ExceptionInVPackage = paramFile;
    this.b.E();
    try {
      Image image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.x);
      this.b.ExceptionInVPackage(image);
      this.b.j(x.p);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.b("Cluster Wait image failed to load: " + ExceptionInVPackage.getLocalizedMessage());
    } 
    this.b.b(false);
    e e = new e(this, paramFile);
    e.start();
  }
  
  public void ExceptionInVPackage(String[] paramArrayOfString, o paramo) {
    if (paramo == null)
      return; 
    try {
      File[] arrayOfFile = j.p();
      for (byte b1 = 0; b1 < this.IOInVPackage.getItemCount(); b1++) {
        if (this.IOInVPackage.getItemAt(b1) instanceof SComponentGolf) {
          SComponentGolf SComponentGolf = this.IOInVPackage.getItemAt(b1);
          String str = z.ExceptionInVPackage(SComponentGolf.ExceptionInVPackage());
          if (!ExceptionInVPackage(paramo, paramArrayOfString, str)) {
            this.IOInVPackage.removeItem(SComponentGolf);
            b1--;
          } 
        } 
      } 
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage("Unexpected Error applying filters", (Exception)ExceptionInVPackage, this);
    } 
  }
  
  private boolean ExceptionInVPackage(o paramo, String[] paramArrayOfString, String paramString) {
    for (byte b1 = 0; b1 < paramArrayOfString.length; b1++) {
      if (paramo.ExceptionInVPackage(paramArrayOfString[b1], paramString))
        return true; 
    } 
    return false;
  }
  
  public boolean IOInVPackage() {
    return this.e.isSelected();
  }
  
  public void ExceptionInVPackage(String paramString, Z paramZ) {
    String str1 = SComponentGolf.b("Default") + " (" + paramString + ")";
    if (b(str1))
      return; 
    String str2 = j.y() + File.separator + str1 + ".dash";
    IOInVPackage IOInVPackage = new IOInVPackage(j.G());
    try {
      IOInVPackage.ExceptionInVPackage(str2, paramZ);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage("Error creating default dashboard.\n" + ExceptionInVPackage.getMessage() + "\nCheck Log for more details", (Exception)ExceptionInVPackage, this);
    } 
    File file = new File(str2);
    file.deleteOnExit();
    SComponentGolf SComponentGolf = new SComponentGolf(this, file);
    this.IOInVPackage.addItem(SComponentGolf);
    if (this.IOInVPackage.getSelectedItem() == null || !this.IOInVPackage.getSelectedItem().equals(SComponentGolf))
      this.IOInVPackage.setSelectedItem(SComponentGolf); 
  }
  
  private boolean b(String paramString) {
    for (byte b1 = 0; b1 < this.IOInVPackage.getItemCount(); b1++) {
      if (this.IOInVPackage.getItemAt(b1) instanceof SComponentGolf) {
        SComponentGolf SComponentGolf = this.IOInVPackage.getItemAt(b1);
        if (SComponentGolf.toString().equals(paramString))
          return true; 
      } 
    } 
    return false;
  }
  
  public void d() {
    this.b.b(false);
  }
  
  public Z e() {
    return this.b.i();
  }
  
  public boolean f() {
    if (this.ExceptionInVPackage == null) {
      bV.d(SComponentGolf.b("Please select ExceptionInVPackage dashboard layout"), this);
      return false;
    } 
    return true;
  }
  
  public boolean SComponentGolf() {
    return this.e.isSelected() ? false : ((this.IOInVPackage.getSelectedItem().toString().indexOf(SComponentGolf.b("Default")) != -1));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/r/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */