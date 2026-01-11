package bx;

import bH.D;
import bH.ab;
import com.efiAnalytics.ui.eJ;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class t extends JTable {
  ab a = null;
  
  private ArrayList g = new ArrayList();
  
  w b = new w(this);
  
  HashMap c = new HashMap<>();
  
  ArrayList d = new ArrayList();
  
  Icon e = null;
  
  Icon f = null;
  
  public t(ab paramab) {
    this.a = paramab;
    setModel(this.b);
    setSelectionMode(0);
    setRowSelectionAllowed(true);
    getColumnModel().getColumn(0).setMinWidth(eJ.a(20));
    getColumnModel().getColumn(0).setPreferredWidth(eJ.a(26));
    getColumnModel().getColumn(0).setMaxWidth(eJ.a(60));
    setRowHeight(getFont().getSize() + eJ.a(2));
    getSelectionModel().addListSelectionListener(new v(this, null));
  }
  
  public void a(j paramj) {
    this.g.add(paramj);
    a();
  }
  
  public void a() {
    this.b.fireTableDataChanged();
  }
  
  public void a(int paramInt) {
    if (paramInt >= 0 && paramInt < this.g.size()) {
      j j = this.g.get(getSelectedRow());
      if (c(j.a())) {
        b(j.a());
      } else {
        a(j.a());
      } 
    } 
  }
  
  public void a(String paramString) {
    j j = e(paramString);
    if (j != null) {
      this.c.put(paramString, j);
      b(j);
      a();
    } else {
      D.d("Can Not set Filter Active, it is not loaded.");
    } 
  }
  
  public void b(String paramString) {
    j j = e(paramString);
    if (j != null) {
      this.c.remove(paramString);
      c(j);
      a();
    } else {
      D.d("Can Not set Filter Active, it is not loaded.");
    } 
  }
  
  public void a(s params) {
    this.d.add(params);
  }
  
  private void b(j paramj) {
    for (s s : this.d)
      s.a(paramj); 
  }
  
  private void c(j paramj) {
    for (s s : this.d)
      s.b(paramj); 
  }
  
  public Collection b() {
    return this.c.values();
  }
  
  public boolean c(String paramString) {
    return (this.c.get(paramString) != null);
  }
  
  public Class getColumnClass(int paramInt) {
    return (Class)((paramInt == 0) ? ImageIcon.class : Object.class);
  }
  
  Icon c() {
    if (this.e == null) {
      Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("redBulb.png"));
      this.e = new ImageIcon(image);
    } 
    return this.e;
  }
  
  Icon d() {
    if (this.f == null) {
      Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("greyBulb.png"));
      this.f = new ImageIcon(image);
    } 
    return this.f;
  }
  
  public boolean d(String paramString) {
    for (byte b = 0; b < this.g.size(); b++) {
      if (((j)this.g.get(b)).a().equals(paramString)) {
        b(paramString);
        this.g.remove(b);
        this.b.fireTableDataChanged();
        return true;
      } 
    } 
    return false;
  }
  
  public j e(String paramString) {
    for (byte b = 0; b < this.g.size(); b++) {
      if (((j)this.g.get(b)).a().equals(paramString))
        return this.g.get(b); 
    } 
    return null;
  }
  
  private String f(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }
  
  public ArrayList e() {
    return this.g;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bx/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */