package aY;

import com.efiAnalytics.ui.eJ;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;

class DefaultListCellRendererExtension extends DefaultListCellRenderer {
  Icon a = null;

  DefaultListCellRendererExtension(s params) {}

  public Component getListCellRendererComponent(
      JList<?> paramJList,
      Object paramObject,
      int paramInt,
      boolean paramBoolean1,
      boolean paramBoolean2) {
    Component component =
        super.getListCellRendererComponent(
            paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    if (component instanceof JLabel && paramObject instanceof B) {
      JLabel jLabel = (JLabel) component;
      B b = (B) paramObject;
      jLabel.setIcon(getIcon());
    }
    return component;
  }

  public Icon getIcon() {
    if (this.a == null) {
      Image image =
          Toolkit.getDefaultToolkit()
              .getImage(getClass().getResource("restoreIcon32.jpg"))
              .getScaledInstance(eJ.a(18), eJ.a(18), 4);
      this.a = new ImageIcon(image);
    }
    return this.a;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aY/C.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
