package F;

import E.InetAddress;
import E.EInterfaceHotel;
import E.NetworkInEPackage;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class LoggerInFPackage implements EInterfaceHotel {
  private static Logger a = Logger.getLogger(b.class.getName());
  
  private Map b = new HashMap<>();
  
  private boolean c = false;
  
  private String d;
  
  private String e;
  
  private String f;
  
  private String InetAddress;
  
  private int EInterfaceHotel;
  
  private String i;
  
  public String e() {
    return this.d;
  }
  
  public void InetAddress(String paramString) {
    this.d = paramString;
  }
  
  public void EInterfaceHotel(String paramString) {
    this.e = paramString;
  }
  
  public String a() {
    return this.f;
  }
  
  public void i(String paramString) {
    this.f = paramString;
  }
  
  public String b() {
    return this.InetAddress;
  }
  
  public void NetworkInEPackage(String paramString) {
    this.InetAddress = paramString;
  }
  
  public int c() {
    return this.EInterfaceHotel;
  }
  
  public void a(int paramInt) {
    this.EInterfaceHotel = paramInt;
  }
  
  public String d() {
    return this.i;
  }
  
  public void k(String paramString) {
    this.i = paramString;
  }
  
  public Map f() {
    if (!this.c) {
      InetAddress();
      this.c = true;
      a.info("Initialize IP Range.");
    } 
    return this.b;
  }
  
  private void InetAddress() {
    String[] arrayOfString = NetworkInEPackage.a(this.d, this.e);
    for (String str : arrayOfString)
      this.b.put(str, new c(this)); 
  }
  
  public boolean e(String paramString) {
    boolean bool = false;
    synchronized (this) {
      for (c c : f().values()) {
        if (c.d().equals(paramString) && c.c()) {
          bool = true;
          break;
        } 
      } 
    } 
    return bool;
  }
  
  public InetAddress b(String paramString) {
    c c = null;
    String str = null;
    synchronized (this) {
      for (Map.Entry entry : f().entrySet()) {
        if (((c)entry.getValue()).d().equals(paramString) && ((c)entry.getValue()).c()) {
          c = (c)entry.getValue();
          str = (String)entry.getKey();
          break;
        } 
      } 
    } 
    if (c != null) {
      c.a(d.c);
      c.a(System.currentTimeMillis());
      return f(str);
    } 
    return null;
  }
  
  public InetAddress a(String paramString) {
    c c = null;
    String str = null;
    EInterfaceHotel();
    synchronized (this) {
      for (Map.Entry entry : f().entrySet()) {
        if (((c)entry.getValue()).d().equals(paramString)) {
          c = (c)entry.getValue();
          c.a(d.b);
          str = (String)entry.getKey();
        } 
      } 
      if (str == null)
        for (Map.Entry entry : f().entrySet()) {
          if (((c)entry.getValue()).b()) {
            c = (c)entry.getValue();
            str = (String)entry.getKey();
            c.a(d.b);
            c.a(paramString);
            break;
          } 
        }  
    } 
    return (str != null) ? f(str) : null;
  }
  
  public void c(String paramString) {
    synchronized (this) {
      for (Map.Entry entry : f().entrySet()) {
        if (((c)entry.getValue()).d().equals(paramString)) {
          ((c)entry.getValue()).a(d.a);
          break;
        } 
      } 
    } 
  }
  
  public boolean d(String paramString) {
    c c = null;
    synchronized (this) {
      c = (c)f().get(paramString);
      if (c != null) {
        c.a(d.c);
        c.a(System.currentTimeMillis());
        return true;
      } 
    } 
    return false;
  }
  
  private void EInterfaceHotel() {
    long l = System.currentTimeMillis();
    synchronized (this) {
      for (c c : f().values()) {
        if (c.a()) {
          long l1 = c.e();
          if (l - l1 > (this.EInterfaceHotel * 1000)) {
            c.a("");
            c.a(d.a);
          } 
        } 
      } 
    } 
  }
  
  private InetAddress f(String paramString) {
    InetAddress InetAddress = new InetAddress();
    InetAddress.d(this.i);
    InetAddress.c(this.InetAddress);
    InetAddress.a(paramString);
    InetAddress.b(this.f);
    InetAddress.a(this.EInterfaceHotel);
    return InetAddress;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/F/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */