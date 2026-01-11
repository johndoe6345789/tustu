package bo;

import G.R;
import W.ab;
import bH.D;
import r.j;

public class a {
  public static void a(R paramR) {
    boolean bool = (r.a.a().c(r.a.bq, r.a.br) && r.a.a().c(r.a.bs, r.a.bt)) ? true : false;
    if (!bool && !paramR.U()) {
      String str = b(paramR);
      if (str != null) {
        ab ab = new ab();
        ab.a(paramR, str, false);
      } else {
        D.d("Not Loading default Tools because non are defined for signature: " + paramR.i());
      } 
    } else {
      D.d("Not Loading default Tools because they were already loaded from the project ini(s)");
    } 
  }
  
  public static String b(R paramR) {
    String str1 = paramR.i();
    String str2 = null;
    if (str1.startsWith("MS3")) {
      str2 = j.E;
    } else if (str1.startsWith("MSII Rev") || str1.startsWith("MS2Extra Rev 1") || (str1.startsWith("Monsterfirmware") && !str1.contains("pw"))) {
      str2 = j.C;
    } else if (str1.startsWith("MS2Extra")) {
      str2 = j.D;
    } else if (str1.startsWith("MS/Extra") || str1.startsWith("MS1/Extra") || str1.startsWith("MSnS-extra")) {
      str2 = j.B;
    } else if (str1.startsWith("20")) {
      str2 = j.A;
    } 
    return str2;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bo/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */