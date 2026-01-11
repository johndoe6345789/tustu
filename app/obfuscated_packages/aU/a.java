package aU;

import G.R;
import G.aM;
import V.g;
import V.j;
import javax.swing.SwingUtilities;

public class a implements d {
  public void a(R paramR, int paramInt1, int paramInt2) {
    String str1 = paramR.G().b();
    String str2 = paramR.G().c();
    aM aM1 = paramR.c(str1);
    aM aM2 = paramR.c(str2);
    if (!paramR.C().q());
    try {
      aM1.a(paramR.p(), paramInt1);
      aM2.a(paramR.p(), paramInt2);
      b b = new b(this, paramR);
      SwingUtilities.invokeLater(b);
    } catch (g g) {
      g.printStackTrace();
      throw new V.a("Unable to set TPS Parameter:\n" + g.getMessage());
    } catch (j j) {
      j.printStackTrace();
      throw new V.a("Unable to set TPS Parameter:\n" + j.getMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aU/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */