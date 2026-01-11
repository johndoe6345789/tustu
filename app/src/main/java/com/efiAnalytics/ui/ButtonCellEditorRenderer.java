package com.efiAnalytics.ui;

import java.awt.Component;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class ButtonCellEditorRenderer extends AbstractCellEditor implements TableCellEditor, TableCellRenderer {
  private int a;
  
  private int c;
  
  List b = new ArrayList();
  
  private final JButton d = new JButton();
  
  public ButtonCellEditorRenderer() {
    this.d.addActionListener(new eW(this));
  }
  
  public void a(eX parameX) {
    this.b.add(parameX);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.c = paramInt2;
    return c();
  }
  
  public Component getTableCellEditorComponent(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.c = paramInt2;
    return c();
  }
  
  public String a() {
    return this.d.getActionCommand();
  }
  
  public void a(String paramString) {
    this.d.setActionCommand(paramString);
  }
  
  public String b() {
    return this.d.getText();
  }
  
  public void b(String paramString) {
    this.d.setText(paramString);
  }
  
  public void a(boolean paramBoolean) {
    this.d.setEnabled(paramBoolean);
  }
  
  public void addCellEditorListener(CellEditorListener paramCellEditorListener) {}
  
  public void cancelCellEditing() {
    fireEditingCanceled();
  }
  
  public Object getCellEditorValue() {
    return c().getText();
  }
  
  public boolean isCellEditable(EventObject paramEventObject) {
    return true;
  }
  
  public void removeCellEditorListener(CellEditorListener paramCellEditorListener) {}
  
  public boolean shouldSelectCell(EventObject paramEventObject) {
    return true;
  }
  
  public boolean stopCellEditing() {
    fireEditingStopped();
    return true;
  }
  
  public JButton c() {
    return this.d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/eV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */