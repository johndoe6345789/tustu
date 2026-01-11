package r;

import G.R;
import V.a;
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
import s.g;
import v.c;

public class b extends JPanel {
  File a = null;
  
  x b = new x();
  
  JComboBox c = new JComboBox();
  
  JTextField d = new JTextField("", 25);
  
  JCheckBox e = new JCheckBox(g.b("Other"));
  
  JButton f = new JButton("...");
  
  private R h = null;
  
  Runnable g = new f(this);
  
  public b() {
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createTitledBorder(g.b("Select Dashboard")));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    this.b.setMinimumSize(eJ.a(420, 240));
    this.b.setPreferredSize(eJ.a(420, 240));
    this.c.addItem("");
    this.c.addItemListener(new c(this));
    jPanel1.add("North", this.c);
    jPanel1.add("West", this.e);
    this.e.addItemListener(new d(this));
    jPanel1.add("Center", this.d);
    this.d.setEnabled(this.e.isSelected());
    this.d.setEditable(false);
    jPanel1.add("East", this.f);
    this.f.setEnabled(this.e.isSelected());
    this.f.addActionListener(new h(this));
    if (!i.a().a("43wunjt58j7tjtht")) {
      JLabel jLabel = new JLabel(g.b("Lite! Edition will always load default cluster on project load!"));
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
  
  public void a(String paramString) {
    File file = new File(paramString);
    a(file);
  }
  
  public void a(File paramFile) {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile != null) {
      for (byte b1 = 0; b1 < arrayOfFile.length; b1++)
        this.c.addItem(new g(this, arrayOfFile[b1])); 
    } else {
      D.b("No dashfiles found in :\n\t" + paramFile);
    } 
  }
  
  public void a() {
    try {
      File[] arrayOfFile = j.p();
      for (byte b1 = 0; b1 < arrayOfFile.length; b1++)
        this.c.addItem(new g(this, arrayOfFile[b1])); 
    } catch (a a) {
      bV.d(a.getMessage(), this);
    } 
  }
  
  public File b() {
    return this.a;
  }
  
  public void b(File paramFile) {
    this.a = paramFile;
    this.b.E();
    try {
      Image image = cO.a().a(cO.x);
      this.b.a(image);
      this.b.j(x.p);
    } catch (a a) {
      D.b("Cluster Wait image failed to load: " + a.getLocalizedMessage());
    } 
    this.b.b(false);
    e e = new e(this, paramFile);
    e.start();
  }
  
  public void a(String[] paramArrayOfString, o paramo) {
    if (paramo == null)
      return; 
    try {
      File[] arrayOfFile = j.p();
      for (byte b1 = 0; b1 < this.c.getItemCount(); b1++) {
        if (this.c.getItemAt(b1) instanceof g) {
          g g = this.c.getItemAt(b1);
          String str = z.a(g.a());
          if (!a(paramo, paramArrayOfString, str)) {
            this.c.removeItem(g);
            b1--;
          } 
        } 
      } 
    } catch (a a) {
      D.a("Unexpected Error applying filters", (Exception)a, this);
    } 
  }
  
  private boolean a(o paramo, String[] paramArrayOfString, String paramString) {
    for (byte b1 = 0; b1 < paramArrayOfString.length; b1++) {
      if (paramo.a(paramArrayOfString[b1], paramString))
        return true; 
    } 
    return false;
  }
  
  public boolean c() {
    return this.e.isSelected();
  }
  
  public void a(String paramString, Z paramZ) {
    String str1 = g.b("Default") + " (" + paramString + ")";
    if (b(str1))
      return; 
    String str2 = j.y() + File.separator + str1 + ".dash";
    c c = new c(j.G());
    try {
      c.a(str2, paramZ);
    } catch (a a) {
      D.a("Error creating default dashboard.\n" + a.getMessage() + "\nCheck Log for more details", (Exception)a, this);
    } 
    File file = new File(str2);
    file.deleteOnExit();
    g g = new g(this, file);
    this.c.addItem(g);
    if (this.c.getSelectedItem() == null || !this.c.getSelectedItem().equals(g))
      this.c.setSelectedItem(g); 
  }
  
  private boolean b(String paramString) {
    for (byte b1 = 0; b1 < this.c.getItemCount(); b1++) {
      if (this.c.getItemAt(b1) instanceof g) {
        g g = this.c.getItemAt(b1);
        if (g.toString().equals(paramString))
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
    if (this.a == null) {
      bV.d(g.b("Please select a dashboard layout"), this);
      return false;
    } 
    return true;
  }
  
  public boolean g() {
    return this.e.isSelected() ? false : ((this.c.getSelectedItem().toString().indexOf(g.b("Default")) != -1));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/r/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */