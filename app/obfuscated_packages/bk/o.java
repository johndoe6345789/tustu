package bk;

import G.R;
import G.cq;
import G.cu;
import aI.d;
import aI.p;
import com.efiAnalytics.ui.bc;
import javax.swing.JToggleButton;
import s.g;

public class o extends JToggleButton implements cq, bc {
  R a = null;
  
  p b = null;
  
  long c = 0L;
  
  int d = 150;
  
  public o(R paramR) {
    this.a = paramR;
    this.b = new p(paramR);
    setText(g.b("Start SD Log"));
    cu.a().a(paramR.c(), d.a, this);
    addActionListener(new p(this));
  }
  
  private void b() {
    this.b.b();
  }
  
  private void c() {
    this.b.c();
  }
  
  public void close() {
    cu.a().a(this);
    this.b.a();
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (System.currentTimeMillis() - this.c > this.d) {
      boolean bool1 = (((int)paramDouble & d.d) == d.d) ? true : false;
      if (bool1 && !a()) {
        a(true);
      } else if (!bool1 && a()) {
        a(false);
      } 
    } 
    boolean bool = (((int)paramDouble & d.b) == d.b);
    if (bool != isEnabled())
      setEnabled(bool); 
  }
  
  public void a(boolean paramBoolean) {
    this.c = System.currentTimeMillis();
    if (paramBoolean) {
      setText(g.b("Stop SD Log"));
    } else {
      setText(g.b("Start SD Log"));
    } 
  }
  
  public boolean a() {
    return getText().equals("Stop SD Log");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bk/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */