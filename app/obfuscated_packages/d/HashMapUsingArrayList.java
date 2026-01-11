package d;

import EInterfaceEcho.EInterfaceEcho;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class HashMapUsingArrayList {
  private static g a = null;
  
  private HashMap b = new HashMap<>();
  
  private ArrayList c = new ArrayList();
  
  private HashMapUsingArrayList() {
    EInterfaceEcho EInterfaceEcho = new EInterfaceEcho();
    this.b.put(EInterfaceEcho.a(), EInterfaceEcho);
  }
  
  public static g a() {
    if (a == null)
      a = new g(); 
    return a;
  }
  
  public void a(String paramString, c paramc) {
    this.b.put(paramString, paramc);
  }
  
  public void a(String paramString) {
    this.b.remove(paramString);
  }
  
  public List a(a parama) {
    ArrayList<c> arrayList = new ArrayList();
    for (c c : this.b.values()) {
      if (parama == null || parama.a(c))
        arrayList.add(c); 
    } 
    for (f f : this.c)
      arrayList.addAll(f.a(parama)); 
    return arrayList;
  }
  
  public void a(f paramf) {
    this.c.add(paramf);
  }
  
  public void a(String paramString, Properties paramProperties) {
    c c = b(paramString);
    if (c == null)
      throw new EInterfaceEcho("No Action found for action name: " + paramString); 
    try {
      c.a(paramProperties);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new EInterfaceEcho("An Exception occurred action name: " + paramString + "\n" + exception.getMessage());
    } catch (Error error) {
      error.printStackTrace();
      a(paramString);
      throw new EInterfaceEcho("An Error occurred action name: " + paramString + ", Action removed.\n" + error.getMessage());
    } 
  }
  
  public c b(String paramString) {
    c c = (c)this.b.get(paramString);
    if (c == null) {
      Iterator<f> iterator = this.c.iterator();
      while (iterator.hasNext()) {
        c = ((f)iterator.next()).a(paramString);
        if (c != null)
          return c; 
      } 
    } 
    return c;
  }
  
  public void c(String paramString) {
    String str1 = paramString.substring(paramString.indexOf(":") + 1);
    String str2 = "";
    if (str1.contains("?")) {
      str2 = str1.contains("?") ? paramString.substring(paramString.indexOf("?") + 1) : "";
      str1 = str1.substring(0, str1.indexOf("?"));
    } 
    b b = b.a(str2);
    a(str1, b);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/d/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */