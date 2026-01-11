package aY;

import G.R;
import G.T;
import G.cu;
import aE.PropertiesExtension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AyInterfaceKilo implements ActionListener {
  k(j paramj) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    PropertiesExtension PropertiesExtension = PropertiesExtension.A();
    if (PropertiesExtension != null) {
      PropertiesExtension.q(paramActionEvent.getActionCommand());
      R r = T.PropertiesExtension().c();
      if (r != null) {
        r.c(Integer.parseInt(paramActionEvent.getActionCommand()));
        cu.PropertiesExtension().PropertiesExtension(r);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aY/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */