package S;

import G.R;
import G.T;
import G.GInterfaceAi;
import G.i;
import ax.ExceptionInAxPackage;
import bH.D;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class Timer implements a {
  private String c = "";
  
  private String d = "";
  
  private String e = "";
  
  private int f = -1;
  
  boolean a = false;
  
  List b = new ArrayList();
  
  private boolean g = false;
  
  private static Timer h = null;
  
  private final List i = new ArrayList();
  
  public void a(d paramd) {
    this.b.add(paramd);
  }
  
  public void c(String paramString) {
    i.b(this.c, paramString, this.d);
    if (!f())
      i.b(this.c, paramString, this.e); 
    h();
  }
  
  public void d(String paramString) {
    i.a(this.c, paramString, this.d);
    i.a(this.c, paramString, this.e);
  }
  
  private void h() {
    this.i.clear();
  }
  
  public String d() {
    return this.d;
  }
  
  public void e(String paramString) {
    this.d = paramString;
    h();
  }
  
  public String e() {
    return this.e;
  }
  
  public void f(String paramString) {
    this.e = paramString;
    h();
  }
  
  public boolean f() {
    return (this.f >= 0);
  }
  
  public boolean b() {
    return this.g;
  }
  
  public void b(boolean paramBoolean) {
    try {
      if (paramBoolean) {
        i();
        D.c("EventTrigger " + a() + " Triggered. expression: " + d());
        if (f())
          if (this.f > 0) {
            k().schedule(new i(this), this.f);
          } else {
            k().schedule(new i(this), 10L);
          }  
      } else {
        if (f()) {
          D.c("EventTrigger " + a() + " Reset after resetDelay (ms): " + g());
        } else {
          D.c("EventTrigger " + a() + " Reset. expression: " + e());
        } 
        j();
      } 
      this.g = paramBoolean;
    } catch (Exception exception) {
      D.a("FAILED to notify and set triggers");
      exception.printStackTrace();
    } 
  }
  
  private void i() {
    for (d d : this.b)
      d.a(); 
  }
  
  private void j() {
    for (d d : this.b)
      d.b(); 
  }
  
  public String a() {
    return this.c;
  }
  
  public void g(String paramString) {
    this.c = paramString;
  }
  
  private static Timer k() {
    if (h == null)
      h = new Timer(); 
    return h;
  }
  
  public boolean a(String paramString, byte[] paramArrayOfbyte) {
    R r = T.a().c(paramString);
    if (c() && d() != null && !d().equals("") && !this.i.contains(paramString)) {
      double d;
      try {
        d = i.a(d(), (GInterfaceAi)r, paramArrayOfbyte);
      } catch (Exception exception) {
        D.b(exception.getLocalizedMessage() + ". Trigger Condition not valid for currently loaded config: " + d());
        d = 0.0D;
        this.i.add(paramString);
      } 
      if (d != 0.0D) {
        b(true);
        D.c(this.c + ": Trigger Expression: " + d() + " = " + d);
      } 
    } 
    return this.g;
  }
  
  public boolean a(String paramString) {
    if (c() && d() != null && !d().equals("") && !this.i.contains(paramString)) {
      double d;
      R r = T.a().c(paramString);
      try {
        d = i.a(d(), (GInterfaceAi)r);
      } catch (ExceptionInAxPackage u) {
        D.b(u.getLocalizedMessage() + ": Bad Trigger Condition: " + e());
        this.i.add(paramString);
        d = 0.0D;
      } 
      if (d != 0.0D) {
        b(true);
        D.c(this.c + ": Trigger Expression: " + d() + " = " + d);
      } 
    } 
    return this.g;
  }
  
  public boolean b(String paramString, byte[] paramArrayOfbyte) {
    R r = T.a().c(paramString);
    if (c() && e() != null && !f() && !e().equals("")) {
      boolean bool;
      try {
        bool = (i.a(e(), (GInterfaceAi)r, paramArrayOfbyte) != 0.0D && i.a(d(), (GInterfaceAi)r, paramArrayOfbyte) == 0.0D) ? true : false;
      } catch (ExceptionInAxPackage u) {
        D.b(u.getLocalizedMessage() + ". Trigger Reset Condition not valid for current config: " + e());
        this.i.add(paramString);
        bool = false;
        return false;
      } 
      if (bool) {
        D.c("Reset Ex: " + e() + " = " + bool);
        b(false);
      } 
    } 
    return this.g;
  }
  
  public boolean b(String paramString) {
    R r = T.a().c(paramString);
    if (c() && e() != null && !f() && !e().equals("") && !this.i.contains(paramString)) {
      boolean bool;
      try {
        bool = (i.a(e(), (GInterfaceAi)r) != 0.0D && i.a(d(), (GInterfaceAi)r) == 0.0D) ? true : false;
      } catch (ExceptionInAxPackage u) {
        D.b(u.getLocalizedMessage() + ": Bad Trigger Reset Condition: " + e());
        bool = false;
      } 
      if (bool) {
        D.c("Reset Ex: " + e() + " = " + bool);
        b(false);
      } 
    } 
    return this.g;
  }
  
  public boolean c() {
    return this.a;
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      D.d("Setting Active: " + a() + ", expression: " + d());
    } else {
      D.d("Setting Inactive: " + a() + ", expression: " + d());
    } 
    this.a = paramBoolean;
  }
  
  public int g() {
    return this.f;
  }
  
  public void a(int paramInt) {
    this.f = paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/S/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */