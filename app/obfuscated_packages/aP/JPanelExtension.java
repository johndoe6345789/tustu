package aP;

import G.r;
import G.s;
import bH.D;
import bH.S;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.SComponentGolf;

public class JPanelExtension extends JPanel {
  s[] a = null;
  
  List b = new ArrayList();
  
  public JPanelExtension() {
    setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Configuration Settings")));
  }
  
  public void a() {
    removeAll();
    repaint();
  }
  
  public void a(s[] paramArrayOfs) {
    removeAll();
    this.a = paramArrayOfs;
    setLayout(new GridLayout(0, 1));
    if (paramArrayOfs.length > 0) {
      for (byte b = 0; b < paramArrayOfs.length; b++) {
        JComboBox jComboBox = new JComboBox();
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 1));
        jPanel.setBorder(BorderFactory.createTitledBorder(SComponentGolf.b(paramArrayOfs[b].d())));
        jComboBox.setName(paramArrayOfs[b].c());
        jComboBox.setEditable(false);
        ArrayList arrayList = new ArrayList();
        Iterator iterator = paramArrayOfs[b].a();
        while (iterator.hasNext())
          arrayList.add(iterator.next()); 
        List list = S.a(arrayList);
        iterator = list.iterator();
        while (iterator.hasNext())
          jComboBox.addItem(iterator.next()); 
        jComboBox.setSelectedItem(paramArrayOfs[b].b());
        jPanel.add(jComboBox);
        add(jPanel);
        this.b.add(jComboBox);
      } 
    } else {
      add(new JLabel("No settings of this type."));
    } 
  }
  
  public r[] b() {
    r[] arrayOfR = new r[this.b.size()];
    for (byte b = 0; b < this.b.size(); b++)
      arrayOfR[b] = (r)((JComboBox)this.b.get(b)).getSelectedItem(); 
    return arrayOfR;
  }
  
  public s[] c() {
    return this.a;
  }
  
  public String[] d() {
    String[] arrayOfString = new String[this.b.size()];
    for (byte b = 0; b < this.b.size(); b++) {
      Object object = ((JComboBox)this.b.get(b)).getSelectedItem();
      if (object instanceof r) {
        arrayOfString[b] = ((r)object).aL();
      } else {
        arrayOfString[b] = (String)object;
      } 
    } 
    return arrayOfString;
  }
  
  public void a(r paramr) {
    for (byte b = 0; b < this.b.size(); b++) {
      JComboBox<String> jComboBox = this.b.get(b);
      for (byte b1 = 0; b1 < jComboBox.getItemCount(); b1++) {
        if (paramr.equals(jComboBox.getItemAt(b1))) {
          D.c("Setting: " + jComboBox.getName() + " to " + jComboBox.getItemAt(b1));
          jComboBox.setSelectedIndex(b1);
        } 
      } 
    } 
  }
  
  public void a(String paramString) {
    for (byte b = 0; b < this.b.size(); b++) {
      JComboBox<Object> jComboBox = this.b.get(b);
      for (byte b1 = 0; b1 < jComboBox.getItemCount(); b1++) {
        Object object = jComboBox.getItemAt(b1);
        if (object.equals(paramString))
          jComboBox.setSelectedItem(object); 
      } 
    } 
  }
  
  public boolean e() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */