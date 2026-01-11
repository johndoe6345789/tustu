package bt;

import G.R;
import com.efiAnalytics.ui.bq;
import java.awt.event.ActionListener;
import javax.swing.JMenu;

public class O extends JMenu implements bq {
  P a = new P();
  
  public O(R paramR, int paramInt) {
    this.a.a(this, paramR, paramInt);
  }
  
  public void addActionListener(ActionListener paramActionListener) {
    this.a.a(paramActionListener);
  }
  
  public void removeActionListener(ActionListener paramActionListener) {
    this.a.b(paramActionListener);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/O.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */