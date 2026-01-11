package bx;

import javax.swing.table.DefaultTableModel;

class p extends DefaultTableModel {
  String[] a = new String[] { o.a(this.b, "Name"), o.a(this.b, "Description") };
  
  p(o paramo) {
    setColumnIdentifiers((Object[])this.a);
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
    return (this.b.b().size() > 0) ? ((paramInt2 == 0) ? ((j)this.b.b().get(paramInt1)).a() : ((j)this.b.b().get(paramInt1)).b()) : null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bx/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */