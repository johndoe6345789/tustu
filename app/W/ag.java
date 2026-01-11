package W;

import java.io.File;

public class ag {
  private File a = null;
  
  private String b = "";
  
  private String c = "";
  
  private String d = "";
  
  private String e = "";
  
  public File a() {
    return this.a;
  }
  
  public void a(File paramFile) {
    this.a = paramFile;
  }
  
  public String b() {
    return this.b;
  }
  
  public void a(String paramString) {
    this.b = paramString;
  }
  
  public String c() {
    return this.c;
  }
  
  public void b(String paramString) {
    this.c = paramString;
  }
  
  public String d() {
    return this.d;
  }
  
  public void c(String paramString) {
    this.d = paramString;
  }
  
  public String e() {
    return this.e;
  }
  
  public String d(String paramString) {
    String str = (a() != null) ? a().getName() : "";
    return str.toLowerCase().endsWith("." + paramString) ? str.substring(0, str.length() - 4) : str;
  }
  
  public void e(String paramString) {
    this.e = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/ag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */