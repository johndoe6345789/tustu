package com.efiAnalytics.tunerStudio.search;

import B.i;
import D.a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public class f {
  private long a = 0L;
  
  private i b = null;
  
  private a c = new a();
  
  private k d = null;
  
  public String toString() {
    Field[] arrayOfField = getClass().getDeclaredFields();
    AccessibleObject.setAccessible((AccessibleObject[])arrayOfField, true);
    null = getClass().getName();
    for (byte b = 0; b < arrayOfField.length; b++) {
      Field field = arrayOfField[b];
      try {
        null = null + "\n\t" + field.getName() + "=" + field.get(this) + ", ";
      } catch (Exception exception) {}
    } 
    return null + "\n";
  }
  
  public void a(String paramString) {
    this.c.b(paramString);
    this.b.d(paramString);
  }
  
  public String a() {
    return this.b.e();
  }
  
  public String b() {
    return this.b.i();
  }
  
  public String c() {
    return this.c.c();
  }
  
  public String d() {
    return (f() != null) ? f().b() : null;
  }
  
  public long e() {
    return this.a;
  }
  
  public void a(long paramLong) {
    this.a = paramLong;
  }
  
  public i f() {
    return this.b;
  }
  
  public void a(i parami) {
    this.b = parami;
    this.c.a(parami.i());
    this.c.b(parami.e());
  }
  
  public a g() {
    return this.c;
  }
  
  public void a(a parama) {
    if (parama != null)
      this.c = parama; 
  }
  
  public k h() {
    return this.d;
  }
  
  public void a(k paramk) {
    this.d = paramk;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */