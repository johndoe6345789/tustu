package bo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

class UISetenabled extends JPanel {
  JLabel a = null;
  
  JPanel b = new JPanel();
  
  k(b paramb, String paramString, JComponent paramJComponent) {
    setLayout(new BorderLayout(5, 5));
    this.a = new JLabel(paramString, 4);
    add("Center", this.a);
    this.b.setLayout(new GridLayout(1, 0, 4, 4));
    this.b.add(paramJComponent);
    add("East", this.b);
  }
  
  public void setEnabled(boolean paramBoolean) {
    for (byte b1 = 0; b1 < getComponentCount(); b1++)
      getComponent(b1).setEnabled(paramBoolean); 
  }
  
  public void a(JComponent paramJComponent) {
    this.b.add(paramJComponent);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bo/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */