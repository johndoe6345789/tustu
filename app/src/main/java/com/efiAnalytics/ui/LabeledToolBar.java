package com.efiAnalytics.ui;

import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JToolBar;
import javax.swing.UIManager;

class LabeledToolBar extends JToolBar {
  String a = "";

  Font b = new Font("Arial Unicode MS", 1, eJ.a(12));

  public LabeledToolBar(w paramw, String paramString) {
    super(paramString);
  }

  public void a(String paramString) {
    this.a = paramString;
  }

  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    paramGraphics.setColor(UIManager.getColor("Label.foreground"));
    paramGraphics.setFont(this.b);
    paramGraphics.drawString(this.a, eJ.a(6), eJ.a(12));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
