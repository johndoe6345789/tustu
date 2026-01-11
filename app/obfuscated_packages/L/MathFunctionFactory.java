package L;

import ax.A;
import ax.ab;
import ax.ac;
import ax.e;
import java.util.List;

public class MathFunctionFactory extends e {
  private static n e = null;
  
  ab a = new o(this);
  
  private int f = 0;
  
  ab b = new p(this);
  
  long c = -1L;
  
  ab d = new q(this);
  
  private int g = 0;
  
  public static n a() {
    if (e == null)
      e = new n(); 
    return e;
  }
  
  public ac a(String paramString, List paramList) {
    ac ac = null;
    if (paramString.equalsIgnoreCase("smoothBasic")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("lastValue")) {
      ac = d(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("pastValue")) {
      ac = h(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("historicalValue")) {
      ac = i(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("accumulate")) {
      ac = j(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("isNaN")) {
      ac = q(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("aerodynamicDragHp")) {
      ac = r(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("accelHp")) {
      ac = s(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("rollingDragHp")) {
      ac = t(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("smoothFiltered")) {
      ac = u(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("maxValue")) {
      ac = v(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("minValue")) {
      ac = w(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("min")) {
      ac = g(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("max")) {
      ac = e(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("avg")) {
      ac = f(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("highSpeedRecordNumber")) {
      ac = k(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("selectExpression")) {
      ac = l(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("if")) {
      ac = m(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("sum")) {
      ac = n(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("isTrueFor")) {
      ac = o(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("timeTrue")) {
      ac = p(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("toggle")) {
      ac = c(paramString, paramList);
    } 
    return ac;
  }
  
  private ac b(String paramString, List<ab> paramList) {
    if (paramList.size() != 2)
      throw new A(paramString, paramList.size(), 1); 
    return new P(paramList.get(0), paramList.get(1));
  }
  
  private ac c(String paramString, List<ab> paramList) {
    if (paramList.size() != 1 && paramList.size() != 2)
      throw new A(paramString, paramList.size(), 1); 
    return (paramList.size() == 2) ? new aa(paramList.get(0), paramList.get(1)) : new aa(paramList.get(0));
  }
  
  private ac d(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new F(paramList.get(0), this.a);
  }
  
  private ac e(String paramString, List paramList) {
    if (paramList.size() < 1)
      throw new A(paramString, paramList.size(), 1); 
    return new G(paramList);
  }
  
  private ac f(String paramString, List paramList) {
    if (paramList.size() < 1)
      throw new A(paramString, paramList.size(), 1); 
    return new e(paramList);
  }
  
  private ac g(String paramString, List paramList) {
    if (paramList.size() < 1)
      throw new A(paramString, paramList.size(), 1); 
    return new I(paramList);
  }
  
  private ac h(String paramString, List<ab> paramList) {
    if (paramList.size() != 2)
      throw new A(paramString, paramList.size(), 2); 
    return new K(paramList.get(0), paramList.get(1));
  }
  
  private ac i(String paramString, List<ab> paramList) {
    if (paramList.size() != 2)
      throw new A(paramString, paramList.size(), 2); 
    return new F(paramList.get(0), this.a, paramList.get(1));
  }
  
  private ac j(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new b(paramList.get(0), this.a);
  }
  
  private ac k(String paramString, List paramList) {
    if (paramList.size() != 0)
      throw new A(paramString, paramList.size(), 1); 
    return new A(this.d);
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
  
  private ac l(String paramString, List<ab> paramList) {
    if (paramList.size() >= 2) {
      ab ab1 = paramList.remove(0);
      return new N(ab1, paramList);
    } 
    throw new A(paramString, paramList.size(), 2);
  }
  
  private ac m(String paramString, List paramList) {
    if (paramList.size() == 3)
      return new B(paramList); 
    throw new A(paramString, paramList.size(), 3);
  }
  
  private ac n(String paramString, List paramList) {
    if (paramList.size() >= 2)
      return new Q(paramList); 
    throw new A(paramString, paramList.size(), 2);
  }
  
  private ac o(String paramString, List<ab> paramList) {
    if (paramList.size() == 2)
      return new E(paramList.get(0), paramList.get(1)); 
    throw new A(paramString + "\nProper Usage:\nisTrueFor([TrueFalseExpression], [SecondsTrueExpression])", paramList.size(), 2);
  }
  
  private ac p(String paramString, List<ab> paramList) {
    if (paramList.size() == 1)
      return new Z(paramList.get(0)); 
    throw new A(paramString + "\nProper Usage:\ntimeTrue([TrueFalseExpression])", paramList.size(), 2);
  }
  
  private ac q(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new C(paramList.get(0));
  }
  
  private ac r(String paramString, List<ab> paramList) {
    if (paramList.size() != 4)
      throw new A(paramString + "\nProper Usage:\naerodynamicDragHp(velocity (m/s), airDensity (kg/m^-3), dragCoefficent, frontalArea (m^2))", paramList.size(), 4); 
    return new c(paramList.get(0), paramList.get(1), paramList.get(2), paramList.get(3));
  }
  
  private ac s(String paramString, List<ab> paramList) {
    if (paramList.size() != 4)
      throw new A(paramString + "\nProper Usage:\naccelHp(velocity (MPH), deltaVelocity(MPH), deltaTime(s), weight(lb))", paramList.size(), 4); 
    return new a(paramList.get(0), paramList.get(1), paramList.get(2), paramList.get(3));
  }
  
  private ac t(String paramString, List<ab> paramList) {
    if (paramList.size() != 3)
      throw new A(paramString + "\nProper Usage:\nrollingDragHp(speed (MPH), tirePressure (psi), weight (lbs))", paramList.size(), 3); 
    return new M(paramList.get(0), paramList.get(1), paramList.get(2));
  }
  
  private ac u(String paramString, List<ab> paramList) {
    if (paramList.size() != 1)
      throw new A(paramString, paramList.size(), 1); 
    return new O(paramList.get(0), this.a);
  }
  
  private ac v(String paramString, List paramList) {
    if (paramList.size() != 1 && paramList.size() != 2)
      throw new A(paramString, paramList.size(), 1); 
    return new H(paramList);
  }
  
  private ac w(String paramString, List paramList) {
    if (paramList.size() != 1 && paramList.size() != 2)
      throw new A(paramString, paramList.size(), 1); 
    return new J(paramList);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */