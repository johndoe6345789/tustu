package com.efiAnalytics.ui;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

public abstract class FileChooserPreviewPanel extends JPanel implements PropertyChangeListener {
  public abstract void a(File paramFile);
  
  public abstract void b(File paramFile);
  
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    String str = paramPropertyChangeEvent.getPropertyName();
    JFileChooser jFileChooser = (JFileChooser)paramPropertyChangeEvent.getSource();
    if (!"directoryChanged".equals(str) && "SelectedFileChangedProperty".equals(str))
      if (paramPropertyChangeEvent.getNewValue() != null) {
        File file = new File(paramPropertyChangeEvent.getNewValue().toString());
        if (file.isDirectory()) {
          b(file);
        } else {
          a(file);
        } 
      } else if (paramPropertyChangeEvent.getOldValue() != null) {
        File file = new File(paramPropertyChangeEvent.getOldValue().toString());
        if (file.isDirectory()) {
          b(null);
        } else {
          a(null);
        } 
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ck.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */