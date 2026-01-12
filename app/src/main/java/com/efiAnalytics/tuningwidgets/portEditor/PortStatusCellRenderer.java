package com.efiAnalytics.tuningwidgets.portEditor;

import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;

class PortStatusCellRenderer extends DefaultListCellRenderer {
  Icon a = null;

  Icon b = null;

  PortStatusCellRenderer(OutputPortEditor paramOutputPortEditor) {}

  public Component getListCellRendererComponent(
      JList<?> paramJList,
      Object paramObject,
      int paramInt,
      boolean paramBoolean1,
      boolean paramBoolean2) {
    Component component =
        super.getListCellRendererComponent(
            paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    if (component instanceof JLabel && paramObject instanceof o) {
      JLabel jLabel = (JLabel) component;
      o o = (o) paramObject;
      if (o.b()) {
        jLabel.setIcon(a());
      } else {
        jLabel.setIcon(b());
      }
    }
    return component;
  }

  Icon a() {
    if (this.a == null) {
      Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("greenBulb.png"));
      this.a = new ImageIcon(image);
    }
    return this.a;
  }

  Icon b() {
    if (this.b == null) {
      Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("redBulb.png"));
      this.b = new ImageIcon(image);
    }
    return this.b;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
