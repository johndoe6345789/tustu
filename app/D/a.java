package D;

import W.ak;
import bI.i;
import f.h;
import f.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Properties;

public class a {
  private String a;
  
  private String b;
  
  private String c = "U";
  
  private String d = "";
  
  private String e = "";
  
  private String f = "";
  
  private String g = "";
  
  private int h = 0;
  
  private long i = System.currentTimeMillis();
  
  private String j = null;
  
  public String a() {
    return this.a;
  }
  
  public void a(String paramString) {
    this.a = paramString;
  }
  
  public String b() {
    return this.b;
  }
  
  public void b(String paramString) {
    this.b = paramString;
  }
  
  public String c() {
    return this.c;
  }
  
  public void c(String paramString) {
    this.c = paramString;
  }
  
  public String d() {
    return this.d;
  }
  
  public void d(String paramString) {
    this.d = paramString;
  }
  
  public String e() {
    return this.e;
  }
  
  public void e(String paramString) {
    this.e = paramString;
  }
  
  public String f() {
    return this.f;
  }
  
  public void f(String paramString) {
    this.f = paramString;
  }
  
  public String g() {
    return this.g;
  }
  
  public void g(String paramString) {
    this.g = paramString;
  }
  
  public void h(String paramString) {
    Properties properties = new Properties();
    this.j = paramString;
    try {
      byte[] arrayOfByte1 = bI.a.a(paramString, 0);
      byte[] arrayOfByte2 = i.b(arrayOfByte1);
      properties.load(new ByteArrayInputStream(arrayOfByte2));
    } catch (Exception exception) {
      throw new h("Invalid activation data.");
    } 
    c(properties.getProperty("s", ""));
    a(properties.getProperty("DT", ""));
    b(properties.getProperty("SN", ""));
    e(properties.getProperty("f", ""));
    f(properties.getProperty("l", ""));
    d(properties.getProperty("e", ""));
    g(properties.getProperty("p", ""));
    try {
      j(properties.getProperty("r", ""));
    } catch (i i) {
      throw new h(i.getMessage());
    } 
  }
  
  public String i(String paramString) {
    Properties properties = new Properties();
    properties.setProperty("s", c());
    properties.setProperty("DT", k(a()));
    properties.setProperty("SN", k(b()));
    properties.setProperty("f", k(e()));
    properties.setProperty("l", k(f()));
    properties.setProperty("e", k(d()));
    properties.setProperty("p", k(g()));
    properties.setProperty("a", paramString);
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    properties.store(byteArrayOutputStream, "");
    byte[] arrayOfByte = i.a(byteArrayOutputStream.toByteArray());
    return bI.a.a(arrayOfByte, 16);
  }
  
  public byte[] h() {
    Properties properties = new Properties();
    properties.setProperty("s", c());
    properties.setProperty("DT", k(a()));
    properties.setProperty("SN", k(b()));
    properties.setProperty("f", k(e()));
    properties.setProperty("l", k(f()));
    properties.setProperty("e", k(d()));
    properties.setProperty("p", k(g()));
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    properties.store(byteArrayOutputStream, "");
    ak ak = new ak();
    return ak.a(byteArrayOutputStream.toByteArray(), "");
  }
  
  public void a(byte[] paramArrayOfbyte) {
    Properties properties = new Properties();
    try {
      ak ak = new ak();
      byte[] arrayOfByte = ak.b(paramArrayOfbyte, "");
      properties.load(new ByteArrayInputStream(arrayOfByte));
    } catch (Exception exception) {
      throw new h("Invalid activation data.");
    } 
    c(properties.getProperty("s", ""));
    a(properties.getProperty("DT", ""));
    b(properties.getProperty("SN", ""));
    e(properties.getProperty("f", ""));
    f(properties.getProperty("l", ""));
    d(properties.getProperty("e", ""));
    g(properties.getProperty("p", ""));
    try {
      j(properties.getProperty("r", "32768"));
    } catch (i i) {
      throw new h(i.getMessage());
    } 
  }
  
  private String k(String paramString) {
    return (paramString == null) ? "" : paramString;
  }
  
  public int i() {
    return this.h;
  }
  
  public void j(String paramString) {
    try {
      int i = Integer.parseInt(paramString);
      a(i);
    } catch (Exception exception) {
      throw new i("Invalid Error Code: " + paramString);
    } 
  }
  
  public void a(int paramInt) {
    this.h = paramInt;
  }
  
  public long j() {
    return this.i;
  }
  
  public void a(long paramLong) {
    this.i = paramLong;
  }
  
  public String k() {
    return this.j;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/D/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */