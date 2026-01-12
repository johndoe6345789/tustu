package Z;

import G.R;
import G.SerializableImpl;
import G.SerializableImplExceptionprintstacktrace;
import G.T;
import G.i;
import V.ExceptionPrintstacktrace;
import W.j;
import bH.D;
import java.util.ArrayList;
import java.util.List;

public class ZInterfaceAlpha implements d {
  public List a(List paramList) {
    ArrayList<j> arrayList = new ArrayList();
    R r = T.a().c();
    if (r != null) {
      ArrayList arrayList1 = r.ExceptionPrintstacktrace();
      for (SerializableImplExceptionprintstacktrace SerializableImplExceptionprintstacktrace :
          arrayList1) {
        SerializableImpl SerializableImpl =
            r.ExceptionPrintstacktrace(SerializableImplExceptionprintstacktrace.a());
        if (SerializableImpl != null
            && SerializableImpl.b().equals("formula")
            && !a(SerializableImplExceptionprintstacktrace.b(), paramList)) {
          String str = SerializableImpl.k();
          try {
            str = i.a(str, r);
            j j = new j();
            j.a(SerializableImplExceptionprintstacktrace.b());
            j.c(str);
            j.e(SerializableImplExceptionprintstacktrace.d());
            arrayList.add(j);
          } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
            D.b(
                "Unable to convert DataLogField \""
                    + SerializableImplExceptionprintstacktrace.b()
                    + "\" Error: "
                    + ExceptionPrintstacktrace.getLocalizedMessage());
          }
        }
      }
    }
    return arrayList;
  }

  private boolean a(String paramString, List paramList) {
    for (j j : paramList) {
      if (j.a().equals(paramString)) return true;
    }
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/Z/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
