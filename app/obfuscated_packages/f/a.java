package f;

import bH.D;
import bI.i;
import java.io.ByteArrayInputStream;
import java.util.Date;
import java.util.Properties;

public final class a {
  private String a = "";
  
  private String b = "";
  
  private String c = "";
  
  private String d = "";
  
  private String e = "";
  
  private String f = "";
  
  private int g = 2;
  
  private String h = "";
  
  private int i = 0;
  
  private int j = -1;
  
  private Date k = new Date(0L);
  
  private String l = null;
  
  public a() {}
  
  public a(String paramString) {
    a(paramString);
  }
  
  public void a(String paramString) {
    this.l = paramString;
    Properties properties = new Properties();
    try {
      byte[] arrayOfByte1 = bI.a.a(paramString, 0);
      byte[] arrayOfByte2 = i.b(arrayOfByte1);
      properties.load(new ByteArrayInputStream(arrayOfByte2));
    } catch (Exception exception) {
      throw new h("Invalid activation data.");
    } 
    b(properties.getProperty("mac", ""));
    c(properties.getProperty("hId", ""));
    d(properties.getProperty("mId", ""));
    j(properties.getProperty("dId", ""));
    e(properties.getProperty("rk", ""));
    f(properties.getProperty("em", ""));
    try {
      g(properties.getProperty("ec", ""));
    } catch (i i) {
      throw new h(i.getMessage());
    } 
    h(properties.getProperty("msg", ""));
    String str = properties.getProperty("sc", "0");
    k(str);
    a(Integer.parseInt(properties.getProperty("actCount", "1")));
    a(new Date(Long.parseLong(properties.getProperty("renewDate", "0"))));
  }
  
  public String a() {
    return this.a;
  }
  
  public void b(String paramString) {
    this.a = paramString;
  }
  
  public String b() {
    return this.b;
  }
  
  public void c(String paramString) {
    this.b = paramString;
  }
  
  public String c() {
    return this.c;
  }
  
  public void d(String paramString) {
    this.c = paramString;
  }
  
  public String d() {
    return this.e;
  }
  
  public void e(String paramString) {
    this.e = paramString;
  }
  
  public void f(String paramString) {
    this.f = paramString;
  }
  
  public int e() {
    return this.j;
  }
  
  public void a(int paramInt) {
    this.j = paramInt;
  }
  
  public int f() {
    return this.g;
  }
  
  public void g(String paramString) {
    try {
      int i = Integer.parseInt(paramString);
      b(i);
    } catch (Exception exception) {
      throw new i("Invalid Error Code: " + paramString);
    } 
  }
  
  public void b(int paramInt) {
    if (paramInt > 7)
      throw new i("Invalid Error Code: " + paramInt); 
    this.g = paramInt;
  }
  
  public String g() {
    return this.h;
  }
  
  public void h(String paramString) {
    this.h = paramString;
  }
  
  public Date h() {
    return this.k;
  }
  
  public void a(Date paramDate) {
    this.k = paramDate;
  }
  
  public String i() {
    return this.l;
  }
  
  public void i(String paramString) {
    this.l = paramString;
  }
  
  public String j() {
    return this.d;
  }
  
  public void j(String paramString) {
    this.d = paramString;
  }
  
  public void k(String paramString) {
    try {
      this.i = Integer.parseInt(paramString);
    } catch (Exception exception) {
      this.i = 0;
      D.a("Invalid Seat Count data: " + paramString);
    } 
  }
  
  public String toString() {
    return "mac = " + this.a + "\n" + "hId" + " = " + this.b + "\n" + "mId" + " = " + this.c + "\n" + "dId" + " = " + this.d + "\nrk = " + this.e + "\nem = " + this.f + "\nec = " + this.g + "\nmg = " + this.h + "\nsc = " + this.i + "\nac = " + this.j + "\nrd = " + this.k + "\n";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/f/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */