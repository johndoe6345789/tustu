package G;

import java.io.Serializable;

public class SimpleStringValueProvider implements db, Serializable {
  String a = "";
  
  public SimpleStringValueProvider() {}
  
  public SimpleStringValueProvider(String paramString) {
    a(paramString);
  }
  
  public void a(String paramString) {
    this.a = paramString;
  }
  
  public String a() {
    return this.a;
  }
  
  public String[] b() {
    return null;
  }
  
  public String toString() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */