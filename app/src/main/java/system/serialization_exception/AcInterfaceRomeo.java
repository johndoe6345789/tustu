package SerializableImplExceptionprintstacktrace;

import G.R;
import G.SerializableImplExceptionprintstacktrace;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.p;
import java.util.ArrayList;

public class AcInterfaceRomeo {
  public static ArrayList a(R[] paramArrayOfR) {
    ArrayList<q> arrayList = new ArrayList();
    for (byte b = 0; b < paramArrayOfR.length; b++) {
      if (paramArrayOfR[b].S())
        for (SerializableImplExceptionprintstacktrace SerializableImplExceptionprintstacktrace :
            paramArrayOfR[b].ExceptionPrintstacktrace()) {
          D.c(SerializableImplExceptionprintstacktrace.aL());
          if (a(paramArrayOfR[b], SerializableImplExceptionprintstacktrace)) {
            q q = new q();
            if (b == 0) {
              q.a(SerializableImplExceptionprintstacktrace.b());
            } else {
              q.a(paramArrayOfR[b].c() + "." + SerializableImplExceptionprintstacktrace.b());
            }
            q.b(paramArrayOfR[b].c());
            q.a(SerializableImplExceptionprintstacktrace);
            q.a(b);
            q.a(
                paramArrayOfR[b].ExceptionPrintstacktrace(
                    SerializableImplExceptionprintstacktrace.a()));
            q.b(SerializableImplExceptionprintstacktrace.f());
            arrayList.add(q);
          }
        }
    }
    return arrayList;
  }

  public static boolean a(R paramR, SerializableImplExceptionprintstacktrace paramac) {
    try {
      return (paramac.aJ() == null || paramac.aJ().equals("") || p.a(paramac.aJ(), paramR));
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
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

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/SerializableImplExceptionprintstacktrace/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
