package com.efiAnalytics.tunerStudio.search;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

class SearchGroupPanel extends JPanel {
  JPanel a = new JPanel();
  
  j(i parami, B paramB, String paramString) {
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setMinimumSize(new Dimension(50, 30));
    jPanel.setPreferredSize(new Dimension(35, 20));
    add("West", jPanel);
    JLabel jLabel = new JLabel(paramString + " - " + paramB.a());
    jLabel.setFont(new Font("SansSerif", 1, 13));
    jLabel.setForeground(Color.DARK_GRAY);
    add("North", jLabel);
    this.a.setLayout(new GridLayout(0, 1));
    for (C c : paramB) {
      D d = new D();
      d.a(c);
      this.a.add(d);
    } 
    add("Center", this.a);
  }
  
  public List a() {
    ArrayList<D> arrayList = new ArrayList();
    for (byte b = 0; b < this.a.getComponentCount(); b++) {
      D d = (D)this.a.getComponent(b);
      arrayList.add(d);
    } 
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */