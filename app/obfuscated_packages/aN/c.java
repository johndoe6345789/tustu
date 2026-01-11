package aN;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

class c implements CaretListener {
  c(a parama) {}
  
  public void caretUpdate(CaretEvent paramCaretEvent) {
    if (paramCaretEvent.getMark() != paramCaretEvent.getDot()) {
      a.b(this.a);
    } else {
      this.a.e.setText("");
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aN/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */