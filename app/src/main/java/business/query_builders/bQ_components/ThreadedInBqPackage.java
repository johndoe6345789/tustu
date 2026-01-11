package business.query_builders.bQ_components;

import G.GComponentCq;
import G.ManagerUsingArrayList;
import J.JInterfaceJuliet;
import java.util.ArrayList;
import java.util.List;

public class ThreadedInBqPackage implements GComponentCq {
  l a;
  
  JInterfaceJuliet b;
  
  final List c = new ArrayList();
  
  int d = 1000;
  
  int e = 5;
  
  int f = 0;
  
  Runnable g = new b(this);
  
  public ThreadedInBqPackage(l paraml, JInterfaceJuliet paramj) {
    this.b = paramj;
    this.a = paraml;
  }
  
  public void a() {
    ManagerUsingArrayList.a().a(JInterfaceJuliet.c, this);
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */