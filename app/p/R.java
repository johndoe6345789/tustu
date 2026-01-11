package p;

import bH.ab;
import com.efiAnalytics.ui.eJ;
import d.m;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

public class R extends JTable {
  ab a = null;
  
  private final List c = new ArrayList();
  
  S b = new S(this);
  
  public R(ab paramab) {
    this.a = paramab;
    setModel(this.b);
    getSelectionModel().setSelectionMode(0);
    int i = getFont().getSize() + eJ.a(3);
    setRowHeight(i);
  }
  
  public void a() {
    this.b.fireTableDataChanged();
  }
  
  private String b(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }
  
  public void a(m paramm) {
    for (byte b = 0; b < this.c.size(); b++) {
      m m1 = this.c.get(b);
      if (m1.l().equals(paramm.l())) {
        this.c.set(b, paramm);
        return;
      } 
    } 
    this.c.add(paramm);
    this.b.fireTableDataChanged();
  }
  
  m a(int paramInt) {
    return (paramInt >= 0 && paramInt < this.c.size()) ? this.c.get(paramInt) : null;
  }
  
  public m b() {
    int i = getSelectedRow();
    return (i >= 0 && i < this.c.size()) ? this.c.get(i) : null;
  }
  
  public boolean a(String paramString) {
    for (byte b = 0; b < this.c.size(); b++) {
      if (((m)this.c.get(b)).a().equals(paramString)) {
        this.c.remove(b);
        return true;
      } 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/R.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */