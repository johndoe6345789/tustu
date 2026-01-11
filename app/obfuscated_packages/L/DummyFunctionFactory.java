package L;

import ax.ac;
import ax.e;
import bH.D;
import java.util.List;

public class DummyFunctionFactory extends e {
  private static m a = null;
  
  public m() {
    D.c("Dummy Function Factory Created.");
  }
  
  public ac a(String paramString, List paramList) {
    ac ac = null;
    if (paramString.equalsIgnoreCase("smoothBasic")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("lastValue")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("pastValue")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("historicalValue")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("accumulate")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("isNaN")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("aerodynamicDragHp")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("accelHp")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("rollingDragHp")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("smoothFiltered")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("maxValue")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("minValue")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("getLogTime")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("min")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("max")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("avg")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("isTrueFor")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("timeTrue")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("toggle")) {
      ac = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("cosXXXX")) {
    
    } 
    if (ac == null)
      ac = n.a().a(paramString, paramList); 
    return ac;
  }
  
  private ac b(String paramString, List paramList) {
    return new g(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */