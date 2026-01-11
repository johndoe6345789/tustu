package aP;

import bH.D;
import java.util.Vector;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

class js implements TableModelListener {
  js(jc paramjc) {}
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    if (paramTableModelEvent.getType() == 0) {
      int i = paramTableModelEvent.getColumn();
      int j = paramTableModelEvent.getFirstRow();
      if (j >= 0 && i >= 0)
        try {
          int[] arrayOfInt = new int[1];
          arrayOfInt[0] = jc.a(this.a, (String)((Vector)this.a.f.get(j)).get(i));
          this.a.c.a(this.a.k, j * this.a.b + i, arrayOfInt, true, true);
        } catch (Exception exception) {
          D.a("Bad number value: " + exception.getMessage());
        }  
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/js.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */