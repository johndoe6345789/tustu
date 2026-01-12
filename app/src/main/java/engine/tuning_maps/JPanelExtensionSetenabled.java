package aP;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class JPanelExtensionSetenabled extends JPanel {
  JTextField a = new JTextField("", 6);

  JLabel b = null;

  JPanelExtensionSetenabled(aM paramaM, String paramString) {
    setLayout(new BorderLayout(2, 2));
    this.b = new JLabel(paramString, 4);
    add("Center", this.b);
    add("East", this.a);
    this.a.addFocusListener(new aQ(paramaM));
    this.a.addKeyListener(new aP(this, paramaM));
  }

  public String a() {
    return this.a.getText();
  }

  public void a(String paramString) {
    this.a.setText(paramString);
  }

  public void setEnabled(boolean paramBoolean) {
    this.b.setEnabled(paramBoolean);
    this.a.setEnabled(paramBoolean);
    super.setEnabled(paramBoolean);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
