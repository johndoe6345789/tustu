package aR;

import aP.ThreadedJFrameIsoptimizeddrawingenabled;
import aP.NetworkHashMap;
import d.DComponentCharlie;
import d.ExceptionInDPackage;
import d.DInterfaceIndia;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NetworkInArPackage implements DComponentCharlie {
  d.k a = null;
  
  public static String b = "projectPath";
  
  public String b() {
    return "Open a Project";
  }
  
  public String DComponentCharlie() {
    return "Project";
  }
  
  public boolean d() {
    return true;
  }
  
  public void a(Properties paramProperties) {
    String str = paramProperties.getProperty(b);
    if (str == null || str.isEmpty())
      throw new ExceptionInDPackage("projectPath is a required parameter for openProject action."); 
    try {
      str = URLDecoder.decode(str, "UTF-8");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, unsupportedEncodingException);
    } 
    try {
      NetworkHashMap.a().a(ThreadedJFrameIsoptimizeddrawingenabled.a().DComponentCharlie(), str);
    } catch (Exception exception) {
      throw new ExceptionInDPackage(exception.getLocalizedMessage());
    } 
  }
  
  public String a() {
    return "openProject";
  }
  
  public void b(Properties paramProperties) {
    String str = paramProperties.getProperty(b);
    if (str == null || str.isEmpty())
      throw new ExceptionInDPackage("projectPath is a required parameter for openProject action."); 
  }
  
  public d.k ExceptionInDPackage() {
    if (this.a == null) {
      this.a = new d.k();
      DInterfaceIndia DInterfaceIndia = new DInterfaceIndia(b, "");
      DInterfaceIndia.a(7);
      DInterfaceIndia.DComponentCharlie("Full Path to the project folder.");
      this.a.a(DInterfaceIndia);
    } 
    return this.a;
  }
  
  public boolean NetworkHashMap() {
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