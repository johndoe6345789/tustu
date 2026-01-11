package L;

import G.R;
import G.T;
import G.GInterfaceAi;
import I.ThreadedInIPackage;
import ax.AxComponentAlpha;
import ax.AxInterfaceAb;
import ax.AbstractInAxPackage;
import ax.AbstractInAxPackage;
import java.util.List;

public class TunerStudioFunctionFactory extends AbstractInAxPackage {
  private GInterfaceAi b;
  
  private static boolean c = true;
  
  AxInterfaceAb a;
  
  public h(GInterfaceAi paramaI) {
    this.b = paramaI;
    this.a = (n.a()).a;
  }
  
  public AbstractInAxPackage a(String paramString, List paramList) {
    AbstractInAxPackage AbstractInAxPackage = null;
    if (paramString.equalsIgnoreCase("timeNow"))
      AbstractInAxPackage = b(paramString, paramList); 
    if (paramString.equalsIgnoreCase("systemTime")) {
      AbstractInAxPackage = c(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("table")) {
      AbstractInAxPackage = d(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("getWorkingLocalCanId")) {
      AbstractInAxPackage = AbstractInAxPackage(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("getChannelValueByOffset")) {
      AbstractInAxPackage = h(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("getChannelScaleByOffset")) {
      AbstractInAxPackage = i(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("getChannelTranslateByOffset")) {
      AbstractInAxPackage = j(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("getChannelDigitsByOffset")) {
      AbstractInAxPackage = ThreadedInIPackage(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("getChannelMinByOffset")) {
      AbstractInAxPackage = l(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("getChannelMaxByOffset")) {
      AbstractInAxPackage = m(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("counter")) {
      AbstractInAxPackage = q(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("arrayValue")) {
      AbstractInAxPackage = n(paramString, paramList);
    } else if (c && paramString.equalsIgnoreCase("tableLookup")) {
      AbstractInAxPackage = o(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("tableLookup")) {
      AbstractInAxPackage = new g(paramString);
    } else if (paramString.equalsIgnoreCase("getLogTime")) {
      AbstractInAxPackage = p(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("isOnline")) {
      AbstractInAxPackage = f(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("updateValueWhen")) {
      AbstractInAxPackage = g(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("isAdvancedMathAvaliable") || paramString.equalsIgnoreCase("isAdvancedMathAvailable")) {
      if (c) {
        AbstractInAxPackage = new f(1.0D);
      } else {
        AbstractInAxPackage = new f(0.0D);
      } 
    } else if (paramString.equalsIgnoreCase("persistentAccumulate")) {
      if (c) {
        AbstractInAxPackage = r(paramString, paramList);
      } else {
        AbstractInAxPackage = new g(paramString);
      } 
    } 
    return AbstractInAxPackage;
  }
  
  public static void a(boolean paramBoolean) {
    c = paramBoolean;
  }
  
  private AbstractInAxPackage b(String paramString, List paramList) {
    if (paramList.size() != 0)
      throw new AxComponentAlpha(paramString, paramList.size(), 0); 
    return new X();
  }
  
  private AbstractInAxPackage c(String paramString, List paramList) {
    if (paramList.size() != 0)
      throw new AxComponentAlpha(paramString, paramList.size(), 0); 
    return new R();
  }
  
  private AbstractInAxPackage d(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() != 2)
      throw new AxComponentAlpha(paramString, paramList.size(), 2); 
    return new S(paramList.get(0), paramList.get(1));
  }
  
  private AbstractInAxPackage AbstractInAxPackage(String paramString, List paramList) {
    if (!paramList.isEmpty())
      throw new AxComponentAlpha(paramString, paramList.size(), 0); 
    return new ad();
  }
  
  private AbstractInAxPackage f(String paramString, List paramList) {
    if (paramList.isEmpty())
      return new D(this.b); 
    throw new AxComponentAlpha(paramString, paramList.size(), 0);
  }
  
  private AbstractInAxPackage g(String paramString, List paramList) {
    if (paramList.size() >= 2 && paramList.size() <= 3)
      return new AbstractInAxPackage(paramList); 
    throw new AxComponentAlpha(paramString, paramList.size(), 2);
  }
  
  private AbstractInAxPackage h(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() == 1)
      return new s(this.b, paramList.get(0)); 
    if (paramList.size() == 2)
      return new s(paramList.get(0), paramList.get(1)); 
    throw new AxComponentAlpha(paramString, paramList.size(), 1);
  }
  
  private AbstractInAxPackage i(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() == 1)
      return new w(this.b, paramList.get(0)); 
    if (paramList.size() == 2)
      return new w(paramList.get(0), paramList.get(1)); 
    throw new AxComponentAlpha(paramString, paramList.size(), 1);
  }
  
  private AbstractInAxPackage j(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() == 1)
      return new x(this.b, paramList.get(0)); 
    if (paramList.size() == 2)
      return new x(paramList.get(0), paramList.get(1)); 
    throw new AxComponentAlpha(paramString, paramList.size(), 1);
  }
  
  private AbstractInAxPackage ThreadedInIPackage(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() == 1)
      return new t(this.b, paramList.get(0)); 
    if (paramList.size() == 2)
      return new t(paramList.get(0), paramList.get(1)); 
    throw new AxComponentAlpha(paramString, paramList.size(), 1);
  }
  
  private AbstractInAxPackage l(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() == 1)
      return new v(this.b, paramList.get(0)); 
    if (paramList.size() == 2)
      return new v(paramList.get(0), paramList.get(1)); 
    throw new AxComponentAlpha(paramString, paramList.size(), 1);
  }
  
  private AbstractInAxPackage m(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() == 1)
      return new u(this.b, paramList.get(0)); 
    if (paramList.size() == 2)
      return new u(paramList.get(0), paramList.get(1)); 
    throw new AxComponentAlpha(paramString, paramList.size(), 1);
  }
  
  private AbstractInAxPackage n(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() == 2)
      return new d(this.b, paramList.get(0), paramList.get(1)); 
    throw new AxComponentAlpha(paramString, paramList.size(), 2);
  }
  
  private AbstractInAxPackage o(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() == 5)
      return new T(this.b, paramList.get(0), paramList.get(1), paramList.get(2), paramList.get(3), paramList.get(4)); 
    if (paramList.size() == 3)
      return new U(this.b, paramList.get(0), paramList.get(1), paramList.get(2)); 
    throw new AxComponentAlpha("Proper usage: tableLookup(array.zArray, array.xArray, array.yArray, xChannel, yChannel), or for 1D tables: tableLookup(array.ValueArrayName, array.LookupArrayName, LookupChannelName)" + paramString, paramList.size(), 5);
  }
  
  private AbstractInAxPackage p(String paramString, List paramList) {
    if (!paramList.isEmpty())
      throw new AxComponentAlpha(paramString, paramList.size(), 0); 
    return new y();
  }
  
  private AbstractInAxPackage q(String paramString, List paramList) {
    if (!paramList.isEmpty())
      throw new AxComponentAlpha(paramString, paramList.size(), 0); 
    return new L(this.a);
  }
  
  private AbstractInAxPackage r(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() != 1)
      throw new AxComponentAlpha(paramString, paramList.size(), 1); 
    String str = ((AxInterfaceAb)paramList.get(0)).toString();
    R r = T.a().c();
    if (r != null && this.b.c().equals(r.c())) {
      String str1 = r.c();
    } else {
      String str1 = "";
    } 
    i i = new i(this);
    j j = new j(this, i, str);
    b b = new b(paramList.get(0), this.a, j);
    ThreadedInIPackage.a().a(this.b.c(), str, b);
    return b;
  }
  
  public void a(GInterfaceAi paramaI) {
    this.b = paramaI;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */