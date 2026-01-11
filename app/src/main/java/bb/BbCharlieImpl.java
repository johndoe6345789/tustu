package bb;

import ae.FileUsingHashMap;
import ae.AeInterfaceQuebec;
import bc.FileUsingHashMap;
import com.efiAnalytics.ui.fT;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;

public BbCharlieImpllass BbCharlieImpl extends JPanel implements fT {
  private AeInterfaceQuebec e = null;
  
  boolean a = true;
  
  FileUsingHashMap b = new FileUsingHashMap();
  
  JTextPane c = new JTextPane();
  
  JProgressBar d = new JProgressBar(0, 100);
  
  public BbCharlieImpl(boolean paramBoolean) {
    this.a = paramBoolean;
    setLayout(new BorderLayout(1, 1));
    add((Component)this.b, "Center");
  }
  
  public boolean g_() {
    return false;
  }
  
  public void a(AeInterfaceQuebec paramq, FileUsingHashMap paramk) {
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