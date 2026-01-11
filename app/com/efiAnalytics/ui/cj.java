package com.efiAnalytics.ui;

import W.j;
import W.n;
import bH.I;
import bH.S;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class cj extends JDialog implements ActionListener {
  public boolean a = false;
  
  JButton b;
  
  JButton c;
  
  JTextField d;
  
  JTextField e;
  
  JTextField f;
  
  Frame g;
  
  JComboBox h = null;
  
  public cj(Frame paramFrame, n paramn, String paramString1, String paramString2, String paramString3) {
    super(paramFrame, "Field Properties", true);
    this.g = paramFrame;
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1));
    jPanel1.add(new JLabel("    This sets a fixed Min and Max value for the defined field. "));
    jPanel1.add(new JLabel("  The graph for this field will be scaled based on this min max,"));
    jPanel1.add(new JLabel("  instead of auto-scaling based on actual min and max in log file."));
    jPanel1.add(new JLabel(" "));
    jPanel1.add(new JLabel("         Enter Field Name (case sensitive), Min and Max"));
    add(jPanel1, "North");
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(0, 2));
    add("Center", jPanel2);
    JLabel jLabel = new JLabel("Field Name");
    jPanel2.add(jLabel);
    this.d = new JTextField(paramString1);
    this.d.setBorder(BorderFactory.createLoweredBevelBorder());
    this.d.setEnabled(paramString1.equals(""));
    if (paramString1 != null && paramString1.isEmpty() && paramn != null) {
      this.h = new JComboBox();
      ArrayList<String> arrayList = new ArrayList();
      for (byte b = 0; b < paramn.size(); b++) {
        String str = ((j)paramn.get(b)).a();
        arrayList.add(str);
      } 
      List list = S.b(arrayList);
      for (String str : list)
        this.h.addItem(str); 
      jPanel2.add(this.h);
    } else {
      jPanel2.add(this.d);
    } 
    jLabel = new JLabel("Scale Minimum");
    jPanel2.add(jLabel);
    this.e = new JTextField(paramString2);
    this.e.setBorder(BorderFactory.createLoweredBevelBorder());
    jPanel2.add(this.e);
    jLabel = new JLabel("Scale Maximum");
    jPanel2.add(jLabel);
    this.f = new JTextField(paramString3);
    this.f.setBorder(BorderFactory.createLoweredBevelBorder());
    jPanel2.add(this.f);
    add(new JLabel("  "), "West");
    add(new JLabel("  "), "East");
    a(true);
    pack();
    Dimension dimension1 = paramFrame.getSize();
    Dimension dimension2 = getSize();
    Point point = paramFrame.getLocation();
    setLocation((int)(point.getX() + (dimension1.getWidth() - dimension2.getWidth()) / 2.0D), (int)(point.getY() + (dimension1.getHeight() - dimension2.getHeight()) / 2.0D));
    setVisible(true);
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
    paramJPanel.add(this.b = new JButton("OK"));
    this.b.addActionListener(this);
  }
  
  protected void b(JPanel paramJPanel) {
    paramJPanel.add(this.c = new JButton("Cancel"));
    this.c.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getSource() == this.b && d()) {
      this.a = true;
      setVisible(false);
    } else if (paramActionEvent.getSource() == this.c) {
      setVisible(false);
    } 
  }
  
  private boolean d() {
    if (!I.a(this.e.getText()) || !I.a(this.f.getText())) {
      bV.d("Minimum and Maximum Must Be Numeric", this.g);
      return false;
    } 
    if (this.h == null && this.d.getText().equals("")) {
      bV.d("Invalid Field Name", this.g);
      return false;
    } 
    return true;
  }
  
  public String a() {
    return (this.h != null) ? (String)this.h.getSelectedItem() : this.d.getText();
  }
  
  public String b() {
    return this.e.getText();
  }
  
  public String c() {
    return this.f.getText();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */