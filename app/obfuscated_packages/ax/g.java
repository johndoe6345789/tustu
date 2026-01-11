package ax;

import java.util.List;

class g extends e {
  public ac a(String paramString, List paramList) {
    ac ac = null;
    if (paramString.equalsIgnoreCase("sin")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("cos")) {
      ac = c(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("tan")) {
      ac = d(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("asin")) {
      ac = e(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("acos")) {
      ac = f(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("atan")) {
      ac = g(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("abs")) {
      ac = h(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("pow")) {
      ac = i(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("ceil")) {
      ac = j(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("floor")) {
      ac = k(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("round")) {
      ac = l(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("recip")) {
      ac = m(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("log")) {
      ac = n(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("log10")) {
      ac = o(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("sqrt")) {
      ac = p(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("exp")) {
      ac = q(paramString, paramList);
    } 
    return ac;
  }
  
  private ac b(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new ah(paramList.get(0));
  }
  
  private ac c(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new o(paramList.get(0));
  }
  
  private ac d(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new ak(paramList.get(0));
  }
  
  private ac e(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new c(paramList.get(0));
  }
  
  private ac f(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new b(paramList.get(0));
  }
  
  private ac g(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new d(paramList.get(0));
  }
  
  private ac h(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new a(paramList.get(0));
  }
  
  private ac i(String paramString, List<ab> paramList) {
    if (paramList.size() != 2)
      throw new A(paramString, paramList.size(), 2); 
    return new ae(paramList.get(0), paramList.get(1));
  }
  
  private ac j(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new p(paramList.get(0));
  }
  
  private ac k(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new y(paramList.get(0));
  }
  
  private ac l(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new ag(paramList.get(0));
  }
  
  private ac m(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new af(paramList.get(0));
  }
  
  private ac n(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new M(paramList.get(0));
  }
  
  private ac o(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new N(paramList.get(0));
  }
  
  private ac p(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new ai(paramList.get(0));
  }
  
  private ac q(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new v(paramList.get(0));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ax/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */