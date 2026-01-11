package ao;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class gT implements ItemListener {
  gT(go paramgo) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    String str = (String)this.a.d.getSelectedItem();
    this.a.b().c(str);
    this.a.d();
    if (hx.a().r() != null && str != null && !go.e(this.a) && str.length() > 0)
      go.a(this.a, "zTableGenField", str); 
    go.f(this.a);
    go.a(this.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */