package com.efiAnalytics.ui;

import bH.X;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Image;
import java.awt.ItemSelectable;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class dc extends cp implements ItemSelectable, ActionListener {
  ArrayList z = new ArrayList();
  
  JPopupMenu A = new JPopupMenu();
  
  public dc() {
    this("");
  }
  
  public dc(String paramString) {
    super(paramString);
    add(this.A);
    a(this);
    a(true);
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/down.gif"));
    a(image);
    a(new Dimension(9, 9));
    a(4);
  }
  
  public boolean b(String paramString) {
    a(paramString);
    for (byte b = 0; b < this.A.getComponentCount(); b++) {
      JMenuItem jMenuItem = (JMenuItem)this.A.getComponent(b);
      if (jMenuItem.getText().equals(paramString) || (jMenuItem.getActionCommand() != null && jMenuItem.getActionCommand().equals(paramString))) {
        a(paramString);
        return true;
      } 
    } 
    return false;
  }
  
  public void c(String paramString) {
    JMenuItem jMenuItem = new JMenuItem();
    jMenuItem.setActionCommand(paramString);
    jMenuItem.setText(X.b(paramString, "\"", ""));
    jMenuItem.addActionListener(this);
    this.A.add(jMenuItem);
  }
  
  private void b() {
    this.A.show(this, 0, getHeight());
  }
  
  public void addItemListener(ItemListener paramItemListener) {
    this.z.add(paramItemListener);
  }
  
  public void removeItemListener(ItemListener paramItemListener) {
    this.z.remove(paramItemListener);
  }
  
  public Object[] getSelectedObjects() {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = a();
    return (Object[])arrayOfString;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getSource() instanceof JMenuItem && b(paramActionEvent.getActionCommand())) {
      d(paramActionEvent.getActionCommand());
    } else if (paramActionEvent.getSource() == this) {
      b();
    } 
  }
  
  private void d(String paramString) {
    ItemEvent itemEvent = new ItemEvent(this, 701, paramString, 1);
    for (ItemListener itemListener : this.z)
      itemListener.itemStateChanged(itemEvent); 
  }
  
  public void removeAll() {
    this.A.removeAll();
    a("");
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    FontMetrics fontMetrics = getFontMetrics(getFont());
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.A.getComponentCount(); b2++) {
      JMenuItem jMenuItem = (JMenuItem)this.A.getComponent(b2);
      String str = jMenuItem.getText();
      int i = fontMetrics.stringWidth(str);
      b1 = (i > b1) ? i : b1;
    } 
    dimension.setSize((b1 + 18), dimension.getHeight());
    return dimension;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */