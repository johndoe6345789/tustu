package business.buffer_factories.bF_components;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

class JTableExtensionGetcelleditor extends JTable {
  p a = null;
  
  public JTableExtensionGetcelleditor(d paramd, Object[][] paramArrayOfObject, String[] paramArrayOfString) {
    super(paramArrayOfObject, (Object[])paramArrayOfString);
    setSelectionModel(new o(this, paramd));
  }
  
  public TableCellRenderer getCellRenderer(int paramInt1, int paramInt2) {
    if (this.a == null)
      this.a = new p(this.b); 
    if (!this.b.a.isEnabled()) {
      this.a.setForeground(Color.GRAY);
    } else {
      this.a.setForeground(UIManager.getColor("Label.foreground"));
    } 
    return this.a;
  }
  
  public TableCellEditor getCellEditor(int paramInt1, int paramInt2) {
    TableCellEditor tableCellEditor = super.getCellEditor(paramInt1, paramInt2);
    if (tableCellEditor != null)
      tableCellEditor.cancelCellEditing(); 
    return tableCellEditor;
  }
  
  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */