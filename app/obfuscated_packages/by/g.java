package by;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;

class g extends MouseAdapter {
  g(d paramd) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    JList<String> jList = (JList)paramMouseEvent.getSource();
    if (paramMouseEvent.getClickCount() == 2)
      this.a.c(jList.getSelectedValue()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/by/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */