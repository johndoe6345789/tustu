package bc;

import com.efiAnalytics.ui.NumericTextField;

class BcInterfaceEcho extends NumericTextField implements i {
  e(a parama) {
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
    int j = c();
    return (j >= this.a.a.d() && j <= this.a.a.c());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bc/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */