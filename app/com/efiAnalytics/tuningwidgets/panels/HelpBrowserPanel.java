package com.efiAnalytics.tuningwidgets.panels;

import V.a;
import ai.f;
import bH.D;
import bH.n;
import java.awt.BorderLayout;
import java.awt.Component;
import java.io.File;
import javax.swing.JPanel;
import r.a;

public class HelpBrowserPanel extends JPanel {
  f a = null;
  
  public ad() {
    this.a = new f();
    setLayout(new BorderLayout());
    add("Center", (Component)this.a);
    File file = new File(".");
    String str = "file:///" + file.getAbsolutePath() + "/help/" + a.v;
    if (!n.b())
      str = "file:///" + file.getAbsolutePath() + "/help/" + a.w; 
    try {
      this.a.b(str);
    } catch (a a) {
      D.a("unable to open:\n" + str + "\n" + a.getMessage());
    } 
    this.a.a(false);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/ad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */