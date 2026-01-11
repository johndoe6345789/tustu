package ao;

import W.j;
import W.n;
import h.g;

public class D {
  public static j a(n paramn) {
    j j = paramn.a(g.a().a("Field.TP"));
    if (j != null)
      return j; 
    j = paramn.a(g.a().a("TPS"));
    if (j != null)
      return j; 
    j = paramn.a("TPS");
    return (j != null) ? j : null;
  }
  
  public static j b(n paramn) {
    j j = paramn.a(g.a().a("VSS2"));
    if (j != null && j.g() > j.h()) {
      bH.D.d("findMphColumn, Using VSS2");
      return j;
    } 
    j = paramn.a(g.a().a("SmoothMPH"));
    if (j != null) {
      bH.D.d("findMphColumn, Using SmoothMPH");
      return j;
    } 
    j = paramn.a("MPH");
    if (j != null) {
      bH.D.d("findMphColumn, Using MPH");
      return j;
    } 
    j = paramn.a(g.a().a("Field.speedMPH"));
    if (j != null) {
      bH.D.d("findMphColumn, Using " + j.a());
      return j;
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */