package aO;

import C.c;
import C.d;
import G.GComponentCd;
import W.ManagerInWPackage;
import bH.X;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cm;
import com.efiAnalytics.ui.cn;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.io.File;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

class JPanelExtensionInAoPackage extends JPanel {
  JButton a = null;
  
  JButton b = null;
  
  JButton c = null;
  
  JButton d = null;
  
  JButton e = null;
  
  JButton f = null;
  
  JComboBox g = new JComboBox();
  
  JComboBox h = new JComboBox();
  
  cn i = new cn();
  
  JCheckBox j = null;
  
  k k;
  
  d l = (d)new c();
  
  private cm m = null;
  
  public JPanelExtensionInAoPackage(k paramk) {
    this.k = paramk;
    setBorder(BorderFactory.createTitledBorder(this.l.a("Ignition Logger Controls")));
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new FlowLayout());
    jPanel1.add(new JLabel(this.l.a("Logger Type:")));
    jPanel1.add(this.g);
    this.g.setEnabled(!paramk.D);
    this.g.addActionListener(new b(this));
    if (paramk.f()) {
      this.e = new JButton(this.l.a("Options"));
      jPanel1.add(this.e);
      this.e.addActionListener(new c(this));
      this.d = new JButton(this.l.a("Open Log"));
      jPanel1.add(this.d);
      this.d.addActionListener(new d(this));
    } 
    add("West", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    this.j = new JCheckBox(this.l.a("Capture to log file:") + "  ");
    if (!paramk.D)
      jPanel2.add("West", this.j); 
    this.j.addActionListener(new e(this));
    jPanel2.add("Center", (Component)this.i);
    add("Center", jPanel2);
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      String[] arrayOfString = this.m.b();
      String str1 = X.a() + "." + this.m.c();
      String str2 = this.m.a().getAbsolutePath();
      str1 = bV.a(getParent(), this.l.a("Set Ignition Logger File"), arrayOfString, str1, str2);
      if (str1 == null || str1.equals("")) {
        this.j.setSelected(false);
        this.i.setText("");
        return;
      } 
      if (!str1.toLowerCase().endsWith(this.m.c()))
        str1 = str1 + "." + this.m.c(); 
      File file = new File(str1);
      if (file.exists()) {
        boolean bool = bV.a("The selected file already exists.\nWould you like to over write:\n" + str1, this, true);
        if (!bool)
          return; 
      } 
      b();
      this.i.a(str1);
    } else {
      this.i.a("");
      this.k.c();
    } 
  }
  
  protected void a() {
    JPopupMenu jPopupMenu = new JPopupMenu();
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(this.l.a("Render Including Non Interrupt Data"), this.k.j());
    jPopupMenu.add(jCheckBoxMenuItem);
    jCheckBoxMenuItem.addActionListener(new f(this));
    jPopupMenu.show(this.e, 0, this.e.getHeight());
  }
  
  public void b() {
    this.k.g();
    this.i.a("");
    this.k.c();
  }
  
  public void c() {
    String[] arrayOfString = this.m.b();
    String str1 = "";
    String str2 = this.m.a().getAbsolutePath();
    str1 = bV.b(getParent(), this.l.a("Open Ignition Log File"), arrayOfString, str1, str2);
    a(str1);
  }
  
  public void a(String paramString) {
    if (paramString == null || paramString.equals(""))
      return; 
    this.j.setSelected(false);
    ManagerInWPackage ManagerInWPackage = new ManagerInWPackage();
    ManagerInWPackage.a(new g(this));
    File file = new File(paramString);
    if (!file.exists()) {
      bV.d("Ignition Log File not found:\n" + paramString, this);
      return;
    } 
    ManagerInWPackage.b(file, this.k.i() + 1);
    this.m.a(file.getParentFile());
    this.i.a(paramString);
    this.j.setSelected(false);
  }
  
  public void d() {
    i i = (i)this.g.getSelectedItem();
    if (i == null || i.a() == null)
      return; 
    this.k.a(i.a());
    if (i.a().d().equals(GComponentCd.a)) {
      this.h.setEnabled(false);
    } else {
      this.h.setEnabled(true);
    } 
    this.k.d();
  }
  
  public void a(ArrayList<GComponentCd> paramArrayList) {
    this.g.removeAllItems();
    for (byte b = 0; b < paramArrayList.size(); b++)
      this.g.addItem(new i(this, paramArrayList.get(b))); 
  }
  
  public void b(String paramString) {
    for (byte b = 0; b < this.g.getItemCount(); b++) {
      Object object = this.g.getItemAt(b);
      if (object.toString().equals(paramString))
        this.g.setSelectedIndex(b); 
    } 
  }
  
  public void a(cm paramcm) {
    this.m = paramcm;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aO/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */