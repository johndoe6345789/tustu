package aY;

import W.FileInWPackage;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListSelectionListenerValuechanged implements ListSelectionListener {
  x(s params) {}
  
  public void valueChanged(ListSelectionEvent paramListSelectionEvent) {
    FileInWPackage FileInWPackage = this.a.b.a();
    boolean bool = (FileInWPackage != null) ? true : false;
    this.a.d.setEnabled(bool);
    this.a.e.setEnabled(bool);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aY/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */