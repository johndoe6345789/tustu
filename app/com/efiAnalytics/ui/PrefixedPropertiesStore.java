package com.efiAnalytics.ui;

import java.util.Properties;

public class PrefixedPropertiesStore implements et {
  Properties a = null;
  
  private String b;
  
  public PrefixedPropertiesStore(Properties paramProperties, String paramString) {
    this.a = paramProperties;
    this.b = paramString;
  }
  
  public void a(String paramString1, String paramString2) {
    if (paramString2 == null)
      paramString2 = ""; 
    if (this.b != null && !this.b.isEmpty()) {
      this.a.setProperty(this.b + "_" + paramString1, paramString2);
    } else {
      this.a.setProperty(paramString1, paramString2);
    } 
  }
  
  public String a(String paramString) {
    return (this.b != null && !this.b.isEmpty()) ? this.a.getProperty(this.b + "_" + paramString) : this.a.getProperty(paramString);
  }
  
  public String b(String paramString1, String paramString2) {
    String str = this.a.getProperty(this.b + "_" + paramString1);
    return (str == null || str.equals("")) ? paramString2 : str;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */