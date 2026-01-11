package com.efiAnalytics.ui;

import bH.X;
import bH.ab;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserParameterDialog extends JDialog implements ActionListener {
  public boolean a = false;
  
  JButton b;
  
  JButton c;
  
  String d = null;
  
  ArrayList e = new ArrayList();
  
  ArrayList f = new ArrayList();
  
  Window g = null;
  
  boolean h = true;
  
  fx i = null;
  
  KeyListener j = null;
  
  private fy m = null;
  
  private ab n = null;
  
  JTextField k = null;
  
  JPanel l = new JPanel();
  
  public fs(Window paramWindow, String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2) {
    this(paramWindow, paramString1, paramBoolean1, paramString2, paramBoolean2, (fx)null);
  }
  
  public fs(Window paramWindow, String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2, String[] paramArrayOfString) {
    this(paramWindow, paramString1, paramBoolean1, paramString2, paramBoolean2, (fx)null, (fy)null, (ab)null, paramArrayOfString);
  }
  
  public fs(Window paramWindow, String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2, fx paramfx) {
    this(paramWindow, paramString1, paramBoolean1, paramString2, paramBoolean2, paramfx, (fy)null, (ab)null, (String[])null);
  }
  
  public fs(Window paramWindow, String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2, fx paramfx, fy paramfy, ab paramab) {
    this(paramWindow, paramString1, paramBoolean1, paramString2, paramBoolean2, paramfx, paramfy, paramab, (String[])null);
  }
  
  public fs(Window paramWindow, String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2, fx paramfx, fy paramfy, ab paramab, String[] paramArrayOfString) {
    super(paramWindow, "User Parameter", Dialog.ModalityType.DOCUMENT_MODAL);
    this.n = paramab;
    setTitle(a(""));
    this.h = paramBoolean1;
    this.i = paramfx;
    this.m = paramfy;
    setLayout(new BorderLayout());
    add("Center", this.l);
    this.l.setLayout(new BorderLayout());
    this.l.setBorder(BorderFactory.createEmptyBorder(eJ.a(8), eJ.a(8), eJ.a(8), eJ.a(8)));
    this.d = paramString1;
    this.g = paramWindow;
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(0, 1));
    this.l.add("Center", jPanel);
    if (paramString2 == null)
      paramString2 = a("User defined values required for this formula."); 
    StringTokenizer stringTokenizer = new StringTokenizer(paramString2, "\n");
    while (stringTokenizer.hasMoreElements()) {
      String str = a(stringTokenizer.nextToken());
      jPanel.add(new JLabel(str));
    } 
    this.j = new ft(this);
    addKeyListener(new fu(this));
    jPanel.add(new JLabel(""));
    int i = 0;
    byte b = 0;
    while ((i = paramString1.indexOf("{", i)) != -1) {
      JPanel jPanel1 = new JPanel();
      jPanel1.setLayout(new GridLayout(1, 2));
      String str = paramString1.substring(i + 1, i = paramString1.indexOf("}", i));
      if (!str.equals("") && !this.e.contains(str)) {
        JTextField jTextField = null;
        if (paramBoolean1) {
          jTextField = new do();
        } else {
          jTextField = new JTextField();
        } 
        if (this.k == null)
          this.k = jTextField; 
        jTextField.setBorder(BorderFactory.createLoweredBevelBorder());
        jTextField.addKeyListener(this.j);
        if (str.indexOf("Field Name") != -1)
          jTextField.setName("Field"); 
        this.e.add(str);
        this.f.add(jTextField);
        if (paramfx != null) {
          jTextField.setText(paramfx.a("userParameter_" + str, ""));
        } else if (paramArrayOfString != null && paramArrayOfString[b] != null) {
          jTextField.setText(paramArrayOfString[b]);
        } else {
          jTextField.setText("");
        } 
        jTextField.addFocusListener(new fv(this));
        jPanel1.add(new JLabel(str));
        jPanel1.add(jTextField);
        jPanel.add(jPanel1);
        b++;
      } 
    } 
    this.l.add(new JLabel(" "), "West");
    this.l.add(new JLabel(" "), "East");
    this.l.add(new JLabel(" "), "North");
    a(paramBoolean2);
    pack();
    Dimension dimension1 = paramWindow.getSize();
    Dimension dimension2 = getSize();
    Point point = paramWindow.getLocation();
    setLocation((int)(point.getX() + (dimension1.getWidth() - dimension2.getWidth()) / 2.0D), (int)(point.getY() + (dimension1.getHeight() - dimension2.getHeight()) / 2.0D));
    addKeyListener(this.j);
    fw fw = new fw(this);
    fw.start();
    setVisible(true);
  }
  
  private String a(String paramString) {
    if (this.n == null)
      this.n = bV.a(); 
    return (this.n != null) ? this.n.a(paramString) : paramString;
  }
  
  public String a() {
    if (!this.a)
      return null; 
    String str = this.d;
    for (byte b = 0; b < this.e.size(); b++) {
      String str1 = this.e.get(b);
      JTextField jTextField = this.f.get(b);
      str = X.b(str, "{" + str1 + "}", jTextField.getText());
      if (this.i != null)
        this.i.b("userParameter_" + str1, jTextField.getText()); 
    } 
    return str;
  }
  
  protected void a(boolean paramBoolean) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout());
    a(jPanel);
    if (paramBoolean == true)
      b(jPanel); 
    this.l.add("South", jPanel);
  }
  
  protected void a(JPanel paramJPanel) {
    paramJPanel.add(this.b = new JButton(a("OK")));
    this.b.addActionListener(this);
  }
  
  protected void b(JPanel paramJPanel) {
    paramJPanel.add(this.c = new JButton(a("Cancel")));
    this.c.addActionListener(this);
  }
  
  protected void b() {
    dispose();
  }
  
  protected void c() {
    if (d()) {
      this.a = true;
      setVisible(false);
    } 
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getSource() == this.b)
      c(); 
    if (paramActionEvent.getSource() == this.c) {
      this.a = false;
      b();
    } 
  }
  
  private boolean d() {
    for (JTextField jTextField : this.f) {
      if (this.m != null) {
        if (!this.m.a(jTextField.getText()))
          return false; 
        continue;
      } 
      if (this.h && (jTextField.getName() == null || !jTextField.getName().equals("Field"))) {
        double d = 0.0D;
        try {
          d = Double.parseDouble(jTextField.getText());
        } catch (Exception exception) {
          bV.d(a("Values Must Be Numeric"), this.g);
          return false;
        } 
        continue;
      } 
      if (jTextField.equals(""))
        bV.d(a("You must enter a value."), this.g); 
    } 
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */