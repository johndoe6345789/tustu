package bx;

import bH.ab;
import com.efiAnalytics.ui.eJ;
import java.util.ArrayList;
import javax.swing.JTable;

public class o extends JTable {
  ab a = null;
  
  private ArrayList c = new ArrayList();
  
  p b = new p(this);
  
  public o(ab paramab) {
    this.a = paramab;
    setModel(this.b);
    setSelectionMode(0);
    setRowSelectionAllowed(true);
    getColumnModel().getColumn(0).setMinWidth(eJ.a(110));
    getColumnModel().getColumn(0).setMaxWidth(eJ.a(120));
    setRowHeight(getFont().getSize() + eJ.a(2));
  }
  
  public void a(j paramj) {
    this.c.add(paramj);
    a();
  }
  
  public void b(j paramj) {
    for (byte b = 0; b < this.c.size(); b++) {
      if (((j)this.c.get(b)).a().equals(paramj.a())) {
        this.c.set(b, paramj);
        a();
        return;
      } 
    } 
    a(paramj);
  }
  
  public void a() {
    this.b.fireTableDataChanged();
  }
  
  public boolean a(String paramString) {
    for (byte b = 0; b < this.c.size(); b++) {
      if (((j)this.c.get(b)).a().equals(paramString)) {
        this.c.remove(b);
        this.b.fireTableDataChanged();
        return true;
      } 
    } 
    return false;
  }
  
  private String b(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }
  
  public ArrayList b() {
    return this.c;
  }
  
  public j a(int paramInt) {
    return (paramInt >= 0 && paramInt < this.c.size()) ? this.c.get(paramInt) : null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bx/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */