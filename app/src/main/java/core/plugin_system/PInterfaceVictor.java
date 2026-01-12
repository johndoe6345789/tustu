package p;

import S.SInterfaceNovember;
import bH.ab;
import com.efiAnalytics.ui.eJ;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

public class PInterfaceVictor extends JTable {
  ab a = null;

  private final List c = new ArrayList();

  w b = new w(this);

  public PInterfaceVictor(ab paramab) {
    this.a = paramab;
    setModel(this.b);
    getSelectionModel().setSelectionMode(0);
    int i = getFont().getSize() + eJ.a(3);
    setRowHeight(i);
  }

  public void a() {
    this.b.fireTableDataChanged();
  }

  private String b(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }

  public void a(SInterfaceNovember paramn) {
    for (byte b = 0; b < this.c.size(); b++) {
      SInterfaceNovember n1 = this.c.get(b);
      if (n1.a().equals(paramn.a())) {
        this.c.set(b, paramn);
        return;
      }
    }
    this.c.add(paramn);
    this.b.fireTableDataChanged();
  }

  SInterfaceNovember a(int paramInt) {
    return (paramInt >= 0 && paramInt < this.c.size()) ? this.c.get(paramInt) : null;
  }

  public SInterfaceNovember b() {
    int i = getSelectedRow();
    return (i >= 0 && i < this.c.size()) ? this.c.get(i) : null;
  }

  public boolean a(String paramString) {
    for (byte b = 0; b < this.c.size(); b++) {
      if (((SInterfaceNovember) this.c.get(b)).a().equals(paramString)) {
        this.c.remove(b);
        return true;
      }
    }
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
