package ao;

import az.a;
import bH.O;
import bH.X;
import bH.f;
import com.efiAnalytics.ui.aN;
import com.efiAnalytics.ui.bV;
import h.b;
import h.i;
import java.awt.Component;
import java.util.Properties;
import javax.swing.JOptionPane;

class eg implements O {
  eg(cd paramcd) {}
  
  public String a() {
    return i.b;
  }
  
  public String b() {
    return i.e("firstName", "");
  }
  
  public String c() {
    return i.e("lastName", "");
  }
  
  public String d() {
    return i.e("userEmail", "");
  }
  
  public String e() {
    String str = X.b(i.c, b.b, "");
    return X.b(str, b.d, "");
  }
  
  public String f() {
    return i.e("registrationKeyV2", "");
  }
  
  public String g() {
    return i.e("registrationKey", "");
  }
  
  public String h() {
    return "";
  }
  
  public void i() {
    this.a.v();
  }
  
  public String j() {
    return this.a.x();
  }
  
  public void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6) {
    eh eh = new eh(this);
    String str = X.b(i.c, " Lite!", "");
    a a = new a(bq.a().b(), eh);
    bV.a(bq.a().b(), (Component)a);
    a.setVisible(true);
    ei ei = new ei(this, paramString1, paramString2, paramString3, paramString4, a);
    ei.start();
  }
  
  public String[] k() {
    String[] arrayOfString = { X.b(i.c, b.b, "") };
    for (byte b = 0; b < arrayOfString.length; b++) {
      String str = X.b(arrayOfString[b], b.b, "");
      str = X.b(str, b.d, "");
      arrayOfString[b] = str;
    } 
    return arrayOfString;
  }
  
  public int[] l() {
    return new int[] { 3 };
  }
  
  public boolean b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6) {
    String str = f.a(paramString1, paramString2, "MegaLogViewer", paramString4);
    if (str != null && str.equals(paramString3) && !cd.b(this.a, paramString3)) {
      String str1 = hU.b;
      Properties properties = new Properties();
      properties.setProperty(hU.a, paramString4);
      str1 = hU.a(properties, str1);
      int i = JOptionPane.showConfirmDialog(this.a.a, str1, "Upgrade Registration", 0);
      if (i == 0)
        aN.a("https://www.efianalytics.com/register/upgradeMlvRegistrationKey.jsp?email=" + paramString4); 
      return true;
    } 
    return false;
  }
  
  public String m() {
    return "";
  }
  
  public boolean a(String paramString) {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/eg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */