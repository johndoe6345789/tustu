package aP;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

class ij implements CaretListener {
  ij(ii paramii) {}
  
  public void caretUpdate(CaretEvent paramCaretEvent) {
    if (paramCaretEvent.getMark() > paramCaretEvent.getDot())
      this.a.a(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ij.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */