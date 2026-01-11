package G;

import V.ExceptionPrintstacktrace;
import bH.D;
import bH.R;
import bH.X;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SerializableImplExceptionprintstacktrace extends Q implements R, Serializable {
  private String i = null;
  
  private String j = null;
  
  private String k = null;
  
  private db l = null;
  
  private int m = 0;
  
  private int n = 0;
  
  dj a = null;
  
  public static String b = "yesNo";
  
  public static String c = "onOff";
  
  public static String d = "highLow";
  
  public static String e = "activeInactive";
  
  public static String f = "hex";
  
  public static String ExceptionPrintstacktrace = "bits";
  
  public static String h = "Numeric";
  
  private String o = h;
  
  private String p = "Off";
  
  private String q = "On";
  
  private String r = null;
  
  public void a(String paramString) {
    int i = paramString.indexOf('.');
    if (i == -1 && !paramString.equals(h)) {
      a(0);
      paramString = X.b(paramString, "\"", "");
      if (paramString.equals(b)) {
        this.n = 5;
        this.p = "No";
        this.q = "Yes";
        d("Yes/No");
      } else if (paramString.equals(c)) {
        this.n = 4;
        this.p = "Off";
        this.q = "On";
        d("On/Off");
      } else if (paramString.equals(d)) {
        this.n = 6;
        this.p = "Low";
        this.q = "High";
        d("High/Low");
      } else if (paramString.equals(e)) {
        this.p = "Inactive";
        this.q = "Active";
        this.n = 7;
        d("Act/Inact");
      } else if (paramString.equals(f)) {
        this.n = 1;
        d("");
      } 
      this.o = paramString;
      return;
    } 
    try {
      String str = paramString.substring(i + 1, i + 2);
      a(Integer.parseInt(str));
      this.o = h;
    } catch (Exception exception) {
      a(0);
      D.c("parseFormat error for DataLogField: " + b() + ", set as int");
    } 
  }
  
  public String a() {
    return this.i;
  }
  
  public void b(String paramString) {
    this.i = paramString;
  }
  
  public String b() {
    try {
      return (this.l != null) ? this.l.a() : aL();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.c("Failed to get DataLog Header name for entry of OutputChannel: " + this.i);
      return "Error";
    } 
  }
  
  public void c(String paramString) {
    this.l = new c(paramString);
  }
  
  public void a(db paramdb) {
    this.l = paramdb;
    try {
      v(paramdb.a());
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(ac.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
    } 
  }
  
  public String aL() {
    String str = super.aL();
    if (str == null || str.isEmpty())
      str = b(); 
    return str;
  }
  
  public int d() {
    return this.m;
  }
  
  public void a(int paramInt) {
    this.m = paramInt;
  }
  
  public int e() {
    return this.n;
  }
  
  public void b(int paramInt) {
    this.n = paramInt;
    switch (paramInt) {
      case 1:
        this.o = f;
        return;
      case 2:
        this.o = ExceptionPrintstacktrace;
        return;
      case 4:
        this.o = c;
        return;
      case 5:
        this.o = b;
        return;
      case 6:
        this.o = d;
        return;
      case 7:
        this.o = e;
        return;
    } 
    this.o = h;
  }
  
  public int f() {
    return (this.a == null) ? 0 : (int)Math.round(this.a.a());
  }
  
  public dj ExceptionPrintstacktrace() {
    return this.a;
  }
  
  public void a(dj paramdj) {
    this.a = paramdj;
  }
  
  public String h() {
    return this.p;
  }
  
  public String i() {
    return this.q;
  }
  
  public String j() {
    return this.r;
  }
  
  public void d(String paramString) {
    this.r = paramString;
  }
  
  public String c() {
    return b();
  }
  
  public String k() {
    return this.o;
  }
  
  public boolean l() {
    return (this.n != 0 && this.n != 1 && this.n != 2);
  }
  
  public String m() {
    return this.j;
  }
  
  public void e(String paramString) {
    this.j = paramString;
  }
  
  public String n() {
    return this.k;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */