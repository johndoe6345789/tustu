package k;

import L.S;
import ax.AbstractInAxPackage;
import ax.AxComponentAlpha;
import ax.AxInterfaceAb;
import java.util.List;

public class KComponentEcho extends AbstractInAxPackage {
  public AbstractInAxPackage a(String paramString, List paramList) {
    AbstractInAxPackage AbstractInAxPackage = null;
    if (paramString.equalsIgnoreCase("smoothInt")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("table")) {
      AbstractInAxPackage = c(paramString, paramList);
    }
    return AbstractInAxPackage;
  }

  private AbstractInAxPackage b(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() != 1) throw new AxComponentAlpha(paramString, paramList.size(), 0);
    return new f(paramList.get(0));
  }

  private AbstractInAxPackage c(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() != 2) throw new AxComponentAlpha(paramString, paramList.size(), 2);
    return (AbstractInAxPackage) new S(paramList.get(0), paramList.get(1));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/k/AbstractInAxPackage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
