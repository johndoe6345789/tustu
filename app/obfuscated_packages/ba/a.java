package ba;

import G.R;
import W.B;
import aP.dd;
import aP.f;
import com.efiAnalytics.ui.bV;
import java.io.File;

public class a implements B {
  private R a = null;
  
  public a(R paramR) {
    this.a = paramR;
  }
  
  public void a(File paramFile) {
    String str = "The file '" + paramFile.getName() + "' has been changed by another program.\n\nWould you like " + r.a.b + " to load the changes?";
    if (bV.a(str, dd.a().c(), true))
      f.a().a(dd.a().c(), this.a, paramFile.getAbsolutePath()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ba/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */