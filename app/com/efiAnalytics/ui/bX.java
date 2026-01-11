package com.efiAnalytics.ui;

import java.awt.event.ActionEvent;
import java.io.File;
import java.nio.file.Files;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

class bX extends AbstractAction {
  public void actionPerformed(ActionEvent paramActionEvent) {
    JFileChooser jFileChooser = (JFileChooser)paramActionEvent.getSource();
    try {
      File[] arrayOfFile;
      if (jFileChooser.isMultiSelectionEnabled()) {
        arrayOfFile = jFileChooser.getSelectedFiles();
      } else if (jFileChooser.getSelectedFile() != null) {
        arrayOfFile = new File[1];
        arrayOfFile[0] = jFileChooser.getSelectedFile();
      } else {
        return;
      } 
      if (arrayOfFile != null && bV.i() == 0) {
        for (File file : arrayOfFile)
          Files.delete(file.toPath()); 
        jFileChooser.rescanCurrentDirectory();
      } 
    } catch (Exception exception) {
      System.out.println(exception);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */