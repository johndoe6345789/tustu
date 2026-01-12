package ao;

import g.IOJFileChooser;
import h.IOProperties;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class ea implements ItemListener {
  hx a = null;

  public void ea(cd paramcd, hx paramhx) {
    this.a = paramhx;
  }

  public void itemStateChanged(ItemEvent paramItemEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem) paramItemEvent.getSource();
    if (jCheckBoxMenuItem.getName().equals("graphBackColor")) {
      IOProperties.c("graphBackColor", jCheckBoxMenuItem.getText());
      this.a.a(IOProperties.a("graphBackColor", Color.white));
    }
    if (jCheckBoxMenuItem.getName().startsWith("graphForeColor")) {
      IOProperties.c(jCheckBoxMenuItem.getName(), jCheckBoxMenuItem.getText());
      String str = IOJFileChooser.a(jCheckBoxMenuItem.getName(), "graphForeColor", "");
      int IOProperties = Integer.parseInt(str);
      this.a.a(IOProperties.a(jCheckBoxMenuItem.getName(), Color.black), IOProperties);
      this.b.a.o();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
