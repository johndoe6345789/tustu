package business.buffer_factories.bF_components;

import javax.swing.Icon;
import javax.swing.JButton;

class JButtonExtension extends JButton {
  public JButtonExtension(d paramd, String paramString, Icon paramIcon) {
    super(paramString, paramIcon);
    super.setEnabled(false);
  }

  public void setEnabled(boolean paramBoolean) {
    if (this.a.d()) {
      super.setEnabled(paramBoolean);
    } else {
      super.setEnabled(false);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
