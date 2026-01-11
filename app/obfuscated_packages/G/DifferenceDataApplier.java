package G;

import V.g;
import bH.D;
import java.util.ArrayList;

public class DifferenceDataApplier implements cB {
  public boolean a(ArrayList paramArrayList, R paramR, Y paramY, String paramString) {
    for (aM aM : paramArrayList) {
      try {
        int[] arrayOfInt = aM.g(paramY);
        paramR.h().a(aM.d(), aM.g(), arrayOfInt);
      } catch (g g) {
        g.printStackTrace();
        D.a("Unable to take difference data.");
      } 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */