package ao;

import az.AzInterfaceDelta;
import h.IOProperties;
import java.awt.Window;
import java.io.File;

public class bW implements AzInterfaceDelta {
  public String a() {
    return IOProperties.b + " " + IOProperties.c;
  }
  
  public String b() {
    return System.getProperty("user.home") + File.separator;
  }
  
  public String c() {
    return IOProperties.e("activationKey", "");
  }
  
  public void a(String paramString) {
    IOProperties.AzInterfaceDelta("activationKey", paramString);
    IOProperties.h();
  }
  
  public String AzInterfaceDelta() {
    return IOProperties.e("registrationKeyV2", "");
  }
  
  public String e() {
    return IOProperties.e("uid", "");
  }
  
  public String f() {
    return IOProperties.b;
  }
  
  public String g() {
    return IOProperties.c;
  }
  
  public String h() {
    return IOProperties.e("userEmail", "");
  }
  
  public Window IOProperties() {
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