package business.byte_readers;

import com.efiAnalytics.ui.s;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

class TableModelListenerInBrPackage implements TableModelListener {
  s a = null;
  
  s b = null;
  
  public TableModelListenerInBrPackage(n paramn, s params1, s params2) {
    this.a = params1;
    this.b = params2;
  }
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    if (this.a.D() != null)
      this.c.c.b(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */