package L;

import ax.AxComponentAlpha;
import ax.AbstractInAxPackage;
import ax.AbstractInAxPackage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ab extends AbstractInAxPackage {
  private static ab a = null;
  
  private boolean b = false;
  
  private Map c = new HashMap<>();
  
  public static ab a() {
    if (a == null)
      a = new ab(); 
    return a;
  }
  
  public void a(r paramr) {
    this.c.put(paramr.a().toLowerCase(), paramr);
  }
  
  public AbstractInAxPackage a(String paramString, List paramList) {
    AbstractInAxPackage AbstractInAxPackage;
    f f = null;
    if (paramString.equalsIgnoreCase("isUltraFunctionsAvaliable") || paramString.equalsIgnoreCase("isUltraFunctionsAvailable")) {
      if (this.b) {
        f = new f(1.0D);
      } else {
        f = new f(0.0D);
      } 
    } else if (a(paramString) && !this.b) {
      g g = new g(paramString);
    } else if (paramString.equalsIgnoreCase("timeToExceed")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (this.c.containsKey(paramString.toLowerCase())) {
      r r = (r)this.c.get(paramString.toLowerCase());
      if (paramList.size() >= r.b() && paramList.size() <= r.c()) {
        AbstractInAxPackage = r.a(paramList);
      } else {
        throw new AxComponentAlpha(paramString, paramList.size(), r.b());
      } 
    } 
    return AbstractInAxPackage;
  }
  
  private boolean a(String paramString) {
    return paramString.equalsIgnoreCase("timeToExceed");
  }
  
  private AbstractInAxPackage b(String paramString, List paramList) {
    if (paramList.size() >= 2 && paramList.size() <= 4)
      return new Y(paramList); 
    throw new AxComponentAlpha(paramString, paramList.size(), 2);
  }
  
  public boolean b() {
    return this.b;
  }
  
  public void a(boolean paramBoolean) {
    this.b = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */