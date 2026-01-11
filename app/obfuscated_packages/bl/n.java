package bl;

import G.R;
import G.T;
import G.aI;
import G.i;
import com.efiAnalytics.plugin.ecu.MathException;
import com.efiAnalytics.plugin.ecu.servers.MathExpressionEvaluator;

final class n implements MathExpressionEvaluator {
  public double evaluateExpression(String paramString1, String paramString2) {
    try {
      R r = T.a().c(paramString1);
      if (r == null)
        throw new MathException("Controller " + paramString1 + " is not know. This does not appear to be a loaded controller"); 
      return i.a(paramString2, (aI)r);
    } catch (Exception exception) {
      throw new MathException(exception.getMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */