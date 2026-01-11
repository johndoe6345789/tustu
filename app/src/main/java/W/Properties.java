package W;

import java.util.Properties;

public class Properties implements ap {
  private Properties a;
  
  private String b;
  
  public Properties(Properties paramProperties, String paramString) {
    this.a = paramProperties;
    if (paramString != null) {
      this.b = paramString;
    } else {
      this.b = "";
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    paramString1 = this.b + paramString1;
    this.a.setProperty(paramString1, paramString2);
  }
  
  public String b(String paramString1, String paramString2) {
    paramString1 = this.b + paramString1;
    return this.a.getProperty(paramString1, paramString2);
  }
  
  public Properties a() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/ar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */