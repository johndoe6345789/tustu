package business.buffer_loaders.bL_components;

import com.efiAnalytics.ui.fh;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

class TableModelListenerTablechanged implements TableModelListener {
  TableModelListenerTablechanged(q paramq) {}
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    int i = (int)Math.ceil(fh.c(q.a(this.a)));
    if (i > this.a.a.a() && this.a.a.a(0L) != null)
      this.a.a = new i(this.a.a.a(0L), i + 1); 
    if (i > this.a.b.a()) {
      double d = fh.d(q.b(this.a));
      this.a.b = new g(i + 1, d);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bL/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */