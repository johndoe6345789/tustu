package ao;

import az.d;
import h.i;
import java.awt.Window;
import java.io.File;

public class bW implements d {
  public String a() {
    return i.b + " " + i.c;
  }
  
  public String b() {
    return System.getProperty("user.home") + File.separator;
  }
  
  public String c() {
    return i.e("activationKey", "");
  }
  
  public void a(String paramString) {
    i.d("activationKey", paramString);
    i.h();
  }
  
  public String d() {
    return i.e("registrationKeyV2", "");
  }
  
  public String e() {
    return i.e("uid", "");
  }
  
  public String f() {
    return i.b;
  }
  
  public String g() {
    return i.c;
  }
  
  public String h() {
    return i.e("userEmail", "");
  }
  
  public Window i() {
    return bq.a().b();
  }
  
  public boolean j() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */