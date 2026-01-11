package p;

import d.DInterfaceMike;
import javax.swing.table.DefaultTableModel;

class ManagerInPPackage extends DefaultTableModel {
  String[] a = new String[] { R.a(this.b, "Name"), R.a(this.b, "Display Name"), R.a(this.b, "Description") };
  
  ManagerInPPackage(R paramR) {
    setColumnIdentifiers((Object[])this.a);
  }
  
  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return false;
  }
  
  public int getColumnCount() {
    return 3;
  }
  
  public int getRowCount() {
    return R.a(this.b).size();
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    return (R.a(this.b).size() > paramInt1) ? ((paramInt2 == 0) ? ((DInterfaceMike)R.a(this.b).get(paramInt1)).l() : ((paramInt2 == 1) ? ((DInterfaceMike)R.a(this.b).get(paramInt1)).b() : ((DInterfaceMike)R.a(this.b).get(paramInt1)).j())) : null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/S.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */