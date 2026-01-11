package L;

import ax.CloneableImplInAxPackage;
import ax.AbstractInAxPackage;
import java.util.List;

public abstract class AbstractListFunction extends AbstractInAxPackage {
  List b;
  
  protected AbstractListFunction(List paramList) {
    this.b = paramList;
  }
  
  public abstract String a();
  
  public abstract int b();
  
  public abstract int c();
  
  public abstract double a(CloneableImplInAxPackage paramS);
  
  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }
  
  public abstract r a(List paramList);
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */