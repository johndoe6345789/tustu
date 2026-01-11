package com.efiAnalytics.ui;

import javax.swing.DefaultListSelectionModel;

class NoSelectionModel extends DefaultListSelectionModel {
  NoSelectionModel(NonEditableTable paramae, w paramw) {}
  
  public int getMinSelectionIndex() {
    return 1100000;
  }
  
  public int getMaxSelectionIndex() {
    return -1;
  }
  
  public boolean isSelectedIndex(int paramInt) {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/af.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */