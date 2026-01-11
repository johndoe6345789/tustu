package bB;

import bH.ab;
import com.efiAnalytics.ui.eJ;
import java.awt.FontMetrics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

public class JTableExtension extends JTable {
  ab a = null;
  
  k b = new k(this);
  
  private List c = new ArrayList();
  
  public JTableExtension(ab paramab) {
    this.a = paramab;
    setModel(this.b);
    setSelectionMode(2);
    setRowSelectionAllowed(true);
    getColumnModel().getColumn(0).setMinWidth(eJ.a(160));
    getColumnModel().getColumn(0).setMaxWidth(eJ.a(280));
    getColumnModel().getColumn(1).setMinWidth(eJ.a(160));
    getColumnModel().getColumn(1).setMaxWidth(eJ.a(280));
    setRowHeight(getFont().getSize() + eJ.a(2));
    addKeyListener(new j(this));
  }
  
  public void a() {
    int i = 0;
    FontMetrics fontMetrics = getFontMetrics(getFont());
    int j = eJ.a(4);
    for (r r : this.c) {
      int m = fontMetrics.stringWidth(r.e()) + j;
      if (m > i)
        i = m; 
    } 
    DefaultTableColumnModel defaultTableColumnModel = (DefaultTableColumnModel)getColumnModel();
    TableColumn tableColumn = defaultTableColumnModel.getColumn(0);
    defaultTableColumnModel.getColumn(0).setPreferredWidth(i);
    tableColumn.setWidth(i);
  }
  
  public void b() {
    this.b.fireTableDataChanged();
  }
  
  private String b(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }
  
  public void a(List paramList) {
    this.c = paramList;
    this.b.fireTableDataChanged();
  }
  
  public List c() {
    return this.c;
  }
  
  public r a(int paramInt) {
    return (paramInt >= 0 && paramInt < this.c.size()) ? this.c.get(paramInt) : null;
  }
  
  public boolean a(r paramr) {
    for (byte b = 0; b < this.c.size(); b++) {
      if (paramr.e().equals(((r)this.c.get(b)).e())) {
        this.c.set(b, paramr);
        this.b.fireTableDataChanged();
        return true;
      } 
    } 
    this.c.add(paramr);
    Collections.sort(this.c, new i(this));
    this.b.fireTableDataChanged();
    return false;
  }
  
  public r a(String paramString) {
    for (r r : this.c) {
      if (r.e().equals(paramString))
        return r; 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bB/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */