package com.efiAnalytics.tunerStudio.search;

import G.R;
import G.T;
import aP.dd;
import com.efiAnalytics.ui.eJ;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import s.g;

public class SearchBoxPanel extends JPanel {
  Font a = new Font("Helv", 0, eJ.a(11));
  
  JTextField b = new JTextField("", 15);
  
  i c = new i();
  
  String d = "";
  
  q e = null;
  
  public m() {
    setOpaque(false);
    this.b.setFont(this.a);
    this.b.setFocusCycleRoot(false);
    this.b.setFocusTraversalKeysEnabled(false);
    this.b.setFocusTraversalPolicyProvider(false);
    FlowLayout flowLayout = new FlowLayout(2);
    setLayout(flowLayout);
    add(this.b);
    e();
    this.b.addFocusListener(new n(this));
    this.b.addKeyListener(new o(this));
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.b.setEnabled(paramBoolean);
  }
  
  public void setToolTipText(String paramString) {
    super.setToolTipText(paramString);
    this.b.setToolTipText(paramString);
  }
  
  private q b() {
    if (this.e == null || !this.e.isAlive()) {
      this.e = new q(this);
      this.e.start();
    } 
    return this.e;
  }
  
  List a() {
    this.d = this.b.getText();
    ArrayList arrayList = new ArrayList();
    if (this.d.length() > 0) {
      String[] arrayOfString = T.a().d();
      for (String str : arrayOfString) {
        R r = T.a().c(str);
        if (r != null) {
          ArrayList arrayList1 = g.a(r, this.b.getText());
          arrayList.addAll(arrayList1);
        } 
      } 
      List list = dd.a().g().b(this.d);
      arrayList.addAll(list);
    } 
    return arrayList;
  }
  
  private void c() {
    List list = a();
    if (list.isEmpty()) {
      this.c.setVisible(false);
      this.d = "";
    } else {
      this.c.a();
      this.c.a(list, "Tune Settings");
      Point point = this.b.getLocationOnScreen();
      int j = point.x + this.b.getWidth();
      this.c.b();
      Dimension dimension = this.c.getSize();
      this.c.setBounds(j - dimension.width, point.y + this.b.getHeight(), dimension.width, dimension.height);
      if (!this.c.isVisible()) {
        p p = new p(this);
        SwingUtilities.invokeLater(p);
      } 
    } 
  }
  
  private void d() {
    if (this.c.isVisible()) {
      this.c.setVisible(false);
      this.d = "";
    } 
  }
  
  private void e() {
    this.b.setText(g.b("Search"));
    this.b.setForeground(Color.gray);
  }
  
  private void f() {
    this.b.setText("");
    Color color = UIManager.getColor("TextField.foreground");
    if (color != null) {
      this.b.setForeground(color);
    } else {
      this.b.setForeground(Color.black);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */