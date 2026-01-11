package aW;

import com.efiAnalytics.ui.do;

class AwInterfaceJuliet extends do implements n {
  j(e parame) {
    super("", 10);
    b(0);
  }
  
  public Object a() {
    return Integer.valueOf(c());
  }
  
  int c() {
    Integer integer = Integer.valueOf((int)Math.round(e()));
    return integer.intValue();
  }
  
  public void a(Object paramObject) {
    Integer integer = Integer.valueOf(Integer.parseInt(paramObject.toString()));
    a(integer.intValue());
  }
  
  public boolean b() {
    int i = c();
    return (i >= this.a.a.f() && i <= this.a.a.e());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aW/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */