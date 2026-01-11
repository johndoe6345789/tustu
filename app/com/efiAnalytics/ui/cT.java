package com.efiAnalytics.ui;

import bH.N;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

class cT extends JDialog {
  boolean a = false;
  
  JButton b = null;
  
  cT(cS paramcS, Frame paramFrame) {
    super(paramFrame, true);
    setTitle("Register");
    setDefaultCloseOperation(0);
    getContentPane().setLayout(new BorderLayout());
    int i = (int)(Math.random() * 100.0D) % N.a.length;
    String str = N.a[i];
    str = str + "\nSupport " + cS.a(paramcS).a() + " , Register now!";
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(0, 1));
    jPanel.add(new JLabel(" "));
    StringTokenizer stringTokenizer = new StringTokenizer(str, "\n");
    while (stringTokenizer.hasMoreTokens()) {
      JLabel jLabel = new JLabel(stringTokenizer.nextToken());
      jLabel.setHorizontalAlignment(0);
      jPanel.add(jLabel);
    } 
    jPanel.add(new JLabel(" "));
    getContentPane().add("Center", jPanel);
    getContentPane().add("South", b());
    pack();
    a(paramFrame);
    setResizable(false);
  }
  
  public void a() {
    this.b.setEnabled(false);
    (new cX(this)).start();
    setVisible(true);
  }
  
  private void a(Frame paramFrame) {
    Dimension dimension1 = paramFrame.getSize();
    Dimension dimension2 = getSize();
    Point point = paramFrame.getLocation();
    if (point.getX() <= 0.0D || point.getY() <= 0.0D) {
      dimension1 = Toolkit.getDefaultToolkit().getScreenSize();
      setLocation((int)(point.getX() + (dimension1.getWidth() - dimension2.getWidth()) / 2.0D), (int)(point.getY() + (dimension1.getHeight() - dimension2.getHeight()) / 2.0D));
    } else {
      setLocation((int)(point.getX() + (dimension1.getWidth() - dimension2.getWidth()) / 2.0D), (int)(point.getY() + (dimension1.getHeight() - dimension2.getHeight()) / 2.0D));
    } 
  }
  
  JPanel b() {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    if ((int)(Math.random() * 10.0D) % 2 == 0) {
      jPanel.add(f());
      jPanel.add(d());
    } else {
      jPanel.add(d());
      jPanel.add(f());
    } 
    jPanel.add(c());
    return jPanel;
  }
  
  private JButton c() {
    JButton jButton = new JButton("Register");
    jButton.addActionListener(new cU(this));
    return jButton;
  }
  
  private JButton d() {
    JButton jButton = new JButton("Enter Registration Key");
    jButton.addActionListener(new cV(this));
    return jButton;
  }
  
  private String e() {
    return (cS.b(this.c) <= 0) ? "Register Later" : ("Register Later (" + cS.b(this.c) + ")");
  }
  
  private JButton f() {
    this.b = new JButton(e());
    this.b.addActionListener(new cW(this));
    return this.b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */