package aP;

import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cF;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import r.IOPropertiesUsingFile;
import s.SComponentGolf;

public class JPanelExtensionIopropertiesusingfile extends JPanel {
  JCheckBox IOPropertiesUsingFile =
      new JCheckBox(SComponentGolf.b("Always launch new MegaLogViewer"));

  String b = SComponentGolf.b("MegaLogViewer Preferences");

  public JPanelExtensionIopropertiesusingfile() {
    setBorder(BorderFactory.createTitledBorder(this.b));
    setLayout(new GridLayout(0, 1));
    boolean bool =
        IOPropertiesUsingFile.IOPropertiesUsingFile()
            .c(IOPropertiesUsingFile.bT, IOPropertiesUsingFile.bU);
    this.IOPropertiesUsingFile.setSelected(bool);
    this.IOPropertiesUsingFile.addActionListener(new hA(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("Center", this.IOPropertiesUsingFile);
    String str =
        "If checked, IOPropertiesUsingFile new instnace of MegaLogViewer will be launched for each"
            + " use. Otherwise the log will be sent to the already running MegaLogViewer";
    cF cF = new cF(str, SComponentGolf.d());
    jPanel.add("East", (Component) cF);
    add(jPanel);
    jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(1));
    JButton jButton = new JButton(SComponentGolf.b("Reset and Clear MegaLogViewer Location"));
    jButton.addActionListener(new hB(this));
    jPanel.add(jButton);
    add(jPanel);
  }

  public static void IOPropertiesUsingFile(Component paramComponent) {
    hz hz1 = new hz();
    bV.IOPropertiesUsingFile(hz1, paramComponent, hz1.b, null);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
