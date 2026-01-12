package business.action_zones;

import bH.ab;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JDialogExtensionInAzPackage extends JDialog {
  public JDialogExtensionInAzPackage(Window paramWindow, ab paramab) {
    super(paramWindow, paramab.a("Activating Registration"), Dialog.ModalityType.MODELESS);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    add("Center", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(1));
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("wait_animated.gif"));
    ImageIcon imageIcon = new ImageIcon(image);
    JLabel jLabel = new JLabel();
    jLabel.setIcon(imageIcon);
    jPanel2.add(jLabel);
    jPanel1.add("Center", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(0, 1, 4, 4));
    jPanel3.add(
        new JLabel(paramab.a("Verifying and activating registration on this computer."), 0));
    jPanel3.add(new JLabel(paramab.a("Please Wait") + "....", 0));
    jPanel3.add(new JLabel(" ", 0));
    jPanel1.add("South", jPanel3);
    jPanel1.add("North", new JLabel(" "));
    pack();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/az/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
