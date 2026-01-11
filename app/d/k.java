package d;

import c.e;
import java.util.ArrayList;
import java.util.Properties;

public class k extends ArrayList {
  k a = null;
  
  private e b = null;
  
  private String c = null;
  
  public boolean a(i parami) {
    return super.add(parami);
  }
  
  public Properties a() {
    Properties properties = new Properties();
    for (i i : this) {
      if (i.c() != null && i.d() != null)
        properties.setProperty(i.c(), i.d()); 
    } 
    if (this.a != null) {
      Properties properties1 = this.a.a();
      properties.putAll(properties1);
    } 
    return properties;
  }
  
  public i a(String paramString) {
    for (i i : this) {
      if (i.c().equals(paramString))
        return i; 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/d/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */