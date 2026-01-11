package H;

import G.R;
import G.T;
import G.Y;
import G.aH;
import G.aI;
import G.aM;
import G.bb;
import G.r;
import java.io.Serializable;

public class e implements aI, Serializable {
  private String a;
  
  private String b;
  
  public e(R paramR) {
    this.a = paramR.c();
    this.b = paramR.c() + "_Replay";
  }
  
  public aH g(String paramString) {
    bb bb = ((R)a()).h(paramString);
    return (aH)((bb != null) ? bb : a().g(paramString));
  }
  
  protected aI a() {
    return (aI)T.a().c(this.a);
  }
  
  public aM c(String paramString) {
    return a().c(paramString);
  }
  
  public r d(String paramString) {
    return a().d(paramString);
  }
  
  public Y h() {
    return a().h();
  }
  
  public String c() {
    return a().c();
  }
  
  public R K() {
    return a().K();
  }
  
  public boolean R() {
    return a().R();
  }
  
  public String ac() {
    return this.b;
  }
  
  public void a(String paramString) {
    this.b = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/H/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */