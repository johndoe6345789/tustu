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
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class fq extends JDialog implements ActionListener {
  private boolean f = false;
  
  boolean a = false;
  
  JTextField b = null;
  
  JButton c;
  
  JButton d;
  
  Window e = null;
  
  private ab g = null;
  
  public fq(Window paramWindow, boolean paramBoolean, String paramString1, String paramString2, ab paramab) {
    super(paramWindow, "User Input", Dialog.ModalityType.TOOLKIT_MODAL);
    this.f = paramBoolean;
    this.e = paramWindow;
    this.g = paramab;
    setTitle(a("Standard Input"));
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    boolean bool = ((paramString1 != null && paramString1.contains("\n")) || paramString1.contains("<br>")) ? true : false;
    if (bool) {
      jPanel.setLayout(new BorderLayout());
      paramString1 = X.b(paramString1, "\n", "<br>");
      if (!paramString1.startsWith("<html>"))
        paramString1 = "<html>" + paramString1; 
    } else {
      jPanel.setLayout(new GridLayout(1, 2));
    } 
    add("Center", jPanel);
    if (paramString1 == null)
      paramString1 = "Value:"; 
    if (bool) {
      jPanel.add("Center", new JLabel(paramString1));
    } else {
      jPanel.add(new JLabel(paramString1));
    } 
    this.b = new JTextField();
    this.b.addFocusListener(new fr(this));
    this.b.addActionListener(this);
    if (paramString2 != null)
      this.b.setText(paramString2); 
    if (bool) {
      jPanel.add("South", this.b);
    } else {
      jPanel.add(this.b);
    } 
    add(new JLabel(" "), "West");
    add(new JLabel(" "), "East");
    add(new JLabel(" "), "North");
    a(true);
    pack();
    Dimension dimension1 = paramWindow.getSize();
    Dimension dimension2 = getSize();
    Point point = paramWindow.getLocation();
    setLocation((int)(point.getX() + (dimension1.getWidth() - dimension2.getWidth()) / 2.0D), (int)(point.getY() + (dimension1.getHeight() - dimension2.getHeight()) / 2.0D));
    this.b.selectAll();
  }
  
  public String a() {
    return !this.a ? "" : this.b.getText();
  }
  
  protected void a(boolean paramBoolean) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout());
    a(jPanel);
    if (paramBoolean == true)
      b(jPanel); 
    add("South", jPanel);
  }
  
  protected void a(JPanel paramJPanel) {
    paramJPanel.add(this.c = new JButton(a("OK")));
    this.c.addActionListener(this);
  }
  
  protected void b(JPanel paramJPanel) {
    paramJPanel.add(this.d = new JButton(a("Cancel")));
    this.d.addActionListener(this);
  }
  
  private void b() {
    if (c()) {
      this.a = true;
      setVisible(false);
    } 
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getSource() instanceof JTextField)
      b(); 
    if (paramActionEvent.getSource() == this.c)
      b(); 
    if (paramActionEvent.getSource() == this.d) {
      this.a = false;
      setVisible(false);
    } 
  }
  
  private boolean c() {
    if (this.f) {
      double d = 0.0D;
      try {
        if (this.b.getText().equals("")) {
          dk.a("Values Must Be Numeric", this.e);
          return false;
        } 
        d = Double.parseDouble(this.b.getText());
      } catch (Exception exception) {
        dk.a("Values Must Be Numeric", this.e);
        return false;
      } 
    } else if (this.b.equals("")) {
      dk.a("You must enter a value.", this.e);
    } 
    return true;
  }
  
  private String a(String paramString) {
    return (this.g != null) ? this.g.a(paramString) : paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */