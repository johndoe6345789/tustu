package com.efiAnalytics.tunerStudio.search;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JWindow;

public class i extends JWindow {
  JPanel a = new JPanel();
  
  int b = 240;
  
  int c = 400;
  
  List d = new ArrayList();
  
  public i() {
    this.a.setLayout(new BoxLayout(this.a, 1));
    JScrollPane jScrollPane = new JScrollPane(this.a);
    jScrollPane.setMaximumSize(new Dimension(this.b, this.c));
    jScrollPane.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
    jScrollPane.setHorizontalScrollBarPolicy(31);
    setLayout(new BorderLayout());
    add("Center", jScrollPane);
  }
  
  public void a(List paramList, String paramString) {
    for (B b : paramList) {
      j j = new j(this, b, paramString);
      this.a.add(j);
    } 
    b();
  }
  
  public void a() {
    this.a.removeAll();
    this.d.clear();
  }
  
  protected void b() {
    if (this.a.getComponentCount() > 0) {
      Dimension dimension = getPreferredSize();
      if (dimension.height > this.c)
        dimension.height = this.c; 
      dimension.width += 40;
      setSize(dimension);
    } 
  }
  
  private List g() {
    if (this.d.isEmpty())
      for (byte b = 0; b < this.a.getComponentCount(); b++) {
        if (this.a.getComponent(b) instanceof j) {
          j j = (j)this.a.getComponent(b);
          List list = j.a();
          this.d.addAll(list);
        } 
      }  
    return this.d;
  }
  
  public boolean a(int paramInt) {
    List<D> list = g();
    for (byte b = 0; b < list.size(); b++) {
      ((D)list.get(b)).a((b == paramInt));
      if (b == paramInt) {
        Rectangle rectangle = ((D)list.get(b)).getBounds();
        ((D)list.get(b)).scrollRectToVisible(rectangle);
      } 
    } 
    return (paramInt >= 0 && paramInt < list.size());
  }
  
  public boolean c() {
    return a(e() + 1);
  }
  
  public boolean d() {
    return a(e() - 1);
  }
  
  public int e() {
    List<D> list = g();
    for (byte b = 0; b < list.size(); b++) {
      if (((D)list.get(b)).b())
        return b; 
    } 
    return -1;
  }
  
  public void f() {
    List<D> list = g();
    for (byte b = 0; b < list.size(); b++) {
      if (((D)list.get(b)).b()) {
        ((D)list.get(b)).a();
        return;
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */