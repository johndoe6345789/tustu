package k;

import L.S;
import ax.AxComponentAlpha;
import ax.ab;
import ax.ac;
import ax.AbstractInAxPackage;
import java.util.List;

public class KComponentEcho extends AbstractInAxPackage {
  public ac a(String paramString, List paramList) {
    ac ac = null;
    if (paramString.equalsIgnoreCase("smoothInt")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("table")) {
      ac = c(paramString, paramList);
    } 
    return ac;
  }
  
  private ac b(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new AxComponentAlpha(paramString, paramList.size(), 0); 
    return new f(paramList.get(0));
  }
  
  private ac c(String paramString, List<ab> paramList) {
    if (paramList.size() != 2)
      throw new AxComponentAlpha(paramString, paramList.size(), 2); 
    return (ac)new S(paramList.get(0), paramList.get(1));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/k/AbstractInAxPackage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */