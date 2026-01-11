package aE;

import java.io.File;

public class CloneableImpl implements Cloneable {
  private String a = "";
  
  private String b = "";
  
  private String c = "";
  
  private String[] d = null;
  
  private int e = -1;
  
  private boolean f = true;
  
  private String g = "";
  
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
    if (paramString.indexOf(File.separatorChar) != -1)
      paramString = paramString.substring(paramString.lastIndexOf(File.separatorChar) + 1); 
    this.c = paramString;
  }
  
  public String a(a parama) {
    return parama.t() + a.h + c();
  }
  
  public String[] d() {
    return this.d;
  }
  
  public void a(String[] paramArrayOfString) {
    this.d = paramArrayOfString;
  }
  
  public String toString() {
    return b() + " (" + a() + ")";
  }
  
  public int e() {
    return this.e;
  }
  
  public void a(int paramInt) {
    this.e = paramInt;
  }
  
  public boolean f() {
    return this.f;
  }
  
  public void a(boolean paramBoolean) {
    this.f = paramBoolean;
  }
  
  public d g() {
    return (d)super.clone();
  }
  
  public String h() {
    return this.g;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aE/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */