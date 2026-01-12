package business.base_adapters;

import G.R;
import W.B;
import aP.NetworkHashMap;
import aP.ThreadedJFrameIsoptimizeddrawingenabled;
import com.efiAnalytics.ui.bV;
import java.io.File;

public class BaComponentAlpha implements B {
  private R a = null;

  public BaComponentAlpha(R paramR) {
    this.a = paramR;
  }

  public void a(File paramFile) {
    String str =
        "The file '"
            + paramFile.getName()
            + "' has been changed by another program.\n\nWould you like "
            + r.a.b
            + " to load the changes?";
    if (bV.a(str, ThreadedJFrameIsoptimizeddrawingenabled.a().c(), true))
      NetworkHashMap.a()
          .a(ThreadedJFrameIsoptimizeddrawingenabled.a().c(), this.a, paramFile.getAbsolutePath());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ba/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
