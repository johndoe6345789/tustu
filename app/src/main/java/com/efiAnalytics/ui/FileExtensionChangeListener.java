package com.efiAnalytics.ui;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

class FileExtensionChangeListener implements PropertyChangeListener {
  FileExtensionChangeListener(String paramString) {}

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    File[] arrayOfFile = bV.b.getSelectedFiles();
    String str = (arrayOfFile.length >= 1) ? arrayOfFile[0].getName() : this.a;
    if (paramPropertyChangeEvent.getNewValue() instanceof cx
        && bV.b.isShowing()
        && str != null
        && str.contains(".")) {
      String str1 = ((cx) paramPropertyChangeEvent.getNewValue()).a();
      String str2 = str.substring(0, str.lastIndexOf(".") + 1);
      bV.b.setSelectedFile(new File(str2 + str1));
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
