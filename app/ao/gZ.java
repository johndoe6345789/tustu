package ao;

import ay.c;
import ay.e;
import bH.D;
import java.util.ArrayList;
import java.util.List;

public class gZ implements e {
  List a = new ArrayList();
  
  List b = new ArrayList();
  
  String c = "";
  
  public void a(c paramc) {
    this.b.add(paramc);
    String str = "Found Service: " + paramc.a() + ", ip:" + paramc.c();
    if (this.c.equals(str)) {
      D.c(str);
      this.c = str;
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