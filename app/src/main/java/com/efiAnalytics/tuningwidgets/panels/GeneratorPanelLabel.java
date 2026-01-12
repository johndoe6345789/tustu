package com.efiAnalytics.tuningwidgets.panels;

import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.Icon;
import javax.swing.JLabel;

class GeneratorPanelLabel extends JLabel {
  public GeneratorPanelLabel(LinearGeneratorPanel paramM, String paramString, int paramInt) {
    super(paramString, (Icon) null, paramInt);
  }

  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    Insets insets = getInsets();
    dimension.width = getFontMetrics(getFont()).stringWidth(getText()) + insets.left + insets.right;
    return dimension;
  }

  public Dimension getMinimumSize() {
    Dimension dimension = super.getPreferredSize();
    Insets insets = getInsets();
    dimension.width = getFontMetrics(getFont()).stringWidth(getText()) + insets.left + insets.right;
    return dimension;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/N.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
