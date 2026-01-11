package business.buffer_controllers.bC_components;

import Z.ZInterfaceEcho;
import java.util.List;
import javax.swing.table.DefaultTableModel;

class ManagerGetcolumncount extends DefaultTableModel {
  String[] a = new String[] { b.a(this.b, "Standard Name"), b.a(this.b, "Imported Log Names") };
  
  d(b paramb) {
    setColumnIdentifiers((Object[])this.a);
  }
  
  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return false;
  }
  
  public int getColumnCount() {
    return 2;
  }
  
  public int getRowCount() {
    return (this.b.a() != null) ? this.b.a().size() : 0;
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    if (this.b.a().size() > 0) {
      if (paramInt2 == 0)
        return ((ZInterfaceEcho)this.b.a().get(paramInt1)).a(); 
      ZInterfaceEcho ZInterfaceEcho = this.b.a().get(paramInt1);
      StringBuilder stringBuilder = new StringBuilder();
      List<String> list = ZInterfaceEcho.b();
      for (byte b1 = 0; b1 < list.size(); b1++) {
        String str = list.get(b1);
        stringBuilder.append(str);
        if (b1 < list.size() - 1)
          stringBuilder.append(", "); 
      } 
      return stringBuilder.toString();
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bC/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */