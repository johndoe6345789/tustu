package k;

import L.S;
import ax.A;
import ax.ab;
import ax.ac;
import ax.e;
import java.util.List;

public class e extends e {
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
      throw new A(paramString, paramList.size(), 0); 
    return new f(paramList.get(0));
  }
  
  private ac c(String paramString, List<ab> paramList) {
    if (paramList.size() != 2)
      throw new A(paramString, paramList.size(), 2); 
    return (ac)new S(paramList.get(0), paramList.get(1));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/k/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */