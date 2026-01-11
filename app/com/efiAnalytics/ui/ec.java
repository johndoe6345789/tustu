package com.efiAnalytics.ui;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class ec extends AbstractTableModel {
  private TableModel b;
  
  private double c = 1.0D;
  
  private double d = 0.0D;
  
  ed a = new ed(this);
  
  public int getRowCount() {
    return this.b.getRowCount();
  }
  
  public int getColumnCount() {
    return (this.b != null) ? this.b.getColumnCount() : 1;
  }
  
  public String getColumnName(int paramInt) {
    return (this.b != null) ? this.b.getColumnName(paramInt) : "";
  }
  
  public Class getColumnClass(int paramInt) {
    return (this.b != null) ? this.b.getColumnClass(paramInt) : Object.class;
  }
  
  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return (this.b != null) ? this.b.isCellEditable(paramInt1, paramInt2) : false;
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    double d;
    if (this.b == null)
      return Double.valueOf(Double.NaN); 
    Object object = this.b.getValueAt(paramInt1, paramInt2);
    try {
      if (object instanceof Double) {
        d = ((Double)object).doubleValue();
      } else {
        d = Double.parseDouble(object.toString());
      } 
    } catch (NumberFormatException numberFormatException) {
      d = Double.NaN;
    } 
    return new Double((d + this.d) * this.c);
  }
  
  public void setValueAt(Object paramObject, int paramInt1, int paramInt2) {
    if (this.b == null)
      return; 
    try {
      double d1;
      if (paramObject instanceof Double) {
        d1 = ((Double)paramObject).doubleValue();
      } else {
        d1 = Double.parseDouble(paramObject.toString());
      } 
      double d2 = d1 / this.c - this.d;
    } catch (NumberFormatException numberFormatException) {
      double d = Double.NaN;
    } 
  }
  
  public void a(TableModel paramTableModel) {
    if (paramTableModel != null)
      paramTableModel.removeTableModelListener(this.a); 
    this.b = paramTableModel;
    paramTableModel.addTableModelListener(this.a);
  }
  
  public void a(double paramDouble) {
    this.c = paramDouble;
  }
  
  public void b(double paramDouble) {
    this.d = paramDouble;
  }
  
  public void a() {
    fireTableDataChanged();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */