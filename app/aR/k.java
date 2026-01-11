package aR;

import aP.dd;
import aP.f;
import d.c;
import d.e;
import d.i;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class k implements c {
  d.k a = null;
  
  public static String b = "projectPath";
  
  public String b() {
    return "Open a Project";
  }
  
  public String c() {
    return "Project";
  }
  
  public boolean d() {
    return true;
  }
  
  public void a(Properties paramProperties) {
    String str = paramProperties.getProperty(b);
    if (str == null || str.isEmpty())
      throw new e("projectPath is a required parameter for openProject action."); 
    try {
      str = URLDecoder.decode(str, "UTF-8");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, unsupportedEncodingException);
    } 
    try {
      f.a().a(dd.a().c(), str);
    } catch (Exception exception) {
      throw new e(exception.getLocalizedMessage());
    } 
  }
  
  public String a() {
    return "openProject";
  }
  
  public void b(Properties paramProperties) {
    String str = paramProperties.getProperty(b);
    if (str == null || str.isEmpty())
      throw new e("projectPath is a required parameter for openProject action."); 
  }
  
  public d.k e() {
    if (this.a == null) {
      this.a = new d.k();
      i i = new i(b, "");
      i.a(7);
      i.c("Full Path to the project folder.");
      this.a.a(i);
    } 
    return this.a;
  }
  
  public boolean f() {
    return true;
  }
  
  public boolean g() {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */