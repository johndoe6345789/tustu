package ao;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;

class dc implements ItemListener {
  dc(cd paramcd, JMenu paramJMenu) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramItemEvent.getSource();
    String str1 = jCheckBoxMenuItem.getName();
    String str2 = jCheckBoxMenuItem.getActionCommand();
    if (!cd.a(this.b, str1, str2, (paramItemEvent.getStateChange() == 1)))
      jCheckBoxMenuItem.setState(false); 
    Map<TextAttribute, ?> map = this.a.getFont().getAttributes();
    map.put(TextAttribute.STRIKETHROUGH, Boolean.valueOf(!jCheckBoxMenuItem.getState()));
    this.a.setFont(new Font((Map)map));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */