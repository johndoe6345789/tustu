package com.efiAnalytics.tuningwidgets.panels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

class TablePanelMenuButtonListener implements ActionListener {
  TablePanelMenuButtonListener(SelectableTablePanel paramSelectableTablePanel) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JButton jButton = (JButton)paramActionEvent.getSource();
    SelectableTablePanel.a(this.a, jButton.getX(), jButton.getY() + jButton.getHeight());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/aw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */