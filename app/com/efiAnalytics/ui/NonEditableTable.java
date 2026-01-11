package com.efiAnalytics.ui;

import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

class NonEditableTable extends JTable {
  TableCellRenderer a = null;
  
  public NonEditableTable(w paramw, Object[][] paramArrayOfObject, Object[] paramArrayOfObject1) {
    super(paramArrayOfObject, paramArrayOfObject1);
    setSelectionModel(new NoSelectionModel(this, paramw));
  }
  
  public void a(TableCellRenderer paramTableCellRenderer) {
    this.a = paramTableCellRenderer;
  }
  
  public TableCellRenderer getCellRenderer(int paramInt1, int paramInt2) {
    if (this.a == null)
      this.a = new ai(this.b); 
    return this.a;
  }
  
  public void a(int paramInt) {
    setPreferredSize(new Dimension(paramInt, 0));
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */