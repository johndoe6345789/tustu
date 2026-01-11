package aP;

import az.JDialogExtensionInAzPackage;
import bH.A;
import bH.O;
import bH.X;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import r.JDialogExtensionInAzPackage;
import r.RInterfaceIndia;
import s.SComponentGolf;

class ManagerJdialogextensioninazpackage implements O {
  dy(dl paramdl) {}
  
  public String JDialogExtensionInAzPackage() {
    return JDialogExtensionInAzPackage.b;
  }
  
  public String b() {
    return JDialogExtensionInAzPackage.JDialogExtensionInAzPackage().c(JDialogExtensionInAzPackage.cC, "");
  }
  
  public String c() {
    return JDialogExtensionInAzPackage.JDialogExtensionInAzPackage().c(JDialogExtensionInAzPackage.cD, "");
  }
  
  public String d() {
    return JDialogExtensionInAzPackage.JDialogExtensionInAzPackage().c(JDialogExtensionInAzPackage.cE, "");
  }
  
  public String e() {
    String str1 = JDialogExtensionInAzPackage.JDialogExtensionInAzPackage().c(JDialogExtensionInAzPackage.n, null);
    String str2 = (str1 == null) ? X.b(JDialogExtensionInAzPackage.c, dl.s(), "") : str1;
    return X.b(str2, dl.t(), "").trim();
  }
  
  public String f() {
    return "";
  }
  
  public String h() {
    return JDialogExtensionInAzPackage.JDialogExtensionInAzPackage().c(JDialogExtensionInAzPackage.o, "");
  }
  
  public void RInterfaceIndia() {
    this.JDialogExtensionInAzPackage.r();
  }
  
  public String j() {
    return this.JDialogExtensionInAzPackage.q();
  }
  
  public void JDialogExtensionInAzPackage(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6) {
    JDialogExtensionInAzPackage JDialogExtensionInAzPackage = new JDialogExtensionInAzPackage(dd.JDialogExtensionInAzPackage().c(), SComponentGolf.d());
    bV.JDialogExtensionInAzPackage(dd.JDialogExtensionInAzPackage().c(), (Component)JDialogExtensionInAzPackage);
    JDialogExtensionInAzPackage.setVisible(true);
    dz dz = new dz(this, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, JDialogExtensionInAzPackage);
    dz.start();
  }
  
  public String[] k() {
    String[] arrayOfString = JDialogExtensionInAzPackage.do;
    for (byte b = 0; b < arrayOfString.length; b++) {
      String str = X.b(arrayOfString[b], dl.t(), "");
      str = X.b(str, RInterfaceIndia.b, "");
      arrayOfString[b] = str;
    } 
    if (A.RInterfaceIndia().h()) {
      String[] arrayOfString1 = new String[arrayOfString.length * 2];
      for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
        arrayOfString1[b1 * 2] = arrayOfString[b1];
        arrayOfString1[b1 * 2 + 1] = arrayOfString[b1] + RInterfaceIndia.d;
      } 
      arrayOfString = arrayOfString1;
    } 
    return arrayOfString;
  }
  
  public int[] l() {
    return JDialogExtensionInAzPackage.b.equals(RInterfaceIndia.v) ? new int[] { 3, 4 } : new int[] { 2, 3 };
  }
  
  public boolean b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6) {
    if (paramString4 == null || paramString4.trim().equals("") || paramString4.indexOf("@") < 1 || paramString4.indexOf(".") < 0 || paramString4.lastIndexOf(".") < paramString4.indexOf("@")) {
      bV.d("Invalid Email Address", dl.e(this.JDialogExtensionInAzPackage));
      return true;
    } 
    return false;
  }
  
  public String m() {
    return SComponentGolf.b(JDialogExtensionInAzPackage.p);
  }
  
  public boolean JDialogExtensionInAzPackage(String paramString) {
    return JDialogExtensionInAzPackage.JDialogExtensionInAzPackage().b(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */