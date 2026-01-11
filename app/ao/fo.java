package ao;

import g.e;
import g.k;
import g.m;
import k.a;
import k.d;

class fo implements m {
  fo(eK parameK) {}
  
  public boolean a(String paramString) {
    if (paramString.equals(""))
      return true; 
    try {
      String str = e.b(this.a.l, paramString, 20);
      a a = d.a().a(str);
      a.d();
    } catch (Exception exception) {
      k.a("Invalid condition:" + paramString + "\nPlease check your syntax.\nClear field and press Ok to disable custom condition", this.a.getParent());
      return false;
    } 
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */