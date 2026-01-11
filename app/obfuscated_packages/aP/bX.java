package aP;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class bX implements ChangeListener {
  bX(bW parambW) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    if (this.a.getSelectedIndex() == this.a.getTabCount() - 1) {
      if (this.a.a < this.a.getTabCount() - 1) {
        this.a.setSelectedIndex(this.a.a);
        bW.a(this.a);
      } else {
        this.a.setSelectedIndex(0);
      } 
    } else {
      this.a.a = this.a.getSelectedIndex();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */