package q;

import bH.D;
import bt.bb;
import java.awt.Color;
import java.awt.Component;

public class QInterfaceDelta implements i {
  public void a(Component paramComponent) {
    bb bb = (bb)paramComponent;
    bb.setText("");
    bb.setEnabled(true);
    bb.setForeground(Color.BLACK);
    bb.setOpaque(false);
  }
  
  public void b(Component paramComponent) {
    bb bb = (bb)paramComponent;
    bb.setEnabled(true);
    if (bb.getText() != null && bb.getText().length() > 0)
      D.c("Check out: " + bb.getText()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/q/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */