package bt;

import com.efiAnalytics.ui.bc;
import java.util.ArrayList;
import javax.swing.JPanel;

public class d extends JPanel {
  ArrayList H = new ArrayList();
  
  public void a(bc parambc) {
    this.H.add(parambc);
  }
  
  protected void l() {
    for (bc bc : this.H)
      bc.close(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */