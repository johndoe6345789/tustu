package bi;

import G.R;
import G.dc;
import G.m;
import G.o;
import aP.NetworkHashMap;
import bH.D;
import bt.d;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class ThreadedInBiPackage extends d {
  int[] a = new int[] { 253, 250, 251, 165, 151 };
  
  int[] b = new int[] { 253, 250, 252, 90, 77 };
  
  int[] c = new int[] { 253, 250, 253, 195, 183 };
  
  int[] d = new int[] { 253, 250, 254, 60, 49 };
  
  R e;
  
  public ThreadedInBiPackage(R paramR) {
    this.e = paramR;
    setLayout(new FlowLayout(1));
    JButton jButton = new JButton("Bootstrap");
    jButton.addActionListener(new h(this));
    add(jButton);
  }
  
  private boolean a() {
    if (!this.e.R()) {
      bV.d("Not Connected to ECU!", (Component)this);
      return false;
    } 
    this.e.C().g(true);
    try {
      Thread.sleep(20L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    dc dc = new dc();
    m m = a(this.a);
    o o = dc.a(this.e, m, 60);
    if (o.a() == 3) {
      D.a("Bootstrap Failed on Write 1! :" + o.c());
      return false;
    } 
    m = a(this.b);
    o = dc.a(this.e, m, 60);
    if (o.a() == 3) {
      D.a("Bootstrap Failed on Write 2! :" + o.c());
      return false;
    } 
    m = a(this.c);
    o = dc.a(this.e, m, 60);
    if (o.a() == 3) {
      D.a("Bootstrap Failed on Write 3! :" + o.c());
      return false;
    } 
    m = a(this.d);
    m.b(0);
    m.a(true);
    o = dc.a(this.e, m, 60);
    if (o.a() == 3) {
      D.a("Bootstrap Failed on Write 4! :" + o.c());
      return false;
    } 
    D.d("Bootstrap Command Successfull. Exiting.");
    return NetworkHashMap.a().s();
  }
  
  private m a(int[] paramArrayOfint) {
    m m = m.a(this.e.O(), paramArrayOfint);
    m.b(3);
    m.a(true);
    m.i(7);
    m.a(30);
    m.v("Bootstrap command");
    return m;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bi/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */