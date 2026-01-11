package aP;

import G.T;
import G.l;
import W.B;
import W.C;
import bH.D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import r.a;
import r.j;
import s.g;

public class dg implements B {
  private static dg g = null;
  
  private static String h = a.b + ".pipe";
  
  private static String i = "restore.pipe";
  
  File a = new File(j.A(), h);
  
  File b = new File(j.A(), i);
  
  boolean c = false;
  
  static String d = "DIE";
  
  static String e = "OFFLINE";
  
  static String f = "ONLINE";
  
  public static dg a() {
    if (g == null)
      g = new dg(); 
    return g;
  }
  
  public boolean b() {
    return a(false);
  }
  
  public boolean a(boolean paramBoolean) {
    this.a = new File(j.A(), h);
    if (this.a.exists()) {
      this.a.delete();
      try {
        Thread.sleep(2000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      this.a = new File(j.A(), h);
      if (this.a.exists()) {
        if (!paramBoolean) {
          String str = g.b("There appears to already be another instance of " + a.b + " running.") + "\n" + g.b("Would you like to use the one that is already running?") + "\n\n";
          String[] arrayOfString = { g.b("Bring to foreground"), g.b("Start another") + " " + a.b };
          int i = JOptionPane.showOptionDialog(dd.a().c(), str, g.b("Already Running"), 0, 3, null, (Object[])arrayOfString, arrayOfString[1]);
          boolean bool = (i == 0) ? true : false;
          if (bool) {
            g();
            return false;
          } 
          return true;
        } 
        e();
      } 
    } 
    d();
    C.a().a(this.a, this);
    C.a().a(this.b, this);
    return true;
  }
  
  public void a(File paramFile) {
    if (this.c)
      if (paramFile.equals(this.a) && !paramFile.exists()) {
        d();
      } else if (paramFile.equals(this.a) && paramFile.exists() && paramFile.length() > 0L) {
        b(paramFile);
      } else if (paramFile.equals(this.b) && paramFile.exists()) {
        ((dl)dd.a().c()).p();
        paramFile.delete();
      }  
  }
  
  private void c() {
    this.a.delete();
  }
  
  private void d() {
    try {
      this.a.createNewFile();
      this.a.deleteOnExit();
      this.c = true;
    } catch (Exception exception) {
      D.c("Failed to create Pipe File, instance monitoring disabled.");
      this.c = false;
    } 
  }
  
  private boolean e() {
    File file = new File(j.A(), h);
    byte b1 = 2;
    byte b2 = 0;
    while (file.exists() && b1 > b2++) {
      file.delete();
      f();
      try {
        Thread.sleep(2000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      c();
      try {
        Thread.sleep(2000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      file = new File(j.A(), h);
    } 
    this.a.delete();
    return (b2 < b1);
  }
  
  private void f() {
    try {
      c();
      this.a.createNewFile();
      FileOutputStream fileOutputStream = new FileOutputStream(this.a);
      fileOutputStream.write(d.getBytes());
      fileOutputStream.close();
      this.a.deleteOnExit();
      this.c = true;
      D.c("Created Die file.");
    } catch (IOException iOException) {
      D.c("Failed to create Pipe File, instance monitoring disabled.");
      this.c = false;
      Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
  }
  
  private void g() {
    try {
      this.b.createNewFile();
    } catch (IOException iOException) {
      D.c("Failed to create restore File, Other instance will not be notified.");
      Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
  }
  
  private void b(File paramFile) {
    try {
      FileReader fileReader = new FileReader(paramFile);
      char[] arrayOfChar = new char[50];
      int i = fileReader.read(arrayOfChar);
      try {
        fileReader.close();
      } catch (IOException iOException) {}
      D.c("actOnFileContents: read=" + i);
      if (i > 0) {
        String str = (new String(arrayOfChar)).trim();
        D.c("fileContent: " + str);
        if (str.equals(d)) {
          try {
            D.c("Received message DIE, cutting my throat.");
            D.b();
            Thread.sleep(1000L);
          } catch (InterruptedException interruptedException) {
            Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
          } 
          paramFile.delete();
          Runtime.getRuntime().halt(0);
        } else if (str.equals(e)) {
          D.c("Received message GO_OFFLINE.");
          if (T.a().c() != null)
            T.a().c().C().c(); 
        } else if (str.equals(f)) {
          D.c("Received message GO_ONLINE.");
          if (T.a().c() != null)
            try {
              T.a().c().C().d();
            } catch (l l) {
              Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, (Throwable)l);
            }  
        } 
      } 
    } catch (FileNotFoundException fileNotFoundException) {
      Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, fileNotFoundException);
    } catch (IOException iOException) {
      Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */