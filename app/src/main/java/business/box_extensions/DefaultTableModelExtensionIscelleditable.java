package business.box_extensions;

import javax.swing.Icon;
import javax.swing.table.DefaultTableModel;

class DefaultTableModelExtensionIscelleditable extends DefaultTableModel {
  String[] a = new String[] {t.a(this.b, "On"), t.a(this.b, "Filter Name")};

  public void w(t paramt) {
    setColumnIdentifiers((Object[]) this.a);
  }

  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return false;
  }

  public int getColumnCount() {
    return 2;
  }

  public int getRowCount() {
    return this.b.e().size();
  }

  public Object getValueAt(int paramInt1, int paramInt2) {
    if (this.b.e().size() > 0) {
      if (paramInt2 == 0) {
        Icon icon;
        String str = ((j) this.b.e().get(paramInt1)).a();
        if (this.b.c(str)) {
          icon = this.b.c();
        } else {
          icon = this.b.d();
        }
        return icon;
      }
      return ((j) this.b.e().get(paramInt1)).a();
    }
    return null;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bx/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
