package bB;

import javax.swing.table.DefaultTableModel;

class k extends DefaultTableModel {
  String[] a = new String[] { h.a(this.b, "Field Name"), h.a(this.b, "Scaling"), h.a(this.b, "Digits") };
  
  k(h paramh) {
    setColumnIdentifiers((Object[])this.a);
  }
  
  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return false;
  }
  
  public int getColumnCount() {
    return 3;
  }
  
  public int getRowCount() {
    return (this.b.c() != null) ? this.b.c().size() : 0;
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    if (this.b.c().size() > 0) {
      if (paramInt2 == 0)
        return ((r)this.b.c().get(paramInt1)).e(); 
      if (paramInt2 == 1) {
        r r1 = this.b.c().get(paramInt1);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(h.a(this.b, "Min")).append(": ").append(r1.c() ? "Auto" : Double.valueOf(r1.a())).append(" / ").append(h.a(this.b, "Max")).append(": ").append(r1.d() ? "Auto" : Double.valueOf(r1.b()));
        return stringBuilder.toString();
      } 
      r r = this.b.c().get(paramInt1);
      return (r.f() == -1) ? "Auto" : Integer.valueOf(r.f());
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bB/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */