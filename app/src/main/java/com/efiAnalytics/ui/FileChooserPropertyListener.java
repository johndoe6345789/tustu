package com.efiAnalytics.ui;

import bH.D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JFileChooser;

class FileChooserPropertyListener implements PropertyChangeListener {
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    String str = paramPropertyChangeEvent.getPropertyName();
    JFileChooser jFileChooser = (JFileChooser) paramPropertyChangeEvent.getSource();
    if ("directoryChanged".equals(str)) {
      D.c(
          "Directory Changed:\n\tOld:"
              + paramPropertyChangeEvent.getOldValue()
              + "\n\tNew:"
              + paramPropertyChangeEvent.getNewValue());
    } else if ("SelectedFileChangedProperty".equals(str)) {
      D.c(
          "File Changed:\n\tOld:"
              + paramPropertyChangeEvent.getOldValue()
              + "\n\tNew:"
              + paramPropertyChangeEvent.getNewValue());
      if (paramPropertyChangeEvent.getNewValue() != null)
        ;
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
