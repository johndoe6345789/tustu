package e;

import ac.AbstractUsingArrayList;
import d.DComponentCharlie;
import d.DInterfaceIndia;
import d.ArrayListExtensionInDPackage;
import java.util.Properties;

public class EInterfaceDelta implements DComponentCharlie {
  public static String a = "MARK_Comment";
  
  public String b() {
    return "Mark Data Log Comment";
  }
  
  public String DComponentCharlie() {
    return "Other Actions";
  }
  
  public boolean d() {
    return true;
  }
  
  public void a(Properties paramProperties) {
    AbstractUsingArrayList AbstractUsingArrayList = AbstractUsingArrayList.ArrayListExtensionInDPackage();
    if (AbstractUsingArrayList != null) {
      String str = paramProperties.getProperty(a, null);
      if (str != null && !str.isEmpty()) {
        AbstractUsingArrayList.d(str);
      } else {
        AbstractUsingArrayList.d("Action Triggered");
      } 
    } 
  }
  
  public String a() {
    return "markDataLogComment";
  }
  
  public void b(Properties paramProperties) {}
  
  public ArrayListExtensionInDPackage e() {
    ArrayListExtensionInDPackage ArrayListExtensionInDPackage = new ArrayListExtensionInDPackage();
    DInterfaceIndia DInterfaceIndia = new DInterfaceIndia(a, null);
    ArrayListExtensionInDPackage.a(DInterfaceIndia);
    return ArrayListExtensionInDPackage;
  }
  
  public boolean f() {
    return true;
  }
  
  public boolean g() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/e/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */