package business.byte_writers;

import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.calculators.calculator.Calculator;
import java.awt.Window;

public class BwInterfaceAlpha {
  public static void a(Window paramWindow, String paramString) {
    if (paramString.equals("Two Point Calculator")) {
      b(paramWindow);
    } else if (paramString.equals("Calculator")) {
      a(paramWindow);
    } else if (paramString.equals("Unit Conversion Calculator")) {
      c(paramWindow);
    } else {
      bV.d("Unknown Calculator: " + paramString, paramWindow);
    } 
  }
  
  private static void a(Window paramWindow) {
    new Calculator(paramWindow);
  }
  
  private static void b(Window paramWindow) {
    b b = new b();
    bV.a(b, paramWindow, "Two Point Calculator", null);
  }
  
  private static void c(Window paramWindow) {
    f f = new f(paramWindow);
    bV.a(f, paramWindow, "Unit Conversion Calculator", null);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bw/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */