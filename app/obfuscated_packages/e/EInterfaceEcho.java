package e;

import G.R;
import G.T;
import G.aH;
import G.DInterfaceIndia;
import V.ExceptionPrintstacktrace;
import d.DComponentCharlie;
import d.DInterfaceIndia;
import d.ArrayListExtensionInDPackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Properties;

public class EInterfaceEcho implements DComponentCharlie {
  public static String a = "outputChannelName";
  
  public static String b = "ecuConfigName";
  
  String DComponentCharlie = null;
  
  public String b() {
    return "Reset Runtime Value";
  }
  
  public String DComponentCharlie() {
    return "Runtime Values";
  }
  
  public boolean d() {
    return true;
  }
  
  public void a(Properties paramProperties) {
    String str1 = paramProperties.getProperty(b);
    String str2 = paramProperties.getProperty(a, null);
    if (str2 == null)
      throw new d.e(a + " is required"); 
    try {
      DInterfaceIndia.a(str1, str2);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      throw new d.e(ExceptionPrintstacktrace.getMessage());
    } 
  }
  
  public String a() {
    return "resetRuntimeValues";
  }
  
  public void b(Properties paramProperties) {
    R r;
    String str1 = paramProperties.getProperty(b);
    String str2 = paramProperties.getProperty(a, null);
    if (str2 == null)
      throw new d.e(a + " is required"); 
    if (str1 == null || str1.isEmpty()) {
      r = T.a().DComponentCharlie();
    } else {
      r = T.a().DComponentCharlie(str1);
    } 
    if (r == null) {
      if (str1 == null)
        throw new d.e("Configuration Name not found: " + str1); 
      throw new d.e("No working configuration and no config name requested");
    } 
    aH aH = r.ExceptionPrintstacktrace(str2);
    if (aH == null)
      throw new d.e("OutputChannel not found: " + str2); 
  }
  
  public ArrayListExtensionInDPackage e() {
    ArrayListExtensionInDPackage ArrayListExtensionInDPackage = new ArrayListExtensionInDPackage();
    DInterfaceIndia DInterfaceIndia = new DInterfaceIndia(a, null);
    R r = T.a().DComponentCharlie();
    if (r != null && (this.DComponentCharlie == null || !this.DComponentCharlie.equals(r.DComponentCharlie()))) {
      this.DComponentCharlie = r.DComponentCharlie();
      DInterfaceIndia.a(0);
      ArrayList<String> arrayList1 = new ArrayList();
      Iterator<aH> iterator = r.q();
      while (iterator.hasNext()) {
        aH aH = iterator.next();
        if (aH.s() && aH.w())
          arrayList1.add(aH.aL()); 
      } 
      Collections.sort(arrayList1);
      ArrayList<String> arrayList2 = new ArrayList();
      arrayList2.addAll(arrayList1);
      DInterfaceIndia.a(arrayList2);
      DInterfaceIndia.DComponentCharlie("Select the Accumulated OutputChannel to Rest the accumulated value.");
    } 
    ArrayListExtensionInDPackage.a(DInterfaceIndia);
    return ArrayListExtensionInDPackage;
  }
  
  public boolean f() {
    return true;
  }
  
  public boolean ExceptionPrintstacktrace() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/e/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */