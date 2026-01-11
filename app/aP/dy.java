package aP;

import az.a;
import bH.A;
import bH.O;
import bH.X;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import r.a;
import r.i;
import s.g;

class dy implements O {
  dy(dl paramdl) {}
  
  public String a() {
    return a.b;
  }
  
  public String b() {
    return a.a().c(a.cC, "");
  }
  
  public String c() {
    return a.a().c(a.cD, "");
  }
  
  public String d() {
    return a.a().c(a.cE, "");
  }
  
  public String e() {
    String str1 = a.a().c(a.n, null);
    String str2 = (str1 == null) ? X.b(a.c, dl.s(), "") : str1;
    return X.b(str2, dl.t(), "").trim();
  }
  
  public String f() {
    return "";
  }
  
  public String h() {
    return a.a().c(a.o, "");
  }
  
  public void i() {
    this.a.r();
  }
  
  public String j() {
    return this.a.q();
  }
  
  public void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6) {
    a a = new a(dd.a().c(), g.d());
    bV.a(dd.a().c(), (Component)a);
    a.setVisible(true);
    dz dz = new dz(this, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, a);
    dz.start();
  }
  
  public String[] k() {
    String[] arrayOfString = a.do;
    for (byte b = 0; b < arrayOfString.length; b++) {
      String str = X.b(arrayOfString[b], dl.t(), "");
      str = X.b(str, i.b, "");
      arrayOfString[b] = str;
    } 
    if (A.i().h()) {
      String[] arrayOfString1 = new String[arrayOfString.length * 2];
      for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
        arrayOfString1[b1 * 2] = arrayOfString[b1];
        arrayOfString1[b1 * 2 + 1] = arrayOfString[b1] + i.d;
      } 
      arrayOfString = arrayOfString1;
    } 
    return arrayOfString;
  }
  
  public int[] l() {
    return a.b.equals(i.v) ? new int[] { 3, 4 } : new int[] { 2, 3 };
  }
  
  public boolean b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6) {
    if (paramString4 == null || paramString4.trim().equals("") || paramString4.indexOf("@") < 1 || paramString4.indexOf(".") < 0 || paramString4.lastIndexOf(".") < paramString4.indexOf("@")) {
      bV.d("Invalid Email Address", dl.e(this.a));
      return true;
    } 
    return false;
  }
  
  public String m() {
    return g.b(a.p);
  }
  
  public boolean a(String paramString) {
    return a.a().b(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */