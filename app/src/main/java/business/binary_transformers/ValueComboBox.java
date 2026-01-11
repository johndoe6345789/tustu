package business.binary_transformers;

import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class ValueComboBox extends JComboBox implements ItemListener {
  ArrayList a = new ArrayList();
  
  private int b = 1;
  
  public ValueComboBox() {
    this("");
  }
  
  public ValueComboBox(String paramString) {
    addItemListener(this);
  }
  
  public boolean a(String paramString) {
    for (byte b = 0; b < getItemCount(); b++) {
      if (getItemAt(b).equals(paramString)) {
        super.setSelectedItem(getItemAt(b));
        return true;
      } 
    } 
    return false;
  }
  
  public void setSelectedItem(Object paramObject) {
    if (paramObject instanceof String || paramObject instanceof z) {
      for (byte b = 0; b < getItemCount(); b++) {
        if (getItemAt(b).equals(paramObject)) {
          super.setSelectedItem(getItemAt(b));
          break;
        } 
      } 
    } else {
      super.setSelectedItem(paramObject);
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    z z = new z(this, paramString1, paramString2);
    super.addItem(z);
  }
  
  public void addItem(Object paramObject) {
    if (paramObject instanceof String) {
      z z = new z(this, (String)paramObject);
      super.addItem(z);
    } 
  }
  
  public String a(int paramInt) {
    E e = getItemAt(paramInt);
    if (e instanceof z) {
      z z = (z)e;
      if (z != null)
        return z.a(); 
    } else if (e instanceof String) {
      return e.toString();
    } 
    return null;
  }
  
  public String a() {
    Object object = getSelectedItem();
    if (object instanceof z) {
      z z = (z)object;
      if (z != null)
        return z.a(); 
    } else if (object instanceof String) {
      return object.toString();
    } 
    return null;
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    int i = (int)(getFont().getSize() * 1.9D + ((this.b - 1) * getFont().getSize()));
    dimension.height = i;
    if (dimension.width < 140)
      dimension.setSize(140, i); 
    return dimension;
  }
  
  public void a(bZ parambZ) {
    this.a.add(parambZ);
  }
  
  public void b(bZ parambZ) {
    this.a.remove(parambZ);
  }
  
  public void b() {
    this.a.clear();
  }
  
  private void c() {
    for (bZ bZ : this.a)
      bZ.b(a()); 
  }
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1)
      c(); 
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    repaint();
  }
  
  public boolean b(String paramString) {
    for (byte b = 0; b < getItemCount(); b++) {
      E e = getItemAt(b);
      if (e instanceof z) {
        z z = (z)e;
        if (z.a().equals(paramString))
          return true; 
      } else if (e instanceof String && e.toString().equals(paramString)) {
        return true;
      } 
    } 
    return false;
  }
  
  public void b(int paramInt) {
    this.b = paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */