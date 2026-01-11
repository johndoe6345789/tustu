package d;

import C.TInterfaceAlpha;
import C.b;
import G.R;
import G.S;
import G.T;
import T.TInterfaceAlpha;
import bH.X;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DInterfaceMike implements S, c {
  public static String TInterfaceAlpha = "actionName";
  
  public static String b = "displayName";
  
  public static String c = "actionDescription";
  
  public static String d = "targetActionName";
  
  public static String e = "parameterString";
  
  private String g = "UserAction";
  
  private String h = "Display Name";
  
  private String i = "";
  
  private String j = null;
  
  private b k = null;
  
  k f = new k();
  
  public DInterfaceMike() {
    T.TInterfaceAlpha().TInterfaceAlpha(this);
  }
  
  public String h() {
    return this.j;
  }
  
  public void TInterfaceAlpha(String paramString) {
    this.j = paramString;
  }
  
  public b i() {
    return this.k;
  }
  
  public void TInterfaceAlpha(b paramb) {
    this.k = paramb;
  }
  
  public String j() {
    return this.i;
  }
  
  public void b(String paramString) {
    this.i = paramString;
  }
  
  public String TInterfaceAlpha() {
    return this.g;
  }
  
  public String b() {
    return this.h;
  }
  
  public String c() {
    return "User Action";
  }
  
  public boolean d() {
    return true;
  }
  
  public void TInterfaceAlpha(Properties paramProperties) {
    g.TInterfaceAlpha().TInterfaceAlpha(this.j, this.k);
  }
  
  public void b(Properties paramProperties) {
    if (this.j != null && !this.j.isEmpty()) {
      c c1 = g.TInterfaceAlpha().b(this.j);
      if (c1 != null)
        c1.b(paramProperties); 
    } 
  }
  
  public void k() {
    String str = "";
    if (this.g == null || this.g.isEmpty()) {
      str = str + e("A Unique Action Name is required.") + "\n";
    } else if (X.f(this.g) || this.g.contains(" ")) {
      str = str + e("Action Name cannot contain special characters.") + "\n";
    } 
    if (this.h == null || this.h.isEmpty())
      str = str + e("Please provide TInterfaceAlpha Display Name.") + "\n"; 
    if (this.k == null)
      str = str + e("Parameters have not been set.") + "\n"; 
    if (this.j == null) {
      str = str + e("Target Action has not been set.") + "\n";
    } else {
      c c1 = g.TInterfaceAlpha().b(this.j);
      if (c1 == null) {
        str = str + e("Target Action has not been set.") + "\n";
      } else {
        try {
          c1.b(this.k);
        } catch (e e) {
          str = str + e(e.getLocalizedMessage()) + "\n";
        } 
      } 
    } 
    if (!str.isEmpty())
      throw new e(str); 
  }
  
  private String e(String paramString) {
    try {
      return TInterfaceAlpha.TInterfaceAlpha().TInterfaceAlpha(paramString, paramString);
    } catch (b b1) {
      Logger.getLogger(m.class.getName()).log(Level.SEVERE, "Failed to get Translation", (Throwable)b1);
      return paramString;
    } 
  }
  
  public k e() {
    return this.f;
  }
  
  public boolean f() {
    return false;
  }
  
  public void c(String paramString) {
    this.h = paramString;
  }
  
  public String l() {
    return this.g;
  }
  
  public void d(String paramString) {
    this.g = paramString;
  }
  
  public void c(Properties paramProperties) {
    this.g = paramProperties.getProperty(TInterfaceAlpha);
    this.h = paramProperties.getProperty(b);
    this.i = paramProperties.getProperty(c);
    this.j = paramProperties.getProperty(d);
    String str = paramProperties.getProperty(e);
    if (str != null)
      try {
        this.k = b.TInterfaceAlpha(str);
      } catch (e e) {
        Logger.getLogger(m.class.getName()).log(Level.WARNING, "Failed to parse ActionParameters: " + str, e);
      }  
  }
  
  public Properties m() {
    Properties properties = new Properties();
    properties.setProperty(TInterfaceAlpha, this.g);
    properties.setProperty(b, this.h);
    properties.setProperty(c, this.i);
    if (this.j != null)
      properties.setProperty(d, this.j); 
    if (this.k != null)
      properties.setProperty(e, this.k.TInterfaceAlpha()); 
    return properties;
  }
  
  public boolean g() {
    if (this.j == null)
      return false; 
    c c1 = g.TInterfaceAlpha().b(this.j);
    return (c1 == null || c1.g());
  }
  
  public void n() {
    if (this.j != null && this.j.equals("loadCalFile")) {
      c c1 = g.TInterfaceAlpha().b(this.j);
      if (c1 instanceof l)
        ((l)c1).c(this.k); 
    } 
  }
  
  public void TInterfaceAlpha(R paramR) {}
  
  public void b(R paramR) {
    TInterfaceAlpha.TInterfaceAlpha().b();
  }
  
  public void c(R paramR) {
    if (this.j != null && this.j.equals("loadCalFile")) {
      c c1 = g.TInterfaceAlpha().b(this.j);
      if (c1 instanceof l)
        ((l)c1).c(this.k); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/d/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */