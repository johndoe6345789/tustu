package ao;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class gS implements ItemListener {
  gS(go paramgo) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    String str = (String)this.a.c.getSelectedItem();
    this.a.b().b(str);
    this.a.d();
    if (hx.a().r() != null && str != null && str.length() > 0)
      go.a(this.a, "yTableGenField", str); 
    go.d(this.a);
    go.a(this.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */