package G;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class GComponentBj extends bv implements Serializable {
  private String a = null;
  
  private String f = null;
  
  private String g = null;
  
  private String[] h = null;
  
  private k i = null;
  
  private ArrayList j = new ArrayList();
  
  private boolean k = false;
  
  public String a() {
    return this.a;
  }
  
  public void a(String paramString) {
    this.a = paramString;
  }
  
  public String b() {
    return this.f;
  }
  
  public void a(String[] paramArrayOfString) {
    this.h = paramArrayOfString;
  }
  
  public void b(String paramString) {
    this.f = paramString;
  }
  
  public String c() {
    return this.g;
  }
  
  public void c(String paramString) {
    this.g = paramString;
  }
  
  public String[] d() {
    return this.h;
  }
  
  public k f() {
    return this.i;
  }
  
  public void a(k paramk) {
    this.i = paramk;
  }
  
  public void a(bV parambV) {
    this.j.add(parambV);
  }
  
  public Iterator g() {
    return this.j.iterator();
  }
  
  public boolean h() {
    return this.k;
  }
  
  public void a(boolean paramBoolean) {
    this.k = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */