package W;

import java.util.ArrayList;

public class IniSection extends ArrayList {
  private String a = null;
  
  public String a() {
    return this.a;
  }
  
  public void a(String paramString) {
    this.a = paramString;
  }
  
  public M b(String paramString) {
    for (int i = size() - 1; i >= 0; i--) {
      M m = (M)get(i);
      if (m.f().equals(paramString))
        return m; 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/N.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */