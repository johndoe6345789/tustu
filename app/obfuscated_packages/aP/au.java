package aP;

import A.AInterfaceOscar;
import A.AInterfaceXray;
import G.T;
import G.bT;
import V.ExceptionInVPackage;
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
import r.ExceptionInVPackage;
import r.ThreadedFile;
import s.SComponentGolf;
import z.ArrayListInZPackage;

public class au extends JPanel implements AInterfaceOscar {
  JTextField ExceptionInVPackage = new JTextField(SComponentGolf.b("MyCar"), 30);
  
  JTextField b = new JTextField("", 30);
  
  JTextField ArrayListInZPackage = new JTextField("", 25);
  
  JComboBox d = new JComboBox();
  
  JComboBox e = new JComboBox();
  
  JCheckBox f = new JCheckBox(SComponentGolf.b("Other / Browse"));
  
  JCheckBox SComponentGolf;
  
  JButton h = new JButton(SComponentGolf.b("Browse"));
  
  JButton i = new JButton(SComponentGolf.b("Browse"));
  
  JButton ThreadedFile = new JButton(SComponentGolf.b("Detect"));
  
  JButton k = new JButton(SComponentGolf.b("Detect"));
  
  JLabel l = new JLabel();
  
  JTextArea m = new JTextArea(8, 0);
  
  aY n = null;
  
  ArrayList AInterfaceOscar = new ArrayList();
  
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
    setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Project Configuration")));
    setLayout(new BoxLayout(this, 1));
    this.ExceptionInVPackage.addFocusListener(new aD(this));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Project Name")));
    jPanel1.add("Center", this.ExceptionInVPackage);
    this.ExceptionInVPackage.addKeyListener(new aE(this));
    add(jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Project Directory")));
    String str = ThreadedFile.u();
    str = ThreadedFile.u() + this.ExceptionInVPackage.getText() + File.separator;
    this.b.setText(str);
    this.b.setEditable(false);
    jPanel2.add("Center", this.b);
    jPanel2.add("East", this.h);
    this.h.addActionListener(new aA(this));
    add(jPanel2);
    this.r.setLayout(new BorderLayout());
    this.r.setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Firmware")));
    this.p = new CardLayout();
    this.q.setLayout(this.p);
    JPanel jPanel3 = new JPanel();
    long l = System.currentTimeMillis();
    jPanel3.setLayout(new BorderLayout(5, 5));
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout(5, 5));
    this.d.addItem(new aB(this, null));
    try {
      File[] arrayOfFile = ThreadedFile.n();
      String str1 = null;
      String str2 = null;
      if (T.ExceptionInVPackage().ArrayListInZPackage() != null) {
        str2 = T.ExceptionInVPackage().ArrayListInZPackage().i();
        str1 = T.ExceptionInVPackage().ArrayListInZPackage().P();
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
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      bV.d(ExceptionInVPackage.getMessage(), this);
    } 
    D.ArrayListInZPackage("Time to load ini list: " + (System.currentTimeMillis() - l) + "ms.");
    jPanel4.add("Center", this.d);
    jPanel4.add("East", this.ThreadedFile);
    this.ThreadedFile.addActionListener(new av(this));
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
    jPanel7.add("Center", this.ArrayListInZPackage);
    this.ArrayListInZPackage.setEnabled(this.f.isSelected());
    this.ArrayListInZPackage.setEditable(false);
    this.i.setEnabled(this.f.isSelected());
    this.i.addActionListener(new aC(this));
    this.r.add("Center", jPanel7);
    this.SComponentGolf = new JCheckBox(SComponentGolf.b("Show Advanced / Offline Setup"));
    this.SComponentGolf.addActionListener(new ay(this));
    JPanel jPanel8 = new JPanel();
    jPanel8.setLayout(new BorderLayout());
    jPanel8.add("East", this.SComponentGolf);
    this.r.add("South", jPanel8);
    add(this.r);
    ExceptionInVPackage(false);
    JPanel jPanel9 = new JPanel();
    jPanel9.setLayout(new GridLayout());
    jPanel9.setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Project Description")));
    JScrollPane jScrollPane = new JScrollPane(this.m);
    this.m.setLineWrap(true);
    jPanel9.add(jScrollPane);
    jScrollPane.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane.setPreferredSize(eJ.ExceptionInVPackage(300, 160));
    add(jPanel9);
  }
  
  protected String b() {
    return !this.b.getText().trim().equals("") ? this.b.getText().substring(0, this.b.getText().lastIndexOf(File.separatorChar)) : ".";
  }
  
  public void ExceptionInVPackage(boolean paramBoolean) {
    if (paramBoolean) {
      this.p.show(this.q, "Manual");
      this.r.setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("ECU Definition")));
    } else {
      this.p.show(this.q, "Basic");
      this.r.setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Firmware")));
    } 
    this.SComponentGolf.setSelected(paramBoolean);
  }
  
  public void b(String paramString) {
    this.l.setText(paramString);
  }
  
  public void b(boolean paramBoolean) {
    this.ExceptionInVPackage.setEnabled(!paramBoolean);
    this.b.setEnabled(!paramBoolean);
    this.h.setEnabled(!paramBoolean);
  }
  
  public void ArrayListInZPackage(String paramString) {
    if (paramString != null && !paramString.endsWith(File.separator))
      paramString = paramString + File.separator; 
    this.b.setText(paramString);
  }
  
  public void d(String paramString) {
    ExceptionInVPackage(new File(paramString));
  }
  
  public void ExceptionInVPackage(File paramFile) {
    aB aB = new aB(this, paramFile);
    this.d.addItem(aB);
    this.d.setSelectedItem(aB);
    this.ArrayListInZPackage.setText(paramFile.getAbsolutePath());
    String str = z.ExceptionInVPackage(paramFile);
    if (str != null && T.ExceptionInVPackage().ArrayListInZPackage() != null && T.ExceptionInVPackage().ArrayListInZPackage().i().equals(str) && T.ExceptionInVPackage().ArrayListInZPackage().P() != null && T.ExceptionInVPackage().ArrayListInZPackage().P().length() > 0) {
      this.l.setText(T.ExceptionInVPackage().ArrayListInZPackage().P());
    } else if (str != null) {
      this.l.setText(SComponentGolf.b("Serial Signature") + ": " + str);
    } 
  }
  
  public String ArrayListInZPackage() {
    return this.m.getText();
  }
  
  public void e(String paramString) {
    this.m.setText(paramString);
  }
  
  protected void f(String paramString) {
    paramString = paramString + File.separator + this.ExceptionInVPackage.getText();
    this.b.setText(paramString);
  }
  
  public void d() {
    if (this.n != null) {
      this.n.e();
      this.n = null;
    } 
    this.n = new aY(bV.b(this));
    this.n.setVisible(true);
    this.n.ExceptionInVPackage(this);
    Iterator<AInterfaceOscar> iterator = this.AInterfaceOscar.iterator();
    while (iterator.hasNext())
      this.n.ExceptionInVPackage(iterator.next()); 
  }
  
  public boolean e() {
    String str = "";
    if (h() == null)
      str = str + SComponentGolf.b("ECU Configuration is Required, Please provide ExceptionInVPackage valid ECU configuration File.") + "\n"; 
    File file = SComponentGolf();
    if (file == null)
      str = str + SComponentGolf.b("Project Directory is Required") + ",\n" + SComponentGolf.b("Please select ExceptionInVPackage project directory.") + "\n"; 
    if (this.b.isEnabled() && file.exists())
      str = str + SComponentGolf.b("Project Directory already exists") + ",\n" + SComponentGolf.b("Please select ExceptionInVPackage unique project name-directory combination.") + "\n"; 
    if (str.length() > 0) {
      bV.d(str, this);
      return false;
    } 
    return true;
  }
  
  public String f() {
    return this.ExceptionInVPackage.getText();
  }
  
  public void SComponentGolf(String paramString) {
    this.ExceptionInVPackage.setText(paramString);
  }
  
  public File SComponentGolf() {
    return (this.b.getText().length() == 0) ? null : new File(this.b.getText());
  }
  
  public File h() {
    if (this.f.isSelected()) {
      File file = new File(this.ArrayListInZPackage.getText());
      return file.exists() ? file : null;
    } 
    aB aB = (aB)this.d.getSelectedItem();
    return (aB == null || aB.ExceptionInVPackage() == null) ? null : aB.ExceptionInVPackage();
  }
  
  public void b(String paramString1, String paramString2, List paramList, bT parambT) {
    D.ArrayListInZPackage("Ok, device accepted:" + parambT);
    h(paramString2);
    ExceptionInVPackage(paramList);
    ExceptionInVPackage(parambT);
    if (parambT.f()) {
      boolean bool = bV.ExceptionInVPackage(SComponentGolf.b("The selected controller is in Bootload Mode.") + "\n" + SComponentGolf.b("This means there is no firmware loaded or ExceptionInVPackage boot jumper has been installed.") + "\n" + SComponentGolf.b("To use this controller you must have firmware installed.") + "\n\n" + SComponentGolf.b("Would you like to open the Firmware Loader now?"), this, true);
      if (bool) {
        f.ExceptionInVPackage().f();
        f.ExceptionInVPackage().i(dd.ExceptionInVPackage().ArrayListInZPackage());
      } 
      return;
    } 
    aB aB = i(parambT.b());
    if (aB == null) {
      R r = w.ExceptionInVPackage(parambT.b());
      if (r.ExceptionInVPackage()) {
        String str1 = SComponentGolf.b("Your installation of " + ExceptionInVPackage.b + " does not have ExceptionInVPackage configuration to support the firmware found:") + "\n" + parambT.ArrayListInZPackage() + "\n\n" + SComponentGolf.b("Required Serial Signature:") + "\n" + parambT.b() + "\n\n" + SComponentGolf.b("However this file is available on EFI Analytics servers.") + "\n" + SComponentGolf.b("Would you like " + ExceptionInVPackage.b + " to download the file for you?") + "\n" + SComponentGolf.b("File Size") + ": " + X.ExceptionInVPackage(r.b()) + "\n";
        int i = JOptionPane.showConfirmDialog(this, str1, SComponentGolf.b("Internet Download"), 0, 3);
        if (i == 0)
          aB = b(parambT); 
        if (aB != null) {
          this.d.addItem(aB);
          this.d.setSelectedItem(aB);
        } 
      } else {
        String str1 = SComponentGolf.b(ExceptionInVPackage.b + " does not have ExceptionInVPackage configuration to support the found firmware") + ":\n" + parambT.ArrayListInZPackage() + "\n\n" + SComponentGolf.b("Required Serial Signature") + ":\n" + parambT.b() + "\n\n\n" + SComponentGolf.b("Please click the 'Other' checkbox and browse") + ", \n" + SComponentGolf.b("to the Ecu Definition (ini) file provided with your firmware.");
        bV.d(str1, this);
      } 
    } 
    String str = null;
    if (parambT.ArrayListInZPackage() != null && parambT.ArrayListInZPackage().length() > 0 && !parambT.ArrayListInZPackage().equals(parambT.b())) {
      str = parambT.ArrayListInZPackage();
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
    JDialog jDialog = bV.ExceptionInVPackage(dd.ExceptionInVPackage().ArrayListInZPackage(), SComponentGolf.b("Downloading Ecu Definition file for") + " " + parambT.b());
    try {
      aB aB = null;
      R r = w.ExceptionInVPackage(parambT.b(), ThreadedFile.ArrayListInZPackage());
      if (r.ExceptionInVPackage()) {
        aB = new aB(this, r.ArrayListInZPackage());
        if (parambT.ArrayListInZPackage() != null && parambT.ArrayListInZPackage().length() > 5)
          aB.b(parambT.ArrayListInZPackage()); 
      } else {
        bV.d(r.d(), this);
        return null;
      } 
      if (aB != null);
      return aB;
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(au.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
      bV.d(ExceptionInVPackage.getMessage(), this);
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
  
  public void ExceptionInVPackage() {
    this.n.b(this);
    Iterator<AInterfaceOscar> iterator = this.AInterfaceOscar.iterator();
    while (iterator.hasNext())
      this.n.b(iterator.next()); 
  }
  
  public void b(double paramDouble) {}
  
  public void ExceptionInVPackage(String paramString) {}
  
  private void m() {
    String[] arrayOfString = { "ini", "ecu" };
    String str = bV.b(this, SComponentGolf.b("Find ecu definition file"), arrayOfString, "", "");
    if (str != null && !str.equals("")) {
      String str1 = z.ExceptionInVPackage(str);
      if (str1 != null) {
        d(str);
        this.f.setSelected(true);
      } else {
        bV.d(SComponentGolf.b("The selected file does not appear to be ExceptionInVPackage valid ECU Definition file.") + "\n" + SComponentGolf.b("No Valid Signature Found in file") + ":\n" + str, this);
        this.f.setSelected(false);
      } 
    } else {
      this.f.setSelected(false);
      this.d.setEnabled(true);
    } 
  }
  
  public boolean ExceptionInVPackage(String paramString1, String paramString2, List paramList, bT parambT) {
    if (paramString2.contains(":")) {
      String str = paramString2.substring(0, paramString2.indexOf(":"));
      if (!ArrayListInZPackage.ExceptionInVPackage().ExceptionInVPackage(str)) {
        String str1 = SComponentGolf.b("The Controller found requires ExceptionInVPackage driver that is not available in this edition of the application.");
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
  
  public List ThreadedFile() {
    return this.t;
  }
  
  public void ExceptionInVPackage(List paramList) {
    this.t = paramList;
  }
  
  public bT k() {
    return this.u;
  }
  
  public void ExceptionInVPackage(bT parambT) {
    this.u = parambT;
  }
  
  public void ExceptionInVPackage(AInterfaceXray paramx) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/au.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */