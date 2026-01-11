package Z;

import java.util.HashMap;
import java.util.List;

public class ZInterfaceBravo {
  private static b c = null;
  
  final HashMap a = new HashMap<>();
  
  final HashMap b = new HashMap<>();
  
  private c d = null;
  
  public static b a() {
    if (c == null)
      c = new b(); 
    return c;
  }
  
  public void b() {
    this.a.clear();
    this.b.clear();
    List list = this.d.a();
    for (e e : list)
      this.a.put(e.a(), e); 
  }
  
  public String a(String paramString) {
    if (this.b.isEmpty() && !this.a.isEmpty())
      for (String str : this.a.keySet()) {
        List list = ((e)this.a.get(str)).b();
        for (String str1 : list)
          this.b.put(str1, str); 
      }  
    return (String)this.b.get(paramString);
  }
  
  public String b(String paramString) {
    String str = a(paramString);
    return (str != null) ? str : paramString;
  }
  
  public c c() {
    return this.d;
  }
  
  public void a(c paramc) {
    this.d = paramc;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/Z/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */