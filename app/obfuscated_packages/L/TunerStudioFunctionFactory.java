package L;

import G.R;
import G.T;
import G.aI;
import I.k;
import ax.A;
import ax.ab;
import ax.ac;
import ax.e;
import java.util.List;

public class TunerStudioFunctionFactory extends e {
  private aI b;
  
  private static boolean c = true;
  
  ab a;
  
  public h(aI paramaI) {
    this.b = paramaI;
    this.a = (n.a()).a;
  }
  
  public ac a(String paramString, List paramList) {
    ac ac = null;
    if (paramString.equalsIgnoreCase("timeNow"))
      ac = b(paramString, paramList); 
    if (paramString.equalsIgnoreCase("systemTime")) {
      ac = c(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("table")) {
      ac = d(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("getWorkingLocalCanId")) {
      ac = e(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("getChannelValueByOffset")) {
      ac = h(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("getChannelScaleByOffset")) {
      ac = i(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("getChannelTranslateByOffset")) {
      ac = j(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("getChannelDigitsByOffset")) {
      ac = k(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("getChannelMinByOffset")) {
      ac = l(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("getChannelMaxByOffset")) {
      ac = m(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("counter")) {
      ac = q(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("arrayValue")) {
      ac = n(paramString, paramList);
    } else if (c && paramString.equalsIgnoreCase("tableLookup")) {
      ac = o(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("tableLookup")) {
      ac = new g(paramString);
    } else if (paramString.equalsIgnoreCase("getLogTime")) {
      ac = p(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("isOnline")) {
      ac = f(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("updateValueWhen")) {
      ac = g(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("isAdvancedMathAvaliable") || paramString.equalsIgnoreCase("isAdvancedMathAvailable")) {
      if (c) {
        ac = new f(1.0D);
      } else {
        ac = new f(0.0D);
      } 
    } else if (paramString.equalsIgnoreCase("persistentAccumulate")) {
      if (c) {
        ac = r(paramString, paramList);
      } else {
        ac = new g(paramString);
      } 
    } 
    return ac;
  }
  
  public static void a(boolean paramBoolean) {
    c = paramBoolean;
  }
  
  private ac b(String paramString, List paramList) {
    if (paramList.size() != 0)
      throw new A(paramString, paramList.size(), 0); 
    return new X();
  }
  
  private ac c(String paramString, List paramList) {
    if (paramList.size() != 0)
      throw new A(paramString, paramList.size(), 0); 
    return new R();
  }
  
  private ac d(String paramString, List<ab> paramList) {
    if (paramList.size() != 2)
      throw new A(paramString, paramList.size(), 2); 
    return new S(paramList.get(0), paramList.get(1));
  }
  
  private ac e(String paramString, List paramList) {
    if (!paramList.isEmpty())
      throw new A(paramString, paramList.size(), 0); 
    return new ad();
  }
  
  private ac f(String paramString, List paramList) {
    if (paramList.isEmpty())
      return new D(this.b); 
    throw new A(paramString, paramList.size(), 0);
  }
  
  private ac g(String paramString, List paramList) {
    if (paramList.size() >= 2 && paramList.size() <= 3)
      return new ac(paramList); 
    throw new A(paramString, paramList.size(), 2);
  }
  
  private ac h(String paramString, List<ab> paramList) {
    if (paramList.size() == 1)
      return new s(this.b, paramList.get(0)); 
    if (paramList.size() == 2)
      return new s(paramList.get(0), paramList.get(1)); 
    throw new A(paramString, paramList.size(), 1);
  }
  
  private ac i(String paramString, List<ab> paramList) {
    if (paramList.size() == 1)
      return new w(this.b, paramList.get(0)); 
    if (paramList.size() == 2)
      return new w(paramList.get(0), paramList.get(1)); 
    throw new A(paramString, paramList.size(), 1);
  }
  
  private ac j(String paramString, List<ab> paramList) {
    if (paramList.size() == 1)
      return new x(this.b, paramList.get(0)); 
    if (paramList.size() == 2)
      return new x(paramList.get(0), paramList.get(1)); 
    throw new A(paramString, paramList.size(), 1);
  }
  
  private ac k(String paramString, List<ab> paramList) {
    if (paramList.size() == 1)
      return new t(this.b, paramList.get(0)); 
    if (paramList.size() == 2)
      return new t(paramList.get(0), paramList.get(1)); 
    throw new A(paramString, paramList.size(), 1);
  }
  
  private ac l(String paramString, List<ab> paramList) {
    if (paramList.size() == 1)
      return new v(this.b, paramList.get(0)); 
    if (paramList.size() == 2)
      return new v(paramList.get(0), paramList.get(1)); 
    throw new A(paramString, paramList.size(), 1);
  }
  
  private ac m(String paramString, List<ab> paramList) {
    if (paramList.size() == 1)
      return new u(this.b, paramList.get(0)); 
    if (paramList.size() == 2)
      return new u(paramList.get(0), paramList.get(1)); 
    throw new A(paramString, paramList.size(), 1);
  }
  
  private ac n(String paramString, List<ab> paramList) {
    if (paramList.size() == 2)
      return new d(this.b, paramList.get(0), paramList.get(1)); 
    throw new A(paramString, paramList.size(), 2);
  }
  
  private ac o(String paramString, List<ab> paramList) {
    if (paramList.size() == 5)
      return new T(this.b, paramList.get(0), paramList.get(1), paramList.get(2), paramList.get(3), paramList.get(4)); 
    if (paramList.size() == 3)
      return new U(this.b, paramList.get(0), paramList.get(1), paramList.get(2)); 
    throw new A("Proper usage: tableLookup(array.zArray, array.xArray, array.yArray, xChannel, yChannel), or for 1D tables: tableLookup(array.ValueArrayName, array.LookupArrayName, LookupChannelName)" + paramString, paramList.size(), 5);
  }
  
  private ac p(String paramString, List paramList) {
    if (!paramList.isEmpty())
      throw new A(paramString, paramList.size(), 0); 
    return new y();
  }
  
  private ac q(String paramString, List paramList) {
    if (!paramList.isEmpty())
      throw new A(paramString, paramList.size(), 0); 
    return new L(this.a);
  }
  
  private ac r(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    String str = ((ab)paramList.get(0)).toString();
    R r = T.a().c();
    if (r != null && this.b.c().equals(r.c())) {
      String str1 = r.c();
    } else {
      String str1 = "";
    } 
    i i = new i(this);
    j j = new j(this, i, str);
    b b = new b(paramList.get(0), this.a, j);
    k.a().a(this.b.c(), str, b);
    return b;
  }
  
  public void a(aI paramaI) {
    this.b = paramaI;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */