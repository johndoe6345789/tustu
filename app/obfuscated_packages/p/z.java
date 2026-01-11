package p;

import G.T;
import bH.D;
import d.a;
import d.c;
import d.f;
import d.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import r.j;

public class z implements f, B {
  public static String a = ".action";
  
  ArrayList b = new ArrayList();
  
  List c = new ArrayList();
  
  boolean d = false;
  
  private static z e = null;
  
  public static z a() {
    if (e == null)
      e = new z(); 
    return e;
  }
  
  public ArrayList b() {
    if (this.b.isEmpty() || this.d != ((T.a().c() != null)))
      f(); 
    return this.b;
  }
  
  public m b(String paramString) {
    for (byte b = 0; b < b().size(); b++) {
      m m = this.b.get(b);
      if (m.a().equals(paramString))
        return m; 
    } 
    return null;
  }
  
  public boolean c(String paramString) {
    for (byte b = 0; b < b().size(); b++) {
      m m = this.b.get(b);
      if (m.a().equals(paramString)) {
        this.b.remove(b);
        d(paramString);
        e();
        return true;
      } 
    } 
    return false;
  }
  
  public void a(m paramm) {
    for (byte b = 0; b < b().size(); b++) {
      m m1 = this.b.get(b);
      if (m1.l().equals(paramm.l())) {
        this.b.set(b, paramm);
        if (!b(paramm)) {
          D.b("Failed to save updated UserAction: " + paramm.a());
        } else {
          paramm.n();
        } 
        return;
      } 
    } 
    this.b.add(paramm);
    paramm.n();
    if (!b(paramm))
      D.b("Failed to save new UserAction: " + paramm.a()); 
    e();
  }
  
  public void a(C paramC) {
    this.c.add(paramC);
  }
  
  private void e() {
    for (C c : this.c)
      c.a(); 
  }
  
  public void c() {}
  
  public void d() {}
  
  private void f() {
    this.b.clear();
    this.d = (T.a().c() != null);
    File file = j.B();
    File[] arrayOfFile = file.listFiles(new A(this));
    for (File file1 : arrayOfFile) {
      m m = a(file1);
      if (this.d || !m.g())
        this.b.add(m); 
    } 
    if (this.b.isEmpty()) {
      this.b.addAll(b.a());
      for (m m : this.b)
        b(m); 
    } 
    for (m m : this.b);
  }
  
  private m a(File paramFile) {
    Properties properties = new Properties();
    FileInputStream fileInputStream = null;
    try {
      fileInputStream = new FileInputStream(paramFile);
      properties.load(fileInputStream);
      m m = new m();
      m.c(properties);
      return m;
    } catch (IOException iOException) {
      D.a("Unable to load Action file: " + iOException.getLocalizedMessage());
      return null;
    } finally {
      try {
        fileInputStream.close();
      } catch (Exception exception) {}
    } 
  }
  
  private boolean d(String paramString) {
    File file1 = j.B();
    File file2 = new File(file1, paramString + a);
    return file2.delete();
  }
  
  public boolean b(m paramm) {
    File file1 = j.B();
    File file2 = new File(file1, paramm.a() + a);
    if (file2.exists() && !file2.delete()) {
      D.b("Failed to delete existing UserAction file: " + file2.getAbsolutePath());
      return false;
    } 
    file2 = new File(file1, paramm.a() + a);
    FileOutputStream fileOutputStream = null;
    try {
      fileOutputStream = new FileOutputStream(file2);
      Properties properties = paramm.m();
      properties.store(fileOutputStream, "Attributes for UserAction: " + paramm.a());
      return true;
    } catch (IOException iOException) {
      D.a("Failed to Save UserAction! Error: " + iOException.getLocalizedMessage() + "\nFile:\n" + file2.getAbsolutePath());
      return false;
    } finally {
      try {
        if (fileOutputStream != null)
          fileOutputStream.close(); 
      } catch (Exception exception) {}
    } 
  }
  
  public c a(String paramString) {
    return (c)b(paramString);
  }
  
  public Collection a(a parama) {
    if (parama == null)
      return (Collection)b().clone(); 
    ArrayList<c> arrayList = new ArrayList();
    for (c c : b()) {
      if (parama.a(c))
        arrayList.add(c); 
    } 
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */