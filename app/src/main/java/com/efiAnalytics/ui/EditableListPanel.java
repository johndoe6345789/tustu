package com.efiAnalytics.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class EditableListPanel extends JPanel implements ListSelectionListener {
  JList a = new JList();
  
  en b = new en(this);
  
  int c = 19;
  
  JButton d;
  
  JButton e;
  
  JButton f;
  
  JButton g;
  
  Object h = null;
  
  ArrayList i = new ArrayList();
  
  public static String j = "Add Item";
  
  public static String k = "Delete Item";
  
  public static String l = "Raise Item Index";
  
  public static String m = "Lower Item Index";
  
  public EditableListPanel() {
    this.a.setVisibleRowCount(4);
    this.a.setModel(this.b);
    this.a.addListSelectionListener(this);
    setLayout(new BorderLayout(4, 4));
    JScrollPane jScrollPane = new JScrollPane();
    jScrollPane.getViewport().setView(this.a);
    jScrollPane.setBorder(BorderFactory.createLoweredBevelBorder());
    add("Center", jScrollPane);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(0, 1, 2, 2));
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/plus.gif"));
    ImageIcon imageIcon = new ImageIcon(image);
    this.f = new JButton(null, imageIcon);
    this.f.setToolTipText(j);
    this.f.addActionListener(new ej(this));
    this.f.setPreferredSize(new Dimension(this.c, this.c));
    jPanel.add(this.f);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/delete.gif"));
    imageIcon = new ImageIcon(image);
    this.g = new JButton(null, imageIcon);
    this.g.setToolTipText(k);
    this.g.addActionListener(new ek(this));
    this.g.setPreferredSize(new Dimension(this.c, this.c));
    jPanel.add(this.g);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/up.gif"));
    imageIcon = new ImageIcon(image);
    this.d = new JButton(null, imageIcon);
    this.d.setToolTipText(l);
    this.d.addActionListener(new el(this));
    this.d.setPreferredSize(new Dimension(this.c, this.c));
    jPanel.add(this.d);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/down.gif"));
    imageIcon = new ImageIcon(image);
    this.e = new JButton(null, imageIcon);
    this.e.setToolTipText(m);
    this.e.addActionListener(new em(this));
    this.e.setPreferredSize(new Dimension(this.c, this.c));
    jPanel.add(this.e);
    add("East", jPanel);
    f();
  }
  
  private void f() {
    this.d.setEnabled((this.a.getSelectedValue() != null && this.a.getSelectedIndex() > 0));
    this.e.setEnabled((this.a.getSelectedValue() != null && this.a.getSelectedIndex() < this.b.getSize() - 1));
    this.g.setEnabled((this.a.getSelectedValue() != null));
  }
  
  public void a(Object paramObject) {
    this.b.add(this.b.getSize(), (E)paramObject);
  }
  
  public void b(Object paramObject) {
    this.a.setSelectedValue(paramObject, true);
  }
  
  public void a(int paramInt) {
    this.b.remove(paramInt);
    f();
  }
  
  public Object[] a() {
    return this.b.toArray();
  }
  
  protected void b() {
    g();
    f();
  }
  
  protected void c() {
    if (h()) {
      this.b.remove(this.a.getSelectedIndex());
      f();
    } 
  }
  
  protected void d() {
    if (this.a.getSelectedValue() != null && this.a.getSelectedIndex() > 0 && a(this.a.getSelectedValue(), this.a.getSelectedIndex() - 1, this.a.getSelectedIndex())) {
      E e = this.b.get(this.a.getSelectedIndex());
      int i = this.a.getSelectedIndex();
      this.b.remove(this.a.getSelectedIndex());
      this.b.insertElementAt(e, i - 1);
      this.a.setSelectedValue(e, true);
      f();
    } 
  }
  
  protected void e() {
    if (this.a.getSelectedValue() != null && this.a.getSelectedIndex() < this.b.getSize() - 1 && a(this.a.getSelectedValue(), this.a.getSelectedIndex() - 1, this.a.getSelectedIndex())) {
      E e = this.b.get(this.a.getSelectedIndex());
      int i = this.a.getSelectedIndex();
      this.b.remove(this.a.getSelectedIndex());
      this.b.insertElementAt(e, i + 1);
      this.a.setSelectedValue(e, true);
      f();
    } 
  }
  
  private void g() {
    Iterator<eh> iterator = this.i.iterator();
    while (iterator.hasNext())
      ((eh)iterator.next()).a(this.b); 
  }
  
  private boolean h() {
    if (this.a.getSelectedValue() != null) {
      Iterator<eh> iterator = this.i.iterator();
      while (iterator.hasNext()) {
        if (!((eh)iterator.next()).a(this.a.getSelectedValue(), this.a.getSelectedIndex()))
          return false; 
      } 
      return true;
    } 
    return false;
  }
  
  private boolean a(Object paramObject, int paramInt1, int paramInt2) {
    Iterator<eh> iterator = this.i.iterator();
    while (iterator.hasNext()) {
      if (!((eh)iterator.next()).a(paramObject, paramInt1, paramInt2))
        return false; 
    } 
    return true;
  }
  
  private void c(Object paramObject) {
    Iterator<eh> iterator = this.i.iterator();
    while (iterator.hasNext())
      ((eh)iterator.next()).a(paramObject); 
  }
  
  private void d(Object paramObject) {
    Iterator<eh> iterator = this.i.iterator();
    while (iterator.hasNext())
      ((eh)iterator.next()).b(paramObject); 
  }
  
  public void a(eh parameh) {
    this.i.add(parameh);
  }
  
  public void valueChanged(ListSelectionEvent paramListSelectionEvent) {
    if (this.a.getSelectedValue() == null) {
      int i = paramListSelectionEvent.getFirstIndex();
      if (i < this.b.getSize()) {
        E e = this.b.getElementAt(i);
        d(e);
      } else {
        d((Object)null);
      } 
      this.h = null;
    } else {
      Object object = this.a.getSelectedValue();
      if (paramListSelectionEvent.getValueIsAdjusting()) {
        if (this.h != null)
          d(this.h); 
        c(object);
        this.h = object;
      } 
    } 
    f();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ei.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */