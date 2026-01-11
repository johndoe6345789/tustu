package business.binary_transformers;

import G.Manager;
import G.GInterfaceAn;
import s.SComponentGolf;

class BtInterfaceAz implements GInterfaceAn {
  aZ(aV paramaV) {}
  
  public void a(String paramString1, String paramString2) {
    String str = this.a.f.l();
    if (str != null)
      str = SComponentGolf.b(str); 
    if (str != null && str.length() == 0)
      str = " "; 
    Manager Manager = this.a.SComponentGolf.c(this.a.f.b());
    if (Manager != null) {
      String str1 = Manager.p();
      if (str1 != null && !str1.equals("") && this.a.n.getText() != null && !this.a.n.getText().endsWith(str1)) {
        String str2 = SComponentGolf.b(str1);
        str = str + "(" + str2 + ")";
      } 
    } 
    this.a.n.setText(str);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */