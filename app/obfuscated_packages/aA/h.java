package aA;

import D.a;
import D.b;
import D.c;
import W.d;
import ay.i;
import bH.D;
import bH.n;
import java.io.File;
import java.io.IOException;
import java.util.zip.CRC32;

public class h extends b {
  g a;
  
  CRC32 b = new CRC32();
  
  private long d = 2592000000L;
  
  private static h e = null;
  
  private boolean f = true;
  
  i c;
  
  private boolean g = false;
  
  private h(g paramg) {
    this.a = paramg;
    this.c = new i();
    this.c.a(true);
    this.c.a(new i(this));
    if ((c()).length > 0)
      this.c.c(); 
  }
  
  public static void a(g paramg) {
    e = new h(paramg);
  }
  
  public static h a() {
    return e;
  }
  
  private boolean a(String paramString) {
    return (this.g || (paramString != null && paramString.compareTo("70-B3-D5-64-E0-00") >= 0 && paramString.compareTo("70-B3-D5-64-E3-FF") <= 0) || paramString.equals("22-33-44-55-66-77"));
  }
  
  public c b(String paramString1, String paramString2) {
    c c = new c();
    boolean bool = (n.b() || !this.f) ? true : false;
    if (bool)
      try {
        a a = a(paramString1, paramString2);
        if (a != null && a.k() != null && !a.k().isEmpty()) {
          a(a, a.k());
          D.d("Cached Device Activation: " + a.b());
        } 
        c.a(a);
      } catch (IOException iOException) {
        c.a(32768);
      } catch (f.h h1) {
        c.a(65536);
        return c;
      }  
    return c;
  }
  
  public c c(String paramString1, String paramString2) {
    c c = new c();
    a a = e(paramString1, paramString2);
    if (!a.c().equals("A") || Math.abs(System.currentTimeMillis() - a.j()) > this.d) {
      boolean bool = (n.b() || !this.f) ? true : false;
      if (bool)
        try {
          a = a(paramString1, paramString2);
          if (a != null && a.k() != null && !a.k().isEmpty()) {
            a(a, a.k());
            D.d("Cached Device Activation: " + a.b());
          } 
        } catch (IOException iOException) {
          c.a(32768);
        } catch (f.h h1) {
          c.a(65536);
          return c;
        }  
      if (a == null || !bool)
        try {
          a = h(paramString1, paramString2);
          c.a(a);
          c.a(32768);
          return c;
        } catch (IOException iOException) {
          D.d("No Pending Activation found for " + paramString2);
          a = new a();
          a.b(paramString2);
          a.a(paramString1);
          a.c("I");
          a.a(0);
        }  
    } else {
      k k = new k(this, paramString1, paramString2);
      k.start();
    } 
    c.a(a);
    return c;
  }
  
  public c d(String paramString1, String paramString2) {
    c c = new c();
    a a = e(paramString1, paramString2);
    if (!a.c().equals("A"))
      try {
        a = h(paramString1, paramString2);
        c.a(a);
        c.a(32768);
        return c;
      } catch (IOException iOException) {
        D.d("No Pending Activation found for " + paramString2);
        a = new a();
        a.b(paramString2);
        a.a(paramString1);
        a.c("I");
        a.a(0);
      }  
    c.a(a);
    return c;
  }
  
  private a e(String paramString1, String paramString2) {
    File file = f(paramString1, paramString2);
    a a = new a();
    if (paramString1.equals("BigStuff Gen4") && paramString2.equals("22-33-44-55-66-77")) {
      a.a(paramString1);
      a.b(paramString2);
      a.a(0);
      a.d("bigstuff3@comcast.net");
      a.e("Demo BigStuff3");
      a.f("Gen 4 Project");
      a.g("248 249 8040");
      a.c("A");
      a.a(System.currentTimeMillis());
    } else if (file.exists()) {
      try {
        byte[] arrayOfByte = d.a(file);
        String str = new String(arrayOfByte);
        a.h(str);
        a.a(file.lastModified());
        return a;
      } catch (Exception exception) {
        D.d("Unable to read activation file: " + file.getAbsolutePath());
        file.delete();
      } 
    } 
    a.b(paramString2);
    a.a(paramString1);
    return a;
  }
  
  public c a(a parama) {
    c c;
    if (n.b() || !this.f || !a(parama.b())) {
      D.d("Activating on Internet: Connected to internet=" + n.b() + ", Serial:" + parama.b() + " isKnown: " + a(parama.b()));
      c = super.a(parama);
      if (c != null && c.b() != null && c.b().c().equals("A"))
        a(c.b(), c.b().k()); 
    } else {
      parama.a(32768);
      parama.c("A");
      b(parama);
      c = new c();
      c.a(parama);
      c.a(0);
    } 
    return c;
  }
  
  private File f(String paramString1, String paramString2) {
    String str = paramString1 + "_" + paramString2;
    this.b.reset();
    this.b.update(str.getBytes());
    int j = (int)this.b.getValue();
    return new File(this.a.a(), Integer.toHexString(j).toUpperCase());
  }
  
  private File g(String paramString1, String paramString2) {
    String str = paramString1 + "_" + paramString2;
    this.b.reset();
    this.b.update(str.getBytes());
    int j = (int)this.b.getValue();
    return new File(this.a.a(), Integer.toHexString(j).toUpperCase() + ".pend");
  }
  
  public void b() {
    if (n.a())
      for (File file : c()) {
        a a = new a();
        try {
          byte[] arrayOfByte = d.a(file);
          a.a(arrayOfByte);
          a.c("I");
          a(a);
          file.delete();
        } catch (IOException iOException) {
          D.d("Invalid pending file. deletivng... " + iOException.getLocalizedMessage());
        } catch (f.h h1) {
          D.d("Invalid pending file. deletivng... " + h1.getLocalizedMessage());
        } 
      }  
  }
  
  private File[] c() {
    j j = new j(this);
    return this.a.a().listFiles(j);
  }
  
  private a h(String paramString1, String paramString2) {
    File file = g(paramString1, paramString2);
    if (file.exists())
      return a(file); 
    throw new IOException("File not found");
  }
  
  private a a(File paramFile) {
    byte[] arrayOfByte = d.a(paramFile);
    a a = new a();
    try {
      a.a(arrayOfByte);
    } catch (f.h h1) {
      D.c("Invalid pending Activation, deleting file. " + h1.getLocalizedMessage());
      paramFile.delete();
      return a;
    } 
    return a;
  }
  
  private void b(a parama) {
    File file = g(parama.a(), parama.b());
    try {
      file.delete();
      byte[] arrayOfByte = parama.h();
      d.a(file, arrayOfByte);
      this.c.c();
    } catch (IOException iOException) {
      D.c("Error 5321987 " + iOException.getMessage());
    } 
  }
  
  private void a(a parama, String paramString) {
    if (parama.b() != null && !parama.b().isEmpty()) {
      File file = f(parama.a(), parama.b());
      if (file.exists())
        file.delete(); 
      try {
        d.a(file, paramString.getBytes());
      } catch (IOException iOException) {
        D.c("Error 4321987 " + iOException.getMessage());
      } 
    } 
  }
  
  public void a(boolean paramBoolean) {
    this.g = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aA/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */