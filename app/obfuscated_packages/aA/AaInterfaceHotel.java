package aA;

import D.a;
import D.DInterfaceBravo;
import D.DInterfaceCharlie;
import W.d;
import ay.AyComponentIndia;
import bH.D;
import bH.n;
import java.io.File;
import java.io.IOException;
import java.util.zip.CRC32;

public class AaInterfaceHotel extends DInterfaceBravo {
  g a;
  
  CRC32 DInterfaceBravo = new CRC32();
  
  private long d = 2592000000L;
  
  private static h e = null;
  
  private boolean f = true;
  
  AyComponentIndia DInterfaceCharlie;
  
  private boolean g = false;
  
  private AaInterfaceHotel(g paramg) {
    this.a = paramg;
    this.DInterfaceCharlie = new AyComponentIndia();
    this.DInterfaceCharlie.a(true);
    this.DInterfaceCharlie.a(new AyComponentIndia(this));
    if ((DInterfaceCharlie()).length > 0)
      this.DInterfaceCharlie.DInterfaceCharlie(); 
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
  
  public DInterfaceCharlie DInterfaceBravo(String paramString1, String paramString2) {
    DInterfaceCharlie DInterfaceCharlie = new DInterfaceCharlie();
    boolean bool = (n.DInterfaceBravo() || !this.f) ? true : false;
    if (bool)
      try {
        a a = a(paramString1, paramString2);
        if (a != null && a.k() != null && !a.k().isEmpty()) {
          a(a, a.k());
          D.d("Cached Device Activation: " + a.DInterfaceBravo());
        } 
        DInterfaceCharlie.a(a);
      } catch (IOException iOException) {
        DInterfaceCharlie.a(32768);
      } catch (f.h h1) {
        DInterfaceCharlie.a(65536);
        return DInterfaceCharlie;
      }  
    return DInterfaceCharlie;
  }
  
  public DInterfaceCharlie DInterfaceCharlie(String paramString1, String paramString2) {
    DInterfaceCharlie DInterfaceCharlie = new DInterfaceCharlie();
    a a = e(paramString1, paramString2);
    if (!a.DInterfaceCharlie().equals("A") || Math.abs(System.currentTimeMillis() - a.j()) > this.d) {
      boolean bool = (n.DInterfaceBravo() || !this.f) ? true : false;
      if (bool)
        try {
          a = a(paramString1, paramString2);
          if (a != null && a.k() != null && !a.k().isEmpty()) {
            a(a, a.k());
            D.d("Cached Device Activation: " + a.DInterfaceBravo());
          } 
        } catch (IOException iOException) {
          DInterfaceCharlie.a(32768);
        } catch (f.h h1) {
          DInterfaceCharlie.a(65536);
          return DInterfaceCharlie;
        }  
      if (a == null || !bool)
        try {
          a = h(paramString1, paramString2);
          DInterfaceCharlie.a(a);
          DInterfaceCharlie.a(32768);
          return DInterfaceCharlie;
        } catch (IOException iOException) {
          D.d("No Pending Activation found for " + paramString2);
          a = new a();
          a.DInterfaceBravo(paramString2);
          a.a(paramString1);
          a.DInterfaceCharlie("I");
          a.a(0);
        }  
    } else {
      k k = new k(this, paramString1, paramString2);
      k.start();
    } 
    DInterfaceCharlie.a(a);
    return DInterfaceCharlie;
  }
  
  public DInterfaceCharlie d(String paramString1, String paramString2) {
    DInterfaceCharlie DInterfaceCharlie = new DInterfaceCharlie();
    a a = e(paramString1, paramString2);
    if (!a.DInterfaceCharlie().equals("A"))
      try {
        a = h(paramString1, paramString2);
        DInterfaceCharlie.a(a);
        DInterfaceCharlie.a(32768);
        return DInterfaceCharlie;
      } catch (IOException iOException) {
        D.d("No Pending Activation found for " + paramString2);
        a = new a();
        a.DInterfaceBravo(paramString2);
        a.a(paramString1);
        a.DInterfaceCharlie("I");
        a.a(0);
      }  
    DInterfaceCharlie.a(a);
    return DInterfaceCharlie;
  }
  
  private a e(String paramString1, String paramString2) {
    File file = f(paramString1, paramString2);
    a a = new a();
    if (paramString1.equals("BigStuff Gen4") && paramString2.equals("22-33-44-55-66-77")) {
      a.a(paramString1);
      a.DInterfaceBravo(paramString2);
      a.a(0);
      a.d("bigstuff3@comcast.net");
      a.e("Demo BigStuff3");
      a.f("Gen 4 Project");
      a.g("248 249 8040");
      a.DInterfaceCharlie("A");
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
    a.DInterfaceBravo(paramString2);
    a.a(paramString1);
    return a;
  }
  
  public DInterfaceCharlie a(a parama) {
    DInterfaceCharlie DInterfaceCharlie;
    if (n.DInterfaceBravo() || !this.f || !a(parama.DInterfaceBravo())) {
      D.d("Activating on Internet: Connected to internet=" + n.DInterfaceBravo() + ", Serial:" + parama.DInterfaceBravo() + " isKnown: " + a(parama.DInterfaceBravo()));
      DInterfaceCharlie = super.a(parama);
      if (DInterfaceCharlie != null && DInterfaceCharlie.DInterfaceBravo() != null && DInterfaceCharlie.DInterfaceBravo().DInterfaceCharlie().equals("A"))
        a(DInterfaceCharlie.DInterfaceBravo(), DInterfaceCharlie.DInterfaceBravo().k()); 
    } else {
      parama.a(32768);
      parama.DInterfaceCharlie("A");
      DInterfaceBravo(parama);
      DInterfaceCharlie = new DInterfaceCharlie();
      DInterfaceCharlie.a(parama);
      DInterfaceCharlie.a(0);
    } 
    return DInterfaceCharlie;
  }
  
  private File f(String paramString1, String paramString2) {
    String str = paramString1 + "_" + paramString2;
    this.DInterfaceBravo.reset();
    this.DInterfaceBravo.update(str.getBytes());
    int j = (int)this.DInterfaceBravo.getValue();
    return new File(this.a.a(), Integer.toHexString(j).toUpperCase());
  }
  
  private File g(String paramString1, String paramString2) {
    String str = paramString1 + "_" + paramString2;
    this.DInterfaceBravo.reset();
    this.DInterfaceBravo.update(str.getBytes());
    int j = (int)this.DInterfaceBravo.getValue();
    return new File(this.a.a(), Integer.toHexString(j).toUpperCase() + ".pend");
  }
  
  public void DInterfaceBravo() {
    if (n.a())
      for (File file : DInterfaceCharlie()) {
        a a = new a();
        try {
          byte[] arrayOfByte = d.a(file);
          a.a(arrayOfByte);
          a.DInterfaceCharlie("I");
          a(a);
          file.delete();
        } catch (IOException iOException) {
          D.d("Invalid pending file. deletivng... " + iOException.getLocalizedMessage());
        } catch (f.h h1) {
          D.d("Invalid pending file. deletivng... " + h1.getLocalizedMessage());
        } 
      }  
  }
  
  private File[] DInterfaceCharlie() {
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
      D.DInterfaceCharlie("Invalid pending Activation, deleting file. " + h1.getLocalizedMessage());
      paramFile.delete();
      return a;
    } 
    return a;
  }
  
  private void DInterfaceBravo(a parama) {
    File file = g(parama.a(), parama.DInterfaceBravo());
    try {
      file.delete();
      byte[] arrayOfByte = parama.h();
      d.a(file, arrayOfByte);
      this.DInterfaceCharlie.DInterfaceCharlie();
    } catch (IOException iOException) {
      D.DInterfaceCharlie("Error 5321987 " + iOException.getMessage());
    } 
  }
  
  private void a(a parama, String paramString) {
    if (parama.DInterfaceBravo() != null && !parama.DInterfaceBravo().isEmpty()) {
      File file = f(parama.a(), parama.DInterfaceBravo());
      if (file.exists())
        file.delete(); 
      try {
        d.a(file, paramString.getBytes());
      } catch (IOException iOException) {
        D.DInterfaceCharlie("Error 4321987 " + iOException.getMessage());
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