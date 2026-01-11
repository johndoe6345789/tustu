package ao;

import g.k;
import h.i;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class ea implements ItemListener {
  hx a = null;
  
  ea(cd paramcd, hx paramhx) {
    this.a = paramhx;
  }
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramItemEvent.getSource();
    if (jCheckBoxMenuItem.getName().equals("graphBackColor")) {
      i.c("graphBackColor", jCheckBoxMenuItem.getText());
      this.a.a(i.a("graphBackColor", Color.white));
    } 
    if (jCheckBoxMenuItem.getName().startsWith("graphForeColor")) {
      i.c(jCheckBoxMenuItem.getName(), jCheckBoxMenuItem.getText());
      String str = k.a(jCheckBoxMenuItem.getName(), "graphForeColor", "");
      int i = Integer.parseInt(str);
      this.a.a(i.a(jCheckBoxMenuItem.getName(), Color.black), i);
      this.b.a.o();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */