package business.button_builders;

import ae.AeInterfaceQuebec;
import bH.ab;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

public class JTableExtensionUsingArrayList extends JTable {
  private ab b;

  private ArrayList c = new ArrayList();

  m a = new m(this);

  public JTableExtensionUsingArrayList(ab paramab) {
    this.b = paramab;
    setModel(this.a);
    setSelectionMode(0);
    setRowSelectionAllowed(true);
  }

  public void a(List paramList) {
    this.c.clear();
    this.c.addAll(paramList);
    a();
  }

  public void a() {
    this.a.fireTableDataChanged();
  }

  private String a(String paramString) {
    return (this.b != null) ? this.b.a(paramString) : paramString;
  }

  public List b() {
    return this.c;
  }

  public void a(int paramInt) {
    getSelectionModel().setSelectionInterval(paramInt, paramInt);
  }

  public AeInterfaceQuebec c() {
    return (getSelectionModel().getMinSelectionIndex() >= 0)
        ? this.c.get(getSelectionModel().getMinSelectionIndex())
        : null;
  }

  public int d() {
    return this.c.size();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
