package aV;

import com.efiAnalytics.ui.fp;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class c implements ActionListener {
  c(a parama) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    fp.a((Component)this.a.b, this.a.c.isSelected());
    x.a().a(this.a.c.isSelected());
    if (!x.a().h() && this.a.c.isSelected())
      a.a(this.a); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aV/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */