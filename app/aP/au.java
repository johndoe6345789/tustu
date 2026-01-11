package aP;

import A.o;
import A.x;
import G.T;
import G.bT;
import V.a;
import W.R;
import W.w;
import W.z;
import bH.D;
import bH.X;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import r.a;
import r.j;
import s.g;
import z.c;

public class au extends JPanel implements o {
  JTextField a = new JTextField(g.b("MyCar"), 30);
  
  JTextField b = new JTextField("", 30);
  
  JTextField c = new JTextField("", 25);
  
  JComboBox d = new JComboBox();
  
  JComboBox e = new JComboBox();
  
  JCheckBox f = new JCheckBox(g.b("Other / Browse"));
  
  JCheckBox g;
  
  JButton h = new JButton(g.b("Browse"));
  
  JButton i = new JButton(g.b("Browse"));
  
  JButton j = new JButton(g.b("Detect"));
  
  JButton k = new JButton(g.b("Detect"));
  
  JLabel l = new JLabel();
  
  JTextArea m = new JTextArea(8, 0);
  
  aY n = null;
  
  ArrayList o = new ArrayList();
  
  private String s = null;
  
  private List t = null;
  
  private bT u = null;
  
  CardLayout p = null;
  
  JPanel q = new JPanel();
  
  JPanel r = new JPanel();
  
  public au() {
    l();
  }
  
  private void l() {
    setBorder(BorderFactory.createTitledBorder(g.b("Project Configuration")));
    setLayout(new BoxLayout(this, 1));
    this.a.addFocusListener(new aD(this));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.setBorder(BorderFactory.createTitledBorder(g.b("Project Name")));
    jPanel1.add("Center", this.a);
    this.a.addKeyListener(new aE(this));
    add(jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.setBorder(BorderFactory.createTitledBorder(g.b("Project Directory")));
    String str = j.u();
    str = j.u() + this.a.getText() + File.separator;
    this.b.setText(str);
    this.b.setEditable(false);
    jPanel2.add("Center", this.b);
    jPanel2.add("East", this.h);
    this.h.addActionListener(new aA(this));
    add(jPanel2);
    this.r.setLayout(new BorderLayout());
    this.r.setBorder(BorderFactory.createTitledBorder(g.b("Firmware")));
    this.p = new CardLayout();
    this.q.setLayout(this.p);
    JPanel jPanel3 = new JPanel();
    long l = System.currentTimeMillis();
    jPanel3.setLayout(new BorderLayout(5, 5));
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout(5, 5));
    this.d.addItem(new aB(this, null));
    try {
      File[] arrayOfFile = j.n();
      String str1 = null;
      String str2 = null;
      if (T.a().c() != null) {
        str2 = T.a().c().i();
        str1 = T.a().c().P();
      } 
      for (byte b = 0; b < arrayOfFile.length; b++) {
        if (arrayOfFile[b].isFile()) {
          String[] arrayOfString = z.b(arrayOfFile[b]);
          for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
            aB aB = new aB(this, arrayOfFile[b], arrayOfString[b1]);
            if (str2 == null || !str2.equals(arrayOfString[b1]) || str1 == null || str1.length() > 0);
            this.d.addItem(aB);
          } 
        } 
      } 
    } catch (a a) {
      bV.d(a.getMessage(), this);
    } 
    D.c("Time to load ini list: " + (System.currentTimeMillis() - l) + "ms.");
    jPanel4.add("Center", this.d);
    jPanel4.add("East", this.j);
    this.j.addActionListener(new av(this));
    jPanel3.add("North", jPanel4);
    this.q.add("Manual", jPanel3);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout());
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new BorderLayout());
    this.l.setBorder(BorderFactory.createEtchedBorder());
    jPanel6.add("Center", this.l);
    jPanel6.add("East", this.k);
    this.k.addActionListener(new aw(this));
    jPanel5.add("North", jPanel6);
    this.q.add("Basic", jPanel5);
    this.r.add("North", this.q);
    JPanel jPanel7 = new JPanel();
    jPanel7.setLayout(new BorderLayout());
    jPanel7.add("West", this.f);
    this.f.addActionListener(new ax(this));
    jPanel7.add("Center", this.c);
    this.c.setEnabled(this.f.isSelected());
    this.c.setEditable(false);
    this.i.setEnabled(this.f.isSelected());
    this.i.addActionListener(new aC(this));
    this.r.add("Center", jPanel7);
    this.g = new JCheckBox(g.b("Show Advanced / Offline Setup"));
    this.g.addActionListener(new ay(this));
    JPanel jPanel8 = new JPanel();
    jPanel8.setLayout(new BorderLayout());
    jPanel8.add("East", this.g);
    this.r.add("South", jPanel8);
    add(this.r);
    a(false);
    JPanel jPanel9 = new JPanel();
    jPanel9.setLayout(new GridLayout());
    jPanel9.setBorder(BorderFactory.createTitledBorder(g.b("Project Description")));
    JScrollPane jScrollPane = new JScrollPane(this.m);
    this.m.setLineWrap(true);
    jPanel9.add(jScrollPane);
    jScrollPane.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane.setPreferredSize(eJ.a(300, 160));
    add(jPanel9);
  }
  
  protected String b() {
    return !this.b.getText().trim().equals("") ? this.b.getText().substring(0, this.b.getText().lastIndexOf(File.separatorChar)) : ".";
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      this.p.show(this.q, "Manual");
      this.r.setBorder(BorderFactory.createTitledBorder(g.b("ECU Definition")));
    } else {
      this.p.show(this.q, "Basic");
      this.r.setBorder(BorderFactory.createTitledBorder(g.b("Firmware")));
    } 
    this.g.setSelected(paramBoolean);
  }
  
  public void b(String paramString) {
    this.l.setText(paramString);
  }
  
  public void b(boolean paramBoolean) {
    this.a.setEnabled(!paramBoolean);
    this.b.setEnabled(!paramBoolean);
    this.h.setEnabled(!paramBoolean);
  }
  
  public void c(String paramString) {
    if (paramString != null && !paramString.endsWith(File.separator))
      paramString = paramString + File.separator; 
    this.b.setText(paramString);
  }
  
  public void d(String paramString) {
    a(new File(paramString));
  }
  
  public void a(File paramFile) {
    aB aB = new aB(this, paramFile);
    this.d.addItem(aB);
    this.d.setSelectedItem(aB);
    this.c.setText(paramFile.getAbsolutePath());
    String str = z.a(paramFile);
    if (str != null && T.a().c() != null && T.a().c().i().equals(str) && T.a().c().P() != null && T.a().c().P().length() > 0) {
      this.l.setText(T.a().c().P());
    } else if (str != null) {
      this.l.setText(g.b("Serial Signature") + ": " + str);
    } 
  }
  
  public String c() {
    return this.m.getText();
  }
  
  public void e(String paramString) {
    this.m.setText(paramString);
  }
  
  protected void f(String paramString) {
    paramString = paramString + File.separator + this.a.getText();
    this.b.setText(paramString);
  }
  
  public void d() {
    if (this.n != null) {
      this.n.e();
      this.n = null;
    } 
    this.n = new aY(bV.b(this));
    this.n.setVisible(true);
    this.n.a(this);
    Iterator<o> iterator = this.o.iterator();
    while (iterator.hasNext())
      this.n.a(iterator.next()); 
  }
  
  public boolean e() {
    String str = "";
    if (h() == null)
      str = str + g.b("ECU Configuration is Required, Please provide a valid ECU configuration File.") + "\n"; 
    File file = g();
    if (file == null)
      str = str + g.b("Project Directory is Required") + ",\n" + g.b("Please select a project directory.") + "\n"; 
    if (this.b.isEnabled() && file.exists())
      str = str + g.b("Project Directory already exists") + ",\n" + g.b("Please select a unique project name-directory combination.") + "\n"; 
    if (str.length() > 0) {
      bV.d(str, this);
      return false;
    } 
    return true;
  }
  
  public String f() {
    return this.a.getText();
  }
  
  public void g(String paramString) {
    this.a.setText(paramString);
  }
  
  public File g() {
    return (this.b.getText().length() == 0) ? null : new File(this.b.getText());
  }
  
  public File h() {
    if (this.f.isSelected()) {
      File file = new File(this.c.getText());
      return file.exists() ? file : null;
    } 
    aB aB = (aB)this.d.getSelectedItem();
    return (aB == null || aB.a() == null) ? null : aB.a();
  }
  
  public void b(String paramString1, String paramString2, List paramList, bT parambT) {
    D.c("Ok, device accepted:" + parambT);
    h(paramString2);
    a(paramList);
    a(parambT);
    if (parambT.f()) {
      boolean bool = bV.a(g.b("The selected controller is in Bootload Mode.") + "\n" + g.b("This means there is no firmware loaded or a boot jumper has been installed.") + "\n" + g.b("To use this controller you must have firmware installed.") + "\n\n" + g.b("Would you like to open the Firmware Loader now?"), this, true);
      if (bool) {
        f.a().f();
        f.a().i(dd.a().c());
      } 
      return;
    } 
    aB aB = i(parambT.b());
    if (aB == null) {
      R r = w.a(parambT.b());
      if (r.a()) {
        String str1 = g.b("Your installation of " + a.b + " does not have a configuration to support the firmware found:") + "\n" + parambT.c() + "\n\n" + g.b("Required Serial Signature:") + "\n" + parambT.b() + "\n\n" + g.b("However this file is available on EFI Analytics servers.") + "\n" + g.b("Would you like " + a.b + " to download the file for you?") + "\n" + g.b("File Size") + ": " + X.a(r.b()) + "\n";
        int i = JOptionPane.showConfirmDialog(this, str1, g.b("Internet Download"), 0, 3);
        if (i == 0)
          aB = b(parambT); 
        if (aB != null) {
          this.d.addItem(aB);
          this.d.setSelectedItem(aB);
        } 
      } else {
        String str1 = g.b(a.b + " does not have a configuration to support the found firmware") + ":\n" + parambT.c() + "\n\n" + g.b("Required Serial Signature") + ":\n" + parambT.b() + "\n\n\n" + g.b("Please click the 'Other' checkbox and browse") + ", \n" + g.b("to the Ecu Definition (ini) file provided with your firmware.");
        bV.d(str1, this);
      } 
    } 
    String str = null;
    if (parambT.c() != null && parambT.c().length() > 0 && !parambT.c().equals(parambT.b())) {
      str = parambT.c();
      this.l.setText(str);
    } else if (parambT.b() != null && !parambT.b().isEmpty()) {
      str = parambT.b();
      this.l.setText(str);
    } 
    if (aB != null) {
      this.d.setSelectedItem(aB);
      if (str != null)
        aB.b(str); 
      this.d.repaint();
    } 
  }
  
  private aB b(bT parambT) {
    JDialog jDialog = bV.a(dd.a().c(), g.b("Downloading Ecu Definition file for") + " " + parambT.b());
    try {
      aB aB = null;
      R r = w.a(parambT.b(), j.c());
      if (r.a()) {
        aB = new aB(this, r.c());
        if (parambT.c() != null && parambT.c().length() > 5)
          aB.b(parambT.c()); 
      } else {
        bV.d(r.d(), this);
        return null;
      } 
      if (aB != null);
      return aB;
    } catch (a a) {
      Logger.getLogger(au.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
      bV.d(a.getMessage(), this);
      return null;
    } catch (Exception exception) {
      Logger.getLogger(au.class.getName()).log(Level.SEVERE, (String)null, exception);
      bV.d("Unexpected Error tring to download Definition File.", this);
      return null;
    } finally {
      jDialog.dispose();
    } 
  }
  
  private aB i(String paramString) {
    for (byte b = 0; b < this.d.getItemCount(); b++) {
      aB aB = this.d.getItemAt(b);
      if (aB.equals(paramString))
        return aB; 
    } 
    return null;
  }
  
  public void a() {
    this.n.b(this);
    Iterator<o> iterator = this.o.iterator();
    while (iterator.hasNext())
      this.n.b(iterator.next()); 
  }
  
  public void b(double paramDouble) {}
  
  public void a(String paramString) {}
  
  private void m() {
    String[] arrayOfString = { "ini", "ecu" };
    String str = bV.b(this, g.b("Find ecu definition file"), arrayOfString, "", "");
    if (str != null && !str.equals("")) {
      String str1 = z.a(str);
      if (str1 != null) {
        d(str);
        this.f.setSelected(true);
      } else {
        bV.d(g.b("The selected file does not appear to be a valid ECU Definition file.") + "\n" + g.b("No Valid Signature Found in file") + ":\n" + str, this);
        this.f.setSelected(false);
      } 
    } else {
      this.f.setSelected(false);
      this.d.setEnabled(true);
    } 
  }
  
  public boolean a(String paramString1, String paramString2, List paramList, bT parambT) {
    if (paramString2.contains(":")) {
      String str = paramString2.substring(0, paramString2.indexOf(":"));
      if (!c.a().a(str)) {
        String str1 = g.b("The Controller found requires a driver that is not available in this edition of the application.");
        bV.d(str1, this);
        return false;
      } 
    } 
    az az = new az(this, paramString1, paramString2, paramList, parambT);
    az.start();
    return true;
  }
  
  public String i() {
    return this.s;
  }
  
  public void h(String paramString) {
    this.s = paramString;
  }
  
  public List j() {
    return this.t;
  }
  
  public void a(List paramList) {
    this.t = paramList;
  }
  
  public bT k() {
    return this.u;
  }
  
  public void a(bT parambT) {
    this.u = parambT;
  }
  
  public void a(x paramx) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/au.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */