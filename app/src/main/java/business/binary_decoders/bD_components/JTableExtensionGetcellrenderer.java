package business.binary_decoders.bD_components;

import com.efiAnalytics.ui.eJ;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

class JTableExtensionGetcellrenderer extends JTable {
  f a = new f(this);
  
  public void c(F paramF) {
    super(paramF);
    setAutoResizeMode(1);
    TableColumn tableColumn = getColumnModel().getColumn(F.a);
    tableColumn.setPreferredWidth(eJ.a(23));
    tableColumn.setMaxWidth(eJ.a(23));
    tableColumn = getColumnModel().getColumn(F.b);
    tableColumn.setPreferredWidth(eJ.a(250));
    tableColumn = getColumnModel().getColumn(F.c);
    tableColumn.setPreferredWidth(eJ.a(300));
    tableColumn = getColumnModel().getColumn(F.d);
    tableColumn.setPreferredWidth(eJ.a(50));
    tableColumn = getColumnModel().getColumn(F.e);
    tableColumn.setPreferredWidth(eJ.a(100));
    int i = getFont().getSize() + eJ.a(4);
    setRowHeight(i);
    setShowGrid(false);
    TableRowSorter<F> tableRowSorter = new TableRowSorter<>(paramF);
    setRowSorter((RowSorter)tableRowSorter);
    ArrayList<RowSorter.SortKey> arrayList = new ArrayList();
    tableRowSorter.setSortable(F.a, false);
    arrayList.add(new RowSorter.SortKey(F.b, SortOrder.ASCENDING));
    tableRowSorter.setComparator(F.c, new d(this));
    arrayList.add(new RowSorter.SortKey(F.d, SortOrder.ASCENDING));
    tableRowSorter.setComparator(F.e, new e(this));
    tableRowSorter.setSortKeys(arrayList);
    tableRowSorter.sort();
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      TableColumn tableColumn = getColumnModel().getColumn(F.c);
      tableColumn.setMinWidth(0);
      tableColumn.setMaxWidth(0);
      tableColumn.setPreferredWidth(0);
      tableColumn.setWidth(0);
    } else {
      TableColumn tableColumn = getColumnModel().getColumn(F.c);
      int i = eJ.a(300);
      tableColumn.setPreferredWidth(i);
      tableColumn.setWidth(i);
      tableColumn.setMaxWidth(i * 2);
    } 
  }
  
  public TableCellRenderer getCellRenderer(int paramInt1, int paramInt2) {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */