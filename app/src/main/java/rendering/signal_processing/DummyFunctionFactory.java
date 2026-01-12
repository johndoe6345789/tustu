package L;

import ax.AbstractInAxPackage;
import bH.D;
import java.util.List;

public class DummyFunctionFactory extends AbstractInAxPackage {
  private static m a = null;

  public DummyFunctionFactory() {
    D.c("Dummy Function Factory Created.");
  }

  public AbstractInAxPackage a(String paramString, List paramList) {
    AbstractInAxPackage AbstractInAxPackage = null;
    if (paramString.equalsIgnoreCase("smoothBasic")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("lastValue")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("pastValue")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("historicalValue")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("accumulate")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("isNaN")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("aerodynamicDragHp")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("accelHp")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("rollingDragHp")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("smoothFiltered")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("maxValue")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("minValue")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("getLogTime")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("min")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("max")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("avg")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("isTrueFor")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("timeTrue")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("toggle")) {
      AbstractInAxPackage = b(paramString, paramList);
    } else if (paramString.equalsIgnoreCase("cosXXXX")) {

    }
    if (AbstractInAxPackage == null) AbstractInAxPackage = n.a().a(paramString, paramList);
    return AbstractInAxPackage;
  }

  private AbstractInAxPackage b(String paramString, List paramList) {
    return new g(paramString);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
