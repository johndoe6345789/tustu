package bs;

import V.g;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class n implements ActionListener {
  n(k paramk) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.a.a.f(paramActionEvent.getActionCommand());
    try {
      this.a.b.c();
    } catch (g g) {
      bV.d(g.getMessage(), this.a.k);
    } 
    this.a.n.a("targetLambdaTableName", this.a.a.f());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */