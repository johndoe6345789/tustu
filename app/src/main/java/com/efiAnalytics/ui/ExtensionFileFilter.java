package com.efiAnalytics.ui;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class ExtensionFileFilter extends FileFilter {
  private String b;

  String a = null;

  public ExtensionFileFilter(String paramString) {
    this.b = paramString;
  }

  public boolean accept(File paramFile) {
    return paramFile.isDirectory()
        ? true
        : (paramFile.getName().toLowerCase().endsWith("." + this.b));
  }

  public String getDescription() {
    if (this.a != null) return this.a;
    String str = this.b.toLowerCase();
    switch (str) {
      case "mlg":
        return "MegaLogViewer Binary Data Log (*.mlg)";
      case "msl":
        return "MegaLogViewer ASCII Data Log (*.msl)";
      case "csv":
        return "Comma Separated Values (*.csv)";
      case "msq":
        return "Tune File (*.msq)";
      case "bigtune":
        return "BigStuff Calibration (*.bigtune)";
      case "tsproj":
        return "TunerStudio Project Archive (*.tsproj)";
      case "bsproj":
        return "BigComm Project Archive (*.bsproj)";
      case "xls":
        return "Excel (*.xls)";
    }
    return this.b + " File (*." + str + ")";
  }

  public String a() {
    return this.b;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
