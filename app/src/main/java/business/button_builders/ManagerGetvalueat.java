package business.button_builders;

import ae.AeInterfaceQuebec;
import javax.swing.table.DefaultTableModel;

class ManagerGetvalueat extends DefaultTableModel {
  String[] a = new String[] {l.a(this.b, "Firmware Loader"), l.a(this.b, "Description")};

  public void m(l paraml) {
    setColumnIdentifiers((Object[]) this.a);
  }

  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return false;
  }

  public int getColumnCount() {
    return 2;
  }

  public int getRowCount() {
    return this.b.b().size();
  }

  public Object getValueAt(int paramInt1, int paramInt2) {
    return (this.b.b().size() > 0)
        ? ((paramInt2 == 0)
            ? ((AeInterfaceQuebec) this.b.b().get(paramInt1)).a()
            : ((AeInterfaceQuebec) this.b.b().get(paramInt1)).b())
        : null;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
