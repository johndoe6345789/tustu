package r;

import i.c;

public class m {
  private static m a = null;
  
  private boolean b = false;
  
  public static m a() {
    if (a == null)
      a = new m(); 
    return a;
  }
  
  public boolean b() {
    return (this.b || c.a().d());
  }
  
  public void a(boolean paramBoolean) {
    this.b = paramBoolean;
    if (paramBoolean) {
      c.a().b();
    } else {
      c.a().c();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/r/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */