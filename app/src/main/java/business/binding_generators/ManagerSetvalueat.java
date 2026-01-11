package business.binding_generators;

import G.GInterfaceBf;
import bH.X;
import java.util.Collections;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import s.SComponentGolf;

class ManagerSetvalueat extends DefaultTableModel {
  String[] a = new String[] { SComponentGolf.b("Name"), SComponentGolf.b("Tab Title"), SComponentGolf.b("Enabled Condition"), SComponentGolf.b("Default Index") };
  
  ManagerSetvalueat(o paramo) {}
  
  public int getRowCount() {
    return this.b.b.size();
  }
  
  public int getColumnCount() {
    return 4;
  }
  
  public String getColumnName(int paramInt) {
    return this.a[paramInt];
  }
  
  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return (paramInt2 <= 3);
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    return (paramInt2 == 0) ? ((GInterfaceBf)this.b.b.get(paramInt1)).aL() : ((paramInt2 == 1) ? ((GInterfaceBf)this.b.b.get(paramInt1)).c() : ((paramInt2 == 2) ? (((GInterfaceBf)this.b.b.get(paramInt1)).aJ().trim().isEmpty() ? "Always" : ((GInterfaceBf)this.b.b.get(paramInt1)).aJ()) : ((paramInt2 == 3) ? Integer.valueOf(((GInterfaceBf)this.b.b.get(paramInt1)).f()) : null)));
  }
  
  public void setValueAt(Object paramObject, int paramInt1, int paramInt2) {
    String str;
    GInterfaceBf GInterfaceBf = this.b.b.get(paramInt1);
    switch (paramInt2) {
      case 0:
        GInterfaceBf.v(paramObject.toString());
        break;
      case 1:
        GInterfaceBf.c(paramObject.toString());
        break;
      case 2:
        str = X.b(paramObject.toString(), "Always", "");
        GInterfaceBf.u(str.trim());
        break;
      case 3:
        GInterfaceBf.a(Integer.parseInt(paramObject.toString()));
        a();
        break;
    } 
  }
  
  private void a() {
    Collections.sort(this.b.b, new r(this));
    for (byte b = 0; b < this.b.b.size(); b++)
      ((GInterfaceBf)this.b.b.get(b)).a(b); 
    s s = new s(this);
    SwingUtilities.invokeLater(s);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bg/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */