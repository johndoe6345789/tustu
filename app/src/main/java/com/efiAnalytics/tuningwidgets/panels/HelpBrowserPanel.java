package com.efiAnalytics.tuningwidgets.panels;

import V.ExceptionInVPackage;
import ai.JPanelExtensionInAiPackage;
import bH.D;
import bH.n;
import java.awt.BorderLayout;
import java.awt.Component;
import java.io.File;
import javax.swing.JPanel;
import r.ExceptionInVPackage;

public class HelpBrowserPanel extends JPanel {
  JPanelExtensionInAiPackage ExceptionInVPackage = null;
  
  public HelpBrowserPanel() {
    this.ExceptionInVPackage = new JPanelExtensionInAiPackage();
    setLayout(new BorderLayout());
    add("Center", (Component)this.ExceptionInVPackage);
    File file = new File(".");
    String str = "file:///" + file.getAbsolutePath() + "/help/" + ExceptionInVPackage.v;
    if (!n.b())
      str = "file:///" + file.getAbsolutePath() + "/help/" + ExceptionInVPackage.w; 
    try {
      this.ExceptionInVPackage.b(str);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage("unable to open:\n" + str + "\n" + ExceptionInVPackage.getMessage());
    } 
    this.ExceptionInVPackage.ExceptionInVPackage(false);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/ad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */