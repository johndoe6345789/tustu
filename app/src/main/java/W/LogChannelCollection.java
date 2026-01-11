package W;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class LogChannelCollection extends ArrayList {
  private HashMap c = new HashMap<>();
  
  private HashMap d = new HashMap<>();
  
  private HashMap e = new HashMap<>();
  
  private HashMap f = new HashMap<>();
  
  private HashMap g = new HashMap<>();
  
  private String h = "\t";
  
  String a = "";
  
  String b = "";
  
  private boolean i = false;
  
  private boolean j = false;
  
  private File k = null;
  
  public void a(j paramj) {
    if (!paramj.a().isEmpty()) {
      add((E)paramj);
      this.f.put(paramj.a(), paramj);
    } 
  }
  
  public j a(String paramString) {
    return (j)this.f.get(paramString);
  }
  
  public j a(int paramInt) {
    j j = super.remove(paramInt);
    this.f.remove(j.a());
    return j;
  }
  
  public boolean b(j paramj) {
    this.f.remove(paramj.a());
    return remove(paramj);
  }
  
  public j b(String paramString) {
    j j = (j)this.f.get(paramString);
    if (j == null)
      for (String str : this.f.keySet()) {
        if (str.equalsIgnoreCase(paramString))
          return (j)this.f.get(str); 
      }  
    return j;
  }
  
  public void a(int paramInt, String paramString) {
    a().put(Integer.valueOf(paramInt), paramString);
  }
  
  public String b(int paramInt) {
    return (String)a().get(Integer.valueOf(paramInt));
  }
  
  public HashMap a() {
    return this.c;
  }
  
  public void a(HashMap paramHashMap) {
    this.c = paramHashMap;
  }
  
  public void b(int paramInt, String paramString) {
    b().put(Integer.valueOf(paramInt), paramString);
  }
  
  public String c(int paramInt) {
    return (String)b().get(Integer.valueOf(paramInt));
  }
  
  public HashMap b() {
    return this.e;
  }
  
  public void b(HashMap paramHashMap) {
    this.e = paramHashMap;
  }
  
  public void c(int paramInt, String paramString) {
    this.d.put(Integer.valueOf(paramInt), paramString);
  }
  
  public String d(int paramInt) {
    return (String)c().get(Integer.valueOf(paramInt));
  }
  
  public HashMap c() {
    return this.d;
  }
  
  public int d() {
    if (size() == 0)
      return 0; 
    j j = (j)get(0);
    return j.v();
  }
  
  public boolean e() {
    for (j j : this) {
      if (j.n() != null && j.n().length() > 0)
        return true; 
    } 
    return false;
  }
  
  public void c(String paramString) {
    this.a = paramString;
  }
  
  public String f() {
    return this.a;
  }
  
  public String g() {
    return (this.b == null || this.b.isEmpty()) ? f() : this.b;
  }
  
  public void d(String paramString) {
    this.b = paramString;
  }
  
  public Iterator iterator() {
    return listIterator();
  }
  
  public void a(int paramInt1, int paramInt2) {
    for (j j : this)
      j.e(paramInt1, paramInt2); 
    a(true);
  }
  
  public void a(boolean paramBoolean) {
    this.i = paramBoolean;
  }
  
  public boolean e(String paramString) {
    for (j j : this) {
      if (j.a().equals(paramString))
        return b(j); 
    } 
    return false;
  }
  
  public void a(String paramString1, String paramString2) {
    this.g.put(paramString1, paramString2);
  }
  
  public String f(String paramString) {
    return (String)this.g.get(paramString);
  }
  
  public boolean h() {
    return !this.g.isEmpty();
  }
  
  public Collection i() {
    return this.g.keySet();
  }
  
  public boolean j() {
    return (this.a != null && !this.a.isEmpty());
  }
  
  public File k() {
    return this.k;
  }
  
  public void a(File paramFile) {
    this.k = paramFile;
  }
  
  public void c(HashMap paramHashMap) {
    this.g = paramHashMap;
  }
  
  public void clear() {
    this.c.clear();
    this.d.clear();
    this.e.clear();
    this.f.clear();
    this.g.clear();
    super.clear();
  }
  
  public String l() {
    return this.h;
  }
  
  public void g(String paramString) {
    this.h = paramString;
  }
  
  public boolean m() {
    return this.j;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */