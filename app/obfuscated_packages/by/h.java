package by;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;

class h extends MouseAdapter {
  h(d paramd) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    JList<k> jList = (JList)paramMouseEvent.getSource();
    if (paramMouseEvent.getClickCount() == 2)
      this.a.a(jList.getSelectedValue()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/by/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */