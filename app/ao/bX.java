package ao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.ItemSelectable;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class bX extends ap implements ItemSelectable, ActionListener {
  ArrayList x = new ArrayList();
  
  PopupMenu y = new PopupMenu();
  
  public bX() {
    this("");
  }
  
  public bX(String paramString) {
    super(paramString);
    add(this.y);
    this.y.addActionListener(this);
    a(this);
  }
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    if (!this.j && !this.i) {
      paramGraphics.setColor(Color.GRAY);
      paramGraphics.draw3DRect(0, 0, getWidth(), getHeight(), false);
    } 
  }
  
  public boolean b(String paramString) {
    for (byte b = 0; b < this.y.getItemCount(); b++) {
      MenuItem menuItem = this.y.getItem(b);
      if (menuItem.getLabel().equals(paramString)) {
        a(paramString);
        return true;
      } 
    } 
    return false;
  }
  
  public void a(int paramInt) {
    b(this.y.getItem(paramInt).getLabel());
  }
  
  private void e() {
    this.y.show(this, 0, getHeight());
  }
  
  public void addItemListener(ItemListener paramItemListener) {
    this.x.add(paramItemListener);
  }
  
  public void removeItemListener(ItemListener paramItemListener) {
    this.x.remove(paramItemListener);
  }
  
  public Object[] getSelectedObjects() {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = a();
    return (Object[])arrayOfString;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getSource() == this.y && b(paramActionEvent.getActionCommand())) {
      d(paramActionEvent.getActionCommand());
    } else if (paramActionEvent.getSource() == this) {
      e();
    } 
  }
  
  private void d(String paramString) {
    ItemEvent itemEvent = new ItemEvent(this, 701, paramString, 1);
    for (ItemListener itemListener : this.x)
      itemListener.itemStateChanged(itemEvent); 
  }
  
  public void removeAll() {
    this.y.removeAll();
    a("");
  }
  
  public void c(String paramString) {
    this.y.add(paramString);
  }
  
  public String b() {
    return a();
  }
  
  public String b(int paramInt) {
    return this.y.getItem(paramInt).getLabel();
  }
  
  public int c() {
    return this.y.getItemCount();
  }
  
  public int d() {
    for (byte b = 0; b < this.y.getItemCount(); b++) {
      MenuItem menuItem = this.y.getItem(b);
      if (menuItem.getLabel().equals(a()))
        return b; 
    } 
    return -1;
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    FontMetrics fontMetrics = getFontMetrics(getFont());
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.y.getItemCount(); b2++) {
      MenuItem menuItem = this.y.getItem(b2);
      String str = menuItem.getLabel();
      int i = fontMetrics.stringWidth(str);
      b1 = (i > b1) ? i : b1;
    } 
    dimension.setSize((b1 + 18), dimension.getHeight());
    return dimension;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */