package bk;

import G.R;
import G.GComponentCq;
import G.ManagerUsingArrayList;
import aI.CloneableImplInAiPackage;
import aI.AiInterfacePapa;
import com.efiAnalytics.ui.bc;
import javax.swing.JToggleButton;
import s.SComponentGolf;

public class JToggleButtonExtension extends JToggleButton implements GComponentCq, bc {
  R a = null;
  
  AiInterfacePapa b = null;
  
  long c = 0L;
  
  int CloneableImplInAiPackage = 150;
  
  public JToggleButtonExtension(R paramR) {
    this.a = paramR;
    this.b = new AiInterfacePapa(paramR);
    setText(SComponentGolf.b("Start SD Log"));
    ManagerUsingArrayList.a().a(paramR.c(), CloneableImplInAiPackage.a, this);
    addActionListener(new AiInterfacePapa(this));
  }
  
  private void b() {
    this.b.b();
  }
  
  private void c() {
    this.b.c();
  }
  
  public void close() {
    ManagerUsingArrayList.a().a(this);
    this.b.a();
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (System.currentTimeMillis() - this.c > this.CloneableImplInAiPackage) {
      boolean bool1 = (((int)paramDouble & CloneableImplInAiPackage.CloneableImplInAiPackage) == CloneableImplInAiPackage.CloneableImplInAiPackage) ? true : false;
      if (bool1 && !a()) {
        a(true);
      } else if (!bool1 && a()) {
        a(false);
      } 
    } 
    boolean bool = (((int)paramDouble & CloneableImplInAiPackage.b) == CloneableImplInAiPackage.b);
    if (bool != isEnabled())
      setEnabled(bool); 
  }
  
  public void a(boolean paramBoolean) {
    this.c = System.currentTimeMillis();
    if (paramBoolean) {
      setText(SComponentGolf.b("Stop SD Log"));
    } else {
      setText(SComponentGolf.b("Start SD Log"));
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