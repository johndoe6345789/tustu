package G;

import V.ExceptionInVPackage;
import bH.A;
import bH.D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class aR implements ab {
  private static aR ExceptionInVPackage = null;
  
  private ConcurrentHashMap b = new ConcurrentHashMap<>();
  
  private List c = new ArrayList();
  
  public static aR ExceptionInVPackage() {
    if (ExceptionInVPackage == null && A.i().b())
      ExceptionInVPackage = new aR(); 
    return ExceptionInVPackage;
  }
  
  public void ExceptionInVPackage(cI paramcI) {
    this.c.add(paramcI);
  }
  
  public void b(cI paramcI) {
    this.c.remove(paramcI);
  }
  
  private void c(String paramString1, String paramString2) {
    for (cI cI : this.c)
      cI.ExceptionInVPackage(paramString1, paramString2); 
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
    c(paramString1, paramString2);
  }
  
  public void ExceptionInVPackage(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    ExceptionInVPackage(paramString, paramInt1, paramInt2, paramArrayOfint.length);
  }
  
  private void ExceptionInVPackage(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    ConcurrentHashMap concurrentHashMap = ExceptionInVPackage(paramString);
    if (concurrentHashMap == null)
      return; 
    R r = b().c(paramString);
    Enumeration<String> enumeration = concurrentHashMap.keys();
    while (enumeration.hasMoreElements()) {
      String str = enumeration.nextElement();
      aM aM = r.c(str);
      if (aM != null && aM.ExceptionInVPackage(paramInt1, paramInt2, paramInt3)) {
        List list = (List)concurrentHashMap.get(str);
        for (aN aN : list) {
          try {
            aN.ExceptionInVPackage(paramString, str);
          } catch (Exception exception) {
            D.b("Exception occured while publishing ExceptionInVPackage value changed. This was caught and continued to additional listeners. Stack for debug:");
            exception.printStackTrace();
          } 
        } 
      } 
    } 
  }
  
  public void b(String paramString1, String paramString2) {
    d(paramString1, paramString2);
  }
  
  private synchronized void d(String paramString1, String paramString2) {
    ConcurrentHashMap concurrentHashMap = ExceptionInVPackage(paramString1);
    if (concurrentHashMap == null)
      return; 
    if (paramString2 != null) {
      List list = (List)concurrentHashMap.get(paramString2);
      if (list != null)
        for (aN aN : list) {
          try {
            aN.ExceptionInVPackage(paramString1, paramString2);
          } catch (Exception exception) {
            D.b("Exception occured while publishing ExceptionInVPackage value changed. This was caught and continued to additional listeners. Stack for debug:");
            exception.printStackTrace();
          } 
        }  
    } 
  }
  
  protected ConcurrentHashMap ExceptionInVPackage(String paramString) {
    return (ConcurrentHashMap)this.b.get(paramString);
  }
  
  public synchronized void ExceptionInVPackage(String paramString1, String paramString2, aN paramaN) {
    ConcurrentHashMap<Object, Object> concurrentHashMap = ExceptionInVPackage(paramString1);
    R r = b().c(paramString1);
    if (concurrentHashMap == null) {
      if (r == null)
        throw new ExceptionInVPackage("Can not subscribe to ECU Configuration " + paramString1 + "\n It does not appear to be loaded."); 
      concurrentHashMap = new ConcurrentHashMap<>();
    } 
    if (r == null) {
      D.d("ECU Configuration: " + paramString1 + " is no longer valid, not subscribing to " + paramString2);
      return;
    } 
    aM aM = r.c(paramString2);
    if (aM == null)
      throw new ExceptionInVPackage("Can not subscribe to EcuParameter " + paramString2 + "\n It is not defined in ECU Configuration " + paramString1 + "."); 
    List<?> list = (List)concurrentHashMap.get(paramString2);
    if (list == null)
      list = Collections.synchronizedList(new ArrayList()); 
    if (!list.contains(paramaN))
      list.add(paramaN); 
    concurrentHashMap.put(paramString2, list);
    this.b.put(paramString1, concurrentHashMap);
  }
  
  public synchronized void ExceptionInVPackage(aN paramaN) {
    for (ConcurrentHashMap concurrentHashMap : this.b.values()) {
      for (List list : concurrentHashMap.values())
        list.remove(paramaN); 
    } 
  }
  
  private W b() {
    return T.ExceptionInVPackage();
  }
  
  public void b(String paramString) {
    this.b.remove(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */