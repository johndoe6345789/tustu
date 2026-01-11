package ae;

import G.bT;
import W.z;
import ad.a;
import ad.b;
import bH.D;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class k {
  private final List b = new ArrayList();
  
  private final List c = new ArrayList();
  
  private File d = null;
  
  private File e = null;
  
  private File f = null;
  
  private File g = null;
  
  private HashMap h = new HashMap<>();
  
  List a = new ArrayList();
  
  private e i = new b();
  
  public boolean a() {
    return !this.c.isEmpty();
  }
  
  public boolean b() {
    return !this.b.isEmpty();
  }
  
  public void a(File paramFile) {
    this.b.add(paramFile);
  }
  
  public void b(File paramFile) {
    this.c.add(paramFile);
  }
  
  public List c() {
    return this.b;
  }
  
  public List d() {
    return this.c;
  }
  
  public a c(File paramFile) {
    a a = (a)this.h.get(paramFile);
    if (a == null) {
      b b = new b();
      a = b.a(paramFile);
      this.h.put(paramFile, a);
    } 
    return a;
  }
  
  public File e() {
    return this.d;
  }
  
  public void d(File paramFile) {
    this.d = paramFile;
  }
  
  public File f() {
    return this.e;
  }
  
  public void e(File paramFile) {
    this.e = paramFile;
  }
  
  public File g() {
    return this.g;
  }
  
  public void f(File paramFile) {
    this.g = paramFile;
  }
  
  public e h() {
    return this.i;
  }
  
  public File i() {
    return this.f;
  }
  
  public void g(File paramFile) {
    this.f = paramFile;
  }
  
  public File a(bT parambT) {
    List<File> list = c();
    if (!b())
      return null; 
    for (File file : list) {
      String str = z.a(file);
      if (str != null && str.equals(parambT.b()))
        return file; 
    } 
    D.b("Did not find an exact match for firmware signature: " + parambT.b() + "\nReturning:" + ((File)list.get(0)).getAbsolutePath());
    return list.get(0);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ae/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */