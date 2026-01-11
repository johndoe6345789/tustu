package W;

import bH.X;

public class TranslationEntry {
  private String a = null;
  
  private String b = null;
  
  private String c = null;
  
  public void a(String paramString) {
    this.a = paramString;
    try {
      b(paramString);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new S("Unable to parse row. \n" + paramString);
    } 
  }
  
  public String a() {
    return this.b;
  }
  
  public String b() {
    return this.c;
  }
  
  private void b(String paramString) {
    String[] arrayOfString = X.j(paramString);
    if (arrayOfString.length > 0) {
      String str = arrayOfString[0].trim();
      this.b = c(str);
    } 
    if (arrayOfString.length > 1) {
      String str = arrayOfString[1].trim();
      if (str.length() > 1)
        this.c = c(str); 
    } 
  }
  
  private String c(String paramString) {
    if (paramString.charAt(0) == '"')
      paramString = paramString.substring(1); 
    if (paramString.endsWith("\""))
      paramString = paramString.substring(0, paramString.length() - 1); 
    return paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */