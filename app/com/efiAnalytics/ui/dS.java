package com.efiAnalytics.ui;

import bH.A;
import bH.B;
import bH.O;
import bH.f;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.StringTokenizer;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import s.g;

public class dS extends JDialog implements ClipboardOwner {
  public static int a = 1;
  
  public static int b = 2;
  
  public static int c = 4;
  
  public static int d = 8;
  
  public static int e = 16;
  
  public static int f = 32;
  
  public static int g = 64;
  
  private ea o = null;
  
  private ea p = null;
  
  private ea q = null;
  
  private ea r = null;
  
  private ea s = null;
  
  dZ h;
  
  JPanel i;
  
  JTextPane j = new JTextPane();
  
  private int t = a + b + c + d + e;
  
  O k = null;
  
  CardLayout l;
  
  JPanel m = new JPanel();
  
  private static String u = "inputs";
  
  private static String v = "paste";
  
  Clipboard n = Toolkit.getDefaultToolkit().getSystemClipboard();
  
  public dS(Window paramWindow, O paramO) {
    super(paramWindow);
    setTitle(a("Enter Registration Information"));
    this.k = paramO;
    c();
    pack();
    this.o.requestFocus();
  }
  
  private String a(String paramString) {
    return g.b(paramString);
  }
  
  private void c() {
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new FlowLayout(1));
    ButtonGroup buttonGroup = new ButtonGroup();
    JRadioButton jRadioButton1 = new JRadioButton(a("Inputs"));
    buttonGroup.add(jRadioButton1);
    jRadioButton1.addActionListener(new dT(this));
    jPanel1.add(jRadioButton1);
    JRadioButton jRadioButton2 = new JRadioButton(a("Paste Email"));
    buttonGroup.add(jRadioButton2);
    jRadioButton2.addActionListener(new dU(this));
    jPanel1.add(jRadioButton2);
    add(jPanel1, "North");
    this.l = new CardLayout();
    this.m.setLayout(this.l);
    add(this.m, "Center");
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(10, 10));
    this.h = new dZ(this, "Register " + this.k.a() + " (Select Edition)", this.k.k());
    boolean bool = false;
    for (String str : this.k.k()) {
      if (this.k.a(str)) {
        bool = true;
        break;
      } 
    } 
    this.i = new JPanel();
    this.i.setBorder(BorderFactory.createTitledBorder("Registration Information"));
    this.i.setLayout(new GridLayout(0, 1, 3, 3));
    this.o = new ea(this, a("Registered First Name") + ":", this.k.b());
    this.i.add(this.o);
    this.p = new ea(this, a("Registered Last Name") + ":", this.k.c());
    this.i.add(this.p);
    this.q = new ea(this, a("Registered eMail Address") + ":", this.k.d());
    this.i.add(this.q);
    this.r = new ea(this, a("Registration Key") + ":", this.k.f());
    this.i.add(this.r);
    this.s = new ea(this, a(this.k.m()), this.k.h());
    if (bool)
      this.i.add(this.s); 
    jPanel2.add("Center", this.i);
    this.m.add(jPanel2, u);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new FlowLayout(1));
    JButton jButton1 = new JButton(a("Paste"));
    jButton1.addActionListener(new dV(this));
    jPanel4.add(jButton1);
    jPanel3.add(jPanel4, "North");
    JScrollPane jScrollPane = new JScrollPane(this.j);
    jScrollPane.setBorder(BorderFactory.createLoweredBevelBorder());
    jPanel3.add(jScrollPane, "Center");
    this.j.addKeyListener(new dW(this));
    this.m.add(jPanel3, v);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new FlowLayout(2));
    JButton jButton2 = new JButton(a("Ok"));
    jButton2.addActionListener(new dX(this));
    jPanel5.add(jButton2);
    jButton2 = new JButton(a("Cancel"));
    jButton2.addActionListener(new dY(this));
    jPanel5.add(jButton2);
    add("South", jPanel5);
    jRadioButton1.setSelected(true);
  }
  
  private void d() {
    String str = "";
    try {
      str = this.n.getData(DataFlavor.stringFlavor).toString();
    } catch (Exception exception) {
      System.out.println("Clipboard data not valid");
      return;
    } 
    this.j.setText(str);
    e();
  }
  
  private void e() {
    String str = this.j.getText();
    boolean bool = false;
    StringTokenizer stringTokenizer = new StringTokenizer(str, "\n");
    while (stringTokenizer.hasMoreTokens()) {
      String str1 = stringTokenizer.nextToken();
      if (bool) {
        str1 = str1.trim();
        if (str1.startsWith("[End Registration]")) {
          bool = false;
          continue;
        } 
        if (str1.startsWith("First Name")) {
          String str2 = str1.substring(str1.indexOf(":") + 1);
          this.o.a.setText(str2.trim());
          continue;
        } 
        if (str1.startsWith("Last Name")) {
          String str2 = str1.substring(str1.indexOf(":") + 1);
          this.p.a.setText(str2.trim());
          continue;
        } 
        if (str1.startsWith("Registered email")) {
          String str2 = str1.substring(str1.indexOf(":") + 1);
          this.q.a.setText(str2.trim());
          continue;
        } 
        if (str1.contains("Serial Number:")) {
          String str2 = str1.substring(str1.indexOf(":") + 1);
          this.s.a.setText(str2.trim());
          continue;
        } 
        if (str1.startsWith("Registration Key")) {
          String str2 = str1.substring(str1.indexOf(":") + 1);
          this.r.a.setText(str2.trim());
        } 
        continue;
      } 
      if (str1.startsWith("[Registration]"))
        bool = true; 
    } 
  }
  
  private void f() {
    String str1 = "";
    String str2 = this.o.a().trim();
    if (str2.isEmpty())
      str1 = str1 + a("First Name") + "\n"; 
    String str3 = this.p.a().trim();
    if (str3.isEmpty())
      str1 = str1 + a("Last Name") + "\n"; 
    String str4 = this.q.a().trim();
    if (str4.isEmpty())
      str1 = str1 + a("eMail Address") + "\n"; 
    String str5 = this.r.a().trim();
    if (str5.equals(""))
      str1 = str1 + a("Registration Key") + "\n"; 
    if (!str1.equals("")) {
      str1 = a("You must provide the information used during registration for") + ":\n" + str1;
      JOptionPane.showMessageDialog(this, str1);
      return;
    } 
    String str6 = this.k.a();
    String str7 = "";
    String[] arrayOfString = this.k.k();
    String str8 = arrayOfString[0];
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (str8.length() > arrayOfString[b].length() && !arrayOfString[b].isEmpty())
        str8 = arrayOfString[b]; 
    } 
    String str9 = f.a(str2, str3, str6, str8, str4);
    String str10 = null;
    String str11 = null;
    if (a(this.k.l(), 3) || a(this.k.l(), 4)) {
      str11 = "";
      for (byte b1 = 0; !str5.equals(str11) && b1 < arrayOfString.length; b1++) {
        if (this.k.a(arrayOfString[b1])) {
          str10 = f.a(str2, str3, str6, arrayOfString[b1], str4, "01", "2015", this.s.a());
          if (str5.equals(str10)) {
            this.h.a.setSelectedIndex(b1);
            str7 = str10;
            break;
          } 
        } else {
          str11 = f.a(str2, str3, str6, arrayOfString[b1], str4, "01", "2015");
          if (str5.equals(str11)) {
            this.h.a.setSelectedIndex(b1);
            str7 = str11;
            break;
          } 
        } 
      } 
    } else if (str6.equals("MegaLogViewer")) {
      str9 = f.a(str2, str3, str6, str4);
    } 
    if (str7 == null || str7.isEmpty())
      str7 = str9; 
    if (this.k.b(str2, str3, str7, str4, "", this.s.a()))
      return; 
    if (str7 == null || str7.isEmpty() || !str7.equals(str5)) {
      boolean bool = false;
      if (str7 != null && !str7.isEmpty())
        for (B b1 : A.i().j()) {
          if (a(b1.a(), b1.b())) {
            String str13 = str6;
            if (arrayOfString.length == 1)
              str13 = str13 + " " + arrayOfString[0]; 
            String str14 = b1.a() + " " + b1.b();
            String[] arrayOfString1 = { "Download " + str14, "Cancel" };
            boolean bool1 = bV.a("The Registration information you entered is for\n" + b1.a() + " " + b1.b() + "\nYou are currently running " + str13 + "\n\nPlease check that you have the right registration information\nor downloaded the intended application edition.", "Registration Error", this, arrayOfString1);
            if (bool1)
              aN.a(b1.c()); 
            bool = true;
            break;
          } 
        }  
      if (!bool)
        JOptionPane.showMessageDialog(this, "Invalid Registration Information!\nPlease be sure to select the correct Edition\nand use the name and email address\nExactly as presented in the registration.\nIt is case sensitive."); 
      return;
    } 
    String str12 = "";
    if (this.k.a(this.h.a()))
      str12 = this.s.a(); 
    this.k.a(str2, str3, str5, str4, this.h.a(), str12);
    dispose();
  }
  
  private boolean a(int[] paramArrayOfint, int paramInt) {
    for (int i : paramArrayOfint) {
      if (i == paramInt)
        return true; 
    } 
    return false;
  }
  
  private boolean a(String paramString1, String paramString2) {
    String str1 = f.a(this.o.a().trim(), this.p.a().trim(), paramString1, paramString2, this.q.a().trim(), "01", "2015");
    String str2 = f.a(this.o.a().trim(), this.p.a().trim(), paramString1, paramString2, this.q.a().trim(), "01", "2015", this.s.a());
    String str3 = this.r.a().trim();
    return ((str1 != null && str1.equals(str3)) || (str2 != null && str2.equals(str3)));
  }
  
  public void lostOwnership(Clipboard paramClipboard, Transferable paramTransferable) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */