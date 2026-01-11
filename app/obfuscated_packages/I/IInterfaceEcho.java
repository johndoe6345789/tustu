package I;

import G.ak;
import G.c;
import G.cu;
import G.db;
import G.k;
import java.util.ArrayList;

public class IInterfaceEcho {
  public static String a = "controllerConnecting";
  
  public static String b = "controllerConnected";
  
  public static void a() {
    cu.a().d(a);
    cu.a().d(b);
  }
  
  public static void a(ArrayList<ak> paramArrayList) {
    ak ak = new ak();
    ak.v(a + "Indicator");
    ak.a((db)new c("Connecting"));
    ak.b((db)new c(""));
    ak.a(k.s);
    ak.b(k.b);
    ak.c(k.i);
    ak.d(k.c);
    ak.a(a);
    paramArrayList.add(ak);
    ak = new ak();
    ak.v(b + "Indicator");
    ak.a((db)new c("Connected"));
    ak.b((db)new c("Not Connected"));
    ak.a(k.s);
    ak.b(k.b);
    ak.c(k.i);
    ak.d(k.c);
    ak.a(b);
    paramArrayList.add(ak);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/I/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */