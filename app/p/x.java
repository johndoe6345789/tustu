package p;

import G.R;
import G.T;
import G.q;
import S.a;
import S.e;
import S.g;
import S.h;
import S.l;
import S.n;
import W.ap;
import W.ar;
import bH.D;
import bH.X;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.j;

public class x implements g, l {
  public static String a = ".trigger";
  
  ArrayList b = new ArrayList();
  
  List c = new ArrayList();
  
  boolean d = false;
  
  private static x e = null;
  
  public static x a() {
    if (e == null)
      e = new x(); 
    return e;
  }
  
  public ArrayList b() {
    if (this.b.isEmpty())
      d(); 
    return this.b;
  }
  
  public n a(String paramString) {
    for (byte b = 0; b < b().size(); b++) {
      n n = this.b.get(b);
      if (n.a() != null && n.a().equals(paramString))
        return n; 
    } 
    return null;
  }
  
  public boolean b(String paramString) {
    for (byte b = 0; b < b().size(); b++) {
      h h = this.b.get(b);
      if (h.a().equals(paramString)) {
        this.b.remove(b);
        c(paramString);
        return true;
      } 
    } 
    return false;
  }
  
  public void a(n paramn) {
    for (byte b = 0; b < b().size(); b++) {
      h h = this.b.get(b);
      if (h.a().equals(paramn.a())) {
        this.b.set(b, paramn);
        if (!b(paramn))
          D.b("Failed to save updated ExpressionEventTrigger: " + paramn.a()); 
        R r1 = T.a().c();
        boolean bool1 = h.c();
        e.a().a(r1.c(), paramn.a());
        if (bool1)
          try {
            e.a().a(r1.c(), (a)paramn);
          } catch (q q) {
            Logger.getLogger(x.class.getName()).log(Level.SEVERE, "", (Throwable)q);
          }  
        return;
      } 
    } 
    this.b.add(paramn);
    if (!b(paramn))
      D.b("Failed to save new ExpressionEventTrigger: " + paramn.a()); 
    R r = T.a().c();
    boolean bool = paramn.c();
    e.a().a(r.c(), paramn.a());
    if (bool)
      try {
        e.a().a(r.c(), (a)paramn);
      } catch (q q) {
        Logger.getLogger(x.class.getName()).log(Level.SEVERE, "", (Throwable)q);
      }  
  }
  
  private void d() {
    this.b.clear();
    boolean bool = (this.d != ((T.a().c() != null))) ? true : false;
    File file = j.B();
    File[] arrayOfFile = file.listFiles(new y(this));
    for (File file1 : arrayOfFile) {
      n n = a(file1);
      if (n != null && bool)
        this.b.add(n); 
    } 
    if (this.b.isEmpty())
      this.b.addAll(b.b()); 
    for (n n : this.b) {
      b(n);
      R r = T.a().c();
      if (r != null && n.c())
        try {
          e.a().a(r.c(), (a)n);
        } catch (q q) {
          D.a("Failed to start monitoring on Triggered Event: " + n.a() + ", err: " + q.getLocalizedMessage());
        }  
    } 
    this.d = (T.a().c() != null);
  }
  
  private n a(File paramFile) {
    Properties properties = new Properties();
    FileInputStream fileInputStream = null;
    try {
      fileInputStream = new FileInputStream(paramFile);
      properties.load(fileInputStream);
      n n = new n();
      ar ar = new ar(properties, "");
      n.a((ap)ar);
      String str = X.b(paramFile.getName(), a, "");
      n.g(str);
      n.h("");
      if (n.a() != null && !n.a().isEmpty())
        return n; 
      D.b("Invalid trigger in trigger file, ignoring:\n" + paramFile.getAbsolutePath());
      return null;
    } catch (IOException iOException) {
      D.a("Unable to load UserEventTrigger file: " + iOException.getLocalizedMessage());
      return null;
    } finally {
      try {
        fileInputStream.close();
      } catch (Exception exception) {}
    } 
  }
  
  private boolean c(String paramString) {
    File file1 = j.B();
    File file2 = new File(file1, paramString + a);
    return file2.delete();
  }
  
  public boolean b(n paramn) {
    Properties properties = new Properties();
    ar ar = new ar(properties, "");
    paramn.a((ap)ar);
    paramn.i("");
    File file1 = j.B();
    File file2 = new File(file1, paramn.a() + a);
    if (file2.exists() && !file2.delete()) {
      D.b("Failed to delete existing ExpressionEventTrigger file: " + file2.getAbsolutePath());
      return false;
    } 
    file2 = new File(file1, paramn.a() + a);
    FileOutputStream fileOutputStream = null;
    try {
      fileOutputStream = new FileOutputStream(file2);
      ap ap = paramn.h();
      if (!(ap instanceof ar)) {
        D.a("EventTrigger Persistor not instanceof PropertiesPersistor!!");
        return false;
      } 
      Properties properties1 = ((ar)ap).a();
      properties1.store(fileOutputStream, "Attributes for ExpressionEventTrigger: " + paramn.a());
      return true;
    } catch (IOException iOException) {
      D.a("Failed to Save ExpressionEventTrigger! Error: " + iOException.getLocalizedMessage() + "\nFile:\n" + file2.getAbsolutePath());
      return false;
    } finally {
      try {
        if (fileOutputStream != null)
          fileOutputStream.close(); 
      } catch (Exception exception) {}
    } 
  }
  
  public a a(String paramString1, String paramString2) {
    return (a)a(paramString2);
  }
  
  public List c() {
    ArrayList<String> arrayList = new ArrayList();
    ArrayList arrayList1 = b();
    for (n n : arrayList1)
      arrayList.add(n.a()); 
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */