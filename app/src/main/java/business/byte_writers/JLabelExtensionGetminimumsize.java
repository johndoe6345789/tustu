package business.byte_writers;

import bH.ac;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.Icon;
import javax.swing.JLabel;

class JLabelExtensionGetminimumsize extends JLabel {
  public JLabelExtensionGetminimumsize(b paramb, String paramString, int paramInt) {
    super(ac.a().a(paramString), (Icon) null, paramInt);
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

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bw/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
