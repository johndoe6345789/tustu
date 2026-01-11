package bt;

import G.R;
import G.aH;
import G.aM;
import G.ac;
import G.ah;
import G.bk;
import G.bq;
import G.bz;
import V.g;
import V.j;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import s.g;

public class SettingCalibrationField extends aV implements bc {
  JButton a;
  
  bk b;
  
  D c;
  
  ah d = new ah();
  
  R e;
  
  public I(R paramR, bk parambk) {
    super(paramR, (bq)parambk);
    this.b = parambk;
    this.e = paramR;
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    this.a = new JButton(g.b("Set to Current"));
    this.a.addActionListener(new J(this));
    jPanel.add("West", this.a);
    bz bz = new bz();
    ah ah1 = a(paramR, parambk.a());
    this.d.f(ah1.l());
    this.d.a(ah1.i());
    this.d.c("");
    this.d.b("");
    bz.a(this.d);
    this.c = new D(paramR, bz);
    this.c.a(this.d);
    jPanel.add("East", this.c);
    a(jPanel);
  }
  
  private void o() {
    aH aH = this.e.g(this.d.i());
    if (aH != null) {
      double d = aH.o();
      aM aM = this.e.c(this.b.b());
      try {
        aM.a(this.e.h(), d);
      } catch (g g) {
        Logger.getLogger(I.class.getName()).log(Level.SEVERE, "SettingCalibrationField failed to set value.", (Throwable)g);
      } catch (j j) {
        Logger.getLogger(I.class.getName()).log(Level.SEVERE, "SettingCalibrationField failed to set value. 2", (Throwable)j);
      } 
    } 
  }
  
  public void close() {
    super.close();
    this.c.close();
  }
  
  private ah a(R paramR, String paramString) {
    null = paramR.B();
    while (null.hasNext()) {
      ah ah2 = null.next();
      if (ah2.i().equals(paramString))
        return ah2; 
    } 
    for (ac ac : paramR.g()) {
      if (ac.a() != null && ac.a().equals(paramString)) {
        ah ah2 = new ah();
        ah2.a(paramString);
        ah2.f(ac.d());
        return ah2;
      } 
    } 
    ah ah1 = new ah();
    ah1.a(paramString);
    aH aH = paramR.g(paramString);
    if (aH != null)
      ah1.f(aH.d()); 
    return ah1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */