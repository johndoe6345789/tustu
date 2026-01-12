package business.buffer_factories;

import G.Q;
import be.BePapaImpl;
import javax.swing.tree.DefaultTreeModel;

public class BfComponentMike implements BePapaImpl {
  a a;

  public BfComponentMike(a parama) {
    this.a = parama;
  }

  public void a(Q paramQ) {
    this.a.a(paramQ);
  }

  public void b(Q paramQ) {
    for (byte b = 0; b < this.a.d.getChildCount(); b++) {
      j j = (j) this.a.d.getChildAt(b);
      DefaultTreeModel defaultTreeModel = (DefaultTreeModel) this.a.j.getModel();
      defaultTreeModel.reload(j);
    }
  }

  public void c(Q paramQ) {
    for (byte b = 0; b < this.a.d.getChildCount(); b++) {
      j j = (j) this.a.d.getChildAt(b);
      for (byte b1 = 0; b1 < j.getChildCount(); b1++) {
        j j1 = (j) j.getChildAt(b1);
        if (j1.a() != null && j1.a().equals(paramQ)) {
          j.remove(b1);
          DefaultTreeModel defaultTreeModel = (DefaultTreeModel) this.a.j.getModel();
          defaultTreeModel.reload(j);
          return;
        }
      }
    }
  }

  public void a(boolean paramBoolean) {}
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bf/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
