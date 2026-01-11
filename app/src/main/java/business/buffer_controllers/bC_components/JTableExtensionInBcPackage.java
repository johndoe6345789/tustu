package business.buffer_controllers.bC_components;

import Z.ZInterfaceEcho;
import bH.ab;
import com.efiAnalytics.ui.eJ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JTable;

public class JTableExtensionInBcPackage extends JTable {
  ab a = null;
  
  d b = new d(this);
  
  private List c = new ArrayList();
  
  public JTableExtensionInBcPackage(ab paramab) {
    this.a = paramab;
    setModel(this.b);
    setSelectionMode(0);
    setRowSelectionAllowed(true);
    getColumnModel().getColumn(0).setMinWidth(eJ.a(110));
    getColumnModel().getColumn(0).setMaxWidth(eJ.a(120));
    setRowHeight(getFont().getSize() + eJ.a(2));
  }
  
  private String a(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }
  
  public void a(List paramList) {
    this.c = paramList;
    this.b.fireTableDataChanged();
  }
  
  public List a() {
    return this.c;
  }
  
  public ZInterfaceEcho a(int paramInt) {
    return (paramInt >= 0 && paramInt < this.c.size()) ? this.c.get(paramInt) : null;
  }
  
  public boolean a(ZInterfaceEcho parame) {
    for (byte b1 = 0; b1 < this.c.size(); b1++) {
      if (parame.a().equals(((ZInterfaceEcho)this.c.get(b1)).a())) {
        this.c.set(b1, parame);
        this.b.fireTableDataChanged();
        return true;
      } 
    } 
    this.c.add(parame);
    Collections.sort(this.c, new c(this));
    this.b.fireTableDataChanged();
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bC/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */