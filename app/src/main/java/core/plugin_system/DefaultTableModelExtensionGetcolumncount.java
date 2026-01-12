package p;

import S.SInterfaceNovember;
import javax.swing.table.DefaultTableModel;

class DefaultTableModelExtensionGetcolumncount extends DefaultTableModel {
  String[] a =
      new String[] {
        v.a(this.b, "Name"), v.a(this.b, "Trigger Expression"), v.a(this.b, "Reset Expression")
      };

  public void w(v paramv) {
    setColumnIdentifiers((Object[]) this.a);
  }

  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return false;
  }

  public int getColumnCount() {
    return 3;
  }

  public int getRowCount() {
    return v.a(this.b).size();
  }

  public Object getValueAt(int paramInt1, int paramInt2) {
    return (v.a(this.b).size() > paramInt1)
        ? ((paramInt2 == 0)
            ? ((SInterfaceNovember) v.a(this.b).get(paramInt1)).a()
            : ((paramInt2 == 1)
                ? ((SInterfaceNovember) v.a(this.b).get(paramInt1)).d()
                : ((SInterfaceNovember) v.a(this.b).get(paramInt1)).e()))
        : null;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
