package com.efiAnalytics.apps.ts.tuningViews;

import G.R;
import V.a;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import s.g;
import v.g;

public class b extends JPanel {
  File a = null;
  
  J b = new J();
  
  JComboBox c = new JComboBox();
  
  JTextField d = new JTextField("", 25);
  
  JCheckBox e = new JCheckBox(g.b("Other"));
  
  JButton f = new JButton("...");
  
  e g = new e(this);
  
  private R h = null;
  
  public b() {
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createTitledBorder(g.b("Select Tuning View")));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    this.c.addItem("");
    this.c.addItemListener(new c(this));
    jPanel.add("North", this.c);
    jPanel.add("West", this.e);
    this.e.addItemListener(new d(this));
    jPanel.add("Center", this.d);
    this.d.setEnabled(this.e.isSelected());
    this.d.setEditable(false);
    jPanel.add("East", this.f);
    this.f.setEnabled(this.e.isSelected());
    this.f.addActionListener(new f(this));
    add("North", jPanel);
    this.b.setEnabled(false);
    add("Center", this.b);
    this.b.y();
  }
  
  public void a(List paramList) {
    for (k k : paramList)
      this.c.addItem(k); 
    if (this.c.getItemCount() > 1)
      this.c.setSelectedIndex(1); 
  }
  
  public File a() {
    return this.a;
  }
  
  public void a(File paramFile) {
    this.a = paramFile;
    g g = new g();
    F f = null;
    try {
      f = g.a(paramFile);
      a(f);
    } catch (a a) {
      a.printStackTrace();
    } 
  }
  
  public void a(F paramF) {
    File file = null;
    try {
      file = paramF.d();
    } catch (Exception exception) {}
    if (file != null)
      try {
        remove(this.b);
        add("Center", this.g);
        BufferedImage bufferedImage = ImageIO.read(file);
        this.g.a(bufferedImage);
        validate();
        this.g.repaint();
        return;
      } catch (IOException iOException) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, iOException);
      }  
    remove(this.g);
    add("Center", this.b);
    validate();
    this.b.a(paramF);
    this.b.doLayout();
    this.b.z();
  }
  
  public boolean b() {
    return this.e.isSelected();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */