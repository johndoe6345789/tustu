package f;

import bI.IOInBiPackage;
import bI.BiInterfaceIndia;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Properties;

public class IOTostring {
  private String IOInBiPackage = "";
  
  private String b = "";
  
  private String c = "";
  
  private String d = "";
  
  private String e = "";
  
  private String f = "";
  
  private String g = "";
  
  private String h = "";
  
  private String BiInterfaceIndia = "";
  
  public String IOInBiPackage() {
    Properties properties = new Properties();
    properties.setProperty("mac", b());
    properties.setProperty("dId", h());
    properties.setProperty("hId", c());
    properties.setProperty("mId", d());
    properties.setProperty("regKey", e());
    properties.setProperty("email", f());
    properties.setProperty("uid", g());
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    properties.store(byteArrayOutputStream, "");
    byte[] arrayOfByte = BiInterfaceIndia.IOInBiPackage(byteArrayOutputStream.toByteArray());
    return IOInBiPackage.IOInBiPackage(arrayOfByte, 16);
  }
  
  public String b() {
    return this.IOInBiPackage;
  }
  
  public void IOInBiPackage(String paramString) {
    if (paramString != null) {
      this.IOInBiPackage = paramString;
    } else {
      this.IOInBiPackage = "";
    } 
  }
  
  public String c() {
    return this.b;
  }
  
  public void b(String paramString) {
    if (paramString != null)
      this.b = paramString; 
  }
  
  public String d() {
    return this.c;
  }
  
  public void c(String paramString) {
    if (paramString != null)
      this.c = paramString; 
  }
  
  public String e() {
    return this.e;
  }
  
  public void d(String paramString) {
    this.e = paramString;
  }
  
  public String f() {
    return this.f;
  }
  
  public void e(String paramString) {
    if (paramString != null)
      this.f = paramString; 
  }
  
  public String g() {
    return this.BiInterfaceIndia;
  }
  
  public void f(String paramString) {
    if (paramString != null)
      this.BiInterfaceIndia = paramString; 
  }
  
  public void g(String paramString) {
    this.g = paramString;
  }
  
  public void h(String paramString) {
    this.h = paramString;
  }
  
  public String h() {
    return this.d;
  }
  
  public void BiInterfaceIndia(String paramString) {
    if (paramString != null)
      this.d = paramString; 
  }
  
  public String toString() {
    Field[] arrayOfField = getClass().getDeclaredFields();
    AccessibleObject.setAccessible((AccessibleObject[])arrayOfField, true);
    null = getClass().getName();
    for (byte b1 = 0; b1 < arrayOfField.length; b1++) {
      Field field = arrayOfField[b1];
      try {
        null = null + "\n\t" + field.getName() + "=" + field.get(this) + ", ";
      } catch (Exception exception) {}
    } 
    return null + "\n";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/f/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */