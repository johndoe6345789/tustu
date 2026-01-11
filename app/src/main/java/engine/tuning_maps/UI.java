package aP;

import G.T;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class UI extends JPanel {
  ButtonGroup a = new ButtonGroup();
  
  List b = new ArrayList();
  
  public UI() {
    String[] arrayOfString = T.a().d();
    String str = T.a().c().c();
    setLayout(new GridLayout(0, 1));
    aT aT = new aT(this);
    if (arrayOfString != null)
      for (byte b = 0; b < arrayOfString.length; b++) {
        JRadioButton jRadioButton = new JRadioButton(arrayOfString[b]);
        jRadioButton.setActionCommand(arrayOfString[b]);
        jRadioButton.addActionListener(aT);
        this.a.add(jRadioButton);
        add(jRadioButton);
        if (str != null && arrayOfString[b].equals(str)) {
          this.a.setSelected(jRadioButton.getModel(), true);
          b();
        } 
      }  
  }
  
  public void a(aU paramaU) {
    this.b.add(paramaU);
  }
  
  public String a() {
    return this.a.getSelection().getActionCommand();
  }
  
  private void b() {
    String str = a();
    for (aU aU : this.b)
      aU.a(str); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */