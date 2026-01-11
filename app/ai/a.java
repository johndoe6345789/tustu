package ai;

import java.util.HashMap;

public class a {
  private static a a = null;
  
  private HashMap b = new HashMap<>();
  
  private HashMap c = new HashMap<>();
  
  public static a a() {
    if (a == null)
      a = new a(); 
    return a;
  }
  
  public void a(String paramString, c paramc) {
    this.b.put(paramString, paramc);
  }
  
  public void a(String paramString, e parame) {
    this.c.put(paramString, parame);
  }
  
  public e a(String paramString) {
    return (e)this.c.get(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ai/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */