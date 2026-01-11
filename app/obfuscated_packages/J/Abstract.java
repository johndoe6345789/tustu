package J;

import G.Exceptionprintstacktrace;
import G.c;
import G.GComponentCr;
import G.GInterfaceDb;
import G.k;
import I.IInterfaceDelta;
import java.io.Serializable;

public abstract class Abstract implements GComponentCr, Serializable {
  public static String a = "protocolError";
  
  public abstract void a();
  
  public void b() {
    Exceptionprintstacktrace Exceptionprintstacktrace = new Exceptionprintstacktrace();
    Exceptionprintstacktrace.v("protocolError");
    Exceptionprintstacktrace.a((GInterfaceDb)new c("Protocol Error"));
    Exceptionprintstacktrace.b((GInterfaceDb)new c("Protocol Error"));
    Exceptionprintstacktrace.a(k.q);
    Exceptionprintstacktrace.b(k.a);
    Exceptionprintstacktrace.c(k.i);
    Exceptionprintstacktrace.IInterfaceDelta(k.c);
    Exceptionprintstacktrace.a(a);
    IInterfaceDelta.a().a(Exceptionprintstacktrace);
  }
  
  public void IInterfaceDelta() {
    IInterfaceDelta.a().b("protocoloError");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/J/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */