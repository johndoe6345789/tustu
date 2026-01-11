package bt;

import G.aM;
import G.aN;
import s.g;

class aZ implements aN {
  aZ(aV paramaV) {}
  
  public void a(String paramString1, String paramString2) {
    String str = this.a.f.l();
    if (str != null)
      str = g.b(str); 
    if (str != null && str.length() == 0)
      str = " "; 
    aM aM = this.a.g.c(this.a.f.b());
    if (aM != null) {
      String str1 = aM.p();
      if (str1 != null && !str1.equals("") && this.a.n.getText() != null && !this.a.n.getText().endsWith(str1)) {
        String str2 = g.b(str1);
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