package business.buffer_factories.bF_components;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableColumnModelEvent;
import javax.swing.event.TableColumnModelListener;

class ListSelectionListenerColumnadded implements ListSelectionListener, TableColumnModelListener {
  q(d paramd) {}
  
  public void valueChanged(ListSelectionEvent paramListSelectionEvent) {
    d.a(this.a);
  }
  
  public void columnAdded(TableColumnModelEvent paramTableColumnModelEvent) {}
  
  public void columnRemoved(TableColumnModelEvent paramTableColumnModelEvent) {}
  
  public void columnMoved(TableColumnModelEvent paramTableColumnModelEvent) {}
  
  public void columnMarginChanged(ChangeEvent paramChangeEvent) {}
  
  public void columnSelectionChanged(ListSelectionEvent paramListSelectionEvent) {
    if (!paramListSelectionEvent.getValueIsAdjusting())
      d.a(this.a); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */