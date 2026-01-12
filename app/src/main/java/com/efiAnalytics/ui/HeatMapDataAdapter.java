package com.efiAnalytics.ui;

import bH.D;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class HeatMapDataAdapter implements cD, TableModelListener {
  private TableDataModel b = null;

  private int c = 1;

  ArrayList a = new ArrayList();

  public HeatMapDataAdapter(s params) {
    this.b = params;
    params.addTableModelListener(this);
  }

  public int a() {
    return this.b.getColumnCount();
  }

  public double a(int paramInt) {
    return Double.parseDouble(this.b.b()[paramInt]);
  }

  public int b() {
    return this.b.getRowCount();
  }

  public double b(int paramInt) {
    return Double.parseDouble(this.b.a()[paramInt]);
  }

  public double a(int paramInt1, int paramInt2) {
    if (this.c == 1) return this.b.d(paramInt2, paramInt1).doubleValue();
    if (this.c == 2) {
      if (this.b.D() != null) {
        b b = this.b.D()[(this.b.D()).length - 1 - paramInt2][paramInt1];
        return b.k();
      }
      return 0.0D;
    }
    if (this.c == 4) {
      if (this.b.D() != null) {
        b b = this.b.D()[paramInt2][paramInt1];
        return b.j();
      }
      return 0.0D;
    }
    if (this.c == 3)
      return (this.b.D() != null)
          ? (this.b.d(paramInt2, paramInt1).doubleValue()
              - this.b.c(paramInt2, paramInt1).doubleValue())
          : 0.0D;
    D.a("HeatMap: Unknown Z Value Mode");
    return 0.0D;
  }

  public void c(int paramInt) {
    this.c = paramInt;
  }

  public void a(cE paramcE) {
    this.a.add(paramcE);
  }

  private void b(int paramInt1, int paramInt2) {
    Iterator<cE> iterator = this.a.iterator();
    while (iterator.hasNext()) ((cE) iterator.next()).a(paramInt1, paramInt2);
  }

  public void tableChanged(TableModelEvent paramTableModelEvent) {
    b(paramTableModelEvent.getColumn(), paramTableModelEvent.getFirstRow());
  }

  public void a(s params) {
    this.b.removeTableModelListener(this);
    this.b = params;
    params.addTableModelListener(this);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
