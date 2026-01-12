package ao;

import IOJFileChooser.a;
import IOJFileChooser.d;
import g.GInterfaceEcho;
import g.GInterfaceMike;
import g.IOJFileChooser;

class fo implements GInterfaceMike {
  fo(eK parameK) {}

  public boolean a(String paramString) {
    if (paramString.equals("")) return true;
    try {
      String str = GInterfaceEcho.b(this.a.l, paramString, 20);
      a a = d.a().a(str);
      a.d();
    } catch (Exception exception) {
      IOJFileChooser.a(
          "Invalid condition:"
              + paramString
              + "\nPlease check your syntax.\nClear field and press Ok to disable custom condition",
          this.a.getParent());
      return false;
    }
    return true;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
