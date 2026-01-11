package ao;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class gR implements ItemListener {
  gR(go paramgo) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    String str = (String)this.a.b.getSelectedItem();
    this.a.b().a(str);
    this.a.d();
    if (hx.a().r() != null && str != null && str.length() > 0)
      go.a(this.a, "xTableGenField", str); 
    go.c(this.a);
    go.a(this.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */