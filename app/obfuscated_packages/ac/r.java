package ac;

import G.R;
import G.ac;
import V.g;
import bH.D;
import bH.p;
import java.util.ArrayList;

public class r {
  public static ArrayList a(R[] paramArrayOfR) {
    ArrayList<q> arrayList = new ArrayList();
    for (byte b = 0; b < paramArrayOfR.length; b++) {
      if (paramArrayOfR[b].S())
        for (ac ac : paramArrayOfR[b].g()) {
          D.c(ac.aL());
          if (a(paramArrayOfR[b], ac)) {
            q q = new q();
            if (b == 0) {
              q.a(ac.b());
            } else {
              q.a(paramArrayOfR[b].c() + "." + ac.b());
            } 
            q.b(paramArrayOfR[b].c());
            q.a(ac);
            q.a(b);
            q.a(paramArrayOfR[b].g(ac.a()));
            q.b(ac.f());
            arrayList.add(q);
          } 
        }  
    } 
    return arrayList;
  }
  
  public static boolean a(R paramR, ac paramac) {
    try {
      return (paramac.aJ() == null || paramac.aJ().equals("") || p.a(paramac.aJ(), paramR));
    } catch (g g) {
      D.b("Unable to process enable logic (Assuming true) for DataLog Field: " + paramac);
      return true;
    } 
  }
  
  public static boolean a() {
    return (c.a().u() || u.a().u());
  }
  
  public static String b() {
    return c.a().u() ? c.a().n() : (u.a().u() ? u.a().n() : null);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ac/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */