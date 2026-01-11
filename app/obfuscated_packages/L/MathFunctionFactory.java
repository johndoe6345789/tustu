package L;

import ax.AxComponentAlpha;
import ax.AxInterfaceAb;
import ax.AbstractInAxPackage;
import ax.AbstractInAxPackage;
import java.util.List;

public class MathFunctionFactory extends AbstractInAxPackage {
  private static n AbstractInAxPackage = null;
  
  AxInterfaceAb a = new o(this);
  
  private int f = 0;
  
  AxInterfaceAb b = new p(this);
  
  long c = -1L;
  
  AxInterfaceAb d = new q(this);
  
  private int g = 0;
  
  public static n a() {
    if (AbstractInAxPackage == null)
      AbstractInAxPackage = new n(); 
    return AbstractInAxPackage;
  }
  
  public AbstractInAxPackage a(String paramString, List paramList) {
    AbstractInAxPackage AbstractInAxPackage = null;
    if (paramString.equalsIgnoreCase("smoothBasic")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("lastValue")) {
      AbstractInAxPackage = d(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("pastValue")) {
      AbstractInAxPackage = h(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("historicalValue")) {
      AbstractInAxPackage = i(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("accumulate")) {
      AbstractInAxPackage = j(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("isNaN")) {
      AbstractInAxPackage = q(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("aerodynamicDragHp")) {
      AbstractInAxPackage = r(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("accelHp")) {
      AbstractInAxPackage = s(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("rollingDragHp")) {
      AbstractInAxPackage = t(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("smoothFiltered")) {
      AbstractInAxPackage = u(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("maxValue")) {
      AbstractInAxPackage = v(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("minValue")) {
      AbstractInAxPackage = w(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("min")) {
      AbstractInAxPackage = g(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("max")) {
      AbstractInAxPackage = AbstractInAxPackage(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("avg")) {
      AbstractInAxPackage = f(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("highSpeedRecordNumber")) {
      AbstractInAxPackage = k(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("selectExpression")) {
      AbstractInAxPackage = l(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("if")) {
      AbstractInAxPackage = m(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("sum")) {
      AbstractInAxPackage = n(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("isTrueFor")) {
      AbstractInAxPackage = o(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("timeTrue")) {
      AbstractInAxPackage = p(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("toggle")) {
      AbstractInAxPackage = c(paramString, paramList);
    } 
    return AbstractInAxPackage;
  }
  
  private AbstractInAxPackage b(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() != 2)
      throw new AxComponentAlpha(paramString, paramList.size(), 1); 
    return new P(paramList.get(0), paramList.get(1));
  }
  
  private AbstractInAxPackage c(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() != 1 && paramList.size() != 2)
      throw new AxComponentAlpha(paramString, paramList.size(), 1); 
    return (paramList.size() == 2) ? new aa(paramList.get(0), paramList.get(1)) : new aa(paramList.get(0));
  }
  
  private AbstractInAxPackage d(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() != 1)
      throw new AxComponentAlpha(paramString, paramList.size(), 1); 
    return new F(paramList.get(0), this.a);
  }
  
  private AbstractInAxPackage AbstractInAxPackage(String paramString, List paramList) {
    if (paramList.size() < 1)
      throw new AxComponentAlpha(paramString, paramList.size(), 1); 
    return new G(paramList);
  }
  
  private AbstractInAxPackage f(String paramString, List paramList) {
    if (paramList.size() < 1)
      throw new AxComponentAlpha(paramString, paramList.size(), 1); 
    return new AbstractInAxPackage(paramList);
  }
  
  private AbstractInAxPackage g(String paramString, List paramList) {
    if (paramList.size() < 1)
      throw new AxComponentAlpha(paramString, paramList.size(), 1); 
    return new I(paramList);
  }
  
  private AbstractInAxPackage h(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() != 2)
      throw new AxComponentAlpha(paramString, paramList.size(), 2); 
    return new K(paramList.get(0), paramList.get(1));
  }
  
  private AbstractInAxPackage i(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() != 2)
      throw new AxComponentAlpha(paramString, paramList.size(), 2); 
    return new F(paramList.get(0), this.a, paramList.get(1));
  }
  
  private AbstractInAxPackage j(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() != 1)
      throw new AxComponentAlpha(paramString, paramList.size(), 1); 
    return new b(paramList.get(0), this.a);
  }
  
  private AbstractInAxPackage k(String paramString, List paramList) {
    if (paramList.size() != 0)
      throw new AxComponentAlpha(paramString, paramList.size(), 1); 
    return new AxComponentAlpha(this.d);
  }
  
  public void a(int paramInt) {
    this.f = paramInt;
  }
  
  public void b(int paramInt) {
    this.g = paramInt;
  }
  
  public void a(long paramLong) {
    this.c = paramLong;
  }
  
  private AbstractInAxPackage l(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() >= 2) {
      AxInterfaceAb ab1 = paramList.remove(0);
      return new N(ab1, paramList);
    } 
    throw new AxComponentAlpha(paramString, paramList.size(), 2);
  }
  
  private AbstractInAxPackage m(String paramString, List paramList) {
    if (paramList.size() == 3)
      return new B(paramList); 
    throw new AxComponentAlpha(paramString, paramList.size(), 3);
  }
  
  private AbstractInAxPackage n(String paramString, List paramList) {
    if (paramList.size() >= 2)
      return new Q(paramList); 
    throw new AxComponentAlpha(paramString, paramList.size(), 2);
  }
  
  private AbstractInAxPackage o(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() == 2)
      return new E(paramList.get(0), paramList.get(1)); 
    throw new AxComponentAlpha(paramString + "\nProper Usage:\nisTrueFor([TrueFalseExpression], [SecondsTrueExpression])", paramList.size(), 2);
  }
  
  private AbstractInAxPackage p(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() == 1)
      return new Z(paramList.get(0)); 
    throw new AxComponentAlpha(paramString + "\nProper Usage:\ntimeTrue([TrueFalseExpression])", paramList.size(), 2);
  }
  
  private AbstractInAxPackage q(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() != 1)
      throw new AxComponentAlpha(paramString, paramList.size(), 1); 
    return new C(paramList.get(0));
  }
  
  private AbstractInAxPackage r(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() != 4)
      throw new AxComponentAlpha(paramString + "\nProper Usage:\naerodynamicDragHp(velocity (m/s), airDensity (kg/m^-3), dragCoefficent, frontalArea (m^2))", paramList.size(), 4); 
    return new c(paramList.get(0), paramList.get(1), paramList.get(2), paramList.get(3));
  }
  
  private AbstractInAxPackage s(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() != 4)
      throw new AxComponentAlpha(paramString + "\nProper Usage:\naccelHp(velocity (MPH), deltaVelocity(MPH), deltaTime(s), weight(lb))", paramList.size(), 4); 
    return new a(paramList.get(0), paramList.get(1), paramList.get(2), paramList.get(3));
  }
  
  private AbstractInAxPackage t(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() != 3)
      throw new AxComponentAlpha(paramString + "\nProper Usage:\nrollingDragHp(speed (MPH), tirePressure (psi), weight (lbs))", paramList.size(), 3); 
    return new M(paramList.get(0), paramList.get(1), paramList.get(2));
  }
  
  private AbstractInAxPackage u(String paramString, List<AxInterfaceAb> paramList) {
    if (paramList.size() != 1)
      throw new AxComponentAlpha(paramString, paramList.size(), 1); 
    return new O(paramList.get(0), this.a);
  }
  
  private AbstractInAxPackage v(String paramString, List paramList) {
    if (paramList.size() != 1 && paramList.size() != 2)
      throw new AxComponentAlpha(paramString, paramList.size(), 1); 
    return new H(paramList);
  }
  
  private AbstractInAxPackage w(String paramString, List paramList) {
    if (paramList.size() != 1 && paramList.size() != 2)
      throw new AxComponentAlpha(paramString, paramList.size(), 1); 
    return new J(paramList);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */