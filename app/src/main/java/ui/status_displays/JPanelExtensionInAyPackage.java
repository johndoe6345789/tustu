package aY;

import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import r.RInterfaceIndia;
import s.SComponentGolf;

public class JPanelExtensionInAyPackage extends JPanel {
  public JPanelExtensionInAyPackage(String paramString) {
    a(paramString, (ActionListener) null);
  }

  private void a(String paramString, ActionListener paramActionListener) {
    if (paramActionListener == null) paramActionListener = new k(this);
    setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Data Rate")));
    setLayout(new GridLayout(0, 1));
    add(new JLabel(SComponentGolf.b("Speed may be limited by device or cable.")));
    add(
        new JLabel(
            SComponentGolf.b("RInterfaceIndia.e. Bluetooth cable may slow actual data rate")
                + "."));
    add(new JLabel(" "));
    ButtonGroup buttonGroup = new ButtonGroup();
    String str = SComponentGolf.b("Reads Per Second");
    JRadioButton jRadioButton = new JRadioButton("0 " + str);
    jRadioButton.setActionCommand("0");
    jRadioButton.setSelected(paramString.equals("0"));
    jRadioButton.addActionListener(paramActionListener);
    add(jRadioButton);
    buttonGroup.add(jRadioButton);
    jRadioButton = new JRadioButton("1 " + str);
    jRadioButton.setActionCommand("1");
    jRadioButton.setSelected(paramString.equals("1"));
    jRadioButton.addActionListener(paramActionListener);
    add(jRadioButton);
    buttonGroup.add(jRadioButton);
    jRadioButton = new JRadioButton("5 " + str);
    jRadioButton.setActionCommand("5");
    jRadioButton.setSelected(paramString.equals("5"));
    jRadioButton.addActionListener(paramActionListener);
    add(jRadioButton);
    buttonGroup.add(jRadioButton);
    jRadioButton = new JRadioButton("10 " + str);
    jRadioButton.setActionCommand("10");
    jRadioButton.setSelected(paramString.equals("10"));
    jRadioButton.addActionListener(paramActionListener);
    add(jRadioButton);
    buttonGroup.add(jRadioButton);
    jRadioButton = new JRadioButton("15 " + str);
    jRadioButton.setActionCommand("15");
    jRadioButton.setSelected(paramString.equals("15"));
    jRadioButton.addActionListener(paramActionListener);
    add(jRadioButton);
    buttonGroup.add(jRadioButton);
    boolean bool = RInterfaceIndia.a().a(" 98 98  0gep9gds09kfg09");
    jRadioButton = new JRadioButton("20 " + str);
    jRadioButton.setActionCommand("20");
    jRadioButton.setSelected(paramString.equals("20"));
    jRadioButton.addActionListener(paramActionListener);
    jRadioButton.setEnabled(bool);
    add(jRadioButton);
    buttonGroup.add(jRadioButton);
    jRadioButton = new JRadioButton("25 " + str);
    jRadioButton.setActionCommand("25");
    jRadioButton.setSelected(paramString.equals("25"));
    jRadioButton.addActionListener(paramActionListener);
    jRadioButton.setEnabled(bool);
    add(jRadioButton);
    buttonGroup.add(jRadioButton);
    jRadioButton = new JRadioButton("50 " + str);
    jRadioButton.setActionCommand("50");
    jRadioButton.setSelected(paramString.equals("50"));
    jRadioButton.addActionListener(paramActionListener);
    jRadioButton.setEnabled(bool);
    add(jRadioButton);
    buttonGroup.add(jRadioButton);
    jRadioButton = new JRadioButton("100 " + str);
    jRadioButton.setActionCommand("100");
    jRadioButton.setSelected(paramString.equals("100"));
    jRadioButton.addActionListener(paramActionListener);
    jRadioButton.setEnabled(bool);
    add(jRadioButton);
    buttonGroup.add(jRadioButton);
    jRadioButton = new JRadioButton("250 " + str);
    jRadioButton.setActionCommand("250");
    jRadioButton.setSelected(paramString.equals("250"));
    jRadioButton.addActionListener(paramActionListener);
    jRadioButton.setEnabled(bool);
    add(jRadioButton);
    buttonGroup.add(jRadioButton);
    jRadioButton = new JRadioButton("500 " + str);
    jRadioButton.setActionCommand("500");
    jRadioButton.setSelected(paramString.equals("500"));
    jRadioButton.addActionListener(paramActionListener);
    jRadioButton.setEnabled(bool);
    add(jRadioButton);
    buttonGroup.add(jRadioButton);
    jRadioButton = new JRadioButton("Max " + str);
    jRadioButton.setActionCommand("1000");
    jRadioButton.setSelected(paramString.equals("1000"));
    jRadioButton.addActionListener(paramActionListener);
    jRadioButton.setEnabled(bool);
    add(jRadioButton);
    buttonGroup.add(jRadioButton);
  }

  public void a(Component paramComponent) {
    bV.a(this, paramComponent, SComponentGolf.b("Set Data Rate"), null);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aY/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
