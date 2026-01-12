package business.binary_transformers;

import G.ArrayListExceptionprintstacktraceInGPackage;
import java.util.ArrayList;
import java.util.List;

public class CustomEditorPanelRegistry {
  private static M a = null;

  private final List b = new ArrayList();

  public static M a() {
    if (a == null) a = new M();
    return a;
  }

  public void a(N paramN) {
    this.b.add(paramN);
  }

  public N a(ArrayListExceptionprintstacktraceInGPackage parambv) {
    for (N n : this.b) {
      if (n.a(parambv)) return n;
    }
    return null;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
