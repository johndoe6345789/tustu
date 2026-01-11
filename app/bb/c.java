package bb;

import ae.k;
import ae.q;
import bc.k;
import com.efiAnalytics.ui.fT;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;

public class c extends JPanel implements fT {
  private q e = null;
  
  boolean a = true;
  
  k b = new k();
  
  JTextPane c = new JTextPane();
  
  JProgressBar d = new JProgressBar(0, 100);
  
  public c(boolean paramBoolean) {
    this.a = paramBoolean;
    setLayout(new BorderLayout(1, 1));
    add((Component)this.b, "Center");
  }
  
  public boolean g_() {
    return false;
  }
  
  public void a(q paramq, k paramk) {
    this.e = paramq;
    this.b.a(paramq, paramk, this.a);
  }
  
  public boolean a() {
    return this.b.a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */