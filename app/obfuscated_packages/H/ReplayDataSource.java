package H;

import G.R;
import G.T;
import G.Y;
import G.SerializableImpl;
import G.GInterfaceAi;
import G.Manager;
import G.GComponentBb;
import G.r;
import java.io.Serializable;

public class ReplayDataSource implements GInterfaceAi, Serializable {
  private String a;
  
  private String b;
  
  public ReplayDataSource(R paramR) {
    this.a = paramR.c();
    this.b = paramR.c() + "_Replay";
  }
  
  public SerializableImpl g(String paramString) {
    GComponentBb GComponentBb = ((R)a()).h(paramString);
    return (SerializableImpl)((GComponentBb != null) ? GComponentBb : a().g(paramString));
  }
  
  protected GInterfaceAi a() {
    return (GInterfaceAi)T.a().c(this.a);
  }
  
  public Manager c(String paramString) {
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