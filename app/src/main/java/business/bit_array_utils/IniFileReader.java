package business.bit_array_utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class F implements Serializable {
  ArrayList a = new ArrayList();
  
  static HashMap b = new HashMap<>();
  
  public static String c = (new File(".")).getAbsolutePath() + "/inc/";
  
  private File d = null;
  
  public void a(String paramString1, String paramString2) {
    File file = new File((new File(paramString1)).getAbsolutePath() + "/" + paramString2);
    if (!file.exists())
      file = new File((new File(paramString1)).getAbsolutePath() + "/inc/" + paramString2); 
    if (!file.exists())
      file = new File(c, paramString2); 
    if (!file.exists())
      file = new File((new File(paramString1)).getAbsolutePath() + "/projectCfg/" + paramString2); 
    this.d = file;
    FileInputStream fileInputStream = new FileInputStream(file);
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
    String str = "";
    byte b = 0;
    while ((str = bufferedReader.readLine()) != null) {
      if (str.indexOf(";") != -1)
        str = str.substring(0, str.indexOf(";")); 
      str = str.trim();
      if (str.indexOf("#") != 0 && str.indexOf("'") != 0 && str.length() > 0 && str.indexOf(":") == -1) {
        if (!str.startsWith("D")) {
          String str2 = null;
          String str3 = null;
          int i = str.indexOf("\t");
          str2 = str.substring(0, i);
          str3 = str.substring(i + 1, str.length());
          E e1 = new E();
          e1.a(Double.parseDouble(str2));
          e1.b(Double.parseDouble(str3));
          this.a.add(e1);
          continue;
        } 
        String str1 = str.substring(str.indexOf("D") + 2).trim();
        E e = new E();
        e.a(b++);
        if (str1.indexOf("T") != -1) {
          str1 = X.b(str1, "T", "");
          e.b(Double.parseDouble(str1));
        } else {
          e.b(Double.parseDouble(str1));
        } 
        this.a.add(e);
      } 
    } 
  }
  
  public boolean a() {
    return !this.a.isEmpty();
  }
  
  public double a(double paramDouble) {
    for (byte b = 1; b < this.a.size(); b++) {
      E e = this.a.get(b);
      if (paramDouble < e.a()) {
        E e1 = this.a.get(b - 1);
        return e1.b() + (paramDouble - e1.a()) / (e.a() - e1.a()) * (e.b() - e1.b());
      } 
    } 
    return ((E)this.a.get(this.a.size() - 1)).b();
  }
  
  public double b(double paramDouble) {
    boolean bool = (((E)this.a.get(0)).b() > ((E)this.a.get(this.a.size() - 1)).b()) ? true : false;
    for (byte b = 1; b < this.a.size(); b++) {
      E e = this.a.get(b);
      if ((!bool && paramDouble < e.b()) || paramDouble > e.b()) {
        E e1 = this.a.get(b - 1);
        return e1.a() + (paramDouble - e1.b()) / (e.b() - e1.b()) * (e.a() - e1.a());
      } 
    } 
    return ((E)this.a.get(this.a.size() - 1)).a();
  }
  
  public int b() {
    return this.a.size();
  }
  
  public String a(String paramString) {
    if (paramString == null || paramString.length() == 0)
      paramString = "0.0"; 
    double d = Double.parseDouble(paramString);
    String str = a(d) + "";
    int i = str.indexOf('.');
    if (i != -1 && str.length() - i > 4)
      str = str.substring(0, i + 3); 
    return str;
  }
  
  public static void c() {
    b.clear();
  }
  
  private static String c(String paramString1, String paramString2) {
    return paramString1 + "_" + paramString2;
  }
  
  public static F b(String paramString1, String paramString2) {
    F f = (F)b.get(c(paramString1, paramString2));
    if (f != null)
      return f; 
    f = new F();
    f.a(paramString1, paramString2);
    b.put(c(paramString1, paramString2), f);
    return f;
  }
  
  protected static String b(String paramString) {
    boolean bool = false;
    if (paramString.indexOf("+") != -1 || paramString.indexOf("-") != -1) {
      boolean bool1 = (paramString.indexOf("+") != -1) ? true : false;
      int i = bool1 ? paramString.indexOf("+") : paramString.indexOf("-");
      String str = paramString.substring(i, paramString.length());
      paramString = X.b(paramString, paramString.substring(i, paramString.length()), "");
    } 
    return paramString;
  }
  
  public File d() {
    return this.d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */