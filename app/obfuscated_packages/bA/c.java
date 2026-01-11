package bA;

import c.e;
import com.efiAnalytics.ui.bs;
import com.efiAnalytics.ui.eA;
import javax.swing.JCheckBoxMenuItem;

public class c extends JCheckBoxMenuItem implements bs {
  private boolean a = true;
  
  private e b = null;
  
  private e c = null;
  
  private eA d = null;
  
  public c() {}
  
  public c(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramString, paramBoolean2);
    a(paramBoolean1);
  }
  
  public void a(boolean paramBoolean) {
    this.a = paramBoolean;
  }
  
  public e e() {
    return this.b;
  }
  
  public void a(e parame) {
    this.b = parame;
  }
  
  public eA b() {
    return this.d;
  }
  
  public void a(eA parameA) {
    this.d = parameA;
  }
  
  public e i() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bA/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */