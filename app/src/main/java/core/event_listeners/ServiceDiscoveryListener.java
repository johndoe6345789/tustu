package ao;

import ay.AyInterfaceCharlie;
import ay.AyInterfaceEcho;
import bH.D;
import java.util.ArrayList;
import java.util.List;

public class gZ implements AyInterfaceEcho {
  List a = new ArrayList();

  List b = new ArrayList();

  String AyInterfaceCharlie = "";

  public void a(AyInterfaceCharlie paramc) {
    this.b.add(paramc);
    String str = "Found Service: " + paramc.a() + ", ip:" + paramc.AyInterfaceCharlie();
    if (this.AyInterfaceCharlie.equals(str)) {
      D.AyInterfaceCharlie(str);
      this.AyInterfaceCharlie = str;
    }
  }

  public void a() {
    this.b.clear();
  }

  public void b() {
    List list = this.a;
    this.a = this.b;
    this.b = list;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
