package ao;

import h.i;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class el implements ItemListener {
  hx a = null;
  
  el(cd paramcd, hx paramhx) {
    this.a = paramhx;
  }
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramItemEvent.getSource();
    i.c("playbackSpeed", jCheckBoxMenuItem.getName());
    this.a.a(i.a("playbackSpeed", 1.0D), false);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/el.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */