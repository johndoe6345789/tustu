package com.efiAnalytics.ui;

import java.awt.Dimension;
import java.util.EventObject;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.text.JTextComponent;

class AxisEditorTable extends JTable {
  boolean a = false;

  String[] b;

  TableCellEditor c;

  boolean d = false;

  public AxisEditorTable(w paramw, String[] paramArrayOfString, boolean paramBoolean) {
    super(
        paramBoolean ? paramArrayOfString.length : 1, paramBoolean ? 1 : paramArrayOfString.length);
    this.a = paramBoolean;
    setSelectionMode(1);
    setCellSelectionEnabled(true);
    setFillsViewportHeight(paramBoolean);
    ab ab = new ab(this);
    this.c = new aa(this);
    byte b;
    for (b = 0; b < getColumnCount(); b++) {
      TableColumn tableColumn = this.columnModel.getColumn(b);
      tableColumn.setCellRenderer(ab);
      tableColumn.setCellEditor(this.c);
    }
    a(paramw.a.i(), paramw.a.getRowHeight());
    this.b = new String[paramArrayOfString.length];
    for (b = 0; b < paramArrayOfString.length; b++) {
      String str = paramArrayOfString[b];
      this.b[b] = str;
      if (str != null)
        getModel()
            .setValueAt(
                Double.valueOf(Double.parseDouble(str)),
                paramBoolean ? b : 0,
                paramBoolean ? 0 : b);
    }
    addMouseListener(new T(this, paramw, paramBoolean));
    addFocusListener(new W(this, paramw));
    setTransferHandler(new Y(this, paramw, paramBoolean));
  }

  public boolean editCellAt(int paramInt1, int paramInt2, EventObject paramEventObject) {
    boolean bool = super.editCellAt(paramInt1, paramInt2, paramEventObject);
    if (bool && this.editorComp != null && this.editorComp instanceof JTextComponent) {
      JTextComponent jTextComponent = (JTextComponent) this.editorComp;
      if (paramEventObject == null || paramEventObject instanceof java.awt.event.KeyEvent) {
        jTextComponent.selectAll();
      } else if (paramEventObject instanceof java.awt.event.MouseEvent) {
        SwingUtilities.invokeLater(new Z(this, jTextComponent));
      }
    }
    return bool;
  }

  public String[] a() {
    String[] arrayOfString = new String[this.a ? getRowCount() : getColumnCount()];
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayOfString[b] = getValueAt(this.a ? b : 0, this.a ? 0 : b).toString();
    return arrayOfString;
  }

  private void a(int paramInt1, int paramInt2) {
    if (!this.a) paramInt1 -= 4;
    setRowHeight(paramInt2);
    setMinimumSize(new Dimension(paramInt1, paramInt2));
    for (byte b = 0; b < getColumnCount(); b++) {
      TableColumn tableColumn = this.columnModel.getColumn(b);
      tableColumn.setMinWidth(paramInt1);
      tableColumn.setPreferredWidth(paramInt1);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/S.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
