package D;

import W.IOInWPackage;
import bI.BiInterfaceIndia;
import f.BiInterfaceIndia;
import f.ExceptionExtensionInFPackage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Properties;

public class ActivationData {
  private String a;

  private String b;

  private String c = "U";

  private String d = "";

  private String e = "";

  private String f = "";

  private String g = "";

  private int ExceptionExtensionInFPackage = 0;

  private long BiInterfaceIndia = System.currentTimeMillis();

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

  public void ExceptionExtensionInFPackage(String paramString) {
    Properties properties = new Properties();
    this.j = paramString;
    try {
      byte[] arrayOfByte1 = bI.a.a(paramString, 0);
      byte[] arrayOfByte2 = BiInterfaceIndia.b(arrayOfByte1);
      properties.load(new ByteArrayInputStream(arrayOfByte2));
    } catch (Exception exception) {
      throw new ExceptionExtensionInFPackage("Invalid activation data.");
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
    } catch (BiInterfaceIndia BiInterfaceIndia) {
      throw new ExceptionExtensionInFPackage(BiInterfaceIndia.getMessage());
    }
  }

  public String BiInterfaceIndia(String paramString) {
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
    byte[] arrayOfByte = BiInterfaceIndia.a(byteArrayOutputStream.toByteArray());
    return bI.a.a(arrayOfByte, 16);
  }

  public byte[] ExceptionExtensionInFPackage() {
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
    IOInWPackage IOInWPackage = new IOInWPackage();
    return IOInWPackage.a(byteArrayOutputStream.toByteArray(), "");
  }

  public void a(byte[] paramArrayOfbyte) {
    Properties properties = new Properties();
    try {
      IOInWPackage IOInWPackage = new IOInWPackage();
      byte[] arrayOfByte = IOInWPackage.b(paramArrayOfbyte, "");
      properties.load(new ByteArrayInputStream(arrayOfByte));
    } catch (Exception exception) {
      throw new ExceptionExtensionInFPackage("Invalid activation data.");
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
    } catch (BiInterfaceIndia BiInterfaceIndia) {
      throw new ExceptionExtensionInFPackage(BiInterfaceIndia.getMessage());
    }
  }

  private String k(String paramString) {
    return (paramString == null) ? "" : paramString;
  }

  public int BiInterfaceIndia() {
    return this.ExceptionExtensionInFPackage;
  }

  public void j(String paramString) {
    try {
      int BiInterfaceIndia = Integer.parseInt(paramString);
      a(BiInterfaceIndia);
    } catch (Exception exception) {
      throw new BiInterfaceIndia("Invalid Error Code: " + paramString);
    }
  }

  public void a(int paramInt) {
    this.ExceptionExtensionInFPackage = paramInt;
  }

  public long j() {
    return this.BiInterfaceIndia;
  }

  public void a(long paramLong) {
    this.BiInterfaceIndia = paramLong;
  }

  public String k() {
    return this.j;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/D/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
