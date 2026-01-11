package B;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DiscoveredDevice {
  private String a = "";
  
  private String b = "";
  
  private String c = "";
  
  private String d = "";
  
  private String e = "";
  
  private String f = "";
  
  private String g = "";
  
  private String h = "";
  
  private String i = null;
  
  private int j = -1;
  
  private int k = -1;
  
  private boolean l = false;
  
  private final List m = new ArrayList();
  
  public Properties a() {
    Properties properties = new Properties();
    properties.setProperty("slaveType", this.a);
    properties.setProperty("id", this.b);
    properties.setProperty("host", this.c);
    properties.setProperty("protocol", this.e);
    properties.setProperty("serialNumber", this.f);
    properties.setProperty("info", this.g);
    properties.setProperty("projectName", this.h);
    properties.setProperty("canId", this.k + "");
    if (this.i != null)
      properties.setProperty("projectUUID", this.i); 
    for (byte b = 0; b < this.m.size(); b++) {
      DiscoveredDevice i1 = this.m.get(b);
      String str = "CAN_DEVICE_" + b + "_";
      properties.setProperty(str + "slaveType", i1.i());
      properties.setProperty(str + "id", i1.b());
      properties.setProperty(str + "host", i1.c());
      properties.setProperty(str + "protocol", i1.d());
      properties.setProperty(str + "serialNumber", i1.e());
      properties.setProperty(str + "info", i1.f());
      properties.setProperty(str + "projectName", i1.j());
      properties.setProperty(str + "canId", i1.l() + "");
    } 
    return properties;
  }
  
  public static DiscoveredDevice a(Properties paramProperties) {
    DiscoveredDevice i1 = new DiscoveredDevice();
    i1.f(paramProperties.getProperty("slaveType", ""));
    i1.a(paramProperties.getProperty("id", ""));
    i1.b(paramProperties.getProperty("host", ""));
    i1.c(paramProperties.getProperty("protocol", ""));
    i1.d(paramProperties.getProperty("serialNumber", ""));
    i1.e(paramProperties.getProperty("info", ""));
    i1.g(paramProperties.getProperty("projectName", ""));
    String str1 = paramProperties.getProperty("canId", "");
    if (!str1.isEmpty())
      try {
        i1.b(Integer.parseInt(str1));
      } catch (Exception exception) {} 
    byte b = 0;
    for (String str2 = "CAN_DEVICE_" + b + "_"; paramProperties.get(str2 + "projectName") != null; str2 = "CAN_DEVICE_" + ++b + "_") {
      DiscoveredDevice i2 = new DiscoveredDevice();
      i2.f(paramProperties.getProperty(str2 + "slaveType"));
      i2.a(paramProperties.getProperty(str2 + "id"));
      i2.b(paramProperties.getProperty(str2 + "host"));
      i2.c(paramProperties.getProperty(str2 + "protocol"));
      i2.d(paramProperties.getProperty(str2 + "serialNumber"));
      i2.e(paramProperties.getProperty(str2 + "info"));
      i2.g(paramProperties.getProperty(str2 + "projectName"));
      paramProperties.setProperty(str2 + "canId", i2.l() + "");
      try {
        i2.b(Integer.parseInt(paramProperties.getProperty(str2 + "canId")));
      } catch (Exception exception) {}
    } 
    return i1;
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
    return this.e;
  }
  
  public void c(String paramString) {
    this.e = paramString;
  }
  
  public String e() {
    return this.f;
  }
  
  public void d(String paramString) {
    this.f = paramString;
  }
  
  public String f() {
    return this.g;
  }
  
  public void e(String paramString) {
    this.g = paramString;
  }
  
  public int g() {
    return this.j;
  }
  
  public void a(int paramInt) {
    this.j = paramInt;
  }
  
  public boolean h() {
    return this.l;
  }
  
  public void a(boolean paramBoolean) {
    this.l = paramBoolean;
  }
  
  public String i() {
    return this.a;
  }
  
  public void f(String paramString) {
    this.a = paramString;
  }
  
  public String j() {
    return this.h;
  }
  
  public void g(String paramString) {
    this.h = paramString;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof DiscoveredDevice) {
      DiscoveredDevice i1 = (DiscoveredDevice)paramObject;
      return (a(this.a, i1.i()) && a(this.b, i1.b()) && a(this.c, i1.c()) && a(this.e, i1.d()) && a(this.f, i1.e()) && a(this.g, i1.f()) && a(this.h, i1.j()) && this.j == i1.g() && this.l == i1.h());
    } 
    return super.equals(paramObject);
  }
  
  private boolean a(String paramString1, String paramString2) {
    return ((((paramString1 == null) ? 1 : 0) ^ ((paramString2 == null) ? 1 : 0)) != 0) ? false : ((paramString1 != null) ? paramString1.equals(paramString2) : true);
  }
  
  public String k() {
    return this.d;
  }
  
  public void h(String paramString) {
    this.d = paramString;
  }
  
  public int l() {
    return this.k;
  }
  
  public void b(int paramInt) {
    this.k = paramInt;
  }
  
  public List m() {
    return this.m;
  }
  
  public void a(DiscoveredDevice parami) {
    this.m.add(parami);
  }
  
  public String n() {
    return this.i;
  }
  
  public void i(String paramString) {
    this.i = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/B/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */